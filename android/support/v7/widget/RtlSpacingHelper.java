package android.support.v7.widget;

class RtlSpacingHelper
{
  public static final int UNDEFINED = Integer.MIN_VALUE;
  private int mEnd;
  private int mExplicitLeft;
  private int mExplicitRight;
  private boolean mIsRelative;
  private boolean mIsRtl;
  private int mLeft = 0;
  private int mRight = 0;
  private int mStart;
  
  RtlSpacingHelper()
  {
    this.mStart = i;
    this.mEnd = i;
    this.mExplicitLeft = 0;
    this.mExplicitRight = 0;
    this.mIsRtl = false;
    this.mIsRelative = false;
  }
  
  public int getEnd()
  {
    boolean bool = this.mIsRtl;
    if (bool) {}
    for (int i = this.mLeft;; i = this.mRight) {
      return i;
    }
  }
  
  public int getLeft()
  {
    return this.mLeft;
  }
  
  public int getRight()
  {
    return this.mRight;
  }
  
  public int getStart()
  {
    boolean bool = this.mIsRtl;
    if (bool) {}
    for (int i = this.mRight;; i = this.mLeft) {
      return i;
    }
  }
  
  public void setAbsolute(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    this.mIsRelative = false;
    if (paramInt1 != i)
    {
      this.mExplicitLeft = paramInt1;
      this.mLeft = paramInt1;
    }
    if (paramInt2 != i)
    {
      this.mExplicitRight = paramInt2;
      this.mRight = paramInt2;
    }
  }
  
  public void setDirection(boolean paramBoolean)
  {
    int i = -1 << -1;
    boolean bool = this.mIsRtl;
    if (paramBoolean == bool) {}
    for (;;)
    {
      return;
      this.mIsRtl = paramBoolean;
      bool = this.mIsRelative;
      if (bool)
      {
        if (paramBoolean)
        {
          j = this.mEnd;
          if (j != i)
          {
            j = this.mEnd;
            label48:
            this.mLeft = j;
            j = this.mStart;
            if (j == i) {
              break label84;
            }
          }
          label84:
          for (j = this.mStart;; j = this.mExplicitRight)
          {
            this.mRight = j;
            break;
            j = this.mExplicitLeft;
            break label48;
          }
        }
        j = this.mStart;
        if (j != i)
        {
          j = this.mStart;
          label107:
          this.mLeft = j;
          j = this.mEnd;
          if (j == i) {
            break label143;
          }
        }
        label143:
        for (j = this.mEnd;; j = this.mExplicitRight)
        {
          this.mRight = j;
          break;
          j = this.mExplicitLeft;
          break label107;
        }
      }
      int j = this.mExplicitLeft;
      this.mLeft = j;
      j = this.mExplicitRight;
      this.mRight = j;
    }
  }
  
  public void setRelative(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    this.mStart = paramInt1;
    this.mEnd = paramInt2;
    this.mIsRelative = true;
    boolean bool = this.mIsRtl;
    if (bool)
    {
      if (paramInt2 != i) {
        this.mLeft = paramInt2;
      }
      if (paramInt1 != i) {
        this.mRight = paramInt1;
      }
    }
    for (;;)
    {
      return;
      if (paramInt1 != i) {
        this.mLeft = paramInt1;
      }
      if (paramInt2 != i) {
        this.mRight = paramInt2;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RtlSpacingHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */