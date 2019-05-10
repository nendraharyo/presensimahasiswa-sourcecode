package android.arch.lifecycle;

class f$a
{
  c.b a;
  GenericLifecycleObserver b;
  
  f$a(d paramd, c.b paramb)
  {
    GenericLifecycleObserver localGenericLifecycleObserver = h.a(paramd);
    this.b = localGenericLifecycleObserver;
    this.a = paramb;
  }
  
  void a(e parame, c.a parama)
  {
    c.b localb1 = f.b(parama);
    c.b localb2 = f.a(this.a, localb1);
    this.a = localb2;
    this.b.a(parame, parama);
    this.a = localb1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */