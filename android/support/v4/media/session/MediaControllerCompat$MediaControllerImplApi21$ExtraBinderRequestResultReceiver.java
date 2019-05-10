package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.app.g;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
  extends ResultReceiver
{
  private WeakReference a;
  
  public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21, Handler paramHandler)
  {
    super(paramHandler);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramMediaControllerImplApi21);
    this.a = localWeakReference;
  }
  
  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)this.a.get();
    if ((localMediaControllerImplApi21 == null) || (paramBundle == null)) {}
    for (;;)
    {
      return;
      b localb = b.a.a(g.a(paramBundle, "android.support.v4.media.session.EXTRA_BINDER"));
      MediaControllerCompat.MediaControllerImplApi21.a(localMediaControllerImplApi21, localb);
      MediaControllerCompat.MediaControllerImplApi21.a(localMediaControllerImplApi21);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */