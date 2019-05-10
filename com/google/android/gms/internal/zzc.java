package com.google.android.gms.internal;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class zzc
  extends Thread
{
  private static final boolean DEBUG = zzs.DEBUG;
  private final BlockingQueue zzh;
  private final BlockingQueue zzi;
  private final zzb zzj;
  private final zzn zzk;
  private volatile boolean zzl = false;
  
  public zzc(BlockingQueue paramBlockingQueue1, BlockingQueue paramBlockingQueue2, zzb paramzzb, zzn paramzzn)
  {
    this.zzh = paramBlockingQueue1;
    this.zzi = paramBlockingQueue2;
    this.zzj = paramzzb;
    this.zzk = paramzzn;
  }
  
  public void quit()
  {
    this.zzl = true;
    interrupt();
  }
  
  public void run()
  {
    boolean bool1 = DEBUG;
    boolean bool3;
    Object localObject2;
    if (bool1)
    {
      localObject1 = "start new dispatcher";
      bool3 = false;
      localObject2 = new Object[0];
      zzs.zza((String)localObject1, (Object[])localObject2);
    }
    int i = 10;
    Process.setThreadPriority(i);
    Object localObject1 = this.zzj;
    ((zzb)localObject1).zza();
    for (;;)
    {
      try
      {
        localObject1 = this.zzh;
        localObject1 = ((BlockingQueue)localObject1).take();
        localObject1 = (zzk)localObject1;
        localObject2 = "cache-queue-take";
        ((zzk)localObject1).zzc((String)localObject2);
        bool3 = ((zzk)localObject1).isCanceled();
        if (!bool3) {
          break label103;
        }
        localObject2 = "cache-discard-canceled";
        ((zzk)localObject1).zzd((String)localObject2);
        continue;
        boolean bool2;
        if (!bool2) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        bool2 = this.zzl;
      }
      return;
      label103:
      localObject2 = this.zzj;
      Object localObject3 = localInterruptedException.zzh();
      localObject2 = ((zzb)localObject2).zza((String)localObject3);
      if (localObject2 == null)
      {
        localObject2 = "cache-miss";
        localInterruptedException.zzc((String)localObject2);
        localObject2 = this.zzi;
        ((BlockingQueue)localObject2).put(localInterruptedException);
      }
      else
      {
        boolean bool4 = ((zzb.zza)localObject2).zzb();
        if (bool4)
        {
          localObject3 = "cache-hit-expired";
          localInterruptedException.zzc((String)localObject3);
          localInterruptedException.zza((zzb.zza)localObject2);
          localObject2 = this.zzi;
          ((BlockingQueue)localObject2).put(localInterruptedException);
        }
        else
        {
          localObject3 = "cache-hit";
          localInterruptedException.zzc((String)localObject3);
          localObject3 = new com/google/android/gms/internal/zzi;
          Object localObject4 = ((zzb.zza)localObject2).data;
          Map localMap = ((zzb.zza)localObject2).zzg;
          ((zzi)localObject3).<init>((byte[])localObject4, localMap);
          localObject3 = localInterruptedException.zza((zzi)localObject3);
          localObject4 = "cache-hit-parsed";
          localInterruptedException.zzc((String)localObject4);
          boolean bool5 = ((zzb.zza)localObject2).zzc();
          if (!bool5)
          {
            localObject2 = this.zzk;
            ((zzn)localObject2).zza(localInterruptedException, (zzm)localObject3);
          }
          else
          {
            localObject4 = "cache-hit-refresh-needed";
            localInterruptedException.zzc((String)localObject4);
            localInterruptedException.zza((zzb.zza)localObject2);
            bool3 = true;
            ((zzm)localObject3).zzai = bool3;
            localObject2 = this.zzk;
            localObject4 = new com/google/android/gms/internal/zzc$1;
            ((zzc.1)localObject4).<init>(this, localInterruptedException);
            ((zzn)localObject2).zza(localInterruptedException, (zzm)localObject3, (Runnable)localObject4);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */