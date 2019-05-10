package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Locale;

public final class TransferProgressOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzapT;
  
  static
  {
    zzo localzzo = new com/google/android/gms/drive/events/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  TransferProgressOptions(int paramInt1, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzapT = paramInt2;
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
        paramObject = (TransferProgressOptions)paramObject;
        localObject1 = Integer.valueOf(this.zzapT);
        int i = ((TransferProgressOptions)paramObject).zzapT;
        localObject2 = Integer.valueOf(i);
        bool = zzw.equal(localObject1, localObject2);
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(this.zzapT);
    arrayOfObject[0] = localInteger;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(this.zzapT);
    arrayOfObject[0] = localInteger;
    return String.format(localLocale, "TransferProgressOptions[type=%d]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\TransferProgressOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */