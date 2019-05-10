package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import java.io.File;

class zzal
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
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Invalid version number: ");
        String str2 = Build.VERSION.SDK;
        zzbg.e(str2);
        int i = 0;
        localStringBuilder = null;
      }
    }
    return i;
  }
  
  static boolean zzbo(String paramString)
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */