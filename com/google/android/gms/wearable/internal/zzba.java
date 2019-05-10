package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzba
  implements Parcelable.Creator
{
  static void zza(MessageEventParcelable paramMessageEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramMessageEventParcelable.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramMessageEventParcelable.getRequestId();
    zzb.zzc(paramParcel, 2, j);
    Object localObject = paramMessageEventParcelable.getPath();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramMessageEventParcelable.getData();
    zzb.zza(paramParcel, 4, (byte[])localObject, false);
    localObject = paramMessageEventParcelable.getSourceNodeId();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public MessageEventParcelable zziA(Parcel paramParcel)
  {
    int i = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    byte[] arrayOfByte = null;
    String str2 = null;
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
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        arrayOfByte = zza.zzs(paramParcel, m);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/wearable/internal/MessageEventParcelable;
    ((MessageEventParcelable)localObject).<init>(k, i, str2, arrayOfByte, str1);
    return (MessageEventParcelable)localObject;
  }
  
  public MessageEventParcelable[] zzme(int paramInt)
  {
    return new MessageEventParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */