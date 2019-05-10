package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ReportUploader
{
  static final Map HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
  private static final short[] RETRY_INTERVALS;
  private final String apiKey;
  private final CreateReportSpiCall createReportCall;
  private final Object fileAccessLock;
  private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
  private final ReportUploader.ReportFilesProvider reportFilesProvider;
  private Thread uploadThread;
  
  static
  {
    short[] arrayOfShort = new short[6];
    arrayOfShort[0] = 10;
    arrayOfShort[1] = 20;
    arrayOfShort[2] = 30;
    arrayOfShort[3] = 60;
    arrayOfShort[4] = 120;
    arrayOfShort[5] = 'Ĭ';
    RETRY_INTERVALS = arrayOfShort;
  }
  
  public ReportUploader(String paramString, CreateReportSpiCall paramCreateReportSpiCall, ReportUploader.ReportFilesProvider paramReportFilesProvider, ReportUploader.HandlingExceptionCheck paramHandlingExceptionCheck)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.fileAccessLock = localObject;
    if (paramCreateReportSpiCall == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("createReportCall must not be null.");
      throw ((Throwable)localObject);
    }
    this.createReportCall = paramCreateReportSpiCall;
    this.apiKey = paramString;
    this.reportFilesProvider = paramReportFilesProvider;
    this.handlingExceptionCheck = paramHandlingExceptionCheck;
  }
  
  List findReports()
  {
    Object localObject1 = null;
    Object localObject2 = Fabric.getLogger();
    Object localObject5 = "Checking for crash reports...";
    ((Logger)localObject2).d("CrashlyticsCore", (String)localObject5);
    File[] arrayOfFile;
    LinkedList localLinkedList;
    int i;
    int j;
    Object localObject8;
    Object localObject9;
    Object localObject10;
    synchronized (this.fileAccessLock)
    {
      localObject2 = this.reportFilesProvider;
      localObject5 = ((ReportUploader.ReportFilesProvider)localObject2).getCompleteSessionFiles();
      localObject2 = this.reportFilesProvider;
      localObject7 = ((ReportUploader.ReportFilesProvider)localObject2).getInvalidSessionFiles();
      localObject2 = this.reportFilesProvider;
      arrayOfFile = ((ReportUploader.ReportFilesProvider)localObject2).getNativeReportFiles();
      localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      if (localObject5 != null)
      {
        i = localObject5.length;
        j = 0;
        localObject2 = null;
        if (j < i)
        {
          localObject8 = localObject5[j];
          localObject9 = Fabric.getLogger();
          localObject10 = "CrashlyticsCore";
          Object localObject11 = new java/lang/StringBuilder;
          ((StringBuilder)localObject11).<init>();
          localObject11 = ((StringBuilder)localObject11).append("Found crash report ");
          String str = ((File)localObject8).getPath();
          localObject11 = str;
          ((Logger)localObject9).d((String)localObject10, (String)localObject11);
          localObject9 = new com/crashlytics/android/core/SessionReport;
          ((SessionReport)localObject9).<init>((File)localObject8);
          localLinkedList.add(localObject9);
          j += 1;
        }
      }
    }
    localObject5 = new java/util/HashMap;
    ((HashMap)localObject5).<init>();
    if (localObject7 != null)
    {
      int n = localObject7.length;
      i = 0;
      ??? = null;
      while (i < n)
      {
        localObject9 = localObject7[i];
        localObject4 = CrashlyticsController.getSessionIdFromSessionFile((File)localObject9);
        boolean bool2 = ((Map)localObject5).containsKey(localObject4);
        if (!bool2)
        {
          localObject10 = new java/util/LinkedList;
          ((LinkedList)localObject10).<init>();
          ((Map)localObject5).put(localObject4, localObject10);
        }
        localObject4 = (List)((Map)localObject5).get(localObject4);
        ((List)localObject4).add(localObject9);
        j = i + 1;
        i = j;
      }
    }
    Object localObject4 = ((Map)localObject5).keySet();
    Object localObject7 = ((Set)localObject4).iterator();
    int k;
    for (;;)
    {
      k = ((Iterator)localObject7).hasNext();
      if (k == 0) {
        break;
      }
      localObject4 = (String)((Iterator)localObject7).next();
      ??? = Fabric.getLogger();
      localObject9 = new java/lang/StringBuilder;
      ((StringBuilder)localObject9).<init>();
      localObject10 = "Found invalid session: ";
      localObject9 = (String)localObject10 + (String)localObject4;
      ((Logger)???).d("CrashlyticsCore", (String)localObject9);
      ??? = (List)((Map)localObject5).get(localObject4);
      localObject8 = new com/crashlytics/android/core/InvalidSessionReport;
      int i1 = ((List)???).size();
      localObject9 = new File[i1];
      ??? = (File[])((List)???).toArray((Object[])localObject9);
      ((InvalidSessionReport)localObject8).<init>((String)localObject4, (File[])???);
      localLinkedList.add(localObject8);
    }
    if (arrayOfFile != null)
    {
      i = arrayOfFile.length;
      k = 0;
      localObject4 = null;
      while (k < i)
      {
        localObject1 = arrayOfFile[k];
        localObject5 = new com/crashlytics/android/core/NativeSessionReport;
        ((NativeSessionReport)localObject5).<init>((File)localObject1);
        localLinkedList.add(localObject5);
        int m;
        k += 1;
      }
    }
    boolean bool1 = localLinkedList.isEmpty();
    if (bool1)
    {
      localObject4 = Fabric.getLogger();
      ??? = "CrashlyticsCore";
      localObject1 = "No reports found.";
      ((Logger)localObject4).d((String)???, (String)localObject1);
    }
    return localLinkedList;
  }
  
  boolean forceUpload(Report paramReport)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    synchronized (this.fileAccessLock)
    {
      try
      {
        localObject4 = new com/crashlytics/android/core/CreateReportRequest;
        localObject5 = this.apiKey;
        ((CreateReportRequest)localObject4).<init>((String)localObject5, paramReport);
        localObject5 = this.createReportCall;
        boolean bool2 = ((CreateReportSpiCall)localObject5).invoke((CreateReportRequest)localObject4);
        localObject6 = Fabric.getLogger();
        localObject7 = "CrashlyticsCore";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject8 = "Crashlytics report upload ";
        localObject8 = ((StringBuilder)localObject4).append((String)localObject8);
        if (!bool2) {
          break label152;
        }
        localObject4 = "complete: ";
        localObject4 = ((StringBuilder)localObject8).append((String)localObject4);
        localObject8 = paramReport.getIdentifier();
        localObject4 = ((StringBuilder)localObject4).append((String)localObject8);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((Logger)localObject6).i((String)localObject7, (String)localObject4);
        if (bool2)
        {
          paramReport.remove();
          bool1 = true;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject4;
          label152:
          Object localObject5 = Fabric.getLogger();
          Object localObject6 = "CrashlyticsCore";
          Object localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>();
          Object localObject8 = "Error occurred sending report ";
          localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
          localObject7 = ((StringBuilder)localObject7).append(paramReport);
          localObject7 = ((StringBuilder)localObject7).toString();
          ((Logger)localObject5).e((String)localObject6, (String)localObject7, localException);
        }
      }
      return bool1;
      localObject4 = "FAILED: ";
    }
  }
  
  boolean isUploading()
  {
    Thread localThread = this.uploadThread;
    boolean bool;
    if (localThread != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localThread = null;
    }
  }
  
  /* Error */
  public void uploadReports(float paramFloat, ReportUploader.SendCheck paramSendCheck)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 58	com/crashlytics/android/core/ReportUploader:uploadThread	Ljava/lang/Thread;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull +28 -> 36
    //   11: invokestatic 64	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   14: astore_3
    //   15: ldc 66
    //   17: astore 4
    //   19: ldc -27
    //   21: astore 5
    //   23: aload_3
    //   24: aload 4
    //   26: aload 5
    //   28: invokeinterface 74 3 0
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: new 231	com/crashlytics/android/core/ReportUploader$Worker
    //   39: astore_3
    //   40: aload_3
    //   41: aload_0
    //   42: fload_1
    //   43: aload_2
    //   44: invokespecial 234	com/crashlytics/android/core/ReportUploader$Worker:<init>	(Lcom/crashlytics/android/core/ReportUploader;FLcom/crashlytics/android/core/ReportUploader$SendCheck;)V
    //   47: new 236	java/lang/Thread
    //   50: astore 4
    //   52: ldc -18
    //   54: astore 5
    //   56: aload 4
    //   58: aload_3
    //   59: aload 5
    //   61: invokespecial 241	java/lang/Thread:<init>	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   64: aload_0
    //   65: aload 4
    //   67: putfield 58	com/crashlytics/android/core/ReportUploader:uploadThread	Ljava/lang/Thread;
    //   70: aload_0
    //   71: getfield 58	com/crashlytics/android/core/ReportUploader:uploadThread	Ljava/lang/Thread;
    //   74: astore_3
    //   75: aload_3
    //   76: invokevirtual 244	java/lang/Thread:start	()V
    //   79: goto -46 -> 33
    //   82: astore_3
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_3
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	ReportUploader
    //   0	87	1	paramFloat	float
    //   0	87	2	paramSendCheck	ReportUploader.SendCheck
    //   6	70	3	localObject1	Object
    //   82	4	3	localObject2	Object
    //   17	49	4	localObject3	Object
    //   21	39	5	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	82	finally
    //   11	14	82	finally
    //   26	33	82	finally
    //   36	39	82	finally
    //   43	47	82	finally
    //   47	50	82	finally
    //   59	64	82	finally
    //   65	70	82	finally
    //   70	74	82	finally
    //   75	79	82	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ReportUploader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */