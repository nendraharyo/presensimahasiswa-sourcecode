package com.google.android.gms.location.places;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;

public class PlacesStatusCodes
  extends CommonStatusCodes
{
  public static final int ACCESS_NOT_CONFIGURED = 9003;
  public static final int DEVICE_RATE_LIMIT_EXCEEDED = 9006;
  public static final int INVALID_APP = 9008;
  public static final int INVALID_ARGUMENT = 9004;
  public static final int KEY_EXPIRED = 9007;
  public static final int KEY_INVALID = 9002;
  public static final int RATE_LIMIT_EXCEEDED = 9005;
  public static final int USAGE_LIMIT_EXCEEDED = 9001;
  
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
      str = "PLACES_API_QUOTA_FAILED";
      continue;
      str = "PLACES_API_USAGE_LIMIT_EXCEEDED";
      continue;
      str = "PLACES_API_KEY_INVALID";
      continue;
      str = "PLACES_API_ACCESS_NOT_CONFIGURED";
      continue;
      str = "PLACES_API_INVALID_ARGUMENT";
      continue;
      str = "PLACES_API_RATE_LIMIT_EXCEEDED";
      continue;
      str = "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";
      continue;
      str = "PLACES_API_KEY_EXPIRED";
      continue;
      str = "PLACE_ALIAS_NOT_FOUND";
      continue;
      str = "PLACE_PROXIMITY_UNKNOWN";
      continue;
      str = "NEARBY_ALERTS_NOT_AVAILABLE";
      continue;
      str = "PLACES_API_INVALID_APP";
    }
  }
  
  public static Status zzhU(int paramInt)
  {
    String str = getStatusCodeString(paramInt);
    return zzk(paramInt, str);
  }
  
  public static Status zzk(int paramInt, String paramString)
  {
    zzx.zzz(paramString);
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt, paramString);
    return localStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlacesStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */