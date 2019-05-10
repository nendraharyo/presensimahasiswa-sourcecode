package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitGroup;
import io.fabric.sdk.android.Logger;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Crashlytics
  extends Kit
  implements KitGroup
{
  public static final String TAG = "Crashlytics";
  public final Answers answers;
  public final Beta beta;
  public final CrashlyticsCore core;
  public final Collection kits;
  
  public Crashlytics()
  {
    this(localAnswers, localBeta, localCrashlyticsCore);
  }
  
  Crashlytics(Answers paramAnswers, Beta paramBeta, CrashlyticsCore paramCrashlyticsCore)
  {
    this.answers = paramAnswers;
    this.beta = paramBeta;
    this.core = paramCrashlyticsCore;
    Object localObject = new Kit[3];
    localObject[0] = paramAnswers;
    localObject[1] = paramBeta;
    localObject[2] = paramCrashlyticsCore;
    localObject = Collections.unmodifiableCollection(Arrays.asList((Object[])localObject));
    this.kits = ((Collection)localObject);
  }
  
  private static void checkInitialized()
  {
    Object localObject = getInstance();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
      throw ((Throwable)localObject);
    }
  }
  
  public static Crashlytics getInstance()
  {
    return (Crashlytics)Fabric.getKit(Crashlytics.class);
  }
  
  public static PinningInfoProvider getPinningInfoProvider()
  {
    checkInitialized();
    return getInstance().core.getPinningInfoProvider();
  }
  
  public static void log(int paramInt, String paramString1, String paramString2)
  {
    checkInitialized();
    getInstance().core.log(paramInt, paramString1, paramString2);
  }
  
  public static void log(String paramString)
  {
    checkInitialized();
    getInstance().core.log(paramString);
  }
  
  public static void logException(Throwable paramThrowable)
  {
    checkInitialized();
    getInstance().core.logException(paramThrowable);
  }
  
  public static void setBool(String paramString, boolean paramBoolean)
  {
    checkInitialized();
    getInstance().core.setBool(paramString, paramBoolean);
  }
  
  public static void setDouble(String paramString, double paramDouble)
  {
    checkInitialized();
    getInstance().core.setDouble(paramString, paramDouble);
  }
  
  public static void setFloat(String paramString, float paramFloat)
  {
    checkInitialized();
    getInstance().core.setFloat(paramString, paramFloat);
  }
  
  public static void setInt(String paramString, int paramInt)
  {
    checkInitialized();
    getInstance().core.setInt(paramString, paramInt);
  }
  
  public static void setLong(String paramString, long paramLong)
  {
    checkInitialized();
    getInstance().core.setLong(paramString, paramLong);
  }
  
  public static void setPinningInfoProvider(PinningInfoProvider paramPinningInfoProvider)
  {
    Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.setPinningInfoProvider is deprecated");
  }
  
  public static void setString(String paramString1, String paramString2)
  {
    checkInitialized();
    getInstance().core.setString(paramString1, paramString2);
  }
  
  public static void setUserEmail(String paramString)
  {
    checkInitialized();
    getInstance().core.setUserEmail(paramString);
  }
  
  public static void setUserIdentifier(String paramString)
  {
    checkInitialized();
    getInstance().core.setUserIdentifier(paramString);
  }
  
  public static void setUserName(String paramString)
  {
    checkInitialized();
    getInstance().core.setUserName(paramString);
  }
  
  public void crash()
  {
    this.core.crash();
  }
  
  protected Void doInBackground()
  {
    return null;
  }
  
  public boolean getDebugMode()
  {
    Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.getDebugMode is deprecated.");
    getFabric();
    return Fabric.isDebuggable();
  }
  
  public String getIdentifier()
  {
    return "com.crashlytics.sdk.android:crashlytics";
  }
  
  public Collection getKits()
  {
    return this.kits;
  }
  
  public String getVersion()
  {
    return "2.9.5.27";
  }
  
  public void setDebugMode(boolean paramBoolean)
  {
    Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.setDebugMode is deprecated.");
  }
  
  public void setListener(CrashlyticsListener paramCrashlyticsListener)
  {
    try
    {
      CrashlyticsCore localCrashlyticsCore = this.core;
      localCrashlyticsCore.setListener(paramCrashlyticsListener);
      return;
    }
    finally {}
  }
  
  public boolean verifyPinning(URL paramURL)
  {
    return this.core.verifyPinning(paramURL);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\Crashlytics.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */