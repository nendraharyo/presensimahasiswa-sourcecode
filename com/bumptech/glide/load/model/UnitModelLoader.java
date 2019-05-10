package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;

public class UnitModelLoader
  implements ModelLoader
{
  private static final UnitModelLoader INSTANCE;
  
  static
  {
    UnitModelLoader localUnitModelLoader = new com/bumptech/glide/load/model/UnitModelLoader;
    localUnitModelLoader.<init>();
    INSTANCE = localUnitModelLoader;
  }
  
  public static UnitModelLoader getInstance()
  {
    return INSTANCE;
  }
  
  public ModelLoader.LoadData buildLoadData(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramObject);
    UnitModelLoader.UnitFetcher localUnitFetcher = new com/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;
    localUnitFetcher.<init>(paramObject);
    localLoadData.<init>(localObjectKey, localUnitFetcher);
    return localLoadData;
  }
  
  public boolean handles(Object paramObject)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UnitModelLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */