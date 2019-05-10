package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzu
  implements Parcelable.Creator
{
  static void zza(Value paramValue, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramValue.getFormat();
    zzb.zzc(paramParcel, 1, j);
    j = paramValue.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramValue.isSet();
    zzb.zza(paramParcel, 2, bool);
    float f = paramValue.zzuv();
    zzb.zza(paramParcel, 3, f);
    Object localObject = paramValue.zzuA();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramValue.zzuB();
    zzb.zza(paramParcel, 5, (Bundle)localObject, false);
    localObject = paramValue.zzuC();
    zzb.zza(paramParcel, 6, (int[])localObject, false);
    localObject = paramValue.zzuD();
    zzb.zza(paramParcel, 7, (float[])localObject, false);
    localObject = paramValue.zzuE();
    zzb.zza(paramParcel, 8, (byte[])localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Value zzde(Parcel paramParcel)
  {
    boolean bool = false;
    byte[] arrayOfByte = null;
    int i = zza.zzau(paramParcel);
    float f = 0.0F;
    float[] arrayOfFloat = null;
    int[] arrayOfInt = null;
    Bundle localBundle = null;
    String str = null;
    int j = 0;
    StringBuilder localStringBuilder = null;
    int k = 0;
    zza.zza localzza = null;
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
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 3: 
        f = zza.zzl(paramParcel, m);
        break;
      case 4: 
        str = zza.zzp(paramParcel, m);
        break;
      case 5: 
        localBundle = zza.zzr(paramParcel, m);
        break;
      case 6: 
        arrayOfInt = zza.zzv(paramParcel, m);
        break;
      case 7: 
        arrayOfFloat = zza.zzy(paramParcel, m);
        break;
      case 8: 
        arrayOfByte = zza.zzs(paramParcel, m);
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
    Object localObject = new com/google/android/gms/fitness/data/Value;
    ((Value)localObject).<init>(k, j, bool, f, str, localBundle, arrayOfInt, arrayOfFloat, arrayOfByte);
    return (Value)localObject;
  }
  
  public Value[] zzfe(int paramInt)
  {
    return new Value[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */