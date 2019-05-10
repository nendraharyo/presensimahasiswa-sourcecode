package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public class zzg
  extends zzb
{
  private Object zzajy;
  
  public zzg(DataBuffer paramDataBuffer)
  {
    super(paramDataBuffer);
  }
  
  public Object next()
  {
    boolean bool1 = hasNext();
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/util/NoSuchElementException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Cannot advance the iterator beyond ");
      int j = this.zzajc;
      localObject2 = j;
      ((NoSuchElementException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i = this.zzajc + 1;
    this.zzajc = i;
    i = this.zzajc;
    int k;
    if (i == 0)
    {
      localObject1 = this.zzajb;
      k = 0;
      localObject2 = null;
      localObject1 = ((DataBuffer)localObject1).get(0);
      this.zzajy = localObject1;
      localObject1 = this.zzajy;
      boolean bool2 = localObject1 instanceof zzc;
      if (!bool2)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("DataBuffer reference of type ");
        Class localClass = this.zzajy.getClass();
        localObject2 = localClass + " is not movable";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      localObject1 = (zzc)this.zzajy;
      k = this.zzajc;
      ((zzc)localObject1).zzbF(k);
    }
    return this.zzajy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */