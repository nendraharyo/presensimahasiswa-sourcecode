package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class zznk
  implements ThreadFactory
{
  private final int mPriority;
  private final String zzaoq;
  private final AtomicInteger zzaor;
  private final ThreadFactory zzaos;
  
  public zznk(String paramString)
  {
    this(paramString, 0);
  }
  
  public zznk(String paramString, int paramInt)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>();
    this.zzaor = ((AtomicInteger)localObject);
    localObject = Executors.defaultThreadFactory();
    this.zzaos = ((ThreadFactory)localObject);
    localObject = (String)zzx.zzb(paramString, "Name must not be null");
    this.zzaoq = ((String)localObject);
    this.mPriority = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Object localObject1 = this.zzaos;
    Object localObject2 = new com/google/android/gms/internal/zznl;
    int i = this.mPriority;
    ((zznl)localObject2).<init>(paramRunnable, i);
    localObject1 = ((ThreadFactory)localObject1).newThread((Runnable)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = this.zzaoq;
    localObject2 = ((StringBuilder)localObject2).append(str).append("[");
    i = this.zzaor.getAndIncrement();
    localObject2 = i + "]";
    ((Thread)localObject1).setName((String)localObject2);
    return (Thread)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */