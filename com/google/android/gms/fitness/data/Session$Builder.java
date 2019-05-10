package com.google.android.gms.fitness.data;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

public class Session$Builder
{
  private String mName;
  private long zzRD;
  private long zzavV;
  private int zzawf;
  private Application zzaws;
  private String zzaxk;
  private String zzaxl;
  private Long zzaxm;
  
  public Session$Builder()
  {
    this.zzRD = l;
    this.zzavV = l;
    this.mName = null;
    this.zzawf = 4;
  }
  
  public Session build()
  {
    long l1 = 0L;
    boolean bool1 = true;
    boolean bool2 = false;
    long l2 = this.zzRD;
    boolean bool3 = l2 < l1;
    StringBuilder localStringBuilder;
    if (bool3)
    {
      bool3 = bool1;
      String str = "Start time should be specified.";
      zzx.zza(bool3, str);
      l2 = this.zzavV;
      bool3 = l2 < l1;
      if (bool3)
      {
        l2 = this.zzavV;
        l1 = this.zzRD;
        bool3 = l2 < l1;
        if (!bool3) {}
      }
      else
      {
        bool2 = bool1;
      }
      zzx.zza(bool2, "End time should be later than start time.");
      localObject = this.zzaxk;
      if (localObject == null)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject = this.mName;
        if (localObject != null) {
          break label180;
        }
      }
    }
    label180:
    for (Object localObject = "";; localObject = this.mName)
    {
      localObject = localStringBuilder.append((String)localObject);
      long l3 = this.zzRD;
      localObject = l3;
      this.zzaxk = ((String)localObject);
      localObject = new com/google/android/gms/fitness/data/Session;
      ((Session)localObject).<init>(this, null);
      return (Session)localObject;
      bool3 = false;
      localObject = null;
      break;
    }
  }
  
  public Builder setActiveTime(long paramLong, TimeUnit paramTimeUnit)
  {
    Long localLong = Long.valueOf(paramTimeUnit.toMillis(paramLong));
    this.zzaxm = localLong;
    return this;
  }
  
  public Builder setActivity(String paramString)
  {
    int i = FitnessActivities.zzdm(paramString);
    return zzfa(i);
  }
  
  public Builder setDescription(String paramString)
  {
    int i = 1000;
    int j = 1;
    int k = paramString.length();
    if (k <= i) {}
    int m;
    for (k = j;; m = 0)
    {
      Object[] arrayOfObject = new Object[j];
      Integer localInteger = Integer.valueOf(i);
      arrayOfObject[0] = localInteger;
      zzx.zzb(k, "Session description cannot exceed %d characters", arrayOfObject);
      this.zzaxl = paramString;
      return this;
    }
  }
  
  public Builder setEndTime(long paramLong, TimeUnit paramTimeUnit)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      zzx.zza(bool, "End time should be positive.");
      l = paramTimeUnit.toMillis(paramLong);
      this.zzavV = l;
      return this;
    }
  }
  
  public Builder setIdentifier(String paramString)
  {
    if (paramString != null)
    {
      i = TextUtils.getTrimmedLength(paramString);
      if (i <= 0) {}
    }
    int j;
    for (int i = 1;; j = 0)
    {
      zzx.zzac(i);
      this.zzaxk = paramString;
      return this;
    }
  }
  
  public Builder setName(String paramString)
  {
    int i = 100;
    int j = 1;
    int k = paramString.length();
    if (k <= i) {}
    int m;
    for (k = j;; m = 0)
    {
      Object[] arrayOfObject = new Object[j];
      Integer localInteger = Integer.valueOf(i);
      arrayOfObject[0] = localInteger;
      zzx.zzb(k, "Session name cannot exceed %d characters", arrayOfObject);
      this.mName = paramString;
      return this;
    }
  }
  
  public Builder setStartTime(long paramLong, TimeUnit paramTimeUnit)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      zzx.zza(bool, "Start time should be positive.");
      l = paramTimeUnit.toMillis(paramLong);
      this.zzRD = l;
      return this;
    }
  }
  
  public Builder zzfa(int paramInt)
  {
    this.zzawf = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Session$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */