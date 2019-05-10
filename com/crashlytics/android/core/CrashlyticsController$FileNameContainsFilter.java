package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

class CrashlyticsController$FileNameContainsFilter
  implements FilenameFilter
{
  private final String string;
  
  public CrashlyticsController$FileNameContainsFilter(String paramString)
  {
    this.string = paramString;
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    String str = this.string;
    boolean bool = paramString.contains(str);
    if (bool)
    {
      str = ".cls_temp";
      bool = paramString.endsWith(str);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$FileNameContainsFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */