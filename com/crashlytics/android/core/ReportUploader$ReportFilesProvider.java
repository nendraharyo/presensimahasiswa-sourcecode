package com.crashlytics.android.core;

import java.io.File;

abstract interface ReportUploader$ReportFilesProvider
{
  public abstract File[] getCompleteSessionFiles();
  
  public abstract File[] getInvalidSessionFiles();
  
  public abstract File[] getNativeReportFiles();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ReportUploader$ReportFilesProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */