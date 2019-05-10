package com.bumptech.glide.request;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.Target;

public abstract interface RequestListener
{
  public abstract boolean onLoadFailed(GlideException paramGlideException, Object paramObject, Target paramTarget, boolean paramBoolean);
  
  public abstract boolean onResourceReady(Object paramObject1, Object paramObject2, Target paramTarget, DataSource paramDataSource, boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\RequestListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */