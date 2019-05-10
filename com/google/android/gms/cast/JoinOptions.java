package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class JoinOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private int zzaaJ;
  
  static
  {
    zzc localzzc = new com/google/android/gms/cast/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  public JoinOptions()
  {
    this(1, 0);
  }
  
  JoinOptions(int paramInt1, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzaaJ = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof JoinOptions;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (JoinOptions)paramObject;
        int i = this.zzaaJ;
        int j = ((JoinOptions)paramObject).zzaaJ;
        if (i != j) {
          bool1 = false;
        }
      }
    }
  }
  
  public int getConnectionType()
  {
    return this.zzaaJ;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(this.zzaaJ);
    arrayOfObject[0] = localInteger;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    int i = this.zzaaJ;
    String str;
    switch (i)
    {
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = str;
      return String.format("joinOptions(connectionType=%s)", arrayOfObject);
      str = "STRONG";
      continue;
      str = "INVISIBLE";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\JoinOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */