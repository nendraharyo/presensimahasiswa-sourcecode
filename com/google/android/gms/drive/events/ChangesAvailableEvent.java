package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Locale;

public final class ChangesAvailableEvent
  implements SafeParcelable, DriveEvent
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzVa;
  final ChangesAvailableOptions zzapy;
  
  static
  {
    zzb localzzb = new com/google/android/gms/drive/events/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  ChangesAvailableEvent(int paramInt, String paramString, ChangesAvailableOptions paramChangesAvailableOptions)
  {
    this.mVersionCode = paramInt;
    this.zzVa = paramString;
    this.zzapy = paramChangesAvailableOptions;
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
        paramObject = (ChangesAvailableEvent)paramObject;
        localObject1 = this.zzapy;
        localObject2 = ((ChangesAvailableEvent)paramObject).zzapy;
        boolean bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzVa;
          localObject2 = ((ChangesAvailableEvent)paramObject).zzVa;
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
    return 4;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzapy;
    arrayOfObject[0] = localObject;
    localObject = this.zzVa;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    ChangesAvailableOptions localChangesAvailableOptions = this.zzapy;
    arrayOfObject[0] = localChangesAvailableOptions;
    return String.format(localLocale, "ChangesAvailableEvent [changesAvailableOptions=%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\ChangesAvailableEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */