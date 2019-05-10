package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class zzb
  implements Iterator
{
  protected final DataBuffer zzajb;
  protected int zzajc;
  
  public zzb(DataBuffer paramDataBuffer)
  {
    DataBuffer localDataBuffer = (DataBuffer)zzx.zzz(paramDataBuffer);
    this.zzajb = localDataBuffer;
    this.zzajc = -1;
  }
  
  public boolean hasNext()
  {
    int i = this.zzajc;
    DataBuffer localDataBuffer = this.zzajb;
    int k = localDataBuffer.getCount() + -1;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object next()
  {
    boolean bool = hasNext();
    if (!bool)
    {
      localObject1 = new java/util/NoSuchElementException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Cannot advance the iterator beyond ");
      int i = this.zzajc;
      localObject2 = i;
      ((NoSuchElementException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.zzajb;
    int j = this.zzajc + 1;
    this.zzajc = j;
    return ((DataBuffer)localObject1).get(j);
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Cannot remove elements from a DataBufferIterator");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */