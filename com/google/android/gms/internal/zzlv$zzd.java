package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzlv$zzd
  extends zzlv.zzc
{
  private final LogEventParcelable zzafx;
  
  zzlv$zzd(zzlv paramzzlv, LogEventParcelable paramLogEventParcelable, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    this.zzafx = paramLogEventParcelable;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof zzd;
    LogEventParcelable localLogEventParcelable1;
    if (!bool)
    {
      bool = false;
      localLogEventParcelable1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (zzd)paramObject;
      localLogEventParcelable1 = this.zzafx;
      LogEventParcelable localLogEventParcelable2 = ((zzd)paramObject).zzafx;
      bool = localLogEventParcelable1.equals(localLogEventParcelable2);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MethodImpl(");
    LogEventParcelable localLogEventParcelable = this.zzafx;
    return localLogEventParcelable + ")";
  }
  
  protected void zza(zzlw paramzzlw)
  {
    zzlv.zzd.1 local1 = new com/google/android/gms/internal/zzlv$zzd$1;
    local1.<init>(this);
    try
    {
      localObject2 = this.zzafx;
      zzlv.zzb((LogEventParcelable)localObject2);
      localObject2 = this.zzafx;
      paramzzlw.zza(local1, (LogEventParcelable)localObject2);
      return;
    }
    finally
    {
      for (;;)
      {
        Object localObject2 = "ClearcutLoggerApiImpl";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("MessageNanoProducer ");
        String str2 = this.zzafx.zzafl.toString();
        localStringBuilder = localStringBuilder.append(str2);
        str2 = " threw: ";
        localStringBuilder = localStringBuilder.append(str2);
        String str1 = ((Throwable)localObject1).toString();
        str1 = str1;
        Log.e((String)localObject2, str1);
      }
    }
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlv$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */