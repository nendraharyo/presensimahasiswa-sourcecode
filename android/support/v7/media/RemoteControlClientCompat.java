package android.support.v7.media;

import android.content.Context;
import android.os.Build.VERSION;

abstract class RemoteControlClientCompat
{
  protected final Context mContext;
  protected final Object mRcc;
  protected RemoteControlClientCompat.VolumeCallback mVolumeCallback;
  
  protected RemoteControlClientCompat(Context paramContext, Object paramObject)
  {
    this.mContext = paramContext;
    this.mRcc = paramObject;
  }
  
  public static RemoteControlClientCompat obtain(Context paramContext, Object paramObject)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v7/media/RemoteControlClientCompat$JellybeanImpl;
      ((RemoteControlClientCompat.JellybeanImpl)localObject).<init>(paramContext, paramObject);
    }
    for (;;)
    {
      return (RemoteControlClientCompat)localObject;
      localObject = new android/support/v7/media/RemoteControlClientCompat$LegacyImpl;
      ((RemoteControlClientCompat.LegacyImpl)localObject).<init>(paramContext, paramObject);
    }
  }
  
  public Object getRemoteControlClient()
  {
    return this.mRcc;
  }
  
  public void setPlaybackInfo(RemoteControlClientCompat.PlaybackInfo paramPlaybackInfo) {}
  
  public void setVolumeCallback(RemoteControlClientCompat.VolumeCallback paramVolumeCallback)
  {
    this.mVolumeCallback = paramVolumeCallback;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RemoteControlClientCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */