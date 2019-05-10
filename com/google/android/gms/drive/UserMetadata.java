package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class UserMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzWQ;
  final String zzaps;
  final String zzapt;
  final boolean zzapu;
  final String zzapv;
  
  static
  {
    zzl localzzl = new com/google/android/gms/drive/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  UserMetadata(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this.mVersionCode = paramInt;
    this.zzaps = paramString1;
    this.zzWQ = paramString2;
    this.zzapt = paramString3;
    this.zzapu = paramBoolean;
    this.zzapv = paramString4;
  }
  
  public UserMetadata(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this(1, paramString1, paramString2, paramString3, paramBoolean, paramString4);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.zzaps;
    arrayOfObject[0] = localObject;
    localObject = this.zzWQ;
    arrayOfObject[1] = localObject;
    localObject = this.zzapt;
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.zzapu);
    arrayOfObject[3] = localObject;
    localObject = this.zzapv;
    arrayOfObject[4] = localObject;
    return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\UserMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */