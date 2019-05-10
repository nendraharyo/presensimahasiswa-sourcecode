package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class MediaInfo$Builder
{
  private final MediaInfo zzaaV;
  
  public MediaInfo$Builder(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Content ID cannot be empty");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/cast/MediaInfo;
    ((MediaInfo)localObject).<init>(paramString);
    this.zzaaV = ((MediaInfo)localObject);
  }
  
  public MediaInfo build()
  {
    this.zzaaV.zznN();
    return this.zzaaV;
  }
  
  public Builder setContentType(String paramString)
  {
    this.zzaaV.setContentType(paramString);
    return this;
  }
  
  public Builder setCustomData(JSONObject paramJSONObject)
  {
    this.zzaaV.setCustomData(paramJSONObject);
    return this;
  }
  
  public Builder setMediaTracks(List paramList)
  {
    this.zzaaV.zzu(paramList);
    return this;
  }
  
  public Builder setMetadata(MediaMetadata paramMediaMetadata)
  {
    this.zzaaV.zza(paramMediaMetadata);
    return this;
  }
  
  public Builder setStreamDuration(long paramLong)
  {
    this.zzaaV.zzx(paramLong);
    return this;
  }
  
  public Builder setStreamType(int paramInt)
  {
    this.zzaaV.setStreamType(paramInt);
    return this;
  }
  
  public Builder setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    this.zzaaV.setTextTrackStyle(paramTextTrackStyle);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaInfo$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */