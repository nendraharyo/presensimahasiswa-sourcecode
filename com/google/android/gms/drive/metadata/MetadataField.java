package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public abstract interface MetadataField
{
  public abstract String getName();
  
  public abstract Object zza(DataHolder paramDataHolder, int paramInt1, int paramInt2);
  
  public abstract void zza(DataHolder paramDataHolder, MetadataBundle paramMetadataBundle, int paramInt1, int paramInt2);
  
  public abstract void zza(Object paramObject, Bundle paramBundle);
  
  public abstract Object zzm(Bundle paramBundle);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\MetadataField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */