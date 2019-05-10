package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AddListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final zzaw zzbrB;
  public final IntentFilter[] zzbrC;
  public final String zzbrD;
  public final String zzbrE;
  
  static
  {
    zzc localzzc = new com/google/android/gms/wearable/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  AddListenerRequest(int paramInt, IBinder paramIBinder, IntentFilter[] paramArrayOfIntentFilter, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    zzaw localzzaw;
    if (paramIBinder != null) {
      localzzaw = zzaw.zza.zzet(paramIBinder);
    }
    for (this.zzbrB = localzzaw;; this.zzbrB = null)
    {
      this.zzbrC = paramArrayOfIntentFilter;
      this.zzbrD = paramString1;
      this.zzbrE = paramString2;
      return;
      localzzaw = null;
    }
  }
  
  public AddListenerRequest(zzbq paramzzbq)
  {
    this.mVersionCode = 1;
    this.zzbrB = paramzzbq;
    Object localObject = paramzzbq.zzIO();
    this.zzbrC = ((IntentFilter[])localObject);
    localObject = paramzzbq.zzIP();
    this.zzbrD = ((String)localObject);
    this.zzbrE = null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzIy()
  {
    Object localObject = this.zzbrB;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbrB.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\AddListenerRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */