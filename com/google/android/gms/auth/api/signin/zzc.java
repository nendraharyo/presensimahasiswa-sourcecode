package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzc
  implements Parcelable.Creator
{
  static void zza(GoogleSignInOptions paramGoogleSignInOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGoogleSignInOptions.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGoogleSignInOptions.zzmN();
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    localObject = paramGoogleSignInOptions.getAccount();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    boolean bool = paramGoogleSignInOptions.zzmO();
    zzb.zza(paramParcel, 4, bool);
    bool = paramGoogleSignInOptions.zzmP();
    zzb.zza(paramParcel, 5, bool);
    bool = paramGoogleSignInOptions.zzmQ();
    zzb.zza(paramParcel, 6, bool);
    localObject = paramGoogleSignInOptions.zzmR();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramGoogleSignInOptions.zzmS();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GoogleSignInOptions zzS(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    String str2 = null;
    boolean bool2 = false;
    boolean bool3 = false;
    Object localObject1 = null;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
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
        localObject2 = Scope.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 3: 
        localObject1 = Account.CREATOR;
        localObject4 = (Account)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 4: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 6: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions;
    ((GoogleSignInOptions)localObject4).<init>(j, (ArrayList)localObject2, (Account)localObject1, bool3, bool2, bool1, str2, str1);
    return (GoogleSignInOptions)localObject4;
  }
  
  public GoogleSignInOptions[] zzaN(int paramInt)
  {
    return new GoogleSignInOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */