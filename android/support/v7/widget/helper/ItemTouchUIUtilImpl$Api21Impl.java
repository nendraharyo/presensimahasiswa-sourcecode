package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.r;
import android.support.v7.recyclerview.R.id;
import android.support.v7.widget.RecyclerView;
import android.view.View;

class ItemTouchUIUtilImpl$Api21Impl
  extends ItemTouchUIUtilImpl.BaseImpl
{
  private float findMaxElevation(RecyclerView paramRecyclerView, View paramView)
  {
    int i = paramRecyclerView.getChildCount();
    int j = 0;
    float f1 = 0.0F;
    View localView = null;
    int k = 0;
    float f2 = 0.0F;
    if (k < i)
    {
      localView = paramRecyclerView.getChildAt(k);
      if (localView == paramView) {}
      for (;;)
      {
        j = k + 1;
        k = j;
        break;
        f1 = r.l(localView);
        boolean bool = f1 < f2;
        if (bool) {
          f2 = f1;
        }
      }
    }
    return f2;
  }
  
  public void clearView(View paramView)
  {
    int i = R.id.item_touch_helper_previous_elevation;
    Object localObject = paramView.getTag(i);
    if (localObject != null)
    {
      boolean bool = localObject instanceof Float;
      if (bool)
      {
        localObject = (Float)localObject;
        float f = ((Float)localObject).floatValue();
        r.a(paramView, f);
      }
    }
    i = R.id.item_touch_helper_previous_elevation;
    paramView.setTag(i, null);
    super.clearView(paramView);
  }
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i = R.id.item_touch_helper_previous_elevation;
      Object localObject = paramView.getTag(i);
      if (localObject == null)
      {
        float f1 = r.l(paramView);
        localObject = Float.valueOf(f1);
        float f2 = findMaxElevation(paramRecyclerView, paramView);
        float f3 = 1.0F + f2;
        r.a(paramView, f3);
        int j = R.id.item_touch_helper_previous_elevation;
        paramView.setTag(j, localObject);
      }
    }
    super.onDraw(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2, paramInt, paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchUIUtilImpl$Api21Impl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */