package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class VideoConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final int zzaLr;
  private final int zzaLs;
  private final String zzaLt;
  private final String zzaLu;
  
  static
  {
    VideoConfigurationCreator localVideoConfigurationCreator = new com/google/android/gms/games/video/VideoConfigurationCreator;
    localVideoConfigurationCreator.<init>();
    CREATOR = localVideoConfigurationCreator;
  }
  
  public VideoConfiguration(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt1;
    zzx.zzac(zzgZ(paramInt2));
    boolean bool = zzha(paramInt3);
    zzx.zzac(bool);
    this.zzaLr = paramInt2;
    this.zzaLs = paramInt3;
    if (paramInt3 == i)
    {
      this.zzaLu = paramString2;
      this.zzaLt = paramString1;
      return;
    }
    if (paramString2 == null)
    {
      int j = i;
      label68:
      String str1 = "Stream key should be null when not streaming";
      zzx.zzb(j, str1);
      if (paramString1 != null) {
        break label117;
      }
    }
    for (;;)
    {
      String str2 = "Stream url should be null when not streaming";
      zzx.zzb(i, str2);
      this.zzaLu = null;
      this.zzaLt = null;
      break;
      int k = 0;
      str2 = null;
      break label68;
      label117:
      i = 0;
    }
  }
  
  public static boolean zzgZ(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean zzha(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getStreamUrl()
  {
    return this.zzaLt;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    VideoConfigurationCreator.zza(this, paramParcel, paramInt);
  }
  
  public int zzyd()
  {
    return this.zzaLr;
  }
  
  public int zzye()
  {
    return this.zzaLs;
  }
  
  public String zzyf()
  {
    return this.zzaLu;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\video\VideoConfiguration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */