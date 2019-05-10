package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class zzcu
  extends zzct
{
  private static final Object zzbkP;
  private static zzcu zzbla;
  private boolean connected;
  private Handler handler;
  private Context zzbkQ;
  private zzau zzbkR;
  private volatile zzas zzbkS;
  private int zzbkT = 1800000;
  private boolean zzbkU;
  private boolean zzbkV;
  private boolean zzbkW;
  private zzav zzbkX;
  private zzbl zzbkY;
  private boolean zzbkZ;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzbkP = localObject;
  }
  
  private zzcu()
  {
    this.zzbkU = bool;
    this.zzbkV = false;
    this.connected = bool;
    this.zzbkW = bool;
    zzcu.1 local1 = new com/google/android/gms/tagmanager/zzcu$1;
    local1.<init>(this);
    this.zzbkX = local1;
    this.zzbkZ = false;
  }
  
  public static zzcu zzHo()
  {
    zzcu localzzcu = zzbla;
    if (localzzcu == null)
    {
      localzzcu = new com/google/android/gms/tagmanager/zzcu;
      localzzcu.<init>();
      zzbla = localzzcu;
    }
    return zzbla;
  }
  
  private void zzHp()
  {
    zzbl localzzbl = new com/google/android/gms/tagmanager/zzbl;
    localzzbl.<init>(this);
    this.zzbkY = localzzbl;
    localzzbl = this.zzbkY;
    Context localContext = this.zzbkQ;
    localzzbl.zzba(localContext);
  }
  
  private void zzHq()
  {
    Handler localHandler = new android/os/Handler;
    Object localObject1 = this.zzbkQ.getMainLooper();
    zzcu.2 local2 = new com/google/android/gms/tagmanager/zzcu$2;
    local2.<init>(this);
    localHandler.<init>((Looper)localObject1, local2);
    this.handler = localHandler;
    int i = this.zzbkT;
    if (i > 0)
    {
      localHandler = this.handler;
      localObject1 = this.handler;
      Object localObject2 = zzbkP;
      localObject1 = ((Handler)localObject1).obtainMessage(1, localObject2);
      int j = this.zzbkT;
      long l = j;
      localHandler.sendMessageDelayed((Message)localObject1, l);
    }
  }
  
  /* Error */
  public void dispatch()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 46	com/google/android/gms/tagmanager/zzcu:zzbkV	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +20 -> 28
    //   11: ldc 103
    //   13: astore_2
    //   14: aload_2
    //   15: invokestatic 109	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   18: iconst_1
    //   19: istore_1
    //   20: aload_0
    //   21: iload_1
    //   22: putfield 44	com/google/android/gms/tagmanager/zzcu:zzbkU	Z
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload_0
    //   29: getfield 111	com/google/android/gms/tagmanager/zzcu:zzbkS	Lcom/google/android/gms/tagmanager/zzas;
    //   32: astore_2
    //   33: new 113	com/google/android/gms/tagmanager/zzcu$3
    //   36: astore_3
    //   37: aload_3
    //   38: aload_0
    //   39: invokespecial 114	com/google/android/gms/tagmanager/zzcu$3:<init>	(Lcom/google/android/gms/tagmanager/zzcu;)V
    //   42: aload_2
    //   43: aload_3
    //   44: invokeinterface 120 2 0
    //   49: goto -24 -> 25
    //   52: astore_2
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	zzcu
    //   6	16	1	bool	boolean
    //   13	30	2	localObject1	Object
    //   52	4	2	localObject2	Object
    //   36	8	3	local3	zzcu.3
    // Exception table:
    //   from	to	target	type
    //   2	6	52	finally
    //   14	18	52	finally
    //   21	25	52	finally
    //   28	32	52	finally
    //   33	36	52	finally
    //   38	42	52	finally
    //   43	49	52	finally
  }
  
  zzau zzHr()
  {
    try
    {
      Object localObject1 = this.zzbkR;
      if (localObject1 != null) {
        break label64;
      }
      localObject1 = this.zzbkQ;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject4 = "Cant get a store unless we have a context";
        ((IllegalStateException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = new com/google/android/gms/tagmanager/zzby;
    Object localObject4 = this.zzbkX;
    Context localContext = this.zzbkQ;
    ((zzby)localObject3).<init>((zzav)localObject4, localContext);
    this.zzbkR = ((zzau)localObject3);
    label64:
    localObject3 = this.handler;
    if (localObject3 == null) {
      zzHq();
    }
    boolean bool = true;
    this.zzbkV = bool;
    bool = this.zzbkU;
    if (bool)
    {
      dispatch();
      bool = false;
      localObject3 = null;
      this.zzbkU = false;
    }
    localObject3 = this.zzbkY;
    if (localObject3 == null)
    {
      bool = this.zzbkW;
      if (bool) {
        zzHp();
      }
    }
    localObject3 = this.zzbkR;
    return (zzau)localObject3;
  }
  
  /* Error */
  void zza(Context paramContext, zzas paramzzas)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 71	com/google/android/gms/tagmanager/zzcu:zzbkQ	Landroid/content/Context;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_1
    //   15: invokevirtual 144	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   18: astore_3
    //   19: aload_0
    //   20: aload_3
    //   21: putfield 71	com/google/android/gms/tagmanager/zzcu:zzbkQ	Landroid/content/Context;
    //   24: aload_0
    //   25: getfield 111	com/google/android/gms/tagmanager/zzcu:zzbkS	Lcom/google/android/gms/tagmanager/zzas;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnonnull -19 -> 11
    //   33: aload_0
    //   34: aload_2
    //   35: putfield 111	com/google/android/gms/tagmanager/zzcu:zzbkS	Lcom/google/android/gms/tagmanager/zzas;
    //   38: goto -27 -> 11
    //   41: astore_3
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_3
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	zzcu
    //   0	46	1	paramContext	Context
    //   0	46	2	paramzzas	zzas
    //   6	24	3	localObject1	Object
    //   41	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	41	finally
    //   14	18	41	finally
    //   20	24	41	finally
    //   24	28	41	finally
    //   34	38	41	finally
  }
  
  public void zzay(boolean paramBoolean)
  {
    try
    {
      boolean bool = this.zzbkZ;
      zzd(bool, paramBoolean);
      return;
    }
    finally {}
  }
  
  void zzd(boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.zzbkZ;
        if (bool == paramBoolean1)
        {
          bool = this.connected;
          if (bool == paramBoolean2) {
            return;
          }
        }
        int i;
        if ((paramBoolean1) || (!paramBoolean2))
        {
          i = this.zzbkT;
          if (i > 0)
          {
            localObject1 = this.handler;
            int j = 1;
            Object localObject3 = zzbkP;
            ((Handler)localObject1).removeMessages(j, localObject3);
          }
        }
        if ((!paramBoolean1) && (paramBoolean2))
        {
          i = this.zzbkT;
          if (i > 0)
          {
            localObject1 = this.handler;
            localObject4 = this.handler;
            int k = 1;
            Object localObject5 = zzbkP;
            localObject4 = ((Handler)localObject4).obtainMessage(k, localObject5);
            k = this.zzbkT;
            long l = k;
            ((Handler)localObject1).sendMessageDelayed((Message)localObject4, l);
          }
        }
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject4 = "PowerSaveMode ";
        localObject4 = ((StringBuilder)localObject1).append((String)localObject4);
        if ((paramBoolean1) || (!paramBoolean2))
        {
          localObject1 = "initiated.";
          localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
          localObject1 = ((StringBuilder)localObject1).toString();
          zzbg.v((String)localObject1);
          this.zzbkZ = paramBoolean1;
          this.connected = paramBoolean2;
        }
        else
        {
          String str = "terminated.";
        }
      }
      finally {}
    }
  }
  
  public void zzjg()
  {
    try
    {
      boolean bool = this.zzbkZ;
      if (!bool)
      {
        bool = this.connected;
        if (bool)
        {
          int i = this.zzbkT;
          if (i > 0)
          {
            Handler localHandler = this.handler;
            int j = 1;
            Object localObject2 = zzbkP;
            localHandler.removeMessages(j, localObject2);
            localHandler = this.handler;
            Object localObject3 = this.handler;
            int k = 1;
            Object localObject4 = zzbkP;
            localObject3 = ((Handler)localObject3).obtainMessage(k, localObject4);
            localHandler.sendMessage((Message)localObject3);
          }
        }
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */