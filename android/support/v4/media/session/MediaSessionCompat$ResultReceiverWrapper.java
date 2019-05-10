package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

final class MediaSessionCompat$ResultReceiverWrapper
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private ResultReceiver a;
  
  static
  {
    MediaSessionCompat.ResultReceiverWrapper.1 local1 = new android/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  MediaSessionCompat$ResultReceiverWrapper(Parcel paramParcel)
  {
    ResultReceiver localResultReceiver = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel);
    this.a = localResultReceiver;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaSessionCompat$ResultReceiverWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */