package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;

public final class CastRemoteDisplayLocalService$NotificationSettings
{
  private Notification mNotification;
  private PendingIntent zzaaF;
  private String zzaaG;
  private String zzaaH;
  
  private CastRemoteDisplayLocalService$NotificationSettings() {}
  
  private CastRemoteDisplayLocalService$NotificationSettings(NotificationSettings paramNotificationSettings)
  {
    Object localObject = paramNotificationSettings.mNotification;
    this.mNotification = ((Notification)localObject);
    localObject = paramNotificationSettings.zzaaF;
    this.zzaaF = ((PendingIntent)localObject);
    localObject = paramNotificationSettings.zzaaG;
    this.zzaaG = ((String)localObject);
    localObject = paramNotificationSettings.zzaaH;
    this.zzaaH = ((String)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$NotificationSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */