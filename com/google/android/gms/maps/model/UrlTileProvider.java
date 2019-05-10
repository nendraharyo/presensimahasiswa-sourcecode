package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public abstract class UrlTileProvider
  implements TileProvider
{
  private final int zzoG;
  private final int zzoH;
  
  public UrlTileProvider(int paramInt1, int paramInt2)
  {
    this.zzoG = paramInt1;
    this.zzoH = paramInt2;
  }
  
  private static long zza(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int i = 4096;
    byte[] arrayOfByte = new byte[i];
    long l2;
    for (long l1 = 0L;; l1 += l2)
    {
      int j = paramInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        return l1;
      }
      k = 0;
      paramOutputStream.write(arrayOfByte, 0, j);
      l2 = j;
    }
  }
  
  private static byte[] zzl(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    zza(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public final Tile getTile(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = getTileUrl(paramInt1, paramInt2, paramInt3);
    Tile localTile;
    if (localObject1 == null) {
      localTile = NO_TILE;
    }
    for (;;)
    {
      return localTile;
      try
      {
        localTile = new com/google/android/gms/maps/model/Tile;
        int i = this.zzoG;
        int j = this.zzoH;
        localObject1 = ((URL)localObject1).openStream();
        localObject1 = zzl((InputStream)localObject1);
        localTile.<init>(i, j, (byte[])localObject1);
      }
      catch (IOException localIOException)
      {
        Object localObject2 = null;
      }
    }
  }
  
  public abstract URL getTileUrl(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\UrlTileProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */