package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class PlaybackStateCompat$1
  implements Parcelable.Creator
{
  public PlaybackStateCompat a(Parcel paramParcel)
  {
    PlaybackStateCompat localPlaybackStateCompat = new android/support/v4/media/session/PlaybackStateCompat;
    localPlaybackStateCompat.<init>(paramParcel);
    return localPlaybackStateCompat;
  }
  
  public PlaybackStateCompat[] a(int paramInt)
  {
    return new PlaybackStateCompat[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\PlaybackStateCompat$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */