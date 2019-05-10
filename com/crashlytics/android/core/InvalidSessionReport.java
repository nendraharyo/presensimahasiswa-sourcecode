package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class InvalidSessionReport
  implements Report
{
  private final Map customHeaders;
  private final File[] files;
  private final String identifier;
  
  public InvalidSessionReport(String paramString, File[] paramArrayOfFile)
  {
    this.files = paramArrayOfFile;
    HashMap localHashMap = new java/util/HashMap;
    Map localMap = ReportUploader.HEADER_INVALID_CLS_FILE;
    localHashMap.<init>(localMap);
    this.customHeaders = localHashMap;
    this.identifier = paramString;
  }
  
  public Map getCustomHeaders()
  {
    return Collections.unmodifiableMap(this.customHeaders);
  }
  
  public File getFile()
  {
    return this.files[0];
  }
  
  public String getFileName()
  {
    return this.files[0].getName();
  }
  
  public File[] getFiles()
  {
    return this.files;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public Report.Type getType()
  {
    return Report.Type.JAVA;
  }
  
  public void remove()
  {
    File[] arrayOfFile = this.files;
    int i = arrayOfFile.length;
    int j = 0;
    while (j < i)
    {
      File localFile = arrayOfFile[j];
      Logger localLogger = Fabric.getLogger();
      String str1 = "CrashlyticsCore";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Removing invalid report file at ");
      String str2 = localFile.getPath();
      localObject = str2;
      localLogger.d(str1, (String)localObject);
      localFile.delete();
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\InvalidSessionReport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */