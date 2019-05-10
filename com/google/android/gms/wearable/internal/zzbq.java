package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

final class zzbq
  extends zzaw.zza
{
  private zzq zzbbb;
  private final IntentFilter[] zzbsT;
  private zzq zzbtp;
  private zzq zzbtq;
  private zzq zzbtr;
  private zzq zzbts;
  private zzq zzbtt;
  private zzq zzbtu;
  private zzq zzbtv;
  private final String zzbtw;
  
  private zzbq(IntentFilter[] paramArrayOfIntentFilter, String paramString)
  {
    IntentFilter[] arrayOfIntentFilter = (IntentFilter[])zzx.zzz(paramArrayOfIntentFilter);
    this.zzbsT = arrayOfIntentFilter;
    this.zzbtw = paramString;
  }
  
  private static zzq.zzb zzI(List paramList)
  {
    zzbq.7 local7 = new com/google/android/gms/wearable/internal/zzbq$7;
    local7.<init>(paramList);
    return local7;
  }
  
  public static zzbq zza(zzq paramzzq, String paramString, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbq localzzbq = new com/google/android/gms/wearable/internal/zzbq;
    Object localObject = (String)zzx.zzz(paramString);
    localzzbq.<init>(paramArrayOfIntentFilter, (String)localObject);
    localObject = (zzq)zzx.zzz(paramzzq);
    localzzbq.zzbtu = ((zzq)localObject);
    return localzzbq;
  }
  
  public static zzbq zza(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbq localzzbq = new com/google/android/gms/wearable/internal/zzbq;
    localzzbq.<init>(paramArrayOfIntentFilter, null);
    zzq localzzq = (zzq)zzx.zzz(paramzzq);
    localzzbq.zzbtr = localzzq;
    return localzzbq;
  }
  
  private static zzq.zzb zzai(DataHolder paramDataHolder)
  {
    zzbq.3 local3 = new com/google/android/gms/wearable/internal/zzbq$3;
    local3.<init>(paramDataHolder);
    return local3;
  }
  
  private static zzq.zzb zzb(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable)
  {
    zzbq.2 local2 = new com/google/android/gms/wearable/internal/zzbq$2;
    local2.<init>(paramAmsEntityUpdateParcelable);
    return local2;
  }
  
  private static zzq.zzb zzb(AncsNotificationParcelable paramAncsNotificationParcelable)
  {
    zzbq.1 local1 = new com/google/android/gms/wearable/internal/zzbq$1;
    local1.<init>(paramAncsNotificationParcelable);
    return local1;
  }
  
  private static zzq.zzb zzb(CapabilityInfoParcelable paramCapabilityInfoParcelable)
  {
    zzbq.9 local9 = new com/google/android/gms/wearable/internal/zzbq$9;
    local9.<init>(paramCapabilityInfoParcelable);
    return local9;
  }
  
  private static zzq.zzb zzb(ChannelEventParcelable paramChannelEventParcelable)
  {
    zzbq.8 local8 = new com/google/android/gms/wearable/internal/zzbq$8;
    local8.<init>(paramChannelEventParcelable);
    return local8;
  }
  
  private static zzq.zzb zzb(MessageEventParcelable paramMessageEventParcelable)
  {
    zzbq.4 local4 = new com/google/android/gms/wearable/internal/zzbq$4;
    local4.<init>(paramMessageEventParcelable);
    return local4;
  }
  
  public static zzbq zzb(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbq localzzbq = new com/google/android/gms/wearable/internal/zzbq;
    localzzbq.<init>(paramArrayOfIntentFilter, null);
    zzq localzzq = (zzq)zzx.zzz(paramzzq);
    localzzbq.zzbbb = localzzq;
    return localzzbq;
  }
  
  private static zzq.zzb zzc(NodeParcelable paramNodeParcelable)
  {
    zzbq.5 local5 = new com/google/android/gms/wearable/internal/zzbq$5;
    local5.<init>(paramNodeParcelable);
    return local5;
  }
  
  public static zzbq zzc(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbq localzzbq = new com/google/android/gms/wearable/internal/zzbq;
    localzzbq.<init>(paramArrayOfIntentFilter, null);
    zzq localzzq = (zzq)zzx.zzz(paramzzq);
    localzzbq.zzbts = localzzq;
    return localzzbq;
  }
  
  private static zzq.zzb zzd(NodeParcelable paramNodeParcelable)
  {
    zzbq.6 local6 = new com/google/android/gms/wearable/internal/zzbq$6;
    local6.<init>(paramNodeParcelable);
    return local6;
  }
  
  public static zzbq zzd(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbq localzzbq = new com/google/android/gms/wearable/internal/zzbq;
    localzzbq.<init>(paramArrayOfIntentFilter, null);
    zzq localzzq = (zzq)zzx.zzz(paramzzq);
    localzzbq.zzbtu = localzzq;
    return localzzbq;
  }
  
  public static zzbq zze(zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbq localzzbq = new com/google/android/gms/wearable/internal/zzbq;
    localzzbq.<init>(paramArrayOfIntentFilter, null);
    zzq localzzq = (zzq)zzx.zzz(paramzzq);
    localzzbq.zzbtv = localzzq;
    return localzzbq;
  }
  
  private static void zzh(zzq paramzzq)
  {
    if (paramzzq != null) {
      paramzzq.clear();
    }
  }
  
  public void clear()
  {
    zzh(this.zzbtp);
    this.zzbtp = null;
    zzh(this.zzbtq);
    this.zzbtq = null;
    zzh(this.zzbtr);
    this.zzbtr = null;
    zzh(this.zzbbb);
    this.zzbbb = null;
    zzh(this.zzbts);
    this.zzbts = null;
    zzh(this.zzbtt);
    this.zzbtt = null;
    zzh(this.zzbtu);
    this.zzbtu = null;
    zzh(this.zzbtv);
    this.zzbtv = null;
  }
  
  public void onConnectedNodes(List paramList)
  {
    zzq localzzq = this.zzbtt;
    if (localzzq != null)
    {
      localzzq = this.zzbtt;
      zzq.zzb localzzb = zzI(paramList);
      localzzq.zza(localzzb);
    }
  }
  
  public IntentFilter[] zzIO()
  {
    return this.zzbsT;
  }
  
  public String zzIP()
  {
    return this.zzbtw;
  }
  
  public void zza(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable)
  {
    zzq localzzq = this.zzbtp;
    if (localzzq != null)
    {
      localzzq = this.zzbtp;
      zzq.zzb localzzb = zzb(paramAmsEntityUpdateParcelable);
      localzzq.zza(localzzb);
    }
  }
  
  public void zza(AncsNotificationParcelable paramAncsNotificationParcelable)
  {
    zzq localzzq = this.zzbtq;
    if (localzzq != null)
    {
      localzzq = this.zzbtq;
      zzq.zzb localzzb = zzb(paramAncsNotificationParcelable);
      localzzq.zza(localzzb);
    }
  }
  
  public void zza(CapabilityInfoParcelable paramCapabilityInfoParcelable)
  {
    zzq localzzq = this.zzbtv;
    if (localzzq != null)
    {
      localzzq = this.zzbtv;
      zzq.zzb localzzb = zzb(paramCapabilityInfoParcelable);
      localzzq.zza(localzzb);
    }
  }
  
  public void zza(ChannelEventParcelable paramChannelEventParcelable)
  {
    zzq localzzq = this.zzbtu;
    if (localzzq != null)
    {
      localzzq = this.zzbtu;
      zzq.zzb localzzb = zzb(paramChannelEventParcelable);
      localzzq.zza(localzzb);
    }
  }
  
  public void zza(MessageEventParcelable paramMessageEventParcelable)
  {
    zzq localzzq = this.zzbbb;
    if (localzzq != null)
    {
      localzzq = this.zzbbb;
      zzq.zzb localzzb = zzb(paramMessageEventParcelable);
      localzzq.zza(localzzb);
    }
  }
  
  public void zza(NodeParcelable paramNodeParcelable)
  {
    zzq localzzq = this.zzbts;
    if (localzzq != null)
    {
      localzzq = this.zzbts;
      zzq.zzb localzzb = zzc(paramNodeParcelable);
      localzzq.zza(localzzb);
    }
  }
  
  public void zzag(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzbtr;
    if (localzzq != null)
    {
      localzzq = this.zzbtr;
      zzq.zzb localzzb = zzai(paramDataHolder);
      localzzq.zza(localzzb);
    }
    for (;;)
    {
      return;
      paramDataHolder.close();
    }
  }
  
  public void zzb(NodeParcelable paramNodeParcelable)
  {
    zzq localzzq = this.zzbts;
    if (localzzq != null)
    {
      localzzq = this.zzbts;
      zzq.zzb localzzb = zzd(paramNodeParcelable);
      localzzq.zza(localzzb);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */