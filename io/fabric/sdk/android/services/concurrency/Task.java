package io.fabric.sdk.android.services.concurrency;

public abstract interface Task
{
  public abstract Throwable getError();
  
  public abstract boolean isFinished();
  
  public abstract void setError(Throwable paramThrowable);
  
  public abstract void setFinished(boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\Task.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */