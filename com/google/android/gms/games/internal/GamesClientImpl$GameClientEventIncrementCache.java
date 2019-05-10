package com.google.android.gms.games.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.games.internal.events.EventIncrementCache;

class GamesClientImpl$GameClientEventIncrementCache
  extends EventIncrementCache
{
  public GamesClientImpl$GameClientEventIncrementCache(GamesClientImpl paramGamesClientImpl)
  {
    super(localLooper, 1000);
  }
  
  protected void zzs(String paramString, int paramInt)
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzaEi;
        boolean bool = ((GamesClientImpl)localObject1).isConnected();
        if (bool)
        {
          localObject1 = this.zzaEi;
          localObject1 = ((GamesClientImpl)localObject1).zzqJ();
          localObject1 = (IGamesService)localObject1;
          ((IGamesService)localObject1).zzp(paramString, paramInt);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        String str;
        Object localObject2 = this.zzaEi;
        GamesClientImpl.zza((GamesClientImpl)localObject2, localRemoteException);
        continue;
      }
      localObject1 = "GamesClientImpl";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Unable to increment event ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = " by ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).append(paramInt);
      str = " because the games client is no longer connected";
      localObject2 = ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      GamesLog.zzA((String)localObject1, (String)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GameClientEventIncrementCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */