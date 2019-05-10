package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class ConnectionsStatusCodes
  extends CommonStatusCodes
{
  public static final int STATUS_ALREADY_ADVERTISING = 8001;
  public static final int STATUS_ALREADY_CONNECTED_TO_ENDPOINT = 8003;
  public static final int STATUS_ALREADY_DISCOVERING = 8002;
  public static final int STATUS_CONNECTION_REJECTED = 8004;
  public static final int STATUS_ERROR = 13;
  public static final int STATUS_NETWORK_NOT_CONNECTED = 8000;
  public static final int STATUS_NOT_CONNECTED_TO_ENDPOINT = 8005;
  public static final int STATUS_OK;
  
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
      str = "STATUS_NETWORK_NOT_CONNECTED";
      continue;
      str = "STATUS_ALREADY_ADVERTISING";
      continue;
      str = "STATUS_ALREADY_DISCOVERING";
      continue;
      str = "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
      continue;
      str = "STATUS_CONNECTION_REJECTED";
      continue;
      str = "STATUS_NOT_CONNECTED_TO_ENDPOINT";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\connection\ConnectionsStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */