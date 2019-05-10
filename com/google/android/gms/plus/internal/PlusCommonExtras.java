package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class PlusCommonExtras
  implements SafeParcelable
{
  public static final zzf CREATOR;
  private final int mVersionCode;
  private String zzbeo;
  private String zzbep;
  
  static
  {
    zzf localzzf = new com/google/android/gms/plus/internal/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  public PlusCommonExtras()
  {
    this.mVersionCode = 1;
    this.zzbeo = "";
    this.zzbep = "";
  }
  
  PlusCommonExtras(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzbeo = paramString1;
    this.zzbep = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof PlusCommonExtras;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (PlusCommonExtras)paramObject;
      int i = this.mVersionCode;
      int j = ((PlusCommonExtras)paramObject).mVersionCode;
      if (i == j)
      {
        String str1 = this.zzbeo;
        String str2 = ((PlusCommonExtras)paramObject).zzbeo;
        boolean bool3 = zzw.equal(str1, str2);
        if (bool3)
        {
          str1 = this.zzbep;
          str2 = ((PlusCommonExtras)paramObject).zzbep;
          bool3 = zzw.equal(str1, str2);
          if (bool3) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.mVersionCode);
    arrayOfObject[0] = localObject;
    localObject = this.zzbeo;
    arrayOfObject[1] = localObject;
    localObject = this.zzbep;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Integer.valueOf(this.mVersionCode);
    localzza = localzza.zzg("versionCode", localObject);
    localObject = this.zzbeo;
    localzza = localzza.zzg("Gpsrc", localObject);
    localObject = this.zzbep;
    return localzza.zzg("ClientCallingPackage", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public String zzFb()
  {
    return this.zzbeo;
  }
  
  public String zzFc()
  {
    return this.zzbep;
  }
  
  public void zzJ(Bundle paramBundle)
  {
    byte[] arrayOfByte = zzc.zza(this);
    paramBundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", arrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\PlusCommonExtras.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */