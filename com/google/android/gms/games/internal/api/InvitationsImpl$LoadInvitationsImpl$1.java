package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;

class InvitationsImpl$LoadInvitationsImpl$1
  implements Invitations.LoadInvitationsResult
{
  InvitationsImpl$LoadInvitationsImpl$1(InvitationsImpl.LoadInvitationsImpl paramLoadInvitationsImpl, Status paramStatus) {}
  
  public InvitationBuffer getInvitations()
  {
    InvitationBuffer localInvitationBuffer = new com/google/android/gms/games/multiplayer/InvitationBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localInvitationBuffer.<init>(localDataHolder);
    return localInvitationBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\InvitationsImpl$LoadInvitationsImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */