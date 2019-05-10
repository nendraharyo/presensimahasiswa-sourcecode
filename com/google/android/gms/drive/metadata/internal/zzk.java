package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.zza;
import java.util.Collection;

public abstract class zzk
  extends zza
{
  public zzk(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    super(paramString, paramCollection1, paramCollection2, paramInt);
  }
  
  protected void zza(Bundle paramBundle, Parcelable paramParcelable)
  {
    String str = getName();
    paramBundle.putParcelable(str, paramParcelable);
  }
  
  protected Parcelable zzt(Bundle paramBundle)
  {
    String str = getName();
    return paramBundle.getParcelable(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */