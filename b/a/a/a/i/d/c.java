package b.a.a.a.i.d;

import b.a.a.a.f.m;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class c
  implements b.a.a.a.f.a, m, Serializable, Cloneable
{
  private final String a;
  private Map b;
  private String c;
  private String d;
  private String e;
  private Date f;
  private String g;
  private boolean h;
  private int i;
  
  public c(String paramString1, String paramString2)
  {
    b.a.a.a.o.a.a(paramString1, "Name");
    this.a = paramString1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.b = localHashMap;
    this.c = paramString2;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String a(String paramString)
  {
    return (String)this.b.get(paramString);
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.b.put(paramString1, paramString2);
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean a(Date paramDate)
  {
    b.a.a.a.o.a.a(paramDate, "Date");
    Date localDate = this.f;
    boolean bool;
    if (localDate != null)
    {
      localDate = this.f;
      long l1 = localDate.getTime();
      long l2 = paramDate.getTime();
      bool = l1 < l2;
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDate = null;
    }
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void b(Date paramDate)
  {
    this.f = paramDate;
  }
  
  public boolean b(String paramString)
  {
    Object localObject = this.b.get(paramString);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public Object clone()
  {
    c localc = (c)super.clone();
    HashMap localHashMap = new java/util/HashMap;
    Map localMap = this.b;
    localHashMap.<init>(localMap);
    localc.b = localHashMap;
    return localc;
  }
  
  public Date d()
  {
    return this.f;
  }
  
  public void d(String paramString)
  {
    Object localObject;
    if (paramString != null)
    {
      localObject = Locale.ENGLISH;
      localObject = paramString.toLowerCase((Locale)localObject);
    }
    for (this.e = ((String)localObject);; this.e = null)
    {
      return;
      localObject = null;
    }
  }
  
  public void e(String paramString)
  {
    this.g = paramString;
  }
  
  public boolean e()
  {
    Date localDate = this.f;
    boolean bool;
    if (localDate != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDate = null;
    }
  }
  
  public String f()
  {
    return this.e;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public int[] h()
  {
    return null;
  }
  
  public boolean i()
  {
    return this.h;
  }
  
  public int j()
  {
    return this.i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[version: ");
    Object localObject = Integer.toString(this.i);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[name: ");
    localObject = this.a;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[value: ");
    localObject = this.c;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[domain: ");
    localObject = this.e;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[path: ");
    localObject = this.g;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[expiry: ");
    localObject = this.f;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */