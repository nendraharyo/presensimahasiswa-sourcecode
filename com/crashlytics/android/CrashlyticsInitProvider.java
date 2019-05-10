package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.FirebaseInfo;

public class CrashlyticsInitProvider
  extends ContentProvider
{
  private static final String TAG = "CrashlyticsInitProvider";
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    localObject1 = getContext();
    localObject2 = new io/fabric/sdk/android/services/common/FirebaseInfo;
    ((FirebaseInfo)localObject2).<init>();
    Object localObject3 = new com/crashlytics/android/ManifestEnabledCheckStrategy;
    ((ManifestEnabledCheckStrategy)localObject3).<init>();
    boolean bool3 = shouldInitializeFabric((Context)localObject1, (FirebaseInfo)localObject2, (CrashlyticsInitProvider.EnabledCheckStrategy)localObject3);
    if (bool3) {
      bool3 = true;
    }
    try
    {
      localObject2 = new Kit[bool3];
      localObject3 = null;
      Crashlytics localCrashlytics = new com/crashlytics/android/Crashlytics;
      localCrashlytics.<init>();
      localObject2[0] = localCrashlytics;
      Fabric.with((Context)localObject1, (Kit[])localObject2);
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsInitProvider";
      localObject3 = "CrashlyticsInitProvider initialization successful";
      ((Logger)localObject1).i((String)localObject2, (String)localObject3);
      bool2 = bool1;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        localObject1 = "CrashlyticsInitProvider";
        localObject2 = "CrashlyticsInitProvider initialization unsuccessful";
        localLogger.i((String)localObject1, (String)localObject2);
      }
    }
    return bool2;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  boolean shouldInitializeFabric(Context paramContext, FirebaseInfo paramFirebaseInfo, CrashlyticsInitProvider.EnabledCheckStrategy paramEnabledCheckStrategy)
  {
    boolean bool = paramFirebaseInfo.isFirebaseCrashlyticsEnabled(paramContext);
    if (bool)
    {
      bool = paramEnabledCheckStrategy.isCrashlyticsEnabled(paramContext);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\CrashlyticsInitProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */