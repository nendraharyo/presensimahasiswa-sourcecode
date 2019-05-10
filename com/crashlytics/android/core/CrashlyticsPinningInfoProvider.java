package com.crashlytics.android.core;

import java.io.InputStream;

class CrashlyticsPinningInfoProvider
  implements io.fabric.sdk.android.services.network.PinningInfoProvider
{
  private final PinningInfoProvider pinningInfo;
  
  public CrashlyticsPinningInfoProvider(PinningInfoProvider paramPinningInfoProvider)
  {
    this.pinningInfo = paramPinningInfoProvider;
  }
  
  public String getKeyStorePassword()
  {
    return this.pinningInfo.getKeyStorePassword();
  }
  
  public InputStream getKeyStoreStream()
  {
    return this.pinningInfo.getKeyStoreStream();
  }
  
  public long getPinCreationTimeInMillis()
  {
    return -1;
  }
  
  public String[] getPins()
  {
    return this.pinningInfo.getPins();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsPinningInfoProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */