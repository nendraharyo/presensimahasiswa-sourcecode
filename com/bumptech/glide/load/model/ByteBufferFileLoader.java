package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;

public class ByteBufferFileLoader
  implements ModelLoader
{
  private static final String TAG = "ByteBufferFileLoader";
  
  public ModelLoader.LoadData buildLoadData(File paramFile, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramFile);
    ByteBufferFileLoader.ByteBufferFetcher localByteBufferFetcher = new com/bumptech/glide/load/model/ByteBufferFileLoader$ByteBufferFetcher;
    localByteBufferFetcher.<init>(paramFile);
    localLoadData.<init>(localObjectKey, localByteBufferFetcher);
    return localLoadData;
  }
  
  public boolean handles(File paramFile)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteBufferFileLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */