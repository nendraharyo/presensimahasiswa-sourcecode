package com.google.android.gms.nearby.messages;

public final class PublishOptions
{
  public static final PublishOptions DEFAULT;
  private final Strategy zzbbI;
  private final PublishCallback zzbbJ;
  
  static
  {
    PublishOptions.Builder localBuilder = new com/google/android/gms/nearby/messages/PublishOptions$Builder;
    localBuilder.<init>();
    DEFAULT = localBuilder.build();
  }
  
  private PublishOptions(Strategy paramStrategy, PublishCallback paramPublishCallback)
  {
    this.zzbbI = paramStrategy;
    this.zzbbJ = paramPublishCallback;
  }
  
  public PublishCallback getCallback()
  {
    return this.zzbbJ;
  }
  
  public Strategy getStrategy()
  {
    return this.zzbbI;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\PublishOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */