package com.google.android.gms.analytics.internal;

import android.os.Build.VERSION;
import java.io.File;

public class zzx
{
  public static int version()
  {
    try
    {
      String str1 = Build.VERSION.SDK;
      i = Integer.parseInt(str1);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str2 = Build.VERSION.SDK;
        zzae.zzf("Invalid version number", str2);
        int i = 0;
        Object localObject = null;
      }
    }
    return i;
  }
  
  public static boolean zzbo(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i = 9;
    int j = version();
    if (j < i) {}
    for (;;)
    {
      return bool2;
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      localFile.setReadable(false, false);
      localFile.setWritable(false, false);
      localFile.setReadable(bool1, bool1);
      localFile.setWritable(bool1, bool1);
      bool2 = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */