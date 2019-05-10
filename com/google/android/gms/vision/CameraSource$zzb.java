package com.google.android.gms.vision;

import android.hardware.Camera;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Map;

class CameraSource$zzb
  implements Runnable
{
  private long zzRD;
  private Detector zzbmN;
  private boolean zzbmQ;
  private long zzbmR;
  private int zzbmS;
  private ByteBuffer zzbmT;
  private final Object zzpV;
  
  static
  {
    Class localClass = CameraSource.class;
    boolean bool = localClass.desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      return;
      bool = false;
      localClass = null;
    }
  }
  
  CameraSource$zzb(CameraSource paramCameraSource, Detector paramDetector)
  {
    long l = SystemClock.elapsedRealtime();
    this.zzRD = l;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzbmQ = true;
    this.zzbmS = 0;
    this.zzbmN = paramDetector;
  }
  
  void release()
  {
    boolean bool = $assertionsDisabled;
    if (!bool)
    {
      Object localObject = CameraSource.zzd(this.zzbmP).getState();
      Thread.State localState = Thread.State.TERMINATED;
      if (localObject != localState)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    this.zzbmN.release();
    this.zzbmN = null;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/google/android/gms/vision/CameraSource$zzb:zzpV	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 51	com/google/android/gms/vision/CameraSource$zzb:zzbmQ	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +21 -> 34
    //   16: aload_0
    //   17: getfield 81	com/google/android/gms/vision/CameraSource$zzb:zzbmT	Ljava/nio/ByteBuffer;
    //   20: astore_3
    //   21: aload_3
    //   22: ifnonnull +12 -> 34
    //   25: aload_0
    //   26: getfield 49	com/google/android/gms/vision/CameraSource$zzb:zzpV	Ljava/lang/Object;
    //   29: astore_3
    //   30: aload_3
    //   31: invokevirtual 84	java/lang/Object:wait	()V
    //   34: aload_0
    //   35: getfield 51	com/google/android/gms/vision/CameraSource$zzb:zzbmQ	Z
    //   38: istore_2
    //   39: iload_2
    //   40: ifne +34 -> 74
    //   43: aload_1
    //   44: monitorexit
    //   45: return
    //   46: astore_3
    //   47: ldc 86
    //   49: astore 4
    //   51: ldc 88
    //   53: astore 5
    //   55: aload 4
    //   57: aload 5
    //   59: aload_3
    //   60: invokestatic 94	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   63: pop
    //   64: aload_1
    //   65: monitorexit
    //   66: goto -21 -> 45
    //   69: astore_3
    //   70: aload_1
    //   71: monitorexit
    //   72: aload_3
    //   73: athrow
    //   74: new 96	com/google/android/gms/vision/Frame$Builder
    //   77: astore_3
    //   78: aload_3
    //   79: invokespecial 97	com/google/android/gms/vision/Frame$Builder:<init>	()V
    //   82: aload_0
    //   83: getfield 81	com/google/android/gms/vision/CameraSource$zzb:zzbmT	Ljava/nio/ByteBuffer;
    //   86: astore 4
    //   88: aload_0
    //   89: getfield 35	com/google/android/gms/vision/CameraSource$zzb:zzbmP	Lcom/google/android/gms/vision/CameraSource;
    //   92: astore 5
    //   94: aload 5
    //   96: invokestatic 101	com/google/android/gms/vision/CameraSource:zzg	(Lcom/google/android/gms/vision/CameraSource;)Lcom/google/android/gms/common/images/Size;
    //   99: astore 5
    //   101: aload 5
    //   103: invokevirtual 107	com/google/android/gms/common/images/Size:getWidth	()I
    //   106: istore 6
    //   108: aload_0
    //   109: getfield 35	com/google/android/gms/vision/CameraSource$zzb:zzbmP	Lcom/google/android/gms/vision/CameraSource;
    //   112: astore 7
    //   114: aload 7
    //   116: invokestatic 101	com/google/android/gms/vision/CameraSource:zzg	(Lcom/google/android/gms/vision/CameraSource;)Lcom/google/android/gms/common/images/Size;
    //   119: astore 7
    //   121: aload 7
    //   123: invokevirtual 110	com/google/android/gms/common/images/Size:getHeight	()I
    //   126: istore 8
    //   128: bipush 17
    //   130: istore 9
    //   132: aload_3
    //   133: aload 4
    //   135: iload 6
    //   137: iload 8
    //   139: iload 9
    //   141: invokevirtual 115	com/google/android/gms/vision/Frame$Builder:setImageData	(Ljava/nio/ByteBuffer;III)Lcom/google/android/gms/vision/Frame$Builder;
    //   144: astore_3
    //   145: aload_0
    //   146: getfield 53	com/google/android/gms/vision/CameraSource$zzb:zzbmS	I
    //   149: istore 10
    //   151: aload_3
    //   152: iload 10
    //   154: invokevirtual 119	com/google/android/gms/vision/Frame$Builder:setId	(I)Lcom/google/android/gms/vision/Frame$Builder;
    //   157: astore_3
    //   158: aload_0
    //   159: getfield 121	com/google/android/gms/vision/CameraSource$zzb:zzbmR	J
    //   162: lstore 11
    //   164: aload_3
    //   165: lload 11
    //   167: invokevirtual 125	com/google/android/gms/vision/Frame$Builder:setTimestampMillis	(J)Lcom/google/android/gms/vision/Frame$Builder;
    //   170: astore_3
    //   171: aload_0
    //   172: getfield 35	com/google/android/gms/vision/CameraSource$zzb:zzbmP	Lcom/google/android/gms/vision/CameraSource;
    //   175: astore 4
    //   177: aload 4
    //   179: invokestatic 129	com/google/android/gms/vision/CameraSource:zzf	(Lcom/google/android/gms/vision/CameraSource;)I
    //   182: istore 10
    //   184: aload_3
    //   185: iload 10
    //   187: invokevirtual 132	com/google/android/gms/vision/Frame$Builder:setRotation	(I)Lcom/google/android/gms/vision/Frame$Builder;
    //   190: astore_3
    //   191: aload_3
    //   192: invokevirtual 136	com/google/android/gms/vision/Frame$Builder:build	()Lcom/google/android/gms/vision/Frame;
    //   195: astore_3
    //   196: aload_0
    //   197: getfield 81	com/google/android/gms/vision/CameraSource$zzb:zzbmT	Ljava/nio/ByteBuffer;
    //   200: astore 4
    //   202: iconst_0
    //   203: istore 6
    //   205: aconst_null
    //   206: astore 5
    //   208: aload_0
    //   209: aconst_null
    //   210: putfield 81	com/google/android/gms/vision/CameraSource$zzb:zzbmT	Ljava/nio/ByteBuffer;
    //   213: aload_1
    //   214: monitorexit
    //   215: aload_0
    //   216: getfield 55	com/google/android/gms/vision/CameraSource$zzb:zzbmN	Lcom/google/android/gms/vision/Detector;
    //   219: astore_1
    //   220: aload_1
    //   221: aload_3
    //   222: invokevirtual 140	com/google/android/gms/vision/Detector:receiveFrame	(Lcom/google/android/gms/vision/Frame;)V
    //   225: aload_0
    //   226: getfield 35	com/google/android/gms/vision/CameraSource$zzb:zzbmP	Lcom/google/android/gms/vision/CameraSource;
    //   229: invokestatic 144	com/google/android/gms/vision/CameraSource:zzb	(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;
    //   232: astore_3
    //   233: aload 4
    //   235: invokevirtual 150	java/nio/ByteBuffer:array	()[B
    //   238: astore_1
    //   239: aload_3
    //   240: aload_1
    //   241: invokevirtual 156	android/hardware/Camera:addCallbackBuffer	([B)V
    //   244: goto -244 -> 0
    //   247: astore_3
    //   248: ldc 86
    //   250: astore_1
    //   251: ldc -98
    //   253: astore 5
    //   255: aload_1
    //   256: aload 5
    //   258: aload_3
    //   259: invokestatic 161	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   262: pop
    //   263: aload_0
    //   264: getfield 35	com/google/android/gms/vision/CameraSource$zzb:zzbmP	Lcom/google/android/gms/vision/CameraSource;
    //   267: invokestatic 144	com/google/android/gms/vision/CameraSource:zzb	(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;
    //   270: astore_3
    //   271: aload 4
    //   273: invokevirtual 150	java/nio/ByteBuffer:array	()[B
    //   276: astore_1
    //   277: aload_3
    //   278: aload_1
    //   279: invokevirtual 156	android/hardware/Camera:addCallbackBuffer	([B)V
    //   282: goto -282 -> 0
    //   285: astore_3
    //   286: aload_0
    //   287: getfield 35	com/google/android/gms/vision/CameraSource$zzb:zzbmP	Lcom/google/android/gms/vision/CameraSource;
    //   290: invokestatic 144	com/google/android/gms/vision/CameraSource:zzb	(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;
    //   293: astore_1
    //   294: aload 4
    //   296: invokevirtual 150	java/nio/ByteBuffer:array	()[B
    //   299: astore 4
    //   301: aload_1
    //   302: aload 4
    //   304: invokevirtual 156	android/hardware/Camera:addCallbackBuffer	([B)V
    //   307: aload_3
    //   308: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	this	zzb
    //   4	298	1	localObject1	Object
    //   11	29	2	bool	boolean
    //   20	11	3	localObject2	Object
    //   46	14	3	localInterruptedException	InterruptedException
    //   69	4	3	localObject3	Object
    //   77	163	3	localObject4	Object
    //   247	12	3	localThrowable	Throwable
    //   270	8	3	localCamera	Camera
    //   285	23	3	localObject5	Object
    //   49	254	4	localObject6	Object
    //   53	204	5	localObject7	Object
    //   106	98	6	i	int
    //   112	10	7	localObject8	Object
    //   126	12	8	j	int
    //   130	10	9	k	int
    //   149	37	10	m	int
    //   162	4	11	l	long
    // Exception table:
    //   from	to	target	type
    //   25	29	46	java/lang/InterruptedException
    //   30	34	46	java/lang/InterruptedException
    //   7	11	69	finally
    //   16	20	69	finally
    //   25	29	69	finally
    //   30	34	69	finally
    //   34	38	69	finally
    //   43	45	69	finally
    //   59	64	69	finally
    //   64	66	69	finally
    //   70	72	69	finally
    //   74	77	69	finally
    //   78	82	69	finally
    //   82	86	69	finally
    //   88	92	69	finally
    //   94	99	69	finally
    //   101	106	69	finally
    //   108	112	69	finally
    //   114	119	69	finally
    //   121	126	69	finally
    //   139	144	69	finally
    //   145	149	69	finally
    //   152	157	69	finally
    //   158	162	69	finally
    //   165	170	69	finally
    //   171	175	69	finally
    //   177	182	69	finally
    //   185	190	69	finally
    //   191	195	69	finally
    //   196	200	69	finally
    //   209	213	69	finally
    //   213	215	69	finally
    //   215	219	247	finally
    //   221	225	247	finally
    //   258	263	285	finally
  }
  
  void setActive(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzbmQ = paramBoolean;
      Object localObject2 = this.zzpV;
      localObject2.notifyAll();
      return;
    }
  }
  
  void zza(byte[] paramArrayOfByte, Camera paramCamera)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzbmT;
      if (localObject2 != null)
      {
        localObject2 = this.zzbmT;
        localObject2 = ((ByteBuffer)localObject2).array();
        paramCamera.addCallbackBuffer((byte[])localObject2);
        i = 0;
        localObject2 = null;
        this.zzbmT = null;
      }
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.zzRD;
      l1 -= l2;
      this.zzbmR = l1;
      int i = this.zzbmS + 1;
      this.zzbmS = i;
      localObject2 = this.zzbmP;
      localObject2 = CameraSource.zze((CameraSource)localObject2);
      localObject2 = ((Map)localObject2).get(paramArrayOfByte);
      localObject2 = (ByteBuffer)localObject2;
      this.zzbmT = ((ByteBuffer)localObject2);
      localObject2 = this.zzpV;
      localObject2.notifyAll();
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\CameraSource$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */