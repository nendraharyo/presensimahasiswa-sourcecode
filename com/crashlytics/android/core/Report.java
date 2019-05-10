package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

abstract interface Report
{
  public abstract Map getCustomHeaders();
  
  public abstract File getFile();
  
  public abstract String getFileName();
  
  public abstract File[] getFiles();
  
  public abstract String getIdentifier();
  
  public abstract Report.Type getType();
  
  public abstract void remove();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\Report.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */