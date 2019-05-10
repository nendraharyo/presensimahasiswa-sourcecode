package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final zzq zzaBA;
  private final int zzaBB;
  private final List zzawe;
  
  static
  {
    zzad localzzad = new com/google/android/gms/fitness/request/zzad;
    localzzad.<init>();
    CREATOR = localzzad;
  }
  
  StartBleScanRequest(int paramInt1, List paramList, IBinder paramIBinder1, int paramInt2, IBinder paramIBinder2)
  {
    this.mVersionCode = paramInt1;
    this.zzawe = paramList;
    Object localObject = zzq.zza.zzbU(paramIBinder1);
    this.zzaBA = ((zzq)localObject);
    this.zzaBB = paramInt2;
    localObject = zzow.zza.zzbR(paramIBinder2);
    this.zzaAD = ((zzow)localObject);
  }
  
  private StartBleScanRequest(StartBleScanRequest.Builder paramBuilder)
  {
    this(localArrayList, localzzq, i, null);
  }
  
  public StartBleScanRequest(StartBleScanRequest paramStartBleScanRequest, zzow paramzzow)
  {
    this(localList, localzzq, i, paramzzow);
  }
  
  public StartBleScanRequest(List paramList, zzq paramzzq, int paramInt, zzow paramzzow)
  {
    this.mVersionCode = 4;
    this.zzawe = paramList;
    this.zzaBA = paramzzq;
    this.zzaBB = paramInt;
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
  
  public List getDataTypes()
  {
    return Collections.unmodifiableList(this.zzawe);
  }
  
  public int getTimeoutSecs()
  {
    return this.zzaBB;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzawe;
    localzza = localzza.zzg("dataTypes", localObject);
    localObject = Integer.valueOf(this.zzaBB);
    return localzza.zzg("timeoutSecs", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzad.zza(this, paramParcel, paramInt);
  }
  
  public IBinder zzvg()
  {
    return this.zzaBA.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\StartBleScanRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */