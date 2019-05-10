package com.google.android.gms.tagmanager;

import android.os.Looper;
import com.google.android.gms.common.api.Status;

class zzo
  implements ContainerHolder
{
  private Status zzUX;
  private final Looper zzagr;
  private boolean zzapK;
  private Container zzbhU;
  private Container zzbhV;
  private zzo.zzb zzbhW;
  private zzo.zza zzbhX;
  private TagManager zzbhY;
  
  public zzo(Status paramStatus)
  {
    this.zzUX = paramStatus;
    this.zzagr = null;
  }
  
  public zzo(TagManager paramTagManager, Looper paramLooper, Container paramContainer, zzo.zza paramzza)
  {
    this.zzbhY = paramTagManager;
    if (paramLooper != null) {}
    for (;;)
    {
      this.zzagr = paramLooper;
      this.zzbhU = paramContainer;
      this.zzbhX = paramzza;
      Status localStatus = Status.zzagC;
      this.zzUX = localStatus;
      paramTagManager.zza(this);
      return;
      paramLooper = Looper.getMainLooper();
    }
  }
  
  private void zzGe()
  {
    zzo.zzb localzzb = this.zzbhW;
    if (localzzb != null)
    {
      localzzb = this.zzbhW;
      String str = this.zzbhV.zzGb();
      localzzb.zzfU(str);
    }
  }
  
  /* Error */
  public Container getContainer()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 70	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   8: istore_2
    //   9: iload_2
    //   10: ifeq +14 -> 24
    //   13: ldc 72
    //   15: astore_3
    //   16: aload_3
    //   17: invokestatic 77	com/google/android/gms/tagmanager/zzbg:e	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: areturn
    //   24: aload_0
    //   25: getfield 56	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   28: astore_1
    //   29: aload_1
    //   30: ifnull +20 -> 50
    //   33: aload_0
    //   34: getfield 56	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   37: astore_1
    //   38: aload_0
    //   39: aload_1
    //   40: putfield 33	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   43: aconst_null
    //   44: astore_1
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield 56	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   50: aload_0
    //   51: getfield 33	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   54: astore_1
    //   55: goto -35 -> 20
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	zzo
    //   1	54	1	localContainer	Container
    //   58	4	1	localObject	Object
    //   8	2	2	bool	boolean
    //   15	2	3	str	String
    // Exception table:
    //   from	to	target	type
    //   4	8	58	finally
    //   16	20	58	finally
    //   24	28	58	finally
    //   33	37	58	finally
    //   39	43	58	finally
    //   46	50	58	finally
    //   50	54	58	finally
  }
  
  String getContainerId()
  {
    boolean bool = this.zzapK;
    if (bool) {
      zzbg.e("getContainerId called on a released ContainerHolder.");
    }
    for (String str = "";; str = this.zzbhU.getContainerId()) {
      return str;
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  /* Error */
  public void refresh()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 70	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +13 -> 21
    //   11: ldc 86
    //   13: astore_2
    //   14: aload_2
    //   15: invokestatic 77	com/google/android/gms/tagmanager/zzbg:e	(Ljava/lang/String;)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: getfield 35	com/google/android/gms/tagmanager/zzo:zzbhX	Lcom/google/android/gms/tagmanager/zzo$zza;
    //   25: astore_2
    //   26: aload_2
    //   27: invokeinterface 91 1 0
    //   32: goto -14 -> 18
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	zzo
    //   6	2	1	bool	boolean
    //   13	14	2	localObject1	Object
    //   35	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	35	finally
    //   14	18	35	finally
    //   21	25	35	finally
    //   26	32	35	finally
  }
  
  /* Error */
  public void release()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 70	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +13 -> 21
    //   11: ldc 93
    //   13: astore_2
    //   14: aload_2
    //   15: invokestatic 77	com/google/android/gms/tagmanager/zzbg:e	(Ljava/lang/String;)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: iconst_1
    //   22: istore_1
    //   23: aload_0
    //   24: iload_1
    //   25: putfield 70	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   28: aload_0
    //   29: getfield 31	com/google/android/gms/tagmanager/zzo:zzbhY	Lcom/google/android/gms/tagmanager/TagManager;
    //   32: astore_2
    //   33: aload_2
    //   34: aload_0
    //   35: invokevirtual 98	com/google/android/gms/tagmanager/TagManager:zzb	(Lcom/google/android/gms/tagmanager/zzo;)Z
    //   38: pop
    //   39: aload_0
    //   40: getfield 33	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   43: astore_2
    //   44: aload_2
    //   45: invokevirtual 101	com/google/android/gms/tagmanager/Container:release	()V
    //   48: iconst_0
    //   49: istore_1
    //   50: aconst_null
    //   51: astore_2
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 33	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   57: iconst_0
    //   58: istore_1
    //   59: aconst_null
    //   60: astore_2
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 56	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   66: iconst_0
    //   67: istore_1
    //   68: aconst_null
    //   69: astore_2
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 35	com/google/android/gms/tagmanager/zzo:zzbhX	Lcom/google/android/gms/tagmanager/zzo$zza;
    //   75: iconst_0
    //   76: istore_1
    //   77: aconst_null
    //   78: astore_2
    //   79: aload_0
    //   80: aconst_null
    //   81: putfield 54	com/google/android/gms/tagmanager/zzo:zzbhW	Lcom/google/android/gms/tagmanager/zzo$zzb;
    //   84: goto -66 -> 18
    //   87: astore_2
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	zzo
    //   6	71	1	bool	boolean
    //   13	66	2	localObject1	Object
    //   87	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	87	finally
    //   14	18	87	finally
    //   24	28	87	finally
    //   28	32	87	finally
    //   34	39	87	finally
    //   39	43	87	finally
    //   44	48	87	finally
    //   53	57	87	finally
    //   62	66	87	finally
    //   71	75	87	finally
    //   80	84	87	finally
  }
  
  public void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener paramContainerAvailableListener)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.zzapK;
        String str;
        if (bool)
        {
          str = "ContainerHolder is released.";
          zzbg.e(str);
          return;
        }
        if (paramContainerAvailableListener == null)
        {
          bool = false;
          str = null;
          this.zzbhW = null;
          continue;
        }
        localObject2 = new com/google/android/gms/tagmanager/zzo$zzb;
      }
      finally {}
      Looper localLooper = this.zzagr;
      ((zzo.zzb)localObject2).<init>(this, paramContainerAvailableListener, localLooper);
      this.zzbhW = ((zzo.zzb)localObject2);
      Object localObject2 = this.zzbhV;
      if (localObject2 != null) {
        zzGe();
      }
    }
  }
  
  String zzGd()
  {
    boolean bool = this.zzapK;
    if (bool) {
      zzbg.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
    }
    for (String str = "";; str = this.zzbhX.zzGd()) {
      return str;
    }
  }
  
  public void zza(Container paramContainer)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.zzapK;
        if (bool) {
          return;
        }
        if (paramContainer == null)
        {
          String str = "Unexpected null container.";
          zzbg.e(str);
          continue;
        }
        this.zzbhV = paramContainer;
      }
      finally {}
      zzGe();
    }
  }
  
  /* Error */
  public void zzfR(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 70	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 33	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   18: astore_3
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual 117	com/google/android/gms/tagmanager/Container:zzfR	(Ljava/lang/String;)V
    //   24: goto -13 -> 11
    //   27: astore_3
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_3
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	zzo
    //   0	32	1	paramString	String
    //   6	2	2	bool	boolean
    //   18	2	3	localContainer	Container
    //   27	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	27	finally
    //   14	18	27	finally
    //   20	24	27	finally
  }
  
  void zzfT(String paramString)
  {
    boolean bool = this.zzapK;
    Object localObject;
    if (bool)
    {
      localObject = "setCtfeUrlPathAndQuery called on a released ContainerHolder.";
      zzbg.e((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.zzbhX;
      ((zzo.zza)localObject).zzfT(paramString);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */