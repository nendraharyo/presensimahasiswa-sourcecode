package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzjp;

public final class AdOverlayInfoParcel
  implements SafeParcelable
{
  public static final zzf CREATOR;
  public final int orientation;
  public final String url;
  public final int versionCode;
  public final AdLauncherIntentInfoParcel zzEA;
  public final zza zzEB;
  public final zzg zzEC;
  public final zzjp zzED;
  public final zzdb zzEE;
  public final String zzEF;
  public final boolean zzEG;
  public final String zzEH;
  public final zzp zzEI;
  public final int zzEJ;
  public final zzdh zzEK;
  public final String zzEL;
  public final InterstitialAdParameterParcel zzEM;
  public final VersionInfoParcel zzrl;
  
  static
  {
    zzf localzzf = new com/google/android/gms/ads/internal/overlay/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  AdOverlayInfoParcel(int paramInt1, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt2, int paramInt3, String paramString3, VersionInfoParcel paramVersionInfoParcel, IBinder paramIBinder6, String paramString4, InterstitialAdParameterParcel paramInterstitialAdParameterParcel)
  {
    this.versionCode = paramInt1;
    this.zzEA = paramAdLauncherIntentInfoParcel;
    Object localObject = (zza)zze.zzp(zzd.zza.zzbs(paramIBinder1));
    this.zzEB = ((zza)localObject);
    localObject = (zzg)zze.zzp(zzd.zza.zzbs(paramIBinder2));
    this.zzEC = ((zzg)localObject);
    localObject = (zzjp)zze.zzp(zzd.zza.zzbs(paramIBinder3));
    this.zzED = ((zzjp)localObject);
    localObject = (zzdb)zze.zzp(zzd.zza.zzbs(paramIBinder4));
    this.zzEE = ((zzdb)localObject);
    this.zzEF = paramString1;
    this.zzEG = paramBoolean;
    this.zzEH = paramString2;
    localObject = (zzp)zze.zzp(zzd.zza.zzbs(paramIBinder5));
    this.zzEI = ((zzp)localObject);
    this.orientation = paramInt2;
    this.zzEJ = paramInt3;
    this.url = paramString3;
    this.zzrl = paramVersionInfoParcel;
    localObject = (zzdh)zze.zzp(zzd.zza.zzbs(paramIBinder6));
    this.zzEK = ((zzdh)localObject);
    this.zzEL = paramString4;
    this.zzEM = paramInterstitialAdParameterParcel;
  }
  
  public AdOverlayInfoParcel(zza paramzza, zzg paramzzg, zzp paramzzp, zzjp paramzzjp, int paramInt, VersionInfoParcel paramVersionInfoParcel, String paramString, InterstitialAdParameterParcel paramInterstitialAdParameterParcel)
  {
    this.versionCode = 4;
    this.zzEA = null;
    this.zzEB = paramzza;
    this.zzEC = paramzzg;
    this.zzED = paramzzjp;
    this.zzEE = null;
    this.zzEF = null;
    this.zzEG = false;
    this.zzEH = null;
    this.zzEI = paramzzp;
    this.orientation = paramInt;
    this.zzEJ = 1;
    this.url = null;
    this.zzrl = paramVersionInfoParcel;
    this.zzEK = null;
    this.zzEL = paramString;
    this.zzEM = paramInterstitialAdParameterParcel;
  }
  
  public AdOverlayInfoParcel(zza paramzza, zzg paramzzg, zzp paramzzp, zzjp paramzzjp, boolean paramBoolean, int paramInt, VersionInfoParcel paramVersionInfoParcel)
  {
    this.versionCode = 4;
    this.zzEA = null;
    this.zzEB = paramzza;
    this.zzEC = paramzzg;
    this.zzED = paramzzjp;
    this.zzEE = null;
    this.zzEF = null;
    this.zzEG = paramBoolean;
    this.zzEH = null;
    this.zzEI = paramzzp;
    this.orientation = paramInt;
    this.zzEJ = 2;
    this.url = null;
    this.zzrl = paramVersionInfoParcel;
    this.zzEK = null;
    this.zzEL = null;
    this.zzEM = null;
  }
  
  public AdOverlayInfoParcel(zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, zzjp paramzzjp, boolean paramBoolean, int paramInt, String paramString, VersionInfoParcel paramVersionInfoParcel, zzdh paramzzdh)
  {
    this.versionCode = 4;
    this.zzEA = null;
    this.zzEB = paramzza;
    this.zzEC = paramzzg;
    this.zzED = paramzzjp;
    this.zzEE = paramzzdb;
    this.zzEF = null;
    this.zzEG = paramBoolean;
    this.zzEH = null;
    this.zzEI = paramzzp;
    this.orientation = paramInt;
    this.zzEJ = 3;
    this.url = paramString;
    this.zzrl = paramVersionInfoParcel;
    this.zzEK = paramzzdh;
    this.zzEL = null;
    this.zzEM = null;
  }
  
  public AdOverlayInfoParcel(zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, zzjp paramzzjp, boolean paramBoolean, int paramInt, String paramString1, String paramString2, VersionInfoParcel paramVersionInfoParcel, zzdh paramzzdh)
  {
    this.versionCode = 4;
    this.zzEA = null;
    this.zzEB = paramzza;
    this.zzEC = paramzzg;
    this.zzED = paramzzjp;
    this.zzEE = paramzzdb;
    this.zzEF = paramString2;
    this.zzEG = paramBoolean;
    this.zzEH = paramString1;
    this.zzEI = paramzzp;
    this.orientation = paramInt;
    this.zzEJ = 3;
    this.url = null;
    this.zzrl = paramVersionInfoParcel;
    this.zzEK = paramzzdh;
    this.zzEL = null;
    this.zzEM = null;
  }
  
  public AdOverlayInfoParcel(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, zza paramzza, zzg paramzzg, zzp paramzzp, VersionInfoParcel paramVersionInfoParcel)
  {
    this.versionCode = i;
    this.zzEA = paramAdLauncherIntentInfoParcel;
    this.zzEB = paramzza;
    this.zzEC = paramzzg;
    this.zzED = null;
    this.zzEE = null;
    this.zzEF = null;
    this.zzEG = false;
    this.zzEH = null;
    this.zzEI = paramzzp;
    this.orientation = -1;
    this.zzEJ = i;
    this.url = null;
    this.zzrl = paramVersionInfoParcel;
    this.zzEK = null;
    this.zzEL = null;
    this.zzEM = null;
  }
  
  public static void zza(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  public static AdOverlayInfoParcel zzb(Intent paramIntent)
  {
    Object localObject1 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
    try
    {
      localObject1 = paramIntent.getBundleExtra((String)localObject1);
      Object localObject3 = AdOverlayInfoParcel.class;
      localObject3 = ((Class)localObject3).getClassLoader();
      ((Bundle)localObject1).setClassLoader((ClassLoader)localObject3);
      localObject3 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
      localObject1 = ((Bundle)localObject1).getParcelable((String)localObject3);
      localObject1 = (AdOverlayInfoParcel)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (AdOverlayInfoParcel)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzfs()
  {
    return zze.zzC(this.zzEB).asBinder();
  }
  
  IBinder zzft()
  {
    return zze.zzC(this.zzEC).asBinder();
  }
  
  IBinder zzfu()
  {
    return zze.zzC(this.zzED).asBinder();
  }
  
  IBinder zzfv()
  {
    return zze.zzC(this.zzEE).asBinder();
  }
  
  IBinder zzfw()
  {
    return zze.zzC(this.zzEK).asBinder();
  }
  
  IBinder zzfx()
  {
    return zze.zzC(this.zzEI).asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\AdOverlayInfoParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */