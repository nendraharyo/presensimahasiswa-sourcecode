package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;

class ByteArrayLoader$Fetcher
  implements DataFetcher
{
  private final ByteArrayLoader.Converter converter;
  private final byte[] model;
  
  ByteArrayLoader$Fetcher(byte[] paramArrayOfByte, ByteArrayLoader.Converter paramConverter)
  {
    this.model = paramArrayOfByte;
    this.converter = paramConverter;
  }
  
  public void cancel() {}
  
  public void cleanup() {}
  
  public Class getDataClass()
  {
    return this.converter.getDataClass();
  }
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    Object localObject = this.converter;
    byte[] arrayOfByte = this.model;
    localObject = ((ByteArrayLoader.Converter)localObject).convert(arrayOfByte);
    paramDataCallback.onDataReady(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteArrayLoader$Fetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */