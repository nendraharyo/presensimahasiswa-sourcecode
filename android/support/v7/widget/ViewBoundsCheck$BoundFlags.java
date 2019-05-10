package android.support.v7.widget;

class ViewBoundsCheck$BoundFlags
{
  int mBoundFlags = 0;
  int mChildEnd;
  int mChildStart;
  int mRvEnd;
  int mRvStart;
  
  void addFlags(int paramInt)
  {
    int i = this.mBoundFlags | paramInt;
    this.mBoundFlags = i;
  }
  
  boolean boundsMatch()
  {
    boolean bool = false;
    int i = this.mBoundFlags & 0x7;
    int j;
    int k;
    if (i != 0)
    {
      i = this.mBoundFlags;
      j = this.mChildStart;
      k = this.mRvStart;
      j = compare(j, k) << 0;
      i &= j;
      if (i != 0) {}
    }
    for (;;)
    {
      return bool;
      i = this.mBoundFlags & 0x70;
      if (i != 0)
      {
        i = this.mBoundFlags;
        j = this.mChildStart;
        k = this.mRvEnd;
        j = compare(j, k) << 4;
        i &= j;
        if (i == 0) {}
      }
      else
      {
        i = this.mBoundFlags & 0x700;
        if (i != 0)
        {
          i = this.mBoundFlags;
          j = this.mChildEnd;
          k = this.mRvStart;
          j = compare(j, k) << 8;
          i &= j;
          if (i == 0) {}
        }
        else
        {
          i = this.mBoundFlags & 0x7000;
          if (i != 0)
          {
            i = this.mBoundFlags;
            j = this.mChildEnd;
            k = this.mRvEnd;
            j = compare(j, k) << 12;
            i &= j;
            if (i == 0) {}
          }
          else
          {
            bool = true;
          }
        }
      }
    }
  }
  
  int compare(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 > paramInt2) {
      i = 1;
    }
    for (;;)
    {
      return i;
      if (paramInt1 == paramInt2) {
        i = 2;
      } else {
        i = 4;
      }
    }
  }
  
  void resetFlags()
  {
    this.mBoundFlags = 0;
  }
  
  void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mRvStart = paramInt1;
    this.mRvEnd = paramInt2;
    this.mChildStart = paramInt3;
    this.mChildEnd = paramInt4;
  }
  
  void setFlags(int paramInt1, int paramInt2)
  {
    int i = this.mBoundFlags;
    int j = paramInt2 ^ 0xFFFFFFFF;
    i &= j;
    j = paramInt1 & paramInt2;
    i |= j;
    this.mBoundFlags = i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ViewBoundsCheck$BoundFlags.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */