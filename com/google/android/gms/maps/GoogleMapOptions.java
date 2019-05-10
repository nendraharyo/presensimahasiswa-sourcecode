package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final zza CREATOR;
  private final int mVersionCode;
  private Boolean zzaRP;
  private Boolean zzaRQ;
  private int zzaRR = -1;
  private CameraPosition zzaRS;
  private Boolean zzaRT;
  private Boolean zzaRU;
  private Boolean zzaRV;
  private Boolean zzaRW;
  private Boolean zzaRX;
  private Boolean zzaRY;
  private Boolean zzaRZ;
  private Boolean zzaSa;
  private Boolean zzaSb;
  
  static
  {
    zza localzza = new com/google/android/gms/maps/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public GoogleMapOptions()
  {
    this.mVersionCode = 1;
  }
  
  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10, byte paramByte11)
  {
    this.mVersionCode = paramInt1;
    Boolean localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte1);
    this.zzaRP = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte2);
    this.zzaRQ = localBoolean;
    this.zzaRR = paramInt2;
    this.zzaRS = paramCameraPosition;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte3);
    this.zzaRT = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte4);
    this.zzaRU = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte5);
    this.zzaRV = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte6);
    this.zzaRW = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte7);
    this.zzaRX = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte8);
    this.zzaRY = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte9);
    this.zzaRZ = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte10);
    this.zzaSa = localBoolean;
    localBoolean = com.google.android.gms.maps.internal.zza.zza(paramByte11);
    this.zzaSb = localBoolean;
  }
  
  public static GoogleMapOptions createFromAttributes(Context paramContext, AttributeSet paramAttributeSet)
  {
    boolean bool1 = true;
    Object localObject1;
    if (paramAttributeSet == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (GoogleMapOptions)localObject1;
      localObject1 = paramContext.getResources();
      Object localObject2 = R.styleable.MapAttrs;
      localObject2 = ((Resources)localObject1).obtainAttributes(paramAttributeSet, (int[])localObject2);
      localObject1 = new com/google/android/gms/maps/GoogleMapOptions;
      ((GoogleMapOptions)localObject1).<init>();
      int i = R.styleable.MapAttrs_mapType;
      boolean bool2 = ((TypedArray)localObject2).hasValue(i);
      if (bool2)
      {
        j = R.styleable.MapAttrs_mapType;
        int i19 = -1;
        j = ((TypedArray)localObject2).getInt(j, i19);
        ((GoogleMapOptions)localObject1).mapType(j);
      }
      int j = R.styleable.MapAttrs_zOrderOnTop;
      boolean bool3 = ((TypedArray)localObject2).hasValue(j);
      if (bool3)
      {
        int k = R.styleable.MapAttrs_zOrderOnTop;
        boolean bool4 = ((TypedArray)localObject2).getBoolean(k, false);
        ((GoogleMapOptions)localObject1).zOrderOnTop(bool4);
      }
      int m = R.styleable.MapAttrs_useViewLifecycle;
      boolean bool5 = ((TypedArray)localObject2).hasValue(m);
      if (bool5)
      {
        int n = R.styleable.MapAttrs_useViewLifecycle;
        boolean bool6 = ((TypedArray)localObject2).getBoolean(n, false);
        ((GoogleMapOptions)localObject1).useViewLifecycleInFragment(bool6);
      }
      int i1 = R.styleable.MapAttrs_uiCompass;
      boolean bool7 = ((TypedArray)localObject2).hasValue(i1);
      if (bool7)
      {
        int i2 = R.styleable.MapAttrs_uiCompass;
        boolean bool8 = ((TypedArray)localObject2).getBoolean(i2, bool1);
        ((GoogleMapOptions)localObject1).compassEnabled(bool8);
      }
      int i3 = R.styleable.MapAttrs_uiRotateGestures;
      boolean bool9 = ((TypedArray)localObject2).hasValue(i3);
      if (bool9)
      {
        int i4 = R.styleable.MapAttrs_uiRotateGestures;
        boolean bool10 = ((TypedArray)localObject2).getBoolean(i4, bool1);
        ((GoogleMapOptions)localObject1).rotateGesturesEnabled(bool10);
      }
      int i5 = R.styleable.MapAttrs_uiScrollGestures;
      boolean bool11 = ((TypedArray)localObject2).hasValue(i5);
      if (bool11)
      {
        int i6 = R.styleable.MapAttrs_uiScrollGestures;
        boolean bool12 = ((TypedArray)localObject2).getBoolean(i6, bool1);
        ((GoogleMapOptions)localObject1).scrollGesturesEnabled(bool12);
      }
      int i7 = R.styleable.MapAttrs_uiTiltGestures;
      boolean bool13 = ((TypedArray)localObject2).hasValue(i7);
      if (bool13)
      {
        int i8 = R.styleable.MapAttrs_uiTiltGestures;
        boolean bool14 = ((TypedArray)localObject2).getBoolean(i8, bool1);
        ((GoogleMapOptions)localObject1).tiltGesturesEnabled(bool14);
      }
      int i9 = R.styleable.MapAttrs_uiZoomGestures;
      boolean bool15 = ((TypedArray)localObject2).hasValue(i9);
      if (bool15)
      {
        int i10 = R.styleable.MapAttrs_uiZoomGestures;
        boolean bool16 = ((TypedArray)localObject2).getBoolean(i10, bool1);
        ((GoogleMapOptions)localObject1).zoomGesturesEnabled(bool16);
      }
      int i11 = R.styleable.MapAttrs_uiZoomControls;
      boolean bool17 = ((TypedArray)localObject2).hasValue(i11);
      if (bool17)
      {
        int i12 = R.styleable.MapAttrs_uiZoomControls;
        boolean bool18 = ((TypedArray)localObject2).getBoolean(i12, bool1);
        ((GoogleMapOptions)localObject1).zoomControlsEnabled(bool18);
      }
      int i13 = R.styleable.MapAttrs_liteMode;
      boolean bool19 = ((TypedArray)localObject2).hasValue(i13);
      if (bool19)
      {
        int i14 = R.styleable.MapAttrs_liteMode;
        boolean bool20 = ((TypedArray)localObject2).getBoolean(i14, false);
        ((GoogleMapOptions)localObject1).liteMode(bool20);
      }
      int i15 = R.styleable.MapAttrs_uiMapToolbar;
      boolean bool21 = ((TypedArray)localObject2).hasValue(i15);
      if (bool21)
      {
        int i16 = R.styleable.MapAttrs_uiMapToolbar;
        boolean bool22 = ((TypedArray)localObject2).getBoolean(i16, bool1);
        ((GoogleMapOptions)localObject1).mapToolbarEnabled(bool22);
      }
      int i17 = R.styleable.MapAttrs_ambientEnabled;
      boolean bool23 = ((TypedArray)localObject2).hasValue(i17);
      if (bool23)
      {
        int i18 = R.styleable.MapAttrs_ambientEnabled;
        boolean bool24 = ((TypedArray)localObject2).getBoolean(i18, false);
        ((GoogleMapOptions)localObject1).ambientEnabled(bool24);
      }
      CameraPosition localCameraPosition = CameraPosition.createFromAttributes(paramContext, paramAttributeSet);
      ((GoogleMapOptions)localObject1).camera(localCameraPosition);
      ((TypedArray)localObject2).recycle();
    }
  }
  
  public GoogleMapOptions ambientEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaSb = localBoolean;
    return this;
  }
  
  public GoogleMapOptions camera(CameraPosition paramCameraPosition)
  {
    this.zzaRS = paramCameraPosition;
    return this;
  }
  
  public GoogleMapOptions compassEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRU = localBoolean;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Boolean getAmbientEnabled()
  {
    return this.zzaSb;
  }
  
  public CameraPosition getCamera()
  {
    return this.zzaRS;
  }
  
  public Boolean getCompassEnabled()
  {
    return this.zzaRU;
  }
  
  public Boolean getLiteMode()
  {
    return this.zzaRZ;
  }
  
  public Boolean getMapToolbarEnabled()
  {
    return this.zzaSa;
  }
  
  public int getMapType()
  {
    return this.zzaRR;
  }
  
  public Boolean getRotateGesturesEnabled()
  {
    return this.zzaRY;
  }
  
  public Boolean getScrollGesturesEnabled()
  {
    return this.zzaRV;
  }
  
  public Boolean getTiltGesturesEnabled()
  {
    return this.zzaRX;
  }
  
  public Boolean getUseViewLifecycleInFragment()
  {
    return this.zzaRQ;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public Boolean getZOrderOnTop()
  {
    return this.zzaRP;
  }
  
  public Boolean getZoomControlsEnabled()
  {
    return this.zzaRT;
  }
  
  public Boolean getZoomGesturesEnabled()
  {
    return this.zzaRW;
  }
  
  public GoogleMapOptions liteMode(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRZ = localBoolean;
    return this;
  }
  
  public GoogleMapOptions mapToolbarEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaSa = localBoolean;
    return this;
  }
  
  public GoogleMapOptions mapType(int paramInt)
  {
    this.zzaRR = paramInt;
    return this;
  }
  
  public GoogleMapOptions rotateGesturesEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRY = localBoolean;
    return this;
  }
  
  public GoogleMapOptions scrollGesturesEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRV = localBoolean;
    return this;
  }
  
  public GoogleMapOptions tiltGesturesEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRX = localBoolean;
    return this;
  }
  
  public GoogleMapOptions useViewLifecycleInFragment(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRQ = localBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public GoogleMapOptions zOrderOnTop(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRP = localBoolean;
    return this;
  }
  
  public GoogleMapOptions zoomControlsEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRT = localBoolean;
    return this;
  }
  
  public GoogleMapOptions zoomGesturesEnabled(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    this.zzaRW = localBoolean;
    return this;
  }
  
  byte zzzK()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRP);
  }
  
  byte zzzL()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRQ);
  }
  
  byte zzzM()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRT);
  }
  
  byte zzzN()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRU);
  }
  
  byte zzzO()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRV);
  }
  
  byte zzzP()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRW);
  }
  
  byte zzzQ()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRX);
  }
  
  byte zzzR()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRY);
  }
  
  byte zzzS()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaRZ);
  }
  
  byte zzzT()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaSa);
  }
  
  byte zzzU()
  {
    return com.google.android.gms.maps.internal.zza.zze(this.zzaSb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMapOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */