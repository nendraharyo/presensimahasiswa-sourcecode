package org.apache.http.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

public class FileEntity
  extends AbstractHttpEntity
  implements Cloneable
{
  protected final File file;
  
  public FileEntity(File paramFile)
  {
    File localFile = (File)Args.notNull(paramFile, "File");
    this.file = localFile;
  }
  
  public FileEntity(File paramFile, String paramString)
  {
    File localFile = (File)Args.notNull(paramFile, "File");
    this.file = localFile;
    setContentType(paramString);
  }
  
  public FileEntity(File paramFile, ContentType paramContentType)
  {
    Object localObject = (File)Args.notNull(paramFile, "File");
    this.file = ((File)localObject);
    if (paramContentType != null)
    {
      localObject = paramContentType.toString();
      setContentType((String)localObject);
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public InputStream getContent()
  {
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    File localFile = this.file;
    localFileInputStream.<init>(localFile);
    return localFileInputStream;
  }
  
  public long getContentLength()
  {
    return this.file.length();
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    Object localObject1 = this.file;
    localFileInputStream.<init>((File)localObject1);
    int i = 4096;
    try
    {
      localObject1 = new byte[i];
      for (;;)
      {
        int j = localFileInputStream.read((byte[])localObject1);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        paramOutputStream.write((byte[])localObject1, 0, j);
      }
    }
    finally
    {
      localFileInputStream.close();
    }
    localFileInputStream.close();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\FileEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */