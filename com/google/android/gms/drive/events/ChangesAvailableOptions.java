package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class ChangesAvailableOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final boolean zzapA;
  final List zzapB;
  private final Set zzapC;
  final int zzapz;
  
  static
  {
    zzd localzzd = new com/google/android/gms/drive/events/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  ChangesAvailableOptions(int paramInt1, int paramInt2, boolean paramBoolean, List paramList) {}
  
  private ChangesAvailableOptions(int paramInt1, int paramInt2, boolean paramBoolean, List paramList, Set paramSet)
  {
    this.mVersionCode = paramInt1;
    this.zzapz = paramInt2;
    this.zzapA = paramBoolean;
    this.zzapB = paramList;
    this.zzapC = paramSet;
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
        paramObject = (ChangesAvailableOptions)paramObject;
        localObject1 = this.zzapC;
        localObject2 = ((ChangesAvailableOptions)paramObject).zzapC;
        boolean bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          int i = this.zzapz;
          int j = ((ChangesAvailableOptions)paramObject).zzapz;
          if (i == j)
          {
            boolean bool3 = this.zzapA;
            boolean bool4 = ((ChangesAvailableOptions)paramObject).zzapA;
            if (bool3 == bool4) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzapC;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzapz);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzapA);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.zzapz);
    arrayOfObject[0] = localObject;
    localObject = Boolean.valueOf(this.zzapA);
    arrayOfObject[1] = localObject;
    localObject = this.zzapB;
    arrayOfObject[2] = localObject;
    return String.format(localLocale, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\ChangesAvailableOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */