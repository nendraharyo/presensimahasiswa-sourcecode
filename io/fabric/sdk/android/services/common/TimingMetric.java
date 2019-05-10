package io.fabric.sdk.android.services.common;

import android.util.Log;

public class TimingMetric
{
  private final boolean disabled;
  private long duration;
  private final String eventName;
  private long start;
  private final String tag;
  
  public TimingMetric(String paramString1, String paramString2)
  {
    this.eventName = paramString1;
    this.tag = paramString2;
    boolean bool = Log.isLoggable(paramString2, 2);
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      this.disabled = bool;
      return;
    }
  }
  
  private void reportToLog()
  {
    String str1 = this.tag;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = this.eventName;
    localObject = ((StringBuilder)localObject).append(str2).append(": ");
    long l = this.duration;
    localObject = l + "ms";
    Log.v(str1, (String)localObject);
  }
  
  public long getDuration()
  {
    return this.duration;
  }
  
  /* Error */
  public void startMeasuring()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 30	io/fabric/sdk/android/services/common/TimingMetric:disabled	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: invokestatic 60	android/os/SystemClock:elapsedRealtime	()J
    //   17: lstore_2
    //   18: aload_0
    //   19: lload_2
    //   20: putfield 62	io/fabric/sdk/android/services/common/TimingMetric:start	J
    //   23: lconst_0
    //   24: lstore_2
    //   25: aload_0
    //   26: lload_2
    //   27: putfield 41	io/fabric/sdk/android/services/common/TimingMetric:duration	J
    //   30: goto -19 -> 11
    //   33: astore 4
    //   35: aload_0
    //   36: monitorexit
    //   37: aload 4
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	TimingMetric
    //   6	2	1	bool	boolean
    //   17	10	2	l	long
    //   33	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	33	finally
    //   14	17	33	finally
    //   19	23	33	finally
    //   26	30	33	finally
  }
  
  /* Error */
  public void stopMeasuring()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 30	io/fabric/sdk/android/services/common/TimingMetric:disabled	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 41	io/fabric/sdk/android/services/common/TimingMetric:duration	J
    //   18: lstore_2
    //   19: lconst_0
    //   20: lstore 4
    //   22: lload_2
    //   23: lload 4
    //   25: lcmp
    //   26: istore_1
    //   27: iload_1
    //   28: ifne -17 -> 11
    //   31: invokestatic 60	android/os/SystemClock:elapsedRealtime	()J
    //   34: lstore_2
    //   35: aload_0
    //   36: getfield 62	io/fabric/sdk/android/services/common/TimingMetric:start	J
    //   39: lstore 4
    //   41: lload_2
    //   42: lload 4
    //   44: lsub
    //   45: lstore_2
    //   46: aload_0
    //   47: lload_2
    //   48: putfield 41	io/fabric/sdk/android/services/common/TimingMetric:duration	J
    //   51: aload_0
    //   52: invokespecial 65	io/fabric/sdk/android/services/common/TimingMetric:reportToLog	()V
    //   55: goto -44 -> 11
    //   58: astore 6
    //   60: aload_0
    //   61: monitorexit
    //   62: aload 6
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	TimingMetric
    //   6	22	1	bool	boolean
    //   18	30	2	l1	long
    //   20	23	4	l2	long
    //   58	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	58	finally
    //   14	18	58	finally
    //   31	34	58	finally
    //   35	39	58	finally
    //   47	51	58	finally
    //   51	55	58	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\TimingMetric.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */