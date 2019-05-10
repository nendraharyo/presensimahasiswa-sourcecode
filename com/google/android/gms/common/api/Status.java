package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class Status
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final Status zzagC;
  public static final Status zzagD;
  public static final Status zzagE;
  public static final Status zzagF;
  public static final Status zzagG;
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final int zzade;
  private final String zzafC;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(0);
    zzagC = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(14);
    zzagD = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(8);
    zzagE = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(15);
    zzagF = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(16);
    zzagG = (Status)localObject;
    localObject = new com/google/android/gms/common/api/zzc;
    ((zzc)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.mVersionCode = paramInt1;
    this.zzade = paramInt2;
    this.zzafC = paramString;
    this.mPendingIntent = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  private String zzpd()
  {
    String str = this.zzafC;
    if (str != null) {}
    int i;
    for (str = this.zzafC;; str = CommonStatusCodes.getStatusCodeString(i))
    {
      return str;
      i = this.zzade;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof Status;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (Status)paramObject;
      int i = this.mVersionCode;
      int j = ((Status)paramObject).mVersionCode;
      if (i == j)
      {
        i = this.zzade;
        j = ((Status)paramObject).zzade;
        if (i == j)
        {
          Object localObject1 = this.zzafC;
          Object localObject2 = ((Status)paramObject).zzafC;
          boolean bool3 = zzw.equal(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = this.mPendingIntent;
            localObject2 = ((Status)paramObject).mPendingIntent;
            bool3 = zzw.equal(localObject1, localObject2);
            if (bool3) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  public PendingIntent getResolution()
  {
    return this.mPendingIntent;
  }
  
  public Status getStatus()
  {
    return this;
  }
  
  public int getStatusCode()
  {
    return this.zzade;
  }
  
  public String getStatusMessage()
  {
    return this.zzafC;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean hasResolution()
  {
    PendingIntent localPendingIntent = this.mPendingIntent;
    boolean bool;
    if (localPendingIntent != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localPendingIntent = null;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = Integer.valueOf(this.mVersionCode);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzade);
    arrayOfObject[1] = localObject;
    localObject = this.zzafC;
    arrayOfObject[2] = localObject;
    localObject = this.mPendingIntent;
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isCanceled()
  {
    int i = this.zzade;
    int k = 16;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isInterrupted()
  {
    int i = this.zzade;
    int k = 14;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isSuccess()
  {
    int i = this.zzade;
    if (i <= 0) {}
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
    Object localObject = zzpd();
    localzza = localzza.zzg("statusCode", localObject);
    localObject = this.mPendingIntent;
    return localzza.zzg("resolution", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  PendingIntent zzpc()
  {
    return this.mPendingIntent;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Status.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */