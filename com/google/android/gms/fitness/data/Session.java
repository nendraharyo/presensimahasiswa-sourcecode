package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

public class Session
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String EXTRA_SESSION = "vnd.google.fitness.session";
  public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
  private final String mName;
  private final int mVersionCode;
  private final long zzRD;
  private final long zzavV;
  private final int zzawf;
  private final Application zzaws;
  private final String zzaxk;
  private final String zzaxl;
  private final Long zzaxm;
  
  static
  {
    zzq localzzq = new com/google/android/gms/fitness/data/zzq;
    localzzq.<init>();
    CREATOR = localzzq;
  }
  
  Session(int paramInt1, long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, int paramInt2, Application paramApplication, Long paramLong)
  {
    this.mVersionCode = paramInt1;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    this.mName = paramString1;
    this.zzaxk = paramString2;
    this.zzaxl = paramString3;
    this.zzawf = paramInt2;
    this.zzaws = paramApplication;
    this.zzaxm = paramLong;
  }
  
  public Session(long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, int paramInt, Application paramApplication, Long paramLong)
  {
    this(3, paramLong1, paramLong2, paramString1, paramString2, paramString3, paramInt, paramApplication, paramLong);
  }
  
  private Session(Session.Builder paramBuilder)
  {
    this(l1, l2, str1, str2, str3, i, localApplication, localLong);
  }
  
  public static Session extract(Intent paramIntent)
  {
    if (paramIntent == null) {}
    Parcelable.Creator localCreator;
    for (Session localSession = null;; localSession = (Session)zzc.zza(paramIntent, "vnd.google.fitness.session", localCreator))
    {
      return localSession;
      localCreator = CREATOR;
    }
  }
  
  public static String getMimeType(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "vnd.google.fitness.session/" + paramString;
  }
  
  private boolean zza(Session paramSession)
  {
    long l1 = this.zzRD;
    long l2 = paramSession.zzRD;
    boolean bool = l1 < l2;
    Object localObject1;
    int i;
    if (!bool)
    {
      l1 = this.zzavV;
      l2 = paramSession.zzavV;
      bool = l1 < l2;
      if (!bool)
      {
        localObject1 = this.mName;
        Object localObject2 = paramSession.mName;
        bool = zzw.equal(localObject1, localObject2);
        if (bool)
        {
          localObject1 = this.zzaxk;
          localObject2 = paramSession.zzaxk;
          bool = zzw.equal(localObject1, localObject2);
          if (bool)
          {
            localObject1 = this.zzaxl;
            localObject2 = paramSession.zzaxl;
            bool = zzw.equal(localObject1, localObject2);
            if (bool)
            {
              localObject1 = this.zzaws;
              localObject2 = paramSession.zzaws;
              bool = zzw.equal(localObject1, localObject2);
              if (bool)
              {
                i = this.zzawf;
                int k = paramSession.zzawf;
                if (i == k) {
                  i = 1;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof Session;
      if (!bool) {
        break label33;
      }
      paramObject = (Session)paramObject;
      bool = zza((Session)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public long getActiveTime(TimeUnit paramTimeUnit)
  {
    Long localLong = this.zzaxm;
    boolean bool;
    if (localLong != null) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "Active time is not set");
      long l = this.zzaxm.longValue();
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      return paramTimeUnit.convert(l, localTimeUnit);
      bool = false;
      localLong = null;
    }
  }
  
  public String getActivity()
  {
    return FitnessActivities.getName(this.zzawf);
  }
  
  public String getAppPackageName()
  {
    Object localObject = this.zzaws;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaws.getPackageName()) {
      return (String)localObject;
    }
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzavV;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public String getIdentifier()
  {
    return this.zzaxk;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public long getStartTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzRD;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean hasActiveTime()
  {
    Long localLong = this.zzaxm;
    boolean bool;
    if (localLong != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLong = null;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Long.valueOf(this.zzRD);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzavV);
    arrayOfObject[1] = localObject;
    localObject = this.zzaxk;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isOngoing()
  {
    long l1 = this.zzavV;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(this.zzRD);
    localzza = localzza.zzg("startTime", localObject);
    localObject = Long.valueOf(this.zzavV);
    localzza = localzza.zzg("endTime", localObject);
    localObject = this.mName;
    localzza = localzza.zzg("name", localObject);
    localObject = this.zzaxk;
    localzza = localzza.zzg("identifier", localObject);
    localObject = this.zzaxl;
    localzza = localzza.zzg("description", localObject);
    localObject = Integer.valueOf(this.zzawf);
    localzza = localzza.zzg("activity", localObject);
    localObject = this.zzaws;
    return localzza.zzg("application", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return this.zzRD;
  }
  
  public int zzub()
  {
    return this.zzawf;
  }
  
  public long zzud()
  {
    return this.zzavV;
  }
  
  public Application zzum()
  {
    return this.zzaws;
  }
  
  public Long zzuw()
  {
    return this.zzaxm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Session.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */