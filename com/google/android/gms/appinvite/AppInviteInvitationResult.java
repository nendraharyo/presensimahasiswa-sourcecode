package com.google.android.gms.appinvite;

import android.content.Intent;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public abstract interface AppInviteInvitationResult
  extends Result
{
  public abstract Intent getInvitationIntent();
  
  public abstract Status getStatus();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appinvite\AppInviteInvitationResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */