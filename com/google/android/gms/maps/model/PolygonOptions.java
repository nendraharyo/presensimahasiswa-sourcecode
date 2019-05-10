package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolygonOptions
  implements SafeParcelable
{
  public static final zzh CREATOR;
  private final int mVersionCode;
  private final List zzaTJ;
  private final List zzaTK;
  private boolean zzaTL;
  private float zzaTe = 10.0F;
  private int zzaTf = -16777216;
  private int zzaTg = 0;
  private float zzaTh = 0.0F;
  private boolean zzaTi;
  private boolean zzaTr;
  
  static
  {
    zzh localzzh = new com/google/android/gms/maps/model/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  public PolygonOptions()
  {
    this.zzaTi = i;
    this.zzaTL = false;
    this.zzaTr = false;
    this.mVersionCode = i;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaTJ = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaTK = localArrayList;
  }
  
  PolygonOptions(int paramInt1, List paramList1, List paramList2, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.zzaTi = true;
    this.zzaTL = false;
    this.zzaTr = false;
    this.mVersionCode = paramInt1;
    this.zzaTJ = paramList1;
    this.zzaTK = paramList2;
    this.zzaTe = paramFloat1;
    this.zzaTf = paramInt2;
    this.zzaTg = paramInt3;
    this.zzaTh = paramFloat2;
    this.zzaTi = paramBoolean1;
    this.zzaTL = paramBoolean2;
    this.zzaTr = paramBoolean3;
  }
  
  public PolygonOptions add(LatLng paramLatLng)
  {
    this.zzaTJ.add(paramLatLng);
    return this;
  }
  
  public PolygonOptions add(LatLng... paramVarArgs)
  {
    List localList1 = this.zzaTJ;
    List localList2 = Arrays.asList(paramVarArgs);
    localList1.addAll(localList2);
    return this;
  }
  
  public PolygonOptions addAll(Iterable paramIterable)
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
  
  public PolygonOptions addHole(Iterable paramIterable)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      LatLng localLatLng = (LatLng)localIterator.next();
      localArrayList.add(localLatLng);
    }
    this.zzaTK.add(localArrayList);
    return this;
  }
  
  public PolygonOptions clickable(boolean paramBoolean)
  {
    this.zzaTr = paramBoolean;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public PolygonOptions fillColor(int paramInt)
  {
    this.zzaTg = paramInt;
    return this;
  }
  
  public PolygonOptions geodesic(boolean paramBoolean)
  {
    this.zzaTL = paramBoolean;
    return this;
  }
  
  public int getFillColor()
  {
    return this.zzaTg;
  }
  
  public List getHoles()
  {
    return this.zzaTK;
  }
  
  public List getPoints()
  {
    return this.zzaTJ;
  }
  
  public int getStrokeColor()
  {
    return this.zzaTf;
  }
  
  public float getStrokeWidth()
  {
    return this.zzaTe;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
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
  
  public PolygonOptions strokeColor(int paramInt)
  {
    this.zzaTf = paramInt;
    return this;
  }
  
  public PolygonOptions strokeWidth(float paramFloat)
  {
    this.zzaTe = paramFloat;
    return this;
  }
  
  public PolygonOptions visible(boolean paramBoolean)
  {
    this.zzaTi = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public PolygonOptions zIndex(float paramFloat)
  {
    this.zzaTh = paramFloat;
    return this;
  }
  
  List zzAl()
  {
    return this.zzaTK;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\PolygonOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */