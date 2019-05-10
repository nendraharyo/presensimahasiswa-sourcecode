package android.support.design.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.a.d;
import android.support.design.a.f;
import android.support.design.a.k;
import android.support.design.widget.b.c;
import android.support.v4.view.r;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout
  extends LinearLayout
  implements b.c
{
  private TextView a;
  private Button b;
  private int c;
  private int d;
  
  public SnackbarContentLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.k.SnackbarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = a.k.SnackbarLayout_android_maxWidth;
    j = ((TypedArray)localObject).getDimensionPixelSize(j, i);
    this.c = j;
    j = a.k.SnackbarLayout_maxActionInlineWidth;
    j = ((TypedArray)localObject).getDimensionPixelSize(j, i);
    this.d = j;
    ((TypedArray)localObject).recycle();
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = r.r(paramView);
    int i;
    int j;
    if (bool)
    {
      i = r.g(paramView);
      j = r.h(paramView);
      r.a(paramView, i, paramInt1, j, paramInt2);
    }
    for (;;)
    {
      return;
      i = paramView.getPaddingLeft();
      j = paramView.getPaddingRight();
      paramView.setPadding(i, paramInt1, j, paramInt2);
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    TextView localTextView1 = null;
    int i = getOrientation();
    if (paramInt1 != i)
    {
      setOrientation(paramInt1);
      bool2 = bool1;
    }
    TextView localTextView2 = this.a;
    i = localTextView2.getPaddingTop();
    if (i == paramInt2)
    {
      localTextView2 = this.a;
      i = localTextView2.getPaddingBottom();
      if (i == paramInt3) {}
    }
    else
    {
      localTextView1 = this.a;
      a(localTextView1, paramInt2, paramInt3);
      bool2 = bool1;
    }
    return bool2;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    float f = 1.0F;
    this.a.setAlpha(0.0F);
    Object localObject = this.a.animate().alpha(f);
    long l = paramInt2;
    localObject = ((ViewPropertyAnimator)localObject).setDuration(l);
    l = paramInt1;
    ((ViewPropertyAnimator)localObject).setStartDelay(l).start();
    localObject = this.b;
    int i = ((Button)localObject).getVisibility();
    if (i == 0)
    {
      this.b.setAlpha(0.0F);
      localObject = this.b.animate().alpha(f);
      l = paramInt2;
      localObject = ((ViewPropertyAnimator)localObject).setDuration(l);
      l = paramInt1;
      localObject = ((ViewPropertyAnimator)localObject).setStartDelay(l);
      ((ViewPropertyAnimator)localObject).start();
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    float f = 1.0F;
    this.a.setAlpha(f);
    Object localObject = this.a.animate().alpha(0.0F);
    long l = paramInt2;
    localObject = ((ViewPropertyAnimator)localObject).setDuration(l);
    l = paramInt1;
    ((ViewPropertyAnimator)localObject).setStartDelay(l).start();
    localObject = this.b;
    int i = ((Button)localObject).getVisibility();
    if (i == 0)
    {
      this.b.setAlpha(f);
      localObject = this.b.animate().alpha(0.0F);
      l = paramInt2;
      localObject = ((ViewPropertyAnimator)localObject).setDuration(l);
      l = paramInt1;
      localObject = ((ViewPropertyAnimator)localObject).setStartDelay(l);
      ((ViewPropertyAnimator)localObject).start();
    }
  }
  
  public Button getActionView()
  {
    return this.b;
  }
  
  public TextView getMessageView()
  {
    return this.a;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    int i = a.f.snackbar_text;
    Object localObject = (TextView)findViewById(i);
    this.a = ((TextView)localObject);
    i = a.f.snackbar_action;
    localObject = (Button)findViewById(i);
    this.b = ((Button)localObject);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    super.onMeasure(paramInt1, paramInt2);
    int j = this.c;
    if (j > 0)
    {
      j = getMeasuredWidth();
      m = this.c;
      if (j > m)
      {
        j = this.c;
        m = 1073741824;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(j, m);
        super.onMeasure(paramInt1, paramInt2);
      }
    }
    Resources localResources1 = getResources();
    int m = a.d.design_snackbar_padding_vertical_2lines;
    j = localResources1.getDimensionPixelSize(m);
    Resources localResources2 = getResources();
    int n = a.d.design_snackbar_padding_vertical;
    m = localResources2.getDimensionPixelSize(n);
    Layout localLayout = this.a.getLayout();
    n = localLayout.getLineCount();
    int k;
    if (n > i)
    {
      n = i;
      if (n == 0) {
        break label216;
      }
      int i1 = this.d;
      if (i1 <= 0) {
        break label216;
      }
      Button localButton = this.b;
      i1 = localButton.getMeasuredWidth();
      int i2 = this.d;
      if (i1 <= i2) {
        break label216;
      }
      m = j - m;
      k = a(i, j, m);
      if (k == 0) {
        break label250;
      }
      k = i;
    }
    for (;;)
    {
      if (k != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      n = 0;
      localLayout = null;
      break;
      label216:
      if (n != 0) {}
      for (;;)
      {
        bool = a(0, k, k);
        if (!bool) {
          break label250;
        }
        bool = i;
        break;
        bool = m;
      }
      label250:
      boolean bool = false;
      localResources1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\SnackbarContentLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */