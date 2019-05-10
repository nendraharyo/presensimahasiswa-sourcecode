package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class SessionReport
  implements Report
{
  private final Map customHeaders;
  private final File file;
  private final File[] files;
  
  public SessionReport(File paramFile)
  {
    this(paramFile, localMap);
  }
  
  public SessionReport(File paramFile, Map paramMap)
  {
    this.file = paramFile;
    Object localObject = new File[1];
    Map localMap = null;
    localObject[0] = paramFile;
    this.files = ((File[])localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>(paramMap);
    this.customHeaders = ((Map)localObject);
    localObject = this.file;
    long l1 = ((File)localObject).length();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = this.customHeaders;
      localMap = ReportUploader.HEADER_INVALID_CLS_FILE;
      ((Map)localObject).putAll(localMap);
    }
  }
  
  public Map getCustomHeaders()
  {
    return Collections.unmodifiableMap(this.customHeaders);
  }
  
  public File getFile()
  {
    return this.file;
  }
  
  public String getFileName()
  {
    return getFile().getName();
  }
  
  public File[] getFiles()
  {
    return this.files;
  }
  
  public String getIdentifier()
  {
    String str = getFileName();
    int i = str.lastIndexOf('.');
    return str.substring(0, i);
  }
  
  public Report.Type getType()
  {
    return Report.Type.JAVA;
  }
  
  public void remove()
  {
    Logger localLogger = Fabric.getLogger();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Removing report at ");
    String str = this.file.getPath();
    localObject = str;
    localLogger.d("CrashlyticsCore", (String)localObject);
    this.file.delete();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\SessionReport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */