package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.MessageApi.MessageListener;

final class zzaz$zza
  extends zzi
{
  private zzq zzbbi;
  private MessageApi.MessageListener zzbsS;
  private IntentFilter[] zzbsT;
  
  private zzaz$zza(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    super(paramGoogleApiClient);
    Object localObject = (MessageApi.MessageListener)zzx.zzz(paramMessageListener);
    this.zzbsS = ((MessageApi.MessageListener)localObject);
    localObject = (zzq)zzx.zzz(paramzzq);
    this.zzbbi = ((zzq)localObject);
    localObject = (IntentFilter[])zzx.zzz(paramArrayOfIntentFilter);
    this.zzbsT = ((IntentFilter[])localObject);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    MessageApi.MessageListener localMessageListener = this.zzbsS;
    zzq localzzq = this.zzbbi;
    IntentFilter[] arrayOfIntentFilter = this.zzbsT;
    paramzzbp.zza(this, localMessageListener, localzzq, arrayOfIntentFilter);
    this.zzbsS = null;
    this.zzbbi = null;
    this.zzbsT = null;
  }
  
  public Status zzb(Status paramStatus)
  {
    this.zzbsS = null;
    this.zzbbi = null;
    this.zzbsT = null;
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaz$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */