package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class m
  extends View
{
  public m(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public m(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public m(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i = getVisibility();
    if (i == 0)
    {
      i = 4;
      setVisibility(i);
    }
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    switch (i)
    {
    }
    for (;;)
    {
      return paramInt1;
      paramInt1 = Math.min(paramInt1, j);
      continue;
      paramInt1 = j;
    }
  }
  
  public void draw(Canvas paramCanvas) {}
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = a(getSuggestedMinimumWidth(), paramInt1);
    int j = a(getSuggestedMinimumHeight(), paramInt2);
    setMeasuredDimension(i, j);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */