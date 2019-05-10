package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

public class FileDecoder
  implements ResourceDecoder
{
  public Resource decode(File paramFile, int paramInt1, int paramInt2, Options paramOptions)
  {
    FileResource localFileResource = new com/bumptech/glide/load/resource/file/FileResource;
    localFileResource.<init>(paramFile);
    return localFileResource;
  }
  
  public boolean handles(File paramFile, Options paramOptions)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\file\FileDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */