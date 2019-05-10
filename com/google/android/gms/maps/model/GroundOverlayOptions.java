package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public final class GroundOverlayOptions
  implements SafeParcelable
{
  public static final zzc CREATOR;
  public static final float NO_DIMENSION = -1.0F;
  private final int mVersionCode;
  private LatLngBounds zzaRk;
  private float zzaTa;
  private float zzaTh;
  private boolean zzaTi;
  private BitmapDescriptor zzaTk;
  private LatLng zzaTl;
  private float zzaTm;
  private float zzaTn;
  private float zzaTo;
  private float zzaTp;
  private float zzaTq;
  private boolean zzaTr;
  
  static
  {
    zzc localzzc = new com/google/android/gms/maps/model/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  public GroundOverlayOptions()
  {
    this.zzaTi = i;
    this.zzaTo = 0.0F;
    this.zzaTp = f;
    this.zzaTq = f;
    this.zzaTr = false;
    this.mVersionCode = i;
  }
  
  GroundOverlayOptions(int paramInt, IBinder paramIBinder, LatLng paramLatLng, float paramFloat1, float paramFloat2, LatLngBounds paramLatLngBounds, float paramFloat3, float paramFloat4, boolean paramBoolean1, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean2)
  {
    this.zzaTi = true;
    this.zzaTo = 0.0F;
    this.zzaTp = f;
    this.zzaTq = f;
    this.zzaTr = false;
    this.mVersionCode = paramInt;
    BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
    zzd localzzd = zzd.zza.zzbs(paramIBinder);
    localBitmapDescriptor.<init>(localzzd);
    this.zzaTk = localBitmapDescriptor;
    this.zzaTl = paramLatLng;
    this.zzaTm = paramFloat1;
    this.zzaTn = paramFloat2;
    this.zzaRk = paramLatLngBounds;
    this.zzaTa = paramFloat3;
    this.zzaTh = paramFloat4;
    this.zzaTi = paramBoolean1;
    this.zzaTo = paramFloat5;
    this.zzaTp = paramFloat6;
    this.zzaTq = paramFloat7;
    this.zzaTr = paramBoolean2;
  }
  
  private GroundOverlayOptions zza(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    this.zzaTl = paramLatLng;
    this.zzaTm = paramFloat1;
    this.zzaTn = paramFloat2;
    return this;
  }
  
  public GroundOverlayOptions anchor(float paramFloat1, float paramFloat2)
  {
    this.zzaTp = paramFloat1;
    this.zzaTq = paramFloat2;
    return this;
  }
  
  public GroundOverlayOptions bearing(float paramFloat)
  {
    float f1 = 360.0F;
    float f2 = (paramFloat % f1 + f1) % f1;
    this.zzaTa = f2;
    return this;
  }
  
  public GroundOverlayOptions clickable(boolean paramBoolean)
  {
    this.zzaTr = paramBoolean;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float getAnchorU()
  {
    return this.zzaTp;
  }
  
  public float getAnchorV()
  {
    return this.zzaTq;
  }
  
  public float getBearing()
  {
    return this.zzaTa;
  }
  
  public LatLngBounds getBounds()
  {
    return this.zzaRk;
  }
  
  public float getHeight()
  {
    return this.zzaTn;
  }
  
  public BitmapDescriptor getImage()
  {
    return this.zzaTk;
  }
  
  public LatLng getLocation()
  {
    return this.zzaTl;
  }
  
  public float getTransparency()
  {
    return this.zzaTo;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public float getWidth()
  {
    return this.zzaTm;
  }
  
  public float getZIndex()
  {
    return this.zzaTh;
  }
  
  public GroundOverlayOptions image(BitmapDescriptor paramBitmapDescriptor)
  {
    this.zzaTk = paramBitmapDescriptor;
    return this;
  }
  
  public boolean isClickable()
  {
    return this.zzaTr;
  }
  
  public boolean isVisible()
  {
    return this.zzaTi;
  }
  
  public GroundOverlayOptions position(LatLng paramLatLng, float paramFloat)
  {
    boolean bool1 = true;
    LatLngBounds localLatLngBounds = this.zzaRk;
    boolean bool2;
    if (localLatLngBounds == null)
    {
      bool2 = bool1;
      String str = "Position has already been set using positionFromBounds";
      zzx.zza(bool2, str);
      if (paramLatLng == null) {
        break label82;
      }
      bool2 = bool1;
      label34:
      str = "Location must be specified";
      zzx.zzb(bool2, str);
      localLatLngBounds = null;
      bool2 = paramFloat < 0.0F;
      if (bool2) {
        break label91;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "Width must be non-negative");
      return zza(paramLatLng, paramFloat, -1.0F);
      bool2 = false;
      localLatLngBounds = null;
      break;
      label82:
      bool2 = false;
      localLatLngBounds = null;
      break label34;
      label91:
      bool1 = false;
    }
  }
  
  public GroundOverlayOptions position(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    LatLngBounds localLatLngBounds = this.zzaRk;
    boolean bool2;
    if (localLatLngBounds == null)
    {
      bool2 = bool1;
      String str = "Position has already been set using positionFromBounds";
      zzx.zza(bool2, str);
      if (paramLatLng == null) {
        break label107;
      }
      bool2 = bool1;
      label37:
      str = "Location must be specified";
      zzx.zzb(bool2, str);
      bool2 = paramFloat1 < 0.0F;
      if (bool2) {
        break label116;
      }
      bool2 = bool1;
      label62:
      str = "Width must be non-negative";
      zzx.zzb(bool2, str);
      bool2 = paramFloat2 < 0.0F;
      if (bool2) {
        break label125;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "Height must be non-negative");
      return zza(paramLatLng, paramFloat1, paramFloat2);
      bool2 = false;
      localLatLngBounds = null;
      break;
      label107:
      bool2 = false;
      localLatLngBounds = null;
      break label37;
      label116:
      bool2 = false;
      localLatLngBounds = null;
      break label62;
      label125:
      bool1 = false;
    }
  }
  
  public GroundOverlayOptions positionFromBounds(LatLngBounds paramLatLngBounds)
  {
    LatLng localLatLng1 = this.zzaTl;
    boolean bool;
    if (localLatLng1 == null) {
      bool = true;
    }
    for (;;)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Position has already been set using position: ");
      LatLng localLatLng2 = this.zzaTl;
      localObject = localLatLng2;
      zzx.zza(bool, localObject);
      this.zzaRk = paramLatLngBounds;
      return this;
      bool = false;
      localLatLng1 = null;
    }
  }
  
  public GroundOverlayOptions transparency(float paramFloat)
  {
    float f = 0.0F;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      f = 1.0F;
      bool = paramFloat < f;
      if (!bool) {
        bool = true;
      }
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      zzx.zzb(bool, "Transparency must be in the range [0..1]");
      this.zzaTo = paramFloat;
      return this;
      bool = false;
    }
  }
  
  public GroundOverlayOptions visible(boolean paramBoolean)
  {
    this.zzaTi = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public GroundOverlayOptions zIndex(float paramFloat)
  {
    this.zzaTh = paramFloat;
    return this;
  }
  
  IBinder zzAj()
  {
    return this.zzaTk.zzzH().asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\GroundOverlayOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */