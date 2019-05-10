package com.bumptech.glide.load.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class FileLoader$StreamFactory$1
  implements FileLoader.FileOpener
{
  public void close(InputStream paramInputStream)
  {
    paramInputStream.close();
  }
  
  public Class getDataClass()
  {
    return InputStream.class;
  }
  
  public InputStream open(File paramFile)
  {
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    localFileInputStream.<init>(paramFile);
    return localFileInputStream;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\FileLoader$StreamFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */