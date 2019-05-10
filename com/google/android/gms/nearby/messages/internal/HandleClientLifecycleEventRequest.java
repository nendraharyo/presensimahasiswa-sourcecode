package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class HandleClientLifecycleEventRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int versionCode;
  public final ClientAppContext zzbcs;
  public final int zzbct;
  
  static
  {
    zzc localzzc = new com/google/android/gms/nearby/messages/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  HandleClientLifecycleEventRequest(int paramInt1, ClientAppContext paramClientAppContext, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.zzbcs = paramClientAppContext;
    this.zzbct = paramInt2;
  }
  
  public HandleClientLifecycleEventRequest(ClientAppContext paramClientAppContext, int paramInt)
  {
    this(1, paramClientAppContext, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\HandleClientLifecycleEventRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */