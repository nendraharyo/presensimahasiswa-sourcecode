package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class MediaSessionCompat$QueueItem$1
  implements Parcelable.Creator
{
  public MediaSessionCompat.QueueItem a(Parcel paramParcel)
  {
    MediaSessionCompat.QueueItem localQueueItem = new android/support/v4/media/session/MediaSessionCompat$QueueItem;
    localQueueItem.<init>(paramParcel);
    return localQueueItem;
  }
  
  public MediaSessionCompat.QueueItem[] a(int paramInt)
  {
    return new MediaSessionCompat.QueueItem[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaSessionCompat$QueueItem$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */