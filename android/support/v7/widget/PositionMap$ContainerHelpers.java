package android.support.v7.widget;

class PositionMap$ContainerHelpers
{
  static final boolean[] EMPTY_BOOLEANS = new boolean[0];
  static final int[] EMPTY_INTS = new int[0];
  static final long[] EMPTY_LONGS = new long[0];
  static final Object[] EMPTY_OBJECTS = new Object[0];
  
  static int binarySearch(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1 + -1;
    int k;
    for (;;)
    {
      if (i > j) {
        break label63;
      }
      k = i + j >>> 1;
      int m = paramArrayOfInt[k];
      if (m < paramInt2)
      {
        i = k + 1;
      }
      else
      {
        if (m <= paramInt2) {
          break;
        }
        j = k + -1;
      }
    }
    label63:
    for (j = k;; j = i ^ 0xFFFFFFFF) {
      return j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\PositionMap$ContainerHelpers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */