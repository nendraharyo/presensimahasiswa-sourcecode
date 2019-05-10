package com.google.android.gms.common;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R.string;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.internal.zzmu;
import com.google.android.gms.internal.zzmx;
import com.google.android.gms.internal.zzne;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class zze
{
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = ;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  public static boolean zzafL = false;
  public static boolean zzafM = false;
  static int zzafN = -1;
  private static String zzafO;
  private static Integer zzafP;
  static final AtomicBoolean zzafQ;
  private static final AtomicBoolean zzafR;
  private static final Object zzqy;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
    zzafO = null;
    zzafP = null;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    zzafQ = (AtomicBoolean)localObject;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    zzafR = (AtomicBoolean)localObject;
  }
  
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return zzc.zzoK().getErrorResolutionPendingIntent(paramContext, paramInt1, paramInt2);
  }
  
  public static String getErrorString(int paramInt)
  {
    return ConnectionResult.getStatusString(paramInt);
  }
  
  public static String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    Object localObject1 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject1).<init>();
    localObject1 = ((Uri.Builder)localObject1).scheme("android.resource").authority("com.google.android.gms").appendPath("raw");
    localObject5 = "oss_notice";
    localObject1 = ((Uri.Builder)localObject1).appendPath((String)localObject5).build();
    for (;;)
    {
      try
      {
        localObject5 = paramContext.getContentResolver();
        localObject5 = ((ContentResolver)localObject5).openInputStream((Uri)localObject1);
      }
      catch (Exception localException)
      {
        String str;
        Object localObject2;
        Object localObject4 = null;
        continue;
      }
      try
      {
        localObject1 = new java/util/Scanner;
        ((Scanner)localObject1).<init>((InputStream)localObject5);
        str = "\\A";
        localObject1 = ((Scanner)localObject1).useDelimiter(str);
        localObject1 = ((Scanner)localObject1).next();
      }
      catch (NoSuchElementException localNoSuchElementException)
      {
        if (localObject5 == null) {
          continue;
        }
        ((InputStream)localObject5).close();
        localObject2 = null;
      }
      finally
      {
        if (localObject5 == null) {
          continue;
        }
        ((InputStream)localObject5).close();
      }
    }
    return (String)localObject1;
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    Object localObject1 = "com.google.android.gms";
    int i = 3;
    try
    {
      localObject1 = paramContext.createPackageContext((String)localObject1, i);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (Context)localObject1;
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      localObject1 = paramContext.getPackageManager();
      String str = "com.google.android.gms";
      localObject1 = ((PackageManager)localObject1).getResourcesForApplication(str);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (Resources)localObject1;
  }
  
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    int i = 1;
    int j = 9;
    String str1 = null;
    boolean bool2 = zzd.zzakE;
    if (bool2)
    {
      j = 0;
      Object localObject2 = null;
    }
    for (;;)
    {
      return j;
      Object localObject5 = paramContext.getPackageManager();
      int m;
      boolean bool3;
      String str3;
      String str2;
      try
      {
        localObject6 = paramContext.getResources();
        m = R.string.common_google_play_services_unknown_issue;
        ((Resources)localObject6).getString(m);
        localObject6 = "com.google.android.gms";
        localObject8 = paramContext.getPackageName();
        bool3 = ((String)localObject6).equals(localObject8);
        if (!bool3) {
          zzan(paramContext);
        }
        localObject6 = "com.google.android.gms";
        m = 64;
      }
      finally
      {
        for (;;)
        {
          try
          {
            Object localObject6 = ((PackageManager)localObject5).getPackageInfo((String)localObject6, m);
            localObject8 = zzf.zzoO();
            boolean bool4 = zzmu.zzaw(paramContext);
            if (!bool4) {
              break label192;
            }
            localObject9 = zzd.zzd.zzafK;
            localObject8 = ((zzf)localObject8).zza((PackageInfo)localObject6, (zzd.zza[])localObject9);
            if (localObject8 != null) {
              break label317;
            }
            str1 = "GooglePlayServicesUtil";
            str3 = "Google Play services signature invalid.";
            Log.w(str1, str3);
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException2)
          {
            localObject3 = "GooglePlayServicesUtil";
            str1 = "Google Play services is missing.";
            Log.w((String)localObject3, str1);
            j = i;
          }
          localObject7 = finally;
          str2 = "GooglePlayServicesUtil";
          localObject8 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.";
          Log.e(str2, (String)localObject8);
        }
      }
      Object localObject3;
      continue;
      label192:
      Object localObject9 = "com.android.vending";
      int n = 8256;
      Object localObject1;
      try
      {
        localObject9 = ((PackageManager)localObject5).getPackageInfo((String)localObject9, n);
        arrayOfzza = zzd.zzd.zzafK;
        localObject9 = ((zzf)localObject8).zza((PackageInfo)localObject9, arrayOfzza);
        if (localObject9 != null) {
          break label268;
        }
        str1 = "GooglePlayServicesUtil";
        str3 = "Google Play Store signature invalid.";
        Log.w(str1, str3);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        localObject1 = "GooglePlayServicesUtil";
        str3 = "Google Play Store is neither installed nor updating.";
        Log.w((String)localObject1, str3);
      }
      continue;
      label268:
      n = 1;
      zzd.zza[] arrayOfzza = new zzd.zza[n];
      arrayOfzza[0] = localObject9;
      Object localObject8 = ((zzf)localObject8).zza(str2, arrayOfzza);
      if (localObject8 == null)
      {
        localObject1 = "GooglePlayServicesUtil";
        str3 = "Google Play services signature invalid.";
        Log.w((String)localObject1, str3);
      }
      else
      {
        label317:
        j = zzmx.zzco(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        m = zzmx.zzco(str2.versionCode);
        if (m < j)
        {
          localObject3 = "GooglePlayServicesUtil";
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("Google Play services out of date.  Requires ");
          i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
          localObject1 = ((StringBuilder)localObject1).append(i);
          str3 = " but found ";
          localObject1 = ((StringBuilder)localObject1).append(str3);
          i = str2.versionCode;
          localObject1 = i;
          Log.w((String)localObject3, (String)localObject1);
          j = 2;
        }
        else
        {
          localObject3 = str2.applicationInfo;
          if (localObject3 == null)
          {
            localObject3 = "com.google.android.gms";
            bool3 = false;
            str2 = null;
          }
          try
          {
            localObject3 = ((PackageManager)localObject5).getApplicationInfo((String)localObject3, 0);
            boolean bool1 = ((ApplicationInfo)localObject3).enabled;
            if (bool1) {
              break label479;
            }
            k = 3;
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException3)
          {
            localObject1 = "GooglePlayServicesUtil";
            localObject5 = "Google Play services missing when getting application info.";
            Log.wtf((String)localObject1, (String)localObject5, localNameNotFoundException3);
            k = i;
          }
          continue;
          label479:
          int k = 0;
          Object localObject4 = null;
        }
      }
    }
  }
  
  public static boolean isUserRecoverableError(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static void zzad(Context paramContext)
  {
    zzc localzzc = zzc.zzoK();
    int i = localzzc.isGooglePlayServicesAvailable(paramContext);
    if (i != 0)
    {
      Object localObject1 = zzc.zzoK().zza(paramContext, i, "e");
      Object localObject2 = "GooglePlayServicesUtil";
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str = "GooglePlayServices not available due to error ";
      localObject3 = str + i;
      Log.e((String)localObject2, (String)localObject3);
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
        ((GooglePlayServicesNotAvailableException)localObject1).<init>(i);
        throw ((Throwable)localObject1);
      }
      localObject2 = new com/google/android/gms/common/GooglePlayServicesRepairableException;
      ((GooglePlayServicesRepairableException)localObject2).<init>(i, "Google Play Services not available", (Intent)localObject1);
      throw ((Throwable)localObject2);
    }
  }
  
  public static int zzaj(Context paramContext)
  {
    int i = 0;
    PackageInfo localPackageInfo = null;
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      str2 = "com.google.android.gms";
      localPackageInfo = localPackageManager.getPackageInfo(str2, 0);
      i = localPackageInfo.versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str1 = "GooglePlayServicesUtil";
        String str2 = "Google Play services is missing.";
        Log.w(str1, str2);
      }
    }
    return i;
  }
  
  public static void zzal(Context paramContext)
  {
    Object localObject = zzafQ;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject).getAndSet(bool1);
    if (bool2) {}
    for (;;)
    {
      return;
      localObject = "notification";
      try
      {
        localObject = paramContext.getSystemService((String)localObject);
        localObject = (NotificationManager)localObject;
        int i = 10436;
        ((NotificationManager)localObject).cancel(i);
      }
      catch (SecurityException localSecurityException) {}
    }
  }
  
  private static void zzan(Context paramContext)
  {
    Object localObject1 = zzafR;
    boolean bool1 = ((AtomicBoolean)localObject1).get();
    if (bool1) {}
    int k;
    int m;
    do
    {
      return;
      for (;;)
      {
        String str;
        synchronized (zzqy)
        {
          localObject1 = zzafO;
          if (localObject1 == null)
          {
            localObject1 = paramContext.getPackageName();
            zzafO = (String)localObject1;
            try
            {
              localObject1 = paramContext.getPackageManager();
              localObject5 = paramContext.getPackageName();
              j = 128;
              localObject1 = ((PackageManager)localObject1).getApplicationInfo((String)localObject5, j);
              localObject1 = ((ApplicationInfo)localObject1).metaData;
              if (localObject1 == null) {
                continue;
              }
              localObject5 = "com.google.android.gms.version";
              i = ((Bundle)localObject1).getInt((String)localObject5);
              localObject1 = Integer.valueOf(i);
              zzafP = (Integer)localObject1;
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException)
            {
              int i;
              localObject5 = "GooglePlayServicesUtil";
              str = "This should never happen.";
              Log.wtf((String)localObject5, str, localNameNotFoundException);
              continue;
            }
            localObject1 = zzafP;
            if (localObject1 != null) {
              break;
            }
            localObject1 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject1).<init>("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            throw ((Throwable)localObject1);
            i = 0;
            localObject1 = null;
            zzafP = null;
          }
        }
        localObject3 = zzafO;
        localObject5 = paramContext.getPackageName();
        boolean bool2 = ((String)localObject3).equals(localObject5);
        if (!bool2)
        {
          localObject3 = new java/lang/IllegalArgumentException;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          str = "isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '";
          localObject5 = ((StringBuilder)localObject5).append(str);
          str = zzafO;
          localObject5 = ((StringBuilder)localObject5).append(str);
          str = "' and this call used package '";
          localObject5 = ((StringBuilder)localObject5).append(str);
          str = paramContext.getPackageName();
          localObject5 = ((StringBuilder)localObject5).append(str);
          str = "'.";
          localObject5 = ((StringBuilder)localObject5).append(str);
          localObject5 = ((StringBuilder)localObject5).toString();
          ((IllegalArgumentException)localObject3).<init>((String)localObject5);
          throw ((Throwable)localObject3);
        }
      }
      k = ((Integer)localObject3).intValue();
      m = GOOGLE_PLAY_SERVICES_VERSION_CODE;
    } while (k == m);
    ??? = new java/lang/IllegalStateException;
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    localObject5 = ((StringBuilder)localObject5).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
    int j = GOOGLE_PLAY_SERVICES_VERSION_CODE;
    Object localObject3 = j + " but" + " found " + localObject3 + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />";
    ((IllegalStateException)???).<init>((String)localObject3);
    throw ((Throwable)???);
  }
  
  public static String zzao(Context paramContext)
  {
    String str = paramContext.getApplicationInfo().name;
    bool = TextUtils.isEmpty(str);
    Object localObject1;
    PackageManager localPackageManager;
    if (bool)
    {
      str = paramContext.getPackageName();
      localObject1 = paramContext.getApplicationContext();
      localPackageManager = ((Context)localObject1).getPackageManager();
    }
    try
    {
      localObject1 = paramContext.getPackageName();
      localObject1 = localPackageManager.getApplicationInfo((String)localObject1, 0);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        bool = false;
        Object localObject2 = null;
      }
    }
    if (localObject1 != null) {
      str = localPackageManager.getApplicationLabel((ApplicationInfo)localObject1).toString();
    }
    return str;
  }
  
  public static boolean zzap(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    boolean bool1 = zzne.zzsm();
    boolean bool2;
    if (bool1)
    {
      String str = "cn.google";
      bool2 = localPackageManager.hasSystemFeature(str);
      if (bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localPackageManager = null;
    }
  }
  
  public static boolean zzaq(Context paramContext)
  {
    boolean bool = zzne.zzsj();
    Object localObject;
    if (bool)
    {
      localObject = (UserManager)paramContext.getSystemService("user");
      String str1 = paramContext.getPackageName();
      localObject = ((UserManager)localObject).getApplicationRestrictions(str1);
      if (localObject != null)
      {
        str1 = "true";
        String str2 = "restricted_profile";
        localObject = ((Bundle)localObject).getString(str2);
        bool = str1.equals(localObject);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public static boolean zzb(Context paramContext, int paramInt, String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i = zzne.zzsk();
    if (i != 0) {
      localObject = (AppOpsManager)paramContext.getSystemService("appops");
    }
    do
    {
      try
      {
        ((AppOpsManager)localObject).checkPackage(paramInt, paramString);
        bool2 = bool1;
      }
      catch (SecurityException localSecurityException)
      {
        String[] arrayOfString;
        for (;;) {}
      }
      return bool2;
      localObject = paramContext.getPackageManager();
      arrayOfString = ((PackageManager)localObject).getPackagesForUid(paramInt);
    } while ((paramString == null) || (arrayOfString == null));
    i = 0;
    Object localObject = null;
    for (;;)
    {
      int k = arrayOfString.length;
      if (i >= k) {
        break;
      }
      String str = arrayOfString[i];
      boolean bool3 = paramString.equals(str);
      if (bool3)
      {
        bool2 = bool1;
        break;
      }
      int j;
      i += 1;
    }
  }
  
  public static boolean zzb(PackageManager paramPackageManager)
  {
    boolean bool = true;
    for (;;)
    {
      int i;
      synchronized (zzqy)
      {
        i = zzafN;
        int j = -1;
        Object localObject2;
        if (i == j)
        {
          localObject2 = "com.google.android.gms";
          j = 64;
        }
        try
        {
          localObject2 = paramPackageManager.getPackageInfo((String)localObject2, j);
          zzf localzzf = zzf.zzoO();
          int k = 1;
          zzd.zza[] arrayOfzza = new zzd.zza[k];
          Object localObject4 = zzd.zzd.zzafK;
          int m = 1;
          localObject4 = localObject4[m];
          arrayOfzza[0] = localObject4;
          localObject2 = localzzf.zza((PackageInfo)localObject2, arrayOfzza);
          if (localObject2 == null) {
            continue;
          }
          i = 1;
          zzafN = i;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          i = 0;
          Object localObject3 = null;
          zzafN = 0;
          continue;
        }
        i = zzafN;
        if (i != 0)
        {
          return bool;
          i = 0;
          localObject2 = null;
          zzafN = 0;
        }
      }
      bool = false;
      Object localObject6 = null;
    }
  }
  
  public static Intent zzbv(int paramInt)
  {
    return zzc.zzoK().zza(null, paramInt, null);
  }
  
  static boolean zzbw(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean zzc(PackageManager paramPackageManager)
  {
    boolean bool = zzb(paramPackageManager);
    if (!bool)
    {
      bool = zzoN();
      if (bool) {
        break label21;
      }
    }
    label21:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean zzd(Context paramContext, int paramInt)
  {
    int i = 1;
    int j = 18;
    if (paramInt == j) {}
    for (;;)
    {
      return i;
      String str;
      boolean bool;
      if (paramInt == i)
      {
        str = "com.google.android.gms";
        bool = zzi(paramContext, str);
      }
      else
      {
        bool = false;
        str = null;
      }
    }
  }
  
  public static boolean zze(Context paramContext, int paramInt)
  {
    int i = 9;
    String str;
    boolean bool;
    if (paramInt == i)
    {
      str = "com.android.vending";
      bool = zzi(paramContext, str);
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public static boolean zzf(Context paramContext, int paramInt)
  {
    boolean bool1 = false;
    PackageInfo localPackageInfo = null;
    Object localObject1 = "com.google.android.gms";
    boolean bool2 = zzb(paramContext, paramInt, (String)localObject1);
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      localObject1 = paramContext.getPackageManager();
      Object localObject2 = "com.google.android.gms";
      int i = 64;
      String str;
      try
      {
        localPackageInfo = ((PackageManager)localObject1).getPackageInfo((String)localObject2, i);
        localObject1 = zzf.zzoO();
        localObject2 = paramContext.getPackageManager();
        bool1 = ((zzf)localObject1).zza((PackageManager)localObject2, localPackageInfo);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        str = "GooglePlayServicesUtil";
        int j = 3;
        bool2 = Log.isLoggable(str, j);
      }
      if (bool2)
      {
        str = "GooglePlayServicesUtil";
        localObject2 = "Package manager can't find google play services package, defaulting to false";
        Log.d(str, (String)localObject2);
      }
    }
  }
  
  static boolean zzi(Context paramContext, String paramString)
  {
    boolean bool = zzne.zzsm();
    Object localObject1;
    if (bool)
    {
      localObject1 = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
      Iterator localIterator = ((List)localObject1).iterator();
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = ((PackageInstaller.SessionInfo)localIterator.next()).getAppPackageName();
        bool = paramString.equals(localObject1);
      } while (!bool);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = zzaq(paramContext);
      if (bool)
      {
        bool = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = paramContext.getPackageManager();
        int i = 8192;
        try
        {
          localObject1 = ((PackageManager)localObject1).getApplicationInfo(paramString, i);
          bool = ((ApplicationInfo)localObject1).enabled;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          bool = false;
          Object localObject2 = null;
        }
      }
    }
  }
  
  private static int zzoM()
  {
    return 8487000;
  }
  
  public static boolean zzoN()
  {
    boolean bool = zzafL;
    if (bool) {}
    String str1;
    String str2;
    for (bool = zzafM;; bool = str1.equals(str2))
    {
      return bool;
      str1 = "user";
      str2 = Build.TYPE;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */