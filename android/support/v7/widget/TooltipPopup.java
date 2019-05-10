package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.IBinder;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.style;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

class TooltipPopup
{
  private static final String TAG = "TooltipPopup";
  private final View mContentView;
  private final Context mContext;
  private final WindowManager.LayoutParams mLayoutParams;
  private final TextView mMessageView;
  private final int[] mTmpAnchorPos;
  private final int[] mTmpAppPos;
  private final Rect mTmpDisplayFrame;
  
  TooltipPopup(Context paramContext)
  {
    Object localObject = new android/view/WindowManager$LayoutParams;
    ((WindowManager.LayoutParams)localObject).<init>();
    this.mLayoutParams = ((WindowManager.LayoutParams)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTmpDisplayFrame = ((Rect)localObject);
    localObject = new int[i];
    this.mTmpAnchorPos = ((int[])localObject);
    localObject = new int[i];
    this.mTmpAppPos = ((int[])localObject);
    this.mContext = paramContext;
    localObject = LayoutInflater.from(this.mContext);
    i = R.layout.abc_tooltip;
    localObject = ((LayoutInflater)localObject).inflate(i, null);
    this.mContentView = ((View)localObject);
    localObject = this.mContentView;
    i = R.id.message;
    localObject = (TextView)((View)localObject).findViewById(i);
    this.mMessageView = ((TextView)localObject);
    localObject = this.mLayoutParams;
    String str = getClass().getSimpleName();
    ((WindowManager.LayoutParams)localObject).setTitle(str);
    localObject = this.mLayoutParams;
    str = this.mContext.getPackageName();
    ((WindowManager.LayoutParams)localObject).packageName = str;
    this.mLayoutParams.type = 1002;
    this.mLayoutParams.width = j;
    this.mLayoutParams.height = j;
    this.mLayoutParams.format = -3;
    localObject = this.mLayoutParams;
    i = R.style.Animation_AppCompat_Tooltip;
    ((WindowManager.LayoutParams)localObject).windowAnimations = i;
    this.mLayoutParams.flags = 24;
  }
  
  private void computePosition(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, WindowManager.LayoutParams paramLayoutParams)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = paramView.getApplicationWindowToken();
    paramLayoutParams.token = ((IBinder)localObject2);
    localObject2 = this.mContext.getResources();
    int k = R.dimen.tooltip_precise_anchor_threshold;
    int m = ((Resources)localObject2).getDimensionPixelOffset(k);
    k = paramView.getWidth();
    label106:
    int n;
    Object localObject3;
    label140:
    int i1;
    View localView;
    if (k >= m)
    {
      k = paramView.getHeight();
      if (k < m) {
        break label191;
      }
      localObject2 = this.mContext.getResources();
      k = R.dimen.tooltip_precise_anchor_extra_offset;
      m = ((Resources)localObject2).getDimensionPixelOffset(k);
      k = paramInt2 + m;
      m = paramInt2 - m;
      n = 49;
      paramLayoutParams.gravity = n;
      localObject3 = this.mContext;
      Resources localResources = ((Context)localObject3).getResources();
      if (!paramBoolean) {
        break label206;
      }
      n = R.dimen.tooltip_y_offset_touch;
      i1 = localResources.getDimensionPixelOffset(n);
      localView = getAppRootView(paramView);
      if (localView != null) {
        break label214;
      }
      localObject2 = "TooltipPopup";
      localObject1 = "Cannot find app view";
      Log.e((String)localObject2, (String)localObject1);
    }
    for (;;)
    {
      return;
      k = paramView.getWidth();
      paramInt1 = k / 2;
      break;
      label191:
      k = paramView.getHeight();
      m = 0;
      localObject2 = null;
      break label106;
      label206:
      n = R.dimen.tooltip_y_offset_non_touch;
      break label140;
      label214:
      localObject3 = this.mTmpDisplayFrame;
      localView.getWindowVisibleDisplayFrame((Rect)localObject3);
      localObject3 = this.mTmpDisplayFrame;
      n = ((Rect)localObject3).left;
      Object localObject4;
      Object localObject5;
      if (n < 0)
      {
        localObject3 = this.mTmpDisplayFrame;
        n = ((Rect)localObject3).top;
        if (n < 0)
        {
          localObject4 = this.mContext.getResources();
          localObject3 = "status_bar_height";
          localObject5 = "dimen";
          String str = "android";
          n = ((Resources)localObject4).getIdentifier((String)localObject3, (String)localObject5, str);
          if (n == 0) {
            break label577;
          }
          n = ((Resources)localObject4).getDimensionPixelSize(n);
        }
      }
      for (;;)
      {
        localObject4 = ((Resources)localObject4).getDisplayMetrics();
        localObject5 = this.mTmpDisplayFrame;
        int i2 = ((DisplayMetrics)localObject4).widthPixels;
        int i3 = ((DisplayMetrics)localObject4).heightPixels;
        ((Rect)localObject5).set(0, n, i2, i3);
        localObject3 = this.mTmpAppPos;
        localView.getLocationOnScreen((int[])localObject3);
        localObject3 = this.mTmpAnchorPos;
        paramView.getLocationOnScreen((int[])localObject3);
        localObject3 = this.mTmpAnchorPos;
        i3 = localObject3[0];
        int i4 = this.mTmpAppPos[0];
        i3 -= i4;
        localObject3[0] = i3;
        localObject3 = this.mTmpAnchorPos;
        i3 = localObject3[i];
        localObject5 = this.mTmpAppPos;
        i4 = localObject5[i];
        i3 -= i4;
        localObject3[i] = i3;
        n = this.mTmpAnchorPos[0] + paramInt1;
        int i5 = localView.getWidth() / 2;
        n -= i5;
        paramLayoutParams.x = n;
        j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContentView.measure(j, j);
        localObject1 = this.mContentView;
        j = ((View)localObject1).getMeasuredHeight();
        n = this.mTmpAnchorPos[i];
        m = m + n - i1 - j;
        localObject3 = this.mTmpAnchorPos;
        n = localObject3[i];
        k = k + n + i1;
        if (!paramBoolean) {
          break label596;
        }
        if (m < 0) {
          break label586;
        }
        paramLayoutParams.y = m;
        break;
        label577:
        n = 0;
        localObject3 = null;
      }
      label586:
      paramLayoutParams.y = k;
      continue;
      label596:
      j += k;
      localObject3 = this.mTmpDisplayFrame;
      n = ((Rect)localObject3).height();
      if (j <= n) {
        paramLayoutParams.y = k;
      } else {
        paramLayoutParams.y = m;
      }
    }
  }
  
  private static View getAppRootView(View paramView)
  {
    View localView = paramView.getRootView();
    Object localObject = localView.getLayoutParams();
    boolean bool1 = localObject instanceof WindowManager.LayoutParams;
    if (bool1)
    {
      localObject = (WindowManager.LayoutParams)localObject;
      int j = ((WindowManager.LayoutParams)localObject).type;
      int i = 2;
      if (j == i) {
        localObject = localView;
      }
    }
    for (;;)
    {
      return (View)localObject;
      for (localObject = paramView.getContext();; localObject = ((ContextWrapper)localObject).getBaseContext())
      {
        boolean bool2 = localObject instanceof ContextWrapper;
        if (!bool2) {
          break label90;
        }
        bool2 = localObject instanceof Activity;
        if (bool2)
        {
          localObject = ((Activity)localObject).getWindow().getDecorView();
          break;
        }
      }
      label90:
      localObject = localView;
    }
  }
  
  void hide()
  {
    boolean bool = isShowing();
    if (!bool) {}
    for (;;)
    {
      return;
      WindowManager localWindowManager = (WindowManager)this.mContext.getSystemService("window");
      View localView = this.mContentView;
      localWindowManager.removeView(localView);
    }
  }
  
  boolean isShowing()
  {
    ViewParent localViewParent = this.mContentView.getParent();
    boolean bool;
    if (localViewParent != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewParent = null;
    }
  }
  
  void show(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, CharSequence paramCharSequence)
  {
    boolean bool = isShowing();
    if (bool) {
      hide();
    }
    this.mMessageView.setText(paramCharSequence);
    WindowManager.LayoutParams localLayoutParams1 = this.mLayoutParams;
    Object localObject = this;
    View localView = paramView;
    computePosition(paramView, paramInt1, paramInt2, paramBoolean, localLayoutParams1);
    localObject = (WindowManager)this.mContext.getSystemService("window");
    localView = this.mContentView;
    WindowManager.LayoutParams localLayoutParams2 = this.mLayoutParams;
    ((WindowManager)localObject).addView(localView, localLayoutParams2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\TooltipPopup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */