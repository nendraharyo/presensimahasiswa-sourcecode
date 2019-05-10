package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;
import org.json.JSONObject;

public class MediaTrack$Builder
{
  private final MediaTrack zzabD;
  
  public MediaTrack$Builder(long paramLong, int paramInt)
  {
    MediaTrack localMediaTrack = new com/google/android/gms/cast/MediaTrack;
    localMediaTrack.<init>(paramLong, paramInt);
    this.zzabD = localMediaTrack;
  }
  
  public MediaTrack build()
  {
    return this.zzabD;
  }
  
  public Builder setContentId(String paramString)
  {
    this.zzabD.setContentId(paramString);
    return this;
  }
  
  public Builder setContentType(String paramString)
  {
    this.zzabD.setContentType(paramString);
    return this;
  }
  
  public Builder setCustomData(JSONObject paramJSONObject)
  {
    this.zzabD.setCustomData(paramJSONObject);
    return this;
  }
  
  public Builder setLanguage(String paramString)
  {
    this.zzabD.setLanguage(paramString);
    return this;
  }
  
  public Builder setLanguage(Locale paramLocale)
  {
    MediaTrack localMediaTrack = this.zzabD;
    String str = zzf.zzb(paramLocale);
    localMediaTrack.setLanguage(str);
    return this;
  }
  
  public Builder setName(String paramString)
  {
    this.zzabD.setName(paramString);
    return this;
  }
  
  public Builder setSubtype(int paramInt)
  {
    this.zzabD.zzbe(paramInt);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaTrack$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */