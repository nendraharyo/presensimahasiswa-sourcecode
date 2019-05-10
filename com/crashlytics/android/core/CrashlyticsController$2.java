package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

final class CrashlyticsController$2
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    int i = paramString.length();
    String str1 = ".cls";
    int j = str1.length() + 35;
    String str2;
    boolean bool;
    if (i == j)
    {
      str2 = ".cls";
      bool = paramString.endsWith(str2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */