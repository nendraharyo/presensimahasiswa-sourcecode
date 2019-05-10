package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class RegisterStatusCallbackRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  public String zzbbF;
  public final zzh zzbcW;
  public boolean zzbcX;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  static
  {
    zzr localzzr = new com/google/android/gms/nearby/messages/internal/zzr;
    localzzr.<init>();
    CREATOR = localzzr;
  }
  
  RegisterStatusCallbackRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, boolean paramBoolean, String paramString, ClientAppContext paramClientAppContext)
  {
    this.versionCode = paramInt;
    Object localObject = zze.zza.zzdz(paramIBinder1);
    this.zzbcr = ((zze)localObject);
    localObject = zzh.zza.zzdC(paramIBinder2);
    this.zzbcW = ((zzh)localObject);
    this.zzbcX = paramBoolean;
    this.zzbbF = paramString;
    if (paramClientAppContext != null) {}
    for (;;)
    {
      this.zzbcs = paramClientAppContext;
      return;
      paramClientAppContext = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
      localObject = null;
      String str = this.zzbbF;
      paramClientAppContext.<init>(null, str);
    }
  }
  
  RegisterStatusCallbackRequest(IBinder paramIBinder1, IBinder paramIBinder2, ClientAppContext paramClientAppContext)
  {
    this(1, paramIBinder1, paramIBinder2, false, null, paramClientAppContext);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbcr.asBinder();
  }
  
  IBinder zzEG()
  {
    return this.zzbcW.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\RegisterStatusCallbackRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */