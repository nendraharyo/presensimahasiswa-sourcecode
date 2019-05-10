package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzgc;

public final class GInAppPurchaseManagerInfoParcel
  implements SafeParcelable
{
  public static final zza CREATOR;
  public final int versionCode;
  public final zzgc zzFw;
  public final Context zzFx;
  public final zzj zzFy;
  public final zzk zzrI;
  
  static
  {
    zza localzza = new com/google/android/gms/ads/internal/purchase/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  GInAppPurchaseManagerInfoParcel(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4)
  {
    this.versionCode = paramInt;
    Object localObject = (zzk)zze.zzp(zzd.zza.zzbs(paramIBinder1));
    this.zzrI = ((zzk)localObject);
    localObject = (zzgc)zze.zzp(zzd.zza.zzbs(paramIBinder2));
    this.zzFw = ((zzgc)localObject);
    localObject = (Context)zze.zzp(zzd.zza.zzbs(paramIBinder3));
    this.zzFx = ((Context)localObject);
    localObject = (zzj)zze.zzp(zzd.zza.zzbs(paramIBinder4));
    this.zzFy = ((zzj)localObject);
  }
  
  public GInAppPurchaseManagerInfoParcel(Context paramContext, zzk paramzzk, zzgc paramzzgc, zzj paramzzj)
  {
    this.versionCode = 2;
    this.zzFx = paramContext;
    this.zzrI = paramzzk;
    this.zzFw = paramzzgc;
    this.zzFy = paramzzj;
  }
  
  public static void zza(Intent paramIntent, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramGInAppPurchaseManagerInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }
  
  public static GInAppPurchaseManagerInfoParcel zzc(Intent paramIntent)
  {
    Object localObject1 = "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo";
    try
    {
      localObject1 = paramIntent.getBundleExtra((String)localObject1);
      Object localObject3 = GInAppPurchaseManagerInfoParcel.class;
      localObject3 = ((Class)localObject3).getClassLoader();
      ((Bundle)localObject1).setClassLoader((ClassLoader)localObject3);
      localObject3 = "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo";
      localObject1 = ((Bundle)localObject1).getParcelable((String)localObject3);
      localObject1 = (GInAppPurchaseManagerInfoParcel)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (GInAppPurchaseManagerInfoParcel)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzfS()
  {
    return zze.zzC(this.zzFy).asBinder();
  }
  
  IBinder zzfT()
  {
    return zze.zzC(this.zzrI).asBinder();
  }
  
  IBinder zzfU()
  {
    return zze.zzC(this.zzFw).asBinder();
  }
  
  IBinder zzfV()
  {
    return zze.zzC(this.zzFx).asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\GInAppPurchaseManagerInfoParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */