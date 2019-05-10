package android.arch.lifecycle;

public class CompositeGeneratedAdaptersObserver
  implements GenericLifecycleObserver
{
  private final b[] a;
  
  CompositeGeneratedAdaptersObserver(b[] paramArrayOfb)
  {
    this.a = paramArrayOfb;
  }
  
  public void a(e parame, c.a parama)
  {
    int i = 0;
    i locali = new android/arch/lifecycle/i;
    locali.<init>();
    b[] arrayOfb1 = this.a;
    int j = arrayOfb1.length;
    int k = 0;
    b[] arrayOfb2 = null;
    while (k < j)
    {
      b localb1 = arrayOfb1[k];
      localb1.a(parame, parama, false, locali);
      k += 1;
    }
    arrayOfb2 = this.a;
    int m = arrayOfb2.length;
    while (i < m)
    {
      b localb2 = arrayOfb2[i];
      boolean bool = true;
      localb2.a(parame, parama, bool, locali);
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\CompositeGeneratedAdaptersObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */