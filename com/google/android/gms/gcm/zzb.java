package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.w.c;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

class zzb
{
  static zzb zzaLC;
  private final Context mContext;
  private final Class zzaLD;
  
  private zzb(Context paramContext, Class paramClass)
  {
    Context localContext = paramContext.getApplicationContext();
    this.mContext = localContext;
    this.zzaLD = paramClass;
  }
  
  private Notification zzB(Bundle paramBundle)
  {
    Object localObject1 = zzf(paramBundle, "gcm.n.title");
    String str1 = zzf(paramBundle, "gcm.n.body");
    Object localObject2 = zze(paramBundle, "gcm.n.icon");
    int i = zzdW((String)localObject2);
    String str2 = zze(paramBundle, "gcm.n.color");
    localObject2 = zze(paramBundle, "gcm.n.sound2");
    Uri localUri = zzdX((String)localObject2);
    PendingIntent localPendingIntent = zzC(paramBundle);
    localObject2 = null;
    boolean bool1 = GcmListenerService.zzx(paramBundle);
    if (bool1)
    {
      localPendingIntent = zza(paramBundle, localPendingIntent);
      localObject2 = zzD(paramBundle);
    }
    Object localObject3 = new android/support/v4/app/w$c;
    Context localContext = this.mContext;
    ((w.c)localObject3).<init>(localContext);
    boolean bool2 = true;
    localObject3 = ((w.c)localObject3).b(bool2);
    w.c localc = ((w.c)localObject3).a(i);
    bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool1) {
      localc.a((CharSequence)localObject1);
    }
    for (;;)
    {
      boolean bool3 = TextUtils.isEmpty(str1);
      if (!bool3) {
        localc.b(str1);
      }
      bool3 = TextUtils.isEmpty(str2);
      if (!bool3)
      {
        int j = Color.parseColor(str2);
        localc.c(j);
      }
      if (localUri != null) {
        localc.a(localUri);
      }
      if (localPendingIntent != null) {
        localc.a(localPendingIntent);
      }
      if (localObject2 != null) {
        localc.b((PendingIntent)localObject2);
      }
      return localc.a();
      localObject1 = this.mContext.getApplicationInfo();
      localObject3 = this.mContext.getPackageManager();
      localObject1 = ((ApplicationInfo)localObject1).loadLabel((PackageManager)localObject3);
      localc.a((CharSequence)localObject1);
    }
  }
  
  private PendingIntent zzC(Bundle paramBundle)
  {
    Object localObject1 = "gcm.n.click_action";
    Object localObject2 = zze(paramBundle, (String)localObject1);
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool1)
    {
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>((String)localObject2);
      localObject2 = this.mContext.getPackageName();
      ((Intent)localObject1).setPackage((String)localObject2);
      int i = 268435456;
      ((Intent)localObject1).setFlags(i);
    }
    for (localObject2 = localObject1;; localObject2 = localObject1)
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>(paramBundle);
      GcmListenerService.zzw((Bundle)localObject1);
      ((Intent)localObject2).putExtras((Bundle)localObject1);
      localObject1 = ((Bundle)localObject1).keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)localIterator.next();
        String str = "gcm.n.";
        boolean bool2 = ((String)localObject1).startsWith(str);
        if (!bool2)
        {
          str = "gcm.notification.";
          bool2 = ((String)localObject1).startsWith(str);
          if (!bool2) {}
        }
        else
        {
          ((Intent)localObject2).removeExtra((String)localObject1);
        }
      }
      localObject1 = this.mContext.getPackageManager();
      localObject2 = this.mContext.getPackageName();
      localObject1 = ((PackageManager)localObject1).getLaunchIntentForPackage((String)localObject2);
      if (localObject1 == null)
      {
        localObject2 = "No activity found to launch app";
        Log.w("GcmNotification", (String)localObject2);
        bool1 = false;
        int k;
        int j;
        for (localObject1 = null;; localObject1 = PendingIntent.getActivity((Context)localObject1, k, (Intent)localObject2, j))
        {
          return (PendingIntent)localObject1;
          localObject1 = this.mContext;
          k = zzyj();
          j = 1073741824;
        }
      }
    }
  }
  
  private PendingIntent zzD(Bundle paramBundle)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.gcm.NOTIFICATION_DISMISS");
    zza(localIntent, paramBundle);
    Context localContext = this.mContext;
    int i = zzyj();
    return PendingIntent.getService(localContext, i, localIntent, 1073741824);
  }
  
  private PendingIntent zza(Bundle paramBundle, PendingIntent paramPendingIntent)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.gcm.NOTIFICATION_OPEN");
    zza(localIntent, paramBundle);
    localIntent.putExtra("com.google.android.gms.gcm.PENDING_INTENT", paramPendingIntent);
    Context localContext = this.mContext;
    int i = zzyj();
    return PendingIntent.getService(localContext, i, localIntent, 1073741824);
  }
  
  private void zza(Intent paramIntent, Bundle paramBundle)
  {
    Object localObject1 = this.mContext;
    Object localObject2 = this.zzaLD;
    paramIntent.setClass((Context)localObject1, (Class)localObject2);
    localObject1 = paramBundle.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      String str = "google.c.a.";
      boolean bool2 = ((String)localObject1).startsWith(str);
      if (!bool2)
      {
        str = "from";
        bool2 = ((String)localObject1).equals(str);
        if (!bool2) {}
      }
      else
      {
        str = paramBundle.getString((String)localObject1);
        paramIntent.putExtra((String)localObject1, str);
      }
    }
  }
  
  private void zza(String paramString, Notification paramNotification)
  {
    Object localObject1 = "GcmNotification";
    int i = 3;
    boolean bool2 = Log.isLoggable((String)localObject1, i);
    if (bool2)
    {
      localObject1 = "GcmNotification";
      localObject2 = "Showing notification";
      Log.d((String)localObject1, (String)localObject2);
    }
    localObject1 = this.mContext;
    Object localObject2 = "notification";
    localObject1 = (NotificationManager)((Context)localObject1).getSystemService((String)localObject2);
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "GCM-Notification:";
      localObject2 = ((StringBuilder)localObject2).append(str);
      long l = SystemClock.uptimeMillis();
      localObject2 = ((StringBuilder)localObject2).append(l);
      paramString = ((StringBuilder)localObject2).toString();
    }
    ((NotificationManager)localObject1).notify(paramString, 0, paramNotification);
  }
  
  static boolean zzaI(Context paramContext)
  {
    boolean bool1 = false;
    Object localObject = (KeyguardManager)paramContext.getSystemService("keyguard");
    boolean bool2 = ((KeyguardManager)localObject).inKeyguardRestrictedInputMode();
    if (bool2) {}
    do
    {
      return bool1;
      j = Process.myPid();
      localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    } while (localObject == null);
    Iterator localIterator = ((List)localObject).iterator();
    int k;
    do
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      k = ((ActivityManager.RunningAppProcessInfo)localObject).pid;
    } while (k != j);
    int i = ((ActivityManager.RunningAppProcessInfo)localObject).importance;
    int j = 100;
    if (i == j) {
      i = 1;
    }
    for (;;)
    {
      bool1 = i;
      break;
      i = 0;
      localObject = null;
    }
  }
  
  static zzb zzc(Context paramContext, Class paramClass)
  {
    synchronized (zzb.class)
    {
      zzb localzzb = zzaLC;
      if (localzzb == null)
      {
        localzzb = new com/google/android/gms/gcm/zzb;
        localzzb.<init>(paramContext, paramClass);
        zzaLC = localzzb;
      }
      localzzb = zzaLC;
      return localzzb;
    }
  }
  
  private String zzdV(String paramString)
  {
    int i = "gcm.n.".length();
    return paramString.substring(i);
  }
  
  private int zzdW(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject1;
    Object localObject2;
    String str;
    int i;
    if (!bool)
    {
      localObject1 = this.mContext.getResources();
      localObject2 = "drawable";
      str = this.mContext.getPackageName();
      i = ((Resources)localObject1).getIdentifier(paramString, (String)localObject2, str);
      if (i == 0) {}
    }
    for (;;)
    {
      return i;
      localObject2 = "mipmap";
      str = this.mContext.getPackageName();
      i = ((Resources)localObject1).getIdentifier(paramString, (String)localObject2, str);
      if (i == 0)
      {
        localObject2 = "GcmNotification";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Icon resource ").append(paramString);
        str = " not found. Notification will use app icon.";
        localObject1 = str;
        Log.w((String)localObject2, (String)localObject1);
        localObject2 = this.mContext.getApplicationInfo();
        i = ((ApplicationInfo)localObject2).icon;
        if (i == 0) {
          i = 17301651;
        }
      }
    }
  }
  
  private Uri zzdX(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject;
    if (bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (Uri)localObject;
      localObject = "default";
      bool = ((String)localObject).equals(paramString);
      if (!bool)
      {
        localObject = this.mContext.getResources();
        String str1 = "raw";
        String str2 = this.mContext.getPackageName();
        i = ((Resources)localObject).getIdentifier(paramString, str1, str2);
        if (i != 0)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = ((StringBuilder)localObject).append("android.resource://");
          str1 = this.mContext.getPackageName();
          localObject = ((StringBuilder)localObject).append(str1);
          str1 = "/raw/";
          localObject = Uri.parse(str1 + paramString);
          continue;
        }
      }
      int i = 2;
      localObject = RingtoneManager.getDefaultUri(i);
    }
  }
  
  static String zze(Bundle paramBundle, String paramString)
  {
    String str1 = paramBundle.getString(paramString);
    if (str1 == null)
    {
      String str2 = "gcm.notification.";
      str1 = paramString.replace("gcm.n.", str2);
      str1 = paramBundle.getString(str1);
    }
    return str1;
  }
  
  private String zzf(Bundle paramBundle, String paramString)
  {
    Object localObject1 = zze(paramBundle, paramString);
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool1) {}
    for (;;)
    {
      return (String)localObject1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = paramString + "_loc_key";
      Object localObject2 = zze(paramBundle, (String)localObject1);
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool2)
      {
        bool2 = false;
        localObject1 = null;
        continue;
      }
      Object localObject3 = this.mContext.getResources();
      localObject1 = "string";
      Object localObject4 = this.mContext.getPackageName();
      int j = ((Resources)localObject3).getIdentifier((String)localObject2, (String)localObject1, (String)localObject4);
      if (j == 0)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append(paramString);
        str2 = "_loc_key";
        localObject4 = str2;
        localObject4 = zzdV((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " resource not found: ";
        localObject2 = ((StringBuilder)localObject3).append((String)localObject4).append((String)localObject2);
        localObject3 = " Default value will be used.";
        localObject2 = (String)localObject3;
        Log.w("GcmNotification", (String)localObject2);
        bool2 = false;
        localObject1 = null;
        continue;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = paramString + "_loc_args";
      String str2 = zze(paramBundle, (String)localObject1);
      bool2 = TextUtils.isEmpty(str2);
      if (bool2)
      {
        localObject1 = ((Resources)localObject3).getString(j);
        continue;
      }
      try
      {
        localObject5 = new org/json/JSONArray;
        ((JSONArray)localObject5).<init>(str2);
        i = ((JSONArray)localObject5).length();
        String[] arrayOfString = new String[i];
        i = 0;
        localObject1 = null;
        for (;;)
        {
          int k = arrayOfString.length;
          if (i >= k) {
            break;
          }
          Object localObject6 = ((JSONArray)localObject5).opt(i);
          arrayOfString[i] = localObject6;
          i += 1;
        }
        localObject1 = ((Resources)localObject3).getString(j, arrayOfString);
      }
      catch (JSONException localJSONException)
      {
        String str1 = "GcmNotification";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Malformed ");
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append(paramString);
        localObject4 = "_loc_args";
        localObject3 = (String)localObject4;
        localObject3 = zzdV((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(": ").append(str2);
        localObject3 = "  Default value will be used.";
        localObject2 = (String)localObject3;
        Log.w(str1, (String)localObject2);
        int i = 0;
        str1 = null;
      }
      catch (MissingFormatArgumentException localMissingFormatArgumentException)
      {
        for (;;)
        {
          localObject3 = "GcmNotification";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          Object localObject5 = "Missing format argument for ";
          localObject2 = ((StringBuilder)localObject4).append((String)localObject5).append((String)localObject2).append(": ").append(str2);
          localObject4 = " Default value will be used.";
          localObject2 = (String)localObject4;
          Log.w((String)localObject3, (String)localObject2, localMissingFormatArgumentException);
        }
      }
    }
  }
  
  static boolean zzy(Bundle paramBundle)
  {
    String str1 = "1";
    String str2 = zze(paramBundle, "gcm.n.e");
    boolean bool = str1.equals(str2);
    if (!bool)
    {
      str1 = zze(paramBundle, "gcm.n.icon");
      if (str1 == null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  private int zzyj()
  {
    return (int)SystemClock.uptimeMillis();
  }
  
  static void zzz(Bundle paramBundle)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = "gcm.n.";
      boolean bool2 = ((String)localObject).startsWith(str);
      if (bool2)
      {
        int i = "gcm.n.".length();
        str = ((String)localObject).substring(i);
        localObject = paramBundle.getString((String)localObject);
        localBundle.putString(str, (String)localObject);
        localIterator.remove();
      }
      else
      {
        str = "gcm.notification.";
        boolean bool3 = ((String)localObject).startsWith(str);
        if (bool3)
        {
          int j = "gcm.notification.".length();
          str = ((String)localObject).substring(j);
          localObject = paramBundle.getString((String)localObject);
          localBundle.putString(str, (String)localObject);
          localIterator.remove();
        }
      }
    }
    boolean bool1 = localBundle.isEmpty();
    if (!bool1)
    {
      localObject = "notification";
      paramBundle.putBundle((String)localObject, localBundle);
    }
  }
  
  boolean zzA(Bundle paramBundle)
  {
    try
    {
      Notification localNotification = zzB(paramBundle);
      str2 = "gcm.n.tag";
      str2 = zze(paramBundle, str2);
      zza(str2, localNotification);
      bool = true;
    }
    catch (zzb.zza localzza)
    {
      for (;;)
      {
        String str2 = "GcmNotification";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str3 = "Failed to show notification: ";
        localStringBuilder = localStringBuilder.append(str3);
        String str1 = localzza.getMessage();
        str1 = str1;
        Log.e(str2, str1);
        boolean bool = false;
        str1 = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */