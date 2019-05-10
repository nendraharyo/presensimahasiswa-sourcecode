package com.google.android.gms.drive;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class DriveStatusCodes
  extends CommonStatusCodes
{
  public static final int DRIVE_CONTENTS_TOO_LARGE = 1508;
  public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
  public static final int DRIVE_RATE_LIMIT_EXCEEDED = 1507;
  public static final int DRIVE_RESOURCE_NOT_AVAILABLE = 1502;
  
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
      str = "DRIVE_RESOURCE_ALREADY_EXISTS";
      continue;
      str = "DRIVE_RESOURCE_NOT_AVAILABLE";
      continue;
      str = "DRIVE_RESOURCE_FORBIDDEN";
      continue;
      str = "DRIVE_REALTIME_CONCURRENT_CREATION";
      continue;
      str = "DRIVE_REALTIME_INVALID_COMPOUND_OP";
      continue;
      str = "DRIVE_FULL_SYNC_REQUIRED";
      continue;
      str = "DRIVE_RATE_LIMIT_EXCEEDED";
      continue;
      str = "DRIVE_CONTENTS_TOO_LARGE";
      continue;
      str = "DRIVE_RESOURCE_PERMISSION_FORBIDDEN";
      continue;
      str = "DRIVE_INAPPLICABLE_OPERATION";
      continue;
      str = "DRIVE_INSUFFICIENT_SCOPES";
      continue;
      str = "DRIVE_REALTIME_TOKEN_REFRESH_REQUIRED";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\DriveStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */