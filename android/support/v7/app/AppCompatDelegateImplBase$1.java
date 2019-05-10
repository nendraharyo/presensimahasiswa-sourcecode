package android.support.v7.app;

import android.content.res.Resources.NotFoundException;

final class AppCompatDelegateImplBase$1
  implements Thread.UncaughtExceptionHandler
{
  AppCompatDelegateImplBase$1(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  private boolean shouldWrapException(Throwable paramThrowable)
  {
    boolean bool1 = false;
    boolean bool2 = paramThrowable instanceof Resources.NotFoundException;
    if (bool2)
    {
      String str1 = ((Throwable)paramThrowable).getMessage();
      if (str1 != null)
      {
        String str2 = "drawable";
        boolean bool3 = str1.contains(str2);
        if (!bool3)
        {
          str2 = "Drawable";
          bool2 = str1.contains(str2);
          if (!bool2) {}
        }
        else
        {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    boolean bool = shouldWrapException(paramThrowable);
    Object localObject1;
    if (bool)
    {
      localObject1 = new android/content/res/Resources$NotFoundException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = paramThrowable.getMessage();
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
      localObject2 = str;
      ((Resources.NotFoundException)localObject1).<init>((String)localObject2);
      localObject2 = paramThrowable.getCause();
      ((Throwable)localObject1).initCause((Throwable)localObject2);
      localObject2 = paramThrowable.getStackTrace();
      ((Throwable)localObject1).setStackTrace((StackTraceElement[])localObject2);
      localObject2 = this.val$defHandler;
      ((Thread.UncaughtExceptionHandler)localObject2).uncaughtException(paramThread, (Throwable)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = this.val$defHandler;
      ((Thread.UncaughtExceptionHandler)localObject1).uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplBase$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */