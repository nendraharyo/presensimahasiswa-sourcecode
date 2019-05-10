package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class ConnectionResult
  implements SafeParcelable
{
  public static final int API_UNAVAILABLE = 16;
  public static final int CANCELED = 13;
  public static final Parcelable.Creator CREATOR;
  public static final int DEVELOPER_ERROR = 10;
  public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 15;
  public static final int INVALID_ACCOUNT = 5;
  public static final int LICENSE_CHECK_FAILED = 11;
  public static final int NETWORK_ERROR = 7;
  public static final int RESOLUTION_REQUIRED = 6;
  public static final int RESTRICTED_PROFILE = 20;
  public static final int SERVICE_DISABLED = 3;
  public static final int SERVICE_INVALID = 9;
  public static final int SERVICE_MISSING = 1;
  public static final int SERVICE_MISSING_PERMISSION = 19;
  public static final int SERVICE_UPDATING = 18;
  public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
  public static final int SIGN_IN_FAILED = 17;
  public static final int SIGN_IN_REQUIRED = 4;
  public static final int SUCCESS = 0;
  public static final int TIMEOUT = 14;
  public static final ConnectionResult zzafB;
  private final PendingIntent mPendingIntent;
  final int mVersionCode;
  private final int zzade;
  private final String zzafC;
  
  static
  {
    Object localObject = new com/google/android/gms/common/ConnectionResult;
    ((ConnectionResult)localObject).<init>(0);
    zzafB = (ConnectionResult)localObject;
    localObject = new com/google/android/gms/common/zzb;
    ((zzb)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  public ConnectionResult(int paramInt)
  {
    this(paramInt, null, null);
  }
  
  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    this.mVersionCode = paramInt1;
    this.zzade = paramInt2;
    this.mPendingIntent = paramPendingIntent;
    this.zzafC = paramString;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  static String getStatusString(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    case 12: 
    default: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("UNKNOWN_ERROR_CODE(").append(paramInt);
      String str = ")";
      localObject = str;
    }
    for (;;)
    {
      return (String)localObject;
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
      localObject = "CANCELED";
      continue;
      localObject = "TIMEOUT";
      continue;
      localObject = "INTERRUPTED";
      continue;
      localObject = "API_UNAVAILABLE";
      continue;
      localObject = "SIGN_IN_FAILED";
      continue;
      localObject = "SERVICE_UPDATING";
      continue;
      localObject = "SERVICE_MISSING_PERMISSION";
      continue;
      localObject = "RESTRICTED_PROFILE";
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ConnectionResult;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ConnectionResult)paramObject;
        int i = this.zzade;
        int j = ((ConnectionResult)paramObject).zzade;
        if (i == j)
        {
          Object localObject1 = this.mPendingIntent;
          Object localObject2 = ((ConnectionResult)paramObject).mPendingIntent;
          boolean bool3 = zzw.equal(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = this.zzafC;
            localObject2 = ((ConnectionResult)paramObject).zzafC;
            bool3 = zzw.equal(localObject1, localObject2);
            if (bool3) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int getErrorCode()
  {
    return this.zzade;
  }
  
  public String getErrorMessage()
  {
    return this.zzafC;
  }
  
  public PendingIntent getResolution()
  {
    return this.mPendingIntent;
  }
  
  public boolean hasResolution()
  {
    int i = this.zzade;
    PendingIntent localPendingIntent;
    if (i != 0)
    {
      localPendingIntent = this.mPendingIntent;
      if (localPendingIntent != null) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localPendingIntent = null;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.zzade);
    arrayOfObject[0] = localObject;
    localObject = this.mPendingIntent;
    arrayOfObject[1] = localObject;
    localObject = this.zzafC;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isSuccess()
  {
    int i = this.zzade;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void startResolutionForResult(Activity paramActivity, int paramInt)
  {
    boolean bool = hasResolution();
    if (!bool) {}
    for (;;)
    {
      return;
      IntentSender localIntentSender = this.mPendingIntent.getIntentSender();
      paramActivity.startIntentSenderForResult(localIntentSender, paramInt, null, 0, 0, 0);
    }
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = getStatusString(this.zzade);
    localzza = localzza.zzg("statusCode", localObject);
    localObject = this.mPendingIntent;
    localzza = localzza.zzg("resolution", localObject);
    localObject = this.zzafC;
    return localzza.zzg("message", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\ConnectionResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */