package android.arch.lifecycle;

public class o
{
  private final o.a a;
  private final p b;
  
  public o(p paramp, o.a parama)
  {
    this.a = parama;
    this.b = paramp;
  }
  
  public n a(Class paramClass)
  {
    Object localObject = paramClass.getCanonicalName();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Local and anonymous classes can not be ViewModels");
      throw ((Throwable)localObject);
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + (String)localObject;
    return a((String)localObject, paramClass);
  }
  
  public n a(String paramString, Class paramClass)
  {
    n localn = this.b.a(paramString);
    boolean bool = paramClass.isInstance(localn);
    if (bool) {}
    for (;;)
    {
      return localn;
      if (localn != null) {}
      localn = this.a.a(paramClass);
      p localp = this.b;
      localp.a(paramString, localn);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */