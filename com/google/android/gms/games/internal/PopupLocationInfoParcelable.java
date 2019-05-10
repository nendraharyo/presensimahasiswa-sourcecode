package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PopupLocationInfoParcelable
  implements SafeParcelable
{
  public static final PopupLocationInfoParcelableCreator CREATOR;
  private final int mVersionCode;
  private final Bundle zzaFH;
  private final IBinder zzaFI;
  
  static
  {
    PopupLocationInfoParcelableCreator localPopupLocationInfoParcelableCreator = new com/google/android/gms/games/internal/PopupLocationInfoParcelableCreator;
    localPopupLocationInfoParcelableCreator.<init>();
    CREATOR = localPopupLocationInfoParcelableCreator;
  }
  
  PopupLocationInfoParcelable(int paramInt, Bundle paramBundle, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzaFH = paramBundle;
    this.zzaFI = paramIBinder;
  }
  
  public PopupLocationInfoParcelable(PopupManager.PopupLocationInfo paramPopupLocationInfo)
  {
    this.mVersionCode = 1;
    Object localObject = paramPopupLocationInfo.zzxg();
    this.zzaFH = ((Bundle)localObject);
    localObject = paramPopupLocationInfo.zzaFL;
    this.zzaFI = ((IBinder)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public IBinder getWindowToken()
  {
    return this.zzaFI;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PopupLocationInfoParcelableCreator.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzxg()
  {
    return this.zzaFH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\PopupLocationInfoParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */