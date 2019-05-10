package com.bumptech.glide.load;

public enum DataSource
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/bumptech/glide/load/DataSource;
    ((DataSource)localObject).<init>("LOCAL", 0);
    LOCAL = (DataSource)localObject;
    localObject = new com/bumptech/glide/load/DataSource;
    ((DataSource)localObject).<init>("REMOTE", m);
    REMOTE = (DataSource)localObject;
    localObject = new com/bumptech/glide/load/DataSource;
    ((DataSource)localObject).<init>("DATA_DISK_CACHE", k);
    DATA_DISK_CACHE = (DataSource)localObject;
    localObject = new com/bumptech/glide/load/DataSource;
    ((DataSource)localObject).<init>("RESOURCE_DISK_CACHE", j);
    RESOURCE_DISK_CACHE = (DataSource)localObject;
    localObject = new com/bumptech/glide/load/DataSource;
    ((DataSource)localObject).<init>("MEMORY_CACHE", i);
    MEMORY_CACHE = (DataSource)localObject;
    localObject = new DataSource[5];
    DataSource localDataSource = LOCAL;
    localObject[0] = localDataSource;
    localDataSource = REMOTE;
    localObject[m] = localDataSource;
    localDataSource = DATA_DISK_CACHE;
    localObject[k] = localDataSource;
    localDataSource = RESOURCE_DISK_CACHE;
    localObject[j] = localDataSource;
    localDataSource = MEMORY_CACHE;
    localObject[i] = localDataSource;
    $VALUES = (DataSource[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\DataSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */