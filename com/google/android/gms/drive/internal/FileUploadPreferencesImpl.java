package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

public final class FileUploadPreferencesImpl
  implements SafeParcelable, FileUploadPreferences
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  int zzarG;
  int zzarH;
  boolean zzarI;
  
  static
  {
    zzag localzzag = new com/google/android/gms/drive/internal/zzag;
    localzzag.<init>();
    CREATOR = localzzag;
  }
  
  FileUploadPreferencesImpl(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzarG = paramInt2;
    this.zzarH = paramInt3;
    this.zzarI = paramBoolean;
  }
  
  public static boolean zzdj(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean zzdk(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getBatteryUsagePreference()
  {
    int i = zzdk(this.zzarH);
    if (i == 0) {}
    int j;
    for (i = 0;; j = this.zzarH) {
      return i;
    }
  }
  
  public int getNetworkTypePreference()
  {
    int i = zzdj(this.zzarG);
    if (i == 0) {}
    int j;
    for (i = 0;; j = this.zzarG) {
      return i;
    }
  }
  
  public boolean isRoamingAllowed()
  {
    return this.zzarI;
  }
  
  public void setBatteryUsagePreference(int paramInt)
  {
    boolean bool = zzdk(paramInt);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Invalid battery usage preference value.");
      throw localIllegalArgumentException;
    }
    this.zzarH = paramInt;
  }
  
  public void setNetworkTypePreference(int paramInt)
  {
    boolean bool = zzdj(paramInt);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Invalid data connection preference value.");
      throw localIllegalArgumentException;
    }
    this.zzarG = paramInt;
  }
  
  public void setRoamingAllowed(boolean paramBoolean)
  {
    this.zzarI = paramBoolean;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzag.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\FileUploadPreferencesImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */