package com.google.android.gms.common.api;

public class CommonStatusCodes
{
  public static final int API_NOT_AVAILABLE = 17;
  public static final int API_NOT_CONNECTED = 17;
  public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;
  public static final int AUTH_API_CLIENT_ERROR = 3002;
  public static final int AUTH_API_INVALID_CREDENTIALS = 3000;
  public static final int AUTH_API_SERVER_ERROR = 3003;
  public static final int AUTH_TOKEN_ERROR = 3004;
  public static final int AUTH_URL_RESOLUTION = 3005;
  public static final int CANCELED = 16;
  public static final int DEVELOPER_ERROR = 10;
  public static final int ERROR = 13;
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 14;
  public static final int INVALID_ACCOUNT = 5;
  public static final int LICENSE_CHECK_FAILED = 11;
  public static final int NETWORK_ERROR = 7;
  public static final int RESOLUTION_REQUIRED = 6;
  public static final int SERVICE_DISABLED = 3;
  public static final int SERVICE_INVALID = 9;
  public static final int SERVICE_MISSING = 1;
  public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
  public static final int SIGN_IN_REQUIRED = 4;
  public static final int SUCCESS = 0;
  public static final int SUCCESS_CACHE = 255;
  public static final int TIMEOUT = 15;
  
  public static String getStatusCodeString(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "unknown status code: ";
      localObject = str + paramInt;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = "SUCCESS_CACHE";
      continue;
      localObject = "SUCCESS";
      continue;
      localObject = "SERVICE_MISSING";
      continue;
      localObject = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      localObject = "SERVICE_DISABLED";
      continue;
      localObject = "SIGN_IN_REQUIRED";
      continue;
      localObject = "INVALID_ACCOUNT";
      continue;
      localObject = "RESOLUTION_REQUIRED";
      continue;
      localObject = "NETWORK_ERROR";
      continue;
      localObject = "INTERNAL_ERROR";
      continue;
      localObject = "SERVICE_INVALID";
      continue;
      localObject = "DEVELOPER_ERROR";
      continue;
      localObject = "LICENSE_CHECK_FAILED";
      continue;
      localObject = "ERROR";
      continue;
      localObject = "INTERRUPTED";
      continue;
      localObject = "TIMEOUT";
      continue;
      localObject = "CANCELED";
      continue;
      localObject = "API_NOT_CONNECTED";
      continue;
      localObject = "AUTH_API_INVALID_CREDENTIALS";
      continue;
      localObject = "AUTH_API_ACCESS_FORBIDDEN";
      continue;
      localObject = "AUTH_API_CLIENT_ERROR";
      continue;
      localObject = "AUTH_API_SERVER_ERROR";
      continue;
      localObject = "AUTH_TOKEN_ERROR";
      continue;
      localObject = "AUTH_URL_RESOLUTION";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\CommonStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */