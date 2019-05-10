package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;

public abstract interface Transformation
  extends Key
{
  public abstract Resource transform(Context paramContext, Resource paramResource, int paramInt1, int paramInt2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\Transformation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */