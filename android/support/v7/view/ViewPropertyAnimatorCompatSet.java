package android.support.v7.view;

import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v4.view.x;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet
{
  final ArrayList mAnimators;
  private long mDuration = -1;
  private Interpolator mInterpolator;
  private boolean mIsStarted;
  w mListener;
  private final x mProxyListener;
  
  public ViewPropertyAnimatorCompatSet()
  {
    Object localObject = new android/support/v7/view/ViewPropertyAnimatorCompatSet$1;
    ((ViewPropertyAnimatorCompatSet.1)localObject).<init>(this);
    this.mProxyListener = ((x)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mAnimators = ((ArrayList)localObject);
  }
  
  public void cancel()
  {
    boolean bool = this.mIsStarted;
    if (!bool) {}
    for (;;)
    {
      return;
      Object localObject = this.mAnimators;
      Iterator localIterator = ((ArrayList)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (v)localIterator.next();
        ((v)localObject).b();
      }
      bool = false;
      localObject = null;
      this.mIsStarted = false;
    }
  }
  
  void onAnimationsEnded()
  {
    this.mIsStarted = false;
  }
  
  public ViewPropertyAnimatorCompatSet play(v paramv)
  {
    boolean bool = this.mIsStarted;
    if (!bool)
    {
      ArrayList localArrayList = this.mAnimators;
      localArrayList.add(paramv);
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet playSequentially(v paramv1, v paramv2)
  {
    this.mAnimators.add(paramv1);
    long l = paramv1.a();
    paramv2.b(l);
    this.mAnimators.add(paramv2);
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet setDuration(long paramLong)
  {
    boolean bool = this.mIsStarted;
    if (!bool) {
      this.mDuration = paramLong;
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator paramInterpolator)
  {
    boolean bool = this.mIsStarted;
    if (!bool) {
      this.mInterpolator = paramInterpolator;
    }
    return this;
  }
  
  public ViewPropertyAnimatorCompatSet setListener(w paramw)
  {
    boolean bool = this.mIsStarted;
    if (!bool) {
      this.mListener = paramw;
    }
    return this;
  }
  
  public void start()
  {
    boolean bool1 = this.mIsStarted;
    if (bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = this.mAnimators;
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (v)localIterator.next();
        long l1 = this.mDuration;
        long l2 = 0L;
        boolean bool2 = l1 < l2;
        if (!bool2)
        {
          l1 = this.mDuration;
          ((v)localObject1).a(l1);
        }
        Object localObject2 = this.mInterpolator;
        if (localObject2 != null)
        {
          localObject2 = this.mInterpolator;
          ((v)localObject1).a((Interpolator)localObject2);
        }
        localObject2 = this.mListener;
        if (localObject2 != null)
        {
          localObject2 = this.mProxyListener;
          ((v)localObject1).a((w)localObject2);
        }
        ((v)localObject1).c();
      }
      bool1 = true;
      this.mIsStarted = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\ViewPropertyAnimatorCompatSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */