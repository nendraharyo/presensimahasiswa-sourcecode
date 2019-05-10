package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class RecyclerView$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  final Rect mDecorInsets;
  boolean mInsetsDirty;
  boolean mPendingInvalidate;
  RecyclerView.ViewHolder mViewHolder;
  
  public RecyclerView$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mDecorInsets = localRect;
    this.mInsetsDirty = true;
    this.mPendingInvalidate = false;
  }
  
  public RecyclerView$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mDecorInsets = localRect;
    this.mInsetsDirty = true;
    this.mPendingInvalidate = false;
  }
  
  public RecyclerView$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mDecorInsets = localRect;
    this.mInsetsDirty = true;
    this.mPendingInvalidate = false;
  }
  
  public RecyclerView$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mDecorInsets = localRect;
    this.mInsetsDirty = true;
    this.mPendingInvalidate = false;
  }
  
  public RecyclerView$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mDecorInsets = localRect;
    this.mInsetsDirty = true;
    this.mPendingInvalidate = false;
  }
  
  public int getViewAdapterPosition()
  {
    return this.mViewHolder.getAdapterPosition();
  }
  
  public int getViewLayoutPosition()
  {
    return this.mViewHolder.getLayoutPosition();
  }
  
  public int getViewPosition()
  {
    return this.mViewHolder.getPosition();
  }
  
  public boolean isItemChanged()
  {
    return this.mViewHolder.isUpdated();
  }
  
  public boolean isItemRemoved()
  {
    return this.mViewHolder.isRemoved();
  }
  
  public boolean isViewInvalid()
  {
    return this.mViewHolder.isInvalid();
  }
  
  public boolean viewNeedsUpdate()
  {
    return this.mViewHolder.needsUpdate();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$LayoutParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */