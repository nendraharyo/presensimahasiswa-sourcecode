package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class LinearLayoutCompat$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public int gravity;
  public float weight;
  
  public LinearLayoutCompat$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.gravity = -1;
    this.weight = 0.0F;
  }
  
  public LinearLayoutCompat$LayoutParams(int paramInt1, int paramInt2, float paramFloat)
  {
    super(paramInt1, paramInt2);
    this.gravity = -1;
    this.weight = paramFloat;
  }
  
  public LinearLayoutCompat$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.gravity = i;
    Object localObject = R.styleable.LinearLayoutCompat_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = R.styleable.LinearLayoutCompat_Layout_android_layout_weight;
    float f = ((TypedArray)localObject).getFloat(j, 0.0F);
    this.weight = f;
    j = R.styleable.LinearLayoutCompat_Layout_android_layout_gravity;
    j = ((TypedArray)localObject).getInt(j, i);
    this.gravity = j;
    ((TypedArray)localObject).recycle();
  }
  
  public LinearLayoutCompat$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.gravity = -1;
    float f = paramLayoutParams.weight;
    this.weight = f;
    int i = paramLayoutParams.gravity;
    this.gravity = i;
  }
  
  public LinearLayoutCompat$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.gravity = -1;
  }
  
  public LinearLayoutCompat$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    this.gravity = -1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearLayoutCompat$LayoutParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */