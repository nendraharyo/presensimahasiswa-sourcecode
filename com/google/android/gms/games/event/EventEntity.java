package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class EventEntity
  implements SafeParcelable, Event
{
  public static final EventEntityCreator CREATOR;
  private final String mName;
  private final int mVersionCode;
  private final Uri zzaCd;
  private final String zzaCo;
  private final String zzaDU;
  private final long zzaDV;
  private final String zzaDW;
  private final PlayerEntity zzaDq;
  private final String zzaxl;
  private final boolean zzsj;
  
  static
  {
    EventEntityCreator localEventEntityCreator = new com/google/android/gms/games/event/EventEntityCreator;
    localEventEntityCreator.<init>();
    CREATOR = localEventEntityCreator;
  }
  
  EventEntity(int paramInt, String paramString1, String paramString2, String paramString3, Uri paramUri, String paramString4, Player paramPlayer, long paramLong, String paramString5, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzaDU = paramString1;
    this.mName = paramString2;
    this.zzaxl = paramString3;
    this.zzaCd = paramUri;
    this.zzaCo = paramString4;
    PlayerEntity localPlayerEntity = new com/google/android/gms/games/PlayerEntity;
    localPlayerEntity.<init>(paramPlayer);
    this.zzaDq = localPlayerEntity;
    this.zzaDV = paramLong;
    this.zzaDW = paramString5;
    this.zzsj = paramBoolean;
  }
  
  public EventEntity(Event paramEvent)
  {
    this.mVersionCode = 1;
    Object localObject = paramEvent.getEventId();
    this.zzaDU = ((String)localObject);
    localObject = paramEvent.getName();
    this.mName = ((String)localObject);
    localObject = paramEvent.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = paramEvent.getIconImageUri();
    this.zzaCd = ((Uri)localObject);
    localObject = paramEvent.getIconImageUrl();
    this.zzaCo = ((String)localObject);
    localObject = (PlayerEntity)paramEvent.getPlayer().freeze();
    this.zzaDq = ((PlayerEntity)localObject);
    long l = paramEvent.getValue();
    this.zzaDV = l;
    localObject = paramEvent.getFormattedValue();
    this.zzaDW = ((String)localObject);
    boolean bool = paramEvent.isVisible();
    this.zzsj = bool;
  }
  
  static int zza(Event paramEvent)
  {
    Object[] arrayOfObject = new Object[9];
    Object localObject = paramEvent.getEventId();
    arrayOfObject[0] = localObject;
    localObject = paramEvent.getName();
    arrayOfObject[1] = localObject;
    localObject = paramEvent.getDescription();
    arrayOfObject[2] = localObject;
    localObject = paramEvent.getIconImageUri();
    arrayOfObject[3] = localObject;
    localObject = paramEvent.getIconImageUrl();
    arrayOfObject[4] = localObject;
    localObject = paramEvent.getPlayer();
    arrayOfObject[5] = localObject;
    localObject = Long.valueOf(paramEvent.getValue());
    arrayOfObject[6] = localObject;
    localObject = paramEvent.getFormattedValue();
    arrayOfObject[7] = localObject;
    localObject = Boolean.valueOf(paramEvent.isVisible());
    arrayOfObject[8] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Event paramEvent, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Event;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramEvent != paramObject)
      {
        paramObject = (Event)paramObject;
        Object localObject1 = ((Event)paramObject).getEventId();
        Object localObject2 = paramEvent.getEventId();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Event)paramObject).getName();
          localObject2 = paramEvent.getName();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((Event)paramObject).getDescription();
            localObject2 = paramEvent.getDescription();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((Event)paramObject).getIconImageUri();
              localObject2 = paramEvent.getIconImageUri();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Event)paramObject).getIconImageUrl();
                localObject2 = paramEvent.getIconImageUrl();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((Event)paramObject).getPlayer();
                  localObject2 = paramEvent.getPlayer();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    long l1 = ((Event)paramObject).getValue();
                    localObject1 = Long.valueOf(l1);
                    long l2 = paramEvent.getValue();
                    localObject2 = Long.valueOf(l2);
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = ((Event)paramObject).getFormattedValue();
                      localObject2 = paramEvent.getFormattedValue();
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = Boolean.valueOf(((Event)paramObject).isVisible());
                        boolean bool3 = paramEvent.isVisible();
                        localObject2 = Boolean.valueOf(bool3);
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2) {
                          continue;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(Event paramEvent)
  {
    zzw.zza localzza = zzw.zzy(paramEvent);
    Object localObject = paramEvent.getEventId();
    localzza = localzza.zzg("Id", localObject);
    localObject = paramEvent.getName();
    localzza = localzza.zzg("Name", localObject);
    localObject = paramEvent.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = paramEvent.getIconImageUri();
    localzza = localzza.zzg("IconImageUri", localObject);
    localObject = paramEvent.getIconImageUrl();
    localzza = localzza.zzg("IconImageUrl", localObject);
    localObject = paramEvent.getPlayer();
    localzza = localzza.zzg("Player", localObject);
    localObject = Long.valueOf(paramEvent.getValue());
    localzza = localzza.zzg("Value", localObject);
    localObject = paramEvent.getFormattedValue();
    localzza = localzza.zzg("FormattedValue", localObject);
    localObject = Boolean.valueOf(paramEvent.isVisible());
    return localzza.zzg("isVisible", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Event freeze()
  {
    return this;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaxl, paramCharArrayBuffer);
  }
  
  public String getEventId()
  {
    return this.zzaDU;
  }
  
  public String getFormattedValue()
  {
    return this.zzaDW;
  }
  
  public void getFormattedValue(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaDW, paramCharArrayBuffer);
  }
  
  public Uri getIconImageUri()
  {
    return this.zzaCd;
  }
  
  public String getIconImageUrl()
  {
    return this.zzaCo;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.mName, paramCharArrayBuffer);
  }
  
  public Player getPlayer()
  {
    return this.zzaDq;
  }
  
  public long getValue()
  {
    return this.zzaDV;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public boolean isVisible()
  {
    return this.zzsj;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    EventEntityCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\event\EventEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */