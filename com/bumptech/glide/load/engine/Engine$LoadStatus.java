package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;

public class Engine$LoadStatus
{
  private final ResourceCallback cb;
  private final EngineJob engineJob;
  
  Engine$LoadStatus(ResourceCallback paramResourceCallback, EngineJob paramEngineJob)
  {
    this.cb = paramResourceCallback;
    this.engineJob = paramEngineJob;
  }
  
  public void cancel()
  {
    EngineJob localEngineJob = this.engineJob;
    ResourceCallback localResourceCallback = this.cb;
    localEngineJob.removeCallback(localResourceCallback);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Engine$LoadStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */