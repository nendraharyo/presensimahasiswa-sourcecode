package com.google.android.gms.cast;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class CastStatusCodes
{
  public static final int APPLICATION_NOT_FOUND = 2004;
  public static final int APPLICATION_NOT_RUNNING = 2005;
  public static final int AUTHENTICATION_FAILED = 2000;
  public static final int CANCELED = 2002;
  public static final int ERROR_SERVICE_CREATION_FAILED = 2200;
  public static final int ERROR_SERVICE_DISCONNECTED = 2201;
  public static final int FAILED = 2100;
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 14;
  public static final int INVALID_REQUEST = 2001;
  public static final int MESSAGE_SEND_BUFFER_TOO_FULL = 2007;
  public static final int MESSAGE_TOO_LARGE = 2006;
  public static final int NETWORK_ERROR = 7;
  public static final int NOT_ALLOWED = 2003;
  public static final int REPLACED = 2103;
  public static final int SUCCESS = 0;
  public static final int TIMEOUT = 15;
  public static final int UNKNOWN_ERROR = 13;
  
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
      str = "SUCCESS";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "TIMEOUT";
      continue;
      str = "INTERRUPTED";
      continue;
      str = "AUTHENTICATION_FAILED";
      continue;
      str = "INVALID_REQUEST";
      continue;
      str = "CANCELED";
      continue;
      str = "NOT_ALLOWED";
      continue;
      str = "APPLICATION_NOT_FOUND";
      continue;
      str = "APPLICATION_NOT_RUNNING";
      continue;
      str = "MESSAGE_TOO_LARGE";
      continue;
      str = "MESSAGE_SEND_BUFFER_TOO_FULL";
      continue;
      str = "FAILED";
      continue;
      str = "REPLACED";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "UNKNOWN_ERROR";
      continue;
      str = "ERROR_SERVICE_CREATION_FAILED";
      continue;
      str = "ERROR_SERVICE_DISCONNECTED";
      continue;
      str = "STATUS_TIMED_OUT";
      continue;
      str = "STATUS_CANCELLED";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */