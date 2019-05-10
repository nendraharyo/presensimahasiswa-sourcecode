package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;

public class zzj
  extends zzb
{
  public zzj(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    super(paramString, paramCollection1, paramCollection2, paramInt);
  }
  
  protected void zza(Bundle paramBundle, Collection paramCollection)
  {
    String str = getName();
    boolean bool = paramCollection instanceof ArrayList;
    if (bool) {}
    ArrayList localArrayList;
    for (paramCollection = (ArrayList)paramCollection;; paramCollection = localArrayList)
    {
      paramBundle.putParcelableArrayList(str, paramCollection);
      return;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramCollection);
    }
  }
  
  protected Collection zzs(Bundle paramBundle)
  {
    String str = getName();
    return paramBundle.getParcelableArrayList(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */