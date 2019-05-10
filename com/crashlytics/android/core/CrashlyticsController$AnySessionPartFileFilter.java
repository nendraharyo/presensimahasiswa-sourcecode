package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CrashlyticsController$AnySessionPartFileFilter
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    Object localObject = CrashlyticsController.SESSION_FILE_FILTER;
    boolean bool = ((FilenameFilter)localObject).accept(paramFile, paramString);
    if (!bool)
    {
      localObject = CrashlyticsController.access$000().matcher(paramString);
      bool = ((Matcher)localObject).matches();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$AnySessionPartFileFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */