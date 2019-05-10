package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.Map;

class NativeSessionReport
  implements Report
{
  private final File reportDirectory;
  
  public NativeSessionReport(File paramFile)
  {
    this.reportDirectory = paramFile;
  }
  
  public Map getCustomHeaders()
  {
    return null;
  }
  
  public File getFile()
  {
    return null;
  }
  
  public String getFileName()
  {
    return null;
  }
  
  public File[] getFiles()
  {
    return this.reportDirectory.listFiles();
  }
  
  public String getIdentifier()
  {
    return this.reportDirectory.getName();
  }
  
  public Report.Type getType()
  {
    return Report.Type.NATIVE;
  }
  
  public void remove()
  {
    File[] arrayOfFile = getFiles();
    int i = arrayOfFile.length;
    int j = 0;
    Logger localLogger1 = null;
    while (j < i)
    {
      localFile = arrayOfFile[j];
      Logger localLogger2 = Fabric.getLogger();
      String str1 = "CrashlyticsCore";
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Removing native report file at ");
      String str2 = localFile.getPath();
      localObject1 = str2;
      localLogger2.d(str1, (String)localObject1);
      localFile.delete();
      j += 1;
    }
    localLogger1 = Fabric.getLogger();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Removing native report directory at ");
    File localFile = this.reportDirectory;
    localObject2 = localFile;
    localLogger1.d("CrashlyticsCore", (String)localObject2);
    this.reportDirectory.delete();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\NativeSessionReport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */