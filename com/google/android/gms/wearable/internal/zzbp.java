package com.google.android.gms.wearable.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class zzbp
  extends zzj
{
  private final ExecutorService zzbkn;
  private final zzay zzbte;
  private final zzay zzbtf;
  private final zzay zzbtg;
  private final zzay zzbth;
  private final zzay zzbti;
  private final zzay zzbtj;
  private final zzay zzbtk;
  private final zzay zzbtl;
  
  public zzbp(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, zzf paramzzf)
  {
    super(paramContext, paramLooper, 14, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject = Executors.newCachedThreadPool();
    this.zzbkn = ((ExecutorService)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbte = ((zzay)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbtf = ((zzay)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbtg = ((zzay)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbth = ((zzay)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbti = ((zzay)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbtj = ((zzay)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbtk = ((zzay)localObject);
    localObject = new com/google/android/gms/wearable/internal/zzay;
    ((zzay)localObject).<init>();
    this.zzbtl = ((zzay)localObject);
  }
  
  private FutureTask zza(ParcelFileDescriptor paramParcelFileDescriptor, byte[] paramArrayOfByte)
  {
    FutureTask localFutureTask = new java/util/concurrent/FutureTask;
    zzbp.1 local1 = new com/google/android/gms/wearable/internal/zzbp$1;
    local1.<init>(this, paramParcelFileDescriptor, paramArrayOfByte);
    localFutureTask.<init>(local1);
    return localFutureTask;
  }
  
  private Runnable zzb(zza.zzb paramzzb, String paramString, Uri paramUri, long paramLong1, long paramLong2)
  {
    zzx.zzz(paramzzb);
    zzx.zzz(paramString);
    zzx.zzz(paramUri);
    long l = 0L;
    boolean bool = paramLong1 < l;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (!bool)
    {
      bool = true;
      localObject1 = "startOffset is negative: %s";
      int i = 1;
      localObject2 = new Object[i];
      localObject3 = Long.valueOf(paramLong1);
      localObject2[0] = localObject3;
      zzx.zzb(bool, (String)localObject1, (Object[])localObject2);
      l = -1;
      bool = paramLong2 < l;
      if (bool) {
        break label149;
      }
    }
    label149:
    for (bool = true;; bool = false)
    {
      localObject2 = new Object[1];
      localObject3 = Long.valueOf(paramLong2);
      localObject2[0] = localObject3;
      zzx.zzb(bool, "invalid length: %s", (Object[])localObject2);
      localObject1 = new com/google/android/gms/wearable/internal/zzbp$3;
      localObject2 = this;
      localObject3 = paramzzb;
      ((zzbp.3)localObject1).<init>(this, paramUri, paramzzb, paramString, paramLong1, paramLong2);
      return (Runnable)localObject1;
      bool = false;
      break;
    }
  }
  
  private Runnable zzb(zza.zzb paramzzb, String paramString, Uri paramUri, boolean paramBoolean)
  {
    zzx.zzz(paramzzb);
    zzx.zzz(paramString);
    zzx.zzz(paramUri);
    zzbp.2 local2 = new com/google/android/gms/wearable/internal/zzbp$2;
    local2.<init>(this, paramUri, paramzzb, paramBoolean, paramString);
    return local2;
  }
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    Object localObject1 = "WearableClient";
    int i = 2;
    boolean bool = Log.isLoggable((String)localObject1, i);
    if (bool)
    {
      localObject1 = "WearableClient";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "onPostInitHandler: statusCode ";
      localObject2 = str + paramInt1;
      Log.d((String)localObject1, (String)localObject2);
    }
    if (paramInt1 == 0)
    {
      this.zzbte.zzev(paramIBinder);
      this.zzbtf.zzev(paramIBinder);
      this.zzbtg.zzev(paramIBinder);
      this.zzbth.zzev(paramIBinder);
      this.zzbti.zzev(paramIBinder);
      this.zzbtj.zzev(paramIBinder);
      this.zzbtk.zzev(paramIBinder);
      localObject1 = this.zzbtl;
      ((zzay)localObject1).zzev(paramIBinder);
    }
    super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public void zza(zza.zzb paramzzb, Uri paramUri)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzk localzzk = new com/google/android/gms/wearable/internal/zzbo$zzk;
    localzzk.<init>(paramzzb);
    localzzax.zza(localzzk, paramUri);
  }
  
  public void zza(zza.zzb paramzzb, Uri paramUri, int paramInt)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzl localzzl = new com/google/android/gms/wearable/internal/zzbo$zzl;
    localzzl.<init>(paramzzb);
    localzzax.zza(localzzl, paramUri, paramInt);
  }
  
  public void zza(zza.zzb paramzzb, Asset paramAsset)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzm localzzm = new com/google/android/gms/wearable/internal/zzbo$zzm;
    localzzm.<init>(paramzzb);
    localzzax.zza(localzzm, paramAsset);
  }
  
  public void zza(zza.zzb paramzzb, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    this.zzbtl.zza(this, paramzzb, paramCapabilityListener);
  }
  
  public void zza(zza.zzb paramzzb, CapabilityApi.CapabilityListener paramCapabilityListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzay localzzay = this.zzbtl;
    zzbq localzzbq = zzbq.zze(paramzzq, paramArrayOfIntentFilter);
    localzzay.zza(this, paramzzb, paramCapabilityListener, localzzbq);
  }
  
  public void zza(zza.zzb paramzzb, ChannelApi.ChannelListener paramChannelListener, zzq paramzzq, String paramString, IntentFilter[] paramArrayOfIntentFilter)
  {
    Object localObject1;
    Object localObject2;
    if (paramString == null)
    {
      localObject1 = this.zzbtg;
      localObject2 = zzbq.zzd(paramzzq, paramArrayOfIntentFilter);
      ((zzay)localObject1).zza(this, paramzzb, paramChannelListener, (zzbq)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/wearable/internal/zzbj;
      ((zzbj)localObject1).<init>(paramString, paramChannelListener);
      localObject2 = this.zzbtg;
      zzbq localzzbq = zzbq.zza(paramzzq, paramString, paramArrayOfIntentFilter);
      ((zzay)localObject2).zza(this, paramzzb, localObject1, localzzbq);
    }
  }
  
  public void zza(zza.zzb paramzzb, ChannelApi.ChannelListener paramChannelListener, String paramString)
  {
    Object localObject;
    if (paramString == null)
    {
      localObject = this.zzbtg;
      ((zzay)localObject).zza(this, paramzzb, paramChannelListener);
    }
    for (;;)
    {
      return;
      localObject = new com/google/android/gms/wearable/internal/zzbj;
      ((zzbj)localObject).<init>(paramString, paramChannelListener);
      zzay localzzay = this.zzbtg;
      localzzay.zza(this, paramzzb, localObject);
    }
  }
  
  public void zza(zza.zzb paramzzb, DataApi.DataListener paramDataListener)
  {
    this.zzbth.zza(this, paramzzb, paramDataListener);
  }
  
  public void zza(zza.zzb paramzzb, DataApi.DataListener paramDataListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzay localzzay = this.zzbth;
    zzbq localzzbq = zzbq.zza(paramzzq, paramArrayOfIntentFilter);
    localzzay.zza(this, paramzzb, paramDataListener, localzzbq);
  }
  
  public void zza(zza.zzb paramzzb, DataItemAsset paramDataItemAsset)
  {
    Asset localAsset = Asset.createFromRef(paramDataItemAsset.getId());
    zza(paramzzb, localAsset);
  }
  
  public void zza(zza.zzb paramzzb, MessageApi.MessageListener paramMessageListener)
  {
    this.zzbti.zza(this, paramzzb, paramMessageListener);
  }
  
  public void zza(zza.zzb paramzzb, MessageApi.MessageListener paramMessageListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzay localzzay = this.zzbti;
    zzbq localzzbq = zzbq.zzb(paramzzq, paramArrayOfIntentFilter);
    localzzay.zza(this, paramzzb, paramMessageListener, localzzbq);
  }
  
  public void zza(zza.zzb paramzzb, NodeApi.NodeListener paramNodeListener)
  {
    this.zzbtj.zza(this, paramzzb, paramNodeListener);
  }
  
  public void zza(zza.zzb paramzzb, NodeApi.NodeListener paramNodeListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzay localzzay = this.zzbtj;
    zzbq localzzbq = zzbq.zzc(paramzzq, paramArrayOfIntentFilter);
    localzzay.zza(this, paramzzb, paramNodeListener, localzzbq);
  }
  
  public void zza(zza.zzb paramzzb, PutDataRequest paramPutDataRequest)
  {
    int i = 1;
    Object localObject1 = paramPutDataRequest.getAssets().entrySet();
    Object localObject4 = ((Set)localObject1).iterator();
    do
    {
      do
      {
        do
        {
          do
          {
            bool1 = ((Iterator)localObject4).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (Asset)((Map.Entry)((Iterator)localObject4).next()).getValue();
            localObject5 = ((Asset)localObject1).getData();
          } while (localObject5 != null);
          localObject5 = ((Asset)localObject1).getDigest();
        } while (localObject5 != null);
        localObject5 = ((Asset)localObject1).getFd();
      } while (localObject5 != null);
      localObject5 = ((Asset)localObject1).getUri();
    } while (localObject5 != null);
    localObject4 = new java/lang/IllegalArgumentException;
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    localObject5 = ((StringBuilder)localObject5).append("Put for ");
    Object localObject6 = paramPutDataRequest.getUri();
    localObject1 = localObject6 + " contains invalid asset: " + localObject1;
    ((IllegalArgumentException)localObject4).<init>((String)localObject1);
    throw ((Throwable)localObject4);
    localObject5 = PutDataRequest.zzr(paramPutDataRequest.getUri());
    localObject1 = paramPutDataRequest.getData();
    ((PutDataRequest)localObject5).setData((byte[])localObject1);
    boolean bool1 = paramPutDataRequest.isUrgent();
    if (bool1) {
      ((PutDataRequest)localObject5).setUrgent();
    }
    localObject6 = new java/util/ArrayList;
    ((ArrayList)localObject6).<init>();
    localObject1 = paramPutDataRequest.getAssets().entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    Object localObject3;
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (bool1)
      {
        localObject1 = (Map.Entry)localIterator.next();
        localObject4 = (Asset)((Map.Entry)localObject1).getValue();
        Object localObject7 = ((Asset)localObject4).getData();
        Object localObject8;
        Object localObject9;
        if (localObject7 != null) {
          try
          {
            localObject7 = ParcelFileDescriptor.createPipe();
            localObject8 = "WearableClient";
            int j = 3;
            boolean bool2 = Log.isLoggable((String)localObject8, j);
            if (bool2)
            {
              localObject8 = "WearableClient";
              localObject9 = new java/lang/StringBuilder;
              ((StringBuilder)localObject9).<init>();
              localObject9 = ((StringBuilder)localObject9).append("processAssets: replacing data with FD in asset: ").append(localObject4).append(" read:");
              Object localObject10 = localObject7[0];
              localObject9 = ((StringBuilder)localObject9).append(localObject10).append(" write:");
              localObject10 = localObject7[i];
              localObject9 = localObject10;
              Log.d((String)localObject8, (String)localObject9);
            }
            localObject1 = (String)((Map.Entry)localObject1).getKey();
            localObject8 = Asset.createFromFd(localObject7[0]);
            ((PutDataRequest)localObject5).putAsset((String)localObject1, (Asset)localObject8);
            localObject1 = localObject7[i];
            localObject4 = ((Asset)localObject4).getData();
            localObject1 = zza((ParcelFileDescriptor)localObject1, (byte[])localObject4);
            ((List)localObject6).add(localObject1);
            localObject4 = this.zzbkn;
            ((ExecutorService)localObject4).submit((Runnable)localObject1);
          }
          catch (IOException localIOException)
          {
            localObject4 = new java/lang/IllegalStateException;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject5 = "Unable to create ParcelFileDescriptor for asset in request: " + paramPutDataRequest;
            ((IllegalStateException)localObject4).<init>((String)localObject5, localIOException);
            throw ((Throwable)localObject4);
          }
        }
        localObject7 = ((Asset)localObject4).getUri();
        if (localObject7 != null) {
          try
          {
            localObject7 = getContext();
            localObject7 = ((Context)localObject7).getContentResolver();
            localObject8 = ((Asset)localObject4).getUri();
            localObject9 = "r";
            localObject7 = ((ContentResolver)localObject7).openFileDescriptor((Uri)localObject8, (String)localObject9);
            localObject7 = Asset.createFromFd((ParcelFileDescriptor)localObject7);
            Object localObject2 = localIOException.getKey();
            localObject2 = (String)localObject2;
            ((PutDataRequest)localObject5).putAsset((String)localObject2, (Asset)localObject7);
          }
          catch (FileNotFoundException localFileNotFoundException)
          {
            localObject3 = new com/google/android/gms/wearable/internal/zzbo$zzq;
            ((zzbo.zzq)localObject3).<init>(paramzzb, (List)localObject6);
            localObject5 = new com/google/android/gms/wearable/internal/PutDataResponse;
            int k = 4005;
            localIterator = null;
            ((PutDataResponse)localObject5).<init>(k, null);
            ((zzbo.zzq)localObject3).zza((PutDataResponse)localObject5);
            localObject3 = "WearableClient";
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Couldn't resolve asset URI: ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject4 = ((Asset)localObject4).getUri();
            localObject4 = localObject4;
            Log.w((String)localObject3, (String)localObject4);
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject3 = (String)((Map.Entry)localObject3).getKey();
      ((PutDataRequest)localObject5).putAsset((String)localObject3, (Asset)localObject4);
      break;
      localObject3 = (zzax)zzqJ();
      localObject4 = new com/google/android/gms/wearable/internal/zzbo$zzq;
      ((zzbo.zzq)localObject4).<init>(paramzzb, (List)localObject6);
      ((zzax)localObject3).zza((zzav)localObject4, (PutDataRequest)localObject5);
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString, Uri paramUri, long paramLong1, long paramLong2)
  {
    try
    {
      ExecutorService localExecutorService = this.zzbkn;
      localObject = zzb(paramzzb, paramString, paramUri, paramLong1, paramLong2);
      localExecutorService.execute((Runnable)localObject);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Object localObject = new com/google/android/gms/common/api/Status;
      ((Status)localObject).<init>(8);
      paramzzb.zzw((Status)localObject);
      throw localRuntimeException;
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString, Uri paramUri, boolean paramBoolean)
  {
    try
    {
      ExecutorService localExecutorService = this.zzbkn;
      localObject = zzb(paramzzb, paramString, paramUri, paramBoolean);
      localExecutorService.execute((Runnable)localObject);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Object localObject = new com/google/android/gms/common/api/Status;
      ((Status)localObject).<init>(8);
      paramzzb.zzw((Status)localObject);
      throw localRuntimeException;
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzt localzzt = new com/google/android/gms/wearable/internal/zzbo$zzt;
    localzzt.<init>(paramzzb);
    localzzax.zza(localzzt, paramString1, paramString2, paramArrayOfByte);
  }
  
  public void zzb(zza.zzb paramzzb, int paramInt)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzf localzzf = new com/google/android/gms/wearable/internal/zzbo$zzf;
    localzzf.<init>(paramzzb);
    localzzax.zza(localzzf, paramInt);
  }
  
  public void zzb(zza.zzb paramzzb, Uri paramUri, int paramInt)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zze localzze = new com/google/android/gms/wearable/internal/zzbo$zze;
    localzze.<init>(paramzzb);
    localzzax.zzb(localzze, paramUri, paramInt);
  }
  
  public void zze(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzp localzzp = new com/google/android/gms/wearable/internal/zzbo$zzp;
    localzzp.<init>(paramzzb);
    localzzax.zza(localzzp, paramString1, paramString2);
  }
  
  protected zzax zzew(IBinder paramIBinder)
  {
    return zzax.zza.zzeu(paramIBinder);
  }
  
  public void zzg(zza.zzb paramzzb, String paramString, int paramInt)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzg localzzg = new com/google/android/gms/wearable/internal/zzbo$zzg;
    localzzg.<init>(paramzzb);
    localzzax.zza(localzzg, paramString, paramInt);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.wearable.BIND";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.wearable.internal.IWearableService";
  }
  
  public void zzh(zza.zzb paramzzb, String paramString, int paramInt)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzd localzzd = new com/google/android/gms/wearable/internal/zzbo$zzd;
    localzzd.<init>(paramzzb);
    localzzax.zzb(localzzd, paramString, paramInt);
  }
  
  public void zzr(zza.zzb paramzzb)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzl localzzl = new com/google/android/gms/wearable/internal/zzbo$zzl;
    localzzl.<init>(paramzzb);
    localzzax.zzb(localzzl);
  }
  
  public void zzr(zza.zzb paramzzb, String paramString)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zza localzza = new com/google/android/gms/wearable/internal/zzbo$zza;
    localzza.<init>(paramzzb);
    localzzax.zzd(localzza, paramString);
  }
  
  public void zzs(zza.zzb paramzzb)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzn localzzn = new com/google/android/gms/wearable/internal/zzbo$zzn;
    localzzn.<init>(paramzzb);
    localzzax.zzc(localzzn);
  }
  
  public void zzs(zza.zzb paramzzb, String paramString)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzs localzzs = new com/google/android/gms/wearable/internal/zzbo$zzs;
    localzzs.<init>(paramzzb);
    localzzax.zze(localzzs, paramString);
  }
  
  public void zzt(zza.zzb paramzzb)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzj localzzj = new com/google/android/gms/wearable/internal/zzbo$zzj;
    localzzj.<init>(paramzzb);
    localzzax.zzd(localzzj);
  }
  
  public void zzt(zza.zzb paramzzb, String paramString)
  {
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzc localzzc = new com/google/android/gms/wearable/internal/zzbo$zzc;
    localzzc.<init>(paramzzb);
    localzzax.zzf(localzzc, paramString);
  }
  
  public void zzu(zza.zzb paramzzb, String paramString)
  {
    zzt localzzt = new com/google/android/gms/wearable/internal/zzt;
    localzzt.<init>();
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzh localzzh = new com/google/android/gms/wearable/internal/zzbo$zzh;
    localzzh.<init>(paramzzb, localzzt);
    localzzax.zza(localzzh, localzzt, paramString);
  }
  
  public void zzv(zza.zzb paramzzb, String paramString)
  {
    zzt localzzt = new com/google/android/gms/wearable/internal/zzt;
    localzzt.<init>();
    zzax localzzax = (zzax)zzqJ();
    zzbo.zzi localzzi = new com/google/android/gms/wearable/internal/zzbo$zzi;
    localzzi.<init>(paramzzb, localzzt);
    localzzax.zzb(localzzi, localzzt, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */