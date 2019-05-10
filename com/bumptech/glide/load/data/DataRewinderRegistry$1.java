package com.bumptech.glide.load.data;

class DataRewinderRegistry$1
  implements DataRewinder.Factory
{
  public DataRewinder build(Object paramObject)
  {
    DataRewinderRegistry.DefaultRewinder localDefaultRewinder = new com/bumptech/glide/load/data/DataRewinderRegistry$DefaultRewinder;
    localDefaultRewinder.<init>(paramObject);
    return localDefaultRewinder;
  }
  
  public Class getDataClass()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Not implemented");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\DataRewinderRegistry$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */