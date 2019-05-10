package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

public abstract interface DataFetcher
{
  public abstract void cancel();
  
  public abstract void cleanup();
  
  public abstract Class getDataClass();
  
  public abstract DataSource getDataSource();
  
  public abstract void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\DataFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */