package com.crashlytics.android.core;

class MiddleOutStrategy
  implements StackTraceTrimmingStrategy
{
  private final int trimmedSize;
  
  public MiddleOutStrategy(int paramInt)
  {
    this.trimmedSize = paramInt;
  }
  
  public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    int i = 0;
    int j = paramArrayOfStackTraceElement.length;
    int k = this.trimmedSize;
    if (j <= k) {}
    for (;;)
    {
      return paramArrayOfStackTraceElement;
      k = this.trimmedSize / 2;
      int m = this.trimmedSize - k;
      j = this.trimmedSize;
      StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[j];
      System.arraycopy(paramArrayOfStackTraceElement, 0, arrayOfStackTraceElement, 0, m);
      i = paramArrayOfStackTraceElement.length - k;
      System.arraycopy(paramArrayOfStackTraceElement, i, arrayOfStackTraceElement, m, k);
      paramArrayOfStackTraceElement = arrayOfStackTraceElement;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\MiddleOutStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */