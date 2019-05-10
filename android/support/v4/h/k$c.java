package android.support.v4.h;

public class k$c
  extends k.b
{
  private final Object a;
  
  public k$c(int paramInt)
  {
    super(paramInt);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.a = localObject;
  }
  
  public Object acquire()
  {
    synchronized (this.a)
    {
      Object localObject2 = super.acquire();
      return localObject2;
    }
  }
  
  public boolean release(Object paramObject)
  {
    synchronized (this.a)
    {
      boolean bool = super.release(paramObject);
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\k$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */