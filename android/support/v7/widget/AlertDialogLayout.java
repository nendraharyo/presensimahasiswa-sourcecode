package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.id;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class AlertDialogLayout
  extends LinearLayoutCompat
{
  public AlertDialogLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void forceUniformWidth(int paramInt1, int paramInt2)
  {
    int i = getMeasuredWidth();
    int j = 1073741824;
    int k = View.MeasureSpec.makeMeasureSpec(i, j);
    for (int m = 0; m < paramInt1; m = i)
    {
      View localView = getChildAt(m);
      i = localView.getVisibility();
      int n = 8;
      if (i != n)
      {
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
        i = ((LinearLayoutCompat.LayoutParams)localObject2).width;
        n = -1;
        if (i == n)
        {
          int i1 = ((LinearLayoutCompat.LayoutParams)localObject2).height;
          i = localView.getMeasuredHeight();
          ((LinearLayoutCompat.LayoutParams)localObject2).height = i;
          localObject1 = this;
          n = paramInt2;
          measureChildWithMargins(localView, k, 0, paramInt2, 0);
          ((LinearLayoutCompat.LayoutParams)localObject2).height = i1;
        }
      }
      i = m + 1;
    }
  }
  
  private static int resolveMinimumHeight(View paramView)
  {
    int i = r.j(paramView);
    if (i > 0) {}
    for (;;)
    {
      return i;
      boolean bool = paramView instanceof ViewGroup;
      if (bool)
      {
        paramView = (ViewGroup)paramView;
        j = paramView.getChildCount();
        int k = 1;
        if (j == k)
        {
          localView = paramView.getChildAt(0);
          j = resolveMinimumHeight(localView);
          continue;
        }
      }
      int j = 0;
      View localView = null;
    }
  }
  
  private void setChildFrame(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 + paramInt3;
    int j = paramInt2 + paramInt4;
    paramView.layout(paramInt1, paramInt2, i, j);
  }
  
  private boolean tryOnMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    int m = getChildCount();
    int n = 0;
    View localView = null;
    boolean bool = false;
    Object localObject4 = null;
    int i3;
    Object localObject5;
    if (n < m)
    {
      localObject3 = getChildAt(n);
      i2 = ((View)localObject3).getVisibility();
      i3 = 8;
      if (i2 == i3)
      {
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
      for (;;)
      {
        i = n + 1;
        n = i;
        localObject1 = localObject2;
        localObject2 = localObject3;
        break;
        i2 = ((View)localObject3).getId();
        i3 = R.id.topPanel;
        if (i2 == i3)
        {
          localObject5 = localObject2;
          localObject2 = localObject3;
          localObject3 = localObject5;
        }
        else
        {
          i3 = R.id.buttonPanel;
          if (i2 != i3) {
            break label148;
          }
          localObject2 = localObject1;
        }
      }
      label148:
      i3 = R.id.contentPanel;
      if (i2 != i3)
      {
        i3 = R.id.customPanel;
        if (i2 != i3) {}
      }
      else if (localObject4 != null)
      {
        bool = false;
      }
      for (localObject4 = null;; localObject4 = null)
      {
        return bool;
        localObject4 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject1;
        break;
        bool = false;
      }
    }
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5 = View.MeasureSpec.getSize(paramInt2);
    int i6 = View.MeasureSpec.getMode(paramInt1);
    int i2 = 0;
    k = getPaddingTop();
    n = getPaddingBottom() + k;
    if (localObject1 != null)
    {
      localObject3 = null;
      ((View)localObject1).measure(paramInt1, 0);
      k = ((View)localObject1).getMeasuredHeight();
      n += k;
      k = ((View)localObject1).getMeasuredState();
      i2 = View.combineMeasuredStates(0, k);
    }
    i = 0;
    localObject1 = null;
    k = 0;
    localObject3 = null;
    if (localObject2 != null)
    {
      localObject3 = null;
      ((View)localObject2).measure(paramInt1, 0);
      i = resolveMinimumHeight((View)localObject2);
      k = ((View)localObject2).getMeasuredHeight() - i;
      n += i;
      i3 = ((View)localObject2).getMeasuredState();
      i2 = View.combineMeasuredStates(i2, i3);
    }
    for (int i7 = k;; i7 = 0)
    {
      k = 0;
      localObject3 = null;
      if (localObject4 != null) {
        if (i4 == 0)
        {
          k = 0;
          localObject3 = null;
          ((View)localObject4).measure(paramInt1, k);
          k = ((View)localObject4).getMeasuredHeight();
          n += k;
          i3 = ((View)localObject4).getMeasuredState();
          i2 = View.combineMeasuredStates(i2, i3);
        }
      }
      for (i3 = k;; i3 = 0)
      {
        k = i5 - n;
        int i8;
        if (localObject2 != null)
        {
          n -= i;
          i7 = Math.min(k, i7);
          if (i7 > 0)
          {
            k -= i7;
            i += i7;
          }
          i7 = 1073741824;
          i = View.MeasureSpec.makeMeasureSpec(i, i7);
          ((View)localObject2).measure(paramInt1, i);
          i = ((View)localObject2).getMeasuredHeight() + n;
          j = ((View)localObject2).getMeasuredState();
          j = View.combineMeasuredStates(i2, j);
          i8 = k;
          k = i;
          i = i8;
        }
        for (;;)
        {
          int i1;
          if ((localObject4 != null) && (i > 0))
          {
            k -= i3;
            n = i - i;
            i = View.MeasureSpec.makeMeasureSpec(i + i3, i4);
            ((View)localObject4).measure(paramInt1, i);
            i = ((View)localObject4).getMeasuredHeight();
            k += i;
            i1 = ((View)localObject4).getMeasuredState();
            i1 = View.combineMeasuredStates(j, i1);
            i8 = k;
            k = i1;
            i1 = i8;
          }
          for (;;)
          {
            i8 = 0;
            localObject5 = null;
            j = 0;
            localObject2 = null;
            i = 0;
            localObject1 = null;
            for (;;)
            {
              if (i < m)
              {
                localView = getChildAt(i);
                i2 = localView.getVisibility();
                i3 = 8;
                if (i2 != i3)
                {
                  n = localView.getMeasuredWidth();
                  j = Math.max(j, n);
                }
                i += 1;
                continue;
                localObject3 = null;
                i3 = i5 - n;
                k = View.MeasureSpec.makeMeasureSpec(Math.max(0, i3), i4);
                break;
              }
            }
            i = getPaddingLeft();
            n = getPaddingRight();
            i += n;
            k = View.resolveSizeAndState(j + i, paramInt1, k);
            j = 0;
            localObject2 = null;
            i1 = View.resolveSizeAndState(i1, paramInt2, 0);
            setMeasuredDimension(k, i1);
            i1 = 1073741824;
            if (i6 != i1) {
              forceUniformWidth(m, paramInt2);
            }
            i1 = 1;
            break;
            i1 = k;
            k = j;
          }
          i = k;
          j = i2;
          k = n;
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int m = getPaddingRight();
    int n = j - m;
    j -= i;
    m = getPaddingRight();
    int i1 = j - m;
    j = getMeasuredHeight();
    int i2 = getChildCount();
    m = getGravity();
    int i3 = m & 0x70;
    int i4 = 8388615;
    int i5 = m & i4;
    Object localObject1;
    int i6;
    label134:
    int i7;
    label147:
    int i8;
    int i9;
    Object localObject2;
    Object localObject3;
    switch (i3)
    {
    default: 
      j = getPaddingTop();
      localObject1 = getDividerDrawable();
      if (localObject1 == null)
      {
        m = 0;
        localObject1 = null;
        i6 = 0;
        m = 0;
        localObject1 = null;
        i7 = 0;
        i4 = j;
        if (i7 >= i2) {
          break label500;
        }
        localObject1 = getChildAt(i7);
        if (localObject1 != null)
        {
          j = ((View)localObject1).getVisibility();
          i3 = 8;
          if (j != i3)
          {
            i8 = ((View)localObject1).getMeasuredWidth();
            i9 = ((View)localObject1).getMeasuredHeight();
            localObject2 = ((View)localObject1).getLayoutParams();
            localObject3 = localObject2;
            localObject3 = (LinearLayoutCompat.LayoutParams)localObject2;
            j = ((LinearLayoutCompat.LayoutParams)localObject3).gravity;
            if (j < 0) {
              j = i5;
            }
            i3 = r.e(this);
            j = d.a(j, i3) & 0x7;
            switch (j)
            {
            default: 
              j = ((LinearLayoutCompat.LayoutParams)localObject3).leftMargin;
              i3 = i + j;
              label294:
              boolean bool = hasDividerBeforeChildAt(i7);
              if (!bool) {}
              break;
            }
          }
        }
      }
      break;
    }
    for (int k = i4 + i6;; k = i4)
    {
      i4 = ((LinearLayoutCompat.LayoutParams)localObject3).topMargin + k;
      localObject2 = this;
      setChildFrame((View)localObject1, i3, i4, i8, i9);
      k = ((LinearLayoutCompat.LayoutParams)localObject3).bottomMargin + i9;
      i4 += k;
      k = i7 + 1;
      i7 = k;
      break label147;
      m = getPaddingTop() + paramInt4 - paramInt2;
      k = m - k;
      break;
      m = getPaddingTop();
      i3 = paramInt4 - paramInt2;
      k = (i3 - k) / 2 + m;
      break;
      m = ((Drawable)localObject1).getIntrinsicHeight();
      i6 = m;
      break label134;
      k = (i1 - i8) / 2 + i;
      i3 = ((LinearLayoutCompat.LayoutParams)localObject3).leftMargin;
      k += i3;
      i3 = ((LinearLayoutCompat.LayoutParams)localObject3).rightMargin;
      i3 = k - i3;
      break label294;
      k = n - i8;
      i3 = ((LinearLayoutCompat.LayoutParams)localObject3).rightMargin;
      i3 = k - i3;
      break label294;
      label500:
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = tryOnMeasure(paramInt1, paramInt2);
    if (!bool) {
      super.onMeasure(paramInt1, paramInt2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AlertDialogLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */