package android.support.v4.app;

import android.arch.lifecycle.c;
import android.arch.lifecycle.c.b;
import android.arch.lifecycle.p;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.h.n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

public class i
  extends f
  implements a.a, a.c
{
  static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
  static final String FRAGMENTS_TAG = "android:support:fragments";
  static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
  static final int MSG_REALLY_STOPPED = 1;
  static final int MSG_RESUME_PENDING = 2;
  static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
  static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
  private static final String TAG = "FragmentActivity";
  boolean mCreated;
  final k mFragments;
  final Handler mHandler;
  t mLoaderManager;
  int mNextCandidateRequestIndex;
  n mPendingFragmentActivityResults;
  boolean mReallyStopped;
  boolean mRequestedPermissionsFromFragment;
  boolean mResumed;
  boolean mRetaining;
  boolean mStopped;
  private p mViewModelStore;
  
  public i()
  {
    Object localObject = new android/support/v4/app/i$1;
    ((i.1)localObject).<init>(this);
    this.mHandler = ((Handler)localObject);
    localObject = new android/support/v4/app/i$a;
    ((i.a)localObject).<init>(this);
    localObject = k.a((l)localObject);
    this.mFragments = ((k)localObject);
    this.mStopped = bool;
    this.mReallyStopped = bool;
  }
  
  private int allocateRequestIndex(Fragment paramFragment)
  {
    int i = (char)-2;
    Object localObject = this.mPendingFragmentActivityResults;
    int j = ((n)localObject).b();
    if (j >= i)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Too many pending Fragment activity results.");
      throw ((Throwable)localObject);
    }
    for (;;)
    {
      localObject = this.mPendingFragmentActivityResults;
      k = this.mNextCandidateRequestIndex;
      j = ((n)localObject).f(k);
      if (j < 0) {
        break;
      }
      j = (this.mNextCandidateRequestIndex + 1) % i;
      this.mNextCandidateRequestIndex = j;
    }
    j = this.mNextCandidateRequestIndex;
    n localn = this.mPendingFragmentActivityResults;
    String str = paramFragment.mWho;
    localn.b(j, str);
    int k = (this.mNextCandidateRequestIndex + 1) % i;
    this.mNextCandidateRequestIndex = k;
    return j;
  }
  
  private void markFragmentsCreated()
  {
    boolean bool;
    do
    {
      m localm = getSupportFragmentManager();
      c.b localb = c.b.c;
      bool = markState(localm, localb);
    } while (bool);
  }
  
  private static boolean markState(m paramm, c.b paramb)
  {
    boolean bool1 = false;
    Object localObject = null;
    Iterator localIterator = paramm.e().iterator();
    boolean bool2 = false;
    android.arch.lifecycle.f localf = null;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Fragment)localIterator.next();
    } while (localObject == null);
    c.b localb1 = ((Fragment)localObject).getLifecycle().a();
    c.b localb2 = c.b.d;
    boolean bool3 = localb1.a(localb2);
    if (bool3)
    {
      localf = ((Fragment)localObject).mLifecycleRegistry;
      localf.a(paramb);
      bool2 = true;
    }
    localObject = ((Fragment)localObject).peekChildFragmentManager();
    if (localObject != null) {}
    for (bool1 = markState((m)localObject, paramb) | bool2;; bool1 = bool2)
    {
      bool2 = bool1;
      break;
      return bool2;
    }
  }
  
  final View dispatchFragmentsOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.mFragments.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  void doReallyStop(boolean paramBoolean)
  {
    int i = 1;
    boolean bool = this.mReallyStopped;
    if (!bool)
    {
      this.mReallyStopped = i;
      this.mRetaining = paramBoolean;
      Handler localHandler = this.mHandler;
      localHandler.removeMessages(i);
      onReallyStop();
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    int i = System.identityHashCode(this);
    Object localObject = Integer.toHexString(i);
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.println(" State:");
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "  ";
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print("mCreated=");
    boolean bool = this.mCreated;
    paramPrintWriter.print(bool);
    paramPrintWriter.print("mResumed=");
    bool = this.mResumed;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mStopped=");
    bool = this.mStopped;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mReallyStopped=");
    bool = this.mReallyStopped;
    paramPrintWriter.println(bool);
    t localt = this.mLoaderManager;
    if (localt != null)
    {
      localt = this.mLoaderManager;
      localt.a((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.mFragments.a().a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public Object getLastCustomNonConfigurationInstance()
  {
    Object localObject = (i.b)getLastNonConfigurationInstance();
    if (localObject != null) {}
    for (localObject = ((i.b)localObject).a;; localObject = null) {
      return localObject;
    }
  }
  
  public c getLifecycle()
  {
    return super.getLifecycle();
  }
  
  public m getSupportFragmentManager()
  {
    return this.mFragments.a();
  }
  
  public t getSupportLoaderManager()
  {
    Object localObject = this.mLoaderManager;
    if (localObject != null) {}
    for (localObject = this.mLoaderManager;; localObject = this.mLoaderManager)
    {
      return (t)localObject;
      localObject = new android/support/v4/app/LoaderManagerImpl;
      p localp = getViewModelStore();
      ((LoaderManagerImpl)localObject).<init>(this, localp);
      this.mLoaderManager = ((t)localObject);
    }
  }
  
  public p getViewModelStore()
  {
    Object localObject = getApplication();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
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
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = this.mFragments;
    ((k)localObject1).b();
    int i = paramInt1 >> 16;
    Object localObject2;
    Object localObject3;
    if (i != 0)
    {
      int j = i + -1;
      localObject1 = (String)this.mPendingFragmentActivityResults.a(j);
      localObject2 = this.mPendingFragmentActivityResults;
      ((n)localObject2).c(j);
      if (localObject1 == null)
      {
        localObject1 = "FragmentActivity";
        localObject3 = "Activity result delivered for unknown Fragment.";
        Log.w((String)localObject1, (String)localObject3);
      }
    }
    for (;;)
    {
      return;
      localObject3 = this.mFragments.a((String)localObject1);
      if (localObject3 == null)
      {
        localObject3 = "FragmentActivity";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "Activity result no fragment exists for who: ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject1 = (String)localObject1;
        Log.w((String)localObject3, (String)localObject1);
      }
      else
      {
        i = (char)-1 & paramInt1;
        ((Fragment)localObject3).onActivityResult(i, paramInt2, paramIntent);
        continue;
        localObject1 = a.a();
        if (localObject1 != null)
        {
          boolean bool = ((a.b)localObject1).a(this, paramInt1, paramInt2, paramIntent);
          if (bool) {}
        }
        else
        {
          super.onActivityResult(paramInt1, paramInt2, paramIntent);
        }
      }
    }
  }
  
  public void onAttachFragment(Fragment paramFragment) {}
  
  public void onBackPressed()
  {
    m localm = this.mFragments.a();
    boolean bool1 = localm.g();
    if (bool1)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 25;
      if (i > j) {}
    }
    for (;;)
    {
      return;
      if (!bool1)
      {
        boolean bool2 = localm.c();
        if (bool2) {}
      }
      else
      {
        super.onBackPressed();
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mFragments.b();
    this.mFragments.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject1 = null;
    this.mFragments.a(null);
    super.onCreate(paramBundle);
    Object localObject2 = (i.b)getLastNonConfigurationInstance();
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = ((i.b)localObject2).b;
      this.mViewModelStore = ((p)localObject3);
    }
    Object localObject4;
    if (paramBundle != null)
    {
      localObject3 = paramBundle.getParcelable("android:support:fragments");
      localObject4 = this.mFragments;
      if (localObject2 == null) {
        break label193;
      }
    }
    for (localObject2 = ((i.b)localObject2).c;; localObject2 = null)
    {
      ((k)localObject4).a((Parcelable)localObject3, (o)localObject2);
      localObject2 = "android:support:next_request_index";
      boolean bool = paramBundle.containsKey((String)localObject2);
      if (bool)
      {
        i = paramBundle.getInt("android:support:next_request_index");
        this.mNextCandidateRequestIndex = i;
        localObject1 = paramBundle.getIntArray("android:support:request_indicies");
        localObject2 = "android:support:request_fragment_who";
        localObject3 = paramBundle.getStringArray((String)localObject2);
        if ((localObject1 != null) && (localObject3 != null))
        {
          i = localObject1.length;
          j = localObject3.length;
          if (i == j) {
            break;
          }
        }
        localObject2 = "FragmentActivity";
        localObject1 = "Invalid requestCode mapping in savedInstanceState.";
        Log.w((String)localObject2, (String)localObject1);
      }
      localObject2 = this.mPendingFragmentActivityResults;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v4/h/n;
        ((n)localObject2).<init>();
        this.mPendingFragmentActivityResults = ((n)localObject2);
        this.mNextCandidateRequestIndex = 0;
      }
      this.mFragments.e();
      return;
      label193:
      i = 0;
    }
    localObject2 = new android/support/v4/h/n;
    int j = localObject1.length;
    ((n)localObject2).<init>(j);
    this.mPendingFragmentActivityResults = ((n)localObject2);
    int i = 0;
    localObject2 = null;
    for (;;)
    {
      j = localObject1.length;
      if (i >= j) {
        break;
      }
      localObject4 = this.mPendingFragmentActivityResults;
      int k = localObject1[i];
      Object localObject5 = localObject3[i];
      ((n)localObject4).b(k, localObject5);
      i += 1;
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    boolean bool1;
    if (paramInt == 0)
    {
      bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      k localk = this.mFragments;
      MenuInflater localMenuInflater = getMenuInflater();
      boolean bool2 = localk.a(paramMenu, localMenuInflater);
      bool1 |= bool2;
    }
    for (;;)
    {
      return bool1;
      bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    boolean bool = false;
    doReallyStop(false);
    p localp = this.mViewModelStore;
    if (localp != null)
    {
      bool = this.mRetaining;
      if (!bool)
      {
        localp = this.mViewModelStore;
        localp.a();
      }
    }
    this.mFragments.l();
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.mFragments.m();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool = super.onMenuItemSelected(paramInt, paramMenuItem);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      k localk;
      switch (paramInt)
      {
      default: 
        bool = false;
        localk = null;
        break;
      case 0: 
        localk = this.mFragments;
        bool = localk.a(paramMenuItem);
        break;
      case 6: 
        localk = this.mFragments;
        bool = localk.b(paramMenuItem);
      }
    }
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    this.mFragments.a(paramBoolean);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.mFragments.b();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      k localk = this.mFragments;
      localk.b(paramMenu);
    }
  }
  
  protected void onPause()
  {
    int i = 2;
    super.onPause();
    this.mResumed = false;
    Handler localHandler = this.mHandler;
    boolean bool = localHandler.hasMessages(i);
    if (bool)
    {
      localHandler = this.mHandler;
      localHandler.removeMessages(i);
      onResumeFragments();
    }
    this.mFragments.i();
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    this.mFragments.b(paramBoolean);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    onResumeFragments();
    this.mFragments.n();
  }
  
  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool1;
    if ((paramInt == 0) && (paramMenu != null))
    {
      bool1 = onPrepareOptionsPanel(paramView, paramMenu);
      k localk = this.mFragments;
      boolean bool2 = localk.a(paramMenu);
      bool1 |= bool2;
    }
    for (;;)
    {
      return bool1;
      bool1 = super.onPreparePanel(paramInt, paramView, paramMenu);
    }
  }
  
  void onReallyStop()
  {
    this.mFragments.k();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = (char)-1;
    Object localObject1 = this.mFragments;
    ((k)localObject1).b();
    int j = paramInt >> 16 & i;
    Object localObject2;
    Object localObject3;
    if (j != 0)
    {
      int k = j + -1;
      localObject1 = (String)this.mPendingFragmentActivityResults.a(k);
      localObject2 = this.mPendingFragmentActivityResults;
      ((n)localObject2).c(k);
      if (localObject1 != null) {
        break label85;
      }
      localObject1 = "FragmentActivity";
      localObject3 = "Activity result delivered for unknown Fragment.";
      Log.w((String)localObject1, (String)localObject3);
    }
    for (;;)
    {
      return;
      label85:
      localObject3 = this.mFragments.a((String)localObject1);
      if (localObject3 == null)
      {
        localObject3 = "FragmentActivity";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "Activity result no fragment exists for who: ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject1 = (String)localObject1;
        Log.w((String)localObject3, (String)localObject1);
      }
      else
      {
        j = paramInt & i;
        ((Fragment)localObject3).onRequestPermissionsResult(j, paramArrayOfString, paramArrayOfInt);
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.mResumed = true;
    this.mFragments.n();
  }
  
  protected void onResumeFragments()
  {
    this.mFragments.h();
  }
  
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    boolean bool = this.mStopped;
    if (bool)
    {
      bool = true;
      doReallyStop(bool);
    }
    Object localObject1 = onRetainCustomNonConfigurationInstance();
    Object localObject2 = this.mFragments;
    o localo = ((k)localObject2).d();
    if (localo == null)
    {
      localObject2 = this.mViewModelStore;
      if ((localObject2 == null) && (localObject1 == null))
      {
        bool = false;
        localObject2 = null;
      }
    }
    for (;;)
    {
      return localObject2;
      localObject2 = new android/support/v4/app/i$b;
      ((i.b)localObject2).<init>();
      ((i.b)localObject2).a = localObject1;
      localObject1 = this.mViewModelStore;
      ((i.b)localObject2).b = ((p)localObject1);
      ((i.b)localObject2).c = localo;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    markFragmentsCreated();
    Object localObject = this.mFragments.c();
    String str;
    if (localObject != null)
    {
      str = "android:support:fragments";
      paramBundle.putParcelable(str, (Parcelable)localObject);
    }
    localObject = this.mPendingFragmentActivityResults;
    int i = ((n)localObject).b();
    if (i > 0)
    {
      int j = this.mNextCandidateRequestIndex;
      paramBundle.putInt("android:support:next_request_index", j);
      int[] arrayOfInt = new int[this.mPendingFragmentActivityResults.b()];
      String[] arrayOfString = new String[this.mPendingFragmentActivityResults.b()];
      i = 0;
      localObject = null;
      j = 0;
      str = null;
      for (;;)
      {
        localObject = this.mPendingFragmentActivityResults;
        i = ((n)localObject).b();
        if (j >= i) {
          break;
        }
        i = this.mPendingFragmentActivityResults.d(j);
        arrayOfInt[j] = i;
        localObject = (String)this.mPendingFragmentActivityResults.e(j);
        arrayOfString[j] = localObject;
        i = j + 1;
        j = i;
      }
      paramBundle.putIntArray("android:support:request_indicies", arrayOfInt);
      localObject = "android:support:request_fragment_who";
      paramBundle.putStringArray((String)localObject, arrayOfString);
    }
  }
  
  protected void onStart()
  {
    int i = 1;
    super.onStart();
    this.mStopped = false;
    this.mReallyStopped = false;
    Object localObject = this.mHandler;
    ((Handler)localObject).removeMessages(i);
    boolean bool = this.mCreated;
    if (!bool)
    {
      this.mCreated = i;
      localObject = this.mFragments;
      ((k)localObject).f();
    }
    this.mFragments.b();
    this.mFragments.n();
    this.mFragments.g();
  }
  
  public void onStateNotSaved()
  {
    this.mFragments.b();
  }
  
  protected void onStop()
  {
    int i = 1;
    super.onStop();
    this.mStopped = i;
    markFragmentsCreated();
    this.mHandler.sendEmptyMessage(i);
    this.mFragments.j();
  }
  
  void requestPermissionsFromFragment(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    int i = -1;
    if (paramInt == i) {
      a.a(this, paramArrayOfString, paramInt);
    }
    for (;;)
    {
      return;
      checkForValidRequestCode(paramInt);
      i = 1;
      try
      {
        this.mRequestedPermissionsFromFragment = i;
        i = allocateRequestIndex(paramFragment) + 1 << 16;
        int j = (char)-1 & paramInt;
        i += j;
        a.a(this, paramArrayOfString, i);
        this.mRequestedPermissionsFromFragment = false;
      }
      finally
      {
        this.mRequestedPermissionsFromFragment = false;
      }
    }
  }
  
  public void setEnterSharedElementCallback(ab paramab)
  {
    a.a(this, paramab);
  }
  
  public void setExitSharedElementCallback(ab paramab)
  {
    a.b(this, paramab);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    boolean bool = this.mStartedActivityFromFragment;
    if (!bool)
    {
      int i = -1;
      if (paramInt != i) {
        checkForValidRequestCode(paramInt);
      }
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    startActivityFromFragment(paramFragment, paramIntent, paramInt, null);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    int j = 1;
    this.mStartedActivityFromFragment = j;
    if (paramInt == i) {
      j = -1;
    }
    for (;;)
    {
      try
      {
        a.a(this, paramIntent, j, paramBundle);
        return;
      }
      finally
      {
        this.mStartedActivityFromFragment = false;
      }
      checkForValidRequestCode(paramInt);
      j = allocateRequestIndex(paramFragment) + 1 << 16;
      i = (char)-1 & paramInt;
      j += i;
      a.a(this, paramIntent, j, paramBundle);
      this.mStartedActivityFromFragment = false;
    }
  }
  
  public void startIntentSenderFromFragment(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    this.mStartedIntentSenderFromFragment = true;
    int i = -1;
    i locali;
    int j;
    if (paramInt1 == i)
    {
      locali = this;
      j = paramInt1;
    }
    for (;;)
    {
      try
      {
        a.a(this, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
        i = 0;
        locali = null;
        return;
      }
      finally
      {
        int k;
        this.mStartedIntentSenderFromFragment = false;
      }
      checkForValidRequestCode(paramInt1);
      i = allocateRequestIndex(paramFragment) + 1 << 16;
      k = (char)-1 & paramInt1;
      j = i + k;
      locali = this;
      a.a(this, paramIntentSender, j, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      i = 0;
      locali = null;
      this.mStartedIntentSenderFromFragment = false;
    }
  }
  
  public void supportFinishAfterTransition()
  {
    a.b(this);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    invalidateOptionsMenu();
  }
  
  public void supportPostponeEnterTransition()
  {
    a.c(this);
  }
  
  public void supportStartPostponedEnterTransition()
  {
    a.d(this);
  }
  
  public final void validateRequestPermissionsRequestCode(int paramInt)
  {
    boolean bool = this.mRequestedPermissionsFromFragment;
    if (!bool)
    {
      int i = -1;
      if (paramInt != i) {
        checkForValidRequestCode(paramInt);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */