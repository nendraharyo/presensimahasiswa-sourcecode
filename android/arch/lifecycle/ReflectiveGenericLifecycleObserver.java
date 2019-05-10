package android.arch.lifecycle;

class ReflectiveGenericLifecycleObserver
  implements GenericLifecycleObserver
{
  private final Object a;
  private final a.a b;
  
  ReflectiveGenericLifecycleObserver(Object paramObject)
  {
    this.a = paramObject;
    Object localObject = a.a;
    Class localClass = this.a.getClass();
    localObject = ((a)localObject).b(localClass);
    this.b = ((a.a)localObject);
  }
  
  public void a(e parame, c.a parama)
  {
    a.a locala = this.b;
    Object localObject = this.a;
    locala.a(parame, parama, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\ReflectiveGenericLifecycleObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */