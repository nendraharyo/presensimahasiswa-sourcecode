package android.arch.lifecycle;

import android.arch.a.b.a;
import android.arch.a.b.b.d;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class f
  extends c
{
  private a a;
  private c.b b;
  private final WeakReference c;
  private int d;
  private boolean e;
  private boolean f;
  private ArrayList g;
  
  public f(e parame)
  {
    Object localObject = new android/arch/a/b/a;
    ((a)localObject).<init>();
    this.a = ((a)localObject);
    this.d = 0;
    this.e = false;
    this.f = false;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.g = ((ArrayList)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(parame);
    this.c = ((WeakReference)localObject);
    localObject = c.b.b;
    this.b = ((c.b)localObject);
  }
  
  static c.b a(c.b paramb1, c.b paramb2)
  {
    if (paramb2 != null)
    {
      int i = paramb2.compareTo(paramb1);
      if (i >= 0) {}
    }
    for (;;)
    {
      return paramb2;
      paramb2 = paramb1;
    }
  }
  
  private void a(e parame)
  {
    Object localObject1 = this.a;
    b.d locald = ((a)localObject1).c();
    boolean bool1 = locald.hasNext();
    if (bool1)
    {
      bool1 = this.f;
      if (!bool1)
      {
        localObject1 = (Map.Entry)locald.next();
        f.a locala = (f.a)((Map.Entry)localObject1).getValue();
        for (;;)
        {
          Object localObject2 = locala.a;
          Object localObject3 = this.b;
          int i = ((c.b)localObject2).compareTo((Enum)localObject3);
          if (i >= 0) {
            break;
          }
          boolean bool2 = this.f;
          if (bool2) {
            break;
          }
          localObject2 = this.a;
          localObject3 = ((Map.Entry)localObject1).getKey();
          bool2 = ((a)localObject2).c(localObject3);
          if (!bool2) {
            break;
          }
          localObject2 = locala.a;
          c((c.b)localObject2);
          localObject2 = e(locala.a);
          locala.a(parame, (c.a)localObject2);
          c();
        }
      }
    }
  }
  
  static c.b b(c.a parama)
  {
    Object localObject1 = f.1.a;
    int i = parama.ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unexpected event value " + parama;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
    case 2: 
      localObject1 = c.b.c;
    }
    for (;;)
    {
      return (c.b)localObject1;
      localObject1 = c.b.d;
      continue;
      localObject1 = c.b.e;
      continue;
      localObject1 = c.b.a;
    }
  }
  
  private void b(c.b paramb)
  {
    boolean bool1 = true;
    c.b localb = this.b;
    if (localb == paramb) {}
    for (;;)
    {
      return;
      this.b = paramb;
      boolean bool2 = this.e;
      if (!bool2)
      {
        i = this.d;
        if (i == 0) {}
      }
      else
      {
        this.f = bool1;
        continue;
      }
      this.e = bool1;
      d();
      int i = 0;
      localb = null;
      this.e = false;
    }
  }
  
  private void b(e parame)
  {
    Object localObject1 = this.a;
    Iterator localIterator = ((a)localObject1).b();
    boolean bool1 = localIterator.hasNext();
    if (bool1)
    {
      bool1 = this.f;
      if (!bool1)
      {
        localObject1 = (Map.Entry)localIterator.next();
        f.a locala = (f.a)((Map.Entry)localObject1).getValue();
        for (;;)
        {
          Object localObject2 = locala.a;
          Object localObject3 = this.b;
          int i = ((c.b)localObject2).compareTo((Enum)localObject3);
          if (i <= 0) {
            break;
          }
          boolean bool2 = this.f;
          if (bool2) {
            break;
          }
          localObject2 = this.a;
          localObject3 = ((Map.Entry)localObject1).getKey();
          bool2 = ((a)localObject2).c(localObject3);
          if (!bool2) {
            break;
          }
          localObject2 = d(locala.a);
          localObject3 = b((c.a)localObject2);
          c((c.b)localObject3);
          locala.a(parame, (c.a)localObject2);
          c();
        }
      }
    }
  }
  
  private boolean b()
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject = this.a;
    int j = ((a)localObject).a();
    if (j == 0) {
      return i;
    }
    c.b localb = ((f.a)this.a.d().getValue()).a;
    localObject = ((f.a)this.a.e().getValue()).a;
    float f2;
    if (localb == localObject)
    {
      localb = this.b;
      if (localb == localObject)
      {
        j = i;
        f2 = f1;
      }
    }
    for (;;)
    {
      i = j;
      f1 = f2;
      break;
      j = 0;
      f2 = 0.0F;
      localObject = null;
    }
  }
  
  private c.b c(d paramd)
  {
    int i = 0;
    ArrayList localArrayList = null;
    Object localObject1 = this.a.d(paramd);
    Object localObject2;
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = ((f.a)((Map.Entry)localObject1).getValue()).a;
      localObject2 = localObject1;
      localObject1 = this.g;
      bool = ((ArrayList)localObject1).isEmpty();
      if (bool) {
        break label106;
      }
      localObject1 = this.g;
      localArrayList = this.g;
      i = localArrayList.size() + -1;
    }
    for (localObject1 = (c.b)((ArrayList)localObject1).get(i);; localObject1 = null)
    {
      return a(a(this.b, (c.b)localObject2), (c.b)localObject1);
      localObject2 = null;
      break;
      label106:
      bool = false;
    }
  }
  
  private void c()
  {
    ArrayList localArrayList = this.g;
    int i = this.g.size() + -1;
    localArrayList.remove(i);
  }
  
  private void c(c.b paramb)
  {
    this.g.add(paramb);
  }
  
  private static c.a d(c.b paramb)
  {
    Object localObject1 = f.1.b;
    int i = paramb.ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unexpected state value " + paramb;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 2: 
      localObject1 = c.a.ON_DESTROY;
    case 3: 
    case 4: 
      for (;;)
      {
        return (c.a)localObject1;
        localObject1 = c.a.ON_STOP;
        continue;
        localObject1 = c.a.ON_PAUSE;
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  private void d()
  {
    Object localObject1 = (e)this.c.get();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "LifecycleRegistry";
      localObject2 = "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.";
      Log.w((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      for (;;)
      {
        boolean bool1 = b();
        if (bool1) {
          break;
        }
        this.f = false;
        c.b localb = this.b;
        localObject2 = ((f.a)this.a.d().getValue()).a;
        int i = localb.compareTo((Enum)localObject2);
        if (i < 0) {
          b((e)localObject1);
        }
        localObject2 = this.a.e();
        boolean bool2 = this.f;
        if ((!bool2) && (localObject2 != null))
        {
          localb = this.b;
          localObject2 = ((f.a)((Map.Entry)localObject2).getValue()).a;
          i = localb.compareTo((Enum)localObject2);
          if (i > 0) {
            a((e)localObject1);
          }
        }
      }
      this.f = false;
    }
  }
  
  private static c.a e(c.b paramb)
  {
    Object localObject1 = f.1.b;
    int i = paramb.ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unexpected state value " + paramb;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
    case 5: 
      localObject1 = c.a.ON_CREATE;
    case 2: 
    case 3: 
      for (;;)
      {
        return (c.a)localObject1;
        localObject1 = c.a.ON_START;
        continue;
        localObject1 = c.a.ON_RESUME;
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public c.b a()
  {
    return this.b;
  }
  
  public void a(c.a parama)
  {
    c.b localb = b(parama);
    b(localb);
  }
  
  public void a(c.b paramb)
  {
    b(paramb);
  }
  
  public void a(d paramd)
  {
    Object localObject1 = this.b;
    c.b localb1 = c.b.a;
    f.a locala;
    if (localObject1 == localb1)
    {
      localObject1 = c.b.a;
      locala = new android/arch/lifecycle/f$a;
      locala.<init>(paramd, (c.b)localObject1);
      localObject1 = (f.a)this.a.a(paramd, locala);
      if (localObject1 == null) {
        break label56;
      }
    }
    for (;;)
    {
      return;
      localObject1 = c.b.b;
      break;
      label56:
      localObject1 = (e)this.c.get();
      if (localObject1 != null)
      {
        int i = this.d;
        boolean bool1;
        if (i == 0)
        {
          bool1 = this.e;
          if (!bool1) {}
        }
        else
        {
          bool1 = true;
        }
        for (;;)
        {
          Object localObject2 = c(paramd);
          int j = this.d + 1;
          this.d = j;
          for (;;)
          {
            c.b localb2 = locala.a;
            int k = localb2.compareTo((Enum)localObject2);
            if (k >= 0) {
              break;
            }
            localObject2 = this.a;
            boolean bool2 = ((a)localObject2).c(paramd);
            if (!bool2) {
              break;
            }
            localObject2 = locala.a;
            c((c.b)localObject2);
            localObject2 = e(locala.a);
            locala.a((e)localObject1, (c.a)localObject2);
            c();
            localObject2 = c(paramd);
          }
          bool1 = false;
          localb1 = null;
        }
        if (!bool1) {
          d();
        }
        int m = this.d + -1;
        this.d = m;
      }
    }
  }
  
  public void b(d paramd)
  {
    this.a.b(paramd);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */