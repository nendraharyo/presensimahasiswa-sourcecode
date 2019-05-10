package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final boolean a = false;
  final Handler b = null;
  b c;
  
  static
  {
    ResultReceiver.1 local1 = new android/support/v4/os/ResultReceiver$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  ResultReceiver(Parcel paramParcel)
  {
    b localb = b.a.a(paramParcel.readStrongBinder());
    this.c = localb;
  }
  
  protected void a(int paramInt, Bundle paramBundle) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      Object localObject1 = this.c;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v4/os/ResultReceiver$a;
        ((ResultReceiver.a)localObject1).<init>(this);
        this.c = ((b)localObject1);
      }
      localObject1 = this.c;
      localObject1 = ((b)localObject1).asBinder();
      paramParcel.writeStrongBinder((IBinder)localObject1);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\os\ResultReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */