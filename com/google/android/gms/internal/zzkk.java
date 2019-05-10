package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.UsageInfo.zza;
import com.google.android.gms.appdatasearch.zzk;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.appindexing.AppIndexApi.ActionResult;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.List;

public final class zzkk
  implements zzk, AppIndexApi
{
  public static Intent zza(String paramString, Uri paramUri)
  {
    zzb(paramString, paramUri);
    boolean bool = zzk(paramUri);
    if (bool)
    {
      localObject1 = new android/content/Intent;
      localObject2 = "android.intent.action.VIEW";
      ((Intent)localObject1).<init>((String)localObject2, paramUri);
    }
    for (;;)
    {
      return (Intent)localObject1;
      bool = zzl(paramUri);
      if (!bool) {
        break;
      }
      localObject1 = new android/content/Intent;
      localObject2 = "android.intent.action.VIEW";
      Uri localUri = zzj(paramUri);
      ((Intent)localObject1).<init>((String)localObject2, localUri);
    }
    Object localObject1 = new java/lang/RuntimeException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: " + paramUri;
    ((RuntimeException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, Action paramAction, int paramInt)
  {
    Object localObject = paramGoogleApiClient.getContext().getPackageName();
    long l = System.currentTimeMillis();
    localObject = zzkj.zza(paramAction, l, (String)localObject, paramInt);
    UsageInfo[] arrayOfUsageInfo = new UsageInfo[1];
    arrayOfUsageInfo[0] = localObject;
    return zza(paramGoogleApiClient, arrayOfUsageInfo);
  }
  
  private static void zzb(String paramString, Uri paramUri)
  {
    boolean bool1 = zzk(paramUri);
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      localObject1 = paramUri.getHost();
      bool1 = ((String)localObject1).isEmpty();
      if (bool1)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "AppIndex: The web URL must have a host (follow the format http(s)://<host>/[path]). Provided URI: " + paramUri;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      bool1 = zzl(paramUri);
      if (bool1)
      {
        if (paramString != null)
        {
          localObject1 = paramUri.getHost();
          bool1 = paramString.equals(localObject1);
          if (!bool1)
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = "AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/[host_path]. Provided URI: " + paramUri;
            ((IllegalArgumentException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        localObject1 = paramUri.getPathSegments();
        boolean bool2 = ((List)localObject1).isEmpty();
        if (!bool2)
        {
          bool2 = false;
          localObject2 = null;
          localObject1 = (String)((List)localObject1).get(0);
          bool1 = ((String)localObject1).isEmpty();
          if (!bool1) {}
        }
        else
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + paramUri;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/[host_path]'. Provided URI: " + paramUri;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  private static Uri zzj(Uri paramUri)
  {
    int i = 1;
    List localList = paramUri.getPathSegments();
    String str = (String)localList.get(0);
    Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    localBuilder.scheme(str);
    int j = localList.size();
    if (j > i)
    {
      str = (String)localList.get(i);
      localBuilder.authority(str);
      j = 2;
      for (i = j;; i = j)
      {
        j = localList.size();
        if (i >= j) {
          break;
        }
        str = (String)localList.get(i);
        localBuilder.appendPath(str);
        j = i + 1;
      }
    }
    str = paramUri.getEncodedQuery();
    localBuilder.encodedQuery(str);
    str = paramUri.getEncodedFragment();
    localBuilder.encodedFragment(str);
    return localBuilder.build();
  }
  
  private static boolean zzk(Uri paramUri)
  {
    String str1 = paramUri.getScheme();
    String str2 = "http";
    boolean bool1 = str2.equals(str1);
    boolean bool2;
    if (!bool1)
    {
      str2 = "https";
      bool2 = str2.equals(str1);
      if (!bool2) {}
    }
    else
    {
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      str1 = null;
    }
  }
  
  private static boolean zzl(Uri paramUri)
  {
    String str = paramUri.getScheme();
    return "android-app".equals(str);
  }
  
  public static void zzt(List paramList)
  {
    if (paramList == null) {
      return;
    }
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Uri localUri = ((AppIndexApi.AppIndexingLink)localIterator.next()).appIndexingUrl;
      zzb(null, localUri);
    }
  }
  
  public AppIndexApi.ActionResult action(GoogleApiClient paramGoogleApiClient, Action paramAction)
  {
    PendingResult localPendingResult = zza(paramGoogleApiClient, paramAction, 1);
    zzkk.zza localzza = new com/google/android/gms/internal/zzkk$zza;
    localzza.<init>(this, localPendingResult, paramAction);
    return localzza;
  }
  
  public PendingResult end(GoogleApiClient paramGoogleApiClient, Action paramAction)
  {
    return zza(paramGoogleApiClient, paramAction, 2);
  }
  
  public PendingResult start(GoogleApiClient paramGoogleApiClient, Action paramAction)
  {
    return zza(paramGoogleApiClient, paramAction, 1);
  }
  
  public PendingResult view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent, String paramString, Uri paramUri, List paramList)
  {
    String str = paramGoogleApiClient.getContext().getPackageName();
    zzt(paramList);
    UsageInfo[] arrayOfUsageInfo = new UsageInfo[1];
    UsageInfo localUsageInfo = new com/google/android/gms/appdatasearch/UsageInfo;
    localUsageInfo.<init>(str, paramIntent, paramString, paramUri, null, paramList, 1);
    arrayOfUsageInfo[0] = localUsageInfo;
    return zza(paramGoogleApiClient, arrayOfUsageInfo);
  }
  
  public PendingResult view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri1, String paramString, Uri paramUri2, List paramList)
  {
    Object localObject = paramGoogleApiClient.getContext().getPackageName();
    zzb((String)localObject, paramUri1);
    Intent localIntent = zza((String)localObject, paramUri1);
    localObject = this;
    return view(paramGoogleApiClient, paramActivity, localIntent, paramString, paramUri2, paramList);
  }
  
  public PendingResult viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent)
  {
    Object localObject1 = paramGoogleApiClient.getContext().getPackageName();
    Object localObject2 = new com/google/android/gms/appdatasearch/UsageInfo$zza;
    ((UsageInfo.zza)localObject2).<init>();
    localObject1 = UsageInfo.zza((String)localObject1, paramIntent);
    localObject1 = ((UsageInfo.zza)localObject2).zza((DocumentId)localObject1);
    long l = System.currentTimeMillis();
    localObject1 = ((UsageInfo.zza)localObject1).zzw(l).zzar(0).zzas(2).zzmi();
    localObject2 = new UsageInfo[1];
    localObject2[0] = localObject1;
    return zza(paramGoogleApiClient, (UsageInfo[])localObject2);
  }
  
  public PendingResult viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri)
  {
    Intent localIntent = zza(paramGoogleApiClient.getContext().getPackageName(), paramUri);
    return viewEnd(paramGoogleApiClient, paramActivity, localIntent);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, UsageInfo... paramVarArgs)
  {
    String str = paramGoogleApiClient.getContext().getPackageName();
    zzkk.1 local1 = new com/google/android/gms/internal/zzkk$1;
    local1.<init>(this, paramGoogleApiClient, str, paramVarArgs);
    return paramGoogleApiClient.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */