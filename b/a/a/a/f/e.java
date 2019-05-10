package b.a.a.a.f;

import b.a.a.a.o.a;
import java.util.Locale;

public final class e
{
  private final String a;
  private final int b;
  private final String c;
  private final boolean d;
  
  public e(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    a.b(paramString1, "Host");
    a.b(paramInt, "Port");
    a.a(paramString2, "Path");
    Object localObject = Locale.ENGLISH;
    localObject = paramString1.toLowerCase((Locale)localObject);
    this.a = ((String)localObject);
    this.b = paramInt;
    localObject = paramString2.trim();
    int i = ((String)localObject).length();
    if (i != 0) {}
    for (this.c = paramString2;; this.c = ((String)localObject))
    {
      this.d = paramBoolean;
      return;
      localObject = "/";
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('[');
    boolean bool = this.d;
    if (bool)
    {
      str = "(secure)";
      localStringBuilder.append(str);
    }
    String str = this.a;
    localStringBuilder.append(str);
    localStringBuilder.append(':');
    str = Integer.toString(this.b);
    localStringBuilder.append(str);
    str = this.c;
    localStringBuilder.append(str);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\f\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */