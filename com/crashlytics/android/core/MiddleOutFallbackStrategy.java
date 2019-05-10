package com.crashlytics.android.core;

class MiddleOutFallbackStrategy
  implements StackTraceTrimmingStrategy
{
  private final int maximumStackSize;
  private final MiddleOutStrategy middleOutStrategy;
  private final StackTraceTrimmingStrategy[] trimmingStrategies;
  
  public MiddleOutFallbackStrategy(int paramInt, StackTraceTrimmingStrategy... paramVarArgs)
  {
    this.maximumStackSize = paramInt;
    this.trimmingStrategies = paramVarArgs;
    MiddleOutStrategy localMiddleOutStrategy = new com/crashlytics/android/core/MiddleOutStrategy;
    localMiddleOutStrategy.<init>(paramInt);
    this.middleOutStrategy = localMiddleOutStrategy;
  }
  
  public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    int i = paramArrayOfStackTraceElement.length;
    int j = this.maximumStackSize;
    if (i <= j) {
      return paramArrayOfStackTraceElement;
    }
    StackTraceTrimmingStrategy[] arrayOfStackTraceTrimmingStrategy = this.trimmingStrategies;
    int k = arrayOfStackTraceTrimmingStrategy.length;
    i = 0;
    j = 0;
    MiddleOutStrategy localMiddleOutStrategy = null;
    Object localObject2;
    for (Object localObject1 = paramArrayOfStackTraceElement;; localObject1 = localObject2)
    {
      if (j < k)
      {
        localObject2 = arrayOfStackTraceTrimmingStrategy[j];
        int m = localObject1.length;
        int n = this.maximumStackSize;
        if (m > n) {}
      }
      else
      {
        j = localObject1.length;
        int i1 = this.maximumStackSize;
        if (j > i1)
        {
          localMiddleOutStrategy = this.middleOutStrategy;
          localObject1 = localMiddleOutStrategy.getTrimmedStackTrace((StackTraceElement[])localObject1);
        }
        paramArrayOfStackTraceElement = (StackTraceElement[])localObject1;
        break;
      }
      localObject2 = ((StackTraceTrimmingStrategy)localObject2).getTrimmedStackTrace(paramArrayOfStackTraceElement);
      i = j + 1;
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\MiddleOutFallbackStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */