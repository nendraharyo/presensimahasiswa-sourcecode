package com.crashlytics.android.core;

abstract interface FileLogStore
{
  public abstract void closeLogFile();
  
  public abstract void deleteLogFile();
  
  public abstract ByteString getLogAsByteString();
  
  public abstract byte[] getLogAsBytes();
  
  public abstract void writeToLog(long paramLong, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\FileLogStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */