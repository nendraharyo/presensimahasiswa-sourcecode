package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class EventParcel
  implements SafeParcelable
{
  public static final zzk CREATOR;
  public final String name;
  public final int versionCode;
  public final EventParams zzaVV;
  public final String zzaVW;
  public final long zzaVX;
  
  static
  {
    zzk localzzk = new com/google/android/gms/measurement/internal/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  EventParcel(int paramInt, String paramString1, EventParams paramEventParams, String paramString2, long paramLong)
  {
    this.versionCode = paramInt;
    this.name = paramString1;
    this.zzaVV = paramEventParams;
    this.zzaVW = paramString2;
    this.zzaVX = paramLong;
  }
  
  public EventParcel(String paramString1, EventParams paramEventParams, String paramString2, long paramLong)
  {
    this.versionCode = 1;
    this.name = paramString1;
    this.zzaVV = paramEventParams;
    this.zzaVW = paramString2;
    this.zzaVX = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("origin=");
    Object localObject = this.zzaVW;
    localStringBuilder = localStringBuilder.append((String)localObject).append(",name=");
    localObject = this.name;
    localStringBuilder = localStringBuilder.append((String)localObject).append(",params=");
    localObject = this.zzaVV;
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\EventParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */