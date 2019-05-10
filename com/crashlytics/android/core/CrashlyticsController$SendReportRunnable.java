package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;

final class CrashlyticsController$SendReportRunnable
  implements Runnable
{
  private final Context context;
  private final Report report;
  private final ReportUploader reportUploader;
  
  public CrashlyticsController$SendReportRunnable(Context paramContext, Report paramReport, ReportUploader paramReportUploader)
  {
    this.context = paramContext;
    this.report = paramReport;
    this.reportUploader = paramReportUploader;
  }
  
  public void run()
  {
    Object localObject = this.context;
    boolean bool = CommonUtils.canTryConnection((Context)localObject);
    if (!bool) {}
    for (;;)
    {
      return;
      localObject = Fabric.getLogger();
      String str = "Attempting to send crash report at time of crash...";
      ((Logger)localObject).d("CrashlyticsCore", str);
      localObject = this.reportUploader;
      Report localReport = this.report;
      ((ReportUploader)localObject).forceUpload(localReport);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$SendReportRunnable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */