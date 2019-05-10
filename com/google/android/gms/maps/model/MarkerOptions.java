package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final zzf CREATOR;
  private float mAlpha;
  private final int mVersionCode;
  private LatLng zzaSF;
  private BitmapDescriptor zzaTA;
  private boolean zzaTB;
  private boolean zzaTC;
  private float zzaTD;
  private float zzaTE;
  private float zzaTF;
  private boolean zzaTi;
  private float zzaTp;
  private float zzaTq;
  private String zzaTz;
  private String zzapg;
  
  static
  {
    zzf localzzf = new com/google/android/gms/maps/model/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  public MarkerOptions()
  {
    this.zzaTp = f2;
    this.zzaTq = f1;
    this.zzaTi = i;
    this.zzaTC = false;
    this.zzaTD = 0.0F;
    this.zzaTE = f2;
    this.zzaTF = 0.0F;
    this.mAlpha = f1;
    this.mVersionCode = i;
  }
  
  MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.zzaTp = 0.5F;
    this.zzaTq = 1.0F;
    this.zzaTi = true;
    this.zzaTC = false;
    this.zzaTD = 0.0F;
    this.zzaTE = 0.5F;
    BitmapDescriptor localBitmapDescriptor = null;
    this.zzaTF = 0.0F;
    float f = 1.0F;
    this.mAlpha = f;
    this.mVersionCode = paramInt;
    this.zzaSF = paramLatLng;
    this.zzapg = paramString1;
    this.zzaTz = paramString2;
    if (paramIBinder == null)
    {
      f = 0.0F;
      localBitmapDescriptor = null;
    }
    for (;;)
    {
      this.zzaTA = localBitmapDescriptor;
      this.zzaTp = paramFloat1;
      this.zzaTq = paramFloat2;
      this.zzaTB = paramBoolean1;
      this.zzaTi = paramBoolean2;
      this.zzaTC = paramBoolean3;
      this.zzaTD = paramFloat3;
      this.zzaTE = paramFloat4;
      this.zzaTF = paramFloat5;
      this.mAlpha = paramFloat6;
      return;
      localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      zzd localzzd = zzd.zza.zzbs(paramIBinder);
      localBitmapDescriptor.<init>(localzzd);
    }
  }
  
  public MarkerOptions alpha(float paramFloat)
  {
    this.mAlpha = paramFloat;
    return this;
  }
  
  public MarkerOptions anchor(float paramFloat1, float paramFloat2)
  {
    this.zzaTp = paramFloat1;
    this.zzaTq = paramFloat2;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public MarkerOptions draggable(boolean paramBoolean)
  {
    this.zzaTB = paramBoolean;
    return this;
  }
  
  public MarkerOptions flat(boolean paramBoolean)
  {
    this.zzaTC = paramBoolean;
    return this;
  }
  
  public float getAlpha()
  {
    return this.mAlpha;
  }
  
  public float getAnchorU()
  {
    return this.zzaTp;
  }
  
  public float getAnchorV()
  {
    return this.zzaTq;
  }
  
  public BitmapDescriptor getIcon()
  {
    return this.zzaTA;
  }
  
  public float getInfoWindowAnchorU()
  {
    return this.zzaTE;
  }
  
  public float getInfoWindowAnchorV()
  {
    return this.zzaTF;
  }
  
  public LatLng getPosition()
  {
    return this.zzaSF;
  }
  
  public float getRotation()
  {
    return this.zzaTD;
  }
  
  public String getSnippet()
  {
    return this.zzaTz;
  }
  
  public String getTitle()
  {
    return this.zzapg;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public MarkerOptions icon(BitmapDescriptor paramBitmapDescriptor)
  {
    this.zzaTA = paramBitmapDescriptor;
    return this;
  }
  
  public MarkerOptions infoWindowAnchor(float paramFloat1, float paramFloat2)
  {
    this.zzaTE = paramFloat1;
    this.zzaTF = paramFloat2;
    return this;
  }
  
  public boolean isDraggable()
  {
    return this.zzaTB;
  }
  
  public boolean isFlat()
  {
    return this.zzaTC;
  }
  
  public boolean isVisible()
  {
    return this.zzaTi;
  }
  
  public MarkerOptions position(LatLng paramLatLng)
  {
    this.zzaSF = paramLatLng;
    return this;
  }
  
  public MarkerOptions rotation(float paramFloat)
  {
    this.zzaTD = paramFloat;
    return this;
  }
  
  public MarkerOptions snippet(String paramString)
  {
    this.zzaTz = paramString;
    return this;
  }
  
  public MarkerOptions title(String paramString)
  {
    this.zzapg = paramString;
    return this;
  }
  
  public MarkerOptions visible(boolean paramBoolean)
  {
    this.zzaTi = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzAk()
  {
    Object localObject = this.zzaTA;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaTA.zzzH().asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\MarkerOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */