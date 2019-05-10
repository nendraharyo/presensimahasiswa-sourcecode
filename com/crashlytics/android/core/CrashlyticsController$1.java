package com.crashlytics.android.core;

import java.io.File;

final class CrashlyticsController$1
  extends CrashlyticsController.FileNameContainsFilter
{
  CrashlyticsController$1(String paramString)
  {
    super(paramString);
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool = super.accept(paramFile, paramString);
    String str;
    if (bool)
    {
      str = ".cls";
      bool = paramString.endsWith(str);
      if (bool) {
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */