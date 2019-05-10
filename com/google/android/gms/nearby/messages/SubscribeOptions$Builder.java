package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;

public class SubscribeOptions$Builder
{
  private Strategy zzbbI;
  private MessageFilter zzbbV;
  private SubscribeCallback zzbbW;
  
  public SubscribeOptions$Builder()
  {
    Object localObject = Strategy.DEFAULT;
    this.zzbbI = ((Strategy)localObject);
    localObject = MessageFilter.INCLUDE_ALL_MY_TYPES;
    this.zzbbV = ((MessageFilter)localObject);
  }
  
  public SubscribeOptions build()
  {
    SubscribeOptions localSubscribeOptions = new com/google/android/gms/nearby/messages/SubscribeOptions;
    Strategy localStrategy = this.zzbbI;
    MessageFilter localMessageFilter = this.zzbbV;
    SubscribeCallback localSubscribeCallback = this.zzbbW;
    localSubscribeOptions.<init>(localStrategy, localMessageFilter, localSubscribeCallback, null);
    return localSubscribeOptions;
  }
  
  public Builder setCallback(SubscribeCallback paramSubscribeCallback)
  {
    SubscribeCallback localSubscribeCallback = (SubscribeCallback)zzx.zzz(paramSubscribeCallback);
    this.zzbbW = localSubscribeCallback;
    return this;
  }
  
  public Builder setFilter(MessageFilter paramMessageFilter)
  {
    this.zzbbV = paramMessageFilter;
    return this;
  }
  
  public Builder setStrategy(Strategy paramStrategy)
  {
    this.zzbbI = paramStrategy;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\SubscribeOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */