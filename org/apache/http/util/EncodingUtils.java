package org.apache.http.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.Consts;

public final class EncodingUtils
{
  public static byte[] getAsciiBytes(String paramString)
  {
    Object localObject = "Input";
    Args.notNull(paramString, (String)localObject);
    try
    {
      localObject = Consts.ASCII;
      localObject = ((Charset)localObject).name();
      return paramString.getBytes((String)localObject);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Error localError = new java/lang/Error;
      localError.<init>("ASCII not supported");
      throw localError;
    }
  }
  
  public static String getAsciiString(byte[] paramArrayOfByte)
  {
    Args.notNull(paramArrayOfByte, "Input");
    int i = paramArrayOfByte.length;
    return getAsciiString(paramArrayOfByte, 0, i);
  }
  
  public static String getAsciiString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    String str = "Input";
    Args.notNull(paramArrayOfByte, str);
    try
    {
      str = new java/lang/String;
      Object localObject = Consts.ASCII;
      localObject = ((Charset)localObject).name();
      str.<init>(paramArrayOfByte, paramInt1, paramInt2, (String)localObject);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Error localError = new java/lang/Error;
      localError.<init>("ASCII not supported");
      throw localError;
    }
  }
  
  public static byte[] getBytes(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Input");
    Object localObject = "Charset";
    Args.notEmpty(paramString2, (String)localObject);
    try
    {
      localObject = paramString1.getBytes(paramString2);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        byte[] arrayOfByte = paramString1.getBytes();
      }
    }
    return (byte[])localObject;
  }
  
  public static String getString(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    Args.notNull(paramArrayOfByte, "Input");
    String str1 = "Charset";
    Args.notEmpty(paramString, str1);
    try
    {
      str1 = new java/lang/String;
      str1.<init>(paramArrayOfByte, paramInt1, paramInt2, paramString);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str2 = new java/lang/String;
        str2.<init>(paramArrayOfByte, paramInt1, paramInt2);
      }
    }
    return str1;
  }
  
  public static String getString(byte[] paramArrayOfByte, String paramString)
  {
    Args.notNull(paramArrayOfByte, "Input");
    int i = paramArrayOfByte.length;
    return getString(paramArrayOfByte, 0, i, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\EncodingUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */