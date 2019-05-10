package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OneoffTask
  extends Task
{
  public static final Parcelable.Creator CREATOR;
  private final long zzaLW;
  private final long zzaLX;
  
  static
  {
    OneoffTask.1 local1 = new com/google/android/gms/gcm/OneoffTask$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private OneoffTask(Parcel paramParcel)
  {
    super(paramParcel);
    long l = paramParcel.readLong();
    this.zzaLW = l;
    l = paramParcel.readLong();
    this.zzaLX = l;
  }
  
  private OneoffTask(OneoffTask.Builder paramBuilder)
  {
    super(paramBuilder);
    long l = OneoffTask.Builder.zza(paramBuilder);
    this.zzaLW = l;
    l = OneoffTask.Builder.zzb(paramBuilder);
    this.zzaLX = l;
  }
  
  public long getWindowEnd()
  {
    return this.zzaLX;
  }
  
  public long getWindowStart()
  {
    return this.zzaLW;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    long l = this.zzaLW;
    paramBundle.putLong("window_start", l);
    l = this.zzaLX;
    paramBundle.putLong("window_end", l);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = super.toString();
    localStringBuilder = localStringBuilder.append(str).append(" ").append("windowStart=");
    long l = getWindowStart();
    localStringBuilder = localStringBuilder.append(l).append(" ").append("windowEnd=");
    l = getWindowEnd();
    return l;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    long l = this.zzaLW;
    paramParcel.writeLong(l);
    l = this.zzaLX;
    paramParcel.writeLong(l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\OneoffTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */