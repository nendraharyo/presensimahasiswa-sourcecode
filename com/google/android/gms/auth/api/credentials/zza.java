package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(Credential paramCredential, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramCredential.getId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramCredential.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramCredential.getName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramCredential.getProfilePictureUri();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramCredential.getIdTokens();
    zzb.zzc(paramParcel, 4, (List)localObject, false);
    localObject = paramCredential.getPassword();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramCredential.getAccountType();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramCredential.getGeneratedPassword();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramCredential.zzmx();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Credential zzE(Parcel paramParcel)
  {
    String str1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str5 = null;
    String str6 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        str6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        str5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject3 = Uri.CREATOR;
        localObject4 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 4: 
        localObject2 = IdToken.CREATOR;
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 5: 
        str4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 6: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 7: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 8: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/auth/api/credentials/Credential;
    ((Credential)localObject4).<init>(j, str6, str5, (Uri)localObject3, (List)localObject2, str4, str3, str2, str1);
    return (Credential)localObject4;
  }
  
  public Credential[] zzaz(int paramInt)
  {
    return new Credential[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */