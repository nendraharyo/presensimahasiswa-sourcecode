package com.google.android.gms.wearable;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class WearableStatusCodes
  extends CommonStatusCodes
{
  public static final int ASSET_UNAVAILABLE = 4005;
  public static final int DATA_ITEM_TOO_LARGE = 4003;
  public static final int DUPLICATE_CAPABILITY = 4006;
  public static final int DUPLICATE_LISTENER = 4001;
  public static final int INVALID_TARGET_NODE = 4004;
  public static final int TARGET_NODE_NOT_CONNECTED = 4000;
  public static final int UNKNOWN_CAPABILITY = 4007;
  public static final int UNKNOWN_LISTENER = 4002;
  public static final int WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED = 4008;
  
  public static String getStatusCodeString(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = CommonStatusCodes.getStatusCodeString(paramInt);
    }
    for (;;)
    {
      return str;
      str = "TARGET_NODE_NOT_CONNECTED";
      continue;
      str = "DUPLICATE_LISTENER";
      continue;
      str = "UNKNOWN_LISTENER";
      continue;
      str = "DATA_ITEM_TOO_LARGE";
      continue;
      str = "INVALID_TARGET_NODE";
      continue;
      str = "ASSET_UNAVAILABLE";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */