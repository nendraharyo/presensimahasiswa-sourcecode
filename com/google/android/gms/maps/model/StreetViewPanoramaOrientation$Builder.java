package com.google.android.gms.maps.model;

public final class StreetViewPanoramaOrientation$Builder
{
  public float bearing;
  public float tilt;
  
  public StreetViewPanoramaOrientation$Builder() {}
  
  public StreetViewPanoramaOrientation$Builder(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    float f = paramStreetViewPanoramaOrientation.bearing;
    this.bearing = f;
    f = paramStreetViewPanoramaOrientation.tilt;
    this.tilt = f;
  }
  
  public Builder bearing(float paramFloat)
  {
    this.bearing = paramFloat;
    return this;
  }
  
  public StreetViewPanoramaOrientation build()
  {
    StreetViewPanoramaOrientation localStreetViewPanoramaOrientation = new com/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    float f1 = this.tilt;
    float f2 = this.bearing;
    localStreetViewPanoramaOrientation.<init>(f1, f2);
    return localStreetViewPanoramaOrientation;
  }
  
  public Builder tilt(float paramFloat)
  {
    this.tilt = paramFloat;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\StreetViewPanoramaOrientation$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */