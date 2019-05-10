package com.google.android.gms.nearby.messages;

public final class SubscribeOptions
{
  public static final SubscribeOptions DEFAULT;
  private final Strategy zzbbI;
  private final MessageFilter zzbbV;
  private final SubscribeCallback zzbbW;
  
  static
  {
    SubscribeOptions.Builder localBuilder = new com/google/android/gms/nearby/messages/SubscribeOptions$Builder;
    localBuilder.<init>();
    DEFAULT = localBuilder.build();
  }
  
  private SubscribeOptions(Strategy paramStrategy, MessageFilter paramMessageFilter, SubscribeCallback paramSubscribeCallback)
  {
    this.zzbbI = paramStrategy;
    this.zzbbV = paramMessageFilter;
    this.zzbbW = paramSubscribeCallback;
  }
  
  public SubscribeCallback getCallback()
  {
    return this.zzbbW;
  }
  
  public MessageFilter getFilter()
  {
    return this.zzbbV;
  }
  
  public Strategy getStrategy()
  {
    return this.zzbbI;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\SubscribeOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */