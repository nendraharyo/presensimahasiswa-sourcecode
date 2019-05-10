package io.fabric.sdk.android.services.cache;

import android.content.Context;

public abstract interface ValueCache
{
  public abstract Object get(Context paramContext, ValueLoader paramValueLoader);
  
  public abstract void invalidate(Context paramContext);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\cache\ValueCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */