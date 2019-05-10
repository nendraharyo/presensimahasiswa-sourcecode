package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.video.VideoBuffer;
import com.google.android.gms.games.video.Videos.ListVideosResult;

public final class GamesClientImpl$ListVideosResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Videos.ListVideosResult
{
  private final VideoBuffer zzaEx;
  
  public GamesClientImpl$ListVideosResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    VideoBuffer localVideoBuffer = new com/google/android/gms/games/video/VideoBuffer;
    localVideoBuffer.<init>(paramDataHolder);
    this.zzaEx = localVideoBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$ListVideosResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */