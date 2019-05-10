package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal
  implements SafeParcelable
{
  public static final zzm CREATOR;
  static final List zzaOO = ;
  String mTag;
  private final int mVersionCode;
  LocationRequest zzaBp;
  boolean zzaOP;
  boolean zzaOQ;
  boolean zzaOR;
  List zzaOS;
  boolean zzaOT;
  
  static
  {
    zzm localzzm = new com/google/android/gms/location/internal/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  LocationRequestInternal(int paramInt, LocationRequest paramLocationRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List paramList, String paramString, boolean paramBoolean4)
  {
    this.mVersionCode = paramInt;
    this.zzaBp = paramLocationRequest;
    this.zzaOP = paramBoolean1;
    this.zzaOQ = paramBoolean2;
    this.zzaOR = paramBoolean3;
    this.zzaOS = paramList;
    this.mTag = paramString;
    this.zzaOT = paramBoolean4;
  }
  
  public static LocationRequestInternal zza(String paramString, LocationRequest paramLocationRequest)
  {
    int i = 1;
    LocationRequestInternal localLocationRequestInternal = new com/google/android/gms/location/internal/LocationRequestInternal;
    List localList = zzaOO;
    localLocationRequestInternal.<init>(i, paramLocationRequest, false, i, i, localList, paramString, false);
    return localLocationRequestInternal;
  }
  
  public static LocationRequestInternal zzb(LocationRequest paramLocationRequest)
  {
    return zza(null, paramLocationRequest);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof LocationRequestInternal;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (LocationRequestInternal)paramObject;
      Object localObject1 = this.zzaBp;
      Object localObject2 = ((LocationRequestInternal)paramObject).zzaBp;
      bool2 = zzw.equal(localObject1, localObject2);
      if (bool2)
      {
        bool2 = this.zzaOP;
        boolean bool3 = ((LocationRequestInternal)paramObject).zzaOP;
        if (bool2 == bool3)
        {
          bool2 = this.zzaOQ;
          bool3 = ((LocationRequestInternal)paramObject).zzaOQ;
          if (bool2 == bool3)
          {
            bool2 = this.zzaOR;
            bool3 = ((LocationRequestInternal)paramObject).zzaOR;
            if (bool2 == bool3)
            {
              bool2 = this.zzaOT;
              bool3 = ((LocationRequestInternal)paramObject).zzaOT;
              if (bool2 == bool3)
              {
                localObject1 = this.zzaOS;
                localObject2 = ((LocationRequestInternal)paramObject).zzaOS;
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return this.zzaBp.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.zzaBp.toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = this.mTag;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(" tag=");
      localObject2 = this.mTag;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = localStringBuilder.append(" nlpDebug=");
    boolean bool = this.zzaOP;
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append(" trigger=");
    bool = this.zzaOR;
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append(" restorePIListeners=");
    bool = this.zzaOQ;
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append(" hideAppOps=");
    bool = this.zzaOT;
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append(" clients=");
    Object localObject2 = this.zzaOS;
    ((StringBuilder)localObject1).append(localObject2);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\LocationRequestInternal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */