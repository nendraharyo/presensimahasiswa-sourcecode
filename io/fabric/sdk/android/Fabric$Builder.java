package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.services.common.FirebaseInfo;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class Fabric$Builder
{
  private String appIdentifier;
  private String appInstallIdentifier;
  private final Context context;
  private boolean debuggable;
  private Handler handler;
  private InitializationCallback initializationCallback;
  private Kit[] kits;
  private Logger logger;
  private PriorityThreadPoolExecutor threadPoolExecutor;
  
  public Fabric$Builder(Context paramContext)
  {
    if (paramContext == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Context must not be null.");
      throw localIllegalArgumentException;
    }
    this.context = paramContext;
  }
  
  public Builder appIdentifier(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("appIdentifier must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.appIdentifier;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("appIdentifier already set.");
      throw ((Throwable)localObject);
    }
    this.appIdentifier = paramString;
    return this;
  }
  
  public Builder appInstallIdentifier(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("appInstallIdentifier must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.appInstallIdentifier;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("appInstallIdentifier already set.");
      throw ((Throwable)localObject);
    }
    this.appInstallIdentifier = paramString;
    return this;
  }
  
  public Fabric build()
  {
    Object localObject1 = this.threadPoolExecutor;
    if (localObject1 == null)
    {
      localObject1 = PriorityThreadPoolExecutor.create();
      this.threadPoolExecutor = ((PriorityThreadPoolExecutor)localObject1);
    }
    localObject1 = this.handler;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = new android/os/Handler;
      localObject2 = Looper.getMainLooper();
      ((Handler)localObject1).<init>((Looper)localObject2);
      this.handler = ((Handler)localObject1);
    }
    localObject1 = this.logger;
    Object localObject3;
    if (localObject1 == null)
    {
      boolean bool1 = this.debuggable;
      if (bool1)
      {
        localObject1 = new io/fabric/sdk/android/DefaultLogger;
        int i = 3;
        ((DefaultLogger)localObject1).<init>(i);
        this.logger = ((Logger)localObject1);
      }
    }
    else
    {
      localObject1 = this.appIdentifier;
      if (localObject1 == null)
      {
        localObject1 = this.context.getPackageName();
        this.appIdentifier = ((String)localObject1);
      }
      localObject1 = this.initializationCallback;
      if (localObject1 == null)
      {
        localObject1 = InitializationCallback.EMPTY;
        this.initializationCallback = ((InitializationCallback)localObject1);
      }
      localObject1 = this.kits;
      if (localObject1 != null) {
        break label266;
      }
      localObject3 = new java/util/HashMap;
      ((HashMap)localObject3).<init>();
    }
    for (;;)
    {
      localObject2 = this.context.getApplicationContext();
      IdManager localIdManager = new io/fabric/sdk/android/services/common/IdManager;
      localObject1 = this.appIdentifier;
      Object localObject4 = this.appInstallIdentifier;
      Object localObject5 = ((Map)localObject3).values();
      localIdManager.<init>((Context)localObject2, (String)localObject1, (String)localObject4, (Collection)localObject5);
      localObject1 = new io/fabric/sdk/android/Fabric;
      localObject4 = this.threadPoolExecutor;
      localObject5 = this.handler;
      Logger localLogger = this.logger;
      boolean bool2 = this.debuggable;
      InitializationCallback localInitializationCallback = this.initializationCallback;
      Activity localActivity = Fabric.access$100(this.context);
      ((Fabric)localObject1).<init>((Context)localObject2, (Map)localObject3, (PriorityThreadPoolExecutor)localObject4, (Handler)localObject5, localLogger, bool2, localInitializationCallback, localIdManager, localActivity);
      return (Fabric)localObject1;
      localObject1 = new io/fabric/sdk/android/DefaultLogger;
      ((DefaultLogger)localObject1).<init>();
      this.logger = ((Logger)localObject1);
      break;
      label266:
      localObject1 = Arrays.asList(this.kits);
      localObject3 = Fabric.access$000((Collection)localObject1);
    }
  }
  
  public Builder debuggable(boolean paramBoolean)
  {
    this.debuggable = paramBoolean;
    return this;
  }
  
  public Builder executorService(ExecutorService paramExecutorService)
  {
    return this;
  }
  
  public Builder handler(Handler paramHandler)
  {
    return this;
  }
  
  public Builder initializationCallback(InitializationCallback paramInitializationCallback)
  {
    if (paramInitializationCallback == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("initializationCallback must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.initializationCallback;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("initializationCallback already set.");
      throw ((Throwable)localObject);
    }
    this.initializationCallback = paramInitializationCallback;
    return this;
  }
  
  public Builder kits(Kit... paramVarArgs)
  {
    int i = 1;
    Object localObject1 = this.kits;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Kits already set.");
      throw ((Throwable)localObject1);
    }
    localObject1 = new io/fabric/sdk/android/services/common/FirebaseInfo;
    ((FirebaseInfo)localObject1).<init>();
    Object localObject2 = this.context;
    boolean bool1 = ((FirebaseInfo)localObject1).isDataCollectionDefaultEnabled((Context)localObject2);
    ArrayList localArrayList;
    if (!bool1)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = paramVarArgs.length;
      int k = 0;
      bool1 = false;
      localObject1 = null;
      if (k < j)
      {
        Object localObject3 = paramVarArgs[k];
        String str1 = ((Kit)localObject3).getIdentifier();
        int m = -1;
        int n = str1.hashCode();
        switch (n)
        {
        default: 
          switch (m)
          {
          default: 
            label132:
            if (!bool1)
            {
              localObject1 = Fabric.getLogger();
              localObject2 = "Fabric";
              localObject3 = "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.";
              ((Logger)localObject1).w((String)localObject2, (String)localObject3);
              bool1 = i;
            }
            break;
          }
          break;
        }
        for (;;)
        {
          m = k + 1;
          k = m;
          break;
          String str2 = "com.crashlytics.sdk.android:crashlytics";
          boolean bool2 = str1.equals(str2);
          if (!bool2) {
            break label132;
          }
          m = 0;
          localObject2 = null;
          break label132;
          str2 = "com.crashlytics.sdk.android:answers";
          bool2 = str1.equals(str2);
          if (!bool2) {
            break label132;
          }
          m = i;
          break label132;
          localArrayList.add(localObject3);
        }
      }
      localObject1 = new Kit[0];
    }
    for (localObject1 = (Kit[])localArrayList.toArray((Object[])localObject1);; localObject1 = paramVarArgs)
    {
      this.kits = ((Kit[])localObject1);
      return this;
    }
  }
  
  public Builder logger(Logger paramLogger)
  {
    if (paramLogger == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Logger must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.logger;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Logger already set.");
      throw ((Throwable)localObject);
    }
    this.logger = paramLogger;
    return this;
  }
  
  public Builder threadPoolExecutor(PriorityThreadPoolExecutor paramPriorityThreadPoolExecutor)
  {
    if (paramPriorityThreadPoolExecutor == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("PriorityThreadPoolExecutor must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.threadPoolExecutor;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("PriorityThreadPoolExecutor already set.");
      throw ((Throwable)localObject);
    }
    this.threadPoolExecutor = paramPriorityThreadPoolExecutor;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\Fabric$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */