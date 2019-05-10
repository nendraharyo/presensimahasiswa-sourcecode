package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public final class CameraPosition
  implements SafeParcelable
{
  public static final zza CREATOR;
  public final float bearing;
  private final int mVersionCode;
  public final LatLng target;
  public final float tilt;
  public final float zoom;
  
  static
  {
    zza localzza = new com/google/android/gms/maps/model/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  CameraPosition(int paramInt, LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    String str1 = "null camera target";
    zzx.zzb(paramLatLng, str1);
    boolean bool2 = 0.0F < paramFloat2;
    if (!bool2)
    {
      f3 = 90.0F;
      bool2 = paramFloat2 < f3;
      if (!bool2) {
        bool2 = bool1;
      }
    }
    for (float f3 = f1;; f3 = 0.0F)
    {
      String str2 = "Tilt needs to be between 0 and 90 inclusive: %s";
      Object[] arrayOfObject = new Object[bool1];
      Float localFloat = Float.valueOf(paramFloat2);
      arrayOfObject[0] = localFloat;
      zzx.zzb(bool2, str2, arrayOfObject);
      this.mVersionCode = paramInt;
      this.target = paramLatLng;
      this.zoom = paramFloat1;
      f3 = paramFloat2 + 0.0F;
      this.tilt = f3;
      double d1 = paramFloat3;
      double d2 = 0.0D;
      bool2 = d1 < d2;
      if (!bool2)
      {
        f3 = paramFloat3 % f2;
        paramFloat3 = f3 + f2;
      }
      f3 = paramFloat3 % f2;
      this.bearing = f3;
      return;
      bool2 = false;
      str1 = null;
    }
  }
  
  public CameraPosition(LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(1, paramLatLng, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static CameraPosition.Builder builder()
  {
    CameraPosition.Builder localBuilder = new com/google/android/gms/maps/model/CameraPosition$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  public static CameraPosition.Builder builder(CameraPosition paramCameraPosition)
  {
    CameraPosition.Builder localBuilder = new com/google/android/gms/maps/model/CameraPosition$Builder;
    localBuilder.<init>(paramCameraPosition);
    return localBuilder;
  }
  
  public static CameraPosition createFromAttributes(Context paramContext, AttributeSet paramAttributeSet)
  {
    float f1 = 0.0F;
    if (paramAttributeSet == null)
    {
      i = 0;
      f2 = 0.0F;
      localObject = null;
      return (CameraPosition)localObject;
    }
    Object localObject = paramContext.getResources();
    int[] arrayOfInt = R.styleable.MapAttrs;
    TypedArray localTypedArray = ((Resources)localObject).obtainAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.MapAttrs_cameraTargetLat;
    boolean bool1 = localTypedArray.hasValue(i);
    int j;
    if (bool1) {
      j = R.styleable.MapAttrs_cameraTargetLat;
    }
    for (float f2 = localTypedArray.getFloat(j, 0.0F);; f2 = 0.0F)
    {
      int k = R.styleable.MapAttrs_cameraTargetLng;
      boolean bool2 = localTypedArray.hasValue(k);
      int m;
      if (bool2) {
        m = R.styleable.MapAttrs_cameraTargetLng;
      }
      for (float f3 = localTypedArray.getFloat(m, 0.0F);; f3 = 0.0F)
      {
        LatLng localLatLng = new com/google/android/gms/maps/model/LatLng;
        double d1 = f2;
        double d2 = f3;
        localLatLng.<init>(d1, d2);
        localObject = builder();
        ((CameraPosition.Builder)localObject).target(localLatLng);
        m = R.styleable.MapAttrs_cameraZoom;
        boolean bool3 = localTypedArray.hasValue(m);
        if (bool3)
        {
          n = R.styleable.MapAttrs_cameraZoom;
          f3 = localTypedArray.getFloat(n, 0.0F);
          ((CameraPosition.Builder)localObject).zoom(f3);
        }
        int n = R.styleable.MapAttrs_cameraBearing;
        boolean bool4 = localTypedArray.hasValue(n);
        if (bool4)
        {
          i1 = R.styleable.MapAttrs_cameraBearing;
          f3 = localTypedArray.getFloat(i1, 0.0F);
          ((CameraPosition.Builder)localObject).bearing(f3);
        }
        int i1 = R.styleable.MapAttrs_cameraTilt;
        boolean bool5 = localTypedArray.hasValue(i1);
        if (bool5)
        {
          i2 = R.styleable.MapAttrs_cameraTilt;
          f1 = localTypedArray.getFloat(i2, 0.0F);
          ((CameraPosition.Builder)localObject).tilt(f1);
        }
        localObject = ((CameraPosition.Builder)localObject).build();
        break;
        int i2 = 0;
        arrayOfInt = null;
      }
      j = 0;
      localObject = null;
    }
  }
  
  public static final CameraPosition fromLatLngZoom(LatLng paramLatLng, float paramFloat)
  {
    CameraPosition localCameraPosition = new com/google/android/gms/maps/model/CameraPosition;
    localCameraPosition.<init>(paramLatLng, paramFloat, 0.0F, 0.0F);
    return localCameraPosition;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof CameraPosition;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (CameraPosition)paramObject;
        LatLng localLatLng1 = this.target;
        LatLng localLatLng2 = ((CameraPosition)paramObject).target;
        bool2 = localLatLng1.equals(localLatLng2);
        if (bool2)
        {
          float f1 = this.zoom;
          int i = Float.floatToIntBits(f1);
          float f2 = ((CameraPosition)paramObject).zoom;
          int j = Float.floatToIntBits(f2);
          if (i == j)
          {
            f1 = this.tilt;
            i = Float.floatToIntBits(f1);
            f2 = ((CameraPosition)paramObject).tilt;
            j = Float.floatToIntBits(f2);
            if (i == j)
            {
              f1 = this.bearing;
              i = Float.floatToIntBits(f1);
              f2 = ((CameraPosition)paramObject).bearing;
              j = Float.floatToIntBits(f2);
              if (i == j) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.target;
    arrayOfObject[0] = localObject;
    localObject = Float.valueOf(this.zoom);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(this.tilt);
    arrayOfObject[2] = localObject;
    localObject = Float.valueOf(this.bearing);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.target;
    localzza = localzza.zzg("target", localObject);
    localObject = Float.valueOf(this.zoom);
    localzza = localzza.zzg("zoom", localObject);
    localObject = Float.valueOf(this.tilt);
    localzza = localzza.zzg("tilt", localObject);
    localObject = Float.valueOf(this.bearing);
    return localzza.zzg("bearing", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\CameraPosition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */