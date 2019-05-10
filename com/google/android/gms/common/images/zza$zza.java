package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.zzw;

final class zza$zza
{
  public final Uri uri;
  
  public zza$zza(Uri paramUri)
  {
    this.uri = paramUri;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof zza;
    Uri localUri1;
    if (!bool)
    {
      bool = false;
      localUri1 = null;
    }
    for (;;)
    {
      return bool;
      if (this == paramObject)
      {
        bool = true;
      }
      else
      {
        paramObject = (zza)paramObject;
        localUri1 = ((zza)paramObject).uri;
        Uri localUri2 = this.uri;
        bool = zzw.equal(localUri1, localUri2);
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Uri localUri = this.uri;
    arrayOfObject[0] = localUri;
    return zzw.hashCode(arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */