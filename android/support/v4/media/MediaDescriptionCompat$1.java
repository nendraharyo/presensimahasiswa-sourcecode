package android.support.v4.media;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class MediaDescriptionCompat$1
  implements Parcelable.Creator
{
  public MediaDescriptionCompat a(Parcel paramParcel)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    MediaDescriptionCompat localMediaDescriptionCompat;
    if (i < j)
    {
      localMediaDescriptionCompat = new android/support/v4/media/MediaDescriptionCompat;
      localMediaDescriptionCompat.<init>(paramParcel);
    }
    for (;;)
    {
      return localMediaDescriptionCompat;
      localMediaDescriptionCompat = MediaDescriptionCompat.a(a.a(paramParcel));
    }
  }
  
  public MediaDescriptionCompat[] a(int paramInt)
  {
    return new MediaDescriptionCompat[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaDescriptionCompat$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */