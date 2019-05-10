package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicLineParser
  implements LineParser
{
  public static final BasicLineParser DEFAULT;
  public static final BasicLineParser INSTANCE;
  protected final ProtocolVersion protocol;
  
  static
  {
    BasicLineParser localBasicLineParser = new org/apache/http/message/BasicLineParser;
    localBasicLineParser.<init>();
    DEFAULT = localBasicLineParser;
    localBasicLineParser = new org/apache/http/message/BasicLineParser;
    localBasicLineParser.<init>();
    INSTANCE = localBasicLineParser;
  }
  
  public BasicLineParser()
  {
    this(null);
  }
  
  public BasicLineParser(ProtocolVersion paramProtocolVersion)
  {
    if (paramProtocolVersion != null) {}
    for (;;)
    {
      this.protocol = paramProtocolVersion;
      return;
      paramProtocolVersion = HttpVersion.HTTP_1_1;
    }
  }
  
  public static Header parseHeader(String paramString, LineParser paramLineParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseHeader(localCharArrayBuffer);
      paramLineParser = INSTANCE;
    }
  }
  
  public static ProtocolVersion parseProtocolVersion(String paramString, LineParser paramLineParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    localParserCursor.<init>(0, j);
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseProtocolVersion(localCharArrayBuffer, localParserCursor);
      paramLineParser = INSTANCE;
    }
  }
  
  public static RequestLine parseRequestLine(String paramString, LineParser paramLineParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    localParserCursor.<init>(0, j);
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseRequestLine(localCharArrayBuffer, localParserCursor);
      paramLineParser = INSTANCE;
    }
  }
  
  public static StatusLine parseStatusLine(String paramString, LineParser paramLineParser)
  {
    Args.notNull(paramString, "Value");
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    localCharArrayBuffer.<init>(i);
    localCharArrayBuffer.append(paramString);
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    localParserCursor.<init>(0, j);
    if (paramLineParser != null) {}
    for (;;)
    {
      return paramLineParser.parseStatusLine(localCharArrayBuffer, localParserCursor);
      paramLineParser = INSTANCE;
    }
  }
  
  protected ProtocolVersion createProtocolVersion(int paramInt1, int paramInt2)
  {
    return this.protocol.forVersion(paramInt1, paramInt2);
  }
  
  protected RequestLine createRequestLine(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    BasicRequestLine localBasicRequestLine = new org/apache/http/message/BasicRequestLine;
    localBasicRequestLine.<init>(paramString1, paramString2, paramProtocolVersion);
    return localBasicRequestLine;
  }
  
  protected StatusLine createStatusLine(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    BasicStatusLine localBasicStatusLine = new org/apache/http/message/BasicStatusLine;
    localBasicStatusLine.<init>(paramProtocolVersion, paramInt, paramString);
    return localBasicStatusLine;
  }
  
  public boolean hasProtocolVersion(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    String str1 = "Parser cursor";
    Args.notNull(paramParserCursor, str1);
    int j = paramParserCursor.getPos();
    ProtocolVersion localProtocolVersion = this.protocol;
    String str2 = localProtocolVersion.getProtocol();
    int k = str2.length();
    int m = paramCharArrayBuffer.length();
    int i1 = k + 4;
    if (m < i1) {}
    do
    {
      return bool1;
      if (j >= 0) {
        break;
      }
      j = paramCharArrayBuffer.length() + -4 - k;
      m = j + k + 4;
      i1 = paramCharArrayBuffer.length();
    } while (m > i1);
    i1 = 0;
    m = i;
    float f2 = f1;
    label124:
    boolean bool2;
    if ((m != 0) && (i1 < k))
    {
      m = j + i1;
      m = paramCharArrayBuffer.charAt(m);
      int i2 = str2.charAt(i1);
      if (m == i2) {
        m = i;
      }
      for (f2 = f1;; f2 = 0.0F)
      {
        i1 += 1;
        break label124;
        if (j != 0) {
          break;
        }
        for (;;)
        {
          m = paramCharArrayBuffer.length();
          if (j >= m) {
            break;
          }
          bool2 = HTTP.isWhitespace(paramCharArrayBuffer.charAt(j));
          if (!bool2) {
            break;
          }
          j += 1;
        }
        bool2 = false;
        localProtocolVersion = null;
      }
    }
    int n;
    if (bool2)
    {
      j += k;
      j = paramCharArrayBuffer.charAt(j);
      n = 47;
      f2 = 6.6E-44F;
      if (j != n) {}
    }
    for (;;)
    {
      bool1 = i;
      break;
      i = 0;
      f1 = 0.0F;
      continue;
      i = n;
      f1 = f2;
    }
  }
  
  public Header parseHeader(CharArrayBuffer paramCharArrayBuffer)
  {
    BufferedHeader localBufferedHeader = new org/apache/http/message/BufferedHeader;
    localBufferedHeader.<init>(paramCharArrayBuffer);
    return localBufferedHeader;
  }
  
  public ProtocolVersion parseProtocolVersion(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    int i = -1;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    String str1 = null;
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    Args.notNull(paramParserCursor, "Parser cursor");
    Object localObject1 = this.protocol;
    String str2 = ((ProtocolVersion)localObject1).getProtocol();
    int m = str2.length();
    int n = paramParserCursor.getPos();
    int i1 = paramParserCursor.getUpperBound();
    skipWhitespace(paramCharArrayBuffer, paramParserCursor);
    int i2 = paramParserCursor.getPos();
    int i3 = i2 + m + 4;
    Object localObject2;
    if (i3 > i1)
    {
      localObject1 = new org/apache/http/ParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Not a valid protocol version: ");
      str1 = paramCharArrayBuffer.substring(n, i1);
      localObject2 = str1;
      ((ParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i4 = 0;
    i3 = j;
    float f2 = f1;
    if ((i3 != 0) && (i4 < m))
    {
      i3 = i2 + i4;
      i3 = paramCharArrayBuffer.charAt(i3);
      int i5 = str2.charAt(i4);
      if (i3 == i5) {
        i3 = j;
      }
      for (f2 = f1;; f2 = 0.0F)
      {
        i4 += 1;
        break;
        i3 = 0;
        localObject1 = null;
      }
    }
    if (i3 != 0)
    {
      i3 = i2 + m;
      i3 = paramCharArrayBuffer.charAt(i3);
      i4 = 47;
      if (i3 != i4) {}
    }
    for (;;)
    {
      if (j == 0)
      {
        localObject1 = new org/apache/http/ParseException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Not a valid protocol version: ");
        str1 = paramCharArrayBuffer.substring(n, i1);
        localObject2 = str1;
        ((ParseException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        j = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
      else
      {
        i3 = m + 1 + i2;
        f1 = 6.4E-44F;
        j = paramCharArrayBuffer.indexOf(46, i3, i1);
        if (j == i)
        {
          localObject1 = new org/apache/http/ParseException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Invalid protocol version number: ");
          str1 = paramCharArrayBuffer.substring(n, i1);
          localObject2 = str1;
          ((ParseException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        try
        {
          localObject1 = paramCharArrayBuffer.substringTrimmed(i3, j);
          k = Integer.parseInt((String)localObject1);
          j += 1;
          f2 = 4.5E-44F;
          i3 = paramCharArrayBuffer.indexOf(32, j, i1);
          if (i3 == i) {
            i3 = i1;
          }
          ParseException localParseException1;
          ParseException localParseException2;
          j = i3;
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          try
          {
            localObject2 = paramCharArrayBuffer.substringTrimmed(j, i3);
            j = Integer.parseInt((String)localObject2);
            paramParserCursor.updatePos(i3);
            return createProtocolVersion(k, j);
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            localParseException2 = new org/apache/http/ParseException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Invalid protocol minor version number: ");
            str1 = paramCharArrayBuffer.substring(n, i1);
            localObject2 = str1;
            localParseException2.<init>((String)localObject2);
            throw localParseException2;
          }
          localNumberFormatException1 = localNumberFormatException1;
          localParseException1 = new org/apache/http/ParseException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Invalid protocol major version number: ");
          str1 = paramCharArrayBuffer.substring(n, i1);
          localObject2 = str1;
          localParseException1.<init>((String)localObject2);
          throw localParseException1;
        }
        f1 = f2;
      }
    }
  }
  
  public RequestLine parseRequestLine(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    String str = "Parser cursor";
    Args.notNull(paramParserCursor, str);
    int i = paramParserCursor.getPos();
    int j = paramParserCursor.getUpperBound();
    int k;
    try
    {
      skipWhitespace(paramCharArrayBuffer, paramParserCursor);
      k = paramParserCursor.getPos();
      m = 32;
      m = paramCharArrayBuffer.indexOf(m, k, j);
      if (m < 0)
      {
        ParseException localParseException = new org/apache/http/ParseException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Invalid request line: ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = paramCharArrayBuffer.substring(i, j);
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        localParseException.<init>((String)localObject2);
        throw localParseException;
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localObject1 = new org/apache/http/ParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid request line: ");
      str = paramCharArrayBuffer.substring(i, j);
      str = str;
      ((ParseException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = paramCharArrayBuffer.substringTrimmed(k, m);
    paramParserCursor.updatePos(m);
    skipWhitespace(paramCharArrayBuffer, paramParserCursor);
    int m = paramParserCursor.getPos();
    int n = 32;
    n = paramCharArrayBuffer.indexOf(n, m, j);
    if (n < 0)
    {
      localObject1 = new org/apache/http/ParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Invalid request line: ";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject3 = paramCharArrayBuffer.substring(i, j);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((ParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = paramCharArrayBuffer.substringTrimmed(m, n);
    paramParserCursor.updatePos(n);
    Object localObject3 = parseProtocolVersion(paramCharArrayBuffer, paramParserCursor);
    skipWhitespace(paramCharArrayBuffer, paramParserCursor);
    boolean bool = paramParserCursor.atEnd();
    if (!bool)
    {
      localObject1 = new org/apache/http/ParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Invalid request line: ";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject3 = paramCharArrayBuffer.substring(i, j);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((ParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return createRequestLine((String)localObject1, (String)localObject2, (ProtocolVersion)localObject3);
  }
  
  public StatusLine parseStatusLine(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    Object localObject1 = "Parser cursor";
    Args.notNull(paramParserCursor, (String)localObject1);
    int i = paramParserCursor.getPos();
    int j = paramParserCursor.getUpperBound();
    for (;;)
    {
      Object localObject4;
      int k;
      int m;
      String str1;
      Object localObject5;
      Object localObject2;
      try
      {
        localObject4 = parseProtocolVersion(paramCharArrayBuffer, paramParserCursor);
        skipWhitespace(paramCharArrayBuffer, paramParserCursor);
        k = paramParserCursor.getPos();
        m = 32;
        m = paramCharArrayBuffer.indexOf(m, k, j);
        if (m >= 0) {
          break label348;
        }
        n = j;
        str1 = paramCharArrayBuffer.substringTrimmed(k, n);
        m = 0;
        localObject1 = null;
        int i1 = str1.length();
        if (m >= i1) {
          break label247;
        }
        i1 = str1.charAt(m);
        boolean bool = Character.isDigit(i1);
        if (!bool)
        {
          localObject1 = new org/apache/http/ParseException;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject4 = "Status line contains invalid status code: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject4 = paramCharArrayBuffer.substring(i, j);
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject5 = ((StringBuilder)localObject5).toString();
          ((ParseException)localObject1).<init>((String)localObject5);
          throw ((Throwable)localObject1);
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        localObject2 = new org/apache/http/ParseException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Invalid status line: ");
        String str2 = paramCharArrayBuffer.substring(i, j);
        localObject5 = str2;
        ((ParseException)localObject2).<init>((String)localObject5);
        throw ((Throwable)localObject2);
      }
      m += 1;
      continue;
      for (;;)
      {
        try
        {
          label247:
          k = Integer.parseInt(str1);
          if (n < j)
          {
            localObject2 = paramCharArrayBuffer.substringTrimmed(n, j);
            return createStatusLine((ProtocolVersion)localObject4, k, (String)localObject2);
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localObject3 = new org/apache/http/ParseException;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject4 = "Status line contains invalid status code: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject4 = paramCharArrayBuffer.substring(i, j);
          localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
          localObject5 = ((StringBuilder)localObject5).toString();
          ((ParseException)localObject3).<init>((String)localObject5);
          throw ((Throwable)localObject3);
        }
        Object localObject3 = "";
      }
      label348:
      int n = m;
    }
  }
  
  protected void skipWhitespace(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    int i = paramParserCursor.getPos();
    int j = paramParserCursor.getUpperBound();
    while (i < j)
    {
      boolean bool = HTTP.isWhitespace(paramCharArrayBuffer.charAt(i));
      if (!bool) {
        break;
      }
      i += 1;
    }
    paramParserCursor.updatePos(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicLineParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */