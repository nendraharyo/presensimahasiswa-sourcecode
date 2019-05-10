package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

public final class LocationStatusCodes
{
  public static final int ERROR = 1;
  public static final int GEOFENCE_NOT_AVAILABLE = 1000;
  public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
  public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
  public static final int SUCCESS;
  
  public static int zzhy(int paramInt)
  {
    int i = 1;
    if ((paramInt < 0) || (paramInt > i))
    {
      int j = 1000;
      if (j > paramInt) {
        break label31;
      }
      j = 1002;
      if (paramInt > j) {
        break label31;
      }
    }
    for (;;)
    {
      return paramInt;
      label31:
      paramInt = i;
    }
  }
  
  public static Status zzhz(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      Status localStatus = new com/google/android/gms/common/api/Status;
      localStatus.<init>(paramInt);
      return localStatus;
      paramInt = 13;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */