package b.a.a.a.a;

import b.a.a.a.o.a;
import java.util.Queue;

public class h
{
  private b a;
  private c b;
  private g c;
  private m d;
  private Queue e;
  
  public h()
  {
    b localb = b.a;
    this.a = localb;
  }
  
  public void a()
  {
    b localb = b.a;
    this.a = localb;
    this.e = null;
    this.b = null;
    this.c = null;
    this.d = null;
  }
  
  public void a(b paramb)
  {
    if (paramb != null) {}
    for (;;)
    {
      this.a = paramb;
      return;
      paramb = b.a;
    }
  }
  
  public void a(c paramc)
  {
    if (paramc == null) {
      a();
    }
    for (;;)
    {
      return;
      this.b = paramc;
    }
  }
  
  public void a(c paramc, m paramm)
  {
    a.a(paramc, "Auth scheme");
    a.a(paramm, "Credentials");
    this.b = paramc;
    this.d = paramm;
    this.e = null;
  }
  
  public void a(m paramm)
  {
    this.d = paramm;
  }
  
  public void a(Queue paramQueue)
  {
    a.a(paramQueue, "Queue of auth options");
    this.e = paramQueue;
    this.b = null;
    this.d = null;
  }
  
  public b b()
  {
    return this.a;
  }
  
  public c c()
  {
    return this.b;
  }
  
  public m d()
  {
    return this.d;
  }
  
  public Queue e()
  {
    return this.e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = localStringBuilder.append("state:");
    Object localObject2 = this.a;
    localObject1 = ((StringBuilder)localObject1).append(localObject2);
    localObject2 = ";";
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append("auth scheme:");
      localObject2 = this.b.a();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ";";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = this.d;
    if (localObject1 != null)
    {
      localObject1 = "credentials present";
      localStringBuilder.append((String)localObject1);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\a\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */