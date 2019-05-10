package com.crashlytics.android.core;

import java.util.HashMap;
import java.util.Map;

class RemoveRepeatsStrategy
  implements StackTraceTrimmingStrategy
{
  private final int maxRepetitions;
  
  public RemoveRepeatsStrategy()
  {
    this(1);
  }
  
  public RemoveRepeatsStrategy(int paramInt)
  {
    this.maxRepetitions = paramInt;
  }
  
  private static boolean isRepeatingSequence(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    int i = paramInt2 - paramInt1;
    int j = paramInt2 + i;
    int k = paramArrayOfStackTraceElement.length;
    if (j > k) {}
    for (;;)
    {
      return bool1;
      j = 0;
      for (;;)
      {
        if (j >= i) {
          break label83;
        }
        k = paramInt1 + j;
        StackTraceElement localStackTraceElement1 = paramArrayOfStackTraceElement[k];
        int m = paramInt2 + j;
        StackTraceElement localStackTraceElement2 = paramArrayOfStackTraceElement[m];
        boolean bool2 = localStackTraceElement1.equals(localStackTraceElement2);
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label83:
      bool1 = true;
    }
  }
  
  private static StackTraceElement[] trimRepeats(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    int i = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int j = paramArrayOfStackTraceElement.length;
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[j];
    int k = 0;
    Integer localInteger = null;
    int m = i;
    int n = 0;
    j = paramArrayOfStackTraceElement.length;
    if (k < j)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[k];
      localObject = (Integer)localHashMap.get(localStackTraceElement);
      if (localObject != null)
      {
        int i1 = ((Integer)localObject).intValue();
        boolean bool = isRepeatingSequence(paramArrayOfStackTraceElement, i1, k);
        if (bool) {}
      }
      else
      {
        localObject = paramArrayOfStackTraceElement[k];
        arrayOfStackTraceElement[n] = localObject;
        n += 1;
        j = k;
        m = i;
      }
      for (;;)
      {
        localInteger = Integer.valueOf(k);
        localHashMap.put(localStackTraceElement, localInteger);
        j += 1;
        k = j;
        break;
        j = ((Integer)localObject).intValue();
        j = k - j;
        if (m < paramInt)
        {
          System.arraycopy(paramArrayOfStackTraceElement, k, arrayOfStackTraceElement, n, j);
          n += j;
          m += 1;
        }
        j = j + -1 + k;
      }
    }
    Object localObject = new StackTraceElement[n];
    k = localObject.length;
    System.arraycopy(arrayOfStackTraceElement, 0, localObject, 0, k);
    return (StackTraceElement[])localObject;
  }
  
  public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    int i = this.maxRepetitions;
    StackTraceElement[] arrayOfStackTraceElement = trimRepeats(paramArrayOfStackTraceElement, i);
    int j = arrayOfStackTraceElement.length;
    int k = paramArrayOfStackTraceElement.length;
    if (j < k) {
      paramArrayOfStackTraceElement = arrayOfStackTraceElement;
    }
    return paramArrayOfStackTraceElement;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\RemoveRepeatsStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */