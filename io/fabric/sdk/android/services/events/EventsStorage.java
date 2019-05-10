package io.fabric.sdk.android.services.events;

import java.io.File;
import java.util.List;

public abstract interface EventsStorage
{
  public abstract void add(byte[] paramArrayOfByte);
  
  public abstract boolean canWorkingFileStore(int paramInt1, int paramInt2);
  
  public abstract void deleteFilesInRollOverDirectory(List paramList);
  
  public abstract void deleteWorkingFile();
  
  public abstract List getAllFilesInRollOverDirectory();
  
  public abstract List getBatchOfFilesToSend(int paramInt);
  
  public abstract File getRollOverDirectory();
  
  public abstract File getWorkingDirectory();
  
  public abstract int getWorkingFileUsedSizeInBytes();
  
  public abstract boolean isWorkingFileEmpty();
  
  public abstract void rollOver(String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsStorage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */