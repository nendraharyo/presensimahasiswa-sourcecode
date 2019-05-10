package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class RequestTracker
{
  private static final String TAG = "RequestTracker";
  private boolean isPaused;
  private final List pendingRequests;
  private final Set requests;
  
  public RequestTracker()
  {
    Object localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    localObject = Collections.newSetFromMap((Map)localObject);
    this.requests = ((Set)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.pendingRequests = ((List)localObject);
  }
  
  private boolean clearRemoveAndMaybeRecycle(Request paramRequest, boolean paramBoolean)
  {
    boolean bool1 = true;
    if (paramRequest == null) {}
    label76:
    for (;;)
    {
      return bool1;
      Set localSet = this.requests;
      boolean bool2 = localSet.remove(paramRequest);
      List localList = this.pendingRequests;
      boolean bool3 = localList.remove(paramRequest);
      if ((bool3) || (bool2)) {}
      for (;;)
      {
        if (!bool1) {
          break label76;
        }
        paramRequest.clear();
        if (!paramBoolean) {
          break;
        }
        paramRequest.recycle();
        break;
        bool1 = false;
      }
    }
  }
  
  void addRequest(Request paramRequest)
  {
    this.requests.add(paramRequest);
  }
  
  public boolean clearRemoveAndRecycle(Request paramRequest)
  {
    return clearRemoveAndMaybeRecycle(paramRequest, true);
  }
  
  public void clearRequests()
  {
    Object localObject = Util.getSnapshot(this.requests);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Request)localIterator.next();
      clearRemoveAndMaybeRecycle((Request)localObject, false);
    }
    this.pendingRequests.clear();
  }
  
  public boolean isPaused()
  {
    return this.isPaused;
  }
  
  public void pauseAllRequests()
  {
    boolean bool1 = true;
    this.isPaused = bool1;
    Object localObject = Util.getSnapshot(this.requests);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Request)localIterator.next();
      boolean bool2 = ((Request)localObject).isRunning();
      if (!bool2)
      {
        bool2 = ((Request)localObject).isComplete();
        if (!bool2) {}
      }
      else
      {
        ((Request)localObject).clear();
        List localList = this.pendingRequests;
        localList.add(localObject);
      }
    }
  }
  
  public void pauseRequests()
  {
    boolean bool1 = true;
    this.isPaused = bool1;
    Object localObject = Util.getSnapshot(this.requests);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Request)localIterator.next();
      boolean bool2 = ((Request)localObject).isRunning();
      if (bool2)
      {
        ((Request)localObject).clear();
        List localList = this.pendingRequests;
        localList.add(localObject);
      }
    }
  }
  
  public void restartRequests()
  {
    Object localObject = Util.getSnapshot(this.requests);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Request)localIterator.next();
      boolean bool2 = ((Request)localObject).isComplete();
      if (!bool2)
      {
        bool2 = ((Request)localObject).isCleared();
        if (!bool2)
        {
          ((Request)localObject).clear();
          bool2 = this.isPaused;
          if (!bool2)
          {
            ((Request)localObject).begin();
          }
          else
          {
            List localList = this.pendingRequests;
            localList.add(localObject);
          }
        }
      }
    }
  }
  
  public void resumeRequests()
  {
    boolean bool1 = false;
    this.isPaused = false;
    Object localObject = Util.getSnapshot(this.requests);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Request)localIterator.next();
      boolean bool2 = ((Request)localObject).isComplete();
      if (!bool2)
      {
        bool2 = ((Request)localObject).isRunning();
        if (!bool2) {
          ((Request)localObject).begin();
        }
      }
    }
    this.pendingRequests.clear();
  }
  
  public void runRequest(Request paramRequest)
  {
    Object localObject = this.requests;
    ((Set)localObject).add(paramRequest);
    boolean bool = this.isPaused;
    if (!bool) {
      paramRequest.begin();
    }
    for (;;)
    {
      return;
      paramRequest.clear();
      localObject = "RequestTracker";
      int i = 2;
      bool = Log.isLoggable((String)localObject, i);
      if (bool)
      {
        localObject = "RequestTracker";
        String str = "Paused, delaying request";
        Log.v((String)localObject, str);
      }
      localObject = this.pendingRequests;
      ((List)localObject).add(paramRequest);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = super.toString();
    localStringBuilder = localStringBuilder.append(str).append("{numRequests=");
    int i = this.requests.size();
    localStringBuilder = localStringBuilder.append(i).append(", isPaused=");
    boolean bool = this.isPaused;
    return bool + "}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\RequestTracker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */