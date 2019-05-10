package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private boolean zzahx;
  IBinder zzakA;
  private ConnectionResult zzams;
  private boolean zzamt;
  
  static
  {
    zzz localzzz = new com/google/android/gms/common/internal/zzz;
    localzzz.<init>();
    CREATOR = localzzz;
  }
  
  ResolveAccountResponse(int paramInt, IBinder paramIBinder, ConnectionResult paramConnectionResult, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mVersionCode = paramInt;
    this.zzakA = paramIBinder;
    this.zzams = paramConnectionResult;
    this.zzahx = paramBoolean1;
    this.zzamt = paramBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ResolveAccountResponse;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ResolveAccountResponse)paramObject;
        Object localObject1 = this.zzams;
        Object localObject2 = ((ResolveAccountResponse)paramObject).zzams;
        bool2 = ((ConnectionResult)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = zzqX();
          localObject2 = ((ResolveAccountResponse)paramObject).zzqX();
          bool2 = localObject1.equals(localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzz.zza(this, paramParcel, paramInt);
  }
  
  public zzp zzqX()
  {
    return zzp.zza.zzaP(this.zzakA);
  }
  
  public ConnectionResult zzqY()
  {
    return this.zzams;
  }
  
  public boolean zzqZ()
  {
    return this.zzahx;
  }
  
  public boolean zzra()
  {
    return this.zzamt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\ResolveAccountResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */