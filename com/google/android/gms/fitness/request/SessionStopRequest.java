package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzov.zza;

public class SessionStopRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  private final int mVersionCode;
  private final zzov zzaBz;
  private final String zzaxk;
  
  static
  {
    zzab localzzab = new com/google/android/gms/fitness/request/zzab;
    localzzab.<init>();
    CREATOR = localzzab;
  }
  
  SessionStopRequest(int paramInt, String paramString1, String paramString2, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.mName = paramString1;
    this.zzaxk = paramString2;
    zzov localzzov = zzov.zza.zzbQ(paramIBinder);
    this.zzaBz = localzzov;
  }
  
  public SessionStopRequest(String paramString1, String paramString2, zzov paramzzov)
  {
    this.mVersionCode = 3;
    this.mName = paramString1;
    this.zzaxk = paramString2;
    this.zzaBz = paramzzov;
  }
  
  private boolean zzb(SessionStopRequest paramSessionStopRequest)
  {
    String str1 = this.mName;
    String str2 = paramSessionStopRequest.mName;
    boolean bool = zzw.equal(str1, str2);
    if (bool)
    {
      str1 = this.zzaxk;
      str2 = paramSessionStopRequest.zzaxk;
      bool = zzw.equal(str1, str2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof SessionStopRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionStopRequest)paramObject;
      bool = zzb((SessionStopRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaBz;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaBz.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public String getIdentifier()
  {
    return this.zzaxk;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    String str = this.mName;
    arrayOfObject[0] = str;
    str = this.zzaxk;
    arrayOfObject[1] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    String str = this.mName;
    localzza = localzza.zzg("name", str);
    str = this.zzaxk;
    return localzza.zzg("identifier", str).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzab.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SessionStopRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */