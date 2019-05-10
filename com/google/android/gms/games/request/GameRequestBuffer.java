package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class GameRequestBuffer
  extends zzf
{
  public GameRequestBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected String zzqg()
  {
    return "external_request_id";
  }
  
  protected GameRequest zzu(int paramInt1, int paramInt2)
  {
    GameRequestRef localGameRequestRef = new com/google/android/gms/games/request/GameRequestRef;
    DataHolder localDataHolder = this.zzahi;
    localGameRequestRef.<init>(localDataHolder, paramInt1, paramInt2);
    return localGameRequestRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\request\GameRequestBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */