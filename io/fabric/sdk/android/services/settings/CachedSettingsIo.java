package io.fabric.sdk.android.services.settings;

import org.json.JSONObject;

public abstract interface CachedSettingsIo
{
  public abstract JSONObject readCachedSettings();
  
  public abstract void writeCachedSettings(long paramLong, JSONObject paramJSONObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\CachedSettingsIo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */