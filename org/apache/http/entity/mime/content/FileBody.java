package org.apache.http.entity.mime.content;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentType;
import org.apache.http.util.Args;

public class FileBody
  extends AbstractContentBody
{
  private final File file;
  private final String filename;
  
  public FileBody(File paramFile) {}
  
  public FileBody(File paramFile, String paramString)
  {
    this(paramFile, localContentType, null);
  }
  
  public FileBody(File paramFile, String paramString1, String paramString2)
  {
    this(paramFile, null, paramString1, paramString2);
  }
  
  public FileBody(File paramFile, String paramString1, String paramString2, String paramString3)
  {
    this(paramFile, localContentType, paramString1);
  }
  
  public FileBody(File paramFile, ContentType paramContentType)
  {
    this(paramFile, paramContentType, null);
  }
  
  public FileBody(File paramFile, ContentType paramContentType, String paramString)
  {
    super(paramContentType);
    Args.notNull(paramFile, "File");
    this.file = paramFile;
    this.filename = paramString;
  }
  
  public long getContentLength()
  {
    return this.file.length();
  }
  
  public File getFile()
  {
    return this.file;
  }
  
  public String getFilename()
  {
    return this.filename;
  }
  
  public InputStream getInputStream()
  {
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    File localFile = this.file;
    localFileInputStream.<init>(localFile);
    return localFileInputStream;
  }
  
  public String getTransferEncoding()
  {
    return "binary";
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\content\FileBody.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */