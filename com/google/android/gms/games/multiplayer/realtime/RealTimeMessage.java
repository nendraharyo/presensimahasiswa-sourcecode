package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzx;

public final class RealTimeMessage
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int RELIABLE = 1;
  public static final int UNRELIABLE;
  private final String zzaJR;
  private final byte[] zzaJS;
  private final int zzaJT;
  
  static
  {
    RealTimeMessage.1 local1 = new com/google/android/gms/games/multiplayer/realtime/RealTimeMessage$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private RealTimeMessage(Parcel paramParcel)
  {
    this(str, arrayOfByte, i);
  }
  
  public RealTimeMessage(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = (String)zzx.zzz(paramString);
    this.zzaJR = ((String)localObject);
    localObject = (byte[])((byte[])zzx.zzz(paramArrayOfByte)).clone();
    this.zzaJS = ((byte[])localObject);
    this.zzaJT = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public byte[] getMessageData()
  {
    return this.zzaJS;
  }
  
  public String getSenderParticipantId()
  {
    return this.zzaJR;
  }
  
  public boolean isReliable()
  {
    int i = 1;
    int j = this.zzaJT;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.zzaJR;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaJS;
    paramParcel.writeByteArray((byte[])localObject);
    int i = this.zzaJT;
    paramParcel.writeInt(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RealTimeMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */