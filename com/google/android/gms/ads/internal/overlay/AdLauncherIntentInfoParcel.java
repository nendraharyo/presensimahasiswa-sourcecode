package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class AdLauncherIntentInfoParcel
  implements SafeParcelable
{
  public static final zzb CREATOR;
  public final Intent intent;
  public final String intentAction;
  public final String mimeType;
  public final String packageName;
  public final String url;
  public final int versionCode;
  public final String zzDK;
  public final String zzDL;
  public final String zzDM;
  
  static
  {
    zzb localzzb = new com/google/android/gms/ads/internal/overlay/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  public AdLauncherIntentInfoParcel(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent)
  {
    this.versionCode = paramInt;
    this.intentAction = paramString1;
    this.url = paramString2;
    this.mimeType = paramString3;
    this.packageName = paramString4;
    this.zzDK = paramString5;
    this.zzDL = paramString6;
    this.zzDM = paramString7;
    this.intent = paramIntent;
  }
  
  public AdLauncherIntentInfoParcel(Intent paramIntent)
  {
    this(2, null, null, null, null, null, null, null, paramIntent);
  }
  
  public AdLauncherIntentInfoParcel(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(2, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\AdLauncherIntentInfoParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */