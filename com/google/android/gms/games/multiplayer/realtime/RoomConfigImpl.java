package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

public final class RoomConfigImpl
  extends RoomConfig
{
  private final String zzUO;
  private final int zzaJJ;
  private final RoomUpdateListener zzaJU;
  private final RoomStatusUpdateListener zzaJV;
  private final RealTimeMessageReceivedListener zzaJW;
  private final Bundle zzaJZ;
  private final String[] zzaKa;
  
  RoomConfigImpl(RoomConfig.Builder paramBuilder)
  {
    Object localObject = paramBuilder.zzaJU;
    this.zzaJU = ((RoomUpdateListener)localObject);
    localObject = paramBuilder.zzaJV;
    this.zzaJV = ((RoomStatusUpdateListener)localObject);
    localObject = paramBuilder.zzaJW;
    this.zzaJW = ((RealTimeMessageReceivedListener)localObject);
    localObject = paramBuilder.zzaJX;
    this.zzUO = ((String)localObject);
    int i = paramBuilder.zzaJJ;
    this.zzaJJ = i;
    localObject = paramBuilder.zzaJZ;
    this.zzaJZ = ((Bundle)localObject);
    i = paramBuilder.zzaJY.size();
    ArrayList localArrayList = paramBuilder.zzaJY;
    localObject = new String[i];
    localObject = (String[])localArrayList.toArray((Object[])localObject);
    this.zzaKa = ((String[])localObject);
    zzx.zzb(this.zzaJW, "Must specify a message listener");
  }
  
  public Bundle getAutoMatchCriteria()
  {
    return this.zzaJZ;
  }
  
  public String getInvitationId()
  {
    return this.zzUO;
  }
  
  public String[] getInvitedPlayerIds()
  {
    return this.zzaKa;
  }
  
  public RealTimeMessageReceivedListener getMessageReceivedListener()
  {
    return this.zzaJW;
  }
  
  public RoomStatusUpdateListener getRoomStatusUpdateListener()
  {
    return this.zzaJV;
  }
  
  public RoomUpdateListener getRoomUpdateListener()
  {
    return this.zzaJU;
  }
  
  public int getVariant()
  {
    return this.zzaJJ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomConfigImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */