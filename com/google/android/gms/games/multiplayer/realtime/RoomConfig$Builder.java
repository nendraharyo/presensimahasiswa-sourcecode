package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class RoomConfig$Builder
{
  int zzaJJ = -1;
  final RoomUpdateListener zzaJU;
  RoomStatusUpdateListener zzaJV;
  RealTimeMessageReceivedListener zzaJW;
  String zzaJX = null;
  ArrayList zzaJY;
  Bundle zzaJZ;
  
  private RoomConfig$Builder(RoomUpdateListener paramRoomUpdateListener)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaJY = ((ArrayList)localObject);
    localObject = (RoomUpdateListener)zzx.zzb(paramRoomUpdateListener, "Must provide a RoomUpdateListener");
    this.zzaJU = ((RoomUpdateListener)localObject);
  }
  
  public Builder addPlayersToInvite(ArrayList paramArrayList)
  {
    zzx.zzz(paramArrayList);
    this.zzaJY.addAll(paramArrayList);
    return this;
  }
  
  public Builder addPlayersToInvite(String... paramVarArgs)
  {
    zzx.zzz(paramVarArgs);
    ArrayList localArrayList = this.zzaJY;
    List localList = Arrays.asList(paramVarArgs);
    localArrayList.addAll(localList);
    return this;
  }
  
  public RoomConfig build()
  {
    RoomConfigImpl localRoomConfigImpl = new com/google/android/gms/games/multiplayer/realtime/RoomConfigImpl;
    localRoomConfigImpl.<init>(this);
    return localRoomConfigImpl;
  }
  
  public Builder setAutoMatchCriteria(Bundle paramBundle)
  {
    this.zzaJZ = paramBundle;
    return this;
  }
  
  public Builder setInvitationIdToAccept(String paramString)
  {
    zzx.zzz(paramString);
    this.zzaJX = paramString;
    return this;
  }
  
  public Builder setMessageReceivedListener(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
  {
    this.zzaJW = paramRealTimeMessageReceivedListener;
    return this;
  }
  
  public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener paramRoomStatusUpdateListener)
  {
    this.zzaJV = paramRoomStatusUpdateListener;
    return this;
  }
  
  public Builder setVariant(int paramInt)
  {
    int i = -1;
    if ((paramInt == i) || (paramInt > 0)) {}
    for (i = 1;; i = 0)
    {
      zzx.zzb(i, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
      this.zzaJJ = paramInt;
      return this;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomConfig$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */