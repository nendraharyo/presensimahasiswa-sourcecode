package android.support.v4.f;

import android.support.v4.h.l;
import android.util.Base64;
import java.util.List;

public final class a
{
  private final String a;
  private final String b;
  private final String c;
  private final List d;
  private final int e;
  private final String f;
  
  public a(String paramString1, String paramString2, String paramString3, List paramList)
  {
    Object localObject = (String)l.a(paramString1);
    this.a = ((String)localObject);
    localObject = (String)l.a(paramString2);
    this.b = ((String)localObject);
    localObject = (String)l.a(paramString3);
    this.c = ((String)localObject);
    localObject = (List)l.a(paramList);
    this.d = ((List)localObject);
    this.e = 0;
    localObject = new java/lang/StringBuilder;
    String str = this.a;
    ((StringBuilder)localObject).<init>(str);
    localObject = ((StringBuilder)localObject).append("-");
    str = this.b;
    localObject = ((StringBuilder)localObject).append(str).append("-");
    str = this.c;
    localObject = str;
    this.f = ((String)localObject);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public List d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("FontRequest {mProviderAuthority: ");
    String str = this.a;
    localObject = ((StringBuilder)localObject).append(str).append(", mProviderPackage: ");
    str = this.b;
    localObject = ((StringBuilder)localObject).append(str).append(", mQuery: ");
    str = this.c;
    localObject = ((StringBuilder)localObject).append(str);
    str = ", mCertificates:";
    localObject = str;
    localStringBuilder.append((String)localObject);
    int j;
    for (int i = 0;; i = j)
    {
      localObject = this.d;
      j = ((List)localObject).size();
      if (i >= j) {
        break;
      }
      localStringBuilder.append(" [");
      localObject = (List)this.d.get(i);
      for (int k = 0;; k = m)
      {
        m = ((List)localObject).size();
        if (k >= m) {
          break;
        }
        localStringBuilder.append(" \"");
        str = Base64.encodeToString((byte[])((List)localObject).get(k), 0);
        localStringBuilder.append(str);
        str = "\"";
        localStringBuilder.append(str);
        m = k + 1;
      }
      localObject = " ]";
      localStringBuilder.append((String)localObject);
      j = i + 1;
    }
    localStringBuilder.append("}");
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("mCertificatesArray: ");
    int m = this.e;
    localObject = m;
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */