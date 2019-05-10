package android.arch.lifecycle;

class FullLifecycleObserverAdapter
  implements GenericLifecycleObserver
{
  private final FullLifecycleObserver a;
  
  FullLifecycleObserverAdapter(FullLifecycleObserver paramFullLifecycleObserver)
  {
    this.a = paramFullLifecycleObserver;
  }
  
  public void a(e parame, c.a parama)
  {
    Object localObject = FullLifecycleObserverAdapter.1.a;
    int i = parama.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      for (;;)
      {
        return;
        localObject = this.a;
        ((FullLifecycleObserver)localObject).a(parame);
        continue;
        localObject = this.a;
        ((FullLifecycleObserver)localObject).b(parame);
        continue;
        localObject = this.a;
        ((FullLifecycleObserver)localObject).c(parame);
        continue;
        localObject = this.a;
        ((FullLifecycleObserver)localObject).d(parame);
        continue;
        localObject = this.a;
        ((FullLifecycleObserver)localObject).e(parame);
        continue;
        localObject = this.a;
        ((FullLifecycleObserver)localObject).f(parame);
      }
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("ON_ANY must not been send by anybody");
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\FullLifecycleObserverAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */