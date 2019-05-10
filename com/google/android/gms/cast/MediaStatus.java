package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class MediaStatus
{
  public static final long COMMAND_PAUSE = 1L;
  public static final long COMMAND_SEEK = 2L;
  public static final long COMMAND_SET_VOLUME = 4L;
  public static final long COMMAND_SKIP_BACKWARD = 32L;
  public static final long COMMAND_SKIP_FORWARD = 16L;
  public static final long COMMAND_TOGGLE_MUTE = 8L;
  public static final int IDLE_REASON_CANCELED = 2;
  public static final int IDLE_REASON_ERROR = 4;
  public static final int IDLE_REASON_FINISHED = 1;
  public static final int IDLE_REASON_INTERRUPTED = 3;
  public static final int IDLE_REASON_NONE = 0;
  public static final int PLAYER_STATE_BUFFERING = 4;
  public static final int PLAYER_STATE_IDLE = 1;
  public static final int PLAYER_STATE_PAUSED = 3;
  public static final int PLAYER_STATE_PLAYING = 2;
  public static final int PLAYER_STATE_UNKNOWN = 0;
  public static final int REPEAT_MODE_REPEAT_ALL = 1;
  public static final int REPEAT_MODE_REPEAT_ALL_AND_SHUFFLE = 3;
  public static final int REPEAT_MODE_REPEAT_OFF = 0;
  public static final int REPEAT_MODE_REPEAT_SINGLE = 2;
  private JSONObject zzaaU;
  private MediaInfo zzaaV;
  private long[] zzabj;
  private int zzabl = 0;
  private long zzabm;
  private double zzabn;
  private int zzabo;
  private int zzabp;
  private long zzabq;
  private long zzabr;
  private double zzabs;
  private boolean zzabt;
  private int zzabu = 0;
  private int zzabv = 0;
  private final MediaStatus.zza zzabw;
  
  public MediaStatus(JSONObject paramJSONObject)
  {
    MediaStatus.zza localzza = new com/google/android/gms/cast/MediaStatus$zza;
    localzza.<init>(this);
    this.zzabw = localzza;
    zza(paramJSONObject, 0);
  }
  
  private boolean zzi(int paramInt1, int paramInt2)
  {
    int i = 1;
    if ((paramInt1 == i) && (paramInt2 == 0)) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public long[] getActiveTrackIds()
  {
    return this.zzabj;
  }
  
  public int getCurrentItemId()
  {
    return this.zzabl;
  }
  
  public JSONObject getCustomData()
  {
    return this.zzaaU;
  }
  
  public int getIdleReason()
  {
    return this.zzabp;
  }
  
  public int getLoadingItemId()
  {
    return this.zzabu;
  }
  
  public MediaInfo getMediaInfo()
  {
    return this.zzaaV;
  }
  
  public double getPlaybackRate()
  {
    return this.zzabn;
  }
  
  public int getPlayerState()
  {
    return this.zzabo;
  }
  
  public int getPreloadedItemId()
  {
    return this.zzabv;
  }
  
  public MediaQueueItem getQueueItem(int paramInt)
  {
    return this.zzabw.zzbc(paramInt);
  }
  
  public MediaQueueItem getQueueItemById(int paramInt)
  {
    return this.zzabw.zzbb(paramInt);
  }
  
  public int getQueueItemCount()
  {
    return this.zzabw.getItemCount();
  }
  
  public List getQueueItems()
  {
    return this.zzabw.zznP();
  }
  
  public int getQueueRepeatMode()
  {
    return this.zzabw.getRepeatMode();
  }
  
  public long getStreamPosition()
  {
    return this.zzabq;
  }
  
  public double getStreamVolume()
  {
    return this.zzabs;
  }
  
  public boolean isMediaCommandSupported(long paramLong)
  {
    long l1 = this.zzabr & paramLong;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isMute()
  {
    return this.zzabt;
  }
  
  public int zza(JSONObject paramJSONObject, int paramInt)
  {
    int i = 4;
    float f1 = 5.6E-45F;
    int k = 3;
    float f2 = 4.2E-45F;
    int m = 2;
    int i5 = 1;
    float f3 = Float.MIN_VALUE;
    String str1 = "mediaSessionId";
    long l1 = paramJSONObject.getLong(str1);
    long l2 = this.zzabm;
    boolean bool4 = l1 < l2;
    if (bool4)
    {
      this.zzabm = l1;
      bool4 = i5;
    }
    for (;;)
    {
      Object localObject1 = "playerState";
      int i10 = paramJSONObject.has((String)localObject1);
      String str2;
      if (i10 != 0)
      {
        localObject1 = paramJSONObject.getString("playerState");
        str2 = "IDLE";
        boolean bool8 = ((String)localObject1).equals(str2);
        if (!bool8) {
          break label597;
        }
        i10 = i5;
      }
      for (;;)
      {
        int i16 = this.zzabo;
        if (i10 != i16)
        {
          this.zzabo = i10;
          bool4 |= true;
        }
        boolean bool9;
        if (i10 == i5)
        {
          localObject1 = "idleReason";
          i10 = paramJSONObject.has((String)localObject1);
          if (i10 != 0)
          {
            localObject1 = paramJSONObject.getString("idleReason");
            str2 = "CANCELLED";
            bool9 = ((String)localObject1).equals(str2);
            if (!bool9) {
              break label671;
            }
          }
        }
        for (;;)
        {
          label185:
          int i11 = this.zzabp;
          if (m != i11)
          {
            this.zzabp = m;
            i9 |= 0x2;
          }
          localObject1 = "playbackRate";
          boolean bool5 = paramJSONObject.has((String)localObject1);
          double d1;
          double d2;
          if (bool5)
          {
            localObject1 = "playbackRate";
            d1 = paramJSONObject.getDouble((String)localObject1);
            d2 = this.zzabn;
            bool5 = d2 < d1;
            if (bool5)
            {
              this.zzabn = d1;
              i9 |= 0x2;
            }
          }
          localObject1 = "currentTime";
          bool5 = paramJSONObject.has((String)localObject1);
          long l3;
          long l4;
          if (bool5)
          {
            int i12 = paramInt & 0x2;
            if (i12 == 0)
            {
              localObject1 = "currentTime";
              d1 = paramJSONObject.getDouble((String)localObject1);
              l3 = zzf.zzg(d1);
              l4 = this.zzabq;
              bool6 = l3 < l4;
              if (bool6)
              {
                this.zzabq = l3;
                i9 |= 0x2;
              }
            }
          }
          localObject1 = "supportedMediaCommands";
          boolean bool6 = paramJSONObject.has((String)localObject1);
          if (bool6)
          {
            localObject1 = "supportedMediaCommands";
            l3 = paramJSONObject.getLong((String)localObject1);
            l4 = this.zzabr;
            bool6 = l3 < l4;
            if (bool6)
            {
              this.zzabr = l3;
              i9 |= 0x2;
            }
          }
          localObject1 = "volume";
          bool6 = paramJSONObject.has((String)localObject1);
          if (bool6)
          {
            int i13 = paramInt & 0x1;
            if (i13 == 0)
            {
              localObject1 = paramJSONObject.getJSONObject("volume");
              localObject2 = "level";
              d1 = ((JSONObject)localObject1).getDouble((String)localObject2);
              d2 = this.zzabs;
              boolean bool1 = d1 < d2;
              if (bool1)
              {
                this.zzabs = d1;
                i9 |= 0x2;
              }
              localObject2 = "muted";
              int i14 = ((JSONObject)localObject1).getBoolean((String)localObject2);
              n = this.zzabt;
              if (i14 != n)
              {
                this.zzabt = i14;
                i9 |= 0x2;
              }
            }
          }
          boolean bool7 = false;
          localObject1 = null;
          Object localObject2 = "activeTrackIds";
          int n = paramJSONObject.has((String)localObject2);
          Object localObject3;
          int j;
          if (n != 0)
          {
            localObject3 = paramJSONObject.getJSONArray("activeTrackIds");
            j = ((JSONArray)localObject3).length();
            localObject1 = new long[j];
            n = 0;
            localObject2 = null;
            for (;;)
            {
              if (n < j)
              {
                l1 = ((JSONArray)localObject3).getLong(n);
                localObject1[n] = l1;
                int i1;
                n += 1;
                continue;
                label597:
                str2 = "PLAYING";
                bool9 = ((String)localObject1).equals(str2);
                if (bool9)
                {
                  bool7 = i1;
                  break;
                }
                str2 = "PAUSED";
                bool9 = ((String)localObject1).equals(str2);
                if (bool9)
                {
                  bool7 = k;
                  break;
                }
                str2 = "BUFFERING";
                bool7 = ((String)localObject1).equals(str2);
                if (!bool7) {
                  break label1279;
                }
                bool7 = j;
                break;
                label671:
                localObject2 = "INTERRUPTED";
                boolean bool3 = ((String)localObject1).equals(localObject2);
                if (bool3)
                {
                  bool3 = k;
                  break label185;
                }
                localObject2 = "FINISHED";
                bool3 = ((String)localObject1).equals(localObject2);
                if (bool3)
                {
                  bool3 = i5;
                  break label185;
                }
                localObject2 = "ERROR";
                bool7 = ((String)localObject1).equals(localObject2);
                if (!bool7) {
                  break label1270;
                }
                bool3 = j;
                break label185;
              }
            }
            localObject2 = this.zzabj;
            if (localObject2 != null) {}
          }
          for (;;)
          {
            if (i5 != 0) {
              this.zzabj = ((long[])localObject1);
            }
            bool7 = i5;
            Object localObject4 = localObject1;
            for (;;)
            {
              label775:
              if (bool7)
              {
                this.zzabj = ((long[])localObject4);
                i9 |= 0x2;
              }
              localObject4 = "customData";
              i5 = paramJSONObject.has((String)localObject4);
              if (i5 != 0)
              {
                localObject4 = paramJSONObject.getJSONObject("customData");
                this.zzaaU = ((JSONObject)localObject4);
                i9 |= 0x2;
              }
              localObject4 = "media";
              i5 = paramJSONObject.has((String)localObject4);
              if (i5 != 0)
              {
                localObject4 = paramJSONObject.getJSONObject("media");
                localObject1 = new com/google/android/gms/cast/MediaInfo;
                ((MediaInfo)localObject1).<init>((JSONObject)localObject4);
                this.zzaaV = ((MediaInfo)localObject1);
                i9 |= 0x2;
                localObject1 = "metadata";
                i5 = ((JSONObject)localObject4).has((String)localObject1);
                if (i5 != 0) {
                  i9 |= 0x4;
                }
              }
              localObject4 = "currentItemId";
              i5 = paramJSONObject.has((String)localObject4);
              if (i5 != 0)
              {
                localObject4 = "currentItemId";
                i6 = paramJSONObject.getInt((String)localObject4);
                i15 = this.zzabl;
                if (i15 != i6)
                {
                  this.zzabl = i6;
                  i9 |= 0x2;
                }
              }
              localObject4 = "preloadedItemId";
              int i6 = paramJSONObject.optInt((String)localObject4, 0);
              i15 = this.zzabv;
              if (i15 != i6)
              {
                this.zzabv = i6;
                i9 |= 0x10;
              }
              localObject4 = "loadingItemId";
              i6 = paramJSONObject.optInt((String)localObject4, 0);
              i15 = this.zzabu;
              if (i15 != i6)
              {
                this.zzabu = i6;
                i9 |= 0x2;
              }
              i6 = this.zzabo;
              i15 = this.zzabu;
              int i7 = zzi(i6, i15);
              if (i7 == 0)
              {
                localObject4 = this.zzabw;
                i7 = MediaStatus.zza.zza((MediaStatus.zza)localObject4, paramJSONObject);
                if (i7 != 0) {
                  i9 |= 0x8;
                }
              }
              for (;;)
              {
                return i9;
                localObject2 = this.zzabj;
                int i2 = localObject2.length;
                if (i2 != j) {
                  break;
                }
                int i3 = 0;
                localObject2 = null;
                for (;;)
                {
                  if (i3 >= j) {
                    break label1258;
                  }
                  localObject3 = this.zzabj;
                  l1 = localObject3[i3];
                  l2 = localObject1[i3];
                  boolean bool2 = l1 < l2;
                  if (bool2) {
                    break;
                  }
                  i3 += 1;
                }
                localObject2 = this.zzabj;
                if (localObject2 == null) {
                  break label1240;
                }
                i15 = i7;
                i7 = 0;
                localObject4 = null;
                f3 = 0.0F;
                break label775;
                this.zzabl = 0;
                this.zzabu = 0;
                this.zzabv = 0;
                localObject4 = this.zzabw;
                i8 = ((MediaStatus.zza)localObject4).getItemCount();
                if (i8 > 0)
                {
                  localObject4 = this.zzabw;
                  MediaStatus.zza.zza((MediaStatus.zza)localObject4);
                  i9 |= 0x8;
                }
              }
              label1240:
              i8 = 0;
              localObject4 = null;
              f3 = 0.0F;
              i15 = 0;
              localObject1 = null;
            }
            label1258:
            int i8 = 0;
            localObject4 = null;
            f3 = 0.0F;
          }
          label1270:
          int i4 = 0;
          localObject2 = null;
        }
        label1279:
        int i15 = 0;
        localObject1 = null;
      }
      int i9 = 0;
      str1 = null;
    }
  }
  
  public long zznO()
  {
    return this.zzabm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */