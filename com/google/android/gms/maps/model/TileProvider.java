package com.google.android.gms.maps.model;

public abstract interface TileProvider
{
  public static final Tile NO_TILE;
  
  static
  {
    int i = -1;
    Tile localTile = new com/google/android/gms/maps/model/Tile;
    localTile.<init>(i, i, null);
    NO_TILE = localTile;
  }
  
  public abstract Tile getTile(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\TileProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */