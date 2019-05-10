package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo
{
  public static final int STREAM_TYPE_BUFFERED = 1;
  public static final int STREAM_TYPE_INVALID = 255;
  public static final int STREAM_TYPE_LIVE = 2;
  public static final int STREAM_TYPE_NONE = 0;
  public static final long UNKNOWN_DURATION = 255L;
  private final String zzaaN;
  private int zzaaO;
  private String zzaaP;
  private MediaMetadata zzaaQ;
  private long zzaaR;
  private List zzaaS;
  private TextTrackStyle zzaaT;
  private JSONObject zzaaU;
  
  MediaInfo(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("content ID cannot be null or empty");
      throw localIllegalArgumentException;
    }
    this.zzaaN = paramString;
    this.zzaaO = -1;
    this.zzaaR = -1;
  }
  
  MediaInfo(JSONObject paramJSONObject)
  {
    Object localObject2 = paramJSONObject.getString("contentId");
    this.zzaaN = ((String)localObject2);
    localObject2 = paramJSONObject.getString("streamType");
    Object localObject3 = "NONE";
    boolean bool2 = ((String)localObject3).equals(localObject2);
    if (bool2) {
      this.zzaaO = 0;
    }
    for (;;)
    {
      localObject2 = paramJSONObject.getString("contentType");
      this.zzaaP = ((String)localObject2);
      localObject2 = "metadata";
      int k = paramJSONObject.has((String)localObject2);
      int j;
      Object localObject4;
      if (k != 0)
      {
        localObject2 = paramJSONObject.getJSONObject("metadata");
        j = ((JSONObject)localObject2).getInt("metadataType");
        localObject4 = new com/google/android/gms/cast/MediaMetadata;
        ((MediaMetadata)localObject4).<init>(j);
        this.zzaaQ = ((MediaMetadata)localObject4);
        localObject3 = this.zzaaQ;
        ((MediaMetadata)localObject3).zzg((JSONObject)localObject2);
      }
      long l = -1;
      double d = 0.0D / 0.0D;
      this.zzaaR = l;
      localObject2 = "duration";
      k = paramJSONObject.has((String)localObject2);
      if (k != 0)
      {
        localObject2 = "duration";
        k = paramJSONObject.isNull((String)localObject2);
        if (k == 0)
        {
          localObject2 = "duration";
          l = 0L;
          d = paramJSONObject.optDouble((String)localObject2, 0.0D);
          k = Double.isNaN(d);
          if (k == 0)
          {
            k = Double.isInfinite(d);
            if (k == 0)
            {
              l = zzf.zzg(d);
              this.zzaaR = l;
            }
          }
        }
      }
      localObject2 = "tracks";
      k = paramJSONObject.has((String)localObject2);
      if (k == 0) {
        break;
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      this.zzaaS = ((List)localObject2);
      localObject2 = paramJSONObject.getJSONArray("tracks");
      for (;;)
      {
        j = ((JSONArray)localObject2).length();
        if (i >= j) {
          break;
        }
        localObject3 = ((JSONArray)localObject2).getJSONObject(i);
        localObject4 = new com/google/android/gms/cast/MediaTrack;
        ((MediaTrack)localObject4).<init>((JSONObject)localObject3);
        localObject3 = this.zzaaS;
        ((List)localObject3).add(localObject4);
        i += 1;
      }
      localObject3 = "BUFFERED";
      boolean bool3 = ((String)localObject3).equals(localObject2);
      if (bool3)
      {
        k = 1;
        this.zzaaO = k;
      }
      else
      {
        localObject3 = "LIVE";
        k = ((String)localObject3).equals(localObject2);
        int m;
        if (k != 0)
        {
          m = 2;
          this.zzaaO = m;
        }
        else
        {
          m = -1;
          this.zzaaO = m;
        }
      }
    }
    this.zzaaS = null;
    localObject1 = "textTrackStyle";
    boolean bool1 = paramJSONObject.has((String)localObject1);
    if (bool1)
    {
      localObject1 = paramJSONObject.getJSONObject("textTrackStyle");
      localObject2 = new com/google/android/gms/cast/TextTrackStyle;
      ((TextTrackStyle)localObject2).<init>();
      ((TextTrackStyle)localObject2).zzg((JSONObject)localObject1);
    }
    for (this.zzaaT = ((TextTrackStyle)localObject2);; this.zzaaT = null)
    {
      localObject1 = paramJSONObject.optJSONObject("customData");
      this.zzaaU = ((JSONObject)localObject1);
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (this == paramObject) {
      bool2 = bool1;
    }
    label43:
    label57:
    do
    {
      do
      {
        return bool2;
        bool3 = paramObject instanceof MediaInfo;
      } while (!bool3);
      paramObject = (MediaInfo)paramObject;
      localObject1 = this.zzaaU;
      if (localObject1 != null) {
        break label238;
      }
      bool3 = bool1;
      localObject2 = ((MediaInfo)paramObject).zzaaU;
      if (localObject2 != null) {
        break label247;
      }
      boolean bool5 = bool1;
      if (bool3 != bool5) {
        break label254;
      }
      localObject1 = this.zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = ((MediaInfo)paramObject).zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.zzaaU;
      localObject2 = ((MediaInfo)paramObject).zzaaU;
      bool3 = zznb.zze(localObject1, localObject2);
    } while (!bool3);
    Object localObject1 = this.zzaaN;
    Object localObject2 = ((MediaInfo)paramObject).zzaaN;
    boolean bool3 = zzf.zza(localObject1, localObject2);
    int j;
    boolean bool4;
    if (bool3)
    {
      int i = this.zzaaO;
      j = ((MediaInfo)paramObject).zzaaO;
      if (i == j)
      {
        localObject1 = this.zzaaP;
        localObject2 = ((MediaInfo)paramObject).zzaaP;
        bool4 = zzf.zza(localObject1, localObject2);
        if (bool4)
        {
          localObject1 = this.zzaaQ;
          localObject2 = ((MediaInfo)paramObject).zzaaQ;
          bool4 = zzf.zza(localObject1, localObject2);
          if (bool4)
          {
            long l1 = this.zzaaR;
            long l2 = ((MediaInfo)paramObject).zzaaR;
            bool4 = l1 < l2;
            if (bool4) {}
          }
        }
      }
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      label238:
      bool4 = false;
      localObject1 = null;
      break label43;
      label247:
      j = 0;
      localObject2 = null;
      break label57;
      label254:
      break;
      bool1 = false;
    }
  }
  
  public String getContentId()
  {
    return this.zzaaN;
  }
  
  public String getContentType()
  {
    return this.zzaaP;
  }
  
  public JSONObject getCustomData()
  {
    return this.zzaaU;
  }
  
  public List getMediaTracks()
  {
    return this.zzaaS;
  }
  
  public MediaMetadata getMetadata()
  {
    return this.zzaaQ;
  }
  
  public long getStreamDuration()
  {
    return this.zzaaR;
  }
  
  public int getStreamType()
  {
    return this.zzaaO;
  }
  
  public TextTrackStyle getTextTrackStyle()
  {
    return this.zzaaT;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    Object localObject = this.zzaaN;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzaaO);
    arrayOfObject[1] = localObject;
    localObject = this.zzaaP;
    arrayOfObject[2] = localObject;
    localObject = this.zzaaQ;
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(this.zzaaR);
    arrayOfObject[4] = localObject;
    localObject = String.valueOf(this.zzaaU);
    arrayOfObject[5] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  void setContentType(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("content type cannot be null or empty");
      throw localIllegalArgumentException;
    }
    this.zzaaP = paramString;
  }
  
  void setCustomData(JSONObject paramJSONObject)
  {
    this.zzaaU = paramJSONObject;
  }
  
  void setStreamType(int paramInt)
  {
    int i = -1;
    if (paramInt >= i)
    {
      i = 2;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid stream type");
      throw localIllegalArgumentException;
    }
    this.zzaaO = paramInt;
  }
  
  public void setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    this.zzaaT = paramTextTrackStyle;
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "contentId";
    Object localObject3;
    long l1;
    try
    {
      localObject3 = this.zzaaN;
      localJSONObject.put((String)localObject1, localObject3);
      int i = this.zzaaO;
      switch (i)
      {
      default: 
        localObject1 = "NONE";
        localObject3 = "streamType";
        localJSONObject.put((String)localObject3, localObject1);
        localObject1 = this.zzaaP;
        if (localObject1 != null)
        {
          localObject1 = "contentType";
          localObject3 = this.zzaaP;
          localJSONObject.put((String)localObject1, localObject3);
        }
        localObject1 = this.zzaaQ;
        if (localObject1 != null)
        {
          localObject1 = "metadata";
          localObject3 = this.zzaaQ;
          localObject3 = ((MediaMetadata)localObject3).toJson();
          localJSONObject.put((String)localObject1, localObject3);
        }
        l1 = this.zzaaR;
        long l2 = -1;
        boolean bool = l1 < l2;
        if (!bool)
        {
          localObject1 = "duration";
          localObject3 = JSONObject.NULL;
          localJSONObject.put((String)localObject1, localObject3);
          label154:
          localObject1 = this.zzaaS;
          if (localObject1 == null) {
            break label277;
          }
          localObject3 = new org/json/JSONArray;
          ((JSONArray)localObject3).<init>();
          localObject1 = this.zzaaS;
          Iterator localIterator = ((List)localObject1).iterator();
          for (;;)
          {
            bool = localIterator.hasNext();
            if (!bool) {
              break;
            }
            localObject1 = localIterator.next();
            localObject1 = (MediaTrack)localObject1;
            localObject1 = ((MediaTrack)localObject1).toJson();
            ((JSONArray)localObject3).put(localObject1);
          }
          return localJSONObject;
        }
        break;
      }
    }
    catch (JSONException localJSONException) {}
    for (;;)
    {
      Object localObject2 = "BUFFERED";
      break;
      localObject2 = "LIVE";
      break;
      localObject2 = "duration";
      l1 = this.zzaaR;
      double d = zzf.zzA(l1);
      localJSONObject.put((String)localObject2, d);
      break label154;
      localObject2 = "tracks";
      localJSONObject.put((String)localObject2, localObject3);
      label277:
      localObject2 = this.zzaaT;
      if (localObject2 != null)
      {
        localObject2 = "textTrackStyle";
        localObject3 = this.zzaaT;
        localObject3 = ((TextTrackStyle)localObject3).toJson();
        localJSONObject.put((String)localObject2, localObject3);
      }
      localObject2 = this.zzaaU;
      if (localObject2 != null)
      {
        localObject2 = "customData";
        localObject3 = this.zzaaU;
        localJSONObject.put((String)localObject2, localObject3);
      }
    }
  }
  
  void zza(MediaMetadata paramMediaMetadata)
  {
    this.zzaaQ = paramMediaMetadata;
  }
  
  void zznN()
  {
    Object localObject = this.zzaaN;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("content ID cannot be null or empty");
      throw ((Throwable)localObject);
    }
    localObject = this.zzaaP;
    bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("content type cannot be null or empty");
      throw ((Throwable)localObject);
    }
    int i = this.zzaaO;
    int j = -1;
    if (i == j)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("a valid stream type must be specified");
      throw ((Throwable)localObject);
    }
  }
  
  void zzu(List paramList)
  {
    this.zzaaS = paramList;
  }
  
  void zzx(long paramLong)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool)
    {
      l = -1;
      bool = paramLong < l;
      if (bool)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("Invalid stream duration");
        throw localIllegalArgumentException;
      }
    }
    this.zzaaR = paramLong;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */