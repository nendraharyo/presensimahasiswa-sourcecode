package com.crashlytics.android.core;

final class LogFileManager$NoopLogStore
  implements FileLogStore
{
  public void closeLogFile() {}
  
  public void deleteLogFile() {}
  
  public ByteString getLogAsByteString()
  {
    return null;
  }
  
  public byte[] getLogAsBytes()
  {
    return null;
  }
  
  public void writeToLog(long paramLong, String paramString) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\LogFileManager$NoopLogStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */