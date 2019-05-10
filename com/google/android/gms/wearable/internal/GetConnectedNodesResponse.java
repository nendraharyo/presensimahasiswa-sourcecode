package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetConnectedNodesResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final List zzbsI;
  
  static
  {
    zzaq localzzaq = new com/google/android/gms/wearable/internal/zzaq;
    localzzaq.<init>();
    CREATOR = localzzaq;
  }
  
  GetConnectedNodesResponse(int paramInt1, int paramInt2, List paramList)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbsI = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaq.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\GetConnectedNodesResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */