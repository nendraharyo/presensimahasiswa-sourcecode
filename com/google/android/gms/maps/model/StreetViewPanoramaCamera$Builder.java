package com.google.android.gms.maps.model;

public final class StreetViewPanoramaCamera$Builder
{
  public float bearing;
  public float tilt;
  public float zoom;
  
  public StreetViewPanoramaCamera$Builder() {}
  
  public StreetViewPanoramaCamera$Builder(StreetViewPanoramaCamera paramStreetViewPanoramaCamera)
  {
    float f = paramStreetViewPanoramaCamera.zoom;
    this.zoom = f;
    f = paramStreetViewPanoramaCamera.bearing;
    this.bearing = f;
    f = paramStreetViewPanoramaCamera.tilt;
    this.tilt = f;
  }
  
  public Builder bearing(float paramFloat)
  {
    this.bearing = paramFloat;
    return this;
  }
  
  public StreetViewPanoramaCamera build()
  {
    StreetViewPanoramaCamera localStreetViewPanoramaCamera = new com/google/android/gms/maps/model/StreetViewPanoramaCamera;
    float f1 = this.zoom;
    float f2 = this.tilt;
    float f3 = this.bearing;
    localStreetViewPanoramaCamera.<init>(f1, f2, f3);
    return localStreetViewPanoramaCamera;
  }
  
  public Builder orientation(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    float f = paramStreetViewPanoramaOrientation.tilt;
    this.tilt = f;
    f = paramStreetViewPanoramaOrientation.bearing;
    this.bearing = f;
    return this;
  }
  
  public Builder tilt(float paramFloat)
  {
    this.tilt = paramFloat;
    return this;
  }
  
  public Builder zoom(float paramFloat)
  {
    this.zoom = paramFloat;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\StreetViewPanoramaCamera$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */