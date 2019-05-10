package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public abstract class zzc
{
  protected final DataHolder zzahi;
  protected int zzaje;
  private int zzajf;
  
  public zzc(DataHolder paramDataHolder, int paramInt)
  {
    DataHolder localDataHolder = (DataHolder)zzx.zzz(paramDataHolder);
    this.zzahi = localDataHolder;
    zzbF(paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof zzc;
    if (bool2)
    {
      paramObject = (zzc)paramObject;
      Object localObject1 = Integer.valueOf(((zzc)paramObject).zzaje);
      int i = this.zzaje;
      Object localObject2 = Integer.valueOf(i);
      bool2 = zzw.equal(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = Integer.valueOf(((zzc)paramObject).zzajf);
        i = this.zzajf;
        localObject2 = Integer.valueOf(i);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((zzc)paramObject).zzahi;
          localObject2 = this.zzahi;
          if (localObject1 == localObject2) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  protected boolean getBoolean(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zze(paramString, i, j);
  }
  
  protected byte[] getByteArray(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zzg(paramString, i, j);
  }
  
  protected float getFloat(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zzf(paramString, i, j);
  }
  
  protected int getInteger(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zzc(paramString, i, j);
  }
  
  protected long getLong(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zzb(paramString, i, j);
  }
  
  protected String getString(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zzd(paramString, i, j);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.zzaje);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzajf);
    arrayOfObject[1] = localObject;
    localObject = this.zzahi;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isDataValid()
  {
    DataHolder localDataHolder = this.zzahi;
    boolean bool = localDataHolder.isClosed();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDataHolder = null;
    }
  }
  
  protected void zza(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    localDataHolder.zza(paramString, i, j, paramCharArrayBuffer);
  }
  
  protected void zzbF(int paramInt)
  {
    DataHolder localDataHolder;
    int i;
    if (paramInt >= 0)
    {
      localDataHolder = this.zzahi;
      i = localDataHolder.getCount();
      if (paramInt < i) {
        i = 1;
      }
    }
    for (;;)
    {
      zzx.zzab(i);
      this.zzaje = paramInt;
      localDataHolder = this.zzahi;
      int j = this.zzaje;
      i = localDataHolder.zzbH(j);
      this.zzajf = i;
      return;
      i = 0;
      localDataHolder = null;
    }
  }
  
  protected Uri zzcA(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zzh(paramString, i, j);
  }
  
  protected boolean zzcB(String paramString)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzajf;
    return localDataHolder.zzi(paramString, i, j);
  }
  
  public boolean zzcz(String paramString)
  {
    return this.zzahi.zzcz(paramString);
  }
  
  protected int zzqc()
  {
    return this.zzaje;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */