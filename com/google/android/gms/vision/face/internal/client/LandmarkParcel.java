package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LandmarkParcel
  implements SafeParcelable
{
  public static final zze CREATOR;
  public final int type;
  public final int versionCode;
  public final float x;
  public final float y;
  
  static
  {
    zze localzze = new com/google/android/gms/vision/face/internal/client/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  public LandmarkParcel(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.x = paramFloat1;
    this.y = paramFloat2;
    this.type = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\LandmarkParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */