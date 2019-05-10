package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

class CrashlyticsController$SessionPartFileFilter
  implements FilenameFilter
{
  private final String sessionId;
  
  public CrashlyticsController$SessionPartFileFilter(String paramString)
  {
    this.sessionId = paramString;
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool1 = false;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.sessionId;
    localObject = ((StringBuilder)localObject).append(str);
    str = ".cls";
    localObject = str;
    boolean bool2 = paramString.equals(localObject);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      localObject = this.sessionId;
      bool2 = paramString.contains((CharSequence)localObject);
      if (bool2)
      {
        localObject = ".cls_temp";
        bool2 = paramString.endsWith((String)localObject);
        if (!bool2) {
          bool1 = true;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$SessionPartFileFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */