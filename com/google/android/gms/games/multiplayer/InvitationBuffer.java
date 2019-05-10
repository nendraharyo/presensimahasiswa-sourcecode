package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class InvitationBuffer
  extends zzf
{
  public InvitationBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected Invitation zzq(int paramInt1, int paramInt2)
  {
    InvitationRef localInvitationRef = new com/google/android/gms/games/multiplayer/InvitationRef;
    DataHolder localDataHolder = this.zzahi;
    localInvitationRef.<init>(localDataHolder, paramInt1, paramInt2);
    return localInvitationRef;
  }
  
  protected String zzqg()
  {
    return "external_invitation_id";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\InvitationBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */