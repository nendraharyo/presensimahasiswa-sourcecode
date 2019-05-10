package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

class CrashlyticsController$InvalidPartFileFilter
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    Object localObject = ClsFileOutputStream.TEMP_FILENAME_FILTER;
    boolean bool = ((FilenameFilter)localObject).accept(paramFile, paramString);
    if (!bool)
    {
      localObject = "SessionMissingBinaryImages";
      bool = paramString.contains((CharSequence)localObject);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$InvalidPartFileFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */