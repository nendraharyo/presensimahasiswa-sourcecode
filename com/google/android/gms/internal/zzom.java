package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;

public abstract interface zzom
  extends IInterface
{
  public abstract void zza(DailyTotalRequest paramDailyTotalRequest);
  
  public abstract void zza(DataDeleteRequest paramDataDeleteRequest);
  
  public abstract void zza(DataInsertRequest paramDataInsertRequest);
  
  public abstract void zza(DataReadRequest paramDataReadRequest);
  
  public abstract void zza(DataUpdateListenerRegistrationRequest paramDataUpdateListenerRegistrationRequest);
  
  public abstract void zza(DataUpdateListenerUnregistrationRequest paramDataUpdateListenerUnregistrationRequest);
  
  public abstract void zza(DataUpdateRequest paramDataUpdateRequest);
  
  public abstract void zza(GetSyncInfoRequest paramGetSyncInfoRequest);
  
  public abstract void zza(ReadRawRequest paramReadRawRequest);
  
  public abstract void zza(ReadStatsRequest paramReadStatsRequest);
  
  public abstract void zzb(DataInsertRequest paramDataInsertRequest);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzom.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */