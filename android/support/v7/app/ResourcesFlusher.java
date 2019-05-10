package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

class ResourcesFlusher
{
  private static final String TAG = "ResourcesFlusher";
  private static Field sDrawableCacheField;
  private static boolean sDrawableCacheFieldFetched;
  private static Field sResourcesImplField;
  private static boolean sResourcesImplFieldFetched;
  private static Class sThemedResourceCacheClazz;
  private static boolean sThemedResourceCacheClazzFetched;
  private static Field sThemedResourceCache_mUnthemedEntriesField;
  private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;
  
  static boolean flush(Resources paramResources)
  {
    int i = Build.VERSION.SDK_INT;
    int m = 24;
    boolean bool1;
    if (i >= m) {
      bool1 = flushNougats(paramResources);
    }
    for (;;)
    {
      return bool1;
      int j = Build.VERSION.SDK_INT;
      m = 23;
      if (j >= m)
      {
        boolean bool2 = flushMarshmallows(paramResources);
      }
      else
      {
        int k = Build.VERSION.SDK_INT;
        m = 21;
        boolean bool3;
        if (k >= m) {
          bool3 = flushLollipops(paramResources);
        } else {
          bool3 = false;
        }
      }
    }
  }
  
  private static boolean flushLollipops(Resources paramResources)
  {
    boolean bool1 = true;
    bool2 = sDrawableCacheFieldFetched;
    if (!bool2)
    {
      localObject1 = Resources.class;
      str1 = "mDrawableCache";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str1);
      sDrawableCacheField = (Field)localObject1;
      localObject1 = sDrawableCacheField;
      bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        boolean bool3;
        str1 = "ResourcesFlusher";
        str2 = "Could not retrieve Resources#mDrawableCache field";
        Log.e(str1, str2, localNoSuchFieldException);
        continue;
        bool2 = false;
        Object localObject2 = null;
      }
    }
    sDrawableCacheFieldFetched = bool1;
    Object localObject1 = sDrawableCacheField;
    if (localObject1 != null)
    {
      bool3 = false;
      str1 = null;
      try
      {
        localObject1 = sDrawableCacheField;
        localObject1 = ((Field)localObject1).get(paramResources);
        localObject1 = (Map)localObject1;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          String str2 = "ResourcesFlusher";
          String str3 = "Could not retrieve value from Resources#mDrawableCache";
          Log.e(str2, str3, localIllegalAccessException);
          bool2 = false;
          localObject2 = null;
        }
      }
      if (localObject1 != null)
      {
        ((Map)localObject1).clear();
        bool2 = bool1;
        return bool2;
      }
    }
  }
  
  private static boolean flushMarshmallows(Resources paramResources)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    boolean bool3 = sDrawableCacheFieldFetched;
    if (!bool3)
    {
      localObject1 = Resources.class;
      str1 = "mDrawableCache";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str1);
      sDrawableCacheField = (Field)localObject1;
      localObject1 = sDrawableCacheField;
      bool4 = true;
      ((Field)localObject1).setAccessible(bool4);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          boolean bool4;
          localObject1 = sDrawableCacheField;
          localObject1 = ((Field)localObject1).get(paramResources);
          if (localObject1 != null) {
            break;
          }
          return bool1;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          String str2 = "ResourcesFlusher";
          String str3 = "Could not retrieve value from Resources#mDrawableCache";
          Log.e(str2, str3, localIllegalAccessException);
        }
        localNoSuchFieldException = localNoSuchFieldException;
        str1 = "ResourcesFlusher";
        str2 = "Could not retrieve Resources#mDrawableCache field";
        Log.e(str1, str2, localNoSuchFieldException);
        continue;
        bool3 = false;
        localObject2 = null;
      }
    }
    sDrawableCacheFieldFetched = bool2;
    bool4 = false;
    String str1 = null;
    Object localObject1 = sDrawableCacheField;
    if (localObject1 != null) {}
    Object localObject2;
    if (localObject2 != null)
    {
      bool3 = flushThemedResourcesCache(localObject2);
      if (!bool3) {}
    }
    for (;;)
    {
      bool1 = bool2;
      break;
      bool2 = false;
    }
  }
  
  private static boolean flushNougats(Resources paramResources)
  {
    boolean bool1 = false;
    bool2 = true;
    bool3 = sResourcesImplFieldFetched;
    if (!bool3)
    {
      localObject1 = Resources.class;
      localObject4 = "mResourcesImpl";
    }
    boolean bool4;
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject4);
      sResourcesImplField = (Field)localObject1;
      localObject1 = sResourcesImplField;
      bool4 = true;
      ((Field)localObject1).setAccessible(bool4);
    }
    catch (NoSuchFieldException localNoSuchFieldException1)
    {
      for (;;)
      {
        localObject4 = "ResourcesFlusher";
        str1 = "Could not retrieve Resources#mResourcesImpl field";
        Log.e((String)localObject4, str1, localNoSuchFieldException1);
      }
    }
    sResourcesImplFieldFetched = bool2;
    Object localObject1 = sResourcesImplField;
    if (localObject1 == null) {}
    for (;;)
    {
      return bool1;
      try
      {
        localObject2 = sResourcesImplField;
        localObject2 = ((Field)localObject2).get(paramResources);
        localObject4 = localObject2;
        if (localObject4 == null) {
          continue;
        }
        bool3 = sDrawableCacheFieldFetched;
        if (!bool3) {}
        try
        {
          localObject2 = localObject4.getClass();
          str1 = "mDrawableCache";
          localObject2 = ((Class)localObject2).getDeclaredField(str1);
          sDrawableCacheField = (Field)localObject2;
          localObject2 = sDrawableCacheField;
          boolean bool5 = true;
          ((Field)localObject2).setAccessible(bool5);
        }
        catch (NoSuchFieldException localNoSuchFieldException2)
        {
          for (;;)
          {
            str1 = "ResourcesFlusher";
            String str2 = "Could not retrieve ResourcesImpl#mDrawableCache field";
            Log.e(str1, str2, localNoSuchFieldException2);
            continue;
            bool3 = false;
            Object localObject3 = null;
            continue;
            bool2 = false;
          }
        }
        sDrawableCacheFieldFetched = bool2;
        localObject2 = sDrawableCacheField;
        if (localObject2 == null) {}
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        for (;;)
        {
          try
          {
            Object localObject2 = sDrawableCacheField;
            localObject2 = ((Field)localObject2).get(localObject4);
            if (localObject2 == null) {
              break label282;
            }
            bool3 = flushThemedResourcesCache(localObject2);
            if (!bool3) {
              break label282;
            }
            bool1 = bool2;
          }
          catch (IllegalAccessException localIllegalAccessException2)
          {
            localObject4 = "ResourcesFlusher";
            String str1 = "Could not retrieve value from ResourcesImpl#mDrawableCache";
            Log.e((String)localObject4, str1, localIllegalAccessException2);
          }
          localIllegalAccessException1 = localIllegalAccessException1;
          str1 = "Could not retrieve value from Resources#mResourcesImpl";
          Log.e("ResourcesFlusher", str1, localIllegalAccessException1);
          bool4 = false;
          localObject4 = null;
        }
      }
    }
  }
  
  private static boolean flushThemedResourcesCache(Object paramObject)
  {
    bool1 = true;
    bool2 = sThemedResourceCacheClazzFetched;
    if (!bool2) {
      localObject1 = "android.content.res.ThemedResourceCache";
    }
    try
    {
      localObject1 = Class.forName((String)localObject1);
      sThemedResourceCacheClazz = (Class)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      String str2;
      for (;;)
      {
        String str1 = "ResourcesFlusher";
        str2 = "Could not find ThemedResourceCache class";
        Log.e(str1, str2, localClassNotFoundException);
        continue;
        bool2 = sThemedResourceCache_mUnthemedEntriesFieldFetched;
        if (!bool2) {}
        try
        {
          Object localObject2 = sThemedResourceCacheClazz;
          str1 = "mUnthemedEntries";
          localObject2 = ((Class)localObject2).getDeclaredField(str1);
          sThemedResourceCache_mUnthemedEntriesField = (Field)localObject2;
          localObject2 = sThemedResourceCache_mUnthemedEntriesField;
          bool3 = true;
          ((Field)localObject2).setAccessible(bool3);
          sThemedResourceCache_mUnthemedEntriesFieldFetched = bool1;
          localObject2 = sThemedResourceCache_mUnthemedEntriesField;
          if (localObject2 == null)
          {
            bool2 = false;
            localObject2 = null;
          }
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          for (;;)
          {
            str1 = "ResourcesFlusher";
            str2 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field";
            Log.e(str1, str2, localNoSuchFieldException);
          }
          boolean bool3 = false;
          str1 = null;
          try
          {
            localObject3 = sThemedResourceCache_mUnthemedEntriesField;
            localObject3 = ((Field)localObject3).get(paramObject);
            localObject3 = (LongSparseArray)localObject3;
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            for (;;)
            {
              Object localObject3;
              str2 = "ResourcesFlusher";
              String str3 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries";
              Log.e(str2, str3, localIllegalAccessException);
              bool2 = false;
              localObject4 = null;
            }
            bool2 = false;
            Object localObject4 = null;
          }
          if (localObject3 != null)
          {
            ((LongSparseArray)localObject3).clear();
            bool2 = bool1;
          }
        }
      }
    }
    sThemedResourceCacheClazzFetched = bool1;
    Object localObject1 = sThemedResourceCacheClazz;
    if (localObject1 == null)
    {
      bool2 = false;
      localObject1 = null;
      return bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ResourcesFlusher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */