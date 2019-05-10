package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  private ViewStubCompat.OnInflateListener mInflateListener;
  private int mInflatedId;
  private WeakReference mInflatedViewRef;
  private LayoutInflater mInflater;
  private int mLayoutResource = 0;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = R.styleable.ViewStubCompat;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, 0);
    int j = R.styleable.ViewStubCompat_android_inflatedId;
    j = ((TypedArray)localObject).getResourceId(j, i);
    this.mInflatedId = j;
    j = R.styleable.ViewStubCompat_android_layout;
    j = ((TypedArray)localObject).getResourceId(j, 0);
    this.mLayoutResource = j;
    j = R.styleable.ViewStubCompat_android_id;
    j = ((TypedArray)localObject).getResourceId(j, i);
    setId(j);
    ((TypedArray)localObject).recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {}
  
  public void draw(Canvas paramCanvas) {}
  
  public int getInflatedId()
  {
    return this.mInflatedId;
  }
  
  public LayoutInflater getLayoutInflater()
  {
    return this.mInflater;
  }
  
  public int getLayoutResource()
  {
    return this.mLayoutResource;
  }
  
  public View inflate()
  {
    Object localObject1 = getParent();
    if (localObject1 != null)
    {
      boolean bool = localObject1 instanceof ViewGroup;
      if (bool)
      {
        int i = this.mLayoutResource;
        if (i != 0)
        {
          localObject1 = (ViewGroup)localObject1;
          Object localObject2 = this.mInflater;
          int j;
          if (localObject2 != null)
          {
            localObject2 = this.mInflater;
            j = this.mLayoutResource;
            ViewGroup.LayoutParams localLayoutParams = null;
            localObject2 = ((LayoutInflater)localObject2).inflate(j, (ViewGroup)localObject1, false);
            j = this.mInflatedId;
            int k = -1;
            if (j != k)
            {
              j = this.mInflatedId;
              ((View)localObject2).setId(j);
            }
            j = ((ViewGroup)localObject1).indexOfChild(this);
            ((ViewGroup)localObject1).removeViewInLayout(this);
            localLayoutParams = getLayoutParams();
            if (localLayoutParams == null) {
              break label173;
            }
            ((ViewGroup)localObject1).addView((View)localObject2, j, localLayoutParams);
          }
          for (;;)
          {
            localObject1 = new java/lang/ref/WeakReference;
            ((WeakReference)localObject1).<init>(localObject2);
            this.mInflatedViewRef = ((WeakReference)localObject1);
            localObject1 = this.mInflateListener;
            if (localObject1 != null)
            {
              localObject1 = this.mInflateListener;
              ((ViewStubCompat.OnInflateListener)localObject1).onInflate(this, (View)localObject2);
            }
            return (View)localObject2;
            localObject2 = LayoutInflater.from(getContext());
            break;
            label173:
            ((ViewGroup)localObject1).addView((View)localObject2, j);
          }
        }
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("ViewStub must have a valid layoutResource");
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("ViewStub must have a non-null ViewGroup viewParent");
    throw ((Throwable)localObject1);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt)
  {
    this.mInflatedId = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    this.mInflater = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt)
  {
    this.mLayoutResource = paramInt;
  }
  
  public void setOnInflateListener(ViewStubCompat.OnInflateListener paramOnInflateListener)
  {
    this.mInflateListener = paramOnInflateListener;
  }
  
  public void setVisibility(int paramInt)
  {
    Object localObject = this.mInflatedViewRef;
    if (localObject != null)
    {
      localObject = (View)this.mInflatedViewRef.get();
      if (localObject != null) {
        ((View)localObject).setVisibility(paramInt);
      }
    }
    for (;;)
    {
      return;
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("setVisibility called on un-referenced view");
      throw ((Throwable)localObject);
      super.setVisibility(paramInt);
      if (paramInt != 0)
      {
        int i = 4;
        if (paramInt != i) {}
      }
      else
      {
        inflate();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ViewStubCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */