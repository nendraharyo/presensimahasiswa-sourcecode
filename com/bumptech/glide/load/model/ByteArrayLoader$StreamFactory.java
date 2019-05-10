package com.bumptech.glide.load.model;

public class ByteArrayLoader$StreamFactory
  implements ModelLoaderFactory
{
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    ByteArrayLoader localByteArrayLoader = new com/bumptech/glide/load/model/ByteArrayLoader;
    ByteArrayLoader.StreamFactory.1 local1 = new com/bumptech/glide/load/model/ByteArrayLoader$StreamFactory$1;
    local1.<init>(this);
    localByteArrayLoader.<init>(local1);
    return localByteArrayLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteArrayLoader$StreamFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */