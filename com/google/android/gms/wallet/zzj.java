package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(LineItem paramLineItem, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLineItem.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    String str = paramLineItem.description;
    zzb.zza(paramParcel, 2, str, false);
    str = paramLineItem.zzboL;
    zzb.zza(paramParcel, 3, str, false);
    str = paramLineItem.zzboM;
    zzb.zza(paramParcel, 4, str, false);
    str = paramLineItem.zzboh;
    zzb.zza(paramParcel, 5, str, false);
    j = paramLineItem.zzboN;
    zzb.zzc(paramParcel, 6, j);
    str = paramLineItem.zzboi;
    zzb.zza(paramParcel, 7, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LineItem zzhx(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    String str2 = null;
    String str3 = null;
    String str4 = null;
    Object localObject1 = null;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        str4 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 6: 
        i = zza.zzg(paramParcel, m);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/wallet/LineItem;
    ((LineItem)localObject2).<init>(k, (String)localObject1, str4, str3, str2, i, str1);
    return (LineItem)localObject2;
  }
  
  public LineItem[] zzkV(int paramInt)
  {
    return new LineItem[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */