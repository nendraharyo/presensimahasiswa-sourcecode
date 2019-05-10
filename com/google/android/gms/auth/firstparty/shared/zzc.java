package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzc
  implements Parcelable.Creator
{
  static void zza(ScopeDetail paramScopeDetail, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramScopeDetail.version;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramScopeDetail.description;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramScopeDetail.zzYw;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramScopeDetail.zzYx;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramScopeDetail.zzYy;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramScopeDetail.zzYz;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramScopeDetail.zzYA;
    zzb.zzb(paramParcel, 7, (List)localObject, false);
    localObject = paramScopeDetail.zzYB;
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ScopeDetail zzY(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
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
        str5 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        localArrayList = zza.zzD(paramParcel, k);
        break;
      case 8: 
        localObject1 = FACLData.CREATOR;
        localObject3 = (FACLData)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/auth/firstparty/shared/ScopeDetail;
    ((ScopeDetail)localObject3).<init>(j, str5, str4, str3, str2, str1, localArrayList, (FACLData)localObject1);
    return (ScopeDetail)localObject3;
  }
  
  public ScopeDetail[] zzaV(int paramInt)
  {
    return new ScopeDetail[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\firstparty\shared\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */