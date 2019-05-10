package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

public class NotificationTarget
  extends SimpleTarget
{
  private final Context context;
  private final Notification notification;
  private final int notificationId;
  private final String notificationTag;
  private final RemoteViews remoteViews;
  private final int viewId;
  
  public NotificationTarget(Context paramContext, int paramInt1, int paramInt2, int paramInt3, RemoteViews paramRemoteViews, Notification paramNotification, int paramInt4, String paramString)
  {
    super(paramInt1, paramInt2);
    Object localObject = (Context)Preconditions.checkNotNull(paramContext, "Context must not be null!");
    this.context = ((Context)localObject);
    localObject = (Notification)Preconditions.checkNotNull(paramNotification, "Notification object can not be null!");
    this.notification = ((Notification)localObject);
    localObject = (RemoteViews)Preconditions.checkNotNull(paramRemoteViews, "RemoteViews object can not be null!");
    this.remoteViews = ((RemoteViews)localObject);
    this.viewId = paramInt3;
    this.notificationId = paramInt4;
    this.notificationTag = paramString;
  }
  
  public NotificationTarget(Context paramContext, int paramInt1, RemoteViews paramRemoteViews, Notification paramNotification, int paramInt2)
  {
    this(paramContext, paramInt1, paramRemoteViews, paramNotification, paramInt2, null);
  }
  
  public NotificationTarget(Context paramContext, int paramInt1, RemoteViews paramRemoteViews, Notification paramNotification, int paramInt2, String paramString)
  {
    this(paramContext, i, i, paramInt1, paramRemoteViews, paramNotification, paramInt2, paramString);
  }
  
  private void update()
  {
    NotificationManager localNotificationManager = (NotificationManager)Preconditions.checkNotNull((NotificationManager)this.context.getSystemService("notification"));
    String str = this.notificationTag;
    int i = this.notificationId;
    Notification localNotification = this.notification;
    localNotificationManager.notify(str, i, localNotification);
  }
  
  public void onResourceReady(Bitmap paramBitmap, Transition paramTransition)
  {
    RemoteViews localRemoteViews = this.remoteViews;
    int i = this.viewId;
    localRemoteViews.setImageViewBitmap(i, paramBitmap);
    update();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\NotificationTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */