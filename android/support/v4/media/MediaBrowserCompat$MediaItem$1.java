package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class MediaBrowserCompat$MediaItem$1
  implements Parcelable.Creator
{
  public MediaBrowserCompat.MediaItem a(Parcel paramParcel)
  {
    MediaBrowserCompat.MediaItem localMediaItem = new android/support/v4/media/MediaBrowserCompat$MediaItem;
    localMediaItem.<init>(paramParcel);
    return localMediaItem;
  }
  
  public MediaBrowserCompat.MediaItem[] a(int paramInt)
  {
    return new MediaBrowserCompat.MediaItem[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaBrowserCompat$MediaItem$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */