package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnStartStreamSession
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final ParcelFileDescriptor zzasv;
  final IBinder zzasw;
  final String zzsU;
  
  static
  {
    zzbi localzzbi = new com/google/android/gms/drive/internal/zzbi;
    localzzbi.<init>();
    CREATOR = localzzbi;
  }
  
  OnStartStreamSession(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor, IBinder paramIBinder, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzasv = paramParcelFileDescriptor;
    this.zzasw = paramIBinder;
    this.zzsU = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = paramInt | 0x1;
    zzbi.zza(this, paramParcel, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnStartStreamSession.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */