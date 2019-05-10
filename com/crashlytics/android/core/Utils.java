package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

final class Utils
{
  private static final FilenameFilter ALL_FILES_FILTER;
  
  static
  {
    Utils.1 local1 = new com/crashlytics/android/core/Utils$1;
    local1.<init>();
    ALL_FILES_FILTER = local1;
  }
  
  static int capFileCount(File paramFile, int paramInt, Comparator paramComparator)
  {
    FilenameFilter localFilenameFilter = ALL_FILES_FILTER;
    return capFileCount(paramFile, localFilenameFilter, paramInt, paramComparator);
  }
  
  static int capFileCount(File paramFile, FilenameFilter paramFilenameFilter, int paramInt, Comparator paramComparator)
  {
    int i = 0;
    File[] arrayOfFile = paramFile.listFiles(paramFilenameFilter);
    if (arrayOfFile == null) {}
    label84:
    for (;;)
    {
      return i;
      int j = arrayOfFile.length;
      Arrays.sort(arrayOfFile, paramComparator);
      int k = arrayOfFile.length;
      i = j;
      j = 0;
      for (;;)
      {
        if (j >= k) {
          break label84;
        }
        File localFile = arrayOfFile[j];
        if (i <= paramInt) {
          break;
        }
        localFile.delete();
        int m = i + -1;
        j += 1;
        i = m;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\Utils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */