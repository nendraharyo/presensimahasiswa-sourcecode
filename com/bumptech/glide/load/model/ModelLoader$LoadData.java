package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Preconditions;
import java.util.List;

public class ModelLoader$LoadData
{
  public final List alternateKeys;
  public final DataFetcher fetcher;
  public final Key sourceKey;
  
  public ModelLoader$LoadData(Key paramKey, DataFetcher paramDataFetcher)
  {
    this(paramKey, localList, paramDataFetcher);
  }
  
  public ModelLoader$LoadData(Key paramKey, List paramList, DataFetcher paramDataFetcher)
  {
    Object localObject = (Key)Preconditions.checkNotNull(paramKey);
    this.sourceKey = ((Key)localObject);
    localObject = (List)Preconditions.checkNotNull(paramList);
    this.alternateKeys = ((List)localObject);
    localObject = (DataFetcher)Preconditions.checkNotNull(paramDataFetcher);
    this.fetcher = ((DataFetcher)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelLoader$LoadData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */