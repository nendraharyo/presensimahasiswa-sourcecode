package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(EmailSignInOptions paramEmailSignInOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramEmailSignInOptions.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramEmailSignInOptions.zzmF();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramEmailSignInOptions.zzmH();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramEmailSignInOptions.zzmG();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public EmailSignInOptions zzQ(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
        break;
        m = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        Object localObject5 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = m;
        localObject4 = localObject5;
        continue;
        localObject3 = Uri.CREATOR;
        localObject4 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        k = j;
        localObject5 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        localObject4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        localObject2 = localObject3;
        k = j;
        localObject5 = localObject1;
        localObject1 = localObject4;
        localObject4 = localObject5;
        continue;
        localObject1 = Uri.CREATOR;
        localObject4 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/auth/api/signin/EmailSignInOptions;
    ((EmailSignInOptions)localObject4).<init>(j, (Uri)localObject3, (String)localObject2, (Uri)localObject1);
    return (EmailSignInOptions)localObject4;
  }
  
  public EmailSignInOptions[] zzaL(int paramInt)
  {
    return new EmailSignInOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */