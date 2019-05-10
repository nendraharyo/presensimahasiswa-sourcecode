package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.ExecutorService;

public abstract class Kit
  implements Comparable
{
  Context context;
  final DependsOn dependsOnAnnotation;
  Fabric fabric;
  IdManager idManager;
  InitializationCallback initializationCallback;
  InitializationTask initializationTask;
  
  public Kit()
  {
    Object localObject = new io/fabric/sdk/android/InitializationTask;
    ((InitializationTask)localObject).<init>(this);
    this.initializationTask = ((InitializationTask)localObject);
    localObject = (DependsOn)getClass().getAnnotation(DependsOn.class);
    this.dependsOnAnnotation = ((DependsOn)localObject);
  }
  
  public int compareTo(Kit paramKit)
  {
    int i = 1;
    int j = -1;
    boolean bool2 = containsAnnotatedDependency(paramKit);
    if (bool2) {}
    for (;;)
    {
      return i;
      bool2 = paramKit.containsAnnotatedDependency(this);
      if (bool2)
      {
        i = j;
      }
      else
      {
        bool2 = hasAnnotatedDependency();
        if (bool2)
        {
          bool2 = paramKit.hasAnnotatedDependency();
          if (!bool2) {}
        }
        else
        {
          boolean bool1 = hasAnnotatedDependency();
          if (!bool1)
          {
            bool1 = paramKit.hasAnnotatedDependency();
            if (bool1)
            {
              bool1 = j;
              continue;
            }
          }
          bool1 = false;
        }
      }
    }
  }
  
  boolean containsAnnotatedDependency(Kit paramKit)
  {
    boolean bool1 = false;
    int i = hasAnnotatedDependency();
    Class[] arrayOfClass;
    int k;
    if (i != 0)
    {
      arrayOfClass = this.dependsOnAnnotation.value();
      k = arrayOfClass.length;
      i = 0;
    }
    for (;;)
    {
      if (i < k)
      {
        Class localClass1 = arrayOfClass[i];
        Class localClass2 = paramKit.getClass();
        boolean bool2 = localClass1.isAssignableFrom(localClass2);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      int j;
      i += 1;
    }
  }
  
  protected abstract Object doInBackground();
  
  public Context getContext()
  {
    return this.context;
  }
  
  protected Collection getDependencies()
  {
    return this.initializationTask.getDependencies();
  }
  
  public Fabric getFabric()
  {
    return this.fabric;
  }
  
  protected IdManager getIdManager()
  {
    return this.idManager;
  }
  
  public abstract String getIdentifier();
  
  public String getPath()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append(".Fabric");
    String str = File.separator;
    localStringBuilder = localStringBuilder.append(str);
    str = getIdentifier();
    return str;
  }
  
  public abstract String getVersion();
  
  boolean hasAnnotatedDependency()
  {
    DependsOn localDependsOn = this.dependsOnAnnotation;
    boolean bool;
    if (localDependsOn != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDependsOn = null;
    }
  }
  
  final void initialize()
  {
    InitializationTask localInitializationTask = this.initializationTask;
    ExecutorService localExecutorService = this.fabric.getExecutorService();
    Void[] arrayOfVoid = new Void[1];
    ((Void)null);
    arrayOfVoid[0] = null;
    localInitializationTask.executeOnExecutor(localExecutorService, arrayOfVoid);
  }
  
  void injectParameters(Context paramContext, Fabric paramFabric, InitializationCallback paramInitializationCallback, IdManager paramIdManager)
  {
    this.fabric = paramFabric;
    FabricContext localFabricContext = new io/fabric/sdk/android/FabricContext;
    String str1 = getIdentifier();
    String str2 = getPath();
    localFabricContext.<init>(paramContext, str1, str2);
    this.context = localFabricContext;
    this.initializationCallback = paramInitializationCallback;
    this.idManager = paramIdManager;
  }
  
  protected void onCancelled(Object paramObject) {}
  
  protected void onPostExecute(Object paramObject) {}
  
  protected boolean onPreExecute()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\Kit.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */