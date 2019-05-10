package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.zzc;

public abstract class AbstractFilter
  implements Filter
{
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    Object localObject = new com/google/android/gms/drive/query/zzc;
    ((zzc)localObject).<init>();
    localObject = zza((zzf)localObject);
    arrayOfObject[0] = localObject;
    return String.format("Filter[%s]", arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\AbstractFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */