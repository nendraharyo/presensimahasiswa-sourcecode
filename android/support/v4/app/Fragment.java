package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.c;
import android.arch.lifecycle.c.a;
import android.arch.lifecycle.f;
import android.arch.lifecycle.p;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.h.d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Fragment
  implements android.arch.lifecycle.e, ComponentCallbacks, View.OnCreateContextMenuListener
{
  static final int ACTIVITY_CREATED = 2;
  static final int CREATED = 1;
  static final int INITIALIZING = 0;
  static final int RESUMED = 5;
  static final int STARTED = 4;
  static final int STOPPED = 3;
  static final Object USE_DEFAULT_TRANSITION;
  private static final android.support.v4.h.m sClassMap;
  boolean mAdded;
  Fragment.a mAnimationInfo;
  Bundle mArguments;
  int mBackStackNesting;
  boolean mCalled;
  n mChildFragmentManager;
  o mChildNonConfig;
  ViewGroup mContainer;
  int mContainerId;
  boolean mDeferStart;
  boolean mDetached;
  int mFragmentId;
  n mFragmentManager;
  boolean mFromLayout;
  boolean mHasMenu;
  boolean mHidden;
  boolean mHiddenChanged;
  l mHost;
  boolean mInLayout;
  int mIndex;
  View mInnerView;
  boolean mIsCreated;
  boolean mIsNewlyAdded;
  LayoutInflater mLayoutInflater;
  f mLifecycleRegistry;
  LoaderManagerImpl mLoaderManager;
  boolean mMenuVisible;
  Fragment mParentFragment;
  boolean mPerformedCreateView;
  float mPostponedAlpha;
  boolean mRemoving;
  boolean mRestored;
  boolean mRetainInstance;
  boolean mRetaining;
  Bundle mSavedFragmentState;
  Boolean mSavedUserVisibleHint;
  SparseArray mSavedViewState;
  int mState = 0;
  String mTag;
  Fragment mTarget;
  int mTargetIndex;
  int mTargetRequestCode;
  boolean mUserVisibleHint;
  View mView;
  p mViewModelStore;
  String mWho;
  
  static
  {
    Object localObject = new android/support/v4/h/m;
    ((android.support.v4.h.m)localObject).<init>();
    sClassMap = (android.support.v4.h.m)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    USE_DEFAULT_TRANSITION = localObject;
  }
  
  public Fragment()
  {
    this.mIndex = i;
    this.mTargetIndex = i;
    this.mMenuVisible = bool;
    this.mUserVisibleHint = bool;
    f localf = new android/arch/lifecycle/f;
    localf.<init>(this);
    this.mLifecycleRegistry = localf;
  }
  
  private void callStartTransitionListener()
  {
    Object localObject1 = null;
    Object localObject2 = this.mAnimationInfo;
    if (localObject2 == null) {}
    for (;;)
    {
      if (localObject1 != null) {
        ((Fragment.c)localObject1).a();
      }
      return;
      this.mAnimationInfo.i = false;
      localObject2 = this.mAnimationInfo.j;
      Fragment.a locala = this.mAnimationInfo;
      locala.j = null;
      localObject1 = localObject2;
    }
  }
  
  private Fragment.a ensureAnimationInfo()
  {
    Fragment.a locala = this.mAnimationInfo;
    if (locala == null)
    {
      locala = new android/support/v4/app/Fragment$a;
      locala.<init>();
      this.mAnimationInfo = locala;
    }
    return this.mAnimationInfo;
  }
  
  public static Fragment instantiate(Context paramContext, String paramString)
  {
    return instantiate(paramContext, paramString, null);
  }
  
  public static Fragment instantiate(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Object localObject1 = sClassMap;
      localObject1 = ((android.support.v4.h.m)localObject1).get(paramString);
      localObject1 = (Class)localObject1;
      if (localObject1 == null)
      {
        localObject1 = paramContext.getClassLoader();
        localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
        localObject2 = sClassMap;
        ((android.support.v4.h.m)localObject2).put(paramString, localObject1);
      }
      localObject2 = null;
      localObject2 = new Class[0];
      localObject1 = ((Class)localObject1).getConstructor((Class[])localObject2);
      localObject2 = null;
      localObject2 = new Object[0];
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      localObject1 = (Fragment)localObject1;
      if (paramBundle != null)
      {
        localObject2 = localObject1.getClass();
        localObject2 = ((Class)localObject2).getClassLoader();
        paramBundle.setClassLoader((ClassLoader)localObject2);
        ((Fragment)localObject1).setArguments(paramBundle);
      }
      return (Fragment)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = new android/support/v4/app/Fragment$b;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public";
      ((Fragment.b)localObject2).<init>((String)localObject3, localClassNotFoundException);
      throw ((Throwable)localObject2);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new android/support/v4/app/Fragment$b;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public";
      ((Fragment.b)localObject2).<init>((String)localObject3, localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new android/support/v4/app/Fragment$b;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an" + " empty constructor that is public";
      ((Fragment.b)localObject2).<init>((String)localObject3, localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject2 = new android/support/v4/app/Fragment$b;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Unable to instantiate fragment " + paramString + ": could not find Fragment constructor";
      ((Fragment.b)localObject2).<init>((String)localObject3, localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Object localObject2 = new android/support/v4/app/Fragment$b;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Unable to instantiate fragment " + paramString + ": calling Fragment constructor caused an exception";
      ((Fragment.b)localObject2).<init>((String)localObject3, localInvocationTargetException);
      throw ((Throwable)localObject2);
    }
  }
  
  static boolean isSupportFragmentClass(Context paramContext, String paramString)
  {
    try
    {
      Object localObject1 = sClassMap;
      localObject1 = ((android.support.v4.h.m)localObject1).get(paramString);
      localObject1 = (Class)localObject1;
      if (localObject1 == null)
      {
        localObject1 = paramContext.getClassLoader();
        localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
        localObject3 = sClassMap;
        ((android.support.v4.h.m)localObject3).put(paramString, localObject1);
      }
      Object localObject3 = Fragment.class;
      bool = ((Class)localObject3).isAssignableFrom((Class)localObject1);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    Object localObject1 = Integer.toHexString(this.mFragmentId);
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mContainerId=#");
    localObject1 = Integer.toHexString(this.mContainerId);
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mTag=");
    localObject1 = this.mTag;
    paramPrintWriter.println((String)localObject1);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    int i = this.mState;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mIndex=");
    i = this.mIndex;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mWho=");
    localObject1 = this.mWho;
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mBackStackNesting=");
    i = this.mBackStackNesting;
    paramPrintWriter.println(i);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    boolean bool = this.mAdded;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mRemoving=");
    bool = this.mRemoving;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mFromLayout=");
    bool = this.mFromLayout;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mInLayout=");
    bool = this.mInLayout;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    bool = this.mHidden;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mDetached=");
    bool = this.mDetached;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mMenuVisible=");
    bool = this.mMenuVisible;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mHasMenu=");
    bool = this.mHasMenu;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    bool = this.mRetainInstance;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mRetaining=");
    bool = this.mRetaining;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mUserVisibleHint=");
    bool = this.mUserVisibleHint;
    paramPrintWriter.println(bool);
    localObject1 = this.mFragmentManager;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      localObject1 = this.mFragmentManager;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mHost;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      localObject1 = this.mHost;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mParentFragment;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      localObject1 = this.mParentFragment;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mArguments;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      localObject1 = this.mArguments;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mSavedFragmentState;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      localObject1 = this.mSavedFragmentState;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mSavedViewState;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      localObject1 = this.mSavedViewState;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mTarget;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      localObject1 = this.mTarget;
      paramPrintWriter.print(localObject1);
      localObject1 = " mTargetRequestCode=";
      paramPrintWriter.print((String)localObject1);
      j = this.mTargetRequestCode;
      paramPrintWriter.println(j);
    }
    int j = getNextAnim();
    if (j != 0)
    {
      paramPrintWriter.print(paramString);
      localObject1 = "mNextAnim=";
      paramPrintWriter.print((String)localObject1);
      j = getNextAnim();
      paramPrintWriter.println(j);
    }
    localObject1 = this.mContainer;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      localObject1 = this.mContainer;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mView;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      localObject1 = this.mView;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = this.mInnerView;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      localObject1 = this.mView;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = getAnimatingAway();
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      localObject1 = getAnimatingAway();
      paramPrintWriter.println(localObject1);
      paramPrintWriter.print(paramString);
      localObject1 = "mStateAfterAnimating=";
      paramPrintWriter.print((String)localObject1);
      j = getStateAfterAnimating();
      paramPrintWriter.println(j);
    }
    localObject1 = this.mLoaderManager;
    Object localObject2;
    String str;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      localObject1 = this.mLoaderManager;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = "  ";
      localObject2 = str;
      ((LoaderManagerImpl)localObject1).a((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Child ");
      localObject2 = this.mChildFragmentManager;
      localObject1 = localObject2 + ":";
      paramPrintWriter.println((String)localObject1);
      localObject1 = this.mChildFragmentManager;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = "  ";
      localObject2 = str;
      ((n)localObject1).a((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  Fragment findFragmentByWho(String paramString)
  {
    Object localObject = this.mWho;
    boolean bool = paramString.equals(localObject);
    if (bool) {}
    for (;;)
    {
      return this;
      localObject = this.mChildFragmentManager;
      if (localObject != null)
      {
        localObject = this.mChildFragmentManager;
        this = ((n)localObject).b(paramString);
      }
      else
      {
        this = null;
      }
    }
  }
  
  public final i getActivity()
  {
    Object localObject = this.mHost;
    if (localObject == null) {}
    for (localObject = null;; localObject = (i)this.mHost.h()) {
      return (i)localObject;
    }
  }
  
  public boolean getAllowEnterTransitionOverlap()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject != null)
    {
      localObject = Fragment.a.g(this.mAnimationInfo);
      if (localObject != null) {
        break label25;
      }
    }
    for (boolean bool = true;; bool = ((Boolean)localObject).booleanValue())
    {
      return bool;
      label25:
      localObject = Fragment.a.g(this.mAnimationInfo);
    }
  }
  
  public boolean getAllowReturnTransitionOverlap()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject != null)
    {
      localObject = Fragment.a.h(this.mAnimationInfo);
      if (localObject != null) {
        break label25;
      }
    }
    for (boolean bool = true;; bool = ((Boolean)localObject).booleanValue())
    {
      return bool;
      label25:
      localObject = Fragment.a.h(this.mAnimationInfo);
    }
  }
  
  View getAnimatingAway()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mAnimationInfo.a) {
      return (View)localObject;
    }
  }
  
  Animator getAnimator()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mAnimationInfo.b) {
      return (Animator)localObject;
    }
  }
  
  public final Bundle getArguments()
  {
    return this.mArguments;
  }
  
  public final m getChildFragmentManager()
  {
    n localn = this.mChildFragmentManager;
    int i;
    int j;
    if (localn == null)
    {
      instantiateChildFragmentManager();
      i = this.mState;
      j = 5;
      if (i < j) {
        break label39;
      }
      localn = this.mChildFragmentManager;
      localn.s();
    }
    for (;;)
    {
      return this.mChildFragmentManager;
      label39:
      i = this.mState;
      j = 4;
      if (i >= j)
      {
        localn = this.mChildFragmentManager;
        localn.r();
      }
      else
      {
        i = this.mState;
        j = 2;
        if (i >= j)
        {
          localn = this.mChildFragmentManager;
          localn.q();
        }
        else
        {
          i = this.mState;
          j = 1;
          if (i >= j)
          {
            localn = this.mChildFragmentManager;
            localn.p();
          }
        }
      }
    }
  }
  
  public Context getContext()
  {
    Object localObject = this.mHost;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mHost.i()) {
      return (Context)localObject;
    }
  }
  
  public Object getEnterTransition()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject == null) {}
    for (localObject = null;; localObject = Fragment.a.a(this.mAnimationInfo)) {
      return localObject;
    }
  }
  
  ab getEnterTransitionCallback()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mAnimationInfo.g) {
      return (ab)localObject;
    }
  }
  
  public Object getExitTransition()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject == null) {}
    for (localObject = null;; localObject = Fragment.a.c(this.mAnimationInfo)) {
      return localObject;
    }
  }
  
  ab getExitTransitionCallback()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mAnimationInfo.h) {
      return (ab)localObject;
    }
  }
  
  public final m getFragmentManager()
  {
    return this.mFragmentManager;
  }
  
  public final Object getHost()
  {
    Object localObject = this.mHost;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mHost.g()) {
      return localObject;
    }
  }
  
  public final int getId()
  {
    return this.mFragmentId;
  }
  
  public final LayoutInflater getLayoutInflater()
  {
    LayoutInflater localLayoutInflater = this.mLayoutInflater;
    if (localLayoutInflater == null) {}
    for (localLayoutInflater = performGetLayoutInflater(null);; localLayoutInflater = this.mLayoutInflater) {
      return localLayoutInflater;
    }
  }
  
  public LayoutInflater getLayoutInflater(Bundle paramBundle)
  {
    Object localObject = this.mHost;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
      throw ((Throwable)localObject);
    }
    localObject = this.mHost.b();
    getChildFragmentManager();
    LayoutInflater.Factory2 localFactory2 = this.mChildFragmentManager.A();
    android.support.v4.view.e.b((LayoutInflater)localObject, localFactory2);
    return (LayoutInflater)localObject;
  }
  
  public c getLifecycle()
  {
    return this.mLifecycleRegistry;
  }
  
  public t getLoaderManager()
  {
    LoaderManagerImpl localLoaderManagerImpl = this.mLoaderManager;
    if (localLoaderManagerImpl != null) {}
    for (localLoaderManagerImpl = this.mLoaderManager;; localLoaderManagerImpl = this.mLoaderManager)
    {
      return localLoaderManagerImpl;
      localLoaderManagerImpl = new android/support/v4/app/LoaderManagerImpl;
      p localp = getViewModelStore();
      localLoaderManagerImpl.<init>(this, localp);
      this.mLoaderManager = localLoaderManagerImpl;
    }
  }
  
  int getNextAnim()
  {
    Fragment.a locala = this.mAnimationInfo;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = this.mAnimationInfo;
      i = locala.d;
    }
  }
  
  int getNextTransition()
  {
    Fragment.a locala = this.mAnimationInfo;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = this.mAnimationInfo;
      i = locala.e;
    }
  }
  
  int getNextTransitionStyle()
  {
    Fragment.a locala = this.mAnimationInfo;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = this.mAnimationInfo;
      i = locala.f;
    }
  }
  
  public final Fragment getParentFragment()
  {
    return this.mParentFragment;
  }
  
  public Object getReenterTransition()
  {
    Object localObject1 = this.mAnimationInfo;
    if (localObject1 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = Fragment.a.d(this.mAnimationInfo);
      Object localObject2 = USE_DEFAULT_TRANSITION;
      if (localObject1 == localObject2) {
        localObject1 = getExitTransition();
      } else {
        localObject1 = Fragment.a.d(this.mAnimationInfo);
      }
    }
  }
  
  public final Resources getResources()
  {
    return requireContext().getResources();
  }
  
  public final boolean getRetainInstance()
  {
    return this.mRetainInstance;
  }
  
  public Object getReturnTransition()
  {
    Object localObject1 = this.mAnimationInfo;
    if (localObject1 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = Fragment.a.b(this.mAnimationInfo);
      Object localObject2 = USE_DEFAULT_TRANSITION;
      if (localObject1 == localObject2) {
        localObject1 = getEnterTransition();
      } else {
        localObject1 = Fragment.a.b(this.mAnimationInfo);
      }
    }
  }
  
  public Object getSharedElementEnterTransition()
  {
    Object localObject = this.mAnimationInfo;
    if (localObject == null) {}
    for (localObject = null;; localObject = Fragment.a.e(this.mAnimationInfo)) {
      return localObject;
    }
  }
  
  public Object getSharedElementReturnTransition()
  {
    Object localObject1 = this.mAnimationInfo;
    if (localObject1 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = Fragment.a.f(this.mAnimationInfo);
      Object localObject2 = USE_DEFAULT_TRANSITION;
      if (localObject1 == localObject2) {
        localObject1 = getSharedElementEnterTransition();
      } else {
        localObject1 = Fragment.a.f(this.mAnimationInfo);
      }
    }
  }
  
  int getStateAfterAnimating()
  {
    Fragment.a locala = this.mAnimationInfo;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = this.mAnimationInfo;
      i = locala.c;
    }
  }
  
  public final String getString(int paramInt)
  {
    return getResources().getString(paramInt);
  }
  
  public final String getString(int paramInt, Object... paramVarArgs)
  {
    return getResources().getString(paramInt, paramVarArgs);
  }
  
  public final String getTag()
  {
    return this.mTag;
  }
  
  public final Fragment getTargetFragment()
  {
    return this.mTarget;
  }
  
  public final int getTargetRequestCode()
  {
    return this.mTargetRequestCode;
  }
  
  public final CharSequence getText(int paramInt)
  {
    return getResources().getText(paramInt);
  }
  
  public boolean getUserVisibleHint()
  {
    return this.mUserVisibleHint;
  }
  
  public View getView()
  {
    return this.mView;
  }
  
  public p getViewModelStore()
  {
    Object localObject = getContext();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Can't access ViewModels from detached fragment");
      throw ((Throwable)localObject);
    }
    localObject = this.mViewModelStore;
    if (localObject == null)
    {
      localObject = new android/arch/lifecycle/p;
      ((p)localObject).<init>();
      this.mViewModelStore = ((p)localObject);
    }
    return this.mViewModelStore;
  }
  
  public final boolean hasOptionsMenu()
  {
    return this.mHasMenu;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  void initState()
  {
    this.mIndex = -1;
    this.mWho = null;
    this.mAdded = false;
    this.mRemoving = false;
    this.mFromLayout = false;
    this.mInLayout = false;
    this.mRestored = false;
    this.mBackStackNesting = 0;
    this.mFragmentManager = null;
    this.mChildFragmentManager = null;
    this.mHost = null;
    this.mFragmentId = 0;
    this.mContainerId = 0;
    this.mTag = null;
    this.mHidden = false;
    this.mDetached = false;
    this.mRetaining = false;
  }
  
  void instantiateChildFragmentManager()
  {
    Object localObject = this.mHost;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Fragment has not been attached yet.");
      throw ((Throwable)localObject);
    }
    localObject = new android/support/v4/app/n;
    ((n)localObject).<init>();
    this.mChildFragmentManager = ((n)localObject);
    localObject = this.mChildFragmentManager;
    l locall = this.mHost;
    Fragment.2 local2 = new android/support/v4/app/Fragment$2;
    local2.<init>(this);
    ((n)localObject).a(locall, local2, this);
  }
  
  public final boolean isAdded()
  {
    l locall = this.mHost;
    boolean bool;
    if (locall != null)
    {
      bool = this.mAdded;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      locall = null;
    }
  }
  
  public final boolean isDetached()
  {
    return this.mDetached;
  }
  
  public final boolean isHidden()
  {
    return this.mHidden;
  }
  
  boolean isHideReplaced()
  {
    Fragment.a locala = this.mAnimationInfo;
    boolean bool;
    if (locala == null)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = this.mAnimationInfo;
      bool = locala.k;
    }
  }
  
  final boolean isInBackStack()
  {
    int i = this.mBackStackNesting;
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final boolean isInLayout()
  {
    return this.mInLayout;
  }
  
  public final boolean isMenuVisible()
  {
    return this.mMenuVisible;
  }
  
  boolean isPostponed()
  {
    Fragment.a locala = this.mAnimationInfo;
    boolean bool;
    if (locala == null)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = this.mAnimationInfo;
      bool = locala.i;
    }
  }
  
  public final boolean isRemoving()
  {
    return this.mRemoving;
  }
  
  public final boolean isResumed()
  {
    int i = this.mState;
    int k = 5;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final boolean isStateSaved()
  {
    n localn = this.mFragmentManager;
    boolean bool;
    if (localn == null)
    {
      bool = false;
      localn = null;
    }
    for (;;)
    {
      return bool;
      localn = this.mFragmentManager;
      bool = localn.g();
    }
  }
  
  public final boolean isVisible()
  {
    boolean bool = isAdded();
    Object localObject;
    int i;
    if (bool)
    {
      bool = isHidden();
      if (!bool)
      {
        localObject = this.mView;
        if (localObject != null)
        {
          localObject = this.mView.getWindowToken();
          if (localObject != null)
          {
            localObject = this.mView;
            i = ((View)localObject).getVisibility();
            if (i == 0) {
              i = 1;
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject = null;
    }
  }
  
  void noteStateNotSaved()
  {
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      localn.o();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    this.mCalled = true;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void onAttach(Activity paramActivity)
  {
    this.mCalled = true;
  }
  
  public void onAttach(Context paramContext)
  {
    boolean bool = true;
    this.mCalled = bool;
    Object localObject = this.mHost;
    if (localObject == null) {
      bool = false;
    }
    for (localObject = null;; localObject = this.mHost.h())
    {
      if (localObject != null)
      {
        this.mCalled = false;
        onAttach((Activity)localObject);
      }
      return;
    }
  }
  
  public void onAttachFragment(Fragment paramFragment) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.mCalled = true;
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    this.mCalled = i;
    restoreChildFragmentState(paramBundle);
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      boolean bool = localn.b(i);
      if (!bool)
      {
        localn = this.mChildFragmentManager;
        localn.p();
      }
    }
  }
  
  public Animation onCreateAnimation(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public Animator onCreateAnimator(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    getActivity().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public void onDestroy()
  {
    boolean bool = true;
    this.mCalled = bool;
    Object localObject = this.mViewModelStore;
    if (localObject != null)
    {
      localObject = this.mHost.d;
      bool = ((n)localObject).s;
      if (!bool)
      {
        localObject = this.mViewModelStore;
        ((p)localObject).a();
      }
    }
  }
  
  public void onDestroyOptionsMenu() {}
  
  public void onDestroyView()
  {
    this.mCalled = true;
  }
  
  public void onDetach()
  {
    this.mCalled = true;
  }
  
  public LayoutInflater onGetLayoutInflater(Bundle paramBundle)
  {
    return getLayoutInflater(paramBundle);
  }
  
  public void onHiddenChanged(boolean paramBoolean) {}
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.mCalled = true;
  }
  
  public void onInflate(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    boolean bool = true;
    this.mCalled = bool;
    Object localObject = this.mHost;
    if (localObject == null) {
      bool = false;
    }
    for (localObject = null;; localObject = this.mHost.h())
    {
      if (localObject != null)
      {
        this.mCalled = false;
        onInflate((Activity)localObject, paramAttributeSet, paramBundle);
      }
      return;
    }
  }
  
  public void onLowMemory()
  {
    this.mCalled = true;
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onOptionsMenuClosed(Menu paramMenu) {}
  
  public void onPause()
  {
    this.mCalled = true;
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean) {}
  
  public void onPrepareOptionsMenu(Menu paramMenu) {}
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  public void onResume()
  {
    this.mCalled = true;
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    this.mCalled = true;
  }
  
  public void onStop()
  {
    this.mCalled = true;
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {}
  
  public void onViewStateRestored(Bundle paramBundle)
  {
    this.mCalled = true;
  }
  
  m peekChildFragmentManager()
  {
    return this.mChildFragmentManager;
  }
  
  void performActivityCreated(Bundle paramBundle)
  {
    Object localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).o();
    }
    this.mState = 2;
    localObject1 = null;
    this.mCalled = false;
    onActivityCreated(paramBundle);
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onActivityCreated()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).q();
    }
  }
  
  void performConfigurationChanged(Configuration paramConfiguration)
  {
    onConfigurationChanged(paramConfiguration);
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      localn.a(paramConfiguration);
    }
  }
  
  boolean performContextItemSelected(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    boolean bool2 = this.mHidden;
    if (!bool2)
    {
      bool2 = onContextItemSelected(paramMenuItem);
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      n localn = this.mChildFragmentManager;
      if (localn != null)
      {
        localn = this.mChildFragmentManager;
        bool2 = localn.b(paramMenuItem);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  void performCreate(Bundle paramBundle)
  {
    int i = 1;
    Object localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).o();
    }
    this.mState = i;
    localObject1 = null;
    this.mCalled = false;
    onCreate(paramBundle);
    this.mIsCreated = i;
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onCreate()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mLifecycleRegistry;
    Object localObject2 = c.a.ON_CREATE;
    ((f)localObject1).a((c.a)localObject2);
  }
  
  boolean performCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    boolean bool1 = false;
    boolean bool2 = this.mHidden;
    if (!bool2)
    {
      bool2 = this.mHasMenu;
      if (bool2)
      {
        bool2 = this.mMenuVisible;
        if (bool2)
        {
          bool1 = true;
          onCreateOptionsMenu(paramMenu, paramMenuInflater);
        }
      }
      n localn = this.mChildFragmentManager;
      if (localn != null)
      {
        localn = this.mChildFragmentManager;
        bool2 = localn.a(paramMenu, paramMenuInflater);
        bool1 |= bool2;
      }
    }
    return bool1;
  }
  
  View performCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      localn.o();
    }
    this.mPerformedCreateView = true;
    return onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  void performDestroy()
  {
    Object localObject1 = this.mLifecycleRegistry;
    Object localObject2 = c.a.ON_DESTROY;
    ((f)localObject1).a((c.a)localObject2);
    localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).x();
    }
    this.mState = 0;
    this.mCalled = false;
    this.mIsCreated = false;
    onDestroy();
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onDestroy()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mChildFragmentManager = null;
  }
  
  void performDestroyView()
  {
    Object localObject1 = null;
    Object localObject2 = this.mChildFragmentManager;
    if (localObject2 != null)
    {
      localObject2 = this.mChildFragmentManager;
      ((n)localObject2).w();
    }
    this.mState = 1;
    this.mCalled = false;
    onDestroyView();
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject2 = new android/support/v4/app/ac;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Fragment " + this + " did not call through to super.onDestroyView()";
      ((ac)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    localObject2 = this.mLoaderManager;
    if (localObject2 != null)
    {
      localObject2 = this.mLoaderManager;
      ((LoaderManagerImpl)localObject2).a();
    }
    this.mPerformedCreateView = false;
  }
  
  void performDetach()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    this.mCalled = false;
    onDetach();
    this.mLayoutInflater = null;
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject2 = new android/support/v4/app/ac;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Fragment " + this + " did not call through to super.onDetach()";
      ((ac)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    localObject2 = this.mChildFragmentManager;
    if (localObject2 != null)
    {
      bool = this.mRetaining;
      if (!bool)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = "Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance";
        ((IllegalStateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      localObject2 = this.mChildFragmentManager;
      ((n)localObject2).x();
      this.mChildFragmentManager = null;
    }
  }
  
  LayoutInflater performGetLayoutInflater(Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = onGetLayoutInflater(paramBundle);
    this.mLayoutInflater = localLayoutInflater;
    return this.mLayoutInflater;
  }
  
  void performLowMemory()
  {
    onLowMemory();
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      localn.y();
    }
  }
  
  void performMultiWindowModeChanged(boolean paramBoolean)
  {
    onMultiWindowModeChanged(paramBoolean);
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      localn.a(paramBoolean);
    }
  }
  
  boolean performOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    boolean bool2 = this.mHidden;
    if (!bool2)
    {
      bool2 = this.mHasMenu;
      if (bool2)
      {
        bool2 = this.mMenuVisible;
        if (bool2)
        {
          bool2 = onOptionsItemSelected(paramMenuItem);
          if (!bool2) {}
        }
      }
    }
    for (;;)
    {
      return bool1;
      n localn = this.mChildFragmentManager;
      if (localn != null)
      {
        localn = this.mChildFragmentManager;
        bool2 = localn.a(paramMenuItem);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  void performOptionsMenuClosed(Menu paramMenu)
  {
    boolean bool = this.mHidden;
    if (!bool)
    {
      bool = this.mHasMenu;
      if (bool)
      {
        bool = this.mMenuVisible;
        if (bool) {
          onOptionsMenuClosed(paramMenu);
        }
      }
      n localn = this.mChildFragmentManager;
      if (localn != null)
      {
        localn = this.mChildFragmentManager;
        localn.b(paramMenu);
      }
    }
  }
  
  void performPause()
  {
    Object localObject1 = this.mLifecycleRegistry;
    Object localObject2 = c.a.ON_PAUSE;
    ((f)localObject1).a((c.a)localObject2);
    localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).t();
    }
    this.mState = 4;
    localObject1 = null;
    this.mCalled = false;
    onPause();
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onPause()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  void performPictureInPictureModeChanged(boolean paramBoolean)
  {
    onPictureInPictureModeChanged(paramBoolean);
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      localn.b(paramBoolean);
    }
  }
  
  boolean performPrepareOptionsMenu(Menu paramMenu)
  {
    boolean bool1 = false;
    boolean bool2 = this.mHidden;
    if (!bool2)
    {
      bool2 = this.mHasMenu;
      if (bool2)
      {
        bool2 = this.mMenuVisible;
        if (bool2)
        {
          bool1 = true;
          onPrepareOptionsMenu(paramMenu);
        }
      }
      n localn = this.mChildFragmentManager;
      if (localn != null)
      {
        localn = this.mChildFragmentManager;
        bool2 = localn.a(paramMenu);
        bool1 |= bool2;
      }
    }
    return bool1;
  }
  
  void performReallyStop()
  {
    n localn = this.mChildFragmentManager;
    if (localn != null)
    {
      localn = this.mChildFragmentManager;
      localn.v();
    }
    this.mState = 2;
  }
  
  void performResume()
  {
    Object localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      this.mChildFragmentManager.o();
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).i();
    }
    this.mState = 5;
    localObject1 = null;
    this.mCalled = false;
    onResume();
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onResume()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      this.mChildFragmentManager.s();
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).i();
    }
    localObject1 = this.mLifecycleRegistry;
    Object localObject2 = c.a.ON_RESUME;
    ((f)localObject1).a((c.a)localObject2);
  }
  
  void performSaveInstanceState(Bundle paramBundle)
  {
    onSaveInstanceState(paramBundle);
    Object localObject = this.mChildFragmentManager;
    if (localObject != null)
    {
      localObject = this.mChildFragmentManager.n();
      if (localObject != null)
      {
        String str = "android:support:fragments";
        paramBundle.putParcelable(str, (Parcelable)localObject);
      }
    }
  }
  
  void performStart()
  {
    Object localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      this.mChildFragmentManager.o();
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).i();
    }
    this.mState = 4;
    localObject1 = null;
    this.mCalled = false;
    onStart();
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onStart()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).r();
    }
    localObject1 = this.mLifecycleRegistry;
    Object localObject2 = c.a.ON_START;
    ((f)localObject1).a((c.a)localObject2);
  }
  
  void performStop()
  {
    Object localObject1 = this.mLifecycleRegistry;
    Object localObject2 = c.a.ON_STOP;
    ((f)localObject1).a((c.a)localObject2);
    localObject1 = this.mChildFragmentManager;
    if (localObject1 != null)
    {
      localObject1 = this.mChildFragmentManager;
      ((n)localObject1).u();
    }
    this.mState = 3;
    localObject1 = null;
    this.mCalled = false;
    onStop();
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onStop()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  public void postponeEnterTransition()
  {
    ensureAnimationInfo().i = true;
  }
  
  public void registerForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(this);
  }
  
  public final void requestPermissions(String[] paramArrayOfString, int paramInt)
  {
    Object localObject1 = this.mHost;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mHost.a(this, paramArrayOfString, paramInt);
  }
  
  public final i requireActivity()
  {
    Object localObject1 = getActivity();
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to an activity.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (i)localObject1;
  }
  
  public final Context requireContext()
  {
    Object localObject1 = getContext();
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to a context.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (Context)localObject1;
  }
  
  public final m requireFragmentManager()
  {
    Object localObject1 = getFragmentManager();
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not associated with a fragment manager.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (m)localObject1;
  }
  
  public final Object requireHost()
  {
    Object localObject1 = getHost();
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to a host.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return localObject1;
  }
  
  void restoreChildFragmentState(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Object localObject = paramBundle.getParcelable("android:support:fragments");
      if (localObject != null)
      {
        n localn = this.mChildFragmentManager;
        if (localn == null) {
          instantiateChildFragmentManager();
        }
        localn = this.mChildFragmentManager;
        o localo = this.mChildNonConfig;
        localn.a((Parcelable)localObject, localo);
        this.mChildNonConfig = null;
        localObject = this.mChildFragmentManager;
        ((n)localObject).p();
      }
    }
  }
  
  final void restoreViewState(Bundle paramBundle)
  {
    Object localObject1 = this.mSavedViewState;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.mInnerView;
      localObject2 = this.mSavedViewState;
      ((View)localObject1).restoreHierarchyState((SparseArray)localObject2);
      bool = false;
      localObject1 = null;
      this.mSavedViewState = null;
    }
    localObject1 = null;
    this.mCalled = false;
    onViewStateRestored(paramBundle);
    boolean bool = this.mCalled;
    if (!bool)
    {
      localObject1 = new android/support/v4/app/ac;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " did not call through to super.onViewStateRestored()";
      ((ac)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  public void setAllowEnterTransitionOverlap(boolean paramBoolean)
  {
    Fragment.a locala = ensureAnimationInfo();
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    Fragment.a.a(locala, localBoolean);
  }
  
  public void setAllowReturnTransitionOverlap(boolean paramBoolean)
  {
    Fragment.a locala = ensureAnimationInfo();
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    Fragment.a.b(locala, localBoolean);
  }
  
  void setAnimatingAway(View paramView)
  {
    ensureAnimationInfo().a = paramView;
  }
  
  void setAnimator(Animator paramAnimator)
  {
    ensureAnimationInfo().b = paramAnimator;
  }
  
  public void setArguments(Bundle paramBundle)
  {
    int i = this.mIndex;
    if (i >= 0)
    {
      boolean bool = isStateSaved();
      if (bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Fragment already active and state has been saved");
        throw localIllegalStateException;
      }
    }
    this.mArguments = paramBundle;
  }
  
  public void setEnterSharedElementCallback(ab paramab)
  {
    ensureAnimationInfo().g = paramab;
  }
  
  public void setEnterTransition(Object paramObject)
  {
    Fragment.a.a(ensureAnimationInfo(), paramObject);
  }
  
  public void setExitSharedElementCallback(ab paramab)
  {
    ensureAnimationInfo().h = paramab;
  }
  
  public void setExitTransition(Object paramObject)
  {
    Fragment.a.c(ensureAnimationInfo(), paramObject);
  }
  
  public void setHasOptionsMenu(boolean paramBoolean)
  {
    boolean bool = this.mHasMenu;
    if (bool != paramBoolean)
    {
      this.mHasMenu = paramBoolean;
      bool = isAdded();
      if (bool)
      {
        bool = isHidden();
        if (!bool)
        {
          l locall = this.mHost;
          locall.d();
        }
      }
    }
  }
  
  void setHideReplaced(boolean paramBoolean)
  {
    ensureAnimationInfo().k = paramBoolean;
  }
  
  final void setIndex(int paramInt, Fragment paramFragment)
  {
    this.mIndex = paramInt;
    Object localObject;
    String str;
    int i;
    if (paramFragment != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = paramFragment.mWho;
      localObject = ((StringBuilder)localObject).append(str);
      str = ":";
      localObject = ((StringBuilder)localObject).append(str);
      i = this.mIndex;
      localObject = i;
    }
    for (this.mWho = ((String)localObject);; this.mWho = ((String)localObject))
    {
      return;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = "android:fragment:";
      localObject = ((StringBuilder)localObject).append(str);
      i = this.mIndex;
      localObject = i;
    }
  }
  
  public void setInitialSavedState(Fragment.SavedState paramSavedState)
  {
    int i = this.mIndex;
    if (i >= 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Fragment already active");
      throw ((Throwable)localObject);
    }
    if (paramSavedState != null)
    {
      localObject = paramSavedState.a;
      if (localObject == null) {}
    }
    for (Object localObject = paramSavedState.a;; localObject = null)
    {
      this.mSavedFragmentState = ((Bundle)localObject);
      return;
      i = 0;
    }
  }
  
  public void setMenuVisibility(boolean paramBoolean)
  {
    boolean bool = this.mMenuVisible;
    if (bool != paramBoolean)
    {
      this.mMenuVisible = paramBoolean;
      bool = this.mHasMenu;
      if (bool)
      {
        bool = isAdded();
        if (bool)
        {
          bool = isHidden();
          if (!bool)
          {
            l locall = this.mHost;
            locall.d();
          }
        }
      }
    }
  }
  
  void setNextAnim(int paramInt)
  {
    Fragment.a locala = this.mAnimationInfo;
    if ((locala == null) && (paramInt == 0)) {}
    for (;;)
    {
      return;
      locala = ensureAnimationInfo();
      locala.d = paramInt;
    }
  }
  
  void setNextTransition(int paramInt1, int paramInt2)
  {
    Fragment.a locala = this.mAnimationInfo;
    if ((locala == null) && (paramInt1 == 0) && (paramInt2 == 0)) {}
    for (;;)
    {
      return;
      ensureAnimationInfo();
      this.mAnimationInfo.e = paramInt1;
      locala = this.mAnimationInfo;
      locala.f = paramInt2;
    }
  }
  
  void setOnStartEnterTransitionListener(Fragment.c paramc)
  {
    ensureAnimationInfo();
    Object localObject1 = this.mAnimationInfo.j;
    if (paramc == localObject1) {}
    for (;;)
    {
      return;
      if (paramc != null)
      {
        localObject1 = this.mAnimationInfo.j;
        if (localObject1 != null)
        {
          localObject1 = new java/lang/IllegalStateException;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Trying to set a replacement startPostponedEnterTransition on " + this;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      localObject1 = this.mAnimationInfo;
      boolean bool = ((Fragment.a)localObject1).i;
      if (bool)
      {
        localObject1 = this.mAnimationInfo;
        ((Fragment.a)localObject1).j = paramc;
      }
      if (paramc != null) {
        paramc.b();
      }
    }
  }
  
  public void setReenterTransition(Object paramObject)
  {
    Fragment.a.d(ensureAnimationInfo(), paramObject);
  }
  
  public void setRetainInstance(boolean paramBoolean)
  {
    this.mRetainInstance = paramBoolean;
  }
  
  public void setReturnTransition(Object paramObject)
  {
    Fragment.a.b(ensureAnimationInfo(), paramObject);
  }
  
  public void setSharedElementEnterTransition(Object paramObject)
  {
    Fragment.a.e(ensureAnimationInfo(), paramObject);
  }
  
  public void setSharedElementReturnTransition(Object paramObject)
  {
    Fragment.a.f(ensureAnimationInfo(), paramObject);
  }
  
  void setStateAfterAnimating(int paramInt)
  {
    ensureAnimationInfo().c = paramInt;
  }
  
  public void setTargetFragment(Fragment paramFragment, int paramInt)
  {
    Object localObject1 = getFragmentManager();
    if (paramFragment != null) {}
    for (Object localObject2 = paramFragment.getFragmentManager(); (localObject1 != null) && (localObject2 != null) && (localObject1 != localObject2); localObject2 = null)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Fragment " + paramFragment + " must share the same FragmentManager to be set as a target fragment";
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    for (localObject2 = paramFragment; localObject2 != null; localObject2 = ((Fragment)localObject2).getTargetFragment()) {
      if (localObject2 == this)
      {
        localObject2 = new java/lang/IllegalArgumentException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = "Setting " + paramFragment + " as the target of " + this + " would create a target cycle";
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    this.mTarget = paramFragment;
    this.mTargetRequestCode = paramInt;
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    int i = 4;
    boolean bool1 = this.mUserVisibleHint;
    Object localObject;
    if ((!bool1) && (paramBoolean))
    {
      int j = this.mState;
      if (j < i)
      {
        localObject = this.mFragmentManager;
        if (localObject != null)
        {
          boolean bool2 = isAdded();
          if (bool2)
          {
            localObject = this.mFragmentManager;
            ((n)localObject).a(this);
          }
        }
      }
    }
    this.mUserVisibleHint = paramBoolean;
    int k = this.mState;
    if ((k < i) && (!paramBoolean)) {
      k = 1;
    }
    for (;;)
    {
      this.mDeferStart = k;
      localObject = this.mSavedFragmentState;
      if (localObject != null)
      {
        bool3 = this.mUserVisibleHint;
        localObject = Boolean.valueOf(bool3);
        this.mSavedUserVisibleHint = ((Boolean)localObject);
      }
      return;
      boolean bool3 = false;
      localObject = null;
    }
  }
  
  public boolean shouldShowRequestPermissionRationale(String paramString)
  {
    l locall = this.mHost;
    boolean bool;
    if (locall != null)
    {
      locall = this.mHost;
      bool = locall.a(paramString);
    }
    for (;;)
    {
      return bool;
      bool = false;
      locall = null;
    }
  }
  
  public void startActivity(Intent paramIntent)
  {
    startActivity(paramIntent, null);
  }
  
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    Object localObject1 = this.mHost;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mHost.a(this, paramIntent, -1, paramBundle);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    startActivityForResult(paramIntent, paramInt, null);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    Object localObject1 = this.mHost;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.mHost.a(this, paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    Object localObject1 = this.mHost;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mHost;
    Object localObject2 = this;
    ((l)localObject1).a(this, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public void startPostponedEnterTransition()
  {
    Object localObject1 = this.mFragmentManager;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.mFragmentManager.m;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = ensureAnimationInfo();
      localObject2 = null;
      ((Fragment.a)localObject1).i = false;
    }
    for (;;)
    {
      return;
      localObject1 = Looper.myLooper();
      localObject2 = this.mFragmentManager.m.j().getLooper();
      if (localObject1 != localObject2)
      {
        localObject1 = this.mFragmentManager.m.j();
        localObject2 = new android/support/v4/app/Fragment$1;
        ((Fragment.1)localObject2).<init>(this);
        ((Handler)localObject1).postAtFrontOfQueue((Runnable)localObject2);
      }
      else
      {
        callStartTransitionListener();
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    d.a(this, localStringBuilder);
    int i = this.mIndex;
    if (i >= 0)
    {
      str = " #";
      localStringBuilder.append(str);
      i = this.mIndex;
      localStringBuilder.append(i);
    }
    i = this.mFragmentId;
    if (i != 0)
    {
      localStringBuilder.append(" id=0x");
      i = this.mFragmentId;
      str = Integer.toHexString(i);
      localStringBuilder.append(str);
    }
    String str = this.mTag;
    if (str != null)
    {
      localStringBuilder.append(" ");
      str = this.mTag;
      localStringBuilder.append(str);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void unregisterForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\Fragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */