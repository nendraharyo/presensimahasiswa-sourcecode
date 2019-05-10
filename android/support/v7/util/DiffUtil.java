package android.support.v7.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiffUtil
{
  private static final Comparator SNAKE_COMPARATOR;
  
  static
  {
    DiffUtil.1 local1 = new android/support/v7/util/DiffUtil$1;
    local1.<init>();
    SNAKE_COMPARATOR = local1;
  }
  
  public static DiffUtil.DiffResult calculateDiff(DiffUtil.Callback paramCallback)
  {
    return calculateDiff(paramCallback, true);
  }
  
  public static DiffUtil.DiffResult calculateDiff(DiffUtil.Callback paramCallback, boolean paramBoolean)
  {
    int i = 0;
    int j = paramCallback.getOldListSize();
    int n = paramCallback.getNewListSize();
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    Object localObject1 = new android/support/v7/util/DiffUtil$Range;
    ((DiffUtil.Range)localObject1).<init>(0, j, 0, n);
    localArrayList2.add(localObject1);
    int i1 = j + n;
    j = Math.abs(j - n);
    int i4 = i1 + j;
    int[] arrayOfInt1 = new int[i4 * 2];
    j = i4 * 2;
    int[] arrayOfInt2 = new int[j];
    ArrayList localArrayList3 = new java/util/ArrayList;
    localArrayList3.<init>();
    for (;;)
    {
      boolean bool1 = localArrayList2.isEmpty();
      if (bool1) {
        break;
      }
      int k = localArrayList2.size() + -1;
      localObject2 = localArrayList2.remove(k);
      Object localObject3 = localObject2;
      localObject3 = (DiffUtil.Range)localObject2;
      n = ((DiffUtil.Range)localObject3).oldListStart;
      i1 = ((DiffUtil.Range)localObject3).oldListEnd;
      i = ((DiffUtil.Range)localObject3).newListStart;
      int i5 = ((DiffUtil.Range)localObject3).newListEnd;
      localObject2 = paramCallback;
      DiffUtil.Snake localSnake = diffPartial(paramCallback, n, i1, i, i5, arrayOfInt1, arrayOfInt2, i4);
      if (localSnake != null)
      {
        k = localSnake.size;
        if (k > 0) {
          localArrayList1.add(localSnake);
        }
        k = localSnake.x;
        i1 = ((DiffUtil.Range)localObject3).oldListStart;
        k += i1;
        localSnake.x = k;
        k = localSnake.y;
        i1 = ((DiffUtil.Range)localObject3).newListStart;
        k += i1;
        localSnake.y = k;
        boolean bool2 = localArrayList3.isEmpty();
        label293:
        label361:
        int m;
        if (bool2)
        {
          localObject2 = new android/support/v7/util/DiffUtil$Range;
          ((DiffUtil.Range)localObject2).<init>();
          i1 = ((DiffUtil.Range)localObject3).oldListStart;
          ((DiffUtil.Range)localObject2).oldListStart = i1;
          i1 = ((DiffUtil.Range)localObject3).newListStart;
          ((DiffUtil.Range)localObject2).newListStart = i1;
          boolean bool3 = localSnake.reverse;
          if (!bool3) {
            break label480;
          }
          int i2 = localSnake.x;
          ((DiffUtil.Range)localObject2).oldListEnd = i2;
          i2 = localSnake.y;
          ((DiffUtil.Range)localObject2).newListEnd = i2;
          localArrayList2.add(localObject2);
          bool2 = localSnake.reverse;
          if (!bool2) {
            break label611;
          }
          bool2 = localSnake.removal;
          if (!bool2) {
            break label558;
          }
          m = localSnake.x;
          i2 = localSnake.size;
          m = m + i2 + 1;
          ((DiffUtil.Range)localObject3).oldListStart = m;
          m = localSnake.y;
          n = localSnake.size;
          m += n;
          ((DiffUtil.Range)localObject3).newListStart = m;
        }
        for (;;)
        {
          localArrayList2.add(localObject3);
          break;
          m = localArrayList3.size() + -1;
          localObject2 = (DiffUtil.Range)localArrayList3.remove(m);
          break label293;
          label480:
          boolean bool4 = localSnake.removal;
          if (bool4)
          {
            i3 = localSnake.x + -1;
            ((DiffUtil.Range)localObject2).oldListEnd = i3;
            i3 = localSnake.y;
            ((DiffUtil.Range)localObject2).newListEnd = i3;
            break label361;
          }
          int i3 = localSnake.x;
          ((DiffUtil.Range)localObject2).oldListEnd = i3;
          i3 = localSnake.y + -1;
          ((DiffUtil.Range)localObject2).newListEnd = i3;
          break label361;
          label558:
          m = localSnake.x;
          i3 = localSnake.size;
          m += i3;
          ((DiffUtil.Range)localObject3).oldListStart = m;
          m = localSnake.y;
          n = localSnake.size;
          m = m + n + 1;
          ((DiffUtil.Range)localObject3).newListStart = m;
          continue;
          label611:
          m = localSnake.x;
          i3 = localSnake.size;
          m += i3;
          ((DiffUtil.Range)localObject3).oldListStart = m;
          m = localSnake.y;
          n = localSnake.size;
          m += n;
          ((DiffUtil.Range)localObject3).newListStart = m;
        }
      }
      localArrayList3.add(localObject3);
    }
    Object localObject2 = SNAKE_COMPARATOR;
    Collections.sort(localArrayList1, (Comparator)localObject2);
    localObject1 = new android/support/v7/util/DiffUtil$DiffResult;
    boolean bool5 = paramBoolean;
    ((DiffUtil.DiffResult)localObject1).<init>(paramCallback, localArrayList1, arrayOfInt1, arrayOfInt2, paramBoolean);
    return (DiffUtil.DiffResult)localObject1;
  }
  
  private static DiffUtil.Snake diffPartial(DiffUtil.Callback paramCallback, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt5)
  {
    int i = paramInt2 - paramInt1;
    int j = paramInt4 - paramInt3;
    int k = paramInt2 - paramInt1;
    int m = 1;
    if (k >= m)
    {
      k = paramInt4 - paramInt3;
      m = 1;
      if (k >= m) {}
    }
    else
    {
      k = 0;
      localObject = null;
      return (DiffUtil.Snake)localObject;
    }
    int n = i - j;
    int i1 = (i + j + 1) / 2;
    k = paramInt5 - i1 + -1;
    m = paramInt5 + i1 + 1;
    int i2 = 0;
    Arrays.fill(paramArrayOfInt1, k, m, 0);
    k = paramInt5 - i1 + -1 + n;
    m = paramInt5 + i1 + 1 + n;
    Arrays.fill(paramArrayOfInt2, k, m, i);
    k = n % 2;
    if (k != 0)
    {
      k = 1;
      m = 0;
    }
    for (int i3 = 0;; i3 = m)
    {
      if (i3 > i1) {
        break label995;
      }
      m = -i3;
      int i5;
      int i6;
      int i9;
      for (int i4 = m;; i4 = m)
      {
        if (i4 > i3) {
          break label567;
        }
        m = -i3;
        if (i4 != m)
        {
          if (i4 != i3)
          {
            m = paramInt5 + i4 + -1;
            m = paramArrayOfInt1[m];
            i2 = paramInt5 + i4 + 1;
            i2 = paramArrayOfInt1[i2];
            if (m >= i2) {}
          }
        }
        else
        {
          m = paramInt5 + i4 + 1;
          i2 = paramArrayOfInt1[m];
        }
        for (m = 0;; m = 1)
        {
          i5 = i2 - i4;
          i6 = i2;
          i2 = i5;
          while ((i6 < i) && (i2 < j))
          {
            int i7 = paramInt1 + i6;
            i9 = paramInt3 + i2;
            boolean bool1 = paramCallback.areItemsTheSame(i7, i9);
            if (!bool1) {
              break;
            }
            i6 += 1;
            i2 += 1;
          }
          k = 0;
          localObject = null;
          break;
          m = paramInt5 + i4 + -1;
          i2 = paramArrayOfInt1[m] + 1;
        }
        i2 = paramInt5 + i4;
        paramArrayOfInt1[i2] = i6;
        if (k != 0)
        {
          i2 = n - i3 + 1;
          if (i4 >= i2)
          {
            i2 = n + i3 + -1;
            if (i4 <= i2)
            {
              i2 = paramInt5 + i4;
              i2 = paramArrayOfInt1[i2];
              i6 = paramInt5 + i4;
              i6 = paramArrayOfInt2[i6];
              if (i2 >= i6)
              {
                localObject = new android/support/v7/util/DiffUtil$Snake;
                ((DiffUtil.Snake)localObject).<init>();
                i2 = paramInt5 + i4;
                i2 = paramArrayOfInt2[i2];
                ((DiffUtil.Snake)localObject).x = i2;
                i2 = ((DiffUtil.Snake)localObject).x - i4;
                ((DiffUtil.Snake)localObject).y = i2;
                i2 = paramInt5 + i4;
                i2 = paramArrayOfInt1[i2];
                i6 = paramInt5 + i4;
                i6 = paramArrayOfInt2[i6];
                i2 -= i6;
                ((DiffUtil.Snake)localObject).size = i2;
                ((DiffUtil.Snake)localObject).removal = m;
                m = 0;
                ((DiffUtil.Snake)localObject).reverse = false;
                break;
              }
            }
          }
        }
        m = i4 + 2;
      }
      label567:
      m = -i3;
      for (i4 = m;; i4 = m)
      {
        if (i4 > i3) {
          break label982;
        }
        int i8 = i4 + n;
        m = i3 + n;
        if (i8 != m)
        {
          m = -i3 + n;
          if (i8 != m)
          {
            m = paramInt5 + i8 + -1;
            m = paramArrayOfInt2[m];
            i2 = paramInt5 + i8 + 1;
            i2 = paramArrayOfInt2[i2];
            if (m >= i2) {}
          }
        }
        else
        {
          m = paramInt5 + i8 + -1;
          i2 = paramArrayOfInt2[m];
        }
        for (m = 0;; m = 1)
        {
          i5 = i2 - i8;
          i6 = i2;
          i2 = i5;
          while ((i6 > 0) && (i2 > 0))
          {
            i9 = paramInt1 + i6 + -1;
            int i10 = paramInt3 + i2 + -1;
            boolean bool2 = paramCallback.areItemsTheSame(i9, i10);
            if (!bool2) {
              break;
            }
            i6 += -1;
            i2 += -1;
          }
          m = paramInt5 + i8 + 1;
          i2 = paramArrayOfInt2[m] + -1;
        }
        i2 = paramInt5 + i8;
        paramArrayOfInt2[i2] = i6;
        if (k == 0)
        {
          i2 = i4 + n;
          i6 = -i3;
          if (i2 >= i6)
          {
            i2 = i4 + n;
            if (i2 <= i3)
            {
              i2 = paramInt5 + i8;
              i2 = paramArrayOfInt1[i2];
              i6 = paramInt5 + i8;
              i6 = paramArrayOfInt2[i6];
              if (i2 >= i6)
              {
                localObject = new android/support/v7/util/DiffUtil$Snake;
                ((DiffUtil.Snake)localObject).<init>();
                i2 = paramInt5 + i8;
                i2 = paramArrayOfInt2[i2];
                ((DiffUtil.Snake)localObject).x = i2;
                i2 = ((DiffUtil.Snake)localObject).x - i8;
                ((DiffUtil.Snake)localObject).y = i2;
                i2 = paramInt5 + i8;
                i2 = paramArrayOfInt1[i2];
                i6 = paramInt5 + i8;
                i6 = paramArrayOfInt2[i6];
                i2 -= i6;
                ((DiffUtil.Snake)localObject).size = i2;
                ((DiffUtil.Snake)localObject).removal = m;
                m = 1;
                ((DiffUtil.Snake)localObject).reverse = m;
                break;
              }
            }
          }
        }
        m = i4 + 2;
      }
      label982:
      m = i3 + 1;
    }
    label995:
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\DiffUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */