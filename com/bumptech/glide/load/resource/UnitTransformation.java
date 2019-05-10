package com.bumptech.glide.load.resource;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

public final class UnitTransformation
  implements Transformation
{
  private static final Transformation TRANSFORMATION;
  
  static
  {
    UnitTransformation localUnitTransformation = new com/bumptech/glide/load/resource/UnitTransformation;
    localUnitTransformation.<init>();
    TRANSFORMATION = localUnitTransformation;
  }
  
  public static UnitTransformation get()
  {
    return (UnitTransformation)TRANSFORMATION;
  }
  
  public Resource transform(Context paramContext, Resource paramResource, int paramInt1, int paramInt2)
  {
    return paramResource;
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\UnitTransformation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */