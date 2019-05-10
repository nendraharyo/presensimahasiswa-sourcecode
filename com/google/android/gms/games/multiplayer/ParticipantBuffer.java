package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class ParticipantBuffer
  extends AbstractDataBuffer
{
  public Participant get(int paramInt)
  {
    ParticipantRef localParticipantRef = new com/google/android/gms/games/multiplayer/ParticipantRef;
    DataHolder localDataHolder = this.zzahi;
    localParticipantRef.<init>(localDataHolder, paramInt);
    return localParticipantRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */