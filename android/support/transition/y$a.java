package android.support.transition;

class y$a
  extends v
{
  y a;
  
  y$a(y paramy)
  {
    this.a = paramy;
  }
  
  public void a(u paramu)
  {
    y.b(this.a);
    y localy = this.a;
    int i = y.c(localy);
    if (i == 0)
    {
      y.a(this.a, false);
      localy = this.a;
      localy.k();
    }
    paramu.b(this);
  }
  
  public void d(u paramu)
  {
    y localy = this.a;
    boolean bool1 = y.a(localy);
    if (!bool1)
    {
      this.a.j();
      localy = this.a;
      boolean bool2 = true;
      y.a(localy, bool2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\y$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */