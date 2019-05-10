package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(SignInAccount paramSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSignInAccount.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramSignInAccount.zzmT();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramSignInAccount.getIdToken();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramSignInAccount.getEmail();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramSignInAccount.getDisplayName();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramSignInAccount.getPhotoUrl();
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramSignInAccount.zzmV();
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramSignInAccount.getUserId();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramSignInAccount.zzmW();
    zzb.zza(paramParcel, 9, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SignInAccount zzT(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str2 = "";
    Object localObject2 = null;
    Object localObject3 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
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
        str6 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        localObject3 = Uri.CREATOR;
        localObject4 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 7: 
        localObject2 = GoogleSignInAccount.CREATOR;
        localObject4 = (GoogleSignInAccount)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 8: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, k);
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
    Object localObject4 = new com/google/android/gms/auth/api/signin/SignInAccount;
    ((SignInAccount)localObject4).<init>(j, str6, str5, str4, str3, (Uri)localObject3, (GoogleSignInAccount)localObject2, str2, str1);
    return (SignInAccount)localObject4;
  }
  
  public SignInAccount[] zzaO(int paramInt)
  {
    return new SignInAccount[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */