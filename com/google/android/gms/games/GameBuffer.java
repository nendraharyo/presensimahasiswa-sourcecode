package com.google.android.gms.games;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameBuffer
  extends AbstractDataBuffer
{
  public GameBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public Game get(int paramInt)
  {
    GameRef localGameRef = new com/google/android/gms/games/GameRef;
    DataHolder localDataHolder = this.zzahi;
    localGameRef.<init>(localDataHolder, paramInt);
    return localGameRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\GameBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */