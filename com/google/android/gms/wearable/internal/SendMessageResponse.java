package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SendMessageResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final int zzaNj;
  
  static
  {
    zzbi localzzbi = new com/google/android/gms/wearable/internal/zzbi;
    localzzbi.<init>();
    CREATOR = localzzbi;
  }
  
  SendMessageResponse(int paramInt1, int paramInt2, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzaNj = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\SendMessageResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */