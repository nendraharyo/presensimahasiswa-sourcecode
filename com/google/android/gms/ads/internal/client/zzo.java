package com.google.android.gms.ads.internal.client;

import java.util.Random;

public class zzo
  extends zzx.zza
{
  private Object zzpV;
  private final Random zzuy;
  private long zzuz;
  
  public zzo()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new java/util/Random;
    ((Random)localObject).<init>();
    this.zzuy = ((Random)localObject);
    zzcY();
  }
  
  public long getValue()
  {
    return this.zzuz;
  }
  
  public void zzcY()
  {
    long l1 = 0L;
    Object localObject1 = this.zzpV;
    int i = 3;
    int j = i;
    long l2 = l1;
    for (;;)
    {
      j += -1;
      if (j > 0) {}
      try
      {
        Random localRandom = this.zzuy;
        i = localRandom.nextInt();
        l2 = i;
        long l3 = 2147483648L;
        l2 += l3;
        l3 = this.zzuz;
        boolean bool = l2 < l3;
        if (!bool) {
          continue;
        }
        bool = l2 < l1;
        if (!bool) {
          continue;
        }
        this.zzuz = l2;
        return;
      }
      finally {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */