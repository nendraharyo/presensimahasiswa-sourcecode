package com.google.android.gms.maps.model;

public final class CameraPosition$Builder
{
  private LatLng zzaSX;
  private float zzaSY;
  private float zzaSZ;
  private float zzaTa;
  
  public CameraPosition$Builder() {}
  
  public CameraPosition$Builder(CameraPosition paramCameraPosition)
  {
    LatLng localLatLng = paramCameraPosition.target;
    this.zzaSX = localLatLng;
    float f = paramCameraPosition.zoom;
    this.zzaSY = f;
    f = paramCameraPosition.tilt;
    this.zzaSZ = f;
    f = paramCameraPosition.bearing;
    this.zzaTa = f;
  }
  
  public Builder bearing(float paramFloat)
  {
    this.zzaTa = paramFloat;
    return this;
  }
  
  public CameraPosition build()
  {
    CameraPosition localCameraPosition = new com/google/android/gms/maps/model/CameraPosition;
    LatLng localLatLng = this.zzaSX;
    float f1 = this.zzaSY;
    float f2 = this.zzaSZ;
    float f3 = this.zzaTa;
    localCameraPosition.<init>(localLatLng, f1, f2, f3);
    return localCameraPosition;
  }
  
  public Builder target(LatLng paramLatLng)
  {
    this.zzaSX = paramLatLng;
    return this;
  }
  
  public Builder tilt(float paramFloat)
  {
    this.zzaSZ = paramFloat;
    return this;
  }
  
  public Builder zoom(float paramFloat)
  {
    this.zzaSY = paramFloat;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\CameraPosition$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */