package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;

final class zzc$1
  implements zzc.zzb
{
  zzc$1(Context paramContext) {}
  
  public boolean zza(VersionInfoParcel paramVersionInfoParcel)
  {
    boolean bool = paramVersionInfoParcel.zzNb;
    Object localObject;
    if (!bool)
    {
      localObject = this.zzxh;
      bool = zze.zzap((Context)localObject);
      if (bool)
      {
        localObject = (Boolean)zzbt.zzwb.get();
        bool = ((Boolean)localObject).booleanValue();
        if (bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */