package com.google.android.gms.games.video;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface Video
  extends Parcelable, Freezable
{
  public abstract int getDuration();
  
  public abstract long getFileSize();
  
  public abstract String getPackageName();
  
  public abstract long getStartTime();
  
  public abstract String zzxX();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\video\Video.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */