package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class LaunchOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private boolean zzaaK;
  private String zzaaL;
  
  static
  {
    zzd localzzd = new com/google/android/gms/cast/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  public LaunchOptions()
  {
    this(1, false, str);
  }
  
  LaunchOptions(int paramInt, boolean paramBoolean, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzaaK = paramBoolean;
    this.zzaaL = paramString;
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
      boolean bool2 = paramObject instanceof LaunchOptions;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (LaunchOptions)paramObject;
        bool2 = this.zzaaK;
        boolean bool3 = ((LaunchOptions)paramObject).zzaaK;
        if (bool2 == bool3)
        {
          String str1 = this.zzaaL;
          String str2 = ((LaunchOptions)paramObject).zzaaL;
          bool2 = zzf.zza(str1, str2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public String getLanguage()
  {
    return this.zzaaL;
  }
  
  public boolean getRelaunchIfRunning()
  {
    return this.zzaaK;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Boolean.valueOf(this.zzaaK);
    arrayOfObject[0] = localObject;
    localObject = this.zzaaL;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void setLanguage(String paramString)
  {
    this.zzaaL = paramString;
  }
  
  public void setRelaunchIfRunning(boolean paramBoolean)
  {
    this.zzaaK = paramBoolean;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Boolean.valueOf(this.zzaaK);
    arrayOfObject[0] = localObject;
    localObject = this.zzaaL;
    arrayOfObject[1] = localObject;
    return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\LaunchOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */