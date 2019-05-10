package com.crashlytics.android.beta;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.DeviceIdentifierProvider;
import java.util.Collections;
import java.util.Map;

public class Beta
  extends Kit
  implements DeviceIdentifierProvider
{
  public static final String TAG = "Beta";
  
  public static Beta getInstance()
  {
    return (Beta)Fabric.getKit(Beta.class);
  }
  
  protected Boolean doInBackground()
  {
    Fabric.getLogger().d("Beta", "Beta kit initializing...");
    return Boolean.valueOf(true);
  }
  
  public Map getDeviceIdentifiers()
  {
    return Collections.emptyMap();
  }
  
  public String getIdentifier()
  {
    return "com.crashlytics.sdk.android:beta";
  }
  
  public String getVersion()
  {
    return "1.2.10.27";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\beta\Beta.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */