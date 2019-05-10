package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

class CastRemoteDisplayLocalService$7
  implements CastRemoteDisplay.CastRemoteDisplaySessionCallbacks
{
  CastRemoteDisplayLocalService$7(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onRemoteDisplayEnded(Status paramStatus)
  {
    zzl localzzl = CastRemoteDisplayLocalService.zznI();
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramStatus.getStatusCode());
    arrayOfObject[0] = localInteger;
    String str = String.format("Cast screen has ended: %d", arrayOfObject);
    arrayOfObject = new Object[0];
    localzzl.zzb(str, arrayOfObject);
    CastRemoteDisplayLocalService.zzU(false);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */