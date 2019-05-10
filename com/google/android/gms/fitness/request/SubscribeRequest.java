package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class SubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  private Subscription zzaBC;
  private final boolean zzaBD;
  
  static
  {
    zzaf localzzaf = new com/google/android/gms/fitness/request/zzaf;
    localzzaf.<init>();
    CREATOR = localzzaf;
  }
  
  SubscribeRequest(int paramInt, Subscription paramSubscription, boolean paramBoolean, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzaBC = paramSubscription;
    this.zzaBD = paramBoolean;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public SubscribeRequest(Subscription paramSubscription, boolean paramBoolean, zzow paramzzow)
  {
    this.mVersionCode = 3;
    this.zzaBC = paramSubscription;
    this.zzaBD = paramBoolean;
    this.zzaAD = paramzzow;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaAD;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaAD.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Subscription localSubscription = this.zzaBC;
    return localzza.zzg("subscription", localSubscription).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaf.zza(this, paramParcel, paramInt);
  }
  
  public Subscription zzvh()
  {
    return this.zzaBC;
  }
  
  public boolean zzvi()
  {
    return this.zzaBD;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SubscribeRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */