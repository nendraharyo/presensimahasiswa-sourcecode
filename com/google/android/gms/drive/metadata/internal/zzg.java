package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzg
  extends zza
{
  public zzg(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  protected void zza(Bundle paramBundle, Long paramLong)
  {
    String str = getName();
    long l = paramLong.longValue();
    paramBundle.putLong(str, l);
  }
  
  protected Long zzh(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str = getName();
    return Long.valueOf(paramDataHolder.zzb(str, paramInt1, paramInt2));
  }
  
  protected Long zzr(Bundle paramBundle)
  {
    String str = getName();
    return Long.valueOf(paramBundle.getLong(str));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */