package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UnsubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final String zzbbF;
  public final boolean zzbbH;
  public final zzd zzbcY;
  public final String zzbco;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  public final PendingIntent zzbda;
  public final int zzbdb;
  
  static
  {
    zzu localzzu = new com/google/android/gms/nearby/messages/internal/zzu;
    localzzu.<init>();
    CREATOR = localzzu;
  }
  
  UnsubscribeRequest(int paramInt1, IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    this.mVersionCode = paramInt1;
    Object localObject = zzd.zza.zzdy(paramIBinder1);
    this.zzbcY = ((zzd)localObject);
    localObject = zze.zza.zzdz(paramIBinder2);
    this.zzbcr = ((zze)localObject);
    this.zzbda = paramPendingIntent;
    this.zzbdb = paramInt2;
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
  
  UnsubscribeRequest(IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent, int paramInt, ClientAppContext paramClientAppContext)
  {
    this(1, paramIBinder1, paramIBinder2, paramPendingIntent, paramInt, null, null, false, paramClientAppContext);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbcr.asBinder();
  }
  
  IBinder zzEH()
  {
    Object localObject = this.zzbcY;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbcY.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\UnsubscribeRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */