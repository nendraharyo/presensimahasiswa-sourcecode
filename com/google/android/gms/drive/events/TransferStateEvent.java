package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzw;
import java.util.List;

public final class TransferStateEvent
  implements DriveEvent
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzVa;
  final List zzapU;
  
  static
  {
    zzp localzzp = new com/google/android/gms/drive/events/zzp;
    localzzp.<init>();
    CREATOR = localzzp;
  }
  
  TransferStateEvent(int paramInt, String paramString, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzVa = paramString;
    this.zzapU = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    Object localObject1;
    Object localObject2;
    if (paramObject != null)
    {
      localObject1 = paramObject.getClass();
      localObject2 = getClass();
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != this)
      {
        paramObject = (TransferStateEvent)paramObject;
        localObject1 = this.zzVa;
        localObject2 = ((TransferStateEvent)paramObject).zzVa;
        boolean bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzapU;
          localObject2 = ((TransferStateEvent)paramObject).zzapU;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int getType()
  {
    return 7;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzVa;
    arrayOfObject[0] = localObject;
    localObject = this.zzapU;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    List localList = this.zzapU;
    String str = TextUtils.join("','", localList);
    arrayOfObject[0] = str;
    return String.format("TransferStateEvent[%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\TransferStateEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */