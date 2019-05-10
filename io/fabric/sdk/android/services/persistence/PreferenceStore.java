package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public abstract interface PreferenceStore
{
  public abstract SharedPreferences.Editor edit();
  
  public abstract SharedPreferences get();
  
  public abstract boolean save(SharedPreferences.Editor paramEditor);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\persistence\PreferenceStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */