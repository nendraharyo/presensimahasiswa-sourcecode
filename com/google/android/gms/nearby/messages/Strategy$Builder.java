package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;

public class Strategy$Builder
{
  private int zzbbR = 3;
  private int zzbbS = 300;
  private int zzbbT = 0;
  private int zzbbU = -1;
  
  public Strategy build()
  {
    int i = 2;
    int j = this.zzbbU;
    if (j == i)
    {
      j = this.zzbbT;
      k = 1;
      if (j == k)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Cannot set EARSHOT with BLE only mode.");
        throw ((Throwable)localObject);
      }
    }
    Object localObject = new com/google/android/gms/nearby/messages/Strategy;
    int k = this.zzbbS;
    int m = this.zzbbT;
    int n = this.zzbbU;
    int i1 = this.zzbbR;
    ((Strategy)localObject).<init>(i, 0, k, m, false, n, i1);
    return (Strategy)localObject;
  }
  
  public Builder setDiscoveryMode(int paramInt)
  {
    this.zzbbR = paramInt;
    return this;
  }
  
  public Builder setDistanceType(int paramInt)
  {
    this.zzbbT = paramInt;
    return this;
  }
  
  public Builder setTtlSeconds(int paramInt)
  {
    int i = 86400;
    int j = 1;
    Integer localInteger1 = null;
    int k = -1 >>> 1;
    if ((paramInt == k) || ((paramInt > 0) && (paramInt <= i))) {}
    for (k = j;; k = 0)
    {
      Object[] arrayOfObject = new Object[2];
      Integer localInteger2 = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger2;
      localInteger1 = Integer.valueOf(i);
      arrayOfObject[j] = localInteger1;
      zzx.zzb(k, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", arrayOfObject);
      this.zzbbS = paramInt;
      return this;
    }
  }
  
  public Builder zzjg(int paramInt)
  {
    this.zzbbU = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\Strategy$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */