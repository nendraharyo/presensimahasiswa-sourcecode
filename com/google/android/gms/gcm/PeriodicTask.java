package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PeriodicTask
  extends Task
{
  public static final Parcelable.Creator CREATOR;
  protected long mFlexInSeconds;
  protected long mIntervalInSeconds;
  
  static
  {
    PeriodicTask.1 local1 = new com/google/android/gms/gcm/PeriodicTask$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private PeriodicTask(Parcel paramParcel)
  {
    super(paramParcel);
    this.mIntervalInSeconds = l1;
    this.mFlexInSeconds = l1;
    l1 = paramParcel.readLong();
    this.mIntervalInSeconds = l1;
    l1 = paramParcel.readLong();
    long l2 = this.mIntervalInSeconds;
    l1 = Math.min(l1, l2);
    this.mFlexInSeconds = l1;
  }
  
  private PeriodicTask(PeriodicTask.Builder paramBuilder)
  {
    super(paramBuilder);
    this.mIntervalInSeconds = l1;
    this.mFlexInSeconds = l1;
    l1 = PeriodicTask.Builder.zza(paramBuilder);
    this.mIntervalInSeconds = l1;
    l1 = PeriodicTask.Builder.zzb(paramBuilder);
    long l2 = this.mIntervalInSeconds;
    l1 = Math.min(l1, l2);
    this.mFlexInSeconds = l1;
  }
  
  public long getFlex()
  {
    return this.mFlexInSeconds;
  }
  
  public long getPeriod()
  {
    return this.mIntervalInSeconds;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    long l = this.mIntervalInSeconds;
    paramBundle.putLong("period", l);
    l = this.mFlexInSeconds;
    paramBundle.putLong("period_flex", l);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = super.toString();
    localStringBuilder = localStringBuilder.append(str).append(" ").append("period=");
    long l = getPeriod();
    localStringBuilder = localStringBuilder.append(l).append(" ").append("flex=");
    l = getFlex();
    return l;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    long l = this.mIntervalInSeconds;
    paramParcel.writeLong(l);
    l = this.mFlexInSeconds;
    paramParcel.writeLong(l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\PeriodicTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */