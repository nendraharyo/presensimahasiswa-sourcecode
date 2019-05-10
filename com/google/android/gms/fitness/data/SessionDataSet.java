package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class SessionDataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final Session zzavX;
  private final DataSet zzaxn;
  
  static
  {
    zzr localzzr = new com/google/android/gms/fitness/data/zzr;
    localzzr.<init>();
    CREATOR = localzzr;
  }
  
  SessionDataSet(int paramInt, Session paramSession, DataSet paramDataSet)
  {
    this.mVersionCode = paramInt;
    this.zzavX = paramSession;
    this.zzaxn = paramDataSet;
  }
  
  private boolean zza(SessionDataSet paramSessionDataSet)
  {
    Object localObject1 = this.zzavX;
    Object localObject2 = paramSessionDataSet.zzavX;
    boolean bool = zzw.equal(localObject1, localObject2);
    if (bool)
    {
      localObject1 = this.zzaxn;
      localObject2 = paramSessionDataSet.zzaxn;
      bool = zzw.equal(localObject1, localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof SessionDataSet;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionDataSet)paramObject;
      bool = zza((SessionDataSet)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public DataSet getDataSet()
  {
    return this.zzaxn;
  }
  
  public Session getSession()
  {
    return this.zzavX;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzavX;
    arrayOfObject[0] = localObject;
    localObject = this.zzaxn;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzavX;
    localzza = localzza.zzg("session", localObject);
    localObject = this.zzaxn;
    return localzza.zzg("dataSet", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\SessionDataSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */