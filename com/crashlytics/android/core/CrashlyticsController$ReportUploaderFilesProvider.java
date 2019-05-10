package com.crashlytics.android.core;

import java.io.File;

final class CrashlyticsController$ReportUploaderFilesProvider
  implements ReportUploader.ReportFilesProvider
{
  private CrashlyticsController$ReportUploaderFilesProvider(CrashlyticsController paramCrashlyticsController) {}
  
  public File[] getCompleteSessionFiles()
  {
    return this.this$0.listCompleteSessionFiles();
  }
  
  public File[] getInvalidSessionFiles()
  {
    return this.this$0.getInvalidFilesDir().listFiles();
  }
  
  public File[] getNativeReportFiles()
  {
    return this.this$0.listNativeSessionFileDirectories();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$ReportUploaderFilesProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */