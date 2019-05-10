package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class MessengerCompat$1
  implements Parcelable.Creator
{
  public MessengerCompat zzeO(Parcel paramParcel)
  {
    IBinder localIBinder = paramParcel.readStrongBinder();
    MessengerCompat localMessengerCompat;
    if (localIBinder != null)
    {
      localMessengerCompat = new com/google/android/gms/iid/MessengerCompat;
      localMessengerCompat.<init>(localIBinder);
    }
    for (;;)
    {
      return localMessengerCompat;
      localMessengerCompat = null;
    }
  }
  
  public MessengerCompat[] zzhm(int paramInt)
  {
    return new MessengerCompat[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\MessengerCompat$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */