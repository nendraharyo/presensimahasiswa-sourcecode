package android.support.v4.app;

class n$2$1
  implements Runnable
{
  n$2$1(n.2 param2) {}
  
  public void run()
  {
    Object localObject = this.a.b.getAnimatingAway();
    if (localObject != null)
    {
      this.a.b.setAnimatingAway(null);
      localObject = this.a.c;
      Fragment localFragment1 = this.a.b;
      Fragment localFragment2 = this.a.b;
      int i = localFragment2.getStateAfterAnimating();
      ((n)localObject).a(localFragment1, i, 0, 0, false);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$2$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */