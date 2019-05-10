package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class GameNotificationRef
  extends zzc
  implements GameNotification
{
  GameNotificationRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public long getId()
  {
    return getLong("_id");
  }
  
  public String getText()
  {
    return getString("text");
  }
  
  public String getTitle()
  {
    return getString("title");
  }
  
  public int getType()
  {
    return getInteger("type");
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(getId());
    localzza = localzza.zzg("Id", localObject);
    localObject = zzxt();
    localzza = localzza.zzg("NotificationId", localObject);
    localObject = Integer.valueOf(getType());
    localzza = localzza.zzg("Type", localObject);
    localObject = getTitle();
    localzza = localzza.zzg("Title", localObject);
    localObject = zzxu();
    localzza = localzza.zzg("Ticker", localObject);
    localObject = getText();
    localzza = localzza.zzg("Text", localObject);
    localObject = zzxv();
    localzza = localzza.zzg("CoalescedText", localObject);
    localObject = Boolean.valueOf(zzxw());
    localzza = localzza.zzg("isAcknowledged", localObject);
    localObject = Boolean.valueOf(zzxx());
    return localzza.zzg("isSilent", localObject).toString();
  }
  
  public String zzxt()
  {
    return getString("notification_id");
  }
  
  public String zzxu()
  {
    return getString("ticker");
  }
  
  public String zzxv()
  {
    return getString("coalesced_text");
  }
  
  public boolean zzxw()
  {
    String str = "acknowledged";
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
  
  public boolean zzxx()
  {
    String str = "alert_level";
    int i = getInteger(str);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\notification\GameNotificationRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */