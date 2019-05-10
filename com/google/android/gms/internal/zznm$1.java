package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.zzb;
import java.util.Collection;

final class zznm$1
  extends zzb
{
  zznm$1(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    super(paramString, paramCollection1, paramCollection2, paramInt);
  }
  
  protected Boolean zze(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str = "trashed";
    int i = paramDataHolder.zzc(str, paramInt1, paramInt2);
    int k = 2;
    if (i == k) {
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznm$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */