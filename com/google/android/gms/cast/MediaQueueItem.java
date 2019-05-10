package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaQueueItem
{
  public static final double DEFAULT_PLAYBACK_DURATION = Double.POSITIVE_INFINITY;
  public static final int INVALID_ITEM_ID;
  private JSONObject zzaaU;
  private MediaInfo zzabd;
  private int zzabe;
  private boolean zzabf;
  private double zzabg;
  private double zzabh;
  private double zzabi;
  private long[] zzabj;
  
  private MediaQueueItem(MediaInfo paramMediaInfo)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    this.zzabe = 0;
    boolean bool = true;
    this.zzabf = bool;
    double d = 1.0D / 0.0D;
    this.zzabh = d;
    if (paramMediaInfo == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("media cannot be null.");
      throw localIllegalArgumentException;
    }
    this.zzabd = paramMediaInfo;
  }
  
  private MediaQueueItem(MediaQueueItem paramMediaQueueItem)
  {
    this.zzabe = 0;
    int i = 1;
    this.zzabf = i;
    double d = 1.0D / 0.0D;
    this.zzabh = d;
    Object localObject = paramMediaQueueItem.getMedia();
    this.zzabd = ((MediaInfo)localObject);
    localObject = this.zzabd;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("media cannot be null.");
      throw ((Throwable)localObject);
    }
    i = paramMediaQueueItem.getItemId();
    this.zzabe = i;
    boolean bool = paramMediaQueueItem.getAutoplay();
    this.zzabf = bool;
    d = paramMediaQueueItem.getStartTime();
    this.zzabg = d;
    d = paramMediaQueueItem.getPlaybackDuration();
    this.zzabh = d;
    d = paramMediaQueueItem.getPreloadTime();
    this.zzabi = d;
    localObject = paramMediaQueueItem.getActiveTrackIds();
    this.zzabj = ((long[])localObject);
    localObject = paramMediaQueueItem.getCustomData();
    this.zzaaU = ((JSONObject)localObject);
  }
  
  MediaQueueItem(JSONObject paramJSONObject)
  {
    this.zzabe = 0;
    this.zzabf = true;
    this.zzabh = (1.0D / 0.0D);
    zzh(paramJSONObject);
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
        bool3 = paramObject instanceof MediaQueueItem;
      } while (!bool3);
      paramObject = (MediaQueueItem)paramObject;
      localObject1 = this.zzaaU;
      if (localObject1 != null) {
        break label279;
      }
      bool3 = bool1;
      localObject2 = ((MediaQueueItem)paramObject).zzaaU;
      if (localObject2 != null) {
        break label288;
      }
      boolean bool5 = bool1;
      if (bool3 != bool5) {
        break label295;
      }
      localObject1 = this.zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = ((MediaQueueItem)paramObject).zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.zzaaU;
      localObject2 = ((MediaQueueItem)paramObject).zzaaU;
      bool3 = zznb.zze(localObject1, localObject2);
    } while (!bool3);
    Object localObject1 = this.zzabd;
    Object localObject2 = ((MediaQueueItem)paramObject).zzabd;
    boolean bool3 = zzf.zza(localObject1, localObject2);
    boolean bool4;
    boolean bool6;
    if (bool3)
    {
      int i = this.zzabe;
      int j = ((MediaQueueItem)paramObject).zzabe;
      if (i == j)
      {
        bool4 = this.zzabf;
        bool6 = ((MediaQueueItem)paramObject).zzabf;
        if (bool4 == bool6)
        {
          double d1 = this.zzabg;
          double d2 = ((MediaQueueItem)paramObject).zzabg;
          bool4 = d1 < d2;
          if (!bool4)
          {
            d1 = this.zzabh;
            d2 = ((MediaQueueItem)paramObject).zzabh;
            bool4 = d1 < d2;
            if (!bool4)
            {
              d1 = this.zzabi;
              d2 = ((MediaQueueItem)paramObject).zzabi;
              bool4 = d1 < d2;
              if (!bool4)
              {
                localObject1 = this.zzabj;
                localObject2 = ((MediaQueueItem)paramObject).zzabj;
                bool4 = zzf.zza(localObject1, localObject2);
                if (!bool4) {}
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      label279:
      bool4 = false;
      localObject1 = null;
      break label43;
      label288:
      bool6 = false;
      localObject2 = null;
      break label57;
      label295:
      break;
      bool1 = false;
    }
  }
  
  public long[] getActiveTrackIds()
  {
    return this.zzabj;
  }
  
  public boolean getAutoplay()
  {
    return this.zzabf;
  }
  
  public JSONObject getCustomData()
  {
    return this.zzaaU;
  }
  
  public int getItemId()
  {
    return this.zzabe;
  }
  
  public MediaInfo getMedia()
  {
    return this.zzabd;
  }
  
  public double getPlaybackDuration()
  {
    return this.zzabh;
  }
  
  public double getPreloadTime()
  {
    return this.zzabi;
  }
  
  public double getStartTime()
  {
    return this.zzabg;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    Object localObject = this.zzabd;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzabe);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzabf);
    arrayOfObject[2] = localObject;
    localObject = Double.valueOf(this.zzabg);
    arrayOfObject[3] = localObject;
    localObject = Double.valueOf(this.zzabh);
    arrayOfObject[4] = localObject;
    localObject = Double.valueOf(this.zzabi);
    arrayOfObject[5] = localObject;
    localObject = this.zzabj;
    arrayOfObject[6] = localObject;
    localObject = String.valueOf(this.zzaaU);
    arrayOfObject[7] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  void setCustomData(JSONObject paramJSONObject)
  {
    this.zzaaU = paramJSONObject;
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "media";
    try
    {
      Object localObject2 = this.zzabd;
      localObject2 = ((MediaInfo)localObject2).toJson();
      localJSONObject.put((String)localObject1, localObject2);
      int i = this.zzabe;
      if (i != 0)
      {
        localObject1 = "itemId";
        int m = this.zzabe;
        localJSONObject.put((String)localObject1, m);
      }
      localObject1 = "autoplay";
      boolean bool = this.zzabf;
      localJSONObject.put((String)localObject1, bool);
      localObject1 = "startTime";
      double d1 = this.zzabg;
      localJSONObject.put((String)localObject1, d1);
      d1 = this.zzabh;
      double d2 = 1.0D / 0.0D;
      int j = d1 < d2;
      if (j != 0)
      {
        localObject1 = "playbackDuration";
        d1 = this.zzabh;
        localJSONObject.put((String)localObject1, d1);
      }
      localObject1 = "preloadTime";
      d1 = this.zzabi;
      localJSONObject.put((String)localObject1, d1);
      localObject1 = this.zzabj;
      if (localObject1 != null)
      {
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>();
        long[] arrayOfLong = this.zzabj;
        int n = arrayOfLong.length;
        j = 0;
        localObject1 = null;
        while (j < n)
        {
          long l = arrayOfLong[j];
          ((JSONArray)localObject2).put(l);
          int k;
          j += 1;
        }
        localObject1 = "activeTrackIds";
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzaaU;
      if (localObject1 != null)
      {
        localObject1 = "customData";
        localObject2 = this.zzaaU;
        localJSONObject.put((String)localObject1, localObject2);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return localJSONObject;
  }
  
  void zzV(boolean paramBoolean)
  {
    this.zzabf = paramBoolean;
  }
  
  void zza(long[] paramArrayOfLong)
  {
    this.zzabj = paramArrayOfLong;
  }
  
  void zzba(int paramInt)
  {
    this.zzabe = paramInt;
  }
  
  void zzc(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      double d = 0.0D;
      bool = paramDouble < d;
      if (!bool) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("startTime cannot be negative or NaN.");
      throw localIllegalArgumentException;
    }
    this.zzabg = paramDouble;
  }
  
  void zzd(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("playbackDuration cannot be NaN.");
      throw localIllegalArgumentException;
    }
    this.zzabh = paramDouble;
  }
  
  void zze(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      double d = 0.0D;
      bool = paramDouble < d;
      if (!bool) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("preloadTime cannot be negative or NaN.");
      throw localIllegalArgumentException;
    }
    this.zzabi = paramDouble;
  }
  
  public boolean zzh(JSONObject paramJSONObject)
  {
    long l1 = 4502148214488346440L;
    double d1 = 1.0E-7D;
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    float f1 = Float.MIN_VALUE;
    Object localObject2 = "media";
    boolean bool3 = paramJSONObject.has((String)localObject2);
    Object localObject3;
    if (bool3)
    {
      localObject2 = new com/google/android/gms/cast/MediaInfo;
      localObject3 = paramJSONObject.getJSONObject("media");
      ((MediaInfo)localObject2).<init>((JSONObject)localObject3);
      this.zzabd = ((MediaInfo)localObject2);
      bool3 = bool2;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      localObject3 = "itemId";
      boolean bool4 = paramJSONObject.has((String)localObject3);
      if (bool4)
      {
        localObject3 = "itemId";
        int i = paramJSONObject.getInt((String)localObject3);
        int j = this.zzabe;
        if (j != i)
        {
          this.zzabe = i;
          bool3 = bool2;
          f2 = f1;
        }
      }
      localObject3 = "autoplay";
      boolean bool5 = paramJSONObject.has((String)localObject3);
      if (bool5)
      {
        localObject3 = "autoplay";
        bool5 = paramJSONObject.getBoolean((String)localObject3);
        k = this.zzabf;
        if (k != bool5)
        {
          this.zzabf = bool5;
          bool3 = bool2;
          f2 = f1;
        }
      }
      localObject3 = "startTime";
      bool5 = paramJSONObject.has((String)localObject3);
      double d2;
      double d3;
      if (bool5)
      {
        localObject3 = "startTime";
        d2 = paramJSONObject.getDouble((String)localObject3);
        d3 = this.zzabg;
        d3 = Math.abs(d2 - d3);
        bool5 = d3 < d1;
        if (bool5)
        {
          this.zzabg = d2;
          bool3 = bool2;
          f2 = f1;
        }
      }
      localObject3 = "playbackDuration";
      bool5 = paramJSONObject.has((String)localObject3);
      if (bool5)
      {
        localObject3 = "playbackDuration";
        d2 = paramJSONObject.getDouble((String)localObject3);
        d3 = this.zzabh;
        d3 = Math.abs(d2 - d3);
        bool5 = d3 < d1;
        if (bool5)
        {
          this.zzabh = d2;
          bool3 = bool2;
          f2 = f1;
        }
      }
      localObject3 = "preloadTime";
      bool5 = paramJSONObject.has((String)localObject3);
      if (bool5)
      {
        localObject3 = "preloadTime";
        d2 = paramJSONObject.getDouble((String)localObject3);
        d3 = this.zzabi;
        d3 = Math.abs(d2 - d3);
        bool5 = d3 < d1;
        if (bool5)
        {
          this.zzabi = d2;
          bool3 = bool2;
          f2 = f1;
        }
      }
      bool5 = false;
      localObject3 = null;
      Object localObject4 = "activeTrackIds";
      int k = paramJSONObject.has((String)localObject4);
      Object localObject5;
      int n;
      int m;
      if (k != 0)
      {
        localObject5 = paramJSONObject.getJSONArray("activeTrackIds");
        n = ((JSONArray)localObject5).length();
        localObject3 = new long[n];
        k = 0;
        localObject4 = null;
        while (k < n)
        {
          l1 = ((JSONArray)localObject5).getLong(k);
          localObject3[k] = l1;
          k += 1;
        }
        localObject4 = this.zzabj;
        if (localObject4 == null)
        {
          localObject1 = localObject3;
          bool5 = bool2;
        }
      }
      for (;;)
      {
        if (bool5)
        {
          this.zzabj = ((long[])localObject1);
          bool3 = bool2;
          f2 = f1;
        }
        localObject1 = "customData";
        bool1 = paramJSONObject.has((String)localObject1);
        if (bool1)
        {
          localObject2 = paramJSONObject.getJSONObject("customData");
          this.zzaaU = ((JSONObject)localObject2);
        }
        for (;;)
        {
          return bool2;
          localObject4 = this.zzabj;
          m = localObject4.length;
          if (m != n)
          {
            localObject1 = localObject3;
            bool5 = bool2;
            break;
          }
          m = 0;
          localObject4 = null;
          for (;;)
          {
            if (m >= n) {
              break label653;
            }
            localObject5 = this.zzabj;
            l1 = localObject5[m];
            long l2 = localObject3[m];
            boolean bool6 = l1 < l2;
            if (bool6)
            {
              localObject1 = localObject3;
              bool5 = bool2;
              break;
            }
            m += 1;
          }
          bool2 = bool3;
          f1 = f2;
        }
        label653:
        Object localObject6 = localObject3;
        bool5 = false;
        localObject3 = null;
        localObject1 = localObject6;
        continue;
        localObject6 = null;
        bool5 = false;
        localObject3 = null;
        bool1 = false;
        localObject1 = null;
      }
      bool3 = false;
      localObject2 = null;
    }
  }
  
  void zznN()
  {
    double d1 = 0.0D;
    Object localObject = this.zzabd;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("media cannot be null.");
      throw ((Throwable)localObject);
    }
    double d2 = this.zzabg;
    boolean bool = Double.isNaN(d2);
    if (!bool)
    {
      d2 = this.zzabg;
      bool = d2 < d1;
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("startTime cannot be negative or NaN.");
      throw ((Throwable)localObject);
    }
    d2 = this.zzabh;
    bool = Double.isNaN(d2);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("playbackDuration cannot be NaN.");
      throw ((Throwable)localObject);
    }
    d2 = this.zzabi;
    bool = Double.isNaN(d2);
    if (!bool)
    {
      d2 = this.zzabi;
      bool = d2 < d1;
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("preloadTime cannot be negative or Nan.");
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaQueueItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */