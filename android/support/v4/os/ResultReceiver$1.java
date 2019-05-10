package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ResultReceiver$1
  implements Parcelable.Creator
{
  public ResultReceiver a(Parcel paramParcel)
  {
    ResultReceiver localResultReceiver = new android/support/v4/os/ResultReceiver;
    localResultReceiver.<init>(paramParcel);
    return localResultReceiver;
  }
  
  public ResultReceiver[] a(int paramInt)
  {
    return new ResultReceiver[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\os\ResultReceiver$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */