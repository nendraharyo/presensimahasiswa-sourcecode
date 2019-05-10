package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

class zzaz$1
  extends zzi
{
  zzaz$1(zzaz paramzzaz, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str1 = this.zzbrW;
    String str2 = this.zzbsO;
    byte[] arrayOfByte = this.zzbsP;
    paramzzbp.zza(this, str1, str2, arrayOfByte);
  }
  
  protected MessageApi.SendMessageResult zzbz(Status paramStatus)
  {
    zzaz.zzb localzzb = new com/google/android/gms/wearable/internal/zzaz$zzb;
    localzzb.<init>(paramStatus, -1);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaz$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */