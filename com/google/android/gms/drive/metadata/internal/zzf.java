package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzf
  extends zza
{
  public zzf(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  protected void zza(Bundle paramBundle, Integer paramInteger)
  {
    String str = getName();
    int i = paramInteger.intValue();
    paramBundle.putInt(str, i);
  }
  
  protected Integer zzg(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str = getName();
    return Integer.valueOf(paramDataHolder.zzc(str, paramInt1, paramInt2));
  }
  
  protected Integer zzq(Bundle paramBundle)
  {
    String str = getName();
    return Integer.valueOf(paramBundle.getInt(str));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */