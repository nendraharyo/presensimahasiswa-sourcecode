package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.support.v4.h.g;

class AppCompatDrawableManager$ColorFilterLruCache
  extends g
{
  public AppCompatDrawableManager$ColorFilterLruCache(int paramInt)
  {
    super(paramInt);
  }
  
  private static int generateCacheKey(int paramInt, PorterDuff.Mode paramMode)
  {
    int i = (paramInt + 31) * 31;
    int j = paramMode.hashCode();
    return i + j;
  }
  
  PorterDuffColorFilter get(int paramInt, PorterDuff.Mode paramMode)
  {
    Integer localInteger = Integer.valueOf(generateCacheKey(paramInt, paramMode));
    return (PorterDuffColorFilter)get(localInteger);
  }
  
  PorterDuffColorFilter put(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    Integer localInteger = Integer.valueOf(generateCacheKey(paramInt, paramMode));
    return (PorterDuffColorFilter)put(localInteger, paramPorterDuffColorFilter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatDrawableManager$ColorFilterLruCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */