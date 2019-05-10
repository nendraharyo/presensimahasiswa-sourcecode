package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestRef
  extends zzc
  implements GameRequest
{
  private final int zzaDQ;
  
  public GameRequestRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.zzaDQ = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return GameRequestEntity.zza(this, paramObject);
  }
  
  public GameRequest freeze()
  {
    GameRequestEntity localGameRequestEntity = new com/google/android/gms/games/request/GameRequestEntity;
    localGameRequestEntity.<init>(this);
    return localGameRequestEntity;
  }
  
  public long getCreationTimestamp()
  {
    return getLong("creation_timestamp");
  }
  
  public byte[] getData()
  {
    return getByteArray("data");
  }
  
  public long getExpirationTimestamp()
  {
    return getLong("expiration_timestamp");
  }
  
  public Game getGame()
  {
    GameRef localGameRef = new com/google/android/gms/games/GameRef;
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    localGameRef.<init>(localDataHolder, i);
    return localGameRef;
  }
  
  public int getRecipientStatus(String paramString)
  {
    int i = this.zzaje;
    int j = this.zzaje;
    int k = this.zzaDQ;
    j += k;
    Object localObject;
    String str;
    if (i < j)
    {
      DataHolder localDataHolder = this.zzahi;
      j = localDataHolder.zzbH(i);
      localObject = this.zzahi;
      str = "recipient_external_player_id";
      localObject = ((DataHolder)localObject).zzd(str, i, j);
      boolean bool = ((String)localObject).equals(paramString);
      if (bool)
      {
        localObject = this.zzahi;
        str = "recipient_status";
      }
    }
    for (i = ((DataHolder)localObject).zzc(str, i, j);; i = -1)
    {
      return i;
      i += 1;
      break;
    }
  }
  
  public List getRecipients()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.zzaDQ;
    localArrayList.<init>(i);
    i = 0;
    for (;;)
    {
      int j = this.zzaDQ;
      if (i >= j) {
        break;
      }
      PlayerRef localPlayerRef = new com/google/android/gms/games/PlayerRef;
      DataHolder localDataHolder = this.zzahi;
      int k = this.zzaje + i;
      String str = "recipient_";
      localPlayerRef.<init>(localDataHolder, k, str);
      localArrayList.add(localPlayerRef);
      i += 1;
    }
    return localArrayList;
  }
  
  public String getRequestId()
  {
    return getString("external_request_id");
  }
  
  public Player getSender()
  {
    PlayerRef localPlayerRef = new com/google/android/gms/games/PlayerRef;
    DataHolder localDataHolder = this.zzahi;
    int i = zzqc();
    localPlayerRef.<init>(localDataHolder, i, "sender_");
    return localPlayerRef;
  }
  
  public int getStatus()
  {
    return getInteger("status");
  }
  
  public int getType()
  {
    return getInteger("type");
  }
  
  public int hashCode()
  {
    return GameRequestEntity.zza(this);
  }
  
  public boolean isConsumed(String paramString)
  {
    int i = 1;
    int j = getRecipientStatus(paramString);
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public String toString()
  {
    return GameRequestEntity.zzc(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((GameRequestEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\request\GameRequestRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */