package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class TintContextWrapper
  extends ContextWrapper
{
  private static final Object CACHE_LOCK;
  private static ArrayList sCache;
  private final Resources mResources;
  private final Resources.Theme mTheme;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    CACHE_LOCK = localObject;
  }
  
  private TintContextWrapper(Context paramContext)
  {
    super(paramContext);
    boolean bool = VectorEnabledTintResources.shouldBeUsed();
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = new android/support/v7/widget/VectorEnabledTintResources;
      localObject2 = paramContext.getResources();
      ((VectorEnabledTintResources)localObject1).<init>(this, (Resources)localObject2);
      this.mResources = ((Resources)localObject1);
      localObject1 = this.mResources.newTheme();
      this.mTheme = ((Resources.Theme)localObject1);
      localObject1 = this.mTheme;
      localObject2 = paramContext.getTheme();
      ((Resources.Theme)localObject1).setTo((Resources.Theme)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = new android/support/v7/widget/TintResources;
      localObject2 = paramContext.getResources();
      ((TintResources)localObject1).<init>(this, (Resources)localObject2);
      this.mResources = ((Resources)localObject1);
      bool = false;
      localObject1 = null;
      this.mTheme = null;
    }
  }
  
  private static boolean shouldWrap(Context paramContext)
  {
    boolean bool1 = false;
    boolean bool2 = paramContext instanceof TintContextWrapper;
    if (!bool2)
    {
      Resources localResources = paramContext.getResources();
      bool2 = localResources instanceof TintResources;
      if (!bool2)
      {
        localResources = paramContext.getResources();
        bool2 = localResources instanceof VectorEnabledTintResources;
        if (!bool2) {
          break label41;
        }
      }
    }
    for (;;)
    {
      return bool1;
      label41:
      int i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j)
      {
        boolean bool3 = VectorEnabledTintResources.shouldBeUsed();
        if (!bool3) {}
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  public static Context wrap(Context paramContext)
  {
    boolean bool = shouldWrap(paramContext);
    if (bool) {}
    synchronized (CACHE_LOCK)
    {
      Object localObject2 = sCache;
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        sCache = (ArrayList)localObject2;
      }
      Object localObject4;
      do
      {
        localObject2 = new android/support/v7/widget/TintContextWrapper;
        ((TintContextWrapper)localObject2).<init>(paramContext);
        ArrayList localArrayList = sCache;
        localObject4 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject4).<init>(localObject2);
        localArrayList.add(localObject4);
        paramContext = (Context)localObject2;
        return paramContext;
        localObject2 = sCache;
        i = ((ArrayList)localObject2).size() + -1;
        for (j = i; j >= 0; j = i)
        {
          localObject2 = sCache;
          localObject2 = ((ArrayList)localObject2).get(j);
          localObject2 = (WeakReference)localObject2;
          if (localObject2 != null)
          {
            localObject2 = ((WeakReference)localObject2).get();
            if (localObject2 != null) {}
          }
          else
          {
            localObject2 = sCache;
            ((ArrayList)localObject2).remove(j);
          }
          i = j + -1;
        }
        localObject2 = sCache;
        i = ((ArrayList)localObject2).size() + -1;
        j = i;
      } while (j < 0);
      localObject2 = sCache;
      localObject2 = ((ArrayList)localObject2).get(j);
      localObject2 = (WeakReference)localObject2;
      if (localObject2 != null) {
        localObject2 = ((WeakReference)localObject2).get();
      }
      for (localObject2 = (TintContextWrapper)localObject2;; localObject2 = null)
      {
        if (localObject2 == null) {
          break label223;
        }
        localObject4 = ((TintContextWrapper)localObject2).getBaseContext();
        if (localObject4 != paramContext) {
          break label223;
        }
        paramContext = (Context)localObject2;
        break;
        i = 0;
      }
      label223:
      int i = j + -1;
      int j = i;
    }
  }
  
  public AssetManager getAssets()
  {
    return this.mResources.getAssets();
  }
  
  public Resources getResources()
  {
    return this.mResources;
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme = this.mTheme;
    if (localTheme == null) {}
    for (localTheme = super.getTheme();; localTheme = this.mTheme) {
      return localTheme;
    }
  }
  
  public void setTheme(int paramInt)
  {
    Resources.Theme localTheme = this.mTheme;
    if (localTheme == null) {
      super.setTheme(paramInt);
    }
    for (;;)
    {
      return;
      localTheme = this.mTheme;
      boolean bool = true;
      localTheme.applyStyle(paramInt, bool);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\TintContextWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */