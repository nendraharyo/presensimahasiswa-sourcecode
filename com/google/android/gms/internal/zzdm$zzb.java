package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzdm$zzb
{
  private final zzjp zzpD;
  
  public zzdm$zzb(zzjp paramzzjp)
  {
    this.zzpD = paramzzjp;
  }
  
  public Intent zza(Context paramContext, Map paramMap)
  {
    Object localObject1 = null;
    Object localObject2 = (ActivityManager)paramContext.getSystemService("activity");
    Object localObject3 = (String)paramMap.get("u");
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject3);
    if (bool1) {
      return (Intent)localObject1;
    }
    Object localObject4 = this.zzpD;
    if (localObject4 != null)
    {
      localObject4 = zzr.zzbC();
      zzjp localzzjp = this.zzpD;
      localObject3 = ((zzir)localObject4).zza(localzzjp, (String)localObject3);
    }
    localObject4 = Uri.parse((String)localObject3);
    boolean bool2 = Boolean.parseBoolean((String)paramMap.get("use_first_package"));
    boolean bool3 = Boolean.parseBoolean((String)paramMap.get("use_running_process"));
    localObject3 = "http";
    Object localObject5 = ((Uri)localObject4).getScheme();
    boolean bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject5);
    if (bool4)
    {
      localObject3 = ((Uri)localObject4).buildUpon();
      localObject1 = "https";
      localObject3 = ((Uri.Builder)localObject3).scheme((String)localObject1).build();
    }
    for (;;)
    {
      localObject5 = new java/util/ArrayList;
      ((ArrayList)localObject5).<init>();
      localObject4 = zzd((Uri)localObject4);
      localObject3 = zzd((Uri)localObject3);
      localObject1 = zza(paramContext, (Intent)localObject4, (ArrayList)localObject5);
      if (localObject1 != null)
      {
        localObject1 = zza((Intent)localObject4, (ResolveInfo)localObject1);
        break;
        localObject3 = "https";
        localObject5 = ((Uri)localObject4).getScheme();
        bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject5);
        if (!bool4) {
          break label480;
        }
        localObject3 = ((Uri)localObject4).buildUpon();
        localObject1 = "http";
        localObject3 = ((Uri.Builder)localObject3).scheme((String)localObject1).build();
        continue;
      }
      if (localObject3 != null)
      {
        localObject3 = zza(paramContext, (Intent)localObject3);
        if (localObject3 != null)
        {
          localObject1 = zza((Intent)localObject4, (ResolveInfo)localObject3);
          localObject3 = zza(paramContext, (Intent)localObject1);
          if (localObject3 != null) {
            break;
          }
        }
      }
      int i = ((ArrayList)localObject5).size();
      if (i == 0)
      {
        localObject1 = localObject4;
        break;
      }
      boolean bool6;
      if ((bool3) && (localObject2 != null))
      {
        localObject1 = ((ActivityManager)localObject2).getRunningAppProcesses();
        if (localObject1 != null)
        {
          Iterator localIterator1 = ((ArrayList)localObject5).iterator();
          bool6 = localIterator1.hasNext();
          if (bool6)
          {
            localObject2 = (ResolveInfo)localIterator1.next();
            Iterator localIterator2 = ((List)localObject1).iterator();
            do
            {
              bool5 = localIterator2.hasNext();
              if (!bool5) {
                break;
              }
              localObject3 = ((ActivityManager.RunningAppProcessInfo)localIterator2.next()).processName;
              String str = ((ResolveInfo)localObject2).activityInfo.packageName;
              bool5 = ((String)localObject3).equals(str);
            } while (!bool5);
            localObject1 = zza((Intent)localObject4, (ResolveInfo)localObject2);
            break;
          }
        }
      }
      if (bool2)
      {
        bool6 = false;
        localObject2 = (ResolveInfo)((ArrayList)localObject5).get(0);
        localObject1 = zza((Intent)localObject4, (ResolveInfo)localObject2);
        break;
      }
      localObject1 = localObject4;
      break;
      label480:
      boolean bool5 = false;
      localObject3 = null;
    }
  }
  
  public Intent zza(Intent paramIntent, ResolveInfo paramResolveInfo)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramIntent);
    String str1 = paramResolveInfo.activityInfo.packageName;
    String str2 = paramResolveInfo.activityInfo.name;
    localIntent.setClassName(str1, str2);
    return localIntent;
  }
  
  public ResolveInfo zza(Context paramContext, Intent paramIntent)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    return zza(paramContext, paramIntent, localArrayList);
  }
  
  public ResolveInfo zza(Context paramContext, Intent paramIntent, ArrayList paramArrayList)
  {
    Object localObject1 = null;
    int i = 65536;
    Object localObject2 = paramContext.getPackageManager();
    if (localObject2 == null) {
      return (ResolveInfo)localObject1;
    }
    List localList = ((PackageManager)localObject2).queryIntentActivities(paramIntent, i);
    ResolveInfo localResolveInfo = ((PackageManager)localObject2).resolveActivity(paramIntent, i);
    if ((localList != null) && (localResolveInfo != null))
    {
      int j = 0;
      localObject2 = null;
      i = 0;
      label60:
      j = localList.size();
      if (i < j)
      {
        localObject2 = (ResolveInfo)localList.get(i);
        if (localResolveInfo != null)
        {
          String str = localResolveInfo.activityInfo.name;
          localObject2 = ((ResolveInfo)localObject2).activityInfo.name;
          boolean bool = str.equals(localObject2);
          if (!bool) {}
        }
      }
    }
    for (localObject2 = localResolveInfo;; localObject2 = null)
    {
      paramArrayList.addAll(localList);
      localObject1 = localObject2;
      break;
      int k = i + 1;
      i = k;
      break label60;
      k = 0;
    }
  }
  
  public Intent zzd(Uri paramUri)
  {
    Intent localIntent;
    if (paramUri == null) {
      localIntent = null;
    }
    for (;;)
    {
      return localIntent;
      localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW");
      int i = 268435456;
      localIntent.addFlags(i);
      localIntent.setData(paramUri);
      String str = "android.intent.action.VIEW";
      localIntent.setAction(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdm$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */