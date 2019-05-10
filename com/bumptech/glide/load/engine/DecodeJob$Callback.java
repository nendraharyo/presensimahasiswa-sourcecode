package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

abstract interface DecodeJob$Callback
{
  public abstract void onLoadFailed(GlideException paramGlideException);
  
  public abstract void onResourceReady(Resource paramResource, DataSource paramDataSource);
  
  public abstract void reschedule(DecodeJob paramDecodeJob);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeJob$Callback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */