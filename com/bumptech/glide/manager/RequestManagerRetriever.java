package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.support.v4.h.a;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RequestManagerRetriever
  implements Handler.Callback
{
  private static final RequestManagerRetriever.RequestManagerFactory DEFAULT_FACTORY;
  private static final String FRAGMENT_INDEX_KEY = "key";
  static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
  private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
  private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
  private static final String TAG = "RMRetriever";
  private volatile RequestManager applicationManager;
  private final RequestManagerRetriever.RequestManagerFactory factory;
  private final Handler handler;
  final Map pendingRequestManagerFragments;
  final Map pendingSupportRequestManagerFragments;
  private final Bundle tempBundle;
  private final a tempViewToFragment;
  private final a tempViewToSupportFragment;
  
  static
  {
    RequestManagerRetriever.1 local1 = new com/bumptech/glide/manager/RequestManagerRetriever$1;
    local1.<init>();
    DEFAULT_FACTORY = local1;
  }
  
  public RequestManagerRetriever(RequestManagerRetriever.RequestManagerFactory paramRequestManagerFactory)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.pendingRequestManagerFragments = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.pendingSupportRequestManagerFragments = ((Map)localObject);
    localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.tempViewToSupportFragment = ((a)localObject);
    localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.tempViewToFragment = ((a)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.tempBundle = ((Bundle)localObject);
    if (paramRequestManagerFactory != null) {}
    for (;;)
    {
      this.factory = paramRequestManagerFactory;
      localObject = new android/os/Handler;
      Looper localLooper = Looper.getMainLooper();
      ((Handler)localObject).<init>(localLooper, this);
      this.handler = ((Handler)localObject);
      return;
      paramRequestManagerFactory = DEFAULT_FACTORY;
    }
  }
  
  private static void assertNotDestroyed(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j)
    {
      boolean bool = paramActivity.isDestroyed();
      if (bool)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("You cannot start a load for a destroyed activity");
        throw localIllegalArgumentException;
      }
    }
  }
  
  private Activity findActivity(Context paramContext)
  {
    boolean bool = paramContext instanceof Activity;
    if (bool) {
      paramContext = (Activity)paramContext;
    }
    for (;;)
    {
      return paramContext;
      bool = paramContext instanceof ContextWrapper;
      if (bool)
      {
        Context localContext = ((ContextWrapper)paramContext).getBaseContext();
        paramContext = findActivity(localContext);
      }
      else
      {
        paramContext = null;
      }
    }
  }
  
  private void findAllFragmentsWithViews(FragmentManager paramFragmentManager, a parama)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i >= j)
    {
      Object localObject = paramFragmentManager.getFragments();
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (android.app.Fragment)localIterator.next();
        View localView = ((android.app.Fragment)localObject).getView();
        if (localView != null)
        {
          localView = ((android.app.Fragment)localObject).getView();
          parama.put(localView, localObject);
          localObject = ((android.app.Fragment)localObject).getChildFragmentManager();
          findAllFragmentsWithViews((FragmentManager)localObject, parama);
        }
      }
    }
    findAllFragmentsWithViewsPreO(paramFragmentManager, parama);
  }
  
  private void findAllFragmentsWithViewsPreO(FragmentManager paramFragmentManager, a parama)
  {
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      Object localObject2 = this.tempBundle;
      String str = "key";
      int j = i + 1;
      ((Bundle)localObject2).putInt(str, i);
      i = 0;
      localObject1 = null;
      try
      {
        localObject2 = this.tempBundle;
        str = "key";
        localObject1 = paramFragmentManager.getFragment((Bundle)localObject2, str);
      }
      catch (Exception localException)
      {
        int k;
        int m;
        for (;;) {}
      }
      if (localObject1 == null) {
        return;
      }
      localObject2 = ((android.app.Fragment)localObject1).getView();
      if (localObject2 != null)
      {
        localObject2 = ((android.app.Fragment)localObject1).getView();
        parama.put(localObject2, localObject1);
        k = Build.VERSION.SDK_INT;
        m = 17;
        if (k >= m)
        {
          localObject1 = ((android.app.Fragment)localObject1).getChildFragmentManager();
          findAllFragmentsWithViews((FragmentManager)localObject1, parama);
        }
      }
      i = j;
    }
  }
  
  private static void findAllSupportFragmentsWithViews(Collection paramCollection, Map paramMap)
  {
    if (paramCollection == null) {
      return;
    }
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (android.support.v4.app.Fragment)localIterator.next();
      if (localObject != null)
      {
        View localView = ((android.support.v4.app.Fragment)localObject).getView();
        if (localView != null)
        {
          localView = ((android.support.v4.app.Fragment)localObject).getView();
          paramMap.put(localView, localObject);
          localObject = ((android.support.v4.app.Fragment)localObject).getChildFragmentManager().e();
          findAllSupportFragmentsWithViews((Collection)localObject, paramMap);
        }
      }
    }
  }
  
  private android.app.Fragment findFragment(View paramView, Activity paramActivity)
  {
    this.tempViewToFragment.clear();
    Object localObject1 = paramActivity.getFragmentManager();
    Object localObject2 = this.tempViewToFragment;
    findAllFragmentsWithViews((FragmentManager)localObject1, (a)localObject2);
    localObject2 = null;
    int i = 16908290;
    View localView = paramActivity.findViewById(i);
    for (;;)
    {
      boolean bool = paramView.equals(localView);
      if (!bool)
      {
        localObject1 = this.tempViewToFragment.get(paramView);
        localObject2 = localObject1;
        localObject2 = (android.app.Fragment)localObject1;
        if (localObject2 == null) {
          break label86;
        }
      }
      label86:
      do
      {
        this.tempViewToFragment.clear();
        return (android.app.Fragment)localObject2;
        localObject1 = paramView.getParent();
        bool = localObject1 instanceof View;
      } while (!bool);
      localObject1 = (View)paramView.getParent();
      paramView = (View)localObject1;
    }
  }
  
  private android.support.v4.app.Fragment findSupportFragment(View paramView, i parami)
  {
    this.tempViewToSupportFragment.clear();
    Object localObject1 = parami.getSupportFragmentManager().e();
    Object localObject2 = this.tempViewToSupportFragment;
    findAllSupportFragmentsWithViews((Collection)localObject1, (Map)localObject2);
    localObject2 = null;
    int i = 16908290;
    View localView = parami.findViewById(i);
    for (;;)
    {
      boolean bool = paramView.equals(localView);
      if (!bool)
      {
        localObject1 = this.tempViewToSupportFragment.get(paramView);
        localObject2 = localObject1;
        localObject2 = (android.support.v4.app.Fragment)localObject1;
        if (localObject2 == null) {
          break label88;
        }
      }
      label88:
      do
      {
        this.tempViewToSupportFragment.clear();
        return (android.support.v4.app.Fragment)localObject2;
        localObject1 = paramView.getParent();
        bool = localObject1 instanceof View;
      } while (!bool);
      localObject1 = (View)paramView.getParent();
      paramView = (View)localObject1;
    }
  }
  
  private RequestManager fragmentGet(Context paramContext, FragmentManager paramFragmentManager, android.app.Fragment paramFragment, boolean paramBoolean)
  {
    RequestManagerFragment localRequestManagerFragment = getRequestManagerFragment(paramFragmentManager, paramFragment, paramBoolean);
    Object localObject = localRequestManagerFragment.getRequestManager();
    if (localObject == null)
    {
      localObject = Glide.get(paramContext);
      RequestManagerRetriever.RequestManagerFactory localRequestManagerFactory = this.factory;
      ActivityFragmentLifecycle localActivityFragmentLifecycle = localRequestManagerFragment.getGlideLifecycle();
      RequestManagerTreeNode localRequestManagerTreeNode = localRequestManagerFragment.getRequestManagerTreeNode();
      localObject = localRequestManagerFactory.build((Glide)localObject, localActivityFragmentLifecycle, localRequestManagerTreeNode, paramContext);
      localRequestManagerFragment.setRequestManager((RequestManager)localObject);
    }
    return (RequestManager)localObject;
  }
  
  private RequestManager getApplicationManager(Context paramContext)
  {
    Object localObject1 = this.applicationManager;
    if (localObject1 == null) {}
    try
    {
      localObject1 = this.applicationManager;
      if (localObject1 == null)
      {
        localObject1 = paramContext.getApplicationContext();
        localObject1 = Glide.get((Context)localObject1);
        RequestManagerRetriever.RequestManagerFactory localRequestManagerFactory = this.factory;
        ApplicationLifecycle localApplicationLifecycle = new com/bumptech/glide/manager/ApplicationLifecycle;
        localApplicationLifecycle.<init>();
        EmptyRequestManagerTreeNode localEmptyRequestManagerTreeNode = new com/bumptech/glide/manager/EmptyRequestManagerTreeNode;
        localEmptyRequestManagerTreeNode.<init>();
        Context localContext = paramContext.getApplicationContext();
        localObject1 = localRequestManagerFactory.build((Glide)localObject1, localApplicationLifecycle, localEmptyRequestManagerTreeNode, localContext);
        this.applicationManager = ((RequestManager)localObject1);
      }
      return this.applicationManager;
    }
    finally {}
  }
  
  private RequestManagerFragment getRequestManagerFragment(FragmentManager paramFragmentManager, android.app.Fragment paramFragment, boolean paramBoolean)
  {
    RequestManagerFragment localRequestManagerFragment = (RequestManagerFragment)paramFragmentManager.findFragmentByTag("com.bumptech.glide.manager");
    if (localRequestManagerFragment == null)
    {
      localRequestManagerFragment = (RequestManagerFragment)this.pendingRequestManagerFragments.get(paramFragmentManager);
      if (localRequestManagerFragment == null)
      {
        localRequestManagerFragment = new com/bumptech/glide/manager/RequestManagerFragment;
        localRequestManagerFragment.<init>();
        localRequestManagerFragment.setParentFragmentHint(paramFragment);
        if (paramBoolean)
        {
          localObject = localRequestManagerFragment.getGlideLifecycle();
          ((ActivityFragmentLifecycle)localObject).onStart();
        }
        this.pendingRequestManagerFragments.put(paramFragmentManager, localRequestManagerFragment);
        Object localObject = paramFragmentManager.beginTransaction();
        String str = "com.bumptech.glide.manager";
        ((FragmentTransaction)localObject).add(localRequestManagerFragment, str).commitAllowingStateLoss();
        localObject = this.handler;
        int i = 1;
        localObject = ((Handler)localObject).obtainMessage(i, paramFragmentManager);
        ((Message)localObject).sendToTarget();
      }
    }
    return localRequestManagerFragment;
  }
  
  private SupportRequestManagerFragment getSupportRequestManagerFragment(m paramm, android.support.v4.app.Fragment paramFragment, boolean paramBoolean)
  {
    SupportRequestManagerFragment localSupportRequestManagerFragment = (SupportRequestManagerFragment)paramm.a("com.bumptech.glide.manager");
    if (localSupportRequestManagerFragment == null)
    {
      localSupportRequestManagerFragment = (SupportRequestManagerFragment)this.pendingSupportRequestManagerFragments.get(paramm);
      if (localSupportRequestManagerFragment == null)
      {
        localSupportRequestManagerFragment = new com/bumptech/glide/manager/SupportRequestManagerFragment;
        localSupportRequestManagerFragment.<init>();
        localSupportRequestManagerFragment.setParentFragmentHint(paramFragment);
        if (paramBoolean)
        {
          localObject = localSupportRequestManagerFragment.getGlideLifecycle();
          ((ActivityFragmentLifecycle)localObject).onStart();
        }
        this.pendingSupportRequestManagerFragments.put(paramm, localSupportRequestManagerFragment);
        Object localObject = paramm.a();
        String str = "com.bumptech.glide.manager";
        ((p)localObject).a(localSupportRequestManagerFragment, str).d();
        localObject = this.handler;
        int i = 2;
        localObject = ((Handler)localObject).obtainMessage(i, paramm);
        ((Message)localObject).sendToTarget();
      }
    }
    return localSupportRequestManagerFragment;
  }
  
  private static boolean isActivityVisible(Activity paramActivity)
  {
    boolean bool = paramActivity.isFinishing();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private RequestManager supportFragmentGet(Context paramContext, m paramm, android.support.v4.app.Fragment paramFragment, boolean paramBoolean)
  {
    SupportRequestManagerFragment localSupportRequestManagerFragment = getSupportRequestManagerFragment(paramm, paramFragment, paramBoolean);
    Object localObject = localSupportRequestManagerFragment.getRequestManager();
    if (localObject == null)
    {
      localObject = Glide.get(paramContext);
      RequestManagerRetriever.RequestManagerFactory localRequestManagerFactory = this.factory;
      ActivityFragmentLifecycle localActivityFragmentLifecycle = localSupportRequestManagerFragment.getGlideLifecycle();
      RequestManagerTreeNode localRequestManagerTreeNode = localSupportRequestManagerFragment.getRequestManagerTreeNode();
      localObject = localRequestManagerFactory.build((Glide)localObject, localActivityFragmentLifecycle, localRequestManagerTreeNode, paramContext);
      localSupportRequestManagerFragment.setRequestManager((RequestManager)localObject);
    }
    return (RequestManager)localObject;
  }
  
  public RequestManager get(Activity paramActivity)
  {
    boolean bool1 = Util.isOnBackgroundThread();
    if (bool1) {
      localObject = paramActivity.getApplicationContext();
    }
    boolean bool2;
    for (Object localObject = get((Context)localObject);; localObject = fragmentGet(paramActivity, (FragmentManager)localObject, null, bool2))
    {
      return (RequestManager)localObject;
      assertNotDestroyed(paramActivity);
      localObject = paramActivity.getFragmentManager();
      bool2 = isActivityVisible(paramActivity);
    }
  }
  
  public RequestManager get(android.app.Fragment paramFragment)
  {
    Object localObject = paramFragment.getActivity();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("You cannot start a load on a fragment before it is attached");
      throw ((Throwable)localObject);
    }
    boolean bool1 = Util.isOnBackgroundThread();
    if (!bool1)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 17;
      if (i >= j) {}
    }
    else
    {
      localObject = paramFragment.getActivity().getApplicationContext();
    }
    Activity localActivity;
    boolean bool2;
    for (localObject = get((Context)localObject);; localObject = fragmentGet(localActivity, (FragmentManager)localObject, paramFragment, bool2))
    {
      return (RequestManager)localObject;
      localObject = paramFragment.getChildFragmentManager();
      localActivity = paramFragment.getActivity();
      bool2 = paramFragment.isVisible();
    }
  }
  
  public RequestManager get(Context paramContext)
  {
    Object localObject;
    if (paramContext == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("You cannot start a load on a null Context");
      throw ((Throwable)localObject);
    }
    boolean bool = Util.isOnMainThread();
    if (bool)
    {
      bool = paramContext instanceof Application;
      if (!bool)
      {
        bool = paramContext instanceof i;
        if (bool)
        {
          paramContext = (i)paramContext;
          localObject = get(paramContext);
        }
      }
    }
    for (;;)
    {
      return (RequestManager)localObject;
      bool = paramContext instanceof Activity;
      if (bool)
      {
        paramContext = (Activity)paramContext;
        localObject = get(paramContext);
      }
      else
      {
        bool = paramContext instanceof ContextWrapper;
        if (bool)
        {
          paramContext = (ContextWrapper)paramContext;
          localObject = paramContext.getBaseContext();
          localObject = get((Context)localObject);
        }
        else
        {
          localObject = getApplicationManager((Context)paramContext);
        }
      }
    }
  }
  
  public RequestManager get(android.support.v4.app.Fragment paramFragment)
  {
    Object localObject1 = paramFragment.getActivity();
    Object localObject2 = "You cannot start a load on a fragment before it is attached or after it is destroyed";
    Preconditions.checkNotNull(localObject1, (String)localObject2);
    boolean bool1 = Util.isOnBackgroundThread();
    if (bool1) {
      localObject1 = paramFragment.getActivity().getApplicationContext();
    }
    boolean bool2;
    for (localObject1 = get((Context)localObject1);; localObject1 = supportFragmentGet((Context)localObject2, (m)localObject1, paramFragment, bool2))
    {
      return (RequestManager)localObject1;
      localObject1 = paramFragment.getChildFragmentManager();
      localObject2 = paramFragment.getActivity();
      bool2 = paramFragment.isVisible();
    }
  }
  
  public RequestManager get(i parami)
  {
    boolean bool1 = Util.isOnBackgroundThread();
    if (bool1) {
      localObject = parami.getApplicationContext();
    }
    boolean bool2;
    for (Object localObject = get((Context)localObject);; localObject = supportFragmentGet(parami, (m)localObject, null, bool2))
    {
      return (RequestManager)localObject;
      assertNotDestroyed(parami);
      localObject = parami.getSupportFragmentManager();
      bool2 = isActivityVisible(parami);
    }
  }
  
  public RequestManager get(View paramView)
  {
    boolean bool = Util.isOnBackgroundThread();
    Object localObject;
    if (bool)
    {
      localObject = paramView.getContext().getApplicationContext();
      localObject = get((Context)localObject);
    }
    for (;;)
    {
      return (RequestManager)localObject;
      Preconditions.checkNotNull(paramView);
      Preconditions.checkNotNull(paramView.getContext(), "Unable to obtain a request manager for a view without a Context");
      localObject = paramView.getContext();
      Activity localActivity = findActivity((Context)localObject);
      if (localActivity == null)
      {
        localObject = paramView.getContext().getApplicationContext();
        localObject = get((Context)localObject);
      }
      else
      {
        bool = localActivity instanceof i;
        if (bool)
        {
          localObject = localActivity;
          localObject = (i)localActivity;
          localObject = findSupportFragment(paramView, (i)localObject);
          if (localObject != null) {
            localObject = get((android.support.v4.app.Fragment)localObject);
          } else {
            localObject = get((Activity)localActivity);
          }
        }
        else
        {
          localObject = findFragment(paramView, localActivity);
          if (localObject == null) {
            localObject = get(localActivity);
          } else {
            localObject = get((android.app.Fragment)localObject);
          }
        }
      }
    }
  }
  
  RequestManagerFragment getRequestManagerFragment(Activity paramActivity)
  {
    FragmentManager localFragmentManager = paramActivity.getFragmentManager();
    boolean bool = isActivityVisible(paramActivity);
    return getRequestManagerFragment(localFragmentManager, null, bool);
  }
  
  SupportRequestManagerFragment getSupportRequestManagerFragment(i parami)
  {
    m localm = parami.getSupportFragmentManager();
    boolean bool = isActivityVisible(parami);
    return getSupportRequestManagerFragment(localm, null, bool);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    Object localObject1 = null;
    boolean bool1 = true;
    int i = paramMessage.what;
    Object localObject2;
    switch (i)
    {
    default: 
      bool1 = false;
      i = 0;
      localObject2 = null;
    }
    for (;;)
    {
      if ((bool1) && (localObject2 == null))
      {
        localObject2 = "RMRetriever";
        int j = 5;
        boolean bool2 = Log.isLoggable((String)localObject2, j);
        if (bool2)
        {
          localObject2 = "RMRetriever";
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = "Failed to remove expected request manager fragment, manager: ";
          localStringBuilder = localStringBuilder.append(str);
          localObject1 = localObject1;
          Log.w((String)localObject2, (String)localObject1);
        }
      }
      return bool1;
      localObject1 = (FragmentManager)paramMessage.obj;
      localObject2 = this.pendingRequestManagerFragments.remove(localObject1);
      continue;
      localObject1 = (m)paramMessage.obj;
      localObject2 = this.pendingSupportRequestManagerFragments.remove(localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\RequestManagerRetriever.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */