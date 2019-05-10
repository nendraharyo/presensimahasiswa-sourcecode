package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.model.moments.MomentBuffer;

final class zze$zza
  implements Moments.LoadMomentsResult
{
  private final Status zzUX;
  private final String zzbek;
  private final String zzbel;
  private final MomentBuffer zzbem;
  
  public zze$zza(Status paramStatus, DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    this.zzUX = paramStatus;
    this.zzbek = paramString1;
    this.zzbel = paramString2;
    MomentBuffer localMomentBuffer;
    if (paramDataHolder != null)
    {
      localMomentBuffer = new com/google/android/gms/plus/model/moments/MomentBuffer;
      localMomentBuffer.<init>(paramDataHolder);
    }
    for (;;)
    {
      this.zzbem = localMomentBuffer;
      return;
      localMomentBuffer = null;
    }
  }
  
  public MomentBuffer getMomentBuffer()
  {
    return this.zzbem;
  }
  
  public String getNextPageToken()
  {
    return this.zzbek;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public String getUpdated()
  {
    return this.zzbel;
  }
  
  public void release()
  {
    MomentBuffer localMomentBuffer = this.zzbem;
    if (localMomentBuffer != null)
    {
      localMomentBuffer = this.zzbem;
      localMomentBuffer.release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zze$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */