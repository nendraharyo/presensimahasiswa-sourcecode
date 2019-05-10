package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;

public class zzix
{
  private Handler mHandler = null;
  private HandlerThread zzMG = null;
  private int zzMH = 0;
  private final Object zzpV;
  
  public zzix()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
  }
  
  public Looper zzhC()
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        int i = this.zzMH;
        if (i == 0)
        {
          Object localObject2 = this.zzMG;
          if (localObject2 == null)
          {
            localObject2 = "Starting the looper thread.";
            zzin.v((String)localObject2);
            localObject2 = new android/os/HandlerThread;
            localObject4 = "LooperProvider";
            ((HandlerThread)localObject2).<init>((String)localObject4);
            this.zzMG = ((HandlerThread)localObject2);
            localObject2 = this.zzMG;
            ((HandlerThread)localObject2).start();
            localObject2 = new android/os/Handler;
            localObject4 = this.zzMG;
            localObject4 = ((HandlerThread)localObject4).getLooper();
            ((Handler)localObject2).<init>((Looper)localObject4);
            this.mHandler = ((Handler)localObject2);
            localObject2 = "Looper thread started.";
            zzin.v((String)localObject2);
            i = this.zzMH + 1;
            this.zzMH = i;
            localObject2 = this.zzMG;
            localObject2 = ((HandlerThread)localObject2).getLooper();
            return (Looper)localObject2;
          }
          localObject2 = "Resuming the looper thread";
          zzin.v((String)localObject2);
          localObject2 = this.zzpV;
          localObject2.notifyAll();
        }
      }
      HandlerThread localHandlerThread = this.zzMG;
      Object localObject4 = "Invalid state: mHandlerThread should already been initialized.";
      zzx.zzb(localHandlerThread, localObject4);
    }
  }
  
  public void zzhD()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzMH;
      if (i > 0)
      {
        i = 1;
        Object localObject2 = "Invalid state: release() called more times than expected.";
        zzx.zzb(i, localObject2);
        j = this.zzMH + -1;
        this.zzMH = j;
        if (j == 0)
        {
          localHandler = this.mHandler;
          localObject2 = new com/google/android/gms/internal/zzix$1;
          ((zzix.1)localObject2).<init>(this);
          localHandler.post((Runnable)localObject2);
        }
        return;
      }
      int j = 0;
      Handler localHandler = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzix.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */