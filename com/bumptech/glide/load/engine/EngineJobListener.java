package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;

abstract interface EngineJobListener
{
  public abstract void onEngineJobCancelled(EngineJob paramEngineJob, Key paramKey);
  
  public abstract void onEngineJobComplete(EngineJob paramEngineJob, Key paramKey, EngineResource paramEngineResource);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\EngineJobListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */