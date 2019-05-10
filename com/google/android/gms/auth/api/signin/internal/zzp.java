package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.EmailSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp
  implements Parcelable.Creator
{
  static void zza(SignInConfiguration paramSignInConfiguration, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSignInConfiguration.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramSignInConfiguration.zznk();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramSignInConfiguration.zzmR();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramSignInConfiguration.zznl();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramSignInConfiguration.zznm();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramSignInConfiguration.zznn();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SignInConfiguration zzV(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str2 = null;
    String str3 = null;
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
      case 6: 
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject3 = EmailSignInOptions.CREATOR;
        localObject4 = (EmailSignInOptions)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 5: 
        localObject2 = GoogleSignInOptions.CREATOR;
        localObject4 = (GoogleSignInOptions)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 7: 
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
    Object localObject4 = new com/google/android/gms/auth/api/signin/internal/SignInConfiguration;
    ((SignInConfiguration)localObject4).<init>(j, str3, str2, (EmailSignInOptions)localObject3, (GoogleSignInOptions)localObject2, str1);
    return (SignInConfiguration)localObject4;
  }
  
  public SignInConfiguration[] zzaQ(int paramInt)
  {
    return new SignInConfiguration[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */