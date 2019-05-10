package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class RatingCompat$1
  implements Parcelable.Creator
{
  public RatingCompat a(Parcel paramParcel)
  {
    RatingCompat localRatingCompat = new android/support/v4/media/RatingCompat;
    int i = paramParcel.readInt();
    float f = paramParcel.readFloat();
    localRatingCompat.<init>(i, f);
    return localRatingCompat;
  }
  
  public RatingCompat[] a(int paramInt)
  {
    return new RatingCompat[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\RatingCompat$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */