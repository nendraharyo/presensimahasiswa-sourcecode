package com.google.android.gms.clearcut;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzsz.zzd;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;

public class zzb$zza
{
  private String zzaeS;
  private int zzaeT;
  private String zzaeU;
  private String zzaeV;
  private int zzaeX;
  private final zzb.zzb zzafb;
  private zzb.zzb zzafc;
  private ArrayList zzafd;
  private final zzsz.zzd zzafe;
  private boolean zzaff;
  
  private zzb$zza(zzb paramzzb, byte[] paramArrayOfByte)
  {
    this(paramzzb, paramArrayOfByte, null);
  }
  
  private zzb$zza(zzb paramzzb, byte[] paramArrayOfByte, zzb.zzb paramzzb1)
  {
    int i = zzb.zza(this.zzafg);
    this.zzaeT = i;
    Object localObject1 = zzb.zzb(this.zzafg);
    this.zzaeS = ((String)localObject1);
    localObject1 = zzb.zzc(this.zzafg);
    this.zzaeU = ((String)localObject1);
    localObject1 = zzb.zzd(this.zzafg);
    this.zzaeV = ((String)localObject1);
    i = zzb.zze(this.zzafg);
    this.zzaeX = i;
    this.zzafd = null;
    localObject1 = new com/google/android/gms/internal/zzsz$zzd;
    ((zzsz.zzd)localObject1).<init>();
    this.zzafe = ((zzsz.zzd)localObject1);
    i = 0;
    this.zzaff = false;
    localObject1 = zzb.zzc(paramzzb);
    this.zzaeU = ((String)localObject1);
    localObject1 = zzb.zzd(paramzzb);
    this.zzaeV = ((String)localObject1);
    localObject1 = this.zzafe;
    long l = zzb.zzf(paramzzb).currentTimeMillis();
    ((zzsz.zzd)localObject1).zzbuR = l;
    localObject1 = this.zzafe;
    l = zzb.zzf(paramzzb).elapsedRealtime();
    ((zzsz.zzd)localObject1).zzbuS = l;
    localObject1 = this.zzafe;
    Object localObject2 = zzb.zzh(paramzzb);
    Object localObject3 = zzb.zzg(paramzzb);
    int j = ((zza)localObject2).zzah((Context)localObject3);
    l = j;
    ((zzsz.zzd)localObject1).zzbvi = l;
    localObject1 = this.zzafe;
    localObject2 = zzb.zzi(paramzzb);
    localObject3 = this.zzafe;
    l = ((zzsz.zzd)localObject3).zzbuR;
    l = ((zzb.zzc)localObject2).zzC(l);
    ((zzsz.zzd)localObject1).zzbvd = l;
    if (paramArrayOfByte != null)
    {
      localObject1 = this.zzafe;
      ((zzsz.zzd)localObject1).zzbuY = paramArrayOfByte;
    }
    this.zzafb = paramzzb1;
  }
  
  public zza zzbq(int paramInt)
  {
    this.zzafe.zzbuU = paramInt;
    return this;
  }
  
  public zza zzbr(int paramInt)
  {
    this.zzafe.zzob = paramInt;
    return this;
  }
  
  public PendingResult zzd(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool = this.zzaff;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("do not reuse LogEventBuilder");
      throw ((Throwable)localObject);
    }
    this.zzaff = true;
    Object localObject = zzb.zzm(this.zzafg);
    LogEventParcelable localLogEventParcelable = zzoE();
    return ((zzc)localObject).zza(paramGoogleApiClient, localLogEventParcelable);
  }
  
  public LogEventParcelable zzoE()
  {
    LogEventParcelable localLogEventParcelable = new com/google/android/gms/clearcut/LogEventParcelable;
    PlayLoggerContext localPlayLoggerContext = new com/google/android/gms/playlog/internal/PlayLoggerContext;
    Object localObject1 = zzb.zzk(this.zzafg);
    int i = zzb.zzl(this.zzafg);
    int j = this.zzaeT;
    Object localObject2 = this.zzaeS;
    Object localObject3 = this.zzaeU;
    Object localObject4 = this.zzaeV;
    boolean bool = zzb.zzj(this.zzafg);
    int k = this.zzaeX;
    localPlayLoggerContext.<init>((String)localObject1, i, j, (String)localObject2, (String)localObject3, (String)localObject4, bool, k);
    zzsz.zzd localzzd = this.zzafe;
    localObject2 = this.zzafb;
    localObject3 = this.zzafc;
    localObject4 = zzb.zzc(this.zzafd);
    localObject1 = localLogEventParcelable;
    localLogEventParcelable.<init>(localPlayLoggerContext, localzzd, (zzb.zzb)localObject2, (zzb.zzb)localObject3, (int[])localObject4);
    return localLogEventParcelable;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\clearcut\zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */