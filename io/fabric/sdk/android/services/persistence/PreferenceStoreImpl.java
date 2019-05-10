package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import io.fabric.sdk.android.Kit;

public class PreferenceStoreImpl
  implements PreferenceStore
{
  private final Context context;
  private final String preferenceName;
  private final SharedPreferences sharedPreferences;
  
  public PreferenceStoreImpl(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot get directory before context has been set. Call Fabric.with() first");
      throw ((Throwable)localObject);
    }
    this.context = paramContext;
    this.preferenceName = paramString;
    Object localObject = this.context;
    String str = this.preferenceName;
    localObject = ((Context)localObject).getSharedPreferences(str, 0);
    this.sharedPreferences = ((SharedPreferences)localObject);
  }
  
  public PreferenceStoreImpl(Kit paramKit)
  {
    this(localContext, str);
  }
  
  public SharedPreferences.Editor edit()
  {
    return this.sharedPreferences.edit();
  }
  
  public SharedPreferences get()
  {
    return this.sharedPreferences;
  }
  
  public boolean save(SharedPreferences.Editor paramEditor)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 9;
    if (i >= j) {
      paramEditor.apply();
    }
    boolean bool;
    for (i = 1;; bool = paramEditor.commit()) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\persistence\PreferenceStoreImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */