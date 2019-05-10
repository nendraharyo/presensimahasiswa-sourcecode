package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.zzp;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.zze;
import com.google.android.gms.internal.zznm;
import java.util.Collection;
import java.util.Iterator;

class MetadataBuffer$zza
  extends Metadata
{
  private final DataHolder zzahi;
  private final int zzajf;
  private final int zzapc;
  
  public MetadataBuffer$zza(DataHolder paramDataHolder, int paramInt)
  {
    this.zzahi = paramDataHolder;
    this.zzapc = paramInt;
    int i = paramDataHolder.zzbH(paramInt);
    this.zzajf = i;
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
  
  public Object zza(MetadataField paramMetadataField)
  {
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzapc;
    int j = this.zzajf;
    return paramMetadataField.zza(localDataHolder, i, j);
  }
  
  public Metadata zzsK()
  {
    MetadataBundle localMetadataBundle = MetadataBundle.zztE();
    Object localObject1 = zze.zztC();
    Iterator localIterator = ((Collection)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (MetadataField)localIterator.next();
      Object localObject2 = zznm.zzatz;
      if (localObject1 != localObject2)
      {
        localObject2 = this.zzahi;
        int i = this.zzapc;
        int j = this.zzajf;
        ((MetadataField)localObject1).zza((DataHolder)localObject2, localMetadataBundle, i, j);
      }
    }
    localObject1 = new com/google/android/gms/drive/internal/zzp;
    ((zzp)localObject1).<init>(localMetadataBundle);
    return (Metadata)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\MetadataBuffer$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */