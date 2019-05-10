package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class EventRef
  extends zzc
  implements Event
{
  EventRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return EventEntity.zza(this, paramObject);
  }
  
  public Event freeze()
  {
    EventEntity localEventEntity = new com/google/android/gms/games/event/EventEntity;
    localEventEntity.<init>(this);
    return localEventEntity;
  }
  
  public String getDescription()
  {
    return getString("description");
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public String getEventId()
  {
    return getString("external_event_id");
  }
  
  public String getFormattedValue()
  {
    return getString("formatted_value");
  }
  
  public void getFormattedValue(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("formatted_value", paramCharArrayBuffer);
  }
  
  public Uri getIconImageUri()
  {
    return zzcA("icon_image_uri");
  }
  
  public String getIconImageUrl()
  {
    return getString("icon_image_url");
  }
  
  public String getName()
  {
    return getString("name");
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("name", paramCharArrayBuffer);
  }
  
  public Player getPlayer()
  {
    PlayerRef localPlayerRef = new com/google/android/gms/games/PlayerRef;
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    localPlayerRef.<init>(localDataHolder, i);
    return localPlayerRef;
  }
  
  public long getValue()
  {
    return getLong("value");
  }
  
  public int hashCode()
  {
    return EventEntity.zza(this);
  }
  
  public boolean isVisible()
  {
    return getBoolean("visibility");
  }
  
  public String toString()
  {
    return EventEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((EventEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\event\EventRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */