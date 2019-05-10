package com.bumptech.glide.manager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SupportRequestManagerFragment
  extends Fragment
{
  private static final String TAG = "SupportRMFragment";
  private final Set childRequestManagerFragments;
  private final ActivityFragmentLifecycle lifecycle;
  private Fragment parentFragmentHint;
  private RequestManager requestManager;
  private final RequestManagerTreeNode requestManagerTreeNode;
  private SupportRequestManagerFragment rootRequestManagerFragment;
  
  public SupportRequestManagerFragment()
  {
    this(localActivityFragmentLifecycle);
  }
  
  public SupportRequestManagerFragment(ActivityFragmentLifecycle paramActivityFragmentLifecycle)
  {
    Object localObject = new com/bumptech/glide/manager/SupportRequestManagerFragment$SupportFragmentRequestManagerTreeNode;
    ((SupportRequestManagerFragment.SupportFragmentRequestManagerTreeNode)localObject).<init>(this);
    this.requestManagerTreeNode = ((RequestManagerTreeNode)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.childRequestManagerFragments = ((Set)localObject);
    this.lifecycle = paramActivityFragmentLifecycle;
  }
  
  private void addChildRequestManagerFragment(SupportRequestManagerFragment paramSupportRequestManagerFragment)
  {
    this.childRequestManagerFragments.add(paramSupportRequestManagerFragment);
  }
  
  private Fragment getParentFragmentUsingHint()
  {
    Fragment localFragment = getParentFragment();
    if (localFragment != null) {}
    for (;;)
    {
      return localFragment;
      localFragment = this.parentFragmentHint;
    }
  }
  
  private boolean isDescendant(Fragment paramFragment)
  {
    Fragment localFragment1 = getParentFragmentUsingHint();
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
  
  private void registerFragmentWithRoot(i parami)
  {
    unregisterFragmentWithRoot();
    SupportRequestManagerFragment localSupportRequestManagerFragment = Glide.get(parami).getRequestManagerRetriever().getSupportRequestManagerFragment(parami);
    this.rootRequestManagerFragment = localSupportRequestManagerFragment;
    localSupportRequestManagerFragment = this.rootRequestManagerFragment;
    boolean bool = equals(localSupportRequestManagerFragment);
    if (!bool)
    {
      localSupportRequestManagerFragment = this.rootRequestManagerFragment;
      localSupportRequestManagerFragment.addChildRequestManagerFragment(this);
    }
  }
  
  private void removeChildRequestManagerFragment(SupportRequestManagerFragment paramSupportRequestManagerFragment)
  {
    this.childRequestManagerFragments.remove(paramSupportRequestManagerFragment);
  }
  
  private void unregisterFragmentWithRoot()
  {
    SupportRequestManagerFragment localSupportRequestManagerFragment = this.rootRequestManagerFragment;
    if (localSupportRequestManagerFragment != null)
    {
      this.rootRequestManagerFragment.removeChildRequestManagerFragment(this);
      localSupportRequestManagerFragment = null;
      this.rootRequestManagerFragment = null;
    }
  }
  
  Set getDescendantRequestManagerFragments()
  {
    Object localObject = this.rootRequestManagerFragment;
    if (localObject == null) {
      localObject = Collections.emptySet();
    }
    for (;;)
    {
      return (Set)localObject;
      localObject = this.rootRequestManagerFragment;
      boolean bool1 = equals(localObject);
      if (bool1)
      {
        localObject = Collections.unmodifiableSet(this.childRequestManagerFragments);
      }
      else
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        localObject = this.rootRequestManagerFragment.getDescendantRequestManagerFragments();
        Iterator localIterator = ((Set)localObject).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject = (SupportRequestManagerFragment)localIterator.next();
          Fragment localFragment = ((SupportRequestManagerFragment)localObject).getParentFragmentUsingHint();
          boolean bool2 = isDescendant(localFragment);
          if (bool2) {
            localHashSet.add(localObject);
          }
        }
        localObject = Collections.unmodifiableSet(localHashSet);
      }
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
  
  public void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    try
    {
      i locali = getActivity();
      registerFragmentWithRoot(locali);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        String str1 = "SupportRMFragment";
        int i = 5;
        boolean bool = Log.isLoggable(str1, i);
        if (bool)
        {
          str1 = "SupportRMFragment";
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
    this.parentFragmentHint = null;
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
      i locali = paramFragment.getActivity();
      if (locali != null)
      {
        locali = paramFragment.getActivity();
        registerFragmentWithRoot(locali);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\SupportRequestManagerFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */