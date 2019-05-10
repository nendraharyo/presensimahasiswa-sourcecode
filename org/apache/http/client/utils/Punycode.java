package org.apache.http.client.utils;

public class Punycode
{
  private static final Idn impl;
  
  static
  {
    try
    {
      localJdkIdn = new org/apache/http/client/utils/JdkIdn;
      localJdkIdn.<init>();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        JdkIdn localJdkIdn;
        Rfc3492Idn localRfc3492Idn = new org/apache/http/client/utils/Rfc3492Idn;
        localRfc3492Idn.<init>();
      }
    }
    impl = localJdkIdn;
  }
  
  public static String toUnicode(String paramString)
  {
    return impl.toUnicode(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\Punycode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */