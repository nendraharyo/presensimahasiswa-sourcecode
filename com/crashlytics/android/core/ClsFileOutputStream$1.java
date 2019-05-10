package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

final class ClsFileOutputStream$1
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.endsWith(".cls_temp");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ClsFileOutputStream$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */