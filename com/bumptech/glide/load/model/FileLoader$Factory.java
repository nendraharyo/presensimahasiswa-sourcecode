package com.bumptech.glide.load.model;

public class FileLoader$Factory
  implements ModelLoaderFactory
{
  private final FileLoader.FileOpener opener;
  
  public FileLoader$Factory(FileLoader.FileOpener paramFileOpener)
  {
    this.opener = paramFileOpener;
  }
  
  public final ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    FileLoader localFileLoader = new com/bumptech/glide/load/model/FileLoader;
    FileLoader.FileOpener localFileOpener = this.opener;
    localFileLoader.<init>(localFileOpener);
    return localFileLoader;
  }
  
  public final void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\FileLoader$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */