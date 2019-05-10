package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.zzg;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.zza;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public final class FaceDetector
  extends Detector
{
  public static final int ACCURATE_MODE = 1;
  public static final int ALL_CLASSIFICATIONS = 1;
  public static final int ALL_LANDMARKS = 1;
  public static final int FAST_MODE;
  public static final int NO_CLASSIFICATIONS;
  public static final int NO_LANDMARKS;
  private final zza zzbnG;
  private final zzg zzbnH;
  private boolean zzbnI;
  private final Object zzpV;
  
  private FaceDetector()
  {
    Object localObject = new com/google/android/gms/vision/zza;
    ((zza)localObject).<init>();
    this.zzbnG = ((zza)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzbnI = true;
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Default constructor called");
    throw ((Throwable)localObject);
  }
  
  private FaceDetector(zzg paramzzg)
  {
    Object localObject = new com/google/android/gms/vision/zza;
    ((zza)localObject).<init>();
    this.zzbnG = ((zza)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzbnI = true;
    this.zzbnH = paramzzg;
  }
  
  public SparseArray detect(Frame paramFrame)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramFrame == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("No frame supplied.");
      throw ((Throwable)localObject1);
    }
    Object localObject3 = paramFrame.getGrayscaleImageData();
    synchronized (this.zzpV)
    {
      boolean bool1 = this.zzbnI;
      if (!bool1)
      {
        localObject1 = new java/lang/RuntimeException;
        localObject3 = "Cannot use detector after release()";
        ((RuntimeException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject5 = this.zzbnH;
    Object localObject6 = FrameMetadataParcel.zzc(paramFrame);
    localObject5 = ((zzg)localObject5).zzb((ByteBuffer)localObject3, (FrameMetadataParcel)localObject6);
    localObject6 = new java/util/HashSet;
    ((HashSet)localObject6).<init>();
    SparseArray localSparseArray = new android/util/SparseArray;
    int j = localObject5.length;
    localSparseArray.<init>(j);
    int k = localObject5.length;
    int m = 0;
    ??? = null;
    j = 0;
    localObject3 = null;
    while (m < k)
    {
      Object localObject7 = localObject5[m];
      i = ((Face)localObject7).getId();
      j = Math.max(j, i);
      Object localObject8 = Integer.valueOf(i);
      boolean bool2 = ((Set)localObject6).contains(localObject8);
      if (bool2)
      {
        i = j + 1;
        j = i;
      }
      localObject8 = Integer.valueOf(i);
      ((Set)localObject6).add(localObject8);
      localObject8 = this.zzbnG;
      i = ((zza)localObject8).zzkr(i);
      localSparseArray.append(i, localObject7);
      i = m + 1;
      m = i;
    }
    return localSparseArray;
  }
  
  /* Error */
  protected void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/google/android/gms/vision/face/FaceDetector:zzpV	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 38	com/google/android/gms/vision/face/FaceDetector:zzbnI	Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +21 -> 34
    //   16: ldc 123
    //   18: astore_3
    //   19: ldc 125
    //   21: astore 4
    //   23: aload_3
    //   24: aload 4
    //   26: invokestatic 131	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   29: pop
    //   30: aload_0
    //   31: invokevirtual 134	com/google/android/gms/vision/face/FaceDetector:release	()V
    //   34: aload_1
    //   35: monitorexit
    //   36: aload_0
    //   37: invokespecial 137	java/lang/Object:finalize	()V
    //   40: return
    //   41: astore_3
    //   42: aload_1
    //   43: monitorexit
    //   44: aload_3
    //   45: athrow
    //   46: astore_3
    //   47: aload_0
    //   48: invokespecial 137	java/lang/Object:finalize	()V
    //   51: aload_3
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	FaceDetector
    //   11	2	2	bool	boolean
    //   18	6	3	str1	String
    //   41	4	3	localObject2	Object
    //   46	6	3	localObject3	Object
    //   21	4	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   7	11	41	finally
    //   24	30	41	finally
    //   30	34	41	finally
    //   34	36	41	finally
    //   42	44	41	finally
    //   0	4	46	finally
    //   5	7	46	finally
    //   44	46	46	finally
  }
  
  public boolean isOperational()
  {
    return this.zzbnH.isOperational();
  }
  
  public void release()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzbnI;
      if (!bool) {
        return;
      }
      zzg localzzg = this.zzbnH;
      localzzg.zzIh();
      bool = false;
      localzzg = null;
      this.zzbnI = false;
    }
  }
  
  public boolean setFocus(int paramInt)
  {
    Object localObject1 = this.zzbnG;
    int i = ((zza)localObject1).zzks(paramInt);
    synchronized (this.zzpV)
    {
      boolean bool2 = this.zzbnI;
      if (!bool2)
      {
        localObject1 = new java/lang/RuntimeException;
        localObject4 = "Cannot use detector after release()";
        ((RuntimeException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject4 = this.zzbnH;
    boolean bool1 = ((zzg)localObject4).zzkJ(i);
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\FaceDetector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */