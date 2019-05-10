package com.bumptech.glide.load.model;

public final class DataUrlLoader$StreamFactory
  implements ModelLoaderFactory
{
  private final DataUrlLoader.DataDecoder opener;
  
  public DataUrlLoader$StreamFactory()
  {
    DataUrlLoader.StreamFactory.1 local1 = new com/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;
    local1.<init>(this);
    this.opener = local1;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    DataUrlLoader localDataUrlLoader = new com/bumptech/glide/load/model/DataUrlLoader;
    DataUrlLoader.DataDecoder localDataDecoder = this.opener;
    localDataUrlLoader.<init>(localDataDecoder);
    return localDataUrlLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\DataUrlLoader$StreamFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */