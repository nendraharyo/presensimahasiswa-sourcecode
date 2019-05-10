package org.apache.http.message;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicHeaderValueParser
  implements HeaderValueParser
{
  private static final char[] ALL_DELIMITERS;
  public static final BasicHeaderValueParser DEFAULT;
  private static final char ELEM_DELIMITER = ',';
  public static final BasicHeaderValueParser INSTANCE;
  private static final char PARAM_DELIMITER = ';';
  
  static
  {
    Object localObject = new org/apache/http/message/BasicHeaderValueParser;
    ((BasicHeaderValueParser)localObject).<init>();
    DEFAULT = (BasicHeaderValueParser)localObject;
    localObject = new org/apache/http/message/BasicHeaderValueParser;
    ((BasicHeaderValueParser)localObject).<init>();
    INSTANCE = (BasicHeaderValueParser)localObject;
    localObject = new char[2];
    localObject[0] = 59;
    localObject[1] = 44;
    ALL_DELIMITERS = (char[])localObject;
  }
  
  private static boolean isOneOf(char paramChar, char[] paramArrayOfChar)
  {
    boolean bool = false;
    int i;
    int j;
    if (paramArrayOfChar != null)
    {
      i = paramArrayOfChar.length;
      j = 0;
    }
    for (;;)
    {
      if (j < i)
      {
        char c = paramArrayOfChar[j];
        if (paramChar == c) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      j += 1;
    }
  }
  
  public static HeaderElement[] parseElements(String paramString, HeaderValueParser paramHeaderValueParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    localParserCursor.<init>(0, j);
    if (paramHeaderValueParser != null) {}
    for (;;)
    {
      return paramHeaderValueParser.parseElements(localCharArrayBuffer, localParserCursor);
      paramHeaderValueParser = INSTANCE;
    }
  }
  
  public static HeaderElement parseHeaderElement(String paramString, HeaderValueParser paramHeaderValueParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    localParserCursor.<init>(0, j);
    if (paramHeaderValueParser != null) {}
    for (;;)
    {
      return paramHeaderValueParser.parseHeaderElement(localCharArrayBuffer, localParserCursor);
      paramHeaderValueParser = INSTANCE;
    }
  }
  
  public static NameValuePair parseNameValuePair(String paramString, HeaderValueParser paramHeaderValueParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    localParserCursor.<init>(0, j);
    if (paramHeaderValueParser != null) {}
    for (;;)
    {
      return paramHeaderValueParser.parseNameValuePair(localCharArrayBuffer, localParserCursor);
      paramHeaderValueParser = INSTANCE;
    }
  }
  
  public static NameValuePair[] parseParameters(String paramString, HeaderValueParser paramHeaderValueParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    localParserCursor.<init>(0, j);
    if (paramHeaderValueParser != null) {}
    for (;;)
    {
      return paramHeaderValueParser.parseParameters(localCharArrayBuffer, localParserCursor);
      paramHeaderValueParser = INSTANCE;
    }
  }
  
  protected HeaderElement createHeaderElement(String paramString1, String paramString2, NameValuePair[] paramArrayOfNameValuePair)
  {
    BasicHeaderElement localBasicHeaderElement = new org/apache/http/message/BasicHeaderElement;
    localBasicHeaderElement.<init>(paramString1, paramString2, paramArrayOfNameValuePair);
    return localBasicHeaderElement;
  }
  
  protected NameValuePair createNameValuePair(String paramString1, String paramString2)
  {
    BasicNameValuePair localBasicNameValuePair = new org/apache/http/message/BasicNameValuePair;
    localBasicNameValuePair.<init>(paramString1, paramString2);
    return localBasicNameValuePair;
  }
  
  public HeaderElement[] parseElements(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    Args.notNull(paramParserCursor, "Parser cursor");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      boolean bool = paramParserCursor.atEnd();
      if (bool) {
        break;
      }
      localObject = parseHeaderElement(paramCharArrayBuffer, paramParserCursor);
      String str = ((HeaderElement)localObject).getName();
      int i = str.length();
      if (i == 0)
      {
        str = ((HeaderElement)localObject).getValue();
        if (str == null) {}
      }
      else
      {
        localArrayList.add(localObject);
      }
    }
    Object localObject = new HeaderElement[localArrayList.size()];
    return (HeaderElement[])localArrayList.toArray((Object[])localObject);
  }
  
  public HeaderElement parseHeaderElement(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    Args.notNull(paramParserCursor, "Parser cursor");
    Object localObject = parseNameValuePair(paramCharArrayBuffer, paramParserCursor);
    NameValuePair[] arrayOfNameValuePair = null;
    boolean bool = paramParserCursor.atEnd();
    if (!bool)
    {
      int i = paramParserCursor.getPos() + -1;
      i = paramCharArrayBuffer.charAt(i);
      int j = 44;
      if (i != j) {
        arrayOfNameValuePair = parseParameters(paramCharArrayBuffer, paramParserCursor);
      }
    }
    String str = ((NameValuePair)localObject).getName();
    localObject = ((NameValuePair)localObject).getValue();
    return createHeaderElement(str, (String)localObject, arrayOfNameValuePair);
  }
  
  public NameValuePair parseNameValuePair(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    char[] arrayOfChar = ALL_DELIMITERS;
    return parseNameValuePair(paramCharArrayBuffer, paramParserCursor, arrayOfChar);
  }
  
  public NameValuePair parseNameValuePair(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor, char[] paramArrayOfChar)
  {
    int i = 34;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    String str = null;
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    Object localObject1 = "Parser cursor";
    Args.notNull(paramParserCursor, (String)localObject1);
    int m = paramParserCursor.getPos();
    int n = paramParserCursor.getPos();
    int i2 = paramParserCursor.getUpperBound();
    char c;
    int i5;
    float f2;
    if (m < i2)
    {
      c = paramCharArrayBuffer.charAt(m);
      i5 = 61;
      if (c == i5)
      {
        c = '\000';
        f2 = 0.0F;
      }
    }
    for (;;)
    {
      label85:
      Object localObject2;
      if (m == i2)
      {
        localObject1 = paramCharArrayBuffer.substringTrimmed(n, i2);
        localObject2 = localObject1;
        c = j;
        f2 = f1;
      }
      for (;;)
      {
        if (c == 0) {
          break label199;
        }
        paramParserCursor.updatePos(m);
        n = 0;
        f3 = 0.0F;
        localObject1 = createNameValuePair((String)localObject2, null);
        return (NameValuePair)localObject1;
        boolean bool2 = isOneOf(c, paramArrayOfChar);
        if (bool2)
        {
          bool2 = j;
          f2 = f1;
          break label85;
        }
        m += 1;
        break;
        localObject1 = paramCharArrayBuffer.substringTrimmed(n, m);
        m += 1;
        localObject2 = localObject1;
      }
      label199:
      int i7 = 0;
      n = 0;
      localObject1 = null;
      float f3 = 0.0F;
      i5 = m;
      int i8;
      int i9;
      float f4;
      label263:
      boolean bool1;
      if (i5 < i2)
      {
        i8 = paramCharArrayBuffer.charAt(i5);
        if ((i8 == i) && (i7 == 0)) {
          if (n == 0)
          {
            n = j;
            f3 = f1;
            i9 = n;
            f4 = f3;
            if ((i9 != 0) || (i7 != 0)) {
              break label334;
            }
            bool1 = isOneOf(i8, paramArrayOfChar);
            if (!bool1) {
              break label334;
            }
          }
        }
      }
      for (;;)
      {
        k = m;
        label334:
        int i6;
        int i1;
        for (;;)
        {
          if (k < i5)
          {
            bool1 = HTTP.isWhitespace(paramCharArrayBuffer.charAt(k));
            if (bool1)
            {
              k += 1;
              continue;
              bool1 = false;
              localObject1 = null;
              f3 = 0.0F;
              break;
              if (i7 != 0)
              {
                bool1 = false;
                localObject1 = null;
                f3 = 0.0F;
              }
              for (;;)
              {
                i5 += 1;
                i7 = bool1;
                bool1 = i9;
                f3 = f4;
                break;
                if (i9 != 0)
                {
                  i1 = 92;
                  f3 = 1.29E-43F;
                  if (i8 == i1)
                  {
                    i1 = j;
                    f3 = f1;
                    continue;
                  }
                }
                i1 = 0;
                localObject1 = null;
                f3 = 0.0F;
              }
            }
          }
        }
        for (;;)
        {
          if (i1 > k)
          {
            int i3 = i1 + -1;
            boolean bool3 = HTTP.isWhitespace(paramCharArrayBuffer.charAt(i3));
            if (bool3)
            {
              i1 += -1;
              continue;
            }
          }
          i4 = i1 - k;
          m = 2;
          if (i4 >= m)
          {
            i4 = paramCharArrayBuffer.charAt(k);
            if (i4 == i)
            {
              i4 = i1 + -1;
              i4 = paramCharArrayBuffer.charAt(i4);
              if (i4 == i)
              {
                k += 1;
                i1 += -1;
              }
            }
          }
          str = paramCharArrayBuffer.substring(k, i1);
          if (j != 0) {}
          for (i1 = i6 + 1;; i1 = i6)
          {
            paramParserCursor.updatePos(i1);
            localObject1 = createNameValuePair((String)localObject2, str);
            break;
          }
          i1 = i6;
        }
        i9 = i1;
        f4 = f3;
        break label263;
        j = i4;
        f1 = f2;
      }
      int i4 = 0;
      f2 = 0.0F;
    }
  }
  
  public NameValuePair[] parseParameters(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    Object localObject1 = "Parser cursor";
    Args.notNull(paramParserCursor, (String)localObject1);
    int i = paramParserCursor.getPos();
    int j = paramParserCursor.getUpperBound();
    while (i < j)
    {
      boolean bool3 = HTTP.isWhitespace(paramCharArrayBuffer.charAt(i));
      if (!bool3) {
        break;
      }
      i += 1;
    }
    paramParserCursor.updatePos(i);
    boolean bool1 = paramParserCursor.atEnd();
    if (bool1) {
      bool1 = false;
    }
    Object localObject2;
    for (localObject1 = new NameValuePair[0];; localObject1 = (NameValuePair[])((List)localObject1).toArray((Object[])localObject2))
    {
      return (NameValuePair[])localObject1;
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      int m;
      do
      {
        boolean bool2 = paramParserCursor.atEnd();
        if (bool2) {
          break;
        }
        localObject2 = parseNameValuePair(paramCharArrayBuffer, paramParserCursor);
        ((List)localObject1).add(localObject2);
        k = paramParserCursor.getPos() + -1;
        k = paramCharArrayBuffer.charAt(k);
        m = 44;
      } while (k != m);
      int k = ((List)localObject1).size();
      localObject2 = new NameValuePair[k];
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHeaderValueParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */