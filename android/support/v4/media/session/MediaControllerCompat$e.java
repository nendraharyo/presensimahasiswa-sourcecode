package android.support.v4.media.session;

import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;

class MediaControllerCompat$e
  implements MediaControllerCompat.b
{
  private b a;
  private MediaControllerCompat.g b;
  
  public MediaControllerCompat$e(MediaSessionCompat.Token paramToken)
  {
    b localb = b.a.a((IBinder)paramToken.a());
    this.a = localb;
  }
  
  public MediaControllerCompat.g a()
  {
    Object localObject = this.b;
    if (localObject == null)
    {
      localObject = new android/support/v4/media/session/MediaControllerCompat$k;
      b localb = this.a;
      ((MediaControllerCompat.k)localObject).<init>(localb);
      this.b = ((MediaControllerCompat.g)localObject);
    }
    return this.b;
  }
  
  public void a(MediaControllerCompat.a parama)
  {
    Object localObject1;
    if (parama == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("callback may not be null.");
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject2 = this.a;
      localObject1 = MediaControllerCompat.a.access$000(parama);
      localObject1 = (a)localObject1;
      ((b)localObject2).b((a)localObject1);
      localObject1 = this.a;
      localObject1 = ((b)localObject1).asBinder();
      localObject2 = null;
      ((IBinder)localObject1).unlinkToDeath(parama, 0);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "MediaControllerCompat";
        String str = "Dead object in unregisterCallback.";
        Log.e((String)localObject2, str, localRemoteException);
      }
    }
  }
  
  public void a(MediaControllerCompat.a parama, Handler paramHandler)
  {
    Object localObject1;
    if (parama == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("callback may not be null.");
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = this.a;
      localObject1 = ((b)localObject1).asBinder();
      localObject2 = null;
      ((IBinder)localObject1).linkToDeath(parama, 0);
      localObject2 = this.a;
      localObject1 = MediaControllerCompat.a.access$000(parama);
      localObject1 = (a)localObject1;
      ((b)localObject2).a((a)localObject1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "MediaControllerCompat";
        String str = "Dead object in registerCallback.";
        Log.e((String)localObject2, str, localRemoteException);
        parama.onSessionDestroyed();
      }
    }
  }
  
  public PlaybackStateCompat b()
  {
    try
    {
      localObject1 = this.a;
      localObject1 = ((b)localObject1).h();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "MediaControllerCompat";
        String str2 = "Dead object in getPlaybackState.";
        Log.e(str1, str2, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (PlaybackStateCompat)localObject1;
  }
  
  public MediaMetadataCompat c()
  {
    try
    {
      localObject1 = this.a;
      localObject1 = ((b)localObject1).g();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "MediaControllerCompat";
        String str2 = "Dead object in getMetadata.";
        Log.e(str1, str2, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (MediaMetadataCompat)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */