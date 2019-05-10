package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import org.json.JSONObject;

public class RemoteMediaPlayer
  implements Cast.MessageReceivedCallback
{
  public static final int RESUME_STATE_PAUSE = 2;
  public static final int RESUME_STATE_PLAY = 1;
  public static final int RESUME_STATE_UNCHANGED = 0;
  public static final int STATUS_CANCELED = 2101;
  public static final int STATUS_FAILED = 2100;
  public static final int STATUS_REPLACED = 2103;
  public static final int STATUS_SUCCEEDED = 0;
  public static final int STATUS_TIMED_OUT = 2102;
  private final zzm zzabE;
  private final RemoteMediaPlayer.zza zzabF;
  private RemoteMediaPlayer.OnPreloadStatusUpdatedListener zzabG;
  private RemoteMediaPlayer.OnQueueStatusUpdatedListener zzabH;
  private RemoteMediaPlayer.OnMetadataUpdatedListener zzabI;
  private RemoteMediaPlayer.OnStatusUpdatedListener zzabJ;
  private final Object zzpV;
  
  public RemoteMediaPlayer()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new com/google/android/gms/cast/RemoteMediaPlayer$zza;
    ((RemoteMediaPlayer.zza)localObject).<init>(this);
    this.zzabF = ((RemoteMediaPlayer.zza)localObject);
    localObject = new com/google/android/gms/cast/RemoteMediaPlayer$1;
    ((RemoteMediaPlayer.1)localObject).<init>(this, null);
    this.zzabE = ((zzm)localObject);
    localObject = this.zzabE;
    RemoteMediaPlayer.zza localzza = this.zzabF;
    ((zzm)localObject).zza(localzza);
  }
  
  private void onMetadataUpdated()
  {
    RemoteMediaPlayer.OnMetadataUpdatedListener localOnMetadataUpdatedListener = this.zzabI;
    if (localOnMetadataUpdatedListener != null)
    {
      localOnMetadataUpdatedListener = this.zzabI;
      localOnMetadataUpdatedListener.onMetadataUpdated();
    }
  }
  
  private void onPreloadStatusUpdated()
  {
    RemoteMediaPlayer.OnPreloadStatusUpdatedListener localOnPreloadStatusUpdatedListener = this.zzabG;
    if (localOnPreloadStatusUpdatedListener != null)
    {
      localOnPreloadStatusUpdatedListener = this.zzabG;
      localOnPreloadStatusUpdatedListener.onPreloadStatusUpdated();
    }
  }
  
  private void onQueueStatusUpdated()
  {
    RemoteMediaPlayer.OnQueueStatusUpdatedListener localOnQueueStatusUpdatedListener = this.zzabH;
    if (localOnQueueStatusUpdatedListener != null)
    {
      localOnQueueStatusUpdatedListener = this.zzabH;
      localOnQueueStatusUpdatedListener.onQueueStatusUpdated();
    }
  }
  
  private void onStatusUpdated()
  {
    RemoteMediaPlayer.OnStatusUpdatedListener localOnStatusUpdatedListener = this.zzabJ;
    if (localOnStatusUpdatedListener != null)
    {
      localOnStatusUpdatedListener = this.zzabJ;
      localOnStatusUpdatedListener.onStatusUpdated();
    }
  }
  
  private int zzbf(int paramInt)
  {
    MediaStatus localMediaStatus = getMediaStatus();
    int i = 0;
    int j = localMediaStatus.getQueueItemCount();
    if (i < j)
    {
      MediaQueueItem localMediaQueueItem = localMediaStatus.getQueueItem(i);
      j = localMediaQueueItem.getItemId();
      if (j != paramInt) {}
    }
    for (;;)
    {
      return i;
      i += 1;
      break;
      i = -1;
    }
  }
  
  public long getApproximateStreamPosition()
  {
    synchronized (this.zzpV)
    {
      zzm localzzm = this.zzabE;
      long l = localzzm.getApproximateStreamPosition();
      return l;
    }
  }
  
  public MediaInfo getMediaInfo()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzabE;
      localObject2 = ((zzm)localObject2).getMediaInfo();
      return (MediaInfo)localObject2;
    }
  }
  
  public MediaStatus getMediaStatus()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzabE;
      localObject2 = ((zzm)localObject2).getMediaStatus();
      return (MediaStatus)localObject2;
    }
  }
  
  public String getNamespace()
  {
    return this.zzabE.getNamespace();
  }
  
  public long getStreamDuration()
  {
    synchronized (this.zzpV)
    {
      zzm localzzm = this.zzabE;
      long l = localzzm.getStreamDuration();
      return l;
    }
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo)
  {
    return load(paramGoogleApiClient, paramMediaInfo, true, 0L, null, null);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, 0L, null, null);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, null, null);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, JSONObject paramJSONObject)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, null, paramJSONObject);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, long[] paramArrayOfLong, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.12 local12 = new com/google/android/gms/cast/RemoteMediaPlayer$12;
    local12.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, paramArrayOfLong, paramJSONObject);
    return paramGoogleApiClient.zzb(local12);
  }
  
  public void onMessageReceived(CastDevice paramCastDevice, String paramString1, String paramString2)
  {
    this.zzabE.zzcf(paramString2);
  }
  
  public PendingResult pause(GoogleApiClient paramGoogleApiClient)
  {
    return pause(paramGoogleApiClient, null);
  }
  
  public PendingResult pause(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.17 local17 = new com/google/android/gms/cast/RemoteMediaPlayer$17;
    local17.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject);
    return paramGoogleApiClient.zzb(local17);
  }
  
  public PendingResult play(GoogleApiClient paramGoogleApiClient)
  {
    return play(paramGoogleApiClient, null);
  }
  
  public PendingResult play(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.19 local19 = new com/google/android/gms/cast/RemoteMediaPlayer$19;
    local19.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject);
    return paramGoogleApiClient.zzb(local19);
  }
  
  public PendingResult queueAppendItem(GoogleApiClient paramGoogleApiClient, MediaQueueItem paramMediaQueueItem, JSONObject paramJSONObject)
  {
    MediaQueueItem[] arrayOfMediaQueueItem = new MediaQueueItem[1];
    arrayOfMediaQueueItem[0] = paramMediaQueueItem;
    return queueInsertItems(paramGoogleApiClient, arrayOfMediaQueueItem, 0, paramJSONObject);
  }
  
  public PendingResult queueInsertAndPlayItem(GoogleApiClient paramGoogleApiClient, MediaQueueItem paramMediaQueueItem, int paramInt, long paramLong, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.6 local6 = new com/google/android/gms/cast/RemoteMediaPlayer$6;
    local6.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramMediaQueueItem, paramInt, paramLong, paramJSONObject);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult queueInsertAndPlayItem(GoogleApiClient paramGoogleApiClient, MediaQueueItem paramMediaQueueItem, int paramInt, JSONObject paramJSONObject)
  {
    return queueInsertAndPlayItem(paramGoogleApiClient, paramMediaQueueItem, paramInt, -1, paramJSONObject);
  }
  
  public PendingResult queueInsertItems(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.5 local5 = new com/google/android/gms/cast/RemoteMediaPlayer$5;
    local5.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfMediaQueueItem, paramInt, paramJSONObject);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public PendingResult queueJumpToItem(GoogleApiClient paramGoogleApiClient, int paramInt, long paramLong, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.15 local15 = new com/google/android/gms/cast/RemoteMediaPlayer$15;
    local15.<init>(this, paramGoogleApiClient, paramInt, paramGoogleApiClient, paramLong, paramJSONObject);
    return paramGoogleApiClient.zzb(local15);
  }
  
  public PendingResult queueJumpToItem(GoogleApiClient paramGoogleApiClient, int paramInt, JSONObject paramJSONObject)
  {
    return queueJumpToItem(paramGoogleApiClient, paramInt, -1, paramJSONObject);
  }
  
  public PendingResult queueLoad(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, long paramLong, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.4 local4 = new com/google/android/gms/cast/RemoteMediaPlayer$4;
    local4.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfMediaQueueItem, paramInt1, paramInt2, paramLong, paramJSONObject);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult queueLoad(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, JSONObject paramJSONObject)
  {
    return queueLoad(paramGoogleApiClient, paramArrayOfMediaQueueItem, paramInt1, paramInt2, -1, paramJSONObject);
  }
  
  public PendingResult queueMoveItemToNewIndex(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.16 local16 = new com/google/android/gms/cast/RemoteMediaPlayer$16;
    local16.<init>(this, paramGoogleApiClient, paramInt1, paramInt2, paramGoogleApiClient, paramJSONObject);
    return paramGoogleApiClient.zzb(local16);
  }
  
  public PendingResult queueNext(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.11 local11 = new com/google/android/gms/cast/RemoteMediaPlayer$11;
    local11.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject);
    return paramGoogleApiClient.zzb(local11);
  }
  
  public PendingResult queuePrev(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.10 local10 = new com/google/android/gms/cast/RemoteMediaPlayer$10;
    local10.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject);
    return paramGoogleApiClient.zzb(local10);
  }
  
  public PendingResult queueRemoveItem(GoogleApiClient paramGoogleApiClient, int paramInt, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.14 local14 = new com/google/android/gms/cast/RemoteMediaPlayer$14;
    local14.<init>(this, paramGoogleApiClient, paramInt, paramGoogleApiClient, paramJSONObject);
    return paramGoogleApiClient.zzb(local14);
  }
  
  public PendingResult queueRemoveItems(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.8 local8 = new com/google/android/gms/cast/RemoteMediaPlayer$8;
    local8.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfInt, paramJSONObject);
    return paramGoogleApiClient.zzb(local8);
  }
  
  public PendingResult queueReorderItems(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, int paramInt, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.9 local9 = new com/google/android/gms/cast/RemoteMediaPlayer$9;
    local9.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfInt, paramInt, paramJSONObject);
    return paramGoogleApiClient.zzb(local9);
  }
  
  public PendingResult queueSetRepeatMode(GoogleApiClient paramGoogleApiClient, int paramInt, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.13 local13 = new com/google/android/gms/cast/RemoteMediaPlayer$13;
    local13.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramInt, paramJSONObject);
    return paramGoogleApiClient.zzb(local13);
  }
  
  public PendingResult queueUpdateItems(GoogleApiClient paramGoogleApiClient, MediaQueueItem[] paramArrayOfMediaQueueItem, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.7 local7 = new com/google/android/gms/cast/RemoteMediaPlayer$7;
    local7.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfMediaQueueItem, paramJSONObject);
    return paramGoogleApiClient.zzb(local7);
  }
  
  public PendingResult requestStatus(GoogleApiClient paramGoogleApiClient)
  {
    RemoteMediaPlayer.23 local23 = new com/google/android/gms/cast/RemoteMediaPlayer$23;
    local23.<init>(this, paramGoogleApiClient, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local23);
  }
  
  public PendingResult seek(GoogleApiClient paramGoogleApiClient, long paramLong)
  {
    return seek(paramGoogleApiClient, paramLong, 0, null);
  }
  
  public PendingResult seek(GoogleApiClient paramGoogleApiClient, long paramLong, int paramInt)
  {
    return seek(paramGoogleApiClient, paramLong, paramInt, null);
  }
  
  public PendingResult seek(GoogleApiClient paramGoogleApiClient, long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.20 local20 = new com/google/android/gms/cast/RemoteMediaPlayer$20;
    local20.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramLong, paramInt, paramJSONObject);
    return paramGoogleApiClient.zzb(local20);
  }
  
  public PendingResult setActiveMediaTracks(GoogleApiClient paramGoogleApiClient, long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("trackIds cannot be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/cast/RemoteMediaPlayer$2;
    ((RemoteMediaPlayer.2)localObject).<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramArrayOfLong);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
  
  public void setOnMetadataUpdatedListener(RemoteMediaPlayer.OnMetadataUpdatedListener paramOnMetadataUpdatedListener)
  {
    this.zzabI = paramOnMetadataUpdatedListener;
  }
  
  public void setOnPreloadStatusUpdatedListener(RemoteMediaPlayer.OnPreloadStatusUpdatedListener paramOnPreloadStatusUpdatedListener)
  {
    this.zzabG = paramOnPreloadStatusUpdatedListener;
  }
  
  public void setOnQueueStatusUpdatedListener(RemoteMediaPlayer.OnQueueStatusUpdatedListener paramOnQueueStatusUpdatedListener)
  {
    this.zzabH = paramOnQueueStatusUpdatedListener;
  }
  
  public void setOnStatusUpdatedListener(RemoteMediaPlayer.OnStatusUpdatedListener paramOnStatusUpdatedListener)
  {
    this.zzabJ = paramOnStatusUpdatedListener;
  }
  
  public PendingResult setStreamMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return setStreamMute(paramGoogleApiClient, paramBoolean, null);
  }
  
  public PendingResult setStreamMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.22 local22 = new com/google/android/gms/cast/RemoteMediaPlayer$22;
    local22.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramBoolean, paramJSONObject);
    return paramGoogleApiClient.zzb(local22);
  }
  
  public PendingResult setStreamVolume(GoogleApiClient paramGoogleApiClient, double paramDouble)
  {
    return setStreamVolume(paramGoogleApiClient, paramDouble, null);
  }
  
  public PendingResult setStreamVolume(GoogleApiClient paramGoogleApiClient, double paramDouble, JSONObject paramJSONObject)
  {
    boolean bool = Double.isInfinite(paramDouble);
    if (!bool)
    {
      bool = Double.isNaN(paramDouble);
      if (!bool) {}
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
    Object localObject1 = new com/google/android/gms/cast/RemoteMediaPlayer$21;
    Object localObject2 = this;
    ((RemoteMediaPlayer.21)localObject1).<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramDouble, paramJSONObject);
    return paramGoogleApiClient.zzb((zza.zza)localObject1);
  }
  
  public PendingResult setTextTrackStyle(GoogleApiClient paramGoogleApiClient, TextTrackStyle paramTextTrackStyle)
  {
    if (paramTextTrackStyle == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("trackStyle cannot be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/cast/RemoteMediaPlayer$3;
    ((RemoteMediaPlayer.3)localObject).<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramTextTrackStyle);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
  
  public PendingResult stop(GoogleApiClient paramGoogleApiClient)
  {
    return stop(paramGoogleApiClient, null);
  }
  
  public PendingResult stop(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    RemoteMediaPlayer.18 local18 = new com/google/android/gms/cast/RemoteMediaPlayer$18;
    local18.<init>(this, paramGoogleApiClient, paramGoogleApiClient, paramJSONObject);
    return paramGoogleApiClient.zzb(local18);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */