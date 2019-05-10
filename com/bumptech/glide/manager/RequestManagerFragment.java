package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RequestManagerFragment
  extends Fragment
{
  private static final String TAG = "RMFragment";
  private final Set childRequestManagerFragments;
  private final ActivityFragmentLifecycle lifecycle;
  private Fragment parentFragmentHint;
  private RequestManager requestManager;
  private final RequestManagerTreeNode requestManagerTreeNode;
  private RequestManagerFragment rootRequestManagerFragment;
  
  public RequestManagerFragment()
  {
    this(localActivityFragmentLifecycle);
  }
  
  RequestManagerFragment(ActivityFragmentLifecycle paramActivityFragmentLifecycle)
  {
    Object localObject = new com/bumptech/glide/manager/RequestManagerFragment$FragmentRequestManagerTreeNode;
    ((RequestManagerFragment.FragmentRequestManagerTreeNode)localObject).<init>(this);
    this.requestManagerTreeNode = ((RequestManagerTreeNode)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.childRequestManagerFragments = ((Set)localObject);
    this.lifecycle = paramActivityFragmentLifecycle;
  }
  
  private void addChildRequestManagerFragment(RequestManagerFragment paramRequestManagerFragment)
  {
    this.childRequestManagerFragments.add(paramRequestManagerFragment);
  }
  
  private Fragment getParentFragmentUsingHint()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    Fragment localFragment;
    if (i >= j)
    {
      localFragment = getParentFragment();
      if (localFragment == null) {
        break label30;
      }
    }
    for (;;)
    {
      return localFragment;
      i = 0;
      localFragment = null;
      break;
      label30:
      localFragment = this.parentFragmentHint;
    }
  }
  
  private boolean isDescendant(Fragment paramFragment)
  {
    Fragment localFragment1 = getParentFragment();
    Fragment localFragment2 = paramFragment.getParentFragment();
    boolean bool2;
    if (localFragment2 != null)
    {
      boolean bool1 = localFragment2.equals(localFragment1);
      if (bool1) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      paramFragment = paramFragment.getParentFragment();
      break;
      bool2 = false;
      localFragment1 = null;
    }
  }
  
  private void registerFragmentWithRoot(Activity paramActivity)
  {
    unregisterFragmentWithRoot();
    RequestManagerFragment localRequestManagerFragment = Glide.get(paramActivity).getRequestManagerRetriever().getRequestManagerFragment(paramActivity);
    this.rootRequestManagerFragment = localRequestManagerFragment;
    localRequestManagerFragment = this.rootRequestManagerFragment;
    boolean bool = equals(localRequestManagerFragment);
    if (!bool)
    {
      localRequestManagerFragment = this.rootRequestManagerFragment;
      localRequestManagerFragment.addChildRequestManagerFragment(this);
    }
  }
  
  private void removeChildRequestManagerFragment(RequestManagerFragment paramRequestManagerFragment)
  {
    this.childRequestManagerFragments.remove(paramRequestManagerFragment);
  }
  
  private void unregisterFragmentWithRoot()
  {
    RequestManagerFragment localRequestManagerFragment = this.rootRequestManagerFragment;
    if (localRequestManagerFragment != null)
    {
      this.rootRequestManagerFragment.removeChildRequestManagerFragment(this);
      localRequestManagerFragment = null;
      this.rootRequestManagerFragment = null;
    }
  }
  
  Set getDescendantRequestManagerFragments()
  {
    Object localObject = this.rootRequestManagerFragment;
    boolean bool1 = equals(localObject);
    if (bool1) {
      localObject = Collections.unmodifiableSet(this.childRequestManagerFragments);
    }
    for (;;)
    {
      return (Set)localObject;
      localObject = this.rootRequestManagerFragment;
      if (localObject != null)
      {
        int i = Build.VERSION.SDK_INT;
        int j = 17;
        if (i >= j) {}
      }
      else
      {
        localObject = Collections.emptySet();
        continue;
      }
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      localObject = this.rootRequestManagerFragment.getDescendantRequestManagerFragments();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (RequestManagerFragment)localIterator.next();
        Fragment localFragment = ((RequestManagerFragment)localObject).getParentFragment();
        boolean bool3 = isDescendant(localFragment);
        if (bool3) {
          localHashSet.add(localObject);
        }
      }
      localObject = Collections.unmodifiableSet(localHashSet);
    }
  }
  
  ActivityFragmentLifecycle getGlideLifecycle()
  {
    return this.lifecycle;
  }
  
  public RequestManager getRequestManager()
  {
    return this.requestManager;
  }
  
  public RequestManagerTreeNode getRequestManagerTreeNode()
  {
    return this.requestManagerTreeNode;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    try
    {
      registerFragmentWithRoot(paramActivity);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        String str1 = "RMFragment";
        int i = 5;
        boolean bool = Log.isLoggable(str1, i);
        if (bool)
        {
          str1 = "RMFragment";
          String str2 = "Unable to register fragment with root";
          Log.w(str1, str2, localIllegalStateException);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.lifecycle.onDestroy();
    unregisterFragmentWithRoot();
  }
  
  public void onDetach()
  {
    super.onDetach();
    unregisterFragmentWithRoot();
  }
  
  public void onStart()
  {
    super.onStart();
    this.lifecycle.onStart();
  }
  
  public void onStop()
  {
    super.onStop();
    this.lifecycle.onStop();
  }
  
  void setParentFragmentHint(Fragment paramFragment)
  {
    this.parentFragmentHint = paramFragment;
    if (paramFragment != null)
    {
      Activity localActivity = paramFragment.getActivity();
      if (localActivity != null)
      {
        localActivity = paramFragment.getActivity();
        registerFragmentWithRoot(localActivity);
      }
    }
  }
  
  public void setRequestManager(RequestManager paramRequestManager)
  {
    this.requestManager = paramRequestManager;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = super.toString();
    localStringBuilder = localStringBuilder.append((String)localObject).append("{parent=");
    localObject = getParentFragmentUsingHint();
    return localObject + "}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\RequestManagerFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */