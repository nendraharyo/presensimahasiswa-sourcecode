package com.github.barteksc.pdfviewer.util;

public class MathUtils
{
  private static final double BIG_ENOUGH_CEIL = 16384.999999999996D;
  private static final double BIG_ENOUGH_FLOOR = 16384.0D;
  private static final int BIG_ENOUGH_INT = 16384;
  
  public static int ceil(float paramFloat)
  {
    return (int)(paramFloat + 16384.999999999996D) + 49152;
  }
  
  public static int floor(float paramFloat)
  {
    return (int)(paramFloat + 16384.0D) + 49152;
  }
  
  public static float limit(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = paramFloat1 < paramFloat2;
    if (!bool) {}
    for (;;)
    {
      return paramFloat2;
      bool = paramFloat1 < paramFloat3;
      if (!bool) {
        paramFloat2 = paramFloat3;
      } else {
        paramFloat2 = paramFloat1;
      }
    }
  }
  
  public static int limit(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 <= paramInt2) {}
    for (;;)
    {
      return paramInt2;
      if (paramInt1 >= paramInt3) {
        paramInt2 = paramInt3;
      } else {
        paramInt2 = paramInt1;
      }
    }
  }
  
  public static float max(float paramFloat1, float paramFloat2)
  {
    boolean bool = paramFloat1 < paramFloat2;
    if (bool) {}
    for (;;)
    {
      return paramFloat2;
      paramFloat2 = paramFloat1;
    }
  }
  
  public static int max(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {}
    for (;;)
    {
      return paramInt2;
      paramInt2 = paramInt1;
    }
  }
  
  public static float min(float paramFloat1, float paramFloat2)
  {
    boolean bool = paramFloat1 < paramFloat2;
    if (bool) {}
    for (;;)
    {
      return paramFloat2;
      paramFloat2 = paramFloat1;
    }
  }
  
  public static int min(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {}
    for (;;)
    {
      return paramInt2;
      paramInt2 = paramInt1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewe\\util\MathUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */