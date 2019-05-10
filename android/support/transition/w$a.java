package android.support.transition;

import android.support.v4.h.a;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class w$a
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener
{
  u a;
  ViewGroup b;
  
  w$a(u paramu, ViewGroup paramViewGroup)
  {
    this.a = paramu;
    this.b = paramViewGroup;
  }
  
  private void a()
  {
    this.b.getViewTreeObserver().removeOnPreDrawListener(this);
    this.b.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw()
  {
    boolean bool1 = true;
    a();
    Object localObject1 = w.b();
    Object localObject2 = this.b;
    boolean bool2 = ((ArrayList)localObject1).remove(localObject2);
    if (!bool2) {
      return bool1;
    }
    Object localObject3 = w.a();
    localObject1 = this.b;
    localObject1 = (ArrayList)((a)localObject3).get(localObject1);
    localObject2 = null;
    Object localObject4;
    Object localObject5;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      localObject4 = this.b;
      ((a)localObject3).put(localObject4, localObject1);
      localObject5 = null;
      localObject2 = localObject1;
      bool2 = false;
      localObject1 = null;
    }
    for (;;)
    {
      localObject4 = this.a;
      ((ArrayList)localObject2).add(localObject4);
      localObject2 = this.a;
      localObject4 = new android/support/transition/w$a$1;
      ((w.a.1)localObject4).<init>(this, (a)localObject3);
      ((u)localObject2).a((u.c)localObject4);
      localObject2 = this.a;
      localObject3 = this.b;
      int i = 0;
      localObject4 = null;
      ((u)localObject2).a((ViewGroup)localObject3, false);
      if (localObject1 != null)
      {
        localObject2 = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject2).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (u)((Iterator)localObject2).next();
          localObject3 = this.b;
          ((u)localObject1).e((View)localObject3);
        }
        i = ((ArrayList)localObject1).size();
        if (i > 0)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>((Collection)localObject1);
          localObject5 = localObject2;
          localObject2 = localObject1;
          localObject1 = localObject5;
        }
      }
      else
      {
        localObject1 = this.a;
        localObject2 = this.b;
        ((u)localObject1).a((ViewGroup)localObject2);
        break;
      }
      localObject5 = null;
      localObject2 = localObject1;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    a();
    Object localObject1 = w.b();
    Object localObject2 = this.b;
    ((ArrayList)localObject1).remove(localObject2);
    localObject1 = w.a();
    localObject2 = this.b;
    localObject1 = (ArrayList)((a)localObject1).get(localObject2);
    if (localObject1 != null)
    {
      int i = ((ArrayList)localObject1).size();
      if (i > 0)
      {
        localObject2 = ((ArrayList)localObject1).iterator();
        for (;;)
        {
          boolean bool = ((Iterator)localObject2).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (u)((Iterator)localObject2).next();
          ViewGroup localViewGroup = this.b;
          ((u)localObject1).e(localViewGroup);
        }
      }
    }
    this.a.a(true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\w$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */