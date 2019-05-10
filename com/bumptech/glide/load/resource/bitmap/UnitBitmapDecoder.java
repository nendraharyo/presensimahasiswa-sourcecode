package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

public final class UnitBitmapDecoder
  implements ResourceDecoder
{
  public Resource decode(Bitmap paramBitmap, int paramInt1, int paramInt2, Options paramOptions)
  {
    UnitBitmapDecoder.NonOwnedBitmapResource localNonOwnedBitmapResource = new com/bumptech/glide/load/resource/bitmap/UnitBitmapDecoder$NonOwnedBitmapResource;
    localNonOwnedBitmapResource.<init>(paramBitmap);
    return localNonOwnedBitmapResource;
  }
  
  public boolean handles(Bitmap paramBitmap, Options paramOptions)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\UnitBitmapDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */