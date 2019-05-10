package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.events.internal.TransferProgressData;

public final class TransferProgressEvent
  implements DriveEvent
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final TransferProgressData zzapS;
  
  static
  {
    zzn localzzn = new com/google/android/gms/drive/events/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  TransferProgressEvent(int paramInt, TransferProgressData paramTransferProgressData)
  {
    this.mVersionCode = paramInt;
    this.zzapS = paramTransferProgressData;
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
        paramObject = (TransferProgressEvent)paramObject;
        localObject1 = this.zzapS;
        localObject2 = ((TransferProgressEvent)paramObject).zzapS;
        bool = zzw.equal(localObject1, localObject2);
      }
    }
  }
  
  public int getType()
  {
    return 8;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    TransferProgressData localTransferProgressData = this.zzapS;
    arrayOfObject[0] = localTransferProgressData;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    String str = this.zzapS.toString();
    arrayOfObject[0] = str;
    return String.format("TransferProgressEvent[%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public TransferProgressData zzta()
  {
    return this.zzapS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\TransferProgressEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */