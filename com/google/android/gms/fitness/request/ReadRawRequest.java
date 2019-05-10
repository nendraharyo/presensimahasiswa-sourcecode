package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzos;
import com.google.android.gms.internal.zzos.zza;
import java.util.List;

public class ReadRawRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final boolean zzaAP;
  private final boolean zzaAQ;
  private final zzos zzaBe;
  private final List zzaBf;
  
  static
  {
    zzt localzzt = new com/google/android/gms/fitness/request/zzt;
    localzzt.<init>();
    CREATOR = localzzt;
  }
  
  ReadRawRequest(int paramInt, IBinder paramIBinder, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mVersionCode = paramInt;
    zzos localzzos = zzos.zza.zzbN(paramIBinder);
    this.zzaBe = localzzos;
    this.zzaBf = paramList;
    this.zzaAP = paramBoolean1;
    this.zzaAQ = paramBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaBe;
    if (localObject != null) {}
    for (localObject = this.zzaBe.asBinder();; localObject = null) {
      return (IBinder)localObject;
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzt.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzuP()
  {
    return this.zzaAQ;
  }
  
  public boolean zzuQ()
  {
    return this.zzaAP;
  }
  
  public List zzuW()
  {
    return this.zzaBf;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\ReadRawRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */