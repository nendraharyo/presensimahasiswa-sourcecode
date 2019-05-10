package com.bumptech.glide.load.engine.executor;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RuntimeCompat$1
  implements FilenameFilter
{
  RuntimeCompat$1(Pattern paramPattern) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    return this.val$cpuNamePattern.matcher(paramString).matches();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\RuntimeCompat$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */