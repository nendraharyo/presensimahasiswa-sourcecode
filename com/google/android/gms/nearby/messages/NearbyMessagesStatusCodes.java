package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.api.CommonStatusCodes;

public class NearbyMessagesStatusCodes
  extends CommonStatusCodes
{
  public static final int APP_NOT_OPTED_IN = 2802;
  public static final int APP_QUOTA_LIMIT_REACHED = 2804;
  public static final int BLE_ADVERTISING_UNSUPPORTED = 2821;
  public static final int BLE_SCANNING_UNSUPPORTED = 2822;
  public static final int BLUETOOTH_OFF = 2820;
  public static final int DISALLOWED_CALLING_CONTEXT = 2803;
  public static final int TOO_MANY_PENDING_INTENTS = 2801;
  
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
      str = "TOO_MANY_PENDING_INTENTS";
      continue;
      str = "APP_NOT_OPTED_IN";
      continue;
      str = "DISALLOWED_CALLING_CONTEXT";
      continue;
      str = "BLUETOOTH_OFF";
      continue;
      str = "BLE_ADVERTISING_UNSUPPORTED";
      continue;
      str = "BLE_SCANNING_UNSUPPORTED";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\NearbyMessagesStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */