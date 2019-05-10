package com.github.barteksc.pdfviewer.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils
{
  public static String arrayToString(int[] paramArrayOfInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("[");
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfInt[i];
      localStringBuilder.append(j);
      j = paramArrayOfInt.length + -1;
      if (i != j)
      {
        String str = ",";
        localStringBuilder.append(str);
      }
      i += 1;
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static int[] calculateIndexesInDuplicateArray(int[] paramArrayOfInt)
  {
    int i = 0;
    int[] arrayOfInt1 = new int[paramArrayOfInt.length];
    int j = paramArrayOfInt.length;
    if (j == 0) {}
    for (int[] arrayOfInt2 = arrayOfInt1;; arrayOfInt2 = arrayOfInt1)
    {
      return arrayOfInt2;
      arrayOfInt1[0] = 0;
      j = 1;
      for (;;)
      {
        int k = paramArrayOfInt.length;
        if (j >= k) {
          break;
        }
        k = paramArrayOfInt[j];
        int m = j + -1;
        m = paramArrayOfInt[m];
        if (k != m) {
          i += 1;
        }
        arrayOfInt1[j] = i;
        j += 1;
      }
    }
  }
  
  public static int[] deleteDuplicatedPages(int[] paramArrayOfInt)
  {
    int i = 0;
    Integer localInteger1 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = paramArrayOfInt.length;
    int k = -1;
    int m = 0;
    while (m < j)
    {
      int n = paramArrayOfInt[m];
      Integer localInteger2 = Integer.valueOf(n);
      int i1 = localInteger2.intValue();
      if (k != i1) {
        localArrayList.add(localInteger2);
      }
      k = localInteger2.intValue();
      m += 1;
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    for (m = 0;; m = i)
    {
      i = localArrayList.size();
      if (m >= i) {
        break;
      }
      localInteger1 = (Integer)localArrayList.get(m);
      i = localInteger1.intValue();
      arrayOfInt[m] = i;
      i = m + 1;
    }
    return arrayOfInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewe\\util\ArrayUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */