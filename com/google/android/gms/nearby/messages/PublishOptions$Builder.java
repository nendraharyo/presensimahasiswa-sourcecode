package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;

public class PublishOptions$Builder
{
  private Strategy zzbbI;
  private PublishCallback zzbbJ;
  
  public PublishOptions$Builder()
  {
    Strategy localStrategy = Strategy.DEFAULT;
    this.zzbbI = localStrategy;
  }
  
  public PublishOptions build()
  {
    PublishOptions localPublishOptions = new com/google/android/gms/nearby/messages/PublishOptions;
    Strategy localStrategy = this.zzbbI;
    PublishCallback localPublishCallback = this.zzbbJ;
    localPublishOptions.<init>(localStrategy, localPublishCallback, null);
    return localPublishOptions;
  }
  
  public Builder setCallback(PublishCallback paramPublishCallback)
  {
    PublishCallback localPublishCallback = (PublishCallback)zzx.zzz(paramPublishCallback);
    this.zzbbJ = localPublishCallback;
    return this;
  }
  
  public Builder setStrategy(Strategy paramStrategy)
  {
    Strategy localStrategy = (Strategy)zzx.zzz(paramStrategy);
    this.zzbbI = localStrategy;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\PublishOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */