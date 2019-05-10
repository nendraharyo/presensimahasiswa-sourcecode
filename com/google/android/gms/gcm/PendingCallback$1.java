package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class PendingCallback$1
  implements Parcelable.Creator
{
  public PendingCallback zzeJ(Parcel paramParcel)
  {
    PendingCallback localPendingCallback = new com/google/android/gms/gcm/PendingCallback;
    localPendingCallback.<init>(paramParcel);
    return localPendingCallback;
  }
  
  public PendingCallback[] zzhg(int paramInt)
  {
    return new PendingCallback[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\PendingCallback$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */