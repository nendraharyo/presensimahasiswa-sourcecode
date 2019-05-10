package android.support.v7.widget;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.AppCompatDelegate;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

public class VectorEnabledTintResources
  extends Resources
{
  public static final int MAX_SDK_WHERE_REQUIRED = 20;
  private final WeakReference mContextRef;
  
  public VectorEnabledTintResources(Context paramContext, Resources paramResources)
  {
    super((AssetManager)localObject, localDisplayMetrics, localConfiguration);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramContext);
    this.mContextRef = ((WeakReference)localObject);
  }
  
  public static boolean shouldBeUsed()
  {
    boolean bool = AppCompatDelegate.isCompatVectorFromResourcesEnabled();
    if (bool)
    {
      i = Build.VERSION.SDK_INT;
      int k = 20;
      if (i > k) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Object localObject = (Context)this.mContextRef.get();
    AppCompatDrawableManager localAppCompatDrawableManager;
    if (localObject != null) {
      localAppCompatDrawableManager = AppCompatDrawableManager.get();
    }
    for (localObject = localAppCompatDrawableManager.onDrawableLoadedFromResources((Context)localObject, this, paramInt);; localObject = super.getDrawable(paramInt)) {
      return (Drawable)localObject;
    }
  }
  
  final Drawable superGetDrawable(int paramInt)
  {
    return super.getDrawable(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\VectorEnabledTintResources.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */