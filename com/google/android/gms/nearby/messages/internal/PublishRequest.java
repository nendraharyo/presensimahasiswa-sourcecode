package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

public final class PublishRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbG;
  public final boolean zzbbH;
  public final MessageWrapper zzbcT;
  public final Strategy zzbcU;
  public final zzg zzbcV;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  static
  {
    zzq localzzq = new com/google/android/gms/nearby/messages/internal/zzq;
    localzzq.<init>();
    CREATOR = localzzq;
  }
  
  PublishRequest(int paramInt, MessageWrapper paramMessageWrapper, Strategy paramStrategy, IBinder paramIBinder1, String paramString1, String paramString2, boolean paramBoolean1, IBinder paramIBinder2, boolean paramBoolean2, ClientAppContext paramClientAppContext)
  {
    this.mVersionCode = paramInt;
    this.zzbcT = paramMessageWrapper;
    this.zzbcU = paramStrategy;
    Object localObject = zze.zza.zzdz(paramIBinder1);
    this.zzbcr = ((zze)localObject);
    this.zzbbF = paramString1;
    this.zzbco = paramString2;
    this.zzbbG = paramBoolean1;
    if (paramIBinder2 == null)
    {
      localObject = null;
      this.zzbcV = ((zzg)localObject);
      this.zzbbH = paramBoolean2;
      if (paramClientAppContext == null) {
        break label92;
      }
    }
    for (;;)
    {
      this.zzbcs = paramClientAppContext;
      return;
      localObject = zzg.zza.zzdB(paramIBinder2);
      break;
      label92:
      paramClientAppContext = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
      localObject = this.zzbco;
      String str = this.zzbbF;
      boolean bool = this.zzbbH;
      paramClientAppContext.<init>((String)localObject, str, bool);
    }
  }
  
  PublishRequest(MessageWrapper paramMessageWrapper, Strategy paramStrategy, IBinder paramIBinder1, boolean paramBoolean, IBinder paramIBinder2, ClientAppContext paramClientAppContext)
  {
    this(2, paramMessageWrapper, paramStrategy, paramIBinder1, null, null, paramBoolean, paramIBinder2, false, paramClientAppContext);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbcr.asBinder();
  }
  
  IBinder zzEF()
  {
    Object localObject = this.zzbcV;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbcV.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\PublishRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */