package b.a.a.a.b.c;

import b.a.a.a.e.i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b
  extends b.a.a.a.k.a
  implements a, b.a.a.a.q, Cloneable
{
  private final AtomicBoolean aborted;
  private final AtomicReference cancellableRef;
  
  protected b()
  {
    Object localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.aborted = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>(null);
    this.cancellableRef = ((AtomicReference)localObject);
  }
  
  public void abort()
  {
    Object localObject = this.aborted;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject).compareAndSet(false, bool1);
    if (bool2)
    {
      localObject = (b.a.a.a.c.a)this.cancellableRef.getAndSet(null);
      if (localObject != null) {
        ((b.a.a.a.c.a)localObject).a();
      }
    }
  }
  
  public Object clone()
  {
    b localb = (b)super.clone();
    Object localObject = (b.a.a.a.k.q)b.a.a.a.b.f.a.a(this.headergroup);
    localb.headergroup = ((b.a.a.a.k.q)localObject);
    localObject = (b.a.a.a.l.e)b.a.a.a.b.f.a.a(this.params);
    localb.params = ((b.a.a.a.l.e)localObject);
    return localb;
  }
  
  public void completed()
  {
    this.cancellableRef.set(null);
  }
  
  public boolean isAborted()
  {
    return this.aborted.get();
  }
  
  public void reset()
  {
    b.a.a.a.c.a locala = (b.a.a.a.c.a)this.cancellableRef.getAndSet(null);
    if (locala != null) {
      locala.a();
    }
    this.aborted.set(false);
  }
  
  public void setCancellable(b.a.a.a.c.a parama)
  {
    Object localObject = this.aborted;
    boolean bool = ((AtomicBoolean)localObject).get();
    if (!bool)
    {
      localObject = this.cancellableRef;
      ((AtomicReference)localObject).set(parama);
    }
  }
  
  public void setConnectionRequest(b.a.a.a.e.e parame)
  {
    b.1 local1 = new b/a/a/a/b/c/b$1;
    local1.<init>(this, parame);
    setCancellable(local1);
  }
  
  public void setReleaseTrigger(i parami)
  {
    b.2 local2 = new b/a/a/a/b/c/b$2;
    local2.<init>(this, parami);
    setCancellable(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\c\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */