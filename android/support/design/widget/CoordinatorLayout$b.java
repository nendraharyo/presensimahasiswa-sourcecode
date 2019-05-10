package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;

public abstract class CoordinatorLayout$b
{
  public CoordinatorLayout$b() {}
  
  public CoordinatorLayout$b(Context paramContext, AttributeSet paramAttributeSet) {}
  
  public z a(CoordinatorLayout paramCoordinatorLayout, View paramView, z paramz)
  {
    return paramz;
  }
  
  public void a(CoordinatorLayout.e parame) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView, Parcelable paramParcelable) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt)
  {
    if (paramInt == 0) {
      c(paramCoordinatorLayout, paramView1, paramView2);
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      a(paramCoordinatorLayout, paramView1, paramView2, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramInt3 == 0) {
      a(paramCoordinatorLayout, paramView1, paramView2, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt)
  {
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {}
    for (boolean bool = a(paramCoordinatorLayout, paramView1, paramView2, paramView3, paramInt1);; bool = false) {
      return bool;
    }
  }
  
  public Parcelable b(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    return View.BaseSavedState.EMPTY_STATE;
  }
  
  public void b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt) {}
  
  public void b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      b(paramCoordinatorLayout, paramView1, paramView2, paramView3, paramInt1);
    }
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    return false;
  }
  
  public int c(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    return -16777216;
  }
  
  public void c() {}
  
  public void c(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {}
  
  public float d(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    return 0.0F;
  }
  
  public void d(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {}
  
  public boolean e(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    float f = d(paramCoordinatorLayout, paramView);
    boolean bool = f < 0.0F;
    if (bool) {
      bool = true;
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CoordinatorLayout$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */