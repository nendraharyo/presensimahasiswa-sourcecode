package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class ThinAdSizeParcel
  extends AdSizeParcel
{
  public ThinAdSizeParcel(AdSizeParcel paramAdSizeParcel)
  {
    super(i, str, j, k, bool1, m, n, arrayOfAdSizeParcel, bool2, bool3, bool4);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = this.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = this.zzuh;
    zzb.zza(paramParcel, 2, str, false);
    j = this.height;
    zzb.zzc(paramParcel, 3, j);
    j = this.width;
    zzb.zzc(paramParcel, 6, j);
    zzb.zzI(paramParcel, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\ThinAdSizeParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */