package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;

public final class DataUrlLoader
  implements ModelLoader
{
  private static final String BASE64_TAG = ";base64";
  private static final String DATA_SCHEME_IMAGE = "data:image";
  private final DataUrlLoader.DataDecoder dataDecoder;
  
  public DataUrlLoader(DataUrlLoader.DataDecoder paramDataDecoder)
  {
    this.dataDecoder = paramDataDecoder;
  }
  
  public ModelLoader.LoadData buildLoadData(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramObject);
    DataUrlLoader.DataUriFetcher localDataUriFetcher = new com/bumptech/glide/load/model/DataUrlLoader$DataUriFetcher;
    String str = paramObject.toString();
    DataUrlLoader.DataDecoder localDataDecoder = this.dataDecoder;
    localDataUriFetcher.<init>(str, localDataDecoder);
    localLoadData.<init>(localObjectKey, localDataUriFetcher);
    return localLoadData;
  }
  
  public boolean handles(Object paramObject)
  {
    return paramObject.toString().startsWith("data:image");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\DataUrlLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */