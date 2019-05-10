package org.apache.http.client.utils;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EntityUtils;

public class URLEncodedUtils
{
  public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
  private static final String NAME_VALUE_SEPARATOR = "=";
  private static final BitSet PATHSAFE;
  private static final BitSet PUNCT;
  private static final char[] QP_SEPS;
  private static final char QP_SEP_A = '&';
  private static final String QP_SEP_PATTERN;
  private static final char QP_SEP_S = ';';
  private static final int RADIX = 16;
  private static final BitSet RESERVED;
  private static final BitSet UNRESERVED;
  private static final BitSet URIC;
  private static final BitSet URLENCODER;
  private static final BitSet USERINFO;
  
  static
  {
    int i = 44;
    int j = 43;
    int k = 38;
    int m = 36;
    int n = 256;
    Object localObject1 = new char[2];
    Object tmp24_22 = localObject1;
    tmp24_22[0] = 38;
    tmp24_22[1] = 59;
    QP_SEPS = (char[])localObject1;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("[");
    Object localObject2 = new java/lang/String;
    char[] arrayOfChar = QP_SEPS;
    ((String)localObject2).<init>(arrayOfChar);
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = "]";
    QP_SEP_PATTERN = (String)localObject2;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(n);
    UNRESERVED = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(n);
    PUNCT = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(n);
    USERINFO = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(n);
    PATHSAFE = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(n);
    URIC = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(n);
    RESERVED = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(n);
    URLENCODER = (BitSet)localObject1;
    int i1 = 97;
    int i2;
    for (;;)
    {
      i2 = 122;
      if (i1 > i2) {
        break;
      }
      localObject2 = UNRESERVED;
      ((BitSet)localObject2).set(i1);
      i1 += 1;
    }
    i1 = 65;
    for (;;)
    {
      i2 = 90;
      if (i1 > i2) {
        break;
      }
      localObject2 = UNRESERVED;
      ((BitSet)localObject2).set(i1);
      i1 += 1;
    }
    i1 = 48;
    for (;;)
    {
      i2 = 57;
      if (i1 > i2) {
        break;
      }
      localObject2 = UNRESERVED;
      ((BitSet)localObject2).set(i1);
      i1 += 1;
    }
    UNRESERVED.set(95);
    UNRESERVED.set(45);
    UNRESERVED.set(46);
    UNRESERVED.set(42);
    localObject1 = URLENCODER;
    localObject2 = UNRESERVED;
    ((BitSet)localObject1).or((BitSet)localObject2);
    UNRESERVED.set(33);
    UNRESERVED.set(126);
    UNRESERVED.set(39);
    UNRESERVED.set(40);
    UNRESERVED.set(41);
    PUNCT.set(i);
    PUNCT.set(59);
    PUNCT.set(58);
    PUNCT.set(m);
    PUNCT.set(k);
    PUNCT.set(j);
    PUNCT.set(61);
    localObject1 = USERINFO;
    localObject2 = UNRESERVED;
    ((BitSet)localObject1).or((BitSet)localObject2);
    localObject1 = USERINFO;
    localObject2 = PUNCT;
    ((BitSet)localObject1).or((BitSet)localObject2);
    localObject1 = PATHSAFE;
    localObject2 = UNRESERVED;
    ((BitSet)localObject1).or((BitSet)localObject2);
    PATHSAFE.set(47);
    PATHSAFE.set(59);
    PATHSAFE.set(58);
    PATHSAFE.set(64);
    PATHSAFE.set(k);
    PATHSAFE.set(61);
    PATHSAFE.set(j);
    PATHSAFE.set(m);
    PATHSAFE.set(i);
    RESERVED.set(59);
    RESERVED.set(47);
    RESERVED.set(63);
    RESERVED.set(58);
    RESERVED.set(64);
    RESERVED.set(k);
    RESERVED.set(61);
    RESERVED.set(j);
    RESERVED.set(m);
    RESERVED.set(i);
    RESERVED.set(91);
    RESERVED.set(93);
    localObject1 = URIC;
    localObject2 = RESERVED;
    ((BitSet)localObject1).or((BitSet)localObject2);
    localObject1 = URIC;
    localObject2 = UNRESERVED;
    ((BitSet)localObject1).or((BitSet)localObject2);
  }
  
  private static String decodeFormFields(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      localObject = null;
      return (String)localObject;
    }
    if (paramString2 != null) {}
    for (Object localObject = Charset.forName(paramString2);; localObject = Consts.UTF_8)
    {
      boolean bool = true;
      localObject = urlDecode(paramString1, (Charset)localObject, bool);
      break;
    }
  }
  
  private static String decodeFormFields(String paramString, Charset paramCharset)
  {
    boolean bool;
    String str;
    if (paramString == null)
    {
      bool = false;
      str = null;
      return str;
    }
    if (paramCharset != null) {}
    for (;;)
    {
      bool = true;
      str = urlDecode(paramString, paramCharset, bool);
      break;
      paramCharset = Consts.UTF_8;
    }
  }
  
  static String encPath(String paramString, Charset paramCharset)
  {
    BitSet localBitSet = PATHSAFE;
    return urlEncode(paramString, paramCharset, localBitSet, false);
  }
  
  static String encUric(String paramString, Charset paramCharset)
  {
    BitSet localBitSet = URIC;
    return urlEncode(paramString, paramCharset, localBitSet, false);
  }
  
  static String encUserInfo(String paramString, Charset paramCharset)
  {
    BitSet localBitSet = USERINFO;
    return urlEncode(paramString, paramCharset, localBitSet, false);
  }
  
  private static String encodeFormFields(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      localObject = null;
      return (String)localObject;
    }
    if (paramString2 != null) {}
    for (Object localObject = Charset.forName(paramString2);; localObject = Consts.UTF_8)
    {
      BitSet localBitSet = URLENCODER;
      boolean bool = true;
      localObject = urlEncode(paramString1, (Charset)localObject, localBitSet, bool);
      break;
    }
  }
  
  private static String encodeFormFields(String paramString, Charset paramCharset)
  {
    Object localObject;
    if (paramString == null)
    {
      localObject = null;
      return (String)localObject;
    }
    if (paramCharset != null) {}
    for (;;)
    {
      localObject = URLENCODER;
      boolean bool = true;
      localObject = urlEncode(paramString, paramCharset, (BitSet)localObject, bool);
      break;
      paramCharset = Consts.UTF_8;
    }
  }
  
  public static String format(Iterable paramIterable, char paramChar, Charset paramCharset)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (NameValuePair)localIterator.next();
      String str = encodeFormFields(((NameValuePair)localObject).getName(), paramCharset);
      localObject = encodeFormFields(((NameValuePair)localObject).getValue(), paramCharset);
      int i = localStringBuilder.length();
      if (i > 0) {
        localStringBuilder.append(paramChar);
      }
      localStringBuilder.append(str);
      if (localObject != null)
      {
        str = "=";
        localStringBuilder.append(str);
        localStringBuilder.append((String)localObject);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String format(Iterable paramIterable, Charset paramCharset)
  {
    return format(paramIterable, '&', paramCharset);
  }
  
  public static String format(List paramList, char paramChar, String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (NameValuePair)localIterator.next();
      String str = encodeFormFields(((NameValuePair)localObject).getName(), paramString);
      localObject = encodeFormFields(((NameValuePair)localObject).getValue(), paramString);
      int i = localStringBuilder.length();
      if (i > 0) {
        localStringBuilder.append(paramChar);
      }
      localStringBuilder.append(str);
      if (localObject != null)
      {
        str = "=";
        localStringBuilder.append(str);
        localStringBuilder.append((String)localObject);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String format(List paramList, String paramString)
  {
    return format(paramList, '&', paramString);
  }
  
  public static boolean isEncoded(HttpEntity paramHttpEntity)
  {
    boolean bool = false;
    String str = null;
    Object localObject = paramHttpEntity.getContentType();
    if (localObject != null)
    {
      localObject = ((Header)localObject).getElements();
      int i = localObject.length;
      if (i > 0)
      {
        str = localObject[0].getName();
        localObject = "application/x-www-form-urlencoded";
        bool = str.equalsIgnoreCase((String)localObject);
      }
    }
    return bool;
  }
  
  public static List parse(String paramString, Charset paramCharset)
  {
    char[] arrayOfChar = QP_SEPS;
    return parse(paramString, paramCharset, arrayOfChar);
  }
  
  public static List parse(String paramString, Charset paramCharset, char... paramVarArgs)
  {
    if (paramString == null)
    {
      localObject1 = Collections.emptyList();
      return (List)localObject1;
    }
    BasicHeaderValueParser localBasicHeaderValueParser = BasicHeaderValueParser.INSTANCE;
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    i = 0;
    int j = localCharArrayBuffer.length();
    localParserCursor.<init>(0, j);
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    for (;;)
    {
      boolean bool = localParserCursor.atEnd();
      if (bool) {
        break;
      }
      Object localObject2 = localBasicHeaderValueParser.parseNameValuePair(localCharArrayBuffer, localParserCursor, paramVarArgs);
      Object localObject3 = ((NameValuePair)localObject2).getName();
      int k = ((String)localObject3).length();
      if (k > 0)
      {
        localObject3 = new org/apache/http/message/BasicNameValuePair;
        String str = decodeFormFields(((NameValuePair)localObject2).getName(), paramCharset);
        localObject2 = decodeFormFields(((NameValuePair)localObject2).getValue(), paramCharset);
        ((BasicNameValuePair)localObject3).<init>(str, (String)localObject2);
        ((List)localObject1).add(localObject3);
      }
    }
  }
  
  public static List parse(URI paramURI, String paramString)
  {
    String str = paramURI.getRawQuery();
    Object localObject;
    if (str != null)
    {
      int i = str.length();
      if (i > 0)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        Scanner localScanner = new java/util/Scanner;
        localScanner.<init>(str);
        str = QP_SEP_PATTERN;
        parse((List)localObject, localScanner, str, paramString);
      }
    }
    for (;;)
    {
      return (List)localObject;
      localObject = Collections.emptyList();
    }
  }
  
  public static List parse(HttpEntity paramHttpEntity)
  {
    Object localObject1 = ContentType.get(paramHttpEntity);
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject2 = ((ContentType)localObject1).getMimeType();
      localObject3 = "application/x-www-form-urlencoded";
      boolean bool = ((String)localObject2).equalsIgnoreCase((String)localObject3);
      if (bool)
      {
        localObject2 = Consts.ASCII;
        localObject2 = EntityUtils.toString(paramHttpEntity, (Charset)localObject2);
        if (localObject2 != null)
        {
          int i = ((String)localObject2).length();
          if (i > 0)
          {
            localObject1 = ((ContentType)localObject1).getCharset();
            if (localObject1 == null) {
              localObject1 = HTTP.DEF_CONTENT_CHARSET;
            }
            localObject3 = QP_SEPS;
          }
        }
      }
    }
    for (localObject1 = parse((String)localObject2, (Charset)localObject1, (char[])localObject3);; localObject1 = Collections.emptyList()) {
      return (List)localObject1;
    }
  }
  
  public static void parse(List paramList, Scanner paramScanner, String paramString)
  {
    String str = QP_SEP_PATTERN;
    parse(paramList, paramScanner, str, paramString);
  }
  
  public static void parse(List paramList, Scanner paramScanner, String paramString1, String paramString2)
  {
    paramScanner.useDelimiter(paramString1);
    boolean bool = paramScanner.hasNext();
    if (bool)
    {
      bool = false;
      String str1 = null;
      Object localObject = paramScanner.next();
      String str2 = "=";
      int j = ((String)localObject).indexOf(str2);
      int k = -1;
      if (j != k)
      {
        str2 = decodeFormFields(((String)localObject).substring(0, j).trim(), paramString2);
        int i = j + 1;
        str1 = decodeFormFields(((String)localObject).substring(i).trim(), paramString2);
      }
      for (;;)
      {
        localObject = new org/apache/http/message/BasicNameValuePair;
        ((BasicNameValuePair)localObject).<init>(str2, str1);
        paramList.add(localObject);
        break;
        str2 = decodeFormFields(((String)localObject).trim(), paramString2);
      }
    }
  }
  
  private static String urlDecode(String paramString, Charset paramCharset, boolean paramBoolean)
  {
    int i = 37;
    int j = 16;
    int k = -1;
    int m;
    if (paramString == null) {
      m = 0;
    }
    for (Object localObject = null;; localObject = paramCharset.decode((ByteBuffer)localObject).toString())
    {
      return (String)localObject;
      m = paramString.length();
      localObject = ByteBuffer.allocate(m);
      CharBuffer localCharBuffer = CharBuffer.wrap(paramString);
      for (;;)
      {
        boolean bool = localCharBuffer.hasRemaining();
        if (!bool) {
          break;
        }
        int n = localCharBuffer.get();
        if (n == i)
        {
          int i1 = localCharBuffer.remaining();
          int i2 = 2;
          if (i1 >= i2)
          {
            char c = localCharBuffer.get();
            i1 = localCharBuffer.get();
            int i3 = Character.digit(c, j);
            int i4 = Character.digit(i1, j);
            if ((i3 != k) && (i4 != k))
            {
              b1 = (byte)((i3 << 4) + i4);
              ((ByteBuffer)localObject).put(b1);
              continue;
            }
            ((ByteBuffer)localObject).put(i);
            b1 = (byte)b1;
            ((ByteBuffer)localObject).put(b1);
            b1 = (byte)i1;
            ((ByteBuffer)localObject).put(b1);
            continue;
          }
        }
        if (paramBoolean)
        {
          byte b2 = 43;
          if (b1 == b2)
          {
            b1 = 32;
            ((ByteBuffer)localObject).put(b1);
            continue;
          }
        }
        byte b1 = (byte)b1;
        ((ByteBuffer)localObject).put(b1);
      }
      ((ByteBuffer)localObject).flip();
    }
  }
  
  private static String urlEncode(String paramString, Charset paramCharset, BitSet paramBitSet, boolean paramBoolean)
  {
    int i = 16;
    if (paramString == null) {}
    for (Object localObject = null;; localObject = ((StringBuilder)localObject).toString())
    {
      return (String)localObject;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ByteBuffer localByteBuffer = paramCharset.encode(paramString);
      for (;;)
      {
        boolean bool1 = localByteBuffer.hasRemaining();
        if (!bool1) {
          break;
        }
        int j = localByteBuffer.get() & 0xFF;
        boolean bool2 = paramBitSet.get(j);
        if (bool2)
        {
          j = (char)j;
          ((StringBuilder)localObject).append(j);
        }
        else
        {
          if (paramBoolean)
          {
            int k = 32;
            if (j == k)
            {
              c1 = '+';
              ((StringBuilder)localObject).append(c1);
              continue;
            }
          }
          String str = "%";
          ((StringBuilder)localObject).append(str);
          char c2 = Character.toUpperCase(Character.forDigit(c1 >> '\004' & 0xF, i));
          char c1 = Character.toUpperCase(Character.forDigit(c1 & 0xF, i));
          ((StringBuilder)localObject).append(c2);
          ((StringBuilder)localObject).append(c1);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\URLEncodedUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */