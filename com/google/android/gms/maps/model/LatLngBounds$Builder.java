package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.zzx;

public final class LatLngBounds$Builder
{
  private double zzaTu = 1.0D / 0.0D;
  private double zzaTv = -1.0D / 0.0D;
  private double zzaTw;
  private double zzaTx;
  
  public LatLngBounds$Builder()
  {
    this.zzaTw = d;
    this.zzaTx = d;
  }
  
  private boolean zzj(double paramDouble)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    double d1 = this.zzaTw;
    double d2 = this.zzaTx;
    boolean bool3 = d1 < d2;
    if (!bool3)
    {
      d1 = this.zzaTw;
      bool3 = d1 < paramDouble;
      if (!bool3)
      {
        d1 = this.zzaTx;
        bool3 = paramDouble < d1;
        if (bool3) {}
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      f1 = 0.0F;
      continue;
      d1 = this.zzaTw;
      bool3 = d1 < paramDouble;
      if (bool3)
      {
        d1 = this.zzaTx;
        bool3 = paramDouble < d1;
        if (bool3) {}
      }
      else
      {
        bool2 = bool1;
        f2 = f1;
      }
      bool1 = bool2;
      f1 = f2;
    }
  }
  
  public LatLngBounds build()
  {
    double d1 = this.zzaTw;
    boolean bool = Double.isNaN(d1);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "no included points");
      LatLngBounds localLatLngBounds = new com/google/android/gms/maps/model/LatLngBounds;
      LatLng localLatLng1 = new com/google/android/gms/maps/model/LatLng;
      double d2 = this.zzaTu;
      double d3 = this.zzaTw;
      localLatLng1.<init>(d2, d3);
      LatLng localLatLng2 = new com/google/android/gms/maps/model/LatLng;
      d3 = this.zzaTv;
      double d4 = this.zzaTx;
      localLatLng2.<init>(d3, d4);
      localLatLngBounds.<init>(localLatLng1, localLatLng2);
      return localLatLngBounds;
      bool = false;
      localLatLngBounds = null;
    }
  }
  
  public Builder include(LatLng paramLatLng)
  {
    double d1 = this.zzaTu;
    double d2 = paramLatLng.latitude;
    d1 = Math.min(d1, d2);
    this.zzaTu = d1;
    d1 = this.zzaTv;
    d2 = paramLatLng.latitude;
    d1 = Math.max(d1, d2);
    this.zzaTv = d1;
    d1 = paramLatLng.longitude;
    d2 = this.zzaTw;
    boolean bool = Double.isNaN(d2);
    if (bool)
    {
      this.zzaTw = d1;
      this.zzaTx = d1;
    }
    for (;;)
    {
      return this;
      bool = zzj(d1);
      if (!bool)
      {
        d2 = LatLngBounds.zzd(this.zzaTw, d1);
        double d3 = LatLngBounds.zze(this.zzaTx, d1);
        bool = d2 < d3;
        if (bool) {
          this.zzaTw = d1;
        } else {
          this.zzaTx = d1;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\LatLngBounds$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */