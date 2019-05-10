package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzi;

class TileOverlayOptions$1
  implements TileProvider
{
  private final zzi zzaTS;
  
  TileOverlayOptions$1(TileOverlayOptions paramTileOverlayOptions)
  {
    zzi localzzi = TileOverlayOptions.zza(this.zzaTT);
    this.zzaTS = localzzi;
  }
  
  public Tile getTile(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      localObject1 = this.zzaTS;
      localObject1 = ((zzi)localObject1).getTile(paramInt1, paramInt2, paramInt3);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (Tile)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\TileOverlayOptions$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */