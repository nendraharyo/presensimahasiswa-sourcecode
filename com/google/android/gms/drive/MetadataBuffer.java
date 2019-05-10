package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.zze;

public final class MetadataBuffer
  extends AbstractDataBuffer
{
  private MetadataBuffer.zza zzapb;
  
  public MetadataBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    Bundle localBundle = paramDataHolder.zzpZ();
    ClassLoader localClassLoader = MetadataBuffer.class.getClassLoader();
    localBundle.setClassLoader(localClassLoader);
  }
  
  public Metadata get(int paramInt)
  {
    MetadataBuffer.zza localzza = this.zzapb;
    if (localzza != null)
    {
      int i = MetadataBuffer.zza.zza(localzza);
      if (i == paramInt) {}
    }
    else
    {
      localzza = new com/google/android/gms/drive/MetadataBuffer$zza;
      DataHolder localDataHolder = this.zzahi;
      localzza.<init>(localDataHolder, paramInt);
      this.zzapb = localzza;
    }
    return localzza;
  }
  
  public String getNextPageToken()
  {
    return null;
  }
  
  public void release()
  {
    DataHolder localDataHolder = this.zzahi;
    if (localDataHolder != null)
    {
      localDataHolder = this.zzahi;
      zze.zza(localDataHolder);
    }
    super.release();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\MetadataBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */