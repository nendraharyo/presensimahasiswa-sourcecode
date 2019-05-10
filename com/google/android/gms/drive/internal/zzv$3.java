package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

class zzv$3
  implements ResultCallback
{
  zzv$3(zzv paramzzv) {}
  
  public void zzp(Status paramStatus)
  {
    boolean bool = paramStatus.isSuccess();
    String str1;
    String str2;
    if (!bool)
    {
      str1 = "DriveContentsImpl";
      str2 = "Error discarding contents";
      zzz.zzA(str1, str2);
    }
    for (;;)
    {
      return;
      str1 = "DriveContentsImpl";
      str2 = "Contents discarded";
      zzz.zzy(str1, str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzv$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */