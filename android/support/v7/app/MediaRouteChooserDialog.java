package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.attr;
import android.support.v7.mediarouter.R.id;
import android.support.v7.mediarouter.R.layout;
import android.support.v7.mediarouter.R.string;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MediaRouteChooserDialog
  extends Dialog
{
  private MediaRouteChooserDialog.RouteAdapter mAdapter;
  private boolean mAttachedToWindow;
  private final MediaRouteChooserDialog.MediaRouterCallback mCallback;
  private ListView mListView;
  private final MediaRouter mRouter;
  private ArrayList mRoutes;
  private MediaRouteSelector mSelector;
  
  public MediaRouteChooserDialog(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteChooserDialog(Context paramContext, int paramInt)
  {
    super((Context)localObject, paramInt);
    localObject = MediaRouteSelector.EMPTY;
    this.mSelector = ((MediaRouteSelector)localObject);
    localObject = MediaRouter.getInstance(getContext());
    this.mRouter = ((MediaRouter)localObject);
    localObject = new android/support/v7/app/MediaRouteChooserDialog$MediaRouterCallback;
    ((MediaRouteChooserDialog.MediaRouterCallback)localObject).<init>(this, null);
    this.mCallback = ((MediaRouteChooserDialog.MediaRouterCallback)localObject);
  }
  
  public MediaRouteSelector getRouteSelector()
  {
    return this.mSelector;
  }
  
  public void onAttachedToWindow()
  {
    int i = 1;
    super.onAttachedToWindow();
    this.mAttachedToWindow = i;
    MediaRouter localMediaRouter = this.mRouter;
    MediaRouteSelector localMediaRouteSelector = this.mSelector;
    MediaRouteChooserDialog.MediaRouterCallback localMediaRouterCallback = this.mCallback;
    localMediaRouter.addCallback(localMediaRouteSelector, localMediaRouterCallback, i);
    refreshRoutes();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    int i = 3;
    super.onCreate(paramBundle);
    getWindow().requestFeature(i);
    int j = R.layout.mr_media_route_chooser_dialog;
    setContentView(j);
    j = R.string.mr_media_route_chooser_title;
    setTitle(j);
    Object localObject1 = getWindow();
    Object localObject2 = getContext();
    int k = R.attr.mediaRouteOffDrawable;
    int m = MediaRouterThemeHelper.getThemeResource((Context)localObject2, k);
    ((Window)localObject1).setFeatureDrawableResource(i, m);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mRoutes = ((ArrayList)localObject1);
    localObject1 = new android/support/v7/app/MediaRouteChooserDialog$RouteAdapter;
    localObject2 = getContext();
    ArrayList localArrayList = this.mRoutes;
    ((MediaRouteChooserDialog.RouteAdapter)localObject1).<init>(this, (Context)localObject2, localArrayList);
    this.mAdapter = ((MediaRouteChooserDialog.RouteAdapter)localObject1);
    j = R.id.media_route_list;
    localObject1 = (ListView)findViewById(j);
    this.mListView = ((ListView)localObject1);
    localObject1 = this.mListView;
    localObject2 = this.mAdapter;
    ((ListView)localObject1).setAdapter((ListAdapter)localObject2);
    localObject1 = this.mListView;
    localObject2 = this.mAdapter;
    ((ListView)localObject1).setOnItemClickListener((AdapterView.OnItemClickListener)localObject2);
    localObject1 = this.mListView;
    localObject2 = findViewById(16908292);
    ((ListView)localObject1).setEmptyView((View)localObject2);
  }
  
  public void onDetachedFromWindow()
  {
    this.mAttachedToWindow = false;
    MediaRouter localMediaRouter = this.mRouter;
    MediaRouteChooserDialog.MediaRouterCallback localMediaRouterCallback = this.mCallback;
    localMediaRouter.removeCallback(localMediaRouterCallback);
    super.onDetachedFromWindow();
  }
  
  public boolean onFilterRoute(MediaRouter.RouteInfo paramRouteInfo)
  {
    boolean bool = paramRouteInfo.isDefault();
    MediaRouteSelector localMediaRouteSelector;
    if (!bool)
    {
      bool = paramRouteInfo.isEnabled();
      if (bool)
      {
        localMediaRouteSelector = this.mSelector;
        bool = paramRouteInfo.matchesSelector(localMediaRouteSelector);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMediaRouteSelector = null;
    }
  }
  
  public void onFilterRoutes(List paramList)
  {
    int i = paramList.size();
    for (;;)
    {
      int j = i + -1;
      if (i > 0)
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramList.get(j);
        bool = onFilterRoute(localRouteInfo);
        if (!bool)
        {
          paramList.remove(j);
          bool = j;
        }
      }
      else
      {
        return;
      }
      boolean bool = j;
    }
  }
  
  public void refreshRoutes()
  {
    boolean bool = this.mAttachedToWindow;
    if (bool)
    {
      this.mRoutes.clear();
      Object localObject1 = this.mRoutes;
      Object localObject2 = this.mRouter.getRoutes();
      ((ArrayList)localObject1).addAll((Collection)localObject2);
      localObject1 = this.mRoutes;
      onFilterRoutes((List)localObject1);
      localObject1 = this.mRoutes;
      localObject2 = MediaRouteChooserDialog.RouteComparator.sInstance;
      Collections.sort((List)localObject1, (Comparator)localObject2);
      localObject1 = this.mAdapter;
      ((MediaRouteChooserDialog.RouteAdapter)localObject1).notifyDataSetChanged();
    }
  }
  
  public void setRouteSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mSelector;
    boolean bool = ((MediaRouteSelector)localObject).equals(paramMediaRouteSelector);
    if (!bool)
    {
      this.mSelector = paramMediaRouteSelector;
      bool = this.mAttachedToWindow;
      if (bool)
      {
        localObject = this.mRouter;
        MediaRouteChooserDialog.MediaRouterCallback localMediaRouterCallback = this.mCallback;
        ((MediaRouter)localObject).removeCallback(localMediaRouterCallback);
        localObject = this.mRouter;
        localMediaRouterCallback = this.mCallback;
        int i = 1;
        ((MediaRouter)localObject).addCallback(paramMediaRouteSelector, localMediaRouterCallback, i);
      }
      refreshRoutes();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteChooserDialog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */