package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzag
  implements Parcelable.Creator
{
  static void zza(FileUploadPreferencesImpl paramFileUploadPreferencesImpl, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFileUploadPreferencesImpl.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramFileUploadPreferencesImpl.zzarG;
    zzb.zzc(paramParcel, 2, j);
    j = paramFileUploadPreferencesImpl.zzarH;
    zzb.zzc(paramParcel, 3, j);
    boolean bool = paramFileUploadPreferencesImpl.zzarI;
    zzb.zza(paramParcel, 4, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public FileUploadPreferencesImpl zzbq(Parcel paramParcel)
  {
    boolean bool = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject = null;
    int k = 0;
    int m = 0;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        j = zza.zzg(paramParcel, n);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    FileUploadPreferencesImpl localFileUploadPreferencesImpl = new com/google/android/gms/drive/internal/FileUploadPreferencesImpl;
    localFileUploadPreferencesImpl.<init>(m, k, j, bool);
    return localFileUploadPreferencesImpl;
  }
  
  public FileUploadPreferencesImpl[] zzdl(int paramInt)
  {
    return new FileUploadPreferencesImpl[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */