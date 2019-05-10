package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItemAsset;

public class zzac
  extends zzc
  implements DataItemAsset
{
  public zzac(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public String getDataItemKey()
  {
    return getString("asset_key");
  }
  
  public String getId()
  {
    return getString("asset_id");
  }
  
  public DataItemAsset zzIL()
  {
    zzaa localzzaa = new com/google/android/gms/wearable/internal/zzaa;
    localzzaa.<init>(this);
    return localzzaa;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */