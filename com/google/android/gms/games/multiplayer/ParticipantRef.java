package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class ParticipantRef
  extends zzc
  implements Participant
{
  private final PlayerRef zzaJO;
  
  public ParticipantRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    PlayerRef localPlayerRef = new com/google/android/gms/games/PlayerRef;
    localPlayerRef.<init>(paramDataHolder, paramInt);
    this.zzaJO = localPlayerRef;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return ParticipantEntity.zza(this, paramObject);
  }
  
  public Participant freeze()
  {
    ParticipantEntity localParticipantEntity = new com/google/android/gms/games/multiplayer/ParticipantEntity;
    localParticipantEntity.<init>(this);
    return localParticipantEntity;
  }
  
  public int getCapabilities()
  {
    return getInteger("capabilities");
  }
  
  public String getDisplayName()
  {
    String str = "external_player_id";
    boolean bool = zzcB(str);
    if (bool) {}
    for (str = getString("default_display_name");; str = this.zzaJO.getDisplayName()) {
      return str;
    }
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool)
    {
      localObject = "default_display_name";
      zza((String)localObject, paramCharArrayBuffer);
    }
    for (;;)
    {
      return;
      localObject = this.zzaJO;
      ((PlayerRef)localObject).getDisplayName(paramCharArrayBuffer);
    }
  }
  
  public Uri getHiResImageUri()
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool) {}
    for (localObject = zzcA("default_display_hi_res_image_uri");; localObject = this.zzaJO.getHiResImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getHiResImageUrl()
  {
    String str = "external_player_id";
    boolean bool = zzcB(str);
    if (bool) {}
    for (str = getString("default_display_hi_res_image_url");; str = this.zzaJO.getHiResImageUrl()) {
      return str;
    }
  }
  
  public Uri getIconImageUri()
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool) {}
    for (localObject = zzcA("default_display_image_uri");; localObject = this.zzaJO.getIconImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getIconImageUrl()
  {
    String str = "external_player_id";
    boolean bool = zzcB(str);
    if (bool) {}
    for (str = getString("default_display_image_url");; str = this.zzaJO.getIconImageUrl()) {
      return str;
    }
  }
  
  public String getParticipantId()
  {
    return getString("external_participant_id");
  }
  
  public Player getPlayer()
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool) {
      bool = false;
    }
    for (localObject = null;; localObject = this.zzaJO) {
      return (Player)localObject;
    }
  }
  
  public ParticipantResult getResult()
  {
    Object localObject = "result_type";
    boolean bool = zzcB((String)localObject);
    if (bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (ParticipantResult)localObject;
      int i = getInteger("result_type");
      int j = getInteger("placing");
      localObject = new com/google/android/gms/games/multiplayer/ParticipantResult;
      String str = getParticipantId();
      ((ParticipantResult)localObject).<init>(str, i, j);
    }
  }
  
  public int getStatus()
  {
    return getInteger("player_status");
  }
  
  public int hashCode()
  {
    return ParticipantEntity.zza(this);
  }
  
  public boolean isConnectedToRoom()
  {
    String str = "connected";
    int i = getInteger(str);
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public String toString()
  {
    return ParticipantEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((ParticipantEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
  
  public String zzwt()
  {
    return getString("client_address");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */