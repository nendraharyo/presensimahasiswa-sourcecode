package b.a.a.a.o;

import b.a.a.a.c;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class e
{
  public static String a(byte[] paramArrayOfByte)
  {
    a.a(paramArrayOfByte, "Input");
    int i = paramArrayOfByte.length;
    return a(paramArrayOfByte, 0, i);
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    String str = "Input";
    a.a(paramArrayOfByte, str);
    try
    {
      str = new java/lang/String;
      Object localObject = c.b;
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
  
  public static byte[] a(String paramString)
  {
    Object localObject = "Input";
    a.a(paramString, (String)localObject);
    try
    {
      localObject = c.b;
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
  
  public static byte[] a(String paramString1, String paramString2)
  {
    a.a(paramString1, "Input");
    Object localObject = "Charset";
    a.a(paramString2, (String)localObject);
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\o\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */