package com.bumptech.glide.load.model;

public class UnitModelLoader$Factory
  implements ModelLoaderFactory
{
  private static final Factory FACTORY;
  
  static
  {
    Factory localFactory = new com/bumptech/glide/load/model/UnitModelLoader$Factory;
    localFactory.<init>();
    FACTORY = localFactory;
  }
  
  public static Factory getInstance()
  {
    return FACTORY;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    return UnitModelLoader.getInstance();
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UnitModelLoader$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */