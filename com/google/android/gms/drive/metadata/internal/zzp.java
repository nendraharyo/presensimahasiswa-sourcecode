package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzp
  extends zza
{
  public zzp(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  protected void zzd(Bundle paramBundle, String paramString)
  {
    String str = getName();
    paramBundle.putString(str, paramString);
  }
  
  protected String zzi(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str = getName();
    return paramDataHolder.zzd(str, paramInt1, paramInt2);
  }
  
  protected String zzu(Bundle paramBundle)
  {
    String str = getName();
    return paramBundle.getString(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */