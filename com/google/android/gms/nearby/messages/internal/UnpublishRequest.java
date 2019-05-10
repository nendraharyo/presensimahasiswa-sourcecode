package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UnpublishRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbH;
  public final MessageWrapper zzbcT;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  static
  {
    zzt localzzt = new com/google/android/gms/nearby/messages/internal/zzt;
    localzzt.<init>();
    CREATOR = localzzt;
  }
  
  UnpublishRequest(int paramInt, MessageWrapper paramMessageWrapper, IBinder paramIBinder, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    this.mVersionCode = paramInt;
    this.zzbcT = paramMessageWrapper;
    Object localObject = zze.zza.zzdz(paramIBinder);
    this.zzbcr = ((zze)localObject);
    this.zzbbF = paramString1;
    this.zzbco = paramString2;
    this.zzbbH = paramBoolean;
    if (paramClientAppContext != null) {}
    for (;;)
    {
      this.zzbcs = paramClientAppContext;
      return;
      paramClientAppContext = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
      localObject = this.zzbco;
      String str = this.zzbbF;
      boolean bool = this.zzbbH;
      paramClientAppContext.<init>((String)localObject, str, bool);
    }
  }
  
  UnpublishRequest(MessageWrapper paramMessageWrapper, IBinder paramIBinder, ClientAppContext paramClientAppContext)
  {
    this(1, paramMessageWrapper, paramIBinder, null, null, false, paramClientAppContext);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzt.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbcr.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\UnpublishRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */