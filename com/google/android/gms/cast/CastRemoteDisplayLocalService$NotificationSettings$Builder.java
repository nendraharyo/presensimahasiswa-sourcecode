package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;

public final class CastRemoteDisplayLocalService$NotificationSettings$Builder
{
  private CastRemoteDisplayLocalService.NotificationSettings zzaaI;
  
  public CastRemoteDisplayLocalService$NotificationSettings$Builder()
  {
    CastRemoteDisplayLocalService.NotificationSettings localNotificationSettings = new com/google/android/gms/cast/CastRemoteDisplayLocalService$NotificationSettings;
    localNotificationSettings.<init>(null);
    this.zzaaI = localNotificationSettings;
  }
  
  public CastRemoteDisplayLocalService.NotificationSettings build()
  {
    Object localObject = CastRemoteDisplayLocalService.NotificationSettings.zzb(this.zzaaI);
    boolean bool;
    if (localObject != null)
    {
      localObject = CastRemoteDisplayLocalService.NotificationSettings.zzc(this.zzaaI);
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("notificationTitle requires using the default notification");
        throw ((Throwable)localObject);
      }
      localObject = CastRemoteDisplayLocalService.NotificationSettings.zzd(this.zzaaI);
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("notificationText requires using the default notification");
        throw ((Throwable)localObject);
      }
      localObject = CastRemoteDisplayLocalService.NotificationSettings.zze(this.zzaaI);
      if (localObject != null)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("notificationPendingIntent requires using the default notification");
        throw ((Throwable)localObject);
      }
    }
    else
    {
      localObject = CastRemoteDisplayLocalService.NotificationSettings.zzc(this.zzaaI);
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = CastRemoteDisplayLocalService.NotificationSettings.zzd(this.zzaaI);
        bool = TextUtils.isEmpty((CharSequence)localObject);
        if (bool)
        {
          localObject = CastRemoteDisplayLocalService.NotificationSettings.zze(this.zzaaI);
          if (localObject == null)
          {
            localObject = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject).<init>("At least an argument must be provided");
            throw ((Throwable)localObject);
          }
        }
      }
    }
    return this.zzaaI;
  }
  
  public Builder setNotification(Notification paramNotification)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zza(this.zzaaI, paramNotification);
    return this;
  }
  
  public Builder setNotificationPendingIntent(PendingIntent paramPendingIntent)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zza(this.zzaaI, paramPendingIntent);
    return this;
  }
  
  public Builder setNotificationText(String paramString)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zzb(this.zzaaI, paramString);
    return this;
  }
  
  public Builder setNotificationTitle(String paramString)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zza(this.zzaaI, paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$NotificationSettings$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */