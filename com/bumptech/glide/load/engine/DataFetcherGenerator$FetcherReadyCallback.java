package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

public abstract interface DataFetcherGenerator$FetcherReadyCallback
{
  public abstract void onDataFetcherFailed(Key paramKey, Exception paramException, DataFetcher paramDataFetcher, DataSource paramDataSource);
  
  public abstract void onDataFetcherReady(Key paramKey1, Object paramObject, DataFetcher paramDataFetcher, DataSource paramDataSource, Key paramKey2);
  
  public abstract void reschedule();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DataFetcherGenerator$FetcherReadyCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */