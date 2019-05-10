package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class zzah$zza
{
  private int zzTe;
  private ByteArrayOutputStream zzTf;
  
  public zzah$zza(zzah paramzzah)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    this.zzTf = localByteArrayOutputStream;
  }
  
  public byte[] getPayload()
  {
    return this.zzTf.toByteArray();
  }
  
  public boolean zzj(zzab paramzzab)
  {
    Object localObject1 = null;
    int i = 1;
    zzx.zzz(paramzzab);
    int j = this.zzTe + 1;
    Object localObject2 = this.zzTg.zzjn();
    int m = ((zzr)localObject2).zzkD();
    Object localObject3;
    if (j > m)
    {
      j = 0;
      localObject3 = null;
    }
    for (;;)
    {
      return j;
      localObject3 = this.zzTg.zza(paramzzab, false);
      if (localObject3 == null)
      {
        localObject3 = this.zzTg.zzjm();
        localObject1 = "Error formatting hit";
        ((zzaf)localObject3).zza(paramzzab, (String)localObject1);
        j = i;
      }
      else
      {
        localObject2 = ((String)localObject3).getBytes();
        int k = localObject2.length;
        Object localObject4 = this.zzTg.zzjn();
        int n = ((zzr)localObject4).zzkv();
        if (k > n)
        {
          localObject3 = this.zzTg.zzjm();
          localObject1 = "Hit size exceeds the maximum size limit";
          ((zzaf)localObject3).zza(paramzzab, (String)localObject1);
          k = i;
        }
        else
        {
          localObject4 = this.zzTf;
          n = ((ByteArrayOutputStream)localObject4).size();
          if (n > 0) {
            k += 1;
          }
          n = this.zzTf.size();
          k += n;
          localObject4 = this.zzTg.zzjn();
          n = ((zzr)localObject4).zzkx();
          if (k > n)
          {
            k = 0;
            localObject3 = null;
          }
          else
          {
            try
            {
              localObject3 = this.zzTf;
              k = ((ByteArrayOutputStream)localObject3).size();
              if (k > 0)
              {
                localObject3 = this.zzTf;
                localObject1 = zzah.zzlD();
                ((ByteArrayOutputStream)localObject3).write((byte[])localObject1);
              }
              localObject3 = this.zzTf;
              ((ByteArrayOutputStream)localObject3).write((byte[])localObject2);
              k = this.zzTe + 1;
              this.zzTe = k;
              k = i;
            }
            catch (IOException localIOException)
            {
              localObject1 = this.zzTg;
              localObject2 = "Failed to write payload when batching hits";
              ((zzah)localObject1).zze((String)localObject2, localIOException);
              k = i;
            }
          }
        }
      }
    }
  }
  
  public int zzlE()
  {
    return this.zzTe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzah$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */