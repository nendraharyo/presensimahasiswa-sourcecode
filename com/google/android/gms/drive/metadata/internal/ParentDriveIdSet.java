package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ParentDriveIdSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzasS;
  
  static
  {
    zzl localzzl = new com/google/android/gms/drive/metadata/internal/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  public ParentDriveIdSet()
  {
    this(1, localArrayList);
  }
  
  ParentDriveIdSet(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzasS = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public Set zzD(long paramLong)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject = this.zzasS;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = ((PartialDriveId)localIterator.next()).zzE(paramLong);
      localHashSet.add(localObject);
    }
    return localHashSet;
  }
  
  public void zza(PartialDriveId paramPartialDriveId)
  {
    this.zzasS.add(paramPartialDriveId);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\ParentDriveIdSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */