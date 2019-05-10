package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class PlaybackStateCompat$CustomAction$1
  implements Parcelable.Creator
{
  public PlaybackStateCompat.CustomAction a(Parcel paramParcel)
  {
    PlaybackStateCompat.CustomAction localCustomAction = new android/support/v4/media/session/PlaybackStateCompat$CustomAction;
    localCustomAction.<init>(paramParcel);
    return localCustomAction;
  }
  
  public PlaybackStateCompat.CustomAction[] a(int paramInt)
  {
    return new PlaybackStateCompat.CustomAction[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\PlaybackStateCompat$CustomAction$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */