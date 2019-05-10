package b.a.a.a.b.e;

import b.a.a.a.f.l;
import b.a.a.a.s;
import b.a.a.a.u;
import java.util.Iterator;
import java.util.List;

public class i
  implements u
{
  public b.a.a.a.h.b a;
  
  public i()
  {
    b.a.a.a.h.b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
  }
  
  private static String a(b.a.a.a.f.b paramb)
  {
    int i = 100;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = paramb.a();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("=\"");
    localObject1 = paramb.b();
    if (localObject1 != null)
    {
      int j = ((String)localObject1).length();
      if (j > i)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = ((String)localObject1).substring(0, i);
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = "...";
        localObject1 = (String)localObject2;
      }
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append("\"");
    localStringBuilder.append(", version:");
    localObject1 = Integer.toString(paramb.j());
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", domain:");
    localObject1 = paramb.f();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", path:");
    localObject1 = paramb.g();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", expiry:");
    localObject1 = paramb.d();
    localStringBuilder.append(localObject1);
    return localStringBuilder.toString();
  }
  
  private void a(b.a.a.a.h paramh, b.a.a.a.f.h paramh1, b.a.a.a.f.e parame, b.a.a.a.b.h paramh2)
  {
    for (;;)
    {
      boolean bool1 = paramh.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject1 = paramh.a();
      try
      {
        Object localObject2 = paramh1.a((b.a.a.a.e)localObject1, parame);
        localObject3 = ((List)localObject2).iterator();
        boolean bool2;
        for (;;)
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = ((Iterator)localObject3).next();
          localObject2 = (b.a.a.a.f.b)localObject2;
          Object localObject6;
          boolean bool3;
          try
          {
            paramh1.a((b.a.a.a.f.b)localObject2, parame);
            paramh2.addCookie((b.a.a.a.f.b)localObject2);
            b.a.a.a.h.b localb = this.a;
            bool2 = localb.a();
            if (!bool2) {
              continue;
            }
            localb = this.a;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Cookie accepted [";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = a((b.a.a.a.f.b)localObject2);
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = "]";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            localb.a(localObject5);
          }
          catch (l locall2)
          {
            localObject5 = this.a;
            bool3 = ((b.a.a.a.h.b)localObject5).c();
          }
          if (bool3)
          {
            localObject5 = this.a;
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            String str2 = "Cookie rejected [";
            localObject6 = ((StringBuilder)localObject6).append(str2);
            localObject2 = a((b.a.a.a.f.b)localObject2);
            localObject2 = ((StringBuilder)localObject6).append((String)localObject2);
            localObject6 = "] ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
            localObject4 = locall2.getMessage();
            localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
            localObject2 = ((StringBuilder)localObject2).toString();
            ((b.a.a.a.h.b)localObject5).c(localObject2);
          }
        }
        if (!bool2) {
          continue;
        }
      }
      catch (l locall1)
      {
        localObject4 = this.a;
        bool2 = ((b.a.a.a.h.b)localObject4).c();
      }
      Object localObject4 = this.a;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      Object localObject5 = "Invalid cookie header: \"";
      localObject1 = ((StringBuilder)localObject3).append((String)localObject5).append(localObject1);
      localObject3 = "\". ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      String str1 = locall1.getMessage();
      str1 = str1;
      ((b.a.a.a.h.b)localObject4).c(str1);
    }
  }
  
  public void process(s params, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(params, "HTTP request");
    b.a.a.a.o.a.a(parame, "HTTP context");
    Object localObject1 = a.a(parame);
    Object localObject2 = ((a)localObject1).c();
    if (localObject2 == null)
    {
      localObject1 = this.a;
      localObject2 = "Cookie spec not specified in HTTP context";
      ((b.a.a.a.h.b)localObject1).a(localObject2);
    }
    for (;;)
    {
      return;
      b.a.a.a.b.h localh = ((a)localObject1).b();
      if (localh == null)
      {
        localObject1 = this.a;
        localObject2 = "Cookie store not specified in HTTP context";
        ((b.a.a.a.h.b)localObject1).a(localObject2);
      }
      else
      {
        localObject1 = ((a)localObject1).d();
        if (localObject1 == null)
        {
          localObject1 = this.a;
          localObject2 = "Cookie origin not specified in HTTP context";
          ((b.a.a.a.h.b)localObject1).a(localObject2);
        }
        else
        {
          b.a.a.a.h localh1 = params.headerIterator("Set-Cookie");
          a(localh1, (b.a.a.a.f.h)localObject2, (b.a.a.a.f.e)localObject1, localh);
          int i = ((b.a.a.a.f.h)localObject2).a();
          if (i > 0)
          {
            localh1 = params.headerIterator("Set-Cookie2");
            a(localh1, (b.a.a.a.f.h)localObject2, (b.a.a.a.f.e)localObject1, localh);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */