package com.google.android.gms.cast;

import org.json.JSONObject;

public class MediaQueueItem$Builder
{
  private final MediaQueueItem zzabk;
  
  public MediaQueueItem$Builder(MediaInfo paramMediaInfo)
  {
    MediaQueueItem localMediaQueueItem = new com/google/android/gms/cast/MediaQueueItem;
    localMediaQueueItem.<init>(paramMediaInfo, null);
    this.zzabk = localMediaQueueItem;
  }
  
  public MediaQueueItem$Builder(MediaQueueItem paramMediaQueueItem)
  {
    MediaQueueItem localMediaQueueItem = new com/google/android/gms/cast/MediaQueueItem;
    localMediaQueueItem.<init>(paramMediaQueueItem, null);
    this.zzabk = localMediaQueueItem;
  }
  
  public MediaQueueItem$Builder(JSONObject paramJSONObject)
  {
    MediaQueueItem localMediaQueueItem = new com/google/android/gms/cast/MediaQueueItem;
    localMediaQueueItem.<init>(paramJSONObject);
    this.zzabk = localMediaQueueItem;
  }
  
  public MediaQueueItem build()
  {
    this.zzabk.zznN();
    return this.zzabk;
  }
  
  public Builder clearItemId()
  {
    this.zzabk.zzba(0);
    return this;
  }
  
  public Builder setActiveTrackIds(long[] paramArrayOfLong)
  {
    this.zzabk.zza(paramArrayOfLong);
    return this;
  }
  
  public Builder setAutoplay(boolean paramBoolean)
  {
    this.zzabk.zzV(paramBoolean);
    return this;
  }
  
  public Builder setCustomData(JSONObject paramJSONObject)
  {
    this.zzabk.setCustomData(paramJSONObject);
    return this;
  }
  
  public Builder setPlaybackDuration(double paramDouble)
  {
    this.zzabk.zzd(paramDouble);
    return this;
  }
  
  public Builder setPreloadTime(double paramDouble)
  {
    this.zzabk.zze(paramDouble);
    return this;
  }
  
  public Builder setStartTime(double paramDouble)
  {
    this.zzabk.zzc(paramDouble);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaQueueItem$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */