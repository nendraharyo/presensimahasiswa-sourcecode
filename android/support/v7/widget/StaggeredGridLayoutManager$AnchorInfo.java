package android.support.v7.widget;

import java.util.Arrays;

class StaggeredGridLayoutManager$AnchorInfo
{
  boolean mInvalidateOffsets;
  boolean mLayoutFromEnd;
  int mOffset;
  int mPosition;
  int[] mSpanReferenceLines;
  boolean mValid;
  
  StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager paramStaggeredGridLayoutManager)
  {
    reset();
  }
  
  void assignCoordinateFromPadding()
  {
    boolean bool = this.mLayoutFromEnd;
    OrientationHelper localOrientationHelper;
    if (bool) {
      localOrientationHelper = this.this$0.mPrimaryOrientation;
    }
    for (int i = localOrientationHelper.getEndAfterPadding();; i = localOrientationHelper.getStartAfterPadding())
    {
      this.mOffset = i;
      return;
      localOrientationHelper = this.this$0.mPrimaryOrientation;
    }
  }
  
  void assignCoordinateFromPadding(int paramInt)
  {
    boolean bool = this.mLayoutFromEnd;
    OrientationHelper localOrientationHelper;
    int i;
    if (bool)
    {
      localOrientationHelper = this.this$0.mPrimaryOrientation;
      i = localOrientationHelper.getEndAfterPadding() - paramInt;
    }
    for (this.mOffset = i;; this.mOffset = i)
    {
      return;
      localOrientationHelper = this.this$0.mPrimaryOrientation;
      i = localOrientationHelper.getStartAfterPadding() + paramInt;
    }
  }
  
  void reset()
  {
    int i = -1;
    this.mPosition = i;
    int j = -1 << -1;
    this.mOffset = j;
    this.mLayoutFromEnd = false;
    this.mInvalidateOffsets = false;
    this.mValid = false;
    int[] arrayOfInt = this.mSpanReferenceLines;
    if (arrayOfInt != null)
    {
      arrayOfInt = this.mSpanReferenceLines;
      Arrays.fill(arrayOfInt, i);
    }
  }
  
  void saveSpanReferenceLines(StaggeredGridLayoutManager.Span[] paramArrayOfSpan)
  {
    int i = paramArrayOfSpan.length;
    int[] arrayOfInt1 = this.mSpanReferenceLines;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.mSpanReferenceLines;
      j = arrayOfInt1.length;
      if (j >= i) {}
    }
    else
    {
      j = this.this$0.mSpans.length;
      arrayOfInt1 = new int[j];
      this.mSpanReferenceLines = arrayOfInt1;
    }
    int j = 0;
    arrayOfInt1 = null;
    while (j < i)
    {
      int[] arrayOfInt2 = this.mSpanReferenceLines;
      StaggeredGridLayoutManager.Span localSpan = paramArrayOfSpan[j];
      int k = -1 << -1;
      int m = localSpan.getStartLine(k);
      arrayOfInt2[j] = m;
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\StaggeredGridLayoutManager$AnchorInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */