package b.a.a.a.e.d;

import b.a.a.a.o.a;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public final class d
{
  private final String a;
  private final X509Certificate[] b;
  
  public d(String paramString, X509Certificate[] paramArrayOfX509Certificate)
  {
    String str = (String)a.a(paramString, "Private key type");
    this.a = str;
    this.b = paramArrayOfX509Certificate;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.a;
    localStringBuilder = localStringBuilder.append(str).append(':');
    str = Arrays.toString(this.b);
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\d\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */