package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.appinvite.AppInviteInvitationResult;
import com.google.android.gms.common.api.Status;

public class zzkn
  implements AppInviteInvitationResult
{
  private final Status zzUX;
  private final Intent zzUY;
  
  public zzkn(Status paramStatus, Intent paramIntent)
  {
    this.zzUX = paramStatus;
    this.zzUY = paramIntent;
  }
  
  public Intent getInvitationIntent()
  {
    return this.zzUY;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */