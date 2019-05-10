package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class MediaSessionCompat$Token$1
  implements Parcelable.Creator
{
  public MediaSessionCompat.Token a(Parcel paramParcel)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      i = 0;
    }
    for (Object localObject = paramParcel.readParcelable(null);; localObject = paramParcel.readStrongBinder())
    {
      MediaSessionCompat.Token localToken = new android/support/v4/media/session/MediaSessionCompat$Token;
      localToken.<init>(localObject);
      return localToken;
    }
  }
  
  public MediaSessionCompat.Token[] a(int paramInt)
  {
    return new MediaSessionCompat.Token[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaSessionCompat$Token$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */