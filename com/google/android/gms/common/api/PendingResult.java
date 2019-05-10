package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

public abstract class PendingResult
{
  public abstract Result await();
  
  public abstract Result await(long paramLong, TimeUnit paramTimeUnit);
  
  public abstract void cancel();
  
  public abstract boolean isCanceled();
  
  public abstract void setResultCallback(ResultCallback paramResultCallback);
  
  public abstract void setResultCallback(ResultCallback paramResultCallback, long paramLong, TimeUnit paramTimeUnit);
  
  public TransformedResult then(ResultTransform paramResultTransform)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void zza(PendingResult.zza paramzza)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public Integer zzpa()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\PendingResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */