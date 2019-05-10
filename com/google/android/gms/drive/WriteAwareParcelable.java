package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzx;

public abstract class WriteAwareParcelable
  implements Parcelable
{
  private volatile transient boolean zzapw = false;
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = zzsT();
    if (!bool2) {}
    for (bool2 = bool1;; bool2 = false)
    {
      zzx.zzab(bool2);
      this.zzapw = bool1;
      zzJ(paramParcel, paramInt);
      return;
    }
  }
  
  protected abstract void zzJ(Parcel paramParcel, int paramInt);
  
  public final boolean zzsT()
  {
    return this.zzapw;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\WriteAwareParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */