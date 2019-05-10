package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;
import java.util.Locale;

public final class zzhj$zza
{
  private int zzHD;
  private int zzHE;
  private float zzHF;
  private int zzJQ;
  private boolean zzJR;
  private boolean zzJS;
  private String zzJT;
  private String zzJU;
  private boolean zzJV;
  private boolean zzJW;
  private boolean zzJX;
  private boolean zzJY;
  private String zzJZ;
  private String zzKa;
  private int zzKb;
  private int zzKc;
  private int zzKd;
  private int zzKe;
  private int zzKf;
  private int zzKg;
  private double zzKh;
  private boolean zzKi;
  private boolean zzKj;
  private int zzKk;
  private String zzKl;
  
  public zzhj$zza(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    zzB(paramContext);
    zza(paramContext, localPackageManager);
    zzC(paramContext);
    Locale localLocale = Locale.getDefault();
    Object localObject = zza(localPackageManager, "geo:0,0?q=donuts");
    label74:
    boolean bool;
    if (localObject != null)
    {
      int j = i;
      this.zzJR = j;
      localObject = zza(localPackageManager, "http://www.google.com");
      if (localObject == null) {
        break label165;
      }
      this.zzJS = i;
      localObject = localLocale.getCountry();
      this.zzJU = ((String)localObject);
      bool = zzn.zzcS().zzhI();
      this.zzJV = bool;
      bool = zze.zzap(paramContext);
      this.zzJW = bool;
      localObject = localLocale.getLanguage();
      this.zzJZ = ((String)localObject);
      localObject = zza(localPackageManager);
      this.zzKa = ((String)localObject);
      localObject = paramContext.getResources();
      if (localObject != null) {
        break label172;
      }
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      break;
      label165:
      i = 0;
      f = 0.0F;
      break label74;
      label172:
      localObject = ((Resources)localObject).getDisplayMetrics();
      if (localObject != null)
      {
        f = ((DisplayMetrics)localObject).density;
        this.zzHF = f;
        i = ((DisplayMetrics)localObject).widthPixels;
        this.zzHD = i;
        int k = ((DisplayMetrics)localObject).heightPixels;
        this.zzHE = k;
      }
    }
  }
  
  public zzhj$zza(Context paramContext, zzhj paramzzhj)
  {
    Object localObject = paramContext.getPackageManager();
    zzB(paramContext);
    zza(paramContext, (PackageManager)localObject);
    zzC(paramContext);
    zzD(paramContext);
    boolean bool = paramzzhj.zzJR;
    this.zzJR = bool;
    bool = paramzzhj.zzJS;
    this.zzJS = bool;
    localObject = paramzzhj.zzJU;
    this.zzJU = ((String)localObject);
    bool = paramzzhj.zzJV;
    this.zzJV = bool;
    bool = paramzzhj.zzJW;
    this.zzJW = bool;
    localObject = paramzzhj.zzJZ;
    this.zzJZ = ((String)localObject);
    localObject = paramzzhj.zzKa;
    this.zzKa = ((String)localObject);
    float f = paramzzhj.zzHF;
    this.zzHF = f;
    int i = paramzzhj.zzHD;
    this.zzHD = i;
    i = paramzzhj.zzHE;
    this.zzHE = i;
  }
  
  private void zzB(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    int i = localAudioManager.getMode();
    this.zzJQ = i;
    boolean bool = localAudioManager.isMusicActive();
    this.zzJX = bool;
    bool = localAudioManager.isSpeakerphoneOn();
    this.zzJY = bool;
    int j = localAudioManager.getStreamVolume(3);
    this.zzKb = j;
    j = localAudioManager.getRingerMode();
    this.zzKf = j;
    int k = localAudioManager.getStreamVolume(2);
    this.zzKg = k;
  }
  
  private void zzC(Context paramContext)
  {
    boolean bool = false;
    int i = -1;
    Object localObject = new android/content/IntentFilter;
    ((IntentFilter)localObject).<init>("android.intent.action.BATTERY_CHANGED");
    int j = 0;
    String str1 = null;
    localObject = paramContext.registerReceiver(null, (IntentFilter)localObject);
    if (localObject != null)
    {
      str1 = "status";
      j = ((Intent)localObject).getIntExtra(str1, i);
      String str2 = "level";
      int k = ((Intent)localObject).getIntExtra(str2, i);
      String str3 = "scale";
      int m = ((Intent)localObject).getIntExtra(str3, i);
      float f1 = k;
      float f2 = m;
      double d1 = f1 / f2;
      this.zzKh = d1;
      m = 2;
      f2 = 2.8E-45F;
      if (j != m)
      {
        m = 5;
        f2 = 7.0E-45F;
        if (j != m) {}
      }
      else
      {
        bool = true;
      }
    }
    for (this.zzKi = bool;; this.zzKi = false)
    {
      return;
      double d2 = -1.0D;
      this.zzKh = d2;
    }
  }
  
  private void zzD(Context paramContext)
  {
    String str = Build.FINGERPRINT;
    this.zzKl = str;
  }
  
  private static ResolveInfo zza(PackageManager paramPackageManager, String paramString)
  {
    Intent localIntent = new android/content/Intent;
    Uri localUri = Uri.parse(paramString);
    localIntent.<init>("android.intent.action.VIEW", localUri);
    return paramPackageManager.resolveActivity(localIntent, 65536);
  }
  
  private static String zza(PackageManager paramPackageManager)
  {
    String str = null;
    Object localObject1 = zza(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localObject1 == null) {}
    for (;;)
    {
      return str;
      localObject1 = ((ResolveInfo)localObject1).activityInfo;
      if (localObject1 != null) {
        try
        {
          Object localObject2 = ((ActivityInfo)localObject1).packageName;
          Object localObject3 = null;
          localObject2 = paramPackageManager.getPackageInfo((String)localObject2, 0);
          if (localObject2 != null)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            int i = ((PackageInfo)localObject2).versionCode;
            localObject2 = ((StringBuilder)localObject3).append(i);
            localObject3 = ".";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            localObject1 = ((ActivityInfo)localObject1).packageName;
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            str = ((StringBuilder)localObject1).toString();
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
      }
    }
  }
  
  private void zza(Context paramContext, PackageManager paramPackageManager)
  {
    int i = -1;
    Object localObject = (TelephonyManager)paramContext.getSystemService("phone");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    String str1 = ((TelephonyManager)localObject).getNetworkOperator();
    this.zzJT = str1;
    int j = ((TelephonyManager)localObject).getNetworkType();
    this.zzKd = j;
    int k = ((TelephonyManager)localObject).getPhoneType();
    this.zzKe = k;
    this.zzKc = -2;
    this.zzKj = false;
    this.zzKk = i;
    localObject = zzr.zzbC();
    str1 = paramContext.getPackageName();
    String str2 = "android.permission.ACCESS_NETWORK_STATE";
    boolean bool1 = ((zzir)localObject).zza(paramPackageManager, str1, str2);
    int m;
    if (bool1)
    {
      localObject = localConnectivityManager.getActiveNetworkInfo();
      if (localObject == null) {
        break label189;
      }
      j = ((NetworkInfo)localObject).getType();
      this.zzKc = j;
      localObject = ((NetworkInfo)localObject).getDetailedState();
      m = ((NetworkInfo.DetailedState)localObject).ordinal();
      this.zzKk = m;
    }
    for (;;)
    {
      m = Build.VERSION.SDK_INT;
      j = 16;
      if (m >= j)
      {
        boolean bool2 = localConnectivityManager.isActiveNetworkMetered();
        this.zzKj = bool2;
      }
      return;
      label189:
      this.zzKc = i;
    }
  }
  
  public zzhj zzgI()
  {
    zzhj localzzhj = new com/google/android/gms/internal/zzhj;
    Object localObject = this;
    int i = this.zzJQ;
    boolean bool1 = this.zzJR;
    boolean bool2 = this.zzJS;
    String str1 = this.zzJT;
    String str2 = this.zzJU;
    boolean bool3 = this.zzJV;
    boolean bool4 = this.zzJW;
    boolean bool5 = this.zzJX;
    boolean bool6 = this.zzJY;
    String str3 = this.zzJZ;
    String str4 = this.zzKa;
    int j = this.zzKb;
    int k = this.zzKc;
    int m = this.zzKd;
    int n = this.zzKe;
    int i1 = this.zzKf;
    int i2 = this.zzKg;
    float f = this.zzHF;
    int i3 = this.zzHD;
    int i4 = this.zzHE;
    double d = this.zzKh;
    boolean bool7 = this.zzKi;
    boolean bool8 = this.zzKj;
    int i5 = this.zzKk;
    localObject = this.zzKl;
    localzzhj.<init>(i, bool1, bool2, str1, str2, bool3, bool4, bool5, bool6, str3, str4, j, k, m, n, i1, i2, f, i3, i4, d, bool7, bool8, i5, (String)localObject);
    return localzzhj;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */