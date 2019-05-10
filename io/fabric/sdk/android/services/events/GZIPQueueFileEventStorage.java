package io.fabric.sdk.android.services.events;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPQueueFileEventStorage
  extends QueueFileEventStorage
{
  public GZIPQueueFileEventStorage(Context paramContext, File paramFile, String paramString1, String paramString2)
  {
    super(paramContext, paramFile, paramString1, paramString2);
  }
  
  public OutputStream getMoveOutputStream(File paramFile)
  {
    GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>(paramFile);
    localGZIPOutputStream.<init>(localFileOutputStream);
    return localGZIPOutputStream;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\GZIPQueueFileEventStorage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */