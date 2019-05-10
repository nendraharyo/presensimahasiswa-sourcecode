package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

public class zzd
  extends com.google.android.gms.drive.metadata.zzd
{
  public zzd(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  protected void zza(Bundle paramBundle, Date paramDate)
  {
    String str = getName();
    long l = paramDate.getTime();
    paramBundle.putLong(str, l);
  }
  
  protected Date zzf(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Date localDate = new java/util/Date;
    String str = getName();
    long l = paramDataHolder.zzb(str, paramInt1, paramInt2);
    localDate.<init>(l);
    return localDate;
  }
  
  protected Date zzp(Bundle paramBundle)
  {
    Date localDate = new java/util/Date;
    String str = getName();
    long l = paramBundle.getLong(str);
    localDate.<init>(l);
    return localDate;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */