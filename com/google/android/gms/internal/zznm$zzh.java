package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.zzb;

public class zznm$zzh
  extends zzb
  implements SearchableMetadataField
{
  public zznm$zzh(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  protected Boolean zze(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str = getName();
    int i = paramDataHolder.zzc(str, paramInt1, paramInt2);
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      return Boolean.valueOf(i);
      int j = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznm$zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */