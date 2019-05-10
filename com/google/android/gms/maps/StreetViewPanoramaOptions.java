package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions
  implements SafeParcelable
{
  public static final zzb CREATOR;
  private final int mVersionCode;
  private Boolean zzaRQ;
  private Boolean zzaRW;
  private StreetViewPanoramaCamera zzaSD;
  private String zzaSE;
  private LatLng zzaSF;
  private Integer zzaSG;
  private Boolean zzaSH;
  private Boolean zzaSI;
  private Boolean zzaSJ;
  
  static
  {
    zzb localzzb = new com/google/android/gms/maps/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  public StreetViewPanoramaOptions()
  {
    Boolean localBoolean = Boolean.valueOf(i);
    this.zzaSH = localBoolean;
    localBoolean = Boolean.valueOf(i);
    this.zzaRW = localBoolean;
    localBoolean = Boolean.valueOf(i);
    this.zzaSI = localBoolean;
    localBoolean = Boolean.valueOf(i);
    this.zzaSJ = localBoolean;
    this.mVersionCode = i;
  }
  
  StreetViewPanoramaOptions(int paramInt, StreetViewPanoramaCamera paramStreetViewPanoramaCamera, String paramString, LatLng paramLatLng, Integer paramInteger, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5)
  {
    Boolean localBoolean = Boolean.valueOf(bool);
    this.zzaSH = localBoolean;
    localBoolean = Boolean.valueOf(bool);
    this.zzaRW = localBoolean;
    localBoolean = Boolean.valueOf(bool);
    this.zzaSI = localBoolean;
    localBoolean = Boolean.valueOf(bool);
    this.zzaSJ = localBoolean;
    this.mVersionCode = paramInt;
    this.zzaSD = paramStreetViewPanoramaCamera;
    this.zzaSF = paramLatLng;
    this.zzaSG = paramInteger;
    this.zzaSE = paramString;
    localBoolean = zza.zza(paramByte1);
    this.zzaSH = localBoolean;
    localBoolean = zza.zza(paramByte2);
    this.zzaRW = localBoolean;
    localBoolean = zza.zza(paramByte3);
    this.zzaSI = localBoolean;
    localBoolean = zza.zza(paramByte4);
    this.zzaSJ = localBoolean;
    localBoolean = zza.zza(paramByte5);
    this.zzaRQ = localBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Boolean getPanningGesturesEnabled()
  {
    return this.zzaSI;
  }
  
  public String getPanoramaId()
  {
    return this.zzaSE;
  }
  
  public LatLng getPosition()
  {
    return this.zzaSF;
  }
  
  public Integer getRadius()
  {
    return this.zzaSG;
  }
  
  public Boolean getStreetNamesEnabled()
  {
    return this.zzaSJ;
  }
  
  public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
  {
    return this.zzaSD;
  }
  
  public Boolean getUseViewLifecycleInFragment()
  {
    return this.zzaRQ;
  }
  
  public Boolean getUserNavigationEnabled()
  {
    return this.zzaSH;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public Boolean getZoomGesturesEnabled()
  {
    return this.zzaRW;
  }
  
  public StreetViewPanoramaOptions panningGesturesEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaSI = localBoolean;
    return this;
  }
  
  public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera paramStreetViewPanoramaCamera)
  {
    this.zzaSD = paramStreetViewPanoramaCamera;
    return this;
  }
  
  public StreetViewPanoramaOptions panoramaId(String paramString)
  {
    this.zzaSE = paramString;
    return this;
  }
  
  public StreetViewPanoramaOptions position(LatLng paramLatLng)
  {
    this.zzaSF = paramLatLng;
    return this;
  }
  
  public StreetViewPanoramaOptions position(LatLng paramLatLng, Integer paramInteger)
  {
    this.zzaSF = paramLatLng;
    this.zzaSG = paramInteger;
    return this;
  }
  
  public StreetViewPanoramaOptions streetNamesEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaSJ = localBoolean;
    return this;
  }
  
  public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRQ = localBoolean;
    return this;
  }
  
  public StreetViewPanoramaOptions userNavigationEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaSH = localBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public StreetViewPanoramaOptions zoomGesturesEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRW = localBoolean;
    return this;
  }
  
  byte zzAa()
  {
    return zza.zze(this.zzaSH);
  }
  
  byte zzAb()
  {
    return zza.zze(this.zzaSI);
  }
  
  byte zzAc()
  {
    return zza.zze(this.zzaSJ);
  }
  
  byte zzzL()
  {
    return zza.zze(this.zzaRQ);
  }
  
  byte zzzP()
  {
    return zza.zze(this.zzaRW);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\StreetViewPanoramaOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */