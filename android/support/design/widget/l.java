package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class l
{
  private static l a;
  private final Object b;
  private final Handler c;
  private l.b d;
  private l.b e;
  
  private l()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.b = localObject;
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    l.1 local1 = new android/support/design/widget/l$1;
    local1.<init>(this);
    ((Handler)localObject).<init>(localLooper, local1);
    this.c = ((Handler)localObject);
  }
  
  static l a()
  {
    l locall = a;
    if (locall == null)
    {
      locall = new android/support/design/widget/l;
      locall.<init>();
      a = locall;
    }
    return a;
  }
  
  private boolean a(l.b paramb, int paramInt)
  {
    l.a locala = (l.a)paramb.a.get();
    boolean bool;
    if (locala != null)
    {
      Handler localHandler = this.c;
      localHandler.removeCallbacksAndMessages(paramb);
      locala.a(paramInt);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  private void b()
  {
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      this.d = ((l.b)localObject);
      this.e = null;
      localObject = (l.a)this.d.a.get();
      if (localObject == null) {
        break label49;
      }
      ((l.a)localObject).a();
    }
    for (;;)
    {
      return;
      label49:
      this.d = null;
    }
  }
  
  private void b(l.b paramb)
  {
    int i = paramb.b;
    int j = -2;
    if (i == j) {
      return;
    }
    i = 2750;
    j = paramb.b;
    if (j > 0) {
      i = paramb.b;
    }
    for (;;)
    {
      this.c.removeCallbacksAndMessages(paramb);
      Handler localHandler = this.c;
      Message localMessage = Message.obtain(this.c, 0, paramb);
      long l = i;
      localHandler.sendMessageDelayed(localMessage, l);
      break;
      j = paramb.b;
      int k = -1;
      if (j == k) {
        i = 1500;
      }
    }
  }
  
  private boolean f(l.a parama)
  {
    l.b localb = this.d;
    boolean bool;
    if (localb != null)
    {
      localb = this.d;
      bool = localb.a(parama);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb = null;
    }
  }
  
  private boolean g(l.a parama)
  {
    l.b localb = this.e;
    boolean bool;
    if (localb != null)
    {
      localb = this.e;
      bool = localb.a(parama);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb = null;
    }
  }
  
  public void a(l.a parama)
  {
    synchronized (this.b)
    {
      boolean bool = f(parama);
      if (bool)
      {
        bool = false;
        l.b localb = null;
        this.d = null;
        localb = this.e;
        if (localb != null) {
          b();
        }
      }
      return;
    }
  }
  
  public void a(l.a parama, int paramInt)
  {
    synchronized (this.b)
    {
      boolean bool = f(parama);
      if (bool)
      {
        localb = this.d;
        a(localb, paramInt);
      }
      do
      {
        return;
        bool = g(parama);
      } while (!bool);
      l.b localb = this.e;
      a(localb, paramInt);
    }
  }
  
  void a(l.b paramb)
  {
    synchronized (this.b)
    {
      l.b localb = this.d;
      if (localb != paramb)
      {
        localb = this.e;
        if (localb != paramb) {}
      }
      else
      {
        int i = 2;
        a(paramb, i);
      }
      return;
    }
  }
  
  public void b(l.a parama)
  {
    synchronized (this.b)
    {
      boolean bool = f(parama);
      if (bool)
      {
        l.b localb = this.d;
        b(localb);
      }
      return;
    }
  }
  
  public void c(l.a parama)
  {
    synchronized (this.b)
    {
      boolean bool1 = f(parama);
      if (bool1)
      {
        Object localObject2 = this.d;
        bool1 = ((l.b)localObject2).c;
        if (!bool1)
        {
          localObject2 = this.d;
          boolean bool2 = true;
          ((l.b)localObject2).c = bool2;
          localObject2 = this.c;
          l.b localb = this.d;
          ((Handler)localObject2).removeCallbacksAndMessages(localb);
        }
      }
      return;
    }
  }
  
  public void d(l.a parama)
  {
    synchronized (this.b)
    {
      boolean bool = f(parama);
      if (bool)
      {
        l.b localb = this.d;
        bool = localb.c;
        if (bool)
        {
          localb = this.d;
          localb.c = false;
          localb = this.d;
          b(localb);
        }
      }
      return;
    }
  }
  
  public boolean e(l.a parama)
  {
    synchronized (this.b)
    {
      boolean bool = f(parama);
      if (!bool)
      {
        bool = g(parama);
        if (!bool) {}
      }
      else
      {
        bool = true;
        return bool;
      }
      bool = false;
      Object localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */