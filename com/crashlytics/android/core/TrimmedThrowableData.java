package com.crashlytics.android.core;

class TrimmedThrowableData
{
  public final TrimmedThrowableData cause;
  public final String className;
  public final String localizedMessage;
  public final StackTraceElement[] stacktrace;
  
  public TrimmedThrowableData(Throwable paramThrowable, StackTraceTrimmingStrategy paramStackTraceTrimmingStrategy)
  {
    Object localObject = paramThrowable.getLocalizedMessage();
    this.localizedMessage = ((String)localObject);
    localObject = paramThrowable.getClass().getName();
    this.className = ((String)localObject);
    localObject = paramThrowable.getStackTrace();
    localObject = paramStackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[])localObject);
    this.stacktrace = ((StackTraceElement[])localObject);
    Throwable localThrowable = paramThrowable.getCause();
    if (localThrowable != null)
    {
      localObject = new com/crashlytics/android/core/TrimmedThrowableData;
      ((TrimmedThrowableData)localObject).<init>(localThrowable, paramStackTraceTrimmingStrategy);
    }
    for (;;)
    {
      this.cause = ((TrimmedThrowableData)localObject);
      return;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\TrimmedThrowableData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */