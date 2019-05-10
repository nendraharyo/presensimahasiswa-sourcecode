package android.arch.lifecycle;

import android.arch.a.a.a;
import android.arch.a.b.b;
import android.arch.a.b.b.d;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData
{
  private static final Object b;
  private final Object a;
  private b c;
  private int d;
  private volatile Object e;
  private volatile Object f;
  private int g;
  private boolean h;
  private boolean i;
  private final Runnable j;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
  }
  
  public LiveData()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.a = localObject;
    localObject = new android/arch/a/b/b;
    ((b)localObject).<init>();
    this.c = ((b)localObject);
    this.d = 0;
    localObject = b;
    this.e = localObject;
    localObject = b;
    this.f = localObject;
    this.g = -1;
    localObject = new android/arch/lifecycle/LiveData$1;
    ((LiveData.1)localObject).<init>(this);
    this.j = ((Runnable)localObject);
  }
  
  private void a(LiveData.a parama)
  {
    boolean bool = parama.d;
    if (!bool) {}
    for (;;)
    {
      return;
      bool = parama.a();
      k localk;
      if (!bool)
      {
        bool = false;
        localk = null;
        parama.a(false);
      }
      else
      {
        int k = parama.e;
        int m = this.g;
        if (k < m)
        {
          k = this.g;
          parama.e = k;
          localk = parama.c;
          Object localObject = this.e;
          localk.a(localObject);
        }
      }
    }
  }
  
  private static void a(String paramString)
  {
    Object localObject1 = a.a();
    boolean bool = ((a)localObject1).b();
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Cannot invoke " + paramString + " on a background" + " thread";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  private void b(LiveData.a parama)
  {
    boolean bool1 = true;
    boolean bool2 = this.h;
    if (bool2)
    {
      this.i = bool1;
      return;
    }
    this.h = bool1;
    label22:
    this.i = false;
    if (parama != null)
    {
      a(parama);
      parama = null;
    }
    for (;;)
    {
      bool2 = this.i;
      if (bool2) {
        break label22;
      }
      this.h = false;
      break;
      Object localObject = this.c;
      b.d locald = ((b)localObject).c();
      do
      {
        bool2 = locald.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (LiveData.a)((Map.Entry)locald.next()).getValue();
        a((LiveData.a)localObject);
        bool2 = this.i;
      } while (!bool2);
    }
  }
  
  public Object a()
  {
    Object localObject1 = this.e;
    Object localObject2 = b;
    if (localObject1 != localObject2) {}
    for (;;)
    {
      return localObject1;
      localObject1 = null;
    }
  }
  
  public void a(e parame, k paramk)
  {
    Object localObject1 = parame.getLifecycle().a();
    Object localObject2 = c.b.a;
    if (localObject1 == localObject2) {}
    for (;;)
    {
      return;
      localObject2 = new android/arch/lifecycle/LiveData$LifecycleBoundObserver;
      ((LiveData.LifecycleBoundObserver)localObject2).<init>(this, parame, paramk);
      localObject1 = (LiveData.a)this.c.a(paramk, localObject2);
      if (localObject1 != null)
      {
        boolean bool = ((LiveData.a)localObject1).a(parame);
        if (!bool)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>("Cannot add the same observer with different lifecycles");
          throw ((Throwable)localObject1);
        }
      }
      if (localObject1 == null)
      {
        localObject1 = parame.getLifecycle();
        ((c)localObject1).a((d)localObject2);
      }
    }
  }
  
  public void a(k paramk)
  {
    a("removeObserver");
    LiveData.a locala = (LiveData.a)this.c.b(paramk);
    if (locala == null) {}
    for (;;)
    {
      return;
      locala.b();
      locala.a(false);
    }
  }
  
  protected void a(Object paramObject)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        Object localObject2 = this.f;
        Object localObject4 = b;
        int k;
        if (localObject2 == localObject4)
        {
          k = 1;
          this.f = paramObject;
          if (k != 0) {}
        }
        else
        {
          k = 0;
          localObject2 = null;
        }
      }
      a locala = a.a();
      ??? = this.j;
      locala.b((Runnable)???);
    }
  }
  
  protected void b() {}
  
  protected void b(Object paramObject)
  {
    a("setValue");
    int k = this.g + 1;
    this.g = k;
    this.e = paramObject;
    b(null);
  }
  
  protected void c() {}
  
  public boolean d()
  {
    int k = this.d;
    if (k > 0) {}
    int m;
    for (k = 1;; m = 0) {
      return k;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\LiveData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */