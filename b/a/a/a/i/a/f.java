package b.a.a.a.i.a;

import b.a.a.a.a.h;
import b.a.a.a.a.o;
import b.a.a.a.n;
import b.a.a.a.s;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

public class f
{
  public b.a.a.a.h.b a;
  
  public f()
  {
    this(null);
  }
  
  public f(b.a.a.a.h.b paramb)
  {
    if (paramb != null) {}
    for (;;)
    {
      this.a = paramb;
      return;
      paramb = new b/a/a/a/h/b;
      Class localClass = getClass();
      paramb.<init>(localClass);
    }
  }
  
  public boolean a(n paramn, s params, b.a.a.a.b.c paramc, h paramh, b.a.a.a.n.e parame)
  {
    boolean bool = paramc.a(paramn, params, parame);
    if (bool)
    {
      this.a.a("Authentication required");
      localObject1 = paramh.b();
      localObject2 = b.a.a.a.a.b.e;
      if (localObject1 == localObject2)
      {
        localObject1 = paramh.c();
        paramc.b(paramn, (b.a.a.a.a.c)localObject1, parame);
      }
      bool = true;
      return bool;
    }
    Object localObject1 = f.1.a;
    Object localObject2 = paramh.b();
    int j = ((b.a.a.a.a.b)localObject2).ordinal();
    int i = localObject1[j];
    switch (i)
    {
    default: 
      localObject1 = b.a.a.a.a.b.a;
      paramh.a((b.a.a.a.a.b)localObject1);
    }
    for (;;)
    {
      i = 0;
      localObject1 = null;
      break;
      localObject1 = this.a;
      localObject2 = "Authentication succeeded";
      ((b.a.a.a.h.b)localObject1).a(localObject2);
      localObject1 = b.a.a.a.a.b.e;
      paramh.a((b.a.a.a.a.b)localObject1);
      localObject1 = paramh.c();
      paramc.a(paramn, (b.a.a.a.a.c)localObject1, parame);
    }
  }
  
  public boolean b(n paramn, s params, b.a.a.a.b.c paramc, h paramh, b.a.a.a.n.e parame)
  {
    i = 1;
    try
    {
      localObject1 = this.a;
      bool1 = ((b.a.a.a.h.b)localObject1).a();
      if (bool1)
      {
        localObject1 = this.a;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = paramn.e();
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " requested authentication";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((b.a.a.a.h.b)localObject1).a(localObject3);
      }
      localObject3 = paramc.b(paramn, params, parame);
      bool1 = ((Map)localObject3).isEmpty();
      if (!bool1) {
        break label131;
      }
      localObject1 = this.a;
      localObject5 = "Response contains no authentication challenges";
      ((b.a.a.a.h.b)localObject1).a(localObject5);
      bool1 = false;
      localObject1 = null;
    }
    catch (o localo)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool1;
        Object localObject3;
        Object localObject4;
        label131:
        Object localObject6;
        int k;
        Object localObject5 = this.a;
        i = ((b.a.a.a.h.b)localObject5).c();
        if (i != 0)
        {
          localObject5 = this.a;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "Malformed challenge: ";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject2 = localo.getMessage();
          localObject2 = (String)localObject2;
          ((b.a.a.a.h.b)localObject5).c(localObject2);
        }
        paramh.a();
        int j = 0;
        Object localObject2 = null;
        continue;
        if (localObject4 == null)
        {
          localObject2 = this.a;
          localObject5 = "Auth scheme is null";
          ((b.a.a.a.h.b)localObject2).a(localObject5);
          j = 0;
          localObject2 = null;
          paramc.b(paramn, null, parame);
          paramh.a();
          localObject2 = b.a.a.a.a.b.d;
          paramh.a((b.a.a.a.a.b)localObject2);
          j = 0;
          localObject2 = null;
        }
        else if (localObject4 != null)
        {
          localObject2 = ((b.a.a.a.a.c)localObject4).a();
          localObject6 = Locale.ENGLISH;
          localObject2 = ((String)localObject2).toLowerCase((Locale)localObject6);
          localObject2 = ((Map)localObject3).get(localObject2);
          localObject2 = (b.a.a.a.e)localObject2;
          boolean bool2;
          if (localObject2 != null)
          {
            localObject3 = this.a;
            localObject6 = "Authorization challenge processed";
            ((b.a.a.a.h.b)localObject3).a(localObject6);
            ((b.a.a.a.a.c)localObject4).a((b.a.a.a.e)localObject2);
            bool2 = ((b.a.a.a.a.c)localObject4).d();
            if (bool2)
            {
              localObject2 = this.a;
              localObject5 = "Authentication failed";
              ((b.a.a.a.h.b)localObject2).a(localObject5);
              localObject2 = paramh.c();
              paramc.b(paramn, (b.a.a.a.a.c)localObject2, parame);
              paramh.a();
              localObject2 = b.a.a.a.a.b.d;
              paramh.a((b.a.a.a.a.b)localObject2);
              bool2 = false;
              localObject2 = null;
            }
            else
            {
              localObject2 = b.a.a.a.a.b.c;
              paramh.a((b.a.a.a.a.b)localObject2);
              bool2 = i;
            }
          }
          else
          {
            paramh.a();
            continue;
            bool2 = false;
            localObject2 = null;
          }
        }
      }
    }
    return bool1;
    localObject4 = paramh.c();
    localObject1 = f.1.a;
    localObject6 = paramh.b();
    k = ((b.a.a.a.a.b)localObject6).ordinal();
    j = localObject1[k];
    switch (j)
    {
    default: 
    case 4: 
    case 3: 
      for (;;)
      {
        localObject1 = paramc.a((Map)localObject3, paramn, params, parame);
        if (localObject1 == null) {
          break label678;
        }
        boolean bool3 = ((Queue)localObject1).isEmpty();
        if (bool3) {
          break label678;
        }
        localObject3 = this.a;
        bool3 = ((b.a.a.a.h.b)localObject3).a();
        if (bool3)
        {
          localObject3 = this.a;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject6 = "Selected authentication options: ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
          localObject4 = ((StringBuilder)localObject4).append(localObject1);
          localObject4 = ((StringBuilder)localObject4).toString();
          ((b.a.a.a.h.b)localObject3).a(localObject4);
        }
        localObject3 = b.a.a.a.a.b.b;
        paramh.a((b.a.a.a.a.b)localObject3);
        paramh.a((Queue)localObject1);
        j = i;
        break;
        j = 0;
        localObject1 = null;
        break;
        paramh.a();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */