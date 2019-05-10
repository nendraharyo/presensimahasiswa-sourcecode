package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(GetConsentIntentRequest paramGetConsentIntentRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramGetConsentIntentRequest.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGetConsentIntentRequest.getCallingPackage();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (String)localObject, false);
    j = paramGetConsentIntentRequest.getCallingUid();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 3, j);
    localObject = paramGetConsentIntentRequest.zzmt();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramGetConsentIntentRequest.getAccount();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramGetConsentIntentRequest.zzVR;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, (Parcelable[])localObject, paramInt, false);
    boolean bool = paramGetConsentIntentRequest.zzmu();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, bool);
    int k = paramGetConsentIntentRequest.zzmv();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 8, k);
    localObject = paramGetConsentIntentRequest.zzmw();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, (String)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public GetConsentIntentRequest zzD(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = null;
    String str2 = null;
    int k = 0;
    String str3 = null;
    int m = 0;
    Object localObject3 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
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
        str3 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 5: 
        localObject2 = Account.CREATOR;
        localObject4 = (Account)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 6: 
        localObject1 = ScopeDetail.CREATOR;
        localObject4 = (ScopeDetail[])zza.zzb(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 7: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 8: 
        i = zza.zzg(paramParcel, n);
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/auth/api/consent/GetConsentIntentRequest;
    ((GetConsentIntentRequest)localObject4).<init>(m, str3, k, str2, (Account)localObject2, (ScopeDetail[])localObject1, bool, i, str1);
    return (GetConsentIntentRequest)localObject4;
  }
  
  public GetConsentIntentRequest[] zzay(int paramInt)
  {
    return new GetConsentIntentRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\consent\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */