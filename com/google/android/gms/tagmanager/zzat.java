package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class zzat
  extends Thread
  implements zzas
{
  private static zzat zzbjb;
  private volatile boolean mClosed;
  private final Context mContext;
  private volatile boolean zzRE;
  private final LinkedBlockingQueue zzbja;
  private volatile zzau zzbjc;
  
  private zzat(Context paramContext)
  {
    super("GAThread");
    Object localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    this.zzbja = ((LinkedBlockingQueue)localObject);
    this.zzRE = false;
    this.mClosed = false;
    if (paramContext != null) {
      localObject = paramContext.getApplicationContext();
    }
    for (this.mContext = ((Context)localObject);; this.mContext = paramContext)
    {
      start();
      return;
    }
  }
  
  static zzat zzaZ(Context paramContext)
  {
    zzat localzzat = zzbjb;
    if (localzzat == null)
    {
      localzzat = new com/google/android/gms/tagmanager/zzat;
      localzzat.<init>(paramContext);
      zzbjb = localzzat;
    }
    return zzbjb;
  }
  
  private String zzd(Throwable paramThrowable)
  {
    Object localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    Object localObject2 = new java/io/PrintStream;
    ((PrintStream)localObject2).<init>((OutputStream)localObject1);
    paramThrowable.printStackTrace((PrintStream)localObject2);
    ((PrintStream)localObject2).flush();
    localObject2 = new java/lang/String;
    localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
    ((String)localObject2).<init>((byte[])localObject1);
    return (String)localObject2;
  }
  
  public void run()
  {
    for (;;)
    {
      boolean bool1 = this.mClosed;
      if (bool1) {
        break;
      }
      try
      {
        Object localObject = this.zzbja;
        localObject = ((LinkedBlockingQueue)localObject).take();
        localObject = (Runnable)localObject;
        boolean bool2 = this.zzRE;
        if (!bool2) {
          ((Runnable)localObject).run();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        String str1 = localInterruptedException.toString();
        zzbg.zzaJ(str1);
      }
      finally
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str3 = "Error on Google TagManager Thread: ";
        localStringBuilder = localStringBuilder.append(str3);
        String str2 = zzd(localThrowable);
        zzbg.e(str2);
        str2 = "Google TagManager is shutting down.";
        zzbg.e(str2);
        bool1 = true;
        this.zzRE = bool1;
      }
    }
  }
  
  public void zzgg(String paramString)
  {
    long l = System.currentTimeMillis();
    zzk(paramString, l);
  }
  
  public void zzj(Runnable paramRunnable)
  {
    this.zzbja.add(paramRunnable);
  }
  
  void zzk(String paramString, long paramLong)
  {
    zzat.1 local1 = new com/google/android/gms/tagmanager/zzat$1;
    local1.<init>(this, this, paramLong, paramString);
    zzj(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */