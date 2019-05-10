package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RequestManager
  implements ModelTypes, LifecycleListener
{
  private static final RequestOptions DECODE_TYPE_BITMAP = RequestOptions.decodeTypeOf(Bitmap.class).lock();
  private static final RequestOptions DECODE_TYPE_GIF = RequestOptions.decodeTypeOf(GifDrawable.class).lock();
  private static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
  private final Runnable addSelfToLifecycle;
  private final ConnectivityMonitor connectivityMonitor;
  protected final Context context;
  protected final Glide glide;
  final Lifecycle lifecycle;
  private final Handler mainHandler;
  private RequestOptions requestOptions;
  private final RequestTracker requestTracker;
  private final TargetTracker targetTracker;
  private final RequestManagerTreeNode treeNode;
  
  static
  {
    RequestOptions localRequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA);
    Priority localPriority = Priority.LOW;
    DOWNLOAD_ONLY_OPTIONS = localRequestOptions.priority(localPriority).skipMemoryCache(true);
  }
  
  public RequestManager(Glide paramGlide, Lifecycle paramLifecycle, RequestManagerTreeNode paramRequestManagerTreeNode, Context paramContext)
  {
    this(paramGlide, paramLifecycle, paramRequestManagerTreeNode, localRequestTracker, localConnectivityMonitorFactory, paramContext);
  }
  
  RequestManager(Glide paramGlide, Lifecycle paramLifecycle, RequestManagerTreeNode paramRequestManagerTreeNode, RequestTracker paramRequestTracker, ConnectivityMonitorFactory paramConnectivityMonitorFactory, Context paramContext)
  {
    Object localObject1 = new com/bumptech/glide/manager/TargetTracker;
    ((TargetTracker)localObject1).<init>();
    this.targetTracker = ((TargetTracker)localObject1);
    localObject1 = new com/bumptech/glide/RequestManager$1;
    ((RequestManager.1)localObject1).<init>(this);
    this.addSelfToLifecycle = ((Runnable)localObject1);
    localObject1 = new android/os/Handler;
    Object localObject2 = Looper.getMainLooper();
    ((Handler)localObject1).<init>((Looper)localObject2);
    this.mainHandler = ((Handler)localObject1);
    this.glide = paramGlide;
    this.lifecycle = paramLifecycle;
    this.treeNode = paramRequestManagerTreeNode;
    this.requestTracker = paramRequestTracker;
    this.context = paramContext;
    localObject1 = paramContext.getApplicationContext();
    localObject2 = new com/bumptech/glide/RequestManager$RequestManagerConnectivityListener;
    ((RequestManager.RequestManagerConnectivityListener)localObject2).<init>(paramRequestTracker);
    localObject1 = paramConnectivityMonitorFactory.build((Context)localObject1, (ConnectivityMonitor.ConnectivityListener)localObject2);
    this.connectivityMonitor = ((ConnectivityMonitor)localObject1);
    boolean bool = Util.isOnBackgroundThread();
    if (bool)
    {
      localObject1 = this.mainHandler;
      localObject2 = this.addSelfToLifecycle;
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      localObject1 = this.connectivityMonitor;
      paramLifecycle.addListener((LifecycleListener)localObject1);
      localObject1 = paramGlide.getGlideContext().getDefaultRequestOptions();
      setRequestOptions((RequestOptions)localObject1);
      paramGlide.registerRequestManager(this);
      return;
      paramLifecycle.addListener(this);
    }
  }
  
  private void untrackOrDelegate(Target paramTarget)
  {
    boolean bool = untrack(paramTarget);
    if (!bool)
    {
      Object localObject = this.glide;
      bool = ((Glide)localObject).removeFromManagers(paramTarget);
      if (!bool)
      {
        localObject = paramTarget.getRequest();
        if (localObject != null)
        {
          localObject = paramTarget.getRequest();
          paramTarget.setRequest(null);
          ((Request)localObject).clear();
        }
      }
    }
  }
  
  private void updateRequestOptions(RequestOptions paramRequestOptions)
  {
    RequestOptions localRequestOptions = this.requestOptions.apply(paramRequestOptions);
    this.requestOptions = localRequestOptions;
  }
  
  public RequestManager applyDefaultRequestOptions(RequestOptions paramRequestOptions)
  {
    updateRequestOptions(paramRequestOptions);
    return this;
  }
  
  public RequestBuilder as(Class paramClass)
  {
    RequestBuilder localRequestBuilder = new com/bumptech/glide/RequestBuilder;
    Glide localGlide = this.glide;
    Context localContext = this.context;
    localRequestBuilder.<init>(localGlide, this, paramClass, localContext);
    return localRequestBuilder;
  }
  
  public RequestBuilder asBitmap()
  {
    RequestBuilder localRequestBuilder = as(Bitmap.class);
    RequestOptions localRequestOptions = DECODE_TYPE_BITMAP;
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  public RequestBuilder asDrawable()
  {
    return as(Drawable.class);
  }
  
  public RequestBuilder asFile()
  {
    RequestBuilder localRequestBuilder = as(File.class);
    RequestOptions localRequestOptions = RequestOptions.skipMemoryCacheOf(true);
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  public RequestBuilder asGif()
  {
    RequestBuilder localRequestBuilder = as(GifDrawable.class);
    RequestOptions localRequestOptions = DECODE_TYPE_GIF;
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  public void clear(View paramView)
  {
    RequestManager.ClearTarget localClearTarget = new com/bumptech/glide/RequestManager$ClearTarget;
    localClearTarget.<init>(paramView);
    clear(localClearTarget);
  }
  
  public void clear(Target paramTarget)
  {
    if (paramTarget == null) {}
    for (;;)
    {
      return;
      boolean bool = Util.isOnMainThread();
      if (bool)
      {
        untrackOrDelegate(paramTarget);
      }
      else
      {
        Handler localHandler = this.mainHandler;
        RequestManager.2 local2 = new com/bumptech/glide/RequestManager$2;
        local2.<init>(this, paramTarget);
        localHandler.post(local2);
      }
    }
  }
  
  public RequestBuilder download(Object paramObject)
  {
    return downloadOnly().load(paramObject);
  }
  
  public RequestBuilder downloadOnly()
  {
    RequestBuilder localRequestBuilder = as(File.class);
    RequestOptions localRequestOptions = DOWNLOAD_ONLY_OPTIONS;
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  RequestOptions getDefaultRequestOptions()
  {
    return this.requestOptions;
  }
  
  TransitionOptions getDefaultTransitionOptions(Class paramClass)
  {
    return this.glide.getGlideContext().getDefaultTransitionOptions(paramClass);
  }
  
  public boolean isPaused()
  {
    Util.assertMainThread();
    return this.requestTracker.isPaused();
  }
  
  public RequestBuilder load(Bitmap paramBitmap)
  {
    return asDrawable().load(paramBitmap);
  }
  
  public RequestBuilder load(Drawable paramDrawable)
  {
    return asDrawable().load(paramDrawable);
  }
  
  public RequestBuilder load(Uri paramUri)
  {
    return asDrawable().load(paramUri);
  }
  
  public RequestBuilder load(File paramFile)
  {
    return asDrawable().load(paramFile);
  }
  
  public RequestBuilder load(Integer paramInteger)
  {
    return asDrawable().load(paramInteger);
  }
  
  public RequestBuilder load(Object paramObject)
  {
    return asDrawable().load(paramObject);
  }
  
  public RequestBuilder load(String paramString)
  {
    return asDrawable().load(paramString);
  }
  
  public RequestBuilder load(URL paramURL)
  {
    return asDrawable().load(paramURL);
  }
  
  public RequestBuilder load(byte[] paramArrayOfByte)
  {
    return asDrawable().load(paramArrayOfByte);
  }
  
  public void onDestroy()
  {
    this.targetTracker.onDestroy();
    Object localObject1 = this.targetTracker.getAll();
    Object localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Target)((Iterator)localObject2).next();
      clear((Target)localObject1);
    }
    this.targetTracker.clear();
    this.requestTracker.clearRequests();
    this.lifecycle.removeListener(this);
    localObject1 = this.lifecycle;
    localObject2 = this.connectivityMonitor;
    ((Lifecycle)localObject1).removeListener((LifecycleListener)localObject2);
    localObject1 = this.mainHandler;
    localObject2 = this.addSelfToLifecycle;
    ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
    this.glide.unregisterRequestManager(this);
  }
  
  public void onStart()
  {
    resumeRequests();
    this.targetTracker.onStart();
  }
  
  public void onStop()
  {
    pauseRequests();
    this.targetTracker.onStop();
  }
  
  public void pauseAllRequests()
  {
    Util.assertMainThread();
    this.requestTracker.pauseAllRequests();
  }
  
  public void pauseRequests()
  {
    Util.assertMainThread();
    this.requestTracker.pauseRequests();
  }
  
  public void pauseRequestsRecursive()
  {
    Util.assertMainThread();
    pauseRequests();
    Object localObject = this.treeNode.getDescendants();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (RequestManager)localIterator.next();
      ((RequestManager)localObject).pauseRequests();
    }
  }
  
  public void resumeRequests()
  {
    Util.assertMainThread();
    this.requestTracker.resumeRequests();
  }
  
  public void resumeRequestsRecursive()
  {
    Util.assertMainThread();
    resumeRequests();
    Object localObject = this.treeNode.getDescendants();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (RequestManager)localIterator.next();
      ((RequestManager)localObject).resumeRequests();
    }
  }
  
  public RequestManager setDefaultRequestOptions(RequestOptions paramRequestOptions)
  {
    setRequestOptions(paramRequestOptions);
    return this;
  }
  
  protected void setRequestOptions(RequestOptions paramRequestOptions)
  {
    RequestOptions localRequestOptions = paramRequestOptions.clone().autoClone();
    this.requestOptions = localRequestOptions;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = super.toString();
    localStringBuilder = localStringBuilder.append((String)localObject).append("{tracker=");
    localObject = this.requestTracker;
    localStringBuilder = localStringBuilder.append(localObject).append(", treeNode=");
    localObject = this.treeNode;
    return localObject + "}";
  }
  
  void track(Target paramTarget, Request paramRequest)
  {
    this.targetTracker.track(paramTarget);
    this.requestTracker.runRequest(paramRequest);
  }
  
  boolean untrack(Target paramTarget)
  {
    boolean bool1 = true;
    Request localRequest = paramTarget.getRequest();
    if (localRequest == null) {}
    for (;;)
    {
      return bool1;
      RequestTracker localRequestTracker = this.requestTracker;
      boolean bool2 = localRequestTracker.clearRemoveAndRecycle(localRequest);
      if (bool2)
      {
        this.targetTracker.untrack(paramTarget);
        bool2 = false;
        localRequest = null;
        paramTarget.setRequest(null);
      }
      else
      {
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\RequestManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */