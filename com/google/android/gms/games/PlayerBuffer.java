package com.google.android.gms.games;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class PlayerBuffer
  extends AbstractDataBuffer
{
  public PlayerBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public Player get(int paramInt)
  {
    PlayerRef localPlayerRef = new com/google/android/gms/games/PlayerRef;
    DataHolder localDataHolder = this.zzahi;
    localPlayerRef.<init>(localDataHolder, paramInt);
    return localPlayerRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */