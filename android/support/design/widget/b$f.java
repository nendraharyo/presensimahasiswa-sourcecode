package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.a.k;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.widget.FrameLayout;

class b$f
  extends FrameLayout
{
  private b.e a;
  private b.d b;
  
  b$f(Context paramContext)
  {
    this(paramContext, null);
  }
  
  b$f(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.k.SnackbarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = a.k.SnackbarLayout_elevation;
    boolean bool = ((TypedArray)localObject).hasValue(i);
    if (bool)
    {
      int j = a.k.SnackbarLayout_elevation;
      j = ((TypedArray)localObject).getDimensionPixelSize(j, 0);
      float f = j;
      r.a(this, f);
    }
    ((TypedArray)localObject).recycle();
    setClickable(true);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b.d locald = this.b;
    if (locald != null)
    {
      locald = this.b;
      locald.a(this);
    }
    r.o(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b.d locald = this.b;
    if (locald != null)
    {
      locald = this.b;
      locald.b(this);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b.e locale = this.a;
    if (locale != null)
    {
      locale = this.a;
      locale.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  void setOnAttachStateChangeListener(b.d paramd)
  {
    this.b = paramd;
  }
  
  void setOnLayoutChangeListener(b.e parame)
  {
    this.a = parame;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\b$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */