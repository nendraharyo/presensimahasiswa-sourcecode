package com.bumptech.glide.load.model;

public class ByteArrayLoader$ByteBufferFactory
  implements ModelLoaderFactory
{
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    ByteArrayLoader localByteArrayLoader = new com/bumptech/glide/load/model/ByteArrayLoader;
    ByteArrayLoader.ByteBufferFactory.1 local1 = new com/bumptech/glide/load/model/ByteArrayLoader$ByteBufferFactory$1;
    local1.<init>(this);
    localByteArrayLoader.<init>(local1);
    return localByteArrayLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteArrayLoader$ByteBufferFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */