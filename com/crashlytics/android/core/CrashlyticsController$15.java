package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

class CrashlyticsController$15
  implements FilenameFilter
{
  CrashlyticsController$15(CrashlyticsController paramCrashlyticsController, Set paramSet) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    int i = 35;
    boolean bool = false;
    String str = null;
    int j = paramString.length();
    if (j < i) {}
    for (;;)
    {
      return bool;
      Set localSet = this.val$invalidSessionIds;
      str = paramString.substring(0, i);
      bool = localSet.contains(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */