package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class TransferStateOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzapB;
  private final Set zzapC;
  
  static
  {
    zzr localzzr = new com/google/android/gms/drive/events/zzr;
    localzzr.<init>();
    CREATOR = localzzr;
  }
  
  TransferStateOptions(int paramInt, List paramList) {}
  
  private TransferStateOptions(int paramInt, List paramList, Set paramSet)
  {
    this.mVersionCode = paramInt;
    this.zzapB = paramList;
    this.zzapC = paramSet;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    Object localObject1;
    Object localObject2;
    boolean bool;
    if (paramObject != null)
    {
      localObject1 = paramObject.getClass();
      localObject2 = getClass();
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      if (paramObject == this)
      {
        bool = true;
      }
      else
      {
        paramObject = (TransferStateOptions)paramObject;
        localObject1 = this.zzapC;
        localObject2 = ((TransferStateOptions)paramObject).zzapC;
        bool = zzw.equal(localObject1, localObject2);
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Set localSet = this.zzapC;
    arrayOfObject[0] = localSet;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    List localList = this.zzapB;
    arrayOfObject[0] = localList;
    return String.format(localLocale, "TransferStateOptions[Spaces=%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\TransferStateOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */