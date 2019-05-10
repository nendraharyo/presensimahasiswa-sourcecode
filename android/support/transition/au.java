package android.support.transition;

import android.os.IBinder;

class au
  implements aw
{
  private final IBinder a;
  
  au(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof au;
    IBinder localIBinder1;
    if (bool)
    {
      paramObject = (au)paramObject;
      localIBinder1 = ((au)paramObject).a;
      IBinder localIBinder2 = this.a;
      bool = localIBinder1.equals(localIBinder2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIBinder1 = null;
    }
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\au.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */