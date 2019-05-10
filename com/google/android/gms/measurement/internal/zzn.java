package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.zza;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class zzn
  extends zzz
{
  private static final X500Principal zzaWz;
  private String zzSE;
  private String zzSF;
  private String zzaUa;
  private String zzaVd;
  private String zzaVi;
  private long zzaWA;
  
  static
  {
    X500Principal localX500Principal = new javax/security/auth/x500/X500Principal;
    localX500Principal.<init>("CN=Android Debug,O=Android,C=US");
    zzaWz = localX500Principal;
  }
  
  zzn(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  String zzBk()
  {
    zzjv();
    return this.zzaVd;
  }
  
  String zzBo()
  {
    zzjv();
    return this.zzaVi;
  }
  
  long zzBp()
  {
    return zzCp().zzBp();
  }
  
  long zzBq()
  {
    zzjv();
    return this.zzaWA;
  }
  
  boolean zzCD()
  {
    try
    {
      Object localObject1 = getContext();
      localObject1 = ((Context)localObject1).getPackageManager();
      localObject2 = getContext();
      localObject2 = ((Context)localObject2).getPackageName();
      int i = 64;
      localObject1 = ((PackageManager)localObject1).getPackageInfo((String)localObject2, i);
      if (localObject1 == null) {
        break label146;
      }
      localObject2 = ((PackageInfo)localObject1).signatures;
      if (localObject2 == null) {
        break label146;
      }
      localObject2 = ((PackageInfo)localObject1).signatures;
      int j = localObject2.length;
      if (j <= 0) {
        break label146;
      }
      localObject1 = ((PackageInfo)localObject1).signatures;
      j = 0;
      localObject2 = null;
      localObject1 = localObject1[0];
      localObject2 = "X.509";
      localObject2 = CertificateFactory.getInstance((String)localObject2);
      localObject3 = new java/io/ByteArrayInputStream;
      localObject1 = ((Signature)localObject1).toByteArray();
      ((ByteArrayInputStream)localObject3).<init>((byte[])localObject1);
      localObject1 = ((CertificateFactory)localObject2).generateCertificate((InputStream)localObject3);
      localObject1 = (X509Certificate)localObject1;
      localObject1 = ((X509Certificate)localObject1).getSubjectX500Principal();
      localObject2 = zzaWz;
      bool = ((X500Principal)localObject1).equals(localObject2);
    }
    catch (CertificateException localCertificateException)
    {
      for (;;)
      {
        localObject2 = zzAo().zzCE();
        localObject3 = "Error obtaining certificate";
        ((zzp.zza)localObject2).zzj((String)localObject3, localCertificateException);
        boolean bool = true;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        label146:
        Object localObject2 = zzAo().zzCE();
        Object localObject3 = "Package name not found";
        ((zzp.zza)localObject2).zzj((String)localObject3, localNameNotFoundException);
      }
    }
    return bool;
  }
  
  protected void zzba(Status paramStatus)
  {
    zzp.zza localzza;
    String str1;
    if (paramStatus == null)
    {
      localzza = zzAo().zzCE();
      str1 = "GoogleService failed to initialize (no status)";
      localzza.zzfg(str1);
    }
    for (;;)
    {
      return;
      localzza = zzAo().zzCE();
      str1 = "GoogleService failed to initialize, status";
      int i = paramStatus.getStatusCode();
      Integer localInteger = Integer.valueOf(i);
      String str2 = paramStatus.getStatusMessage();
      localzza.zze(str1, localInteger, str2);
    }
  }
  
  AppMetadata zzfe(String paramString)
  {
    AppMetadata localAppMetadata = new com/google/android/gms/measurement/internal/AppMetadata;
    String str1 = zzwK();
    String str2 = zzBk();
    String str3 = zzli();
    String str4 = zzBo();
    long l1 = zzBp();
    long l2 = zzBq();
    boolean bool1 = zzCo().zzAr();
    zzt localzzt = zzCo();
    boolean bool2 = localzzt.zzaXx;
    if (!bool2) {}
    for (boolean bool3 = true;; bool3 = false)
    {
      localAppMetadata.<init>(str1, str2, str3, str4, l1, l2, paramString, bool1, bool3);
      return localAppMetadata;
    }
  }
  
  protected void zziJ()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    str1 = null;
    localObject1 = "Unknown";
    localObject2 = "Unknown";
    localPackageManager = getContext().getPackageManager();
    String str2 = getContext().getPackageName();
    localObject3 = localPackageManager.getInstallerPackageName(str2);
    if (localObject3 == null) {
      localObject3 = "manual_install";
    }
    for (;;)
    {
      try
      {
        localObject4 = getContext();
        localObject4 = ((Context)localObject4).getPackageName();
        localObject5 = null;
        localObject4 = localPackageManager.getPackageInfo((String)localObject4, 0);
        if (localObject4 != null)
        {
          localObject5 = ((PackageInfo)localObject4).applicationInfo;
          localObject5 = localPackageManager.getApplicationLabel((ApplicationInfo)localObject5);
          boolean bool3 = TextUtils.isEmpty((CharSequence)localObject5);
          if (!bool3) {
            localObject2 = ((CharSequence)localObject5).toString();
          }
          localObject1 = ((PackageInfo)localObject4).versionName;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        Object localObject4;
        long l1;
        boolean bool5;
        localzza = zzAo().zzCE();
        Object localObject5 = "Error retrieving package info: appName";
        localzza.zzj((String)localObject5, localObject2);
        continue;
        l2 = 0L;
        this.zzaWA = l2;
        try
        {
          bool5 = zzCD();
          if (bool5) {
            continue;
          }
          localObject1 = getContext();
          localObject1 = ((Context)localObject1).getPackageName();
          i = 64;
          localObject1 = localPackageManager.getPackageInfo((String)localObject1, i);
          localObject3 = ((PackageInfo)localObject1).signatures;
          if (localObject3 == null) {
            continue;
          }
          localObject3 = ((PackageInfo)localObject1).signatures;
          i = localObject3.length;
          if (i <= 0) {
            continue;
          }
          localObject1 = ((PackageInfo)localObject1).signatures;
          i = 0;
          localObject3 = null;
          localObject1 = localObject1[0];
          localObject1 = ((Signature)localObject1).toByteArray();
          localObject2 = ((MessageDigest)localObject2).digest((byte[])localObject1);
          l1 = zzaj.zzq((byte[])localObject2);
          this.zzaWA = l1;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          localObject1 = zzAo().zzCE();
          localObject3 = "Package name not found";
          ((zzp.zza)localObject1).zzj((String)localObject3, localNameNotFoundException1);
        }
        continue;
        localStatus = zza.zzaR(getContext());
        localObject1 = localStatus;
        continue;
        boolean bool4 = false;
        localStatus = null;
        continue;
        localObject1 = zzAo().zzCI();
        str1 = "AppMeasurement disabled with google_app_measurement_enable=0";
        ((zzp.zza)localObject1).zzfg(str1);
        continue;
        bool4 = false;
        localStatus = null;
        continue;
      }
      this.zzaUa = str2;
      this.zzaVi = ((String)localObject3);
      this.zzSF = ((String)localObject1);
      this.zzSE = ((String)localObject2);
      localObject2 = zzaj.zzbv("MD5");
      if (localObject2 != null) {
        continue;
      }
      localObject2 = zzAo().zzCE();
      localObject1 = "Could not get MD5 instance";
      ((zzp.zza)localObject2).zzfg((String)localObject1);
      l1 = -1;
      this.zzaWA = l1;
      localObject2 = zzCp();
      bool4 = ((zzd)localObject2).zzkr();
      if (!bool4) {
        continue;
      }
      localObject2 = zza.zzb(getContext(), "-", bool1);
      localObject1 = localObject2;
      if (localObject1 == null) {
        continue;
      }
      bool4 = ((Status)localObject1).isSuccess();
      if (!bool4) {
        continue;
      }
      bool4 = bool1;
      if (!bool4) {
        zzba((Status)localObject1);
      }
      if (!bool4) {
        continue;
      }
      bool4 = zza.zzAr();
      if (!bool4) {
        continue;
      }
      localObject1 = zzAo().zzCK();
      str1 = "AppMeasurement enabled";
      ((zzp.zza)localObject1).zzfg(str1);
      this.zzaVd = "";
      localObject1 = zzCp();
      bool5 = ((zzd)localObject1).zzkr();
      if (!bool5) {}
      try
      {
        localObject1 = zza.zzAp();
        bool2 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool2) {
          localObject1 = "";
        }
        this.zzaVd = ((String)localObject1);
        if (bool4)
        {
          localObject2 = zzAo();
          localObject2 = ((zzp)localObject2).zzCK();
          localObject1 = "App package, google app id";
          str1 = this.zzaUa;
          String str3 = this.zzaVd;
          ((zzp.zza)localObject2).zze((String)localObject1, str1, str3);
        }
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        boolean bool6;
        zzp.zza localzza;
        long l2;
        int i;
        Status localStatus;
        localObject1 = zzAo().zzCE();
        str1 = "getGoogleAppId or isMeasurementEnabled failed with exception";
        ((zzp.zza)localObject1).zzj(str1, localIllegalStateException);
        continue;
      }
      localObject4 = "com.android.vending";
      bool6 = ((String)localObject4).equals(localObject3);
      if (bool6) {
        localObject3 = "";
      }
    }
  }
  
  String zzli()
  {
    zzjv();
    return this.zzSF;
  }
  
  String zzwK()
  {
    zzjv();
    return this.zzaUa;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */