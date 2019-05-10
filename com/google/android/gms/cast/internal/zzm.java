package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzm
  extends zzc
{
  private static final String NAMESPACE = zzf.zzci("com.google.cast.media");
  private final List zzacA;
  private long zzaei;
  private MediaStatus zzaej;
  private final zzp zzaek;
  private final zzp zzael;
  private final zzp zzaem;
  private final zzp zzaen;
  private final zzp zzaeo;
  private final zzp zzaep;
  private final zzp zzaeq;
  private final zzp zzaer;
  private final zzp zzaes;
  private final zzp zzaet;
  private final zzp zzaeu;
  private final zzp zzaev;
  private final zzp zzaew;
  private final zzp zzaex;
  
  public zzm(String paramString)
  {
    super((String)localObject1, "MediaControlChannel", paramString, 1000L);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaek = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzael = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaem = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaen = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaeo = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaep = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaeq = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaer = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaes = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaet = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaeu = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaev = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaew = ((zzp)localObject2);
    localObject2 = new com/google/android/gms/cast/internal/zzp;
    ((zzp)localObject2).<init>(l);
    this.zzaex = ((zzp)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.zzacA = ((List)localObject2);
    localObject2 = this.zzacA;
    localObject1 = this.zzaek;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzael;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaem;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaen;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaeo;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaep;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaeq;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaer;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaes;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaet;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaeu;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaev;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaew;
    ((List)localObject2).add(localObject1);
    localObject2 = this.zzacA;
    localObject1 = this.zzaex;
    ((List)localObject2).add(localObject1);
    zzoy();
  }
  
  private void zza(long paramLong, JSONObject paramJSONObject)
  {
    int i = 1;
    boolean bool1 = this.zzaek.zzB(paramLong);
    Object localObject1 = this.zzaeo;
    boolean bool2 = ((zzp)localObject1).zzoA();
    label128:
    int j;
    if (bool2)
    {
      localObject1 = this.zzaeo;
      bool2 = ((zzp)localObject1).zzB(paramLong);
      if (!bool2)
      {
        bool2 = i;
        zzp localzzp = this.zzaep;
        boolean bool3 = localzzp.zzoA();
        if (bool3)
        {
          localzzp = this.zzaep;
          bool3 = localzzp.zzB(paramLong);
          if (!bool3) {}
        }
        else
        {
          localzzp = this.zzaeq;
          bool3 = localzzp.zzoA();
          if (!bool3) {
            break label355;
          }
          localzzp = this.zzaeq;
          bool3 = localzzp.zzB(paramLong);
          if (bool3) {
            break label355;
          }
        }
        if (!bool2) {
          break label384;
        }
        j = 2;
      }
    }
    for (;;)
    {
      if (i != 0) {
        j |= 0x1;
      }
      Object localObject2;
      if (!bool1)
      {
        localObject2 = this.zzaej;
        if (localObject2 != null) {}
      }
      else
      {
        localObject1 = new com/google/android/gms/cast/MediaStatus;
        ((MediaStatus)localObject1).<init>(paramJSONObject);
        this.zzaej = ((MediaStatus)localObject1);
        long l1 = SystemClock.elapsedRealtime();
        this.zzaei = l1;
      }
      int k;
      for (j = 31;; m = ((MediaStatus)localObject2).zza(paramJSONObject, k))
      {
        i = j & 0x1;
        long l2;
        if (i != 0)
        {
          l2 = SystemClock.elapsedRealtime();
          this.zzaei = l2;
          onStatusUpdated();
        }
        i = j & 0x2;
        if (i != 0)
        {
          l2 = SystemClock.elapsedRealtime();
          this.zzaei = l2;
          onStatusUpdated();
        }
        i = j & 0x4;
        if (i != 0) {
          onMetadataUpdated();
        }
        i = j & 0x8;
        if (i != 0) {
          onQueueStatusUpdated();
        }
        j &= 0x10;
        if (j != 0) {
          onPreloadStatusUpdated();
        }
        localObject1 = this.zzacA;
        localObject2 = ((List)localObject1).iterator();
        for (;;)
        {
          k = ((Iterator)localObject2).hasNext();
          if (k == 0) {
            break;
          }
          localObject1 = (zzp)((Iterator)localObject2).next();
          ((zzp)localObject1).zzc(paramLong, 0);
        }
        k = 0;
        localObject1 = null;
        break;
        label355:
        i = 0;
        localObject2 = null;
        break label128;
        localObject2 = this.zzaej;
      }
      return;
      label384:
      int m = 0;
      localObject1 = null;
    }
  }
  
  private void zzoy()
  {
    long l = 0L;
    this.zzaei = l;
    boolean bool = false;
    this.zzaej = null;
    Object localObject = this.zzacA;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzp)localIterator.next();
      ((zzp)localObject).clear();
    }
  }
  
  public long getApproximateStreamPosition()
  {
    long l1 = 0L;
    double d1 = 0.0D;
    MediaInfo localMediaInfo = getMediaInfo();
    if (localMediaInfo == null) {}
    double d2;
    long l3;
    double d3;
    for (;;)
    {
      return l1;
      l2 = this.zzaei;
      boolean bool1 = l2 < l1;
      if (bool1)
      {
        d2 = this.zzaej.getPlaybackRate();
        l3 = this.zzaej.getStreamPosition();
        MediaStatus localMediaStatus = this.zzaej;
        int i = localMediaStatus.getPlayerState();
        l4 = 0L;
        d3 = 0.0D;
        boolean bool3 = d2 < d3;
        if (bool3)
        {
          int j = 2;
          if (i == j) {
            break;
          }
        }
        l1 = l3;
      }
    }
    long l2 = SystemClock.elapsedRealtime();
    long l4 = this.zzaei;
    l2 -= l4;
    boolean bool4 = l2 < l1;
    if (bool4)
    {
      l4 = l1;
      d3 = d1;
    }
    for (;;)
    {
      boolean bool2 = l4 < l1;
      if (!bool2)
      {
        l1 = l3;
        break;
      }
      l2 = localMediaInfo.getStreamDuration();
      d3 = l4 * d2;
      l4 = d3;
      l3 += l4;
      bool4 = l2 < l1;
      if (bool4)
      {
        bool4 = l3 < l2;
        if (!bool4) {}
      }
      for (;;)
      {
        l1 = l2;
        break;
        bool2 = l3 < l1;
        if (bool2) {
          l2 = l1;
        } else {
          l2 = l3;
        }
      }
      l4 = l2;
    }
  }
  
  public MediaInfo getMediaInfo()
  {
    Object localObject = this.zzaej;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaej.getMediaInfo()) {
      return (MediaInfo)localObject;
    }
  }
  
  public MediaStatus getMediaStatus()
  {
    return this.zzaej;
  }
  
  public long getStreamDuration()
  {
    MediaInfo localMediaInfo = getMediaInfo();
    if (localMediaInfo != null) {}
    for (long l = localMediaInfo.getStreamDuration();; l = 0L) {
      return l;
    }
  }
  
  protected void onMetadataUpdated() {}
  
  protected void onPreloadStatusUpdated() {}
  
  protected void onQueueStatusUpdated() {}
  
  protected void onStatusUpdated() {}
  
  public long zza(zzo paramzzo)
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    long l1 = zzog();
    this.zzaer.zza(l1, paramzzo);
    boolean bool = true;
    zzW(bool);
    Object localObject2 = "requestId";
    try
    {
      ((JSONObject)localObject1).put((String)localObject2, l1);
      localObject2 = "type";
      Object localObject3 = "GET_STATUS";
      ((JSONObject)localObject1).put((String)localObject2, localObject3);
      localObject2 = this.zzaej;
      if (localObject2 != null)
      {
        localObject2 = "mediaSessionId";
        localObject3 = this.zzaej;
        long l2 = ((MediaStatus)localObject3).zznO();
        ((JSONObject)localObject1).put((String)localObject2, l2);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = ((JSONObject)localObject1).toString();
    zza((String)localObject1, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, double paramDouble, JSONObject paramJSONObject)
  {
    boolean bool1 = Double.isInfinite(paramDouble);
    if (!bool1)
    {
      bool1 = Double.isNaN(paramDouble);
      if (!bool1) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Volume cannot be " + paramDouble;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    long l1 = zzog();
    this.zzaep.zza(l1, paramzzo);
    boolean bool2 = true;
    zzW(bool2);
    Object localObject2 = "requestId";
    try
    {
      ((JSONObject)localObject1).put((String)localObject2, l1);
      localObject2 = "type";
      String str = "SET_VOLUME";
      ((JSONObject)localObject1).put((String)localObject2, str);
      localObject2 = "mediaSessionId";
      long l2 = zznO();
      ((JSONObject)localObject1).put((String)localObject2, l2);
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      str = "level";
      ((JSONObject)localObject2).put(str, paramDouble);
      str = "volume";
      ((JSONObject)localObject1).put(str, localObject2);
      if (paramJSONObject != null)
      {
        localObject2 = "customData";
        ((JSONObject)localObject1).put((String)localObject2, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = ((JSONObject)localObject1).toString();
    zza((String)localObject1, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, int paramInt1, long paramLong, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt2, Integer paramInteger, JSONObject paramJSONObject)
  {
    long l1 = -1;
    boolean bool1 = paramLong < l1;
    if (bool1)
    {
      l1 = 0L;
      bool1 = paramLong < l1;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "playPosition cannot be negative: " + paramLong;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject2 = new org/json/JSONObject;
    ((JSONObject)localObject2).<init>();
    long l2 = zzog();
    this.zzaev.zza(l2, paramzzo);
    bool1 = true;
    zzW(bool1);
    Object localObject1 = "requestId";
    for (;;)
    {
      try
      {
        ((JSONObject)localObject2).put((String)localObject1, l2);
        localObject1 = "type";
        localObject3 = "QUEUE_UPDATE";
        ((JSONObject)localObject2).put((String)localObject1, localObject3);
        localObject1 = "mediaSessionId";
        l3 = zznO();
        ((JSONObject)localObject2).put((String)localObject1, l3);
        if (paramInt1 != 0)
        {
          localObject1 = "currentItemId";
          ((JSONObject)localObject2).put((String)localObject1, paramInt1);
        }
        if (paramInt2 != 0)
        {
          localObject1 = "jump";
          ((JSONObject)localObject2).put((String)localObject1, paramInt2);
        }
        int i;
        if (paramArrayOfMediaQueueItem != null)
        {
          i = paramArrayOfMediaQueueItem.length;
          if (i > 0)
          {
            localObject3 = new org/json/JSONArray;
            ((JSONArray)localObject3).<init>();
            i = 0;
            localObject1 = null;
            int j = paramArrayOfMediaQueueItem.length;
            if (i < j)
            {
              Object localObject4 = paramArrayOfMediaQueueItem[i];
              localObject4 = ((MediaQueueItem)localObject4).toJson();
              ((JSONArray)localObject3).put(i, localObject4);
              i += 1;
              continue;
            }
            localObject1 = "items";
            ((JSONObject)localObject2).put((String)localObject1, localObject3);
          }
        }
        if (paramInteger != null)
        {
          i = paramInteger.intValue();
          switch (i)
          {
          }
        }
      }
      catch (JSONException localJSONException)
      {
        long l3;
        double d;
        boolean bool2;
        continue;
        String str = "repeatMode";
        Object localObject3 = "REPEAT_ALL";
        ((JSONObject)localObject2).put(str, localObject3);
        continue;
        str = "repeatMode";
        localObject3 = "REPEAT_SINGLE";
        ((JSONObject)localObject2).put(str, localObject3);
        continue;
        str = "repeatMode";
        localObject3 = "REPEAT_ALL_AND_SHUFFLE";
        ((JSONObject)localObject2).put(str, localObject3);
        continue;
      }
      l3 = -1;
      d = 0.0D / 0.0D;
      bool2 = paramLong < l3;
      if (bool2)
      {
        localObject1 = "currentTime";
        d = zzf.zzA(paramLong);
        ((JSONObject)localObject2).put((String)localObject1, d);
      }
      if (paramJSONObject != null)
      {
        localObject1 = "customData";
        ((JSONObject)localObject2).put((String)localObject1, paramJSONObject);
      }
      localObject1 = ((JSONObject)localObject2).toString();
      zza((String)localObject1, l2, null);
      return l2;
      localObject1 = "repeatMode";
      localObject3 = "REPEAT_OFF";
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
    }
  }
  
  public long zza(zzo paramzzo, long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    int i = 1;
    Object localObject = new org/json/JSONObject;
    ((JSONObject)localObject).<init>();
    long l1 = zzog();
    this.zzaeo.zza(l1, paramzzo);
    zzW(i);
    String str1 = "requestId";
    for (;;)
    {
      try
      {
        ((JSONObject)localObject).put(str1, l1);
        str1 = "type";
        str2 = "SEEK";
        ((JSONObject)localObject).put(str1, str2);
        str1 = "mediaSessionId";
        long l2 = zznO();
        ((JSONObject)localObject).put(str1, l2);
        str1 = "currentTime";
        double d = zzf.zzA(paramLong);
        ((JSONObject)localObject).put(str1, d);
        if (paramInt != i) {
          continue;
        }
        str1 = "resumeState";
        str2 = "PLAYBACK_START";
        ((JSONObject)localObject).put(str1, str2);
        if (paramJSONObject != null)
        {
          str1 = "customData";
          ((JSONObject)localObject).put(str1, paramJSONObject);
        }
      }
      catch (JSONException localJSONException)
      {
        String str2;
        int j;
        continue;
      }
      localObject = ((JSONObject)localObject).toString();
      zza((String)localObject, l1, null);
      return l1;
      j = 2;
      if (paramInt == j)
      {
        str1 = "resumeState";
        str2 = "PLAYBACK_PAUSE";
        ((JSONObject)localObject).put(str1, str2);
      }
    }
  }
  
  public long zza(zzo paramzzo, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, long[] paramArrayOfLong, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    long l1 = zzog();
    this.zzaek.zza(l1, paramzzo);
    int i = 1;
    zzW(i);
    String str = "requestId";
    try
    {
      localJSONObject.put(str, l1);
      str = "type";
      Object localObject = "LOAD";
      localJSONObject.put(str, localObject);
      str = "media";
      localObject = paramMediaInfo.toJson();
      localJSONObject.put(str, localObject);
      str = "autoplay";
      localJSONObject.put(str, paramBoolean);
      str = "currentTime";
      double d = zzf.zzA(paramLong);
      localJSONObject.put(str, d);
      if (paramArrayOfLong != null)
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
        i = 0;
        str = null;
        for (;;)
        {
          int k = paramArrayOfLong.length;
          if (i >= k) {
            break;
          }
          long l2 = paramArrayOfLong[i];
          ((JSONArray)localObject).put(i, l2);
          int j;
          i += 1;
        }
        str = "activeTrackIds";
        localJSONObject.put(str, localObject);
      }
      if (paramJSONObject != null)
      {
        str = "customData";
        localJSONObject.put(str, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    str = localJSONObject.toString();
    zza(str, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, TextTrackStyle paramTextTrackStyle)
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    long l1 = zzog();
    this.zzaet.zza(l1, paramzzo);
    boolean bool = true;
    zzW(bool);
    String str = "requestId";
    try
    {
      ((JSONObject)localObject1).put(str, l1);
      str = "type";
      Object localObject2 = "EDIT_TRACKS_INFO";
      ((JSONObject)localObject1).put(str, localObject2);
      if (paramTextTrackStyle != null)
      {
        str = "textTrackStyle";
        localObject2 = paramTextTrackStyle.toJson();
        ((JSONObject)localObject1).put(str, localObject2);
      }
      str = "mediaSessionId";
      long l2 = zznO();
      ((JSONObject)localObject1).put(str, l2);
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = ((JSONObject)localObject1).toString();
    zza((String)localObject1, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, JSONObject paramJSONObject)
  {
    Object localObject = new org/json/JSONObject;
    ((JSONObject)localObject).<init>();
    long l1 = zzog();
    this.zzael.zza(l1, paramzzo);
    boolean bool = true;
    zzW(bool);
    String str1 = "requestId";
    try
    {
      ((JSONObject)localObject).put(str1, l1);
      str1 = "type";
      String str2 = "PAUSE";
      ((JSONObject)localObject).put(str1, str2);
      str1 = "mediaSessionId";
      long l2 = zznO();
      ((JSONObject)localObject).put(str1, l2);
      if (paramJSONObject != null)
      {
        str1 = "customData";
        ((JSONObject)localObject).put(str1, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject = ((JSONObject)localObject).toString();
    zza((String)localObject, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, boolean paramBoolean, JSONObject paramJSONObject)
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    long l1 = zzog();
    this.zzaeq.zza(l1, paramzzo);
    boolean bool = true;
    zzW(bool);
    Object localObject2 = "requestId";
    try
    {
      ((JSONObject)localObject1).put((String)localObject2, l1);
      localObject2 = "type";
      String str = "SET_VOLUME";
      ((JSONObject)localObject1).put((String)localObject2, str);
      localObject2 = "mediaSessionId";
      long l2 = zznO();
      ((JSONObject)localObject1).put((String)localObject2, l2);
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      str = "muted";
      ((JSONObject)localObject2).put(str, paramBoolean);
      str = "volume";
      ((JSONObject)localObject1).put(str, localObject2);
      if (paramJSONObject != null)
      {
        localObject2 = "customData";
        ((JSONObject)localObject1).put((String)localObject2, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = ((JSONObject)localObject1).toString();
    zza((String)localObject1, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, int[] paramArrayOfInt, int paramInt, JSONObject paramJSONObject)
  {
    if (paramArrayOfInt != null)
    {
      i = paramArrayOfInt.length;
      if (i != 0) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("itemIdsToReorder must not be null or empty.");
      throw ((Throwable)localObject1);
    }
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    long l1 = zzog();
    this.zzaex.zza(l1, paramzzo);
    int i = 1;
    zzW(i);
    Object localObject1 = "requestId";
    try
    {
      localJSONObject.put((String)localObject1, l1);
      localObject1 = "type";
      Object localObject2 = "QUEUE_REORDER";
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "mediaSessionId";
      long l2 = zznO();
      localJSONObject.put((String)localObject1, l2);
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      int j = 0;
      localObject1 = null;
      for (;;)
      {
        int k = paramArrayOfInt.length;
        if (j >= k) {
          break;
        }
        k = paramArrayOfInt[j];
        ((JSONArray)localObject2).put(j, k);
        j += 1;
      }
      localObject1 = "itemIds";
      localJSONObject.put((String)localObject1, localObject2);
      if (paramInt != 0)
      {
        localObject1 = "insertBefore";
        localJSONObject.put((String)localObject1, paramInt);
      }
      if (paramJSONObject != null)
      {
        localObject1 = "customData";
        localJSONObject.put((String)localObject1, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = localJSONObject.toString();
    zza((String)localObject1, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, int[] paramArrayOfInt, JSONObject paramJSONObject)
  {
    if (paramArrayOfInt != null)
    {
      i = paramArrayOfInt.length;
      if (i != 0) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("itemIdsToRemove must not be null or empty.");
      throw ((Throwable)localObject1);
    }
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    long l1 = zzog();
    this.zzaew.zza(l1, paramzzo);
    int i = 1;
    zzW(i);
    Object localObject1 = "requestId";
    try
    {
      localJSONObject.put((String)localObject1, l1);
      localObject1 = "type";
      Object localObject2 = "QUEUE_REMOVE";
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "mediaSessionId";
      long l2 = zznO();
      localJSONObject.put((String)localObject1, l2);
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      int j = 0;
      localObject1 = null;
      for (;;)
      {
        int k = paramArrayOfInt.length;
        if (j >= k) {
          break;
        }
        k = paramArrayOfInt[j];
        ((JSONArray)localObject2).put(j, k);
        j += 1;
      }
      localObject1 = "itemIds";
      localJSONObject.put((String)localObject1, localObject2);
      if (paramJSONObject != null)
      {
        localObject1 = "customData";
        localJSONObject.put((String)localObject1, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = localJSONObject.toString();
    zza((String)localObject1, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, long[] paramArrayOfLong)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    long l1 = zzog();
    this.zzaes.zza(l1, paramzzo);
    int i = 1;
    zzW(i);
    String str = "requestId";
    try
    {
      localJSONObject.put(str, l1);
      str = "type";
      Object localObject = "EDIT_TRACKS_INFO";
      localJSONObject.put(str, localObject);
      str = "mediaSessionId";
      long l2 = zznO();
      localJSONObject.put(str, l2);
      localObject = new org/json/JSONArray;
      ((JSONArray)localObject).<init>();
      i = 0;
      str = null;
      for (;;)
      {
        int k = paramArrayOfLong.length;
        if (i >= k) {
          break;
        }
        long l3 = paramArrayOfLong[i];
        ((JSONArray)localObject).put(i, l3);
        int j;
        i += 1;
      }
      str = "activeTrackIds";
      localJSONObject.put(str, localObject);
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    str = localJSONObject.toString();
    zza(str, l1, null);
    return l1;
  }
  
  public long zza(zzo paramzzo, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, int paramInt3, long paramLong, JSONObject paramJSONObject)
  {
    if (paramArrayOfMediaQueueItem != null)
    {
      i = paramArrayOfMediaQueueItem.length;
      if (i != 0) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("itemsToInsert must not be null or empty.");
      throw ((Throwable)localObject1);
    }
    if (paramInt2 != 0)
    {
      i = -1;
      if (paramInt3 != i)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("can not set both currentItemId and currentItemIndexInItemsToInsert");
        throw ((Throwable)localObject1);
      }
    }
    int i = -1;
    Object localObject2;
    if (paramInt3 != i) {
      if (paramInt3 >= 0)
      {
        i = paramArrayOfMediaQueueItem.length;
        if (paramInt3 < i) {}
      }
      else
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object[] arrayOfObject = new Object[2];
        localObject2 = Integer.valueOf(paramInt3);
        arrayOfObject[0] = localObject2;
        localObject2 = Integer.valueOf(paramArrayOfMediaQueueItem.length);
        arrayOfObject[1] = localObject2;
        localObject3 = String.format("currentItemIndexInItemsToInsert %d out of range [0, %d).", arrayOfObject);
        ((IllegalArgumentException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    long l1 = -1;
    int j = paramLong < l1;
    if (j != 0)
    {
      l1 = 0L;
      j = paramLong < l1;
      if (j < 0)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "playPosition can not be negative: " + paramLong;
        ((IllegalArgumentException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject3 = new org/json/JSONObject;
    ((JSONObject)localObject3).<init>();
    long l2 = zzog();
    this.zzaeu.zza(l2, paramzzo);
    j = 1;
    zzW(j);
    Object localObject1 = "requestId";
    try
    {
      ((JSONObject)localObject3).put((String)localObject1, l2);
      localObject1 = "type";
      localObject2 = "QUEUE_INSERT";
      ((JSONObject)localObject3).put((String)localObject1, localObject2);
      localObject1 = "mediaSessionId";
      long l3 = zznO();
      ((JSONObject)localObject3).put((String)localObject1, l3);
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      j = 0;
      localObject1 = null;
      for (;;)
      {
        int m = paramArrayOfMediaQueueItem.length;
        if (j >= m) {
          break;
        }
        Object localObject4 = paramArrayOfMediaQueueItem[j];
        localObject4 = ((MediaQueueItem)localObject4).toJson();
        ((JSONArray)localObject2).put(j, localObject4);
        j += 1;
      }
      localObject1 = "items";
      ((JSONObject)localObject3).put((String)localObject1, localObject2);
      if (paramInt1 != 0)
      {
        localObject1 = "insertBefore";
        ((JSONObject)localObject3).put((String)localObject1, paramInt1);
      }
      if (paramInt2 != 0)
      {
        localObject1 = "currentItemId";
        ((JSONObject)localObject3).put((String)localObject1, paramInt2);
      }
      int k = -1;
      if (paramInt3 != k)
      {
        localObject1 = "currentItemIndex";
        ((JSONObject)localObject3).put((String)localObject1, paramInt3);
      }
      l3 = -1;
      double d = 0.0D / 0.0D;
      boolean bool = paramLong < l3;
      if (bool)
      {
        localObject1 = "currentTime";
        d = zzf.zzA(paramLong);
        ((JSONObject)localObject3).put((String)localObject1, d);
      }
      if (paramJSONObject != null)
      {
        localObject1 = "customData";
        ((JSONObject)localObject3).put((String)localObject1, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = ((JSONObject)localObject3).toString();
    zza((String)localObject1, l2, null);
    return l2;
  }
  
  public long zza(zzo paramzzo, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, long paramLong, JSONObject paramJSONObject)
  {
    long l1 = -1;
    int i;
    if (paramArrayOfMediaQueueItem != null)
    {
      i = paramArrayOfMediaQueueItem.length;
      if (i != 0) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("items must not be null or empty.");
      throw ((Throwable)localObject1);
    }
    if (paramInt1 >= 0)
    {
      i = paramArrayOfMediaQueueItem.length;
      if (paramInt1 < i) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid startIndex: " + paramInt1;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int j = paramLong < l1;
    if (j != 0)
    {
      long l2 = 0L;
      j = paramLong < l2;
      if (j < 0)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "playPosition can not be negative: " + paramLong;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject2 = new org/json/JSONObject;
    ((JSONObject)localObject2).<init>();
    long l3 = zzog();
    this.zzaek.zza(l3, paramzzo);
    j = 1;
    zzW(j);
    Object localObject1 = "requestId";
    try
    {
      ((JSONObject)localObject2).put((String)localObject1, l3);
      localObject1 = "type";
      localObject3 = "QUEUE_LOAD";
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject3 = new org/json/JSONArray;
      ((JSONArray)localObject3).<init>();
      j = 0;
      localObject1 = null;
      Object localObject4;
      for (;;)
      {
        int m = paramArrayOfMediaQueueItem.length;
        if (j >= m) {
          break;
        }
        localObject4 = paramArrayOfMediaQueueItem[j];
        localObject4 = ((MediaQueueItem)localObject4).toJson();
        ((JSONArray)localObject3).put(j, localObject4);
        int k;
        j += 1;
      }
      localObject1 = "items";
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      switch (paramInt2)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "Invalid repeat mode: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).append(paramInt2);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((IllegalArgumentException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (JSONException localJSONException) {}
    String str = ((JSONObject)localObject2).toString();
    zza(str, l3, null);
    return l3;
    str = "repeatMode";
    Object localObject3 = "REPEAT_OFF";
    ((JSONObject)localObject2).put(str, localObject3);
    for (;;)
    {
      str = "startIndex";
      ((JSONObject)localObject2).put(str, paramInt1);
      boolean bool = paramLong < l1;
      if (bool)
      {
        str = "currentTime";
        double d = zzf.zzA(paramLong);
        ((JSONObject)localObject2).put(str, d);
      }
      if (paramJSONObject == null) {
        break;
      }
      str = "customData";
      ((JSONObject)localObject2).put(str, paramJSONObject);
      break;
      str = "repeatMode";
      localObject3 = "REPEAT_ALL";
      ((JSONObject)localObject2).put(str, localObject3);
      continue;
      str = "repeatMode";
      localObject3 = "REPEAT_SINGLE";
      ((JSONObject)localObject2).put(str, localObject3);
      continue;
      str = "repeatMode";
      localObject3 = "REPEAT_ALL_AND_SHUFFLE";
      ((JSONObject)localObject2).put(str, localObject3);
    }
  }
  
  public long zzb(zzo paramzzo, JSONObject paramJSONObject)
  {
    Object localObject = new org/json/JSONObject;
    ((JSONObject)localObject).<init>();
    long l1 = zzog();
    this.zzaen.zza(l1, paramzzo);
    boolean bool = true;
    zzW(bool);
    String str1 = "requestId";
    try
    {
      ((JSONObject)localObject).put(str1, l1);
      str1 = "type";
      String str2 = "STOP";
      ((JSONObject)localObject).put(str1, str2);
      str1 = "mediaSessionId";
      long l2 = zznO();
      ((JSONObject)localObject).put(str1, l2);
      if (paramJSONObject != null)
      {
        str1 = "customData";
        ((JSONObject)localObject).put(str1, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject = ((JSONObject)localObject).toString();
    zza((String)localObject, l1, null);
    return l1;
  }
  
  public void zzb(long paramLong, int paramInt)
  {
    Object localObject = this.zzacA;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzp)localIterator.next();
      ((zzp)localObject).zzc(paramLong, paramInt);
    }
  }
  
  public long zzc(zzo paramzzo, JSONObject paramJSONObject)
  {
    Object localObject = new org/json/JSONObject;
    ((JSONObject)localObject).<init>();
    long l1 = zzog();
    this.zzaem.zza(l1, paramzzo);
    boolean bool = true;
    zzW(bool);
    String str1 = "requestId";
    try
    {
      ((JSONObject)localObject).put(str1, l1);
      str1 = "type";
      String str2 = "PLAY";
      ((JSONObject)localObject).put(str1, str2);
      str1 = "mediaSessionId";
      long l2 = zznO();
      ((JSONObject)localObject).put(str1, l2);
      if (paramJSONObject != null)
      {
        str1 = "customData";
        ((JSONObject)localObject).put(str1, paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject = ((JSONObject)localObject).toString();
    zza((String)localObject, l1, null);
    return l1;
  }
  
  public final void zzcf(String paramString)
  {
    int i = 1;
    Object localObject1 = this.zzadu;
    Object localObject3 = "message received: %s";
    Object localObject4 = new Object[i];
    localObject4[0] = paramString;
    ((zzl)localObject1).zzb((String)localObject3, (Object[])localObject4);
    long l2;
    Object localObject5;
    boolean bool4;
    for (;;)
    {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString);
        localObject3 = "type";
        localObject3 = ((JSONObject)localObject1).getString((String)localObject3);
        localObject4 = "requestId";
        long l1 = -1;
        l2 = ((JSONObject)localObject1).optLong((String)localObject4, l1);
        localObject5 = "MEDIA_STATUS";
        bool1 = ((String)localObject3).equals(localObject5);
        if (!bool1) {
          continue;
        }
        localObject3 = "status";
        localObject1 = ((JSONObject)localObject1).getJSONArray((String)localObject3);
        m = ((JSONArray)localObject1).length();
        if (m > 0)
        {
          m = 0;
          localObject3 = null;
          localObject1 = ((JSONArray)localObject1).getJSONObject(0);
          zza(l2, (JSONObject)localObject1);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        int m;
        localObject3 = this.zzadu;
        localObject4 = "Message is malformed (%s); ignoring: %s";
        n = 2;
        arrayOfObject1 = new Object[n];
        localObject2 = localJSONException.getMessage();
        arrayOfObject1[0] = localObject2;
        arrayOfObject1[i] = paramString;
        ((zzl)localObject3).zzf((String)localObject4, arrayOfObject1);
        continue;
        localObject5 = "INVALID_PLAYER_STATE";
        boolean bool1 = ((String)localObject3).equals(localObject5);
        if (!bool1) {
          continue;
        }
        localObject3 = this.zzadu;
        localObject5 = "received unexpected error: Invalid Player State.";
        i1 = 0;
        arrayOfObject2 = null;
        arrayOfObject2 = new Object[0];
        ((zzl)localObject3).zzf((String)localObject5, arrayOfObject2);
        localObject3 = "customData";
        localObject3 = ((JSONObject)localObject2).optJSONObject((String)localObject3);
        localObject2 = this.zzacA;
        localObject5 = ((List)localObject2).iterator();
        bool4 = ((Iterator)localObject5).hasNext();
        if (!bool4) {
          continue;
        }
        localObject2 = ((Iterator)localObject5).next();
        localObject2 = (zzp)localObject2;
        i1 = 2100;
        ((zzp)localObject2).zzc(l2, i1, localObject3);
        continue;
        localObject5 = "LOAD_FAILED";
        bool1 = ((String)localObject3).equals(localObject5);
        if (!bool1) {
          continue;
        }
        localObject3 = "customData";
        localObject2 = ((JSONObject)localObject2).optJSONObject((String)localObject3);
        localObject3 = this.zzaek;
        j = 2100;
        ((zzp)localObject3).zzc(l2, j, localObject2);
        continue;
        localObject5 = "LOAD_CANCELLED";
        bool2 = ((String)localObject3).equals(localObject5);
        if (!bool2) {
          continue;
        }
        localObject3 = "customData";
        localObject2 = ((JSONObject)localObject2).optJSONObject((String)localObject3);
        localObject3 = this.zzaek;
        k = 2101;
        ((zzp)localObject3).zzc(l2, k, localObject2);
        continue;
        localObject5 = "INVALID_REQUEST";
        bool3 = ((String)localObject3).equals(localObject5);
        if (!bool3) {
          continue;
        }
        localObject3 = this.zzadu;
        localObject5 = "received unexpected error: Invalid Request.";
        i1 = 0;
        arrayOfObject2 = null;
        arrayOfObject2 = new Object[0];
        ((zzl)localObject3).zzf((String)localObject5, arrayOfObject2);
        localObject3 = "customData";
        localObject3 = ((JSONObject)localObject2).optJSONObject((String)localObject3);
        localObject2 = this.zzacA;
        localObject5 = ((List)localObject2).iterator();
      }
      bool4 = false;
      localObject1 = null;
      this.zzaej = null;
      onStatusUpdated();
      onMetadataUpdated();
      onQueueStatusUpdated();
      onPreloadStatusUpdated();
      localObject1 = this.zzaer;
      m = 0;
      localObject3 = null;
      ((zzp)localObject1).zzc(l2, 0);
    }
    for (;;)
    {
      int n;
      Object[] arrayOfObject1;
      Object[] arrayOfObject2;
      int j;
      boolean bool2;
      int k;
      boolean bool3;
      bool4 = ((Iterator)localObject5).hasNext();
      if (!bool4) {
        break;
      }
      Object localObject2 = ((Iterator)localObject5).next();
      localObject2 = (zzp)localObject2;
      int i1 = 2100;
      ((zzp)localObject2).zzc(l2, i1, localObject3);
    }
  }
  
  public long zznO()
  {
    Object localObject = this.zzaej;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No current media session");
      throw ((Throwable)localObject);
    }
    return this.zzaej.zznO();
  }
  
  public void zzof()
  {
    super.zzof();
    zzoy();
  }
  
  protected boolean zzz(long paramLong)
  {
    Object localObject1 = this.zzacA;
    Iterator localIterator1 = ((List)localObject1).iterator();
    boolean bool;
    for (;;)
    {
      bool = localIterator1.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzp)localIterator1.next();
      int i = 2102;
      ((zzp)localObject1).zzd(paramLong, i);
    }
    localIterator1 = null;
    for (;;)
    {
      synchronized (zzp.zzaeB)
      {
        localObject1 = this.zzacA;
        Iterator localIterator2 = ((List)localObject1).iterator();
        bool = localIterator2.hasNext();
        if (bool)
        {
          localObject1 = localIterator2.next();
          localObject1 = (zzp)localObject1;
          bool = ((zzp)localObject1).zzoA();
          if (!bool) {
            continue;
          }
          bool = true;
          return bool;
        }
      }
      bool = false;
      Object localObject3 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */