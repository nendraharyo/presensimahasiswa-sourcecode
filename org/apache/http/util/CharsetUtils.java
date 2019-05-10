package org.apache.http.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class CharsetUtils
{
  public static Charset get(String paramString)
  {
    Charset localCharset;
    if (paramString == null) {
      localCharset = null;
    }
    for (;;)
    {
      return localCharset;
      try
      {
        localCharset = Charset.forName(paramString);
      }
      catch (UnsupportedCharsetException localUnsupportedCharsetException)
      {
        UnsupportedEncodingException localUnsupportedEncodingException = new java/io/UnsupportedEncodingException;
        localUnsupportedEncodingException.<init>(paramString);
        throw localUnsupportedEncodingException;
      }
    }
  }
  
  public static Charset lookup(String paramString)
  {
    Charset localCharset = null;
    if (paramString == null) {}
    for (;;)
    {
      return localCharset;
      try
      {
        localCharset = Charset.forName(paramString);
      }
      catch (UnsupportedCharsetException localUnsupportedCharsetException) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\CharsetUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */