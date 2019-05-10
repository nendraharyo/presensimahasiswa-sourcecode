package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import io.fabric.sdk.android.services.concurrency.Task;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class Fabric
{
  static final String ANSWERS_KIT_IDENTIFIER = "com.crashlytics.sdk.android:answers";
  static final String CRASHLYTICS_KIT_IDENTIFIER = "com.crashlytics.sdk.android:crashlytics";
  static final boolean DEFAULT_DEBUGGABLE = false;
  static final Logger DEFAULT_LOGGER;
  static final String ROOT_DIR = ".Fabric";
  public static final String TAG = "Fabric";
  static volatile Fabric singleton;
  private WeakReference activity;
  private ActivityLifecycleManager activityLifecycleManager;
  private final Context context;
  final boolean debuggable;
  private final ExecutorService executorService;
  private final IdManager idManager;
  private final InitializationCallback initializationCallback;
  private AtomicBoolean initialized;
  private final InitializationCallback kitInitializationCallback;
  private final Map kits;
  final Logger logger;
  private final Handler mainHandler;
  
  static
  {
    DefaultLogger localDefaultLogger = new io/fabric/sdk/android/DefaultLogger;
    localDefaultLogger.<init>();
    DEFAULT_LOGGER = localDefaultLogger;
  }
  
  Fabric(Context paramContext, Map paramMap, PriorityThreadPoolExecutor paramPriorityThreadPoolExecutor, Handler paramHandler, Logger paramLogger, boolean paramBoolean, InitializationCallback paramInitializationCallback, IdManager paramIdManager, Activity paramActivity)
  {
    this.context = paramContext;
    this.kits = paramMap;
    this.executorService = paramPriorityThreadPoolExecutor;
    this.mainHandler = paramHandler;
    this.logger = paramLogger;
    this.debuggable = paramBoolean;
    this.initializationCallback = paramInitializationCallback;
    Object localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.initialized = ((AtomicBoolean)localObject);
    int i = paramMap.size();
    localObject = createKitInitializationCallback(i);
    this.kitInitializationCallback = ((InitializationCallback)localObject);
    this.idManager = paramIdManager;
    setCurrentActivity(paramActivity);
  }
  
  private static void addToKitMap(Map paramMap, Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = (Kit)localIterator.next();
      Class localClass = localObject.getClass();
      paramMap.put(localClass, localObject);
      boolean bool2 = localObject instanceof KitGroup;
      if (bool2)
      {
        localObject = ((KitGroup)localObject).getKits();
        addToKitMap(paramMap, (Collection)localObject);
      }
    }
  }
  
  private static Activity extractActivity(Context paramContext)
  {
    boolean bool = paramContext instanceof Activity;
    if (bool) {}
    for (paramContext = (Activity)paramContext;; paramContext = null) {
      return paramContext;
    }
  }
  
  public static Kit getKit(Class paramClass)
  {
    return (Kit)singleton().kits.get(paramClass);
  }
  
  private static Map getKitMap(Collection paramCollection)
  {
    HashMap localHashMap = new java/util/HashMap;
    int i = paramCollection.size();
    localHashMap.<init>(i);
    addToKitMap(localHashMap, paramCollection);
    return localHashMap;
  }
  
  public static Logger getLogger()
  {
    Object localObject = singleton;
    if (localObject == null) {}
    for (localObject = DEFAULT_LOGGER;; localObject = singleton.logger) {
      return (Logger)localObject;
    }
  }
  
  private void init()
  {
    Object localObject1 = new io/fabric/sdk/android/ActivityLifecycleManager;
    Object localObject2 = this.context;
    ((ActivityLifecycleManager)localObject1).<init>((Context)localObject2);
    this.activityLifecycleManager = ((ActivityLifecycleManager)localObject1);
    localObject1 = this.activityLifecycleManager;
    localObject2 = new io/fabric/sdk/android/Fabric$1;
    ((Fabric.1)localObject2).<init>(this);
    ((ActivityLifecycleManager)localObject1).registerCallbacks((ActivityLifecycleManager.Callbacks)localObject2);
    localObject1 = this.context;
    initializeKits((Context)localObject1);
  }
  
  public static boolean isDebuggable()
  {
    Fabric localFabric = singleton;
    boolean bool;
    if (localFabric == null)
    {
      bool = false;
      localFabric = null;
    }
    for (;;)
    {
      return bool;
      localFabric = singleton;
      bool = localFabric.debuggable;
    }
  }
  
  public static boolean isInitialized()
  {
    Object localObject = singleton;
    boolean bool;
    if (localObject != null)
    {
      localObject = singleton.initialized;
      bool = ((AtomicBoolean)localObject).get();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private static void setFabric(Fabric paramFabric)
  {
    singleton = paramFabric;
    paramFabric.init();
  }
  
  static Fabric singleton()
  {
    Object localObject = singleton;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Must Initialize Fabric before using singleton()");
      throw ((Throwable)localObject);
    }
    return singleton;
  }
  
  public static Fabric with(Context paramContext, Kit... paramVarArgs)
  {
    Object localObject1 = singleton;
    if (localObject1 == null) {}
    synchronized (Fabric.class)
    {
      localObject1 = singleton;
      if (localObject1 == null)
      {
        localObject1 = new io/fabric/sdk/android/Fabric$Builder;
        ((Fabric.Builder)localObject1).<init>(paramContext);
        localObject1 = ((Fabric.Builder)localObject1).kits(paramVarArgs);
        localObject1 = ((Fabric.Builder)localObject1).build();
        setFabric((Fabric)localObject1);
      }
      return singleton;
    }
  }
  
  public static Fabric with(Fabric paramFabric)
  {
    Fabric localFabric = singleton;
    if (localFabric == null) {}
    synchronized (Fabric.class)
    {
      localFabric = singleton;
      if (localFabric == null) {
        setFabric(paramFabric);
      }
      return singleton;
    }
  }
  
  void addAnnotatedDependencies(Map paramMap, Kit paramKit)
  {
    Object localObject1 = paramKit.dependsOnAnnotation;
    if (localObject1 != null)
    {
      Class[] arrayOfClass = ((DependsOn)localObject1).value();
      int i = arrayOfClass.length;
      boolean bool1 = false;
      localObject1 = null;
      int j;
      for (int k = 0; k < i; k = j)
      {
        Class localClass = arrayOfClass[k];
        bool1 = localClass.isInterface();
        if (bool1)
        {
          localObject1 = paramMap.values();
          localObject2 = ((Collection)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (Kit)((Iterator)localObject2).next();
            Object localObject3 = localObject1.getClass();
            boolean bool2 = localClass.isAssignableFrom((Class)localObject3);
            if (bool2)
            {
              localObject3 = paramKit.initializationTask;
              localObject1 = ((Kit)localObject1).initializationTask;
              ((InitializationTask)localObject3).addDependency((Task)localObject1);
            }
          }
        }
        localObject1 = (Kit)paramMap.get(localClass);
        if (localObject1 == null)
        {
          localObject1 = new io/fabric/sdk/android/services/concurrency/UnmetDependencyException;
          ((UnmetDependencyException)localObject1).<init>("Referenced Kit was null, does the kit exist?");
          throw ((Throwable)localObject1);
        }
        Object localObject2 = paramKit.initializationTask;
        localObject1 = ((Kit)paramMap.get(localClass)).initializationTask;
        ((InitializationTask)localObject2).addDependency((Task)localObject1);
        j = k + 1;
      }
    }
  }
  
  InitializationCallback createKitInitializationCallback(int paramInt)
  {
    Fabric.2 local2 = new io/fabric/sdk/android/Fabric$2;
    local2.<init>(this, paramInt);
    return local2;
  }
  
  public ActivityLifecycleManager getActivityLifecycleManager()
  {
    return this.activityLifecycleManager;
  }
  
  public String getAppIdentifier()
  {
    return this.idManager.getAppIdentifier();
  }
  
  public String getAppInstallIdentifier()
  {
    return this.idManager.getAppInstallIdentifier();
  }
  
  public Activity getCurrentActivity()
  {
    Object localObject = this.activity;
    if (localObject != null) {}
    for (localObject = (Activity)this.activity.get();; localObject = null) {
      return (Activity)localObject;
    }
  }
  
  public ExecutorService getExecutorService()
  {
    return this.executorService;
  }
  
  public String getIdentifier()
  {
    return "io.fabric.sdk.android:fabric";
  }
  
  public Collection getKits()
  {
    return this.kits.values();
  }
  
  Future getKitsFinderFuture(Context paramContext)
  {
    FabricKitsFinder localFabricKitsFinder = new io/fabric/sdk/android/FabricKitsFinder;
    String str = paramContext.getPackageCodePath();
    localFabricKitsFinder.<init>(str);
    return getExecutorService().submit(localFabricKitsFinder);
  }
  
  public Handler getMainHandler()
  {
    return this.mainHandler;
  }
  
  public String getVersion()
  {
    return "1.4.4.27";
  }
  
  void initializeKits(Context paramContext)
  {
    Object localObject1 = getKitsFinderFuture(paramContext);
    Object localObject2 = getKits();
    Object localObject3 = new io/fabric/sdk/android/Onboarding;
    ((Onboarding)localObject3).<init>((Future)localObject1, (Collection)localObject2);
    Object localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>((Collection)localObject2);
    Collections.sort((List)localObject4);
    localObject1 = InitializationCallback.EMPTY;
    localObject2 = this.idManager;
    ((Onboarding)localObject3).injectParameters(paramContext, this, (InitializationCallback)localObject1, (IdManager)localObject2);
    localObject2 = ((List)localObject4).iterator();
    Object localObject5;
    Object localObject6;
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Kit)((Iterator)localObject2).next();
      localObject5 = this.kitInitializationCallback;
      localObject6 = this.idManager;
      ((Kit)localObject1).injectParameters(paramContext, this, (InitializationCallback)localObject5, (IdManager)localObject6);
    }
    ((Onboarding)localObject3).initialize();
    localObject1 = getLogger();
    localObject2 = "Fabric";
    int i = 3;
    boolean bool = ((Logger)localObject1).isLoggable((String)localObject2, i);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("Initializing ");
      localObject2 = getIdentifier();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" [Version: ");
      localObject2 = getVersion();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("], with the following kits:\n");
    }
    for (localObject2 = localObject1;; localObject2 = null)
    {
      localObject4 = ((List)localObject4).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Kit)((Iterator)localObject4).next();
        localObject5 = ((Kit)localObject1).initializationTask;
        localObject6 = ((Onboarding)localObject3).initializationTask;
        ((InitializationTask)localObject5).addDependency((Task)localObject6);
        localObject5 = this.kits;
        addAnnotatedDependencies((Map)localObject5, (Kit)localObject1);
        ((Kit)localObject1).initialize();
        if (localObject2 != null)
        {
          localObject5 = ((Kit)localObject1).getIdentifier();
          localObject5 = ((StringBuilder)localObject2).append((String)localObject5);
          localObject6 = " [Version: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject1 = ((Kit)localObject1).getVersion();
          localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
          localObject5 = "]\n";
          ((StringBuilder)localObject1).append((String)localObject5);
        }
      }
      bool = false;
      localObject1 = null;
    }
    if (localObject2 != null)
    {
      localObject1 = getLogger();
      localObject3 = "Fabric";
      localObject2 = ((StringBuilder)localObject2).toString();
      ((Logger)localObject1).d((String)localObject3, (String)localObject2);
    }
  }
  
  public Fabric setCurrentActivity(Activity paramActivity)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramActivity);
    this.activity = localWeakReference;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\Fabric.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */