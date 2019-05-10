package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConnectionInfo
  implements SafeParcelable
{
  public static final ConnectionInfoCreator CREATOR;
  private final int mVersionCode;
  private final String zzaDX;
  private final int zzaDY;
  
  static
  {
    ConnectionInfoCreator localConnectionInfoCreator = new com/google/android/gms/games/internal/ConnectionInfoCreator;
    localConnectionInfoCreator.<init>();
    CREATOR = localConnectionInfoCreator;
  }
  
  public ConnectionInfo(int paramInt1, String paramString, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzaDX = paramString;
    this.zzaDY = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ConnectionInfoCreator.zza(this, paramParcel, paramInt);
  }
  
  public String zzwt()
  {
    return this.zzaDX;
  }
  
  public int zzwu()
  {
    return this.zzaDY;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\ConnectionInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */