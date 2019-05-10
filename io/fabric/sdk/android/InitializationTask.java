package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.TimingMetric;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityAsyncTask;

class InitializationTask
  extends PriorityAsyncTask
{
  private static final String TIMING_METRIC_TAG = "KitInitialization";
  final Kit kit;
  
  public InitializationTask(Kit paramKit)
  {
    this.kit = paramKit;
  }
  
  private TimingMetric createAndStartTimingMetric(String paramString)
  {
    TimingMetric localTimingMetric = new io/fabric/sdk/android/services/common/TimingMetric;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.kit.getIdentifier();
    localObject = str + "." + paramString;
    localTimingMetric.<init>((String)localObject, "KitInitialization");
    localTimingMetric.startMeasuring();
    return localTimingMetric;
  }
  
  protected Object doInBackground(Void... paramVarArgs)
  {
    TimingMetric localTimingMetric = createAndStartTimingMetric("doInBackground");
    Object localObject = null;
    boolean bool = isCancelled();
    if (!bool) {
      localObject = this.kit.doInBackground();
    }
    localTimingMetric.stopMeasuring();
    return localObject;
  }
  
  public Priority getPriority()
  {
    return Priority.HIGH;
  }
  
  protected void onCancelled(Object paramObject)
  {
    this.kit.onCancelled(paramObject);
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = this.kit.getIdentifier();
    localObject1 = (String)localObject2 + " Initialization was cancelled";
    localObject2 = new io/fabric/sdk/android/InitializationException;
    ((InitializationException)localObject2).<init>((String)localObject1);
    this.kit.initializationCallback.failure((Exception)localObject2);
  }
  
  protected void onPostExecute(Object paramObject)
  {
    this.kit.onPostExecute(paramObject);
    this.kit.initializationCallback.success(paramObject);
  }
  
  /* Error */
  protected void onPreExecute()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: invokespecial 101	io/fabric/sdk/android/services/concurrency/PriorityAsyncTask:onPreExecute	()V
    //   6: ldc 102
    //   8: astore_2
    //   9: aload_0
    //   10: aload_2
    //   11: invokespecial 54	io/fabric/sdk/android/InitializationTask:createAndStartTimingMetric	(Ljava/lang/String;)Lio/fabric/sdk/android/services/common/TimingMetric;
    //   14: astore_3
    //   15: aload_0
    //   16: getfield 17	io/fabric/sdk/android/InitializationTask:kit	Lio/fabric/sdk/android/Kit;
    //   19: astore_2
    //   20: aload_2
    //   21: invokevirtual 104	io/fabric/sdk/android/Kit:onPreExecute	()Z
    //   24: istore 4
    //   26: aload_3
    //   27: invokevirtual 64	io/fabric/sdk/android/services/common/TimingMetric:stopMeasuring	()V
    //   30: iload 4
    //   32: ifne +9 -> 41
    //   35: aload_0
    //   36: iload_1
    //   37: invokevirtual 108	io/fabric/sdk/android/InitializationTask:cancel	(Z)Z
    //   40: pop
    //   41: return
    //   42: astore_2
    //   43: aload_2
    //   44: athrow
    //   45: astore_2
    //   46: aload_3
    //   47: invokevirtual 64	io/fabric/sdk/android/services/common/TimingMetric:stopMeasuring	()V
    //   50: aload_0
    //   51: iload_1
    //   52: invokevirtual 108	io/fabric/sdk/android/InitializationTask:cancel	(Z)Z
    //   55: pop
    //   56: aload_2
    //   57: athrow
    //   58: astore_2
    //   59: invokestatic 114	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   62: astore 5
    //   64: ldc 116
    //   66: astore 6
    //   68: ldc 118
    //   70: astore 7
    //   72: aload 5
    //   74: aload 6
    //   76: aload 7
    //   78: aload_2
    //   79: invokeinterface 124 4 0
    //   84: aload_3
    //   85: invokevirtual 64	io/fabric/sdk/android/services/common/TimingMetric:stopMeasuring	()V
    //   88: aload_0
    //   89: iload_1
    //   90: invokevirtual 108	io/fabric/sdk/android/InitializationTask:cancel	(Z)Z
    //   93: pop
    //   94: goto -53 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	InitializationTask
    //   1	89	1	bool1	boolean
    //   8	13	2	localObject1	Object
    //   42	2	2	localUnmetDependencyException	io.fabric.sdk.android.services.concurrency.UnmetDependencyException
    //   45	12	2	localObject2	Object
    //   58	21	2	localException	Exception
    //   14	71	3	localTimingMetric	TimingMetric
    //   24	7	4	bool2	boolean
    //   62	11	5	localLogger	Logger
    //   66	9	6	str1	String
    //   70	7	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   15	19	42	io/fabric/sdk/android/services/concurrency/UnmetDependencyException
    //   20	24	42	io/fabric/sdk/android/services/concurrency/UnmetDependencyException
    //   15	19	45	finally
    //   20	24	45	finally
    //   43	45	45	finally
    //   59	62	45	finally
    //   78	84	45	finally
    //   15	19	58	java/lang/Exception
    //   20	24	58	java/lang/Exception
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\InitializationTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */