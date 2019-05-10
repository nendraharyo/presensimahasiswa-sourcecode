package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Set;

public final class NearbyAlertRequest
  implements SafeParcelable
{
  public static final zze CREATOR;
  private int mPriority;
  private final int mVersionCode;
  private final int zzaNC;
  private final int zzaPr;
  private final PlaceFilter zzaPs;
  private final NearbyAlertFilter zzaPt;
  private final boolean zzaPu;
  private final int zzaPv;
  
  static
  {
    zze localzze = new com/google/android/gms/location/places/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  NearbyAlertRequest(int paramInt1, int paramInt2, int paramInt3, PlaceFilter paramPlaceFilter, NearbyAlertFilter paramNearbyAlertFilter, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    int i = 110;
    this.mPriority = i;
    this.mVersionCode = paramInt1;
    this.zzaNC = paramInt2;
    this.zzaPr = paramInt3;
    if (paramNearbyAlertFilter != null) {
      this.zzaPt = paramNearbyAlertFilter;
    }
    for (;;)
    {
      this.zzaPs = null;
      this.zzaPu = paramBoolean;
      this.zzaPv = paramInt4;
      this.mPriority = paramInt5;
      return;
      if (paramPlaceFilter != null)
      {
        Object localObject = paramPlaceFilter.getPlaceIds();
        boolean bool;
        if (localObject != null)
        {
          localObject = paramPlaceFilter.getPlaceIds();
          bool = ((Set)localObject).isEmpty();
          if (!bool)
          {
            localObject = NearbyAlertFilter.zzh(paramPlaceFilter.getPlaceIds());
            this.zzaPt = ((NearbyAlertFilter)localObject);
            continue;
          }
        }
        localObject = paramPlaceFilter.getPlaceTypes();
        if (localObject != null)
        {
          localObject = paramPlaceFilter.getPlaceTypes();
          bool = ((Set)localObject).isEmpty();
          if (!bool)
          {
            localObject = NearbyAlertFilter.zzi(paramPlaceFilter.getPlaceTypes());
            this.zzaPt = ((NearbyAlertFilter)localObject);
            continue;
          }
        }
        this.zzaPt = null;
      }
      else
      {
        this.zzaPt = null;
      }
    }
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
      boolean bool2 = paramObject instanceof NearbyAlertRequest;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (NearbyAlertRequest)paramObject;
        int i = this.zzaNC;
        int k = ((NearbyAlertRequest)paramObject).zzaNC;
        if (i == k)
        {
          i = this.zzaPr;
          k = ((NearbyAlertRequest)paramObject).zzaPr;
          if (i == k)
          {
            NearbyAlertFilter localNearbyAlertFilter1 = this.zzaPt;
            NearbyAlertFilter localNearbyAlertFilter2 = ((NearbyAlertRequest)paramObject).zzaPt;
            boolean bool3 = zzw.equal(localNearbyAlertFilter1, localNearbyAlertFilter2);
            if (bool3)
            {
              int j = this.mPriority;
              k = ((NearbyAlertRequest)paramObject).mPriority;
              if (j == k) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int getPriority()
  {
    return this.mPriority;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = Integer.valueOf(this.zzaNC);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzaPr);
    arrayOfObject[1] = localObject;
    localObject = this.zzaPt;
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.mPriority);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Integer.valueOf(this.zzaNC);
    localzza = localzza.zzg("transitionTypes", localObject);
    localObject = Integer.valueOf(this.zzaPr);
    localzza = localzza.zzg("loiteringTimeMillis", localObject);
    localObject = this.zzaPt;
    localzza = localzza.zzg("nearbyAlertFilter", localObject);
    localObject = Integer.valueOf(this.mPriority);
    return localzza.zzg("priority", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public int zzyV()
  {
    return this.zzaNC;
  }
  
  public int zzyY()
  {
    return this.zzaPr;
  }
  
  public PlaceFilter zzyZ()
  {
    return null;
  }
  
  public NearbyAlertFilter zzza()
  {
    return this.zzaPt;
  }
  
  public boolean zzzb()
  {
    return this.zzaPu;
  }
  
  public int zzzc()
  {
    return this.zzaPv;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\NearbyAlertRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */