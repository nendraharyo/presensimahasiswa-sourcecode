package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class zzf
  extends AbstractDataBuffer
{
  private boolean zzajw = false;
  private ArrayList zzajx;
  
  protected zzf(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  private void zzqh()
  {
    int i = 1;
    Object localObject1;
    int m;
    int j;
    Integer localInteger;
    try
    {
      boolean bool1 = this.zzajw;
      if (bool1) {
        break label301;
      }
      localObject1 = this.zzahi;
      int k = ((DataHolder)localObject1).getCount();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.zzajx = ((ArrayList)localObject1);
      if (k <= 0) {
        break label294;
      }
      localObject1 = this.zzajx;
      m = 0;
      Object localObject2 = null;
      localObject2 = Integer.valueOf(0);
      ((ArrayList)localObject1).add(localObject2);
      String str1 = zzqg();
      localObject1 = this.zzahi;
      m = 0;
      localObject2 = null;
      j = ((DataHolder)localObject1).zzbH(0);
      localObject2 = this.zzahi;
      int n = 0;
      localInteger = null;
      localObject1 = ((DataHolder)localObject2).zzd(str1, 0, j);
      m = i;
      if (m >= k) {
        break label294;
      }
      Object localObject3 = this.zzahi;
      n = ((DataHolder)localObject3).zzbH(m);
      localObject3 = this.zzahi;
      localObject3 = ((DataHolder)localObject3).zzd(str1, m, n);
      if (localObject3 == null)
      {
        localObject3 = new java/lang/NullPointerException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str2 = "Missing value for markerColumn: ";
        localObject1 = ((StringBuilder)localObject1).append(str2);
        localObject1 = ((StringBuilder)localObject1).append(str1);
        str2 = ", at row: ";
        localObject1 = ((StringBuilder)localObject1).append(str2);
        localObject1 = ((StringBuilder)localObject1).append(m);
        localObject2 = ", for window: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = ((StringBuilder)localObject1).append(n);
        localObject1 = ((StringBuilder)localObject1).toString();
        ((NullPointerException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
    }
    finally {}
    boolean bool2 = ((String)localObject4).equals(localObject1);
    if (!bool2)
    {
      localObject1 = this.zzajx;
      localInteger = Integer.valueOf(m);
      ((ArrayList)localObject1).add(localInteger);
    }
    for (;;)
    {
      j = m + 1;
      m = j;
      localObject1 = localObject4;
      break;
      label294:
      i = 1;
      this.zzajw = i;
      label301:
      return;
      Object localObject5 = localObject1;
    }
  }
  
  public final Object get(int paramInt)
  {
    zzqh();
    int i = zzbK(paramInt);
    int j = zzbL(paramInt);
    return zzk(i, j);
  }
  
  public int getCount()
  {
    zzqh();
    return this.zzajx.size();
  }
  
  int zzbK(int paramInt)
  {
    Object localObject1;
    if (paramInt >= 0)
    {
      localObject1 = this.zzajx;
      int i = ((ArrayList)localObject1).size();
      if (paramInt < i) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Position " + paramInt + " is out of bounds for this buffer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return ((Integer)this.zzajx.get(paramInt)).intValue();
  }
  
  protected int zzbL(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = this.zzajx;
      i = ((ArrayList)localObject).size();
      if (paramInt != i) {}
    }
    else
    {
      i = 0;
      localObject = null;
      return i;
    }
    Object localObject = this.zzajx;
    int i = ((ArrayList)localObject).size() + -1;
    int j;
    if (paramInt == i)
    {
      j = this.zzahi.getCount();
      localObject = (Integer)this.zzajx.get(paramInt);
      i = ((Integer)localObject).intValue();
    }
    for (i = j - i;; i = j - i)
    {
      j = 1;
      if (i != j) {
        break;
      }
      j = zzbK(paramInt);
      DataHolder localDataHolder1 = this.zzahi;
      int k = localDataHolder1.zzbH(j);
      String str1 = zzqi();
      if (str1 == null) {
        break;
      }
      DataHolder localDataHolder2 = this.zzahi;
      String str2 = localDataHolder2.zzd(str1, j, k);
      if (str2 != null) {
        break;
      }
      i = 0;
      localObject = null;
      break;
      localObject = this.zzajx;
      j = paramInt + 1;
      j = ((Integer)((ArrayList)localObject).get(j)).intValue();
      localObject = (Integer)this.zzajx.get(paramInt);
      i = ((Integer)localObject).intValue();
    }
  }
  
  protected abstract Object zzk(int paramInt1, int paramInt2);
  
  protected abstract String zzqg();
  
  protected String zzqi()
  {
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */