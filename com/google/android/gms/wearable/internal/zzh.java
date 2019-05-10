package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(AncsNotificationParcelable paramAncsNotificationParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAncsNotificationParcelable.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramAncsNotificationParcelable.getId();
    zzb.zzc(paramParcel, 2, j);
    String str = paramAncsNotificationParcelable.zzwK();
    zzb.zza(paramParcel, 3, str, false);
    str = paramAncsNotificationParcelable.zzIB();
    zzb.zza(paramParcel, 4, str, false);
    str = paramAncsNotificationParcelable.zzIC();
    zzb.zza(paramParcel, 5, str, false);
    str = paramAncsNotificationParcelable.getTitle();
    zzb.zza(paramParcel, 6, str, false);
    str = paramAncsNotificationParcelable.zzwc();
    zzb.zza(paramParcel, 7, str, false);
    str = paramAncsNotificationParcelable.getDisplayName();
    zzb.zza(paramParcel, 8, str, false);
    j = paramAncsNotificationParcelable.zzID();
    zzb.zza(paramParcel, 9, j);
    byte b = paramAncsNotificationParcelable.zzIE();
    zzb.zza(paramParcel, 10, b);
    b = paramAncsNotificationParcelable.zzIF();
    zzb.zza(paramParcel, 11, b);
    b = paramAncsNotificationParcelable.zzIG();
    zzb.zza(paramParcel, 12, b);
    str = paramAncsNotificationParcelable.getPackageName();
    zzb.zza(paramParcel, 13, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AncsNotificationParcelable zzid(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    int k = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    String str7 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        k = zza.zzg(paramParcel, m);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 6: 
        str4 = zza.zzp(paramParcel, m);
        break;
      case 7: 
        str5 = zza.zzp(paramParcel, m);
        break;
      case 8: 
        str6 = zza.zzp(paramParcel, m);
        break;
      case 9: 
        b1 = zza.zze(paramParcel, m);
        break;
      case 10: 
        b2 = zza.zze(paramParcel, m);
        break;
      case 11: 
        b3 = zza.zze(paramParcel, m);
        break;
      case 12: 
        b4 = zza.zze(paramParcel, m);
        break;
      case 13: 
        str7 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/wearable/internal/AncsNotificationParcelable;
    ((AncsNotificationParcelable)localObject).<init>(j, k, str1, str2, str3, str4, str5, str6, b1, b2, b3, b4, str7);
    return (AncsNotificationParcelable)localObject;
  }
  
  public AncsNotificationParcelable[] zzlE(int paramInt)
  {
    return new AncsNotificationParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */