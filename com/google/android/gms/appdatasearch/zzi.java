package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(RegisterSectionInfo paramRegisterSectionInfo, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramRegisterSectionInfo.name;
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramRegisterSectionInfo.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramRegisterSectionInfo.zzUd;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    boolean bool1 = paramRegisterSectionInfo.zzUe;
    zzb.zza(paramParcel, 3, bool1);
    int k = paramRegisterSectionInfo.weight;
    zzb.zzc(paramParcel, 4, k);
    boolean bool2 = paramRegisterSectionInfo.zzUf;
    zzb.zza(paramParcel, 5, bool2);
    localObject = paramRegisterSectionInfo.zzUg;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramRegisterSectionInfo.zzUh;
    zzb.zza(paramParcel, 7, (Parcelable[])localObject, paramInt, false);
    localObject = paramRegisterSectionInfo.zzUi;
    zzb.zza(paramParcel, 8, (int[])localObject, false);
    localObject = paramRegisterSectionInfo.zzUj;
    zzb.zza(paramParcel, 11, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RegisterSectionInfo[] zzaq(int paramInt)
  {
    return new RegisterSectionInfo[paramInt];
  }
  
  public RegisterSectionInfo zzx(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 1;
    int[] arrayOfInt = null;
    Object localObject1 = null;
    String str2 = null;
    boolean bool2 = false;
    String str3 = null;
    String str4 = null;
    int k = 0;
    Object localObject2 = null;
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
        str4 = zza.zzp(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, m);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 7: 
        localObject1 = Feature.CREATOR;
        localObject3 = (Feature[])zza.zzb(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 8: 
        arrayOfInt = zza.zzv(paramParcel, m);
        break;
      case 11: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/appdatasearch/RegisterSectionInfo;
    ((RegisterSectionInfo)localObject3).<init>(k, str4, str3, bool2, j, bool1, str2, (Feature[])localObject1, arrayOfInt, str1);
    return (RegisterSectionInfo)localObject3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */