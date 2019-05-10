package android.support.v4.media;

import android.os.Build.VERSION;

public abstract class d
{
  public static final int VOLUME_CONTROL_ABSOLUTE = 2;
  public static final int VOLUME_CONTROL_FIXED = 0;
  public static final int VOLUME_CONTROL_RELATIVE = 1;
  private d.a mCallback;
  private final int mControlType;
  private int mCurrentVolume;
  private final int mMaxVolume;
  private Object mVolumeProviderObj;
  
  public d(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mControlType = paramInt1;
    this.mMaxVolume = paramInt2;
    this.mCurrentVolume = paramInt3;
  }
  
  public final int getCurrentVolume()
  {
    return this.mCurrentVolume;
  }
  
  public final int getMaxVolume()
  {
    return this.mMaxVolume;
  }
  
  public final int getVolumeControl()
  {
    return this.mControlType;
  }
  
  public Object getVolumeProvider()
  {
    Object localObject = this.mVolumeProviderObj;
    if (localObject == null)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j)
      {
        i = this.mControlType;
        j = this.mMaxVolume;
        int k = this.mCurrentVolume;
        d.1 local1 = new android/support/v4/media/d$1;
        local1.<init>(this);
        localObject = e.a(i, j, k, local1);
        this.mVolumeProviderObj = localObject;
      }
    }
    return this.mVolumeProviderObj;
  }
  
  public void onAdjustVolume(int paramInt) {}
  
  public void onSetVolumeTo(int paramInt) {}
  
  public void setCallback(d.a parama)
  {
    this.mCallback = parama;
  }
  
  public final void setCurrentVolume(int paramInt)
  {
    this.mCurrentVolume = paramInt;
    Object localObject = getVolumeProvider();
    if (localObject != null)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j) {
        e.a(localObject, paramInt);
      }
    }
    localObject = this.mCallback;
    if (localObject != null)
    {
      localObject = this.mCallback;
      ((d.a)localObject).a(this);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */