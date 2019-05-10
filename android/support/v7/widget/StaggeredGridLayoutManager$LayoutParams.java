package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class StaggeredGridLayoutManager$LayoutParams
  extends RecyclerView.LayoutParams
{
  public static final int INVALID_SPAN_ID = 255;
  boolean mFullSpan;
  StaggeredGridLayoutManager.Span mSpan;
  
  public StaggeredGridLayoutManager$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public final int getSpanIndex()
  {
    StaggeredGridLayoutManager.Span localSpan = this.mSpan;
    if (localSpan == null) {}
    for (int i = -1;; i = localSpan.mIndex)
    {
      return i;
      localSpan = this.mSpan;
    }
  }
  
  public boolean isFullSpan()
  {
    return this.mFullSpan;
  }
  
  public void setFullSpan(boolean paramBoolean)
  {
    this.mFullSpan = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\StaggeredGridLayoutManager$LayoutParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */