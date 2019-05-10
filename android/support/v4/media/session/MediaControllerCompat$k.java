package android.support.v4.media.session;

import android.os.RemoteException;
import android.util.Log;

class MediaControllerCompat$k
  extends MediaControllerCompat.g
{
  private b a;
  
  public MediaControllerCompat$k(b paramb)
  {
    this.a = paramb;
  }
  
  public void a()
  {
    try
    {
      b localb = this.a;
      localb.r();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "MediaControllerCompat";
        String str2 = "Dead object in play.";
        Log.e(str1, str2, localRemoteException);
      }
    }
  }
  
  public void b()
  {
    try
    {
      b localb = this.a;
      localb.s();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "MediaControllerCompat";
        String str2 = "Dead object in pause.";
        Log.e(str1, str2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */