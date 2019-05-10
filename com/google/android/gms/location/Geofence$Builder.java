package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;

public final class Geofence$Builder
{
  private String zzEY = null;
  private int zzaNC = 0;
  private long zzaND = Long.MIN_VALUE;
  private short zzaNE;
  private double zzaNF;
  private double zzaNG;
  private float zzaNH;
  private int zzaNI;
  private int zzaNJ;
  
  public Geofence$Builder()
  {
    this.zzaNE = s;
    this.zzaNI = 0;
    this.zzaNJ = s;
  }
  
  public Geofence build()
  {
    Object localObject = this.zzEY;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Request ID not set.");
      throw ((Throwable)localObject);
    }
    int i = this.zzaNC;
    if (i == 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Transitions types not set.");
      throw ((Throwable)localObject);
    }
    i = this.zzaNC & 0x4;
    if (i != 0)
    {
      i = this.zzaNJ;
      if (i < 0)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
        throw ((Throwable)localObject);
      }
    }
    long l1 = this.zzaND;
    long l2 = Long.MIN_VALUE;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Expiration not set.");
      throw ((Throwable)localObject);
    }
    int j = this.zzaNE;
    int k = -1;
    if (j == k)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Geofence region not set.");
      throw ((Throwable)localObject);
    }
    j = this.zzaNI;
    if (j < 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Notification responsiveness should be nonnegative.");
      throw ((Throwable)localObject);
    }
    localObject = new com/google/android/gms/location/internal/ParcelableGeofence;
    String str = this.zzEY;
    int m = this.zzaNC;
    double d1 = this.zzaNF;
    double d2 = this.zzaNG;
    float f = this.zzaNH;
    long l3 = this.zzaND;
    int n = this.zzaNI;
    int i1 = this.zzaNJ;
    ((ParcelableGeofence)localObject).<init>(str, m, (short)1, d1, d2, f, l3, n, i1);
    return (Geofence)localObject;
  }
  
  public Builder setCircularRegion(double paramDouble1, double paramDouble2, float paramFloat)
  {
    this.zzaNE = 1;
    this.zzaNF = paramDouble1;
    this.zzaNG = paramDouble2;
    this.zzaNH = paramFloat;
    return this;
  }
  
  public Builder setExpirationDuration(long paramLong)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {
      l = -1;
    }
    for (this.zzaND = l;; this.zzaND = l)
    {
      return this;
      l = SystemClock.elapsedRealtime() + paramLong;
    }
  }
  
  public Builder setLoiteringDelay(int paramInt)
  {
    this.zzaNJ = paramInt;
    return this;
  }
  
  public Builder setNotificationResponsiveness(int paramInt)
  {
    this.zzaNI = paramInt;
    return this;
  }
  
  public Builder setRequestId(String paramString)
  {
    this.zzEY = paramString;
    return this;
  }
  
  public Builder setTransitionTypes(int paramInt)
  {
    this.zzaNC = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\Geofence$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */