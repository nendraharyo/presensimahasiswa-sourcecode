package com.bumptech.glide.load.engine.bitmap_recycle;

public final class IntegerArrayAdapter
  implements ArrayAdapterInterface
{
  private static final String TAG = "IntegerArrayPool";
  
  public int getArrayLength(int[] paramArrayOfInt)
  {
    return paramArrayOfInt.length;
  }
  
  public int getElementSizeInBytes()
  {
    return 4;
  }
  
  public String getTag()
  {
    return "IntegerArrayPool";
  }
  
  public int[] newArray(int paramInt)
  {
    return new int[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\IntegerArrayAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */