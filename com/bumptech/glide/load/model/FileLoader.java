package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;

public class FileLoader
  implements ModelLoader
{
  private static final String TAG = "FileLoader";
  private final FileLoader.FileOpener fileOpener;
  
  public FileLoader(FileLoader.FileOpener paramFileOpener)
  {
    this.fileOpener = paramFileOpener;
  }
  
  public ModelLoader.LoadData buildLoadData(File paramFile, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramFile);
    FileLoader.FileFetcher localFileFetcher = new com/bumptech/glide/load/model/FileLoader$FileFetcher;
    FileLoader.FileOpener localFileOpener = this.fileOpener;
    localFileFetcher.<init>(paramFile, localFileOpener);
    localLoadData.<init>(localObjectKey, localFileFetcher);
    return localLoadData;
  }
  
  public boolean handles(File paramFile)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\FileLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */