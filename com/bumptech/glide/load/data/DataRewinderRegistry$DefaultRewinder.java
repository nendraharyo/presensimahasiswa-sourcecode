package com.bumptech.glide.load.data;

final class DataRewinderRegistry$DefaultRewinder
  implements DataRewinder
{
  private final Object data;
  
  DataRewinderRegistry$DefaultRewinder(Object paramObject)
  {
    this.data = paramObject;
  }
  
  public void cleanup() {}
  
  public Object rewindAndGet()
  {
    return this.data;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\DataRewinderRegistry$DefaultRewinder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */