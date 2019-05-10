package android.support.v7.widget;

import java.util.List;

class OpReorderer
{
  final OpReorderer.Callback mCallback;
  
  OpReorderer(OpReorderer.Callback paramCallback)
  {
    this.mCallback = paramCallback;
  }
  
  private int getLastMoveOutOfOrder(List paramList)
  {
    int i = 0;
    float f1 = 0.0F;
    int j = paramList.size();
    int k = j + -1;
    if (k >= 0)
    {
      AdapterHelper.UpdateOp localUpdateOp = (AdapterHelper.UpdateOp)paramList.get(k);
      j = localUpdateOp.cmd;
      int m = 8;
      if (j == m)
      {
        if (i == 0) {
          break label98;
        }
        j = k;
        label62:
        return j;
      }
      j = 1;
    }
    for (float f2 = Float.MIN_VALUE;; f2 = f1)
    {
      k += -1;
      i = j;
      f1 = f2;
      break;
      j = -1;
      f2 = 0.0F / 0.0F;
      break label62;
      label98:
      j = i;
    }
  }
  
  private void swapMoveAdd(List paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = 0;
    int j = paramUpdateOp1.itemCount;
    int k = paramUpdateOp2.positionStart;
    if (j < k) {
      i = -1;
    }
    j = paramUpdateOp1.positionStart;
    k = paramUpdateOp2.positionStart;
    if (j < k) {
      i += 1;
    }
    j = paramUpdateOp2.positionStart;
    k = paramUpdateOp1.positionStart;
    if (j <= k)
    {
      j = paramUpdateOp1.positionStart;
      k = paramUpdateOp2.itemCount;
      j += k;
      paramUpdateOp1.positionStart = j;
    }
    j = paramUpdateOp2.positionStart;
    k = paramUpdateOp1.itemCount;
    if (j <= k)
    {
      j = paramUpdateOp1.itemCount;
      k = paramUpdateOp2.itemCount;
      j += k;
      paramUpdateOp1.itemCount = j;
    }
    j = paramUpdateOp2.positionStart;
    i += j;
    paramUpdateOp2.positionStart = i;
    paramList.set(paramInt1, paramUpdateOp2);
    paramList.set(paramInt2, paramUpdateOp1);
  }
  
  private void swapMoveOp(List paramList, int paramInt1, int paramInt2)
  {
    AdapterHelper.UpdateOp localUpdateOp1 = (AdapterHelper.UpdateOp)paramList.get(paramInt1);
    AdapterHelper.UpdateOp localUpdateOp2 = (AdapterHelper.UpdateOp)paramList.get(paramInt2);
    int i = localUpdateOp2.cmd;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      swapMoveRemove(paramList, paramInt1, localUpdateOp1, paramInt2, localUpdateOp2);
      continue;
      swapMoveAdd(paramList, paramInt1, localUpdateOp1, paramInt2, localUpdateOp2);
      continue;
      swapMoveUpdate(paramList, paramInt1, localUpdateOp1, paramInt2, localUpdateOp2);
    }
  }
  
  void reorderOps(List paramList)
  {
    for (;;)
    {
      int i = getLastMoveOutOfOrder(paramList);
      int j = -1;
      if (i == j) {
        break;
      }
      j = i + 1;
      swapMoveOp(paramList, i, j);
    }
  }
  
  void swapMoveRemove(List paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = 0;
    int j = 2;
    int k = 0;
    OpReorderer.Callback localCallback1 = null;
    int m = 1;
    int n = paramUpdateOp1.positionStart;
    int i1 = paramUpdateOp1.itemCount;
    int i2;
    if (n < i1)
    {
      n = paramUpdateOp2.positionStart;
      i1 = paramUpdateOp1.positionStart;
      if (n != i1) {
        break label976;
      }
      n = paramUpdateOp2.itemCount;
      i1 = paramUpdateOp1.itemCount;
      i2 = paramUpdateOp1.positionStart;
      i1 -= i2;
      if (n != i1) {
        break label976;
      }
      n = m;
    }
    for (;;)
    {
      i1 = paramUpdateOp1.itemCount;
      i2 = paramUpdateOp2.positionStart;
      label127:
      AdapterHelper.UpdateOp localUpdateOp;
      if (i1 < i2)
      {
        m = paramUpdateOp2.positionStart + -1;
        paramUpdateOp2.positionStart = m;
        m = paramUpdateOp1.positionStart;
        i1 = paramUpdateOp2.positionStart;
        if (m > i1) {
          break label375;
        }
        m = paramUpdateOp2.positionStart + 1;
        paramUpdateOp2.positionStart = m;
        m = 0;
        localUpdateOp = null;
      }
      for (;;)
      {
        label169:
        if (n != 0)
        {
          paramList.set(paramInt1, paramUpdateOp2);
          paramList.remove(paramInt2);
          localCallback1 = this.mCallback;
          localCallback1.recycleUpdateOp(paramUpdateOp1);
        }
        label375:
        label697:
        label945:
        label955:
        for (;;)
        {
          return;
          n = paramUpdateOp2.positionStart;
          i1 = paramUpdateOp1.itemCount + 1;
          if (n != i1) {
            break label966;
          }
          n = paramUpdateOp2.itemCount;
          i1 = paramUpdateOp1.positionStart;
          i2 = paramUpdateOp1.itemCount;
          i1 -= i2;
          if (n != i1) {
            break label966;
          }
          k = m;
          n = m;
          break;
          i1 = paramUpdateOp1.itemCount;
          i2 = paramUpdateOp2.positionStart;
          int i3 = paramUpdateOp2.itemCount;
          i2 += i3;
          if (i1 >= i2) {
            break label127;
          }
          k = paramUpdateOp2.itemCount + -1;
          paramUpdateOp2.itemCount = k;
          paramUpdateOp1.cmd = j;
          paramUpdateOp1.itemCount = m;
          k = paramUpdateOp2.itemCount;
          if (k == 0)
          {
            paramList.remove(paramInt2);
            localCallback1 = this.mCallback;
            localCallback1.recycleUpdateOp(paramUpdateOp2);
            continue;
            m = paramUpdateOp1.positionStart;
            i1 = paramUpdateOp2.positionStart;
            i2 = paramUpdateOp2.itemCount;
            i1 += i2;
            if (m >= i1) {
              break label957;
            }
            m = paramUpdateOp2.positionStart;
            i1 = paramUpdateOp2.itemCount;
            m += i1;
            i1 = paramUpdateOp1.positionStart;
            m -= i1;
            OpReorderer.Callback localCallback2 = this.mCallback;
            i2 = paramUpdateOp1.positionStart + 1;
            localUpdateOp = localCallback2.obtainUpdateOp(j, i2, m, null);
            i = paramUpdateOp1.positionStart;
            i1 = paramUpdateOp2.positionStart;
            i -= i1;
            paramUpdateOp2.itemCount = i;
            break label169;
            if (k != 0)
            {
              if (localUpdateOp != null)
              {
                k = paramUpdateOp1.positionStart;
                n = localUpdateOp.positionStart;
                if (k > n)
                {
                  k = paramUpdateOp1.positionStart;
                  n = localUpdateOp.itemCount;
                  k -= n;
                  paramUpdateOp1.positionStart = k;
                }
                k = paramUpdateOp1.itemCount;
                n = localUpdateOp.positionStart;
                if (k > n)
                {
                  k = paramUpdateOp1.itemCount;
                  n = localUpdateOp.itemCount;
                  k -= n;
                  paramUpdateOp1.itemCount = k;
                }
              }
              k = paramUpdateOp1.positionStart;
              n = paramUpdateOp2.positionStart;
              if (k > n)
              {
                k = paramUpdateOp1.positionStart;
                n = paramUpdateOp2.itemCount;
                k -= n;
                paramUpdateOp1.positionStart = k;
              }
              k = paramUpdateOp1.itemCount;
              n = paramUpdateOp2.positionStart;
              if (k > n)
              {
                k = paramUpdateOp1.itemCount;
                n = paramUpdateOp2.itemCount;
                k -= n;
                paramUpdateOp1.itemCount = k;
              }
              paramList.set(paramInt1, paramUpdateOp2);
              k = paramUpdateOp1.positionStart;
              n = paramUpdateOp1.itemCount;
              if (k == n) {
                break label945;
              }
              paramList.set(paramInt2, paramUpdateOp1);
            }
            for (;;)
            {
              if (localUpdateOp == null) {
                break label955;
              }
              paramList.add(paramInt1, localUpdateOp);
              break;
              if (localUpdateOp != null)
              {
                k = paramUpdateOp1.positionStart;
                n = localUpdateOp.positionStart;
                if (k >= n)
                {
                  k = paramUpdateOp1.positionStart;
                  n = localUpdateOp.itemCount;
                  k -= n;
                  paramUpdateOp1.positionStart = k;
                }
                k = paramUpdateOp1.itemCount;
                n = localUpdateOp.positionStart;
                if (k >= n)
                {
                  k = paramUpdateOp1.itemCount;
                  n = localUpdateOp.itemCount;
                  k -= n;
                  paramUpdateOp1.itemCount = k;
                }
              }
              k = paramUpdateOp1.positionStart;
              n = paramUpdateOp2.positionStart;
              if (k >= n)
              {
                k = paramUpdateOp1.positionStart;
                n = paramUpdateOp2.itemCount;
                k -= n;
                paramUpdateOp1.positionStart = k;
              }
              k = paramUpdateOp1.itemCount;
              n = paramUpdateOp2.positionStart;
              if (k < n) {
                break label697;
              }
              k = paramUpdateOp1.itemCount;
              n = paramUpdateOp2.itemCount;
              k -= n;
              paramUpdateOp1.itemCount = k;
              break label697;
              paramList.remove(paramInt2);
            }
          }
        }
        label957:
        m = 0;
        localUpdateOp = null;
      }
      label966:
      n = 0;
      k = m;
      continue;
      label976:
      n = 0;
    }
  }
  
  void swapMoveUpdate(List paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 4;
    int k = paramUpdateOp1.itemCount;
    int m = paramUpdateOp2.positionStart;
    Object localObject2;
    if (k < m)
    {
      k = paramUpdateOp2.positionStart + -1;
      paramUpdateOp2.positionStart = k;
      k = 0;
      localObject2 = null;
    }
    for (;;)
    {
      m = paramUpdateOp1.positionStart;
      int n = paramUpdateOp2.positionStart;
      if (m <= n)
      {
        m = paramUpdateOp2.positionStart + 1;
        paramUpdateOp2.positionStart = m;
        label87:
        paramList.set(paramInt2, paramUpdateOp1);
        m = paramUpdateOp2.itemCount;
        if (m <= 0) {
          break label370;
        }
        paramList.set(paramInt1, paramUpdateOp2);
      }
      for (;;)
      {
        if (localObject2 != null) {
          paramList.add(paramInt1, localObject2);
        }
        if (localObject1 != null) {
          paramList.add(paramInt1, localObject1);
        }
        return;
        k = paramUpdateOp1.itemCount;
        m = paramUpdateOp2.positionStart;
        n = paramUpdateOp2.itemCount;
        m += n;
        if (k >= m) {
          break label396;
        }
        k = paramUpdateOp2.itemCount + -1;
        paramUpdateOp2.itemCount = k;
        localObject2 = this.mCallback;
        m = paramUpdateOp1.positionStart;
        n = 1;
        Object localObject3 = paramUpdateOp2.payload;
        localObject2 = ((OpReorderer.Callback)localObject2).obtainUpdateOp(j, m, n, localObject3);
        break;
        m = paramUpdateOp1.positionStart;
        n = paramUpdateOp2.positionStart;
        int i1 = paramUpdateOp2.itemCount;
        n += i1;
        if (m >= n) {
          break label87;
        }
        i = paramUpdateOp2.positionStart;
        m = paramUpdateOp2.itemCount;
        i += m;
        m = paramUpdateOp1.positionStart;
        m = i - m;
        localObject1 = this.mCallback;
        n = paramUpdateOp1.positionStart + 1;
        localObject3 = paramUpdateOp2.payload;
        localObject1 = ((OpReorderer.Callback)localObject1).obtainUpdateOp(j, n, m, localObject3);
        n = paramUpdateOp2.itemCount;
        m = n - m;
        paramUpdateOp2.itemCount = m;
        break label87;
        label370:
        paramList.remove(paramInt1);
        OpReorderer.Callback localCallback = this.mCallback;
        localCallback.recycleUpdateOp(paramUpdateOp2);
      }
      label396:
      k = 0;
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\OpReorderer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */