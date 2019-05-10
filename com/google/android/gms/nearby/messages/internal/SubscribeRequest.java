package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public final class SubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbG;
  public final boolean zzbbH;
  public final Strategy zzbcU;
  public final zzd zzbcY;
  public final MessageFilter zzbcZ;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  public final PendingIntent zzbda;
  public final int zzbdb;
  public final byte[] zzbdc;
  public final zzi zzbdd;
  
  static
  {
    zzs localzzs = new com/google/android/gms/nearby/messages/internal/zzs;
    localzzs.<init>();
    CREATOR = localzzs;
  }
  
  SubscribeRequest(int paramInt1, IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean1, IBinder paramIBinder3, boolean paramBoolean2, ClientAppContext paramClientAppContext)
  {
    this.mVersionCode = paramInt1;
    Object localObject = zzd.zza.zzdy(paramIBinder1);
    this.zzbcY = ((zzd)localObject);
    this.zzbcU = paramStrategy;
    localObject = zze.zza.zzdz(paramIBinder2);
    this.zzbcr = ((zze)localObject);
    this.zzbcZ = paramMessageFilter;
    this.zzbda = paramPendingIntent;
    this.zzbdb = paramInt2;
    this.zzbbF = paramString1;
    this.zzbco = paramString2;
    this.zzbdc = paramArrayOfByte;
    this.zzbbG = paramBoolean1;
    if (paramIBinder3 == null)
    {
      localObject = null;
      this.zzbdd = ((zzi)localObject);
      this.zzbbH = paramBoolean2;
      if (paramClientAppContext == null) {
        break label123;
      }
    }
    for (;;)
    {
      this.zzbcs = paramClientAppContext;
      return;
      localObject = zzi.zza.zzdD(paramIBinder3);
      break;
      label123:
      paramClientAppContext = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
      localObject = this.zzbco;
      String str = this.zzbbF;
      boolean bool = this.zzbbH;
      paramClientAppContext.<init>((String)localObject, str, bool);
    }
  }
  
  public SubscribeRequest(IBinder paramIBinder1, Strategy paramStrategy, IBinder paramIBinder2, MessageFilter paramMessageFilter, PendingIntent paramPendingIntent, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean, IBinder paramIBinder3, ClientAppContext paramClientAppContext)
  {
    this(3, paramIBinder1, paramStrategy, paramIBinder2, paramMessageFilter, paramPendingIntent, paramInt, null, null, paramArrayOfByte, paramBoolean, paramIBinder3, false, paramClientAppContext);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    Object localObject = this.zzbcr;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbcr.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  IBinder zzEH()
  {
    Object localObject = this.zzbcY;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbcY.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  IBinder zzEI()
  {
    Object localObject = this.zzbdd;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbdd.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\SubscribeRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */