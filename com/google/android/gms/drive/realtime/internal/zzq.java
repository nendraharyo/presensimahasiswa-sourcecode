package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq
  implements Parcelable.Creator
{
  static void zza(ParcelableCollaborator paramParcelableCollaborator, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramParcelableCollaborator.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    boolean bool = paramParcelableCollaborator.zzauI;
    zzb.zza(paramParcel, 2, bool);
    bool = paramParcelableCollaborator.zzaeW;
    zzb.zza(paramParcel, 3, bool);
    String str = paramParcelableCollaborator.zzLq;
    zzb.zza(paramParcel, 4, str, false);
    str = paramParcelableCollaborator.zzrG;
    zzb.zza(paramParcel, 5, str, false);
    str = paramParcelableCollaborator.zzWQ;
    zzb.zza(paramParcel, 6, str, false);
    str = paramParcelableCollaborator.zzauJ;
    zzb.zza(paramParcel, 7, str, false);
    str = paramParcelableCollaborator.zzauK;
    zzb.zza(paramParcel, 8, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ParcelableCollaborator zzcA(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    boolean bool2 = false;
    StringBuilder localStringBuilder = null;
    int j = 0;
    zza.zza localzza = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/drive/realtime/internal/ParcelableCollaborator;
    ((ParcelableCollaborator)localObject).<init>(j, bool2, bool1, str5, str4, str3, str2, str1);
    return (ParcelableCollaborator)localObject;
  }
  
  public ParcelableCollaborator[] zzew(int paramInt)
  {
    return new ParcelableCollaborator[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */