package com.crashlytics.android.core;

import java.io.File;
import java.io.FileFilter;

final class CrashlyticsController$3
  implements FileFilter
{
  public boolean accept(File paramFile)
  {
    boolean bool = paramFile.isDirectory();
    String str;
    int i;
    if (bool)
    {
      str = paramFile.getName();
      i = str.length();
      int k = 35;
      if (i == k) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */