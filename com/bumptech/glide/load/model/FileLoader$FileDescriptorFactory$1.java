package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import java.io.File;

class FileLoader$FileDescriptorFactory$1
  implements FileLoader.FileOpener
{
  public void close(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    paramParcelFileDescriptor.close();
  }
  
  public Class getDataClass()
  {
    return ParcelFileDescriptor.class;
  }
  
  public ParcelFileDescriptor open(File paramFile)
  {
    return ParcelFileDescriptor.open(paramFile, 268435456);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\FileLoader$FileDescriptorFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */