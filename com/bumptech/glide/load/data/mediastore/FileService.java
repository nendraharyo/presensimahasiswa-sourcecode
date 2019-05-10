package com.bumptech.glide.load.data.mediastore;

import java.io.File;

class FileService
{
  public boolean exists(File paramFile)
  {
    return paramFile.exists();
  }
  
  public File get(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    return localFile;
  }
  
  public long length(File paramFile)
  {
    return paramFile.length();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\mediastore\FileService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */