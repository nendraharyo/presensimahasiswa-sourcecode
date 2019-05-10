package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.List;

public class zzb
  implements Parcelable.Creator
{
  static void zza(GoogleSignInAccount paramGoogleSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramGoogleSignInAccount.versionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGoogleSignInAccount.getId();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramGoogleSignInAccount.getIdToken();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramGoogleSignInAccount.getEmail();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramGoogleSignInAccount.getDisplayName();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramGoogleSignInAccount.getPhotoUrl();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramGoogleSignInAccount.getServerAuthCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, (String)localObject, false);
    long l = paramGoogleSignInAccount.zzmK();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, l);
    localObject = paramGoogleSignInAccount.zzmL();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramGoogleSignInAccount.zzVs;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 10, (List)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public GoogleSignInAccount zzR(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    long l = 0L;
    String str1 = null;
    String str2 = null;
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
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        l = zza.zzi(paramParcel, k);
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 10: 
        localObject1 = Scope.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/auth/api/signin/GoogleSignInAccount;
    ((GoogleSignInAccount)localObject4).<init>(j, str6, str5, str4, str3, (Uri)localObject3, str2, l, str1, (List)localObject1);
    return (GoogleSignInAccount)localObject4;
  }
  
  public GoogleSignInAccount[] zzaM(int paramInt)
  {
    return new GoogleSignInAccount[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */