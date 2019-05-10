package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Command$1
  implements Parcelable.Creator
{
  public Command[] zzag(int paramInt)
  {
    return new Command[paramInt];
  }
  
  public Command zzq(Parcel paramParcel)
  {
    Command localCommand = new com/google/android/gms/analytics/internal/Command;
    localCommand.<init>(paramParcel);
    return localCommand;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\Command$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */