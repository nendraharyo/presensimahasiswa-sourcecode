package com.crashlytics.android.core;

import java.io.File;
import java.util.Comparator;

final class CrashlyticsController$5
  implements Comparator
{
  public int compare(File paramFile1, File paramFile2)
  {
    String str1 = paramFile1.getName();
    String str2 = paramFile2.getName();
    return str1.compareTo(str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */