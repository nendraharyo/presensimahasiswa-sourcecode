package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.util.Iterator;
import java.util.List;

class ReportUploader$Worker
  extends BackgroundPriorityRunnable
{
  private final float delay;
  private final ReportUploader.SendCheck sendCheck;
  
  ReportUploader$Worker(ReportUploader paramReportUploader, float paramFloat, ReportUploader.SendCheck paramSendCheck)
  {
    this.delay = paramFloat;
    this.sendCheck = paramSendCheck;
  }
  
  private void attemptUploadWithRetry()
  {
    Object localObject1 = Fabric.getLogger();
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject4 = ((StringBuilder)localObject4).append("Starting report processing in ");
    float f1 = this.delay;
    localObject4 = ((StringBuilder)localObject4).append(f1);
    Object localObject5 = " second(s)...";
    localObject4 = (String)localObject5;
    ((Logger)localObject1).d("CrashlyticsCore", (String)localObject4);
    float f2 = this.delay;
    int i = 0;
    float f3 = 0.0F;
    Object localObject6 = null;
    boolean bool1 = f2 < 0.0F;
    if (bool1) {}
    Object localObject2;
    int k;
    Object localObject7;
    try
    {
      f2 = this.delay;
      i = 1148846080;
      f3 = 1000.0F;
      f2 *= f3;
      long l1 = f2;
      Thread.sleep(l1);
      localObject6 = this.this$0.findReports();
      localObject1 = ReportUploader.access$100(this.this$0);
      bool1 = ((ReportUploader.HandlingExceptionCheck)localObject1).isHandlingException();
      if (bool1) {
        return;
      }
    }
    catch (InterruptedException localInterruptedException1)
    {
      for (;;)
      {
        localObject2 = Thread.currentThread();
        ((Thread)localObject2).interrupt();
      }
      bool1 = ((List)localObject6).isEmpty();
      if (!bool1)
      {
        localObject2 = this.sendCheck;
        bool1 = ((ReportUploader.SendCheck)localObject2).canSendReports();
        if (!bool1)
        {
          localObject2 = Fabric.getLogger();
          localObject4 = "CrashlyticsCore";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("User declined to send. Removing ");
          k = ((List)localObject6).size();
          localObject5 = ((StringBuilder)localObject5).append(k);
          localObject7 = " Report(s).";
          localObject5 = (String)localObject7;
          ((Logger)localObject2).d((String)localObject4, (String)localObject5);
          localObject6 = ((List)localObject6).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject6).hasNext();
            if (!bool1) {
              break;
            }
            localObject2 = (Report)((Iterator)localObject6).next();
            ((Report)localObject2).remove();
          }
        }
      }
      bool1 = false;
      f2 = 0.0F;
      localObject2 = localObject6;
      i = 0;
      localObject6 = null;
      f3 = 0.0F;
    }
    for (;;)
    {
      boolean bool2 = ((List)localObject2).isEmpty();
      if (bool2) {
        break;
      }
      localObject4 = ReportUploader.access$100(this.this$0);
      bool2 = ((ReportUploader.HandlingExceptionCheck)localObject4).isHandlingException();
      if (bool2) {
        break;
      }
      localObject4 = Fabric.getLogger();
      localObject5 = "CrashlyticsCore";
      localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>();
      localObject7 = ((StringBuilder)localObject7).append("Attempting to send ");
      int m = ((List)localObject2).size();
      localObject7 = ((StringBuilder)localObject7).append(m);
      String str1 = " report(s)";
      localObject7 = str1;
      ((Logger)localObject4).d((String)localObject5, (String)localObject7);
      localObject4 = ((List)localObject2).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (Report)((Iterator)localObject4).next();
        localObject5 = this.this$0;
        ((ReportUploader)localObject5).forceUpload((Report)localObject2);
      }
      localObject2 = this.this$0;
      localObject4 = ((ReportUploader)localObject2).findReports();
      bool1 = ((List)localObject4).isEmpty();
      if (!bool1)
      {
        localObject5 = ReportUploader.access$200();
        int j = i + 1;
        localObject7 = ReportUploader.access$200();
        k = localObject7.length + -1;
        i = Math.min(i, k);
        i = localObject5[i];
        long l2 = i;
        localObject6 = Fabric.getLogger();
        localObject5 = "CrashlyticsCore";
        Object localObject8 = new java/lang/StringBuilder;
        ((StringBuilder)localObject8).<init>();
        localObject8 = ((StringBuilder)localObject8).append("Report submisson: scheduling delayed retry in ").append(l2);
        String str2 = " seconds";
        localObject8 = str2;
        ((Logger)localObject6).d((String)localObject5, (String)localObject8);
        long l3 = 1000L;
        l2 *= l3;
        try
        {
          Thread.sleep(l2);
          i = j;
          localObject2 = localObject4;
        }
        catch (InterruptedException localInterruptedException2)
        {
          localObject3 = Thread.currentThread();
          ((Thread)localObject3).interrupt();
        }
        break;
      }
      Object localObject3 = localObject4;
    }
  }
  
  public void onRun()
  {
    try
    {
      attemptUploadWithRetry();
      ReportUploader.access$002(this.this$0, null);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "An unexpected error occurred while attempting to upload crash reports.";
        localLogger.e(str1, str2, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ReportUploader$Worker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */