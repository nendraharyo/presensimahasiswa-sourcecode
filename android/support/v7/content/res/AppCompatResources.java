package android.support.v7.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.a.b;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class AppCompatResources
{
  private static final String LOG_TAG = "AppCompatResources";
  private static final ThreadLocal TL_TYPED_VALUE;
  private static final Object sColorStateCacheLock;
  private static final WeakHashMap sColorStateCaches;
  
  static
  {
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    TL_TYPED_VALUE = (ThreadLocal)localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>(0);
    sColorStateCaches = (WeakHashMap)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    sColorStateCacheLock = localObject;
  }
  
  private static void addColorStateListToCache(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    synchronized (sColorStateCacheLock)
    {
      Object localObject2 = sColorStateCaches;
      localObject2 = ((WeakHashMap)localObject2).get(paramContext);
      localObject2 = (SparseArray)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new android/util/SparseArray;
        ((SparseArray)localObject2).<init>();
        localObject4 = sColorStateCaches;
        ((WeakHashMap)localObject4).put(paramContext, localObject2);
      }
      Object localObject4 = new android/support/v7/content/res/AppCompatResources$ColorStateListCacheEntry;
      Object localObject5 = paramContext.getResources();
      localObject5 = ((Resources)localObject5).getConfiguration();
      ((AppCompatResources.ColorStateListCacheEntry)localObject4).<init>(paramColorStateList, (Configuration)localObject5);
      ((SparseArray)localObject2).append(paramInt, localObject4);
      return;
    }
  }
  
  private static ColorStateList getCachedColorStateList(Context paramContext, int paramInt)
  {
    synchronized (sColorStateCacheLock)
    {
      Object localObject2 = sColorStateCaches;
      localObject2 = ((WeakHashMap)localObject2).get(paramContext);
      localObject2 = (SparseArray)localObject2;
      if (localObject2 != null)
      {
        int i = ((SparseArray)localObject2).size();
        if (i > 0)
        {
          Object localObject4 = ((SparseArray)localObject2).get(paramInt);
          localObject4 = (AppCompatResources.ColorStateListCacheEntry)localObject4;
          if (localObject4 != null)
          {
            Configuration localConfiguration = ((AppCompatResources.ColorStateListCacheEntry)localObject4).configuration;
            Object localObject5 = paramContext.getResources();
            localObject5 = ((Resources)localObject5).getConfiguration();
            boolean bool = localConfiguration.equals((Configuration)localObject5);
            if (bool)
            {
              localObject2 = ((AppCompatResources.ColorStateListCacheEntry)localObject4).value;
              return (ColorStateList)localObject2;
            }
            ((SparseArray)localObject2).remove(paramInt);
          }
        }
      }
      localObject2 = null;
    }
  }
  
  public static ColorStateList getColorStateList(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    ColorStateList localColorStateList;
    if (i >= j) {
      localColorStateList = paramContext.getColorStateList(paramInt);
    }
    for (;;)
    {
      return localColorStateList;
      localColorStateList = getCachedColorStateList(paramContext, paramInt);
      if (localColorStateList == null)
      {
        localColorStateList = inflateColorStateList(paramContext, paramInt);
        if (localColorStateList != null) {
          addColorStateListToCache(paramContext, paramInt, localColorStateList);
        } else {
          localColorStateList = b.b(paramContext, paramInt);
        }
      }
    }
  }
  
  public static Drawable getDrawable(Context paramContext, int paramInt)
  {
    return AppCompatDrawableManager.get().getDrawable(paramContext, paramInt);
  }
  
  private static TypedValue getTypedValue()
  {
    TypedValue localTypedValue = (TypedValue)TL_TYPED_VALUE.get();
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      ThreadLocal localThreadLocal = TL_TYPED_VALUE;
      localThreadLocal.set(localTypedValue);
    }
    return localTypedValue;
  }
  
  private static ColorStateList inflateColorStateList(Context paramContext, int paramInt)
  {
    ColorStateList localColorStateList = null;
    boolean bool = isColorInt(paramContext, paramInt);
    if (bool) {}
    for (;;)
    {
      return localColorStateList;
      Resources localResources = paramContext.getResources();
      Object localObject1 = localResources.getXml(paramInt);
      try
      {
        localObject2 = paramContext.getTheme();
        localColorStateList = AppCompatColorStateListInflater.createFromXml(localResources, (XmlPullParser)localObject1, (Resources.Theme)localObject2);
      }
      catch (Exception localException)
      {
        localObject1 = "AppCompatResources";
        Object localObject2 = "Failed to inflate ColorStateList, leaving it to the framework";
        Log.e((String)localObject1, (String)localObject2, localException);
      }
    }
  }
  
  private static boolean isColorInt(Context paramContext, int paramInt)
  {
    boolean bool = true;
    Resources localResources = paramContext.getResources();
    TypedValue localTypedValue = getTypedValue();
    localResources.getValue(paramInt, localTypedValue, bool);
    int i = localTypedValue.type;
    int j = 28;
    if (i >= j)
    {
      i = localTypedValue.type;
      int k = 31;
      if (i > k) {}
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\content\res\AppCompatResources.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */