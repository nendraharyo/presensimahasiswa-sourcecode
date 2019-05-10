package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class AppMetadata
  implements SafeParcelable
{
  public static final zzb CREATOR;
  public final String packageName;
  public final int versionCode;
  public final String zzaMV;
  public final String zzaVt;
  public final String zzaVu;
  public final long zzaVv;
  public final long zzaVw;
  public final String zzaVx;
  public final boolean zzaVy;
  public final boolean zzaVz;
  
  static
  {
    zzb localzzb = new com/google/android/gms/measurement/internal/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  AppMetadata(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.versionCode = paramInt;
    this.packageName = paramString1;
    this.zzaVt = paramString2;
    this.zzaMV = paramString3;
    this.zzaVu = paramString4;
    this.zzaVv = paramLong1;
    this.zzaVw = paramLong2;
    this.zzaVx = paramString5;
    int i = 3;
    if (paramInt >= i) {}
    for (this.zzaVy = paramBoolean1;; this.zzaVy = i)
    {
      this.zzaVz = paramBoolean2;
      return;
      i = 1;
    }
  }
  
  AppMetadata(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, boolean paramBoolean1, boolean paramBoolean2)
  {
    zzx.zzcM(paramString1);
    this.versionCode = 4;
    this.packageName = paramString1;
    boolean bool = TextUtils.isEmpty(paramString2);
    if (bool) {
      paramString2 = null;
    }
    this.zzaVt = paramString2;
    this.zzaMV = paramString3;
    this.zzaVu = paramString4;
    this.zzaVv = paramLong1;
    this.zzaVw = paramLong2;
    this.zzaVx = paramString5;
    this.zzaVy = paramBoolean1;
    this.zzaVz = paramBoolean2;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\AppMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */