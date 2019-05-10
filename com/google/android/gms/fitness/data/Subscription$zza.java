package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.zzx;

public class Subscription$zza
{
  private DataType zzavT;
  private DataSource zzavU;
  private long zzaxo = -1;
  private int zzaxp = 2;
  
  public zza zzb(DataSource paramDataSource)
  {
    this.zzavU = paramDataSource;
    return this;
  }
  
  public zza zzb(DataType paramDataType)
  {
    this.zzavT = paramDataType;
    return this;
  }
  
  public Subscription zzuz()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = this.zzavU;
    boolean bool3;
    if (localObject1 == null)
    {
      localObject1 = this.zzavT;
      if (localObject1 == null) {}
    }
    else
    {
      bool3 = bool1;
    }
    for (;;)
    {
      Object localObject2 = "Must call setDataSource() or setDataType()";
      zzx.zza(bool3, localObject2);
      localObject1 = this.zzavT;
      if (localObject1 != null)
      {
        localObject1 = this.zzavU;
        if (localObject1 != null)
        {
          localObject1 = this.zzavT;
          localObject2 = this.zzavU.getDataType();
          bool3 = ((DataType)localObject1).equals(localObject2);
          if (!bool3) {
            break label83;
          }
        }
      }
      bool2 = bool1;
      label83:
      zzx.zza(bool2, "Specified data type is incompatible with specified data source");
      localObject1 = new com/google/android/gms/fitness/data/Subscription;
      ((Subscription)localObject1).<init>(this, null);
      return (Subscription)localObject1;
      bool3 = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Subscription$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */