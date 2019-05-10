package com.crashlytics.android.answers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.Crash.FatalException;
import io.fabric.sdk.android.services.common.Crash.LoggedException;
import io.fabric.sdk.android.services.common.FirebaseInfo;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;

public class Answers
  extends Kit
{
  static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
  public static final String TAG = "Answers";
  SessionAnalyticsManager analyticsManager;
  boolean firebaseEnabled = false;
  
  public static Answers getInstance()
  {
    return (Answers)Fabric.getKit(Answers.class);
  }
  
  private void logFirebaseModeEnabledWarning(String paramString)
  {
    Logger localLogger = Fabric.getLogger();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Method " + paramString + " is not supported when using Crashlytics through Firebase.";
    localLogger.w("Answers", (String)localObject);
  }
  
  protected Boolean doInBackground()
  {
    Object localObject1 = new io/fabric/sdk/android/services/common/FirebaseInfo;
    ((FirebaseInfo)localObject1).<init>();
    Object localObject2 = getContext();
    boolean bool1 = ((FirebaseInfo)localObject1).isDataCollectionDefaultEnabled((Context)localObject2);
    String str1;
    if (!bool1)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "Fabric";
      str1 = "Analytics collection disabled, because data collection is disabled by Firebase.";
      ((Logger)localObject1).d((String)localObject2, str1);
      this.analyticsManager.disable();
      localObject1 = Boolean.valueOf(false);
    }
    for (;;)
    {
      return (Boolean)localObject1;
      try
      {
        localObject1 = Settings.getInstance();
        localObject1 = ((Settings)localObject1).awaitSettingsData();
        if (localObject1 == null)
        {
          localObject1 = Fabric.getLogger();
          localObject2 = "Answers";
          str1 = "Failed to retrieve settings";
          ((Logger)localObject1).e((String)localObject2, str1);
          bool1 = false;
          localObject1 = null;
          localObject1 = Boolean.valueOf(false);
        }
        else
        {
          localObject2 = ((SettingsData)localObject1).featuresData;
          boolean bool2 = ((FeaturesSettingsData)localObject2).collectAnalytics;
          if (bool2)
          {
            localObject2 = Fabric.getLogger();
            str1 = "Answers";
            str2 = "Analytics collection enabled";
            ((Logger)localObject2).d(str1, str2);
            localObject2 = this.analyticsManager;
            localObject1 = ((SettingsData)localObject1).analyticsSettingsData;
            str1 = getOverridenSpiEndpoint();
            ((SessionAnalyticsManager)localObject2).setAnalyticsSettingsData((AnalyticsSettingsData)localObject1, str1);
            bool1 = true;
            localObject1 = Boolean.valueOf(bool1);
          }
          else
          {
            localObject1 = Fabric.getLogger();
            localObject2 = "Answers";
            str1 = "Analytics collection disabled";
            ((Logger)localObject1).d((String)localObject2, str1);
            localObject1 = this.analyticsManager;
            ((SessionAnalyticsManager)localObject1).disable();
            bool1 = false;
            localObject1 = null;
            localObject1 = Boolean.valueOf(false);
          }
        }
      }
      catch (Exception localException)
      {
        localObject2 = Fabric.getLogger();
        str1 = "Answers";
        String str2 = "Error dealing with settings";
        ((Logger)localObject2).e(str1, str2, localException);
        Boolean localBoolean = Boolean.valueOf(false);
      }
    }
  }
  
  public String getIdentifier()
  {
    return "com.crashlytics.sdk.android:answers";
  }
  
  String getOverridenSpiEndpoint()
  {
    return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
  }
  
  public String getVersion()
  {
    return "1.4.3.27";
  }
  
  public void logAddToCart(AddToCartEvent paramAddToCartEvent)
  {
    Object localObject;
    if (paramAddToCartEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logAddToCart";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramAddToCartEvent);
      }
    }
  }
  
  public void logContentView(ContentViewEvent paramContentViewEvent)
  {
    Object localObject;
    if (paramContentViewEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logContentView";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramContentViewEvent);
      }
    }
  }
  
  public void logCustom(CustomEvent paramCustomEvent)
  {
    Object localObject;
    if (paramCustomEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logCustom";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onCustom(paramCustomEvent);
      }
    }
  }
  
  public void logInvite(InviteEvent paramInviteEvent)
  {
    Object localObject;
    if (paramInviteEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logInvite";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramInviteEvent);
      }
    }
  }
  
  public void logLevelEnd(LevelEndEvent paramLevelEndEvent)
  {
    Object localObject;
    if (paramLevelEndEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logLevelEnd";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramLevelEndEvent);
      }
    }
  }
  
  public void logLevelStart(LevelStartEvent paramLevelStartEvent)
  {
    Object localObject;
    if (paramLevelStartEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logLevelStart";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramLevelStartEvent);
      }
    }
  }
  
  public void logLogin(LoginEvent paramLoginEvent)
  {
    Object localObject;
    if (paramLoginEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logLogin";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramLoginEvent);
      }
    }
  }
  
  public void logPurchase(PurchaseEvent paramPurchaseEvent)
  {
    Object localObject;
    if (paramPurchaseEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logPurchase";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramPurchaseEvent);
      }
    }
  }
  
  public void logRating(RatingEvent paramRatingEvent)
  {
    Object localObject;
    if (paramRatingEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logRating";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramRatingEvent);
      }
    }
  }
  
  public void logSearch(SearchEvent paramSearchEvent)
  {
    Object localObject;
    if (paramSearchEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logSearch";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramSearchEvent);
      }
    }
  }
  
  public void logShare(ShareEvent paramShareEvent)
  {
    Object localObject;
    if (paramShareEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logShare";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramShareEvent);
      }
    }
  }
  
  public void logSignUp(SignUpEvent paramSignUpEvent)
  {
    Object localObject;
    if (paramSignUpEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logSignUp";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramSignUpEvent);
      }
    }
  }
  
  public void logStartCheckout(StartCheckoutEvent paramStartCheckoutEvent)
  {
    Object localObject;
    if (paramStartCheckoutEvent == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("event must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = this.firebaseEnabled;
    if (bool)
    {
      localObject = "logStartCheckout";
      logFirebaseModeEnabledWarning((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.analyticsManager;
      if (localObject != null)
      {
        localObject = this.analyticsManager;
        ((SessionAnalyticsManager)localObject).onPredefined(paramStartCheckoutEvent);
      }
    }
  }
  
  public void onException(Crash.FatalException paramFatalException)
  {
    SessionAnalyticsManager localSessionAnalyticsManager = this.analyticsManager;
    if (localSessionAnalyticsManager != null)
    {
      localSessionAnalyticsManager = this.analyticsManager;
      String str1 = paramFatalException.getSessionId();
      String str2 = paramFatalException.getExceptionName();
      localSessionAnalyticsManager.onCrash(str1, str2);
    }
  }
  
  public void onException(Crash.LoggedException paramLoggedException)
  {
    SessionAnalyticsManager localSessionAnalyticsManager = this.analyticsManager;
    if (localSessionAnalyticsManager != null)
    {
      localSessionAnalyticsManager = this.analyticsManager;
      String str = paramLoggedException.getSessionId();
      localSessionAnalyticsManager.onError(str);
    }
  }
  
  protected boolean onPreExecute()
  {
    boolean bool1 = false;
    Object localObject1 = "!SDK-VERSION-STRING!:com.crashlytics.sdk.android:answers:1.4.3.27";
    for (;;)
    {
      try
      {
        localObject2 = getContext();
        localObject1 = ((Context)localObject2).getPackageManager();
        localObject3 = ((Context)localObject2).getPackageName();
        int i = 0;
        str1 = null;
        localPackageInfo = ((PackageManager)localObject1).getPackageInfo((String)localObject3, 0);
        i = localPackageInfo.versionCode;
        str1 = Integer.toString(i);
        str2 = localPackageInfo.versionName;
        if (str2 != null) {
          continue;
        }
        str2 = "0.0";
        int j = Build.VERSION.SDK_INT;
        int k = 9;
        if (j < k) {
          continue;
        }
        l = localPackageInfo.firstInstallTime;
        localObject3 = getIdManager();
        localObject1 = this;
        localObject1 = SessionAnalyticsManager.build(this, (Context)localObject2, (IdManager)localObject3, str1, str2, l);
        this.analyticsManager = ((SessionAnalyticsManager)localObject1);
        localObject1 = this.analyticsManager;
        ((SessionAnalyticsManager)localObject1).enable();
        localObject1 = new io/fabric/sdk/android/services/common/FirebaseInfo;
        ((FirebaseInfo)localObject1).<init>();
        boolean bool2 = ((FirebaseInfo)localObject1).isFirebaseCrashlyticsEnabled((Context)localObject2);
        this.firebaseEnabled = bool2;
        bool1 = true;
      }
      catch (Exception localException)
      {
        PackageInfo localPackageInfo;
        String str2;
        long l;
        Object localObject2 = Fabric.getLogger();
        Object localObject3 = "Answers";
        String str1 = "Error retrieving app properties";
        ((Logger)localObject2).e((String)localObject3, str1, localException);
        continue;
      }
      return bool1;
      str2 = localPackageInfo.versionName;
      continue;
      localPackageInfo = null;
      localObject1 = ((PackageManager)localObject1).getApplicationInfo((String)localObject3, 0);
      localObject3 = new java/io/File;
      localObject1 = ((ApplicationInfo)localObject1).sourceDir;
      ((File)localObject3).<init>((String)localObject1);
      l = ((File)localObject3).lastModified();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\Answers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */