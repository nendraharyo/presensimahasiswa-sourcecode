package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;

public class EventParams
  implements SafeParcelable, Iterable
{
  public static final zzj CREATOR;
  public final int versionCode;
  private final Bundle zzaVS;
  
  static
  {
    zzj localzzj = new com/google/android/gms/measurement/internal/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  EventParams(int paramInt, Bundle paramBundle)
  {
    this.versionCode = paramInt;
    this.zzaVS = paramBundle;
  }
  
  EventParams(Bundle paramBundle)
  {
    zzx.zzz(paramBundle);
    this.zzaVS = paramBundle;
    this.versionCode = 1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  Object get(String paramString)
  {
    return this.zzaVS.get(paramString);
  }
  
  public Iterator iterator()
  {
    EventParams.1 local1 = new com/google/android/gms/measurement/internal/EventParams$1;
    local1.<init>(this);
    return local1;
  }
  
  public int size()
  {
    return this.zzaVS.size();
  }
  
  public String toString()
  {
    return this.zzaVS.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzCC()
  {
    Bundle localBundle1 = new android/os/Bundle;
    Bundle localBundle2 = this.zzaVS;
    localBundle1.<init>(localBundle2);
    return localBundle1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\EventParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */