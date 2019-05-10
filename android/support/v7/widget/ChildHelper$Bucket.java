package android.support.v7.widget;

class ChildHelper$Bucket
{
  static final int BITS_PER_WORD = 64;
  static final long LAST_BIT = Long.MIN_VALUE;
  long mData = 0L;
  Bucket mNext;
  
  private void ensureNext()
  {
    Bucket localBucket = this.mNext;
    if (localBucket == null)
    {
      localBucket = new android/support/v7/widget/ChildHelper$Bucket;
      localBucket.<init>();
      this.mNext = localBucket;
    }
  }
  
  void clear(int paramInt)
  {
    int i = 64;
    if (paramInt >= i)
    {
      Bucket localBucket = this.mNext;
      if (localBucket != null)
      {
        localBucket = this.mNext;
        int j = paramInt + -64;
        localBucket.clear(j);
      }
    }
    for (;;)
    {
      return;
      long l1 = this.mData;
      long l2 = 1L << paramInt;
      long l3 = -1;
      l2 ^= l3;
      l1 &= l2;
      this.mData = l1;
    }
  }
  
  int countOnesBefore(int paramInt)
  {
    int i = 64;
    long l1 = 1L;
    Bucket localBucket = this.mNext;
    long l2;
    int j;
    if (localBucket == null) {
      if (paramInt >= i)
      {
        l2 = this.mData;
        j = Long.bitCount(l2);
      }
    }
    for (;;)
    {
      return j;
      l2 = this.mData;
      long l3 = (l1 << paramInt) - l1;
      l2 &= l3;
      j = Long.bitCount(l2);
      continue;
      if (paramInt < i)
      {
        l2 = this.mData;
        l3 = (l1 << paramInt) - l1;
        l2 &= l3;
        j = Long.bitCount(l2);
      }
      else
      {
        localBucket = this.mNext;
        i = paramInt + -64;
        j = localBucket.countOnesBefore(i);
        l3 = this.mData;
        i = Long.bitCount(l3);
        j += i;
      }
    }
  }
  
  boolean get(int paramInt)
  {
    int i = 64;
    Bucket localBucket;
    boolean bool;
    if (paramInt >= i)
    {
      ensureNext();
      localBucket = this.mNext;
      int j = paramInt + -64;
      bool = localBucket.get(j);
    }
    for (;;)
    {
      return bool;
      long l1 = this.mData;
      long l2 = 1L << paramInt;
      l1 &= l2;
      l2 = 0L;
      bool = l1 < l2;
      if (bool)
      {
        bool = true;
      }
      else
      {
        bool = false;
        localBucket = null;
      }
    }
  }
  
  void insert(int paramInt, boolean paramBoolean)
  {
    long l1 = 1L;
    int i = 1;
    int j = 64;
    Bucket localBucket1;
    if (paramInt >= j)
    {
      ensureNext();
      localBucket1 = this.mNext;
      i = paramInt + -64;
      localBucket1.insert(i, paramBoolean);
      return;
    }
    long l2 = this.mData & 0x8000000000000000;
    long l3 = 0L;
    boolean bool = l2 < l3;
    if (bool)
    {
      bool = i;
      label69:
      l2 = (l1 << paramInt) - l1;
      l3 = this.mData & l2;
      l1 = this.mData;
      long l4 = -1;
      l2 = ((l2 ^ l4) & l1) << i | l3;
      this.mData = l2;
      if (!paramBoolean) {
        break label170;
      }
      set(paramInt);
    }
    for (;;)
    {
      if (!bool)
      {
        localBucket2 = this.mNext;
        if (localBucket2 == null) {
          break;
        }
      }
      ensureNext();
      Bucket localBucket2 = this.mNext;
      localBucket2.insert(0, bool);
      break;
      bool = false;
      localBucket1 = null;
      break label69;
      label170:
      clear(paramInt);
    }
  }
  
  boolean remove(int paramInt)
  {
    long l1 = 1L;
    long l2 = -1;
    int i = 1;
    int k = 64;
    Bucket localBucket1;
    if (paramInt >= k)
    {
      ensureNext();
      localBucket1 = this.mNext;
      i = paramInt + -64;
      bool2 = localBucket1.remove(i);
      return bool2;
    }
    long l3 = l1 << paramInt;
    long l4 = this.mData & l3;
    long l5 = 0L;
    boolean bool2 = l4 < l5;
    if (bool2) {
      bool2 = i;
    }
    for (;;)
    {
      l4 = this.mData;
      l5 = l3 ^ l2;
      l4 &= l5;
      this.mData = l4;
      l3 -= l1;
      l4 = this.mData & l3;
      l5 = this.mData;
      l3 = Long.rotateRight((l3 ^ l2) & l5, i) | l4;
      this.mData = l3;
      Bucket localBucket2 = this.mNext;
      if (localBucket2 == null) {
        break;
      }
      localBucket2 = this.mNext;
      boolean bool1 = localBucket2.get(0);
      if (bool1)
      {
        int j = 63;
        set(j);
      }
      localBucket2 = this.mNext;
      localBucket2.remove(0);
      break;
      bool2 = false;
      localBucket1 = null;
    }
  }
  
  void reset()
  {
    long l = 0L;
    this.mData = l;
    Bucket localBucket = this.mNext;
    if (localBucket != null)
    {
      localBucket = this.mNext;
      localBucket.reset();
    }
  }
  
  void set(int paramInt)
  {
    int i = 64;
    if (paramInt >= i)
    {
      ensureNext();
      Bucket localBucket = this.mNext;
      int j = paramInt + -64;
      localBucket.set(j);
    }
    for (;;)
    {
      return;
      long l1 = this.mData;
      long l2 = 1L << paramInt;
      l1 |= l2;
      this.mData = l1;
    }
  }
  
  public String toString()
  {
    Object localObject = this.mNext;
    long l1;
    if (localObject == null) {
      l1 = this.mData;
    }
    String str;
    for (localObject = Long.toBinaryString(l1);; localObject = str)
    {
      return (String)localObject;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = this.mNext.toString();
      localObject = ((StringBuilder)localObject).append(str).append("xx");
      long l2 = this.mData;
      str = Long.toBinaryString(l2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ChildHelper$Bucket.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */