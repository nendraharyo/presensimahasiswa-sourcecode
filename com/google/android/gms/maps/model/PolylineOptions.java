package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolylineOptions
  implements SafeParcelable
{
  public static final zzi CREATOR;
  private int mColor = -16777216;
  private final int mVersionCode;
  private final List zzaTJ;
  private boolean zzaTL;
  private float zzaTh = 0.0F;
  private boolean zzaTi;
  private float zzaTm = 10.0F;
  private boolean zzaTr;
  
  static
  {
    zzi localzzi = new com/google/android/gms/maps/model/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  public PolylineOptions()
  {
    this.zzaTi = i;
    this.zzaTL = false;
    this.zzaTr = false;
    this.mVersionCode = i;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaTJ = localArrayList;
  }
  
  PolylineOptions(int paramInt1, List paramList, float paramFloat1, int paramInt2, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.zzaTi = true;
    this.zzaTL = false;
    this.zzaTr = false;
    this.mVersionCode = paramInt1;
    this.zzaTJ = paramList;
    this.zzaTm = paramFloat1;
    this.mColor = paramInt2;
    this.zzaTh = paramFloat2;
    this.zzaTi = paramBoolean1;
    this.zzaTL = paramBoolean2;
    this.zzaTr = paramBoolean3;
  }
  
  public PolylineOptions add(LatLng paramLatLng)
  {
    this.zzaTJ.add(paramLatLng);
    return this;
  }
  
  public PolylineOptions add(LatLng... paramVarArgs)
  {
    List localList1 = this.zzaTJ;
    List localList2 = Arrays.asList(paramVarArgs);
    localList1.addAll(localList2);
    return this;
  }
  
  public PolylineOptions addAll(Iterable paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      LatLng localLatLng = (LatLng)localIterator.next();
      List localList = this.zzaTJ;
      localList.add(localLatLng);
    }
    return this;
  }
  
  public PolylineOptions clickable(boolean paramBoolean)
  {
    this.zzaTr = paramBoolean;
    return this;
  }
  
  public PolylineOptions color(int paramInt)
  {
    this.mColor = paramInt;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public PolylineOptions geodesic(boolean paramBoolean)
  {
    this.zzaTL = paramBoolean;
    return this;
  }
  
  public int getColor()
  {
    return this.mColor;
  }
  
  public List getPoints()
  {
    return this.zzaTJ;
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
  
  public boolean isClickable()
  {
    return this.zzaTr;
  }
  
  public boolean isGeodesic()
  {
    return this.zzaTL;
  }
  
  public boolean isVisible()
  {
    return this.zzaTi;
  }
  
  public PolylineOptions visible(boolean paramBoolean)
  {
    this.zzaTi = paramBoolean;
    return this;
  }
  
  public PolylineOptions width(float paramFloat)
  {
    this.zzaTm = paramFloat;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public PolylineOptions zIndex(float paramFloat)
  {
    this.zzaTh = paramFloat;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\PolylineOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */