package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ManifestParser
{
  private static final String GLIDE_MODULE_VALUE = "GlideModule";
  private static final String TAG = "ManifestParser";
  private final Context context;
  
  public ManifestParser(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private static GlideModule parseModule(String paramString)
  {
    Object localObject1;
    try
    {
      localObject1 = Class.forName(paramString);
      localObject2 = null;
      bool = false;
      localObject3 = null;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject2;
      boolean bool;
      Object[] arrayOfObject;
      label43:
      Object localObject3 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject3).<init>("Unable to find GlideModule implementation", localClassNotFoundException);
      throw ((Throwable)localObject3);
    }
    try
    {
      localObject3 = new Class[0];
      localObject3 = ((Class)localObject1).getDeclaredConstructor((Class[])localObject3);
      arrayOfObject = null;
      arrayOfObject = new Object[0];
      localObject2 = ((Constructor)localObject3).newInstance(arrayOfObject);
    }
    catch (InstantiationException localInstantiationException)
    {
      throwInstantiateGlideModuleException((Class)localObject1, localInstantiationException);
      break label43;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throwInstantiateGlideModuleException((Class)localObject1, localIllegalAccessException);
      break label43;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throwInstantiateGlideModuleException((Class)localObject1, localNoSuchMethodException);
      break label43;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throwInstantiateGlideModuleException((Class)localObject1, localInvocationTargetException);
      break label43;
    }
    bool = localObject2 instanceof GlideModule;
    if (!bool)
    {
      localObject3 = new java/lang/RuntimeException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Expected instanceof GlideModule, but found: " + localObject2;
      ((RuntimeException)localObject3).<init>((String)localObject2);
      throw ((Throwable)localObject3);
    }
    return (GlideModule)localClassNotFoundException;
  }
  
  private static void throwInstantiateGlideModuleException(Class paramClass, Exception paramException)
  {
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Unable to instantiate GlideModule implementation for " + paramClass;
    localRuntimeException.<init>((String)localObject, paramException);
    throw localRuntimeException;
  }
  
  public List parse()
  {
    int i = 3;
    Object localObject1 = "ManifestParser";
    boolean bool1 = Log.isLoggable((String)localObject1, i);
    if (bool1)
    {
      localObject1 = "ManifestParser";
      localObject3 = "Loading Glide modules";
      Log.d((String)localObject1, (String)localObject3);
    }
    Object localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    for (;;)
    {
      Object localObject4;
      try
      {
        localObject1 = this.context;
        localObject1 = ((Context)localObject1).getPackageManager();
        localObject4 = this.context;
        localObject4 = ((Context)localObject4).getPackageName();
        int j = 128;
        localObject4 = ((PackageManager)localObject1).getApplicationInfo((String)localObject4, j);
        localObject1 = ((ApplicationInfo)localObject4).metaData;
        if (localObject1 == null)
        {
          localObject1 = "ManifestParser";
          int k = 3;
          bool1 = Log.isLoggable((String)localObject1, k);
          if (bool1)
          {
            localObject1 = "ManifestParser";
            localObject4 = "Got null app info metadata";
            Log.d((String)localObject1, (String)localObject4);
          }
          localObject1 = localObject3;
          return (List)localObject1;
        }
        localObject1 = "ManifestParser";
        j = 2;
        bool1 = Log.isLoggable((String)localObject1, j);
        Object localObject6;
        if (bool1)
        {
          localObject1 = "ManifestParser";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject6 = "Got app info metadata: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject6 = ((ApplicationInfo)localObject4).metaData;
          localObject5 = ((StringBuilder)localObject5).append(localObject6);
          localObject5 = ((StringBuilder)localObject5).toString();
          Log.v((String)localObject1, (String)localObject5);
        }
        localObject1 = ((ApplicationInfo)localObject4).metaData;
        localObject1 = ((Bundle)localObject1).keySet();
        Object localObject5 = ((Set)localObject1).iterator();
        bool1 = ((Iterator)localObject5).hasNext();
        if (bool1)
        {
          localObject1 = ((Iterator)localObject5).next();
          localObject1 = (String)localObject1;
          localObject6 = "GlideModule";
          Object localObject7 = ((ApplicationInfo)localObject4).metaData;
          localObject7 = ((Bundle)localObject7).get((String)localObject1);
          boolean bool2 = ((String)localObject6).equals(localObject7);
          if (!bool2) {
            continue;
          }
          localObject6 = parseModule((String)localObject1);
          ((List)localObject3).add(localObject6);
          localObject6 = "ManifestParser";
          int m = 3;
          bool2 = Log.isLoggable((String)localObject6, m);
          if (!bool2) {
            continue;
          }
          localObject6 = "ManifestParser";
          localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>();
          String str = "Loaded Glide module: ";
          localObject7 = ((StringBuilder)localObject7).append(str);
          localObject1 = ((StringBuilder)localObject7).append((String)localObject1);
          localObject1 = ((StringBuilder)localObject1).toString();
          Log.d((String)localObject6, (String)localObject1);
          continue;
        }
        localObject2 = "ManifestParser";
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject3 = new java/lang/RuntimeException;
        ((RuntimeException)localObject3).<init>("Unable to find metadata to parse GlideModules", localNameNotFoundException);
        throw ((Throwable)localObject3);
      }
      bool1 = Log.isLoggable((String)localObject2, i);
      if (bool1)
      {
        localObject2 = "ManifestParser";
        localObject4 = "Finished loading Glide modules";
        Log.d((String)localObject2, (String)localObject4);
      }
      Object localObject2 = localObject3;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\module\ManifestParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */