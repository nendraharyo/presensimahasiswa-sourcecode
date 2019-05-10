package com.bumptech.glide.load.resource.bitmap;

abstract interface DefaultImageHeaderParser$Reader
{
  public abstract int getByte();
  
  public abstract int getUInt16();
  
  public abstract short getUInt8();
  
  public abstract int read(byte[] paramArrayOfByte, int paramInt);
  
  public abstract long skip(long paramLong);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DefaultImageHeaderParser$Reader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */