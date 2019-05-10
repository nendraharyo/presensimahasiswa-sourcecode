package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;

public class ByteArrayLoader
  implements ModelLoader
{
  private final ByteArrayLoader.Converter converter;
  
  public ByteArrayLoader(ByteArrayLoader.Converter paramConverter)
  {
    this.converter = paramConverter;
  }
  
  public ModelLoader.LoadData buildLoadData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramArrayOfByte);
    ByteArrayLoader.Fetcher localFetcher = new com/bumptech/glide/load/model/ByteArrayLoader$Fetcher;
    ByteArrayLoader.Converter localConverter = this.converter;
    localFetcher.<init>(paramArrayOfByte, localConverter);
    localLoadData.<init>(localObjectKey, localFetcher);
    return localLoadData;
  }
  
  public boolean handles(byte[] paramArrayOfByte)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteArrayLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */