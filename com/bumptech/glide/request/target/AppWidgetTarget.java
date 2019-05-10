package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

public class AppWidgetTarget
  extends SimpleTarget
{
  private final ComponentName componentName;
  private final Context context;
  private final RemoteViews remoteViews;
  private final int viewId;
  private final int[] widgetIds;
  
  public AppWidgetTarget(Context paramContext, int paramInt1, int paramInt2, int paramInt3, RemoteViews paramRemoteViews, ComponentName paramComponentName)
  {
    super(paramInt1, paramInt2);
    Object localObject = (Context)Preconditions.checkNotNull(paramContext, "Context can not be null!");
    this.context = ((Context)localObject);
    localObject = (RemoteViews)Preconditions.checkNotNull(paramRemoteViews, "RemoteViews object can not be null!");
    this.remoteViews = ((RemoteViews)localObject);
    localObject = (ComponentName)Preconditions.checkNotNull(paramComponentName, "ComponentName can not be null!");
    this.componentName = ((ComponentName)localObject);
    this.viewId = paramInt3;
    this.widgetIds = null;
  }
  
  public AppWidgetTarget(Context paramContext, int paramInt1, int paramInt2, int paramInt3, RemoteViews paramRemoteViews, int... paramVarArgs)
  {
    super(paramInt1, paramInt2);
    int i = paramVarArgs.length;
    if (i == 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("WidgetIds must have length > 0");
      throw ((Throwable)localObject);
    }
    Object localObject = (Context)Preconditions.checkNotNull(paramContext, "Context can not be null!");
    this.context = ((Context)localObject);
    localObject = (RemoteViews)Preconditions.checkNotNull(paramRemoteViews, "RemoteViews object can not be null!");
    this.remoteViews = ((RemoteViews)localObject);
    localObject = (int[])Preconditions.checkNotNull(paramVarArgs, "WidgetIds can not be null!");
    this.widgetIds = ((int[])localObject);
    this.viewId = paramInt3;
    this.componentName = null;
  }
  
  public AppWidgetTarget(Context paramContext, int paramInt, RemoteViews paramRemoteViews, ComponentName paramComponentName)
  {
    this(paramContext, i, i, paramInt, paramRemoteViews, paramComponentName);
  }
  
  public AppWidgetTarget(Context paramContext, int paramInt, RemoteViews paramRemoteViews, int... paramVarArgs)
  {
    this(paramContext, i, i, paramInt, paramRemoteViews, paramVarArgs);
  }
  
  private void update()
  {
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(this.context);
    Object localObject = this.componentName;
    RemoteViews localRemoteViews;
    if (localObject != null)
    {
      localObject = this.componentName;
      localRemoteViews = this.remoteViews;
      localAppWidgetManager.updateAppWidget((ComponentName)localObject, localRemoteViews);
    }
    for (;;)
    {
      return;
      localObject = this.widgetIds;
      localRemoteViews = this.remoteViews;
      localAppWidgetManager.updateAppWidget((int[])localObject, localRemoteViews);
    }
  }
  
  public void onResourceReady(Bitmap paramBitmap, Transition paramTransition)
  {
    RemoteViews localRemoteViews = this.remoteViews;
    int i = this.viewId;
    localRemoteViews.setImageViewBitmap(i, paramBitmap);
    update();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\AppWidgetTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */