package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

public class DividerItemDecoration
  extends RecyclerView.ItemDecoration
{
  private static final int[] ATTRS;
  public static final int HORIZONTAL = 0;
  private static final String TAG = "DividerItem";
  public static final int VERTICAL = 1;
  private final Rect mBounds;
  private Drawable mDivider;
  private int mOrientation;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843284;
    ATTRS = arrayOfInt;
  }
  
  public DividerItemDecoration(Context paramContext, int paramInt)
  {
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mBounds = ((Rect)localObject1);
    localObject1 = ATTRS;
    localObject1 = paramContext.obtainStyledAttributes((int[])localObject1);
    Object localObject2 = ((TypedArray)localObject1).getDrawable(0);
    this.mDivider = ((Drawable)localObject2);
    localObject2 = this.mDivider;
    if (localObject2 == null)
    {
      localObject2 = "DividerItem";
      String str = "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()";
      Log.w((String)localObject2, str);
    }
    ((TypedArray)localObject1).recycle();
    setOrientation(paramInt);
  }
  
  private void drawHorizontal(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    int i = 0;
    paramCanvas.save();
    boolean bool = paramRecyclerView.getClipToPadding();
    int k;
    int j;
    int m;
    int n;
    int i1;
    if (bool)
    {
      k = paramRecyclerView.getPaddingTop();
      j = paramRecyclerView.getHeight();
      m = paramRecyclerView.getPaddingBottom();
      j -= m;
      m = paramRecyclerView.getPaddingLeft();
      n = paramRecyclerView.getWidth();
      i1 = paramRecyclerView.getPaddingRight();
      n -= i1;
      paramCanvas.clipRect(m, k, n, j);
    }
    for (;;)
    {
      m = paramRecyclerView.getChildCount();
      while (i < m)
      {
        Object localObject1 = paramRecyclerView.getChildAt(i);
        Object localObject2 = paramRecyclerView.getLayoutManager();
        Object localObject3 = this.mBounds;
        ((RecyclerView.LayoutManager)localObject2).getDecoratedBoundsWithMargins((View)localObject1, (Rect)localObject3);
        i1 = this.mBounds.right;
        float f = ((View)localObject1).getTranslationX();
        n = Math.round(f) + i1;
        localObject2 = this.mDivider;
        i1 = ((Drawable)localObject2).getIntrinsicWidth();
        i1 = n - i1;
        localObject3 = this.mDivider;
        ((Drawable)localObject3).setBounds(i1, k, n, j);
        localObject1 = this.mDivider;
        ((Drawable)localObject1).draw(paramCanvas);
        i += 1;
      }
      j = paramRecyclerView.getHeight();
      k = 0;
    }
    paramCanvas.restore();
  }
  
  private void drawVertical(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    int i = 0;
    paramCanvas.save();
    boolean bool = paramRecyclerView.getClipToPadding();
    int k;
    int j;
    int m;
    int n;
    int i1;
    if (bool)
    {
      k = paramRecyclerView.getPaddingLeft();
      j = paramRecyclerView.getWidth();
      m = paramRecyclerView.getPaddingRight();
      j -= m;
      m = paramRecyclerView.getPaddingTop();
      n = paramRecyclerView.getHeight();
      i1 = paramRecyclerView.getPaddingBottom();
      n -= i1;
      paramCanvas.clipRect(k, m, j, n);
    }
    for (;;)
    {
      m = paramRecyclerView.getChildCount();
      while (i < m)
      {
        Object localObject1 = paramRecyclerView.getChildAt(i);
        Object localObject2 = this.mBounds;
        paramRecyclerView.getDecoratedBoundsWithMargins((View)localObject1, (Rect)localObject2);
        i1 = this.mBounds.bottom;
        float f = ((View)localObject1).getTranslationY();
        n = Math.round(f) + i1;
        localObject2 = this.mDivider;
        i1 = ((Drawable)localObject2).getIntrinsicHeight();
        i1 = n - i1;
        Drawable localDrawable = this.mDivider;
        localDrawable.setBounds(k, i1, j, n);
        localObject1 = this.mDivider;
        ((Drawable)localObject1).draw(paramCanvas);
        i += 1;
      }
      j = paramRecyclerView.getWidth();
      k = 0;
    }
    paramCanvas.restore();
  }
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    Drawable localDrawable = this.mDivider;
    if (localDrawable == null) {
      paramRect.set(0, 0, 0, 0);
    }
    for (;;)
    {
      return;
      int i = this.mOrientation;
      int j = 1;
      if (i == j)
      {
        localDrawable = this.mDivider;
        i = localDrawable.getIntrinsicHeight();
        paramRect.set(0, 0, 0, i);
      }
      else
      {
        localDrawable = this.mDivider;
        i = localDrawable.getIntrinsicWidth();
        paramRect.set(0, 0, i, 0);
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    Object localObject = paramRecyclerView.getLayoutManager();
    if (localObject != null)
    {
      localObject = this.mDivider;
      if (localObject != null) {
        break label23;
      }
    }
    for (;;)
    {
      return;
      label23:
      int i = this.mOrientation;
      int j = 1;
      if (i == j) {
        drawVertical(paramCanvas, paramRecyclerView);
      } else {
        drawHorizontal(paramCanvas, paramRecyclerView);
      }
    }
  }
  
  public void setDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Drawable cannot be null.");
      throw localIllegalArgumentException;
    }
    this.mDivider = paramDrawable;
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        throw localIllegalArgumentException;
      }
    }
    this.mOrientation = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DividerItemDecoration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */