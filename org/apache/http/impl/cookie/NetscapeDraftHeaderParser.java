package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class NetscapeDraftHeaderParser
{
  public static final NetscapeDraftHeaderParser DEFAULT;
  
  static
  {
    NetscapeDraftHeaderParser localNetscapeDraftHeaderParser = new org/apache/http/impl/cookie/NetscapeDraftHeaderParser;
    localNetscapeDraftHeaderParser.<init>();
    DEFAULT = localNetscapeDraftHeaderParser;
  }
  
  private NameValuePair parseNameValuePair(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    int i = 59;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    float f2 = 0.0F;
    int m = paramParserCursor.getPos();
    int n = paramParserCursor.getPos();
    int i2 = paramParserCursor.getUpperBound();
    int i3;
    int i4;
    label60:
    String str1;
    String str2;
    if (m < i2)
    {
      i3 = paramCharArrayBuffer.charAt(m);
      i4 = 61;
      if (i3 != i4) {}
    }
    else
    {
      if (m != i2) {
        break label151;
      }
      str1 = paramCharArrayBuffer.substringTrimmed(n, i2);
      str2 = str1;
      n = j;
    }
    BasicNameValuePair localBasicNameValuePair;
    for (float f3 = f1;; f3 = f2)
    {
      if (n == 0) {
        break label182;
      }
      paramParserCursor.updatePos(m);
      localBasicNameValuePair = new org/apache/http/message/BasicNameValuePair;
      n = 0;
      f3 = 0.0F;
      str1 = null;
      localBasicNameValuePair.<init>(str2, null);
      return localBasicNameValuePair;
      if (i3 == i)
      {
        k = j;
        f2 = f1;
        break label60;
      }
      m += 1;
      break;
      label151:
      str1 = paramCharArrayBuffer.substringTrimmed(n, m);
      m += 1;
      str2 = str1;
      n = k;
    }
    label182:
    k = m;
    label186:
    if (k < i2)
    {
      i4 = paramCharArrayBuffer.charAt(k);
      if (i4 != i) {}
    }
    for (;;)
    {
      int i1;
      if (m < k)
      {
        boolean bool1 = HTTP.isWhitespace(paramCharArrayBuffer.charAt(m));
        if (bool1)
        {
          i1 = m + 1;
          m = i1;
          continue;
          k += 1;
          break label186;
        }
      }
      for (;;)
      {
        if (i1 > m)
        {
          i2 = i1 + -1;
          boolean bool2 = HTTP.isWhitespace(paramCharArrayBuffer.charAt(i2));
          if (bool2)
          {
            i1 += -1;
            continue;
          }
        }
        str1 = paramCharArrayBuffer.substring(m, i1);
        if (j != 0) {}
        for (j = k + 1;; j = k)
        {
          paramParserCursor.updatePos(j);
          localBasicNameValuePair = new org/apache/http/message/BasicNameValuePair;
          localBasicNameValuePair.<init>(str2, str1);
          break;
        }
        i1 = k;
      }
      j = i1;
      f1 = f3;
    }
  }
  
  public HeaderElement parseHeader(CharArrayBuffer paramCharArrayBuffer, ParserCursor paramParserCursor)
  {
    Args.notNull(paramCharArrayBuffer, "Char array buffer");
    Args.notNull(paramParserCursor, "Parser cursor");
    Object localObject1 = parseNameValuePair(paramCharArrayBuffer, paramParserCursor);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      boolean bool = paramParserCursor.atEnd();
      if (bool) {
        break;
      }
      localObject2 = parseNameValuePair(paramCharArrayBuffer, paramParserCursor);
      localArrayList.add(localObject2);
    }
    Object localObject2 = new org/apache/http/message/BasicHeaderElement;
    String str1 = ((NameValuePair)localObject1).getName();
    String str2 = ((NameValuePair)localObject1).getValue();
    localObject1 = new NameValuePair[localArrayList.size()];
    localObject1 = (NameValuePair[])localArrayList.toArray((Object[])localObject1);
    ((BasicHeaderElement)localObject2).<init>(str1, str2, (NameValuePair[])localObject1);
    return (HeaderElement)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\NetscapeDraftHeaderParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */