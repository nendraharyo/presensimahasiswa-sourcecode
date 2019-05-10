package android.arch.lifecycle;

class LiveData$LifecycleBoundObserver
  extends LiveData.a
  implements GenericLifecycleObserver
{
  final e a;
  
  LiveData$LifecycleBoundObserver(LiveData paramLiveData, e parame, k paramk)
  {
    super(paramLiveData, paramk);
    this.a = parame;
  }
  
  public void a(e parame, c.a parama)
  {
    Object localObject1 = this.a.getLifecycle().a();
    Object localObject2 = c.b.a;
    if (localObject1 == localObject2)
    {
      localObject1 = this.b;
      localObject2 = this.c;
      ((LiveData)localObject1).a((k)localObject2);
    }
    for (;;)
    {
      return;
      boolean bool = a();
      a(bool);
    }
  }
  
  boolean a()
  {
    c.b localb1 = this.a.getLifecycle().a();
    c.b localb2 = c.b.d;
    return localb1.a(localb2);
  }
  
  boolean a(e parame)
  {
    e locale = this.a;
    boolean bool;
    if (locale == parame) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locale = null;
    }
  }
  
  void b()
  {
    this.a.getLifecycle().b(this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\LiveData$LifecycleBoundObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */