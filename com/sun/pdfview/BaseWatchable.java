package com.sun.pdfview;

public abstract class BaseWatchable
  implements Watchable, Runnable
{
  private static boolean SuppressSetErrorStackTrace = false;
  private BaseWatchable.Gate gate;
  private Object parserLock;
  private int status = 0;
  private Object statusLock;
  private Thread thread;
  
  protected BaseWatchable()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.statusLock = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.parserLock = localObject;
    setStatus(1);
  }
  
  private String getStatusString()
  {
    int i = getStatus();
    String str;
    switch (i)
    {
    default: 
      str = "Unknown";
    }
    for (;;)
    {
      return str;
      str = "Not started";
      continue;
      str = "Running";
      continue;
      str = "Needs Data";
      continue;
      str = "Paused";
      continue;
      str = "Stopped";
      continue;
      str = "Completed";
      continue;
      str = "Error";
    }
  }
  
  public static boolean isSuppressSetErrorStackTrace()
  {
    return SuppressSetErrorStackTrace;
  }
  
  public static void setSuppressSetErrorStackTrace(boolean paramBoolean)
  {
    SuppressSetErrorStackTrace = paramBoolean;
  }
  
  protected void cleanup() {}
  
  protected void execute(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.thread;
        if (localObject1 != null) {
          synchronized (this.statusLock)
          {
            localObject1 = this.statusLock;
            localObject1.notifyAll();
            return;
          }
        }
        bool = isFinished();
      }
      finally {}
      boolean bool;
      if (!bool)
      {
        Thread localThread;
        if (paramBoolean)
        {
          localThread = Thread.currentThread();
          this.thread = localThread;
          run();
        }
        else
        {
          localThread = new java/lang/Thread;
          localThread.<init>(this);
          this.thread = localThread;
          localThread = this.thread;
          ??? = getClass();
          ??? = ((Class)???).getName();
          localThread.setName((String)???);
          localThread = this.thread;
          localThread.start();
        }
      }
    }
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public void go()
  {
    Object localObject1 = null;
    try
    {
      this.gate = null;
      localObject1 = null;
      execute(false);
      return;
    }
    finally {}
  }
  
  public void go(int paramInt)
  {
    try
    {
      BaseWatchable.Gate localGate = new com/sun/pdfview/BaseWatchable$Gate;
      localGate.<init>(this);
      this.gate = localGate;
      localGate = this.gate;
      localGate.setStopIterations(paramInt);
      localGate = null;
      execute(false);
      return;
    }
    finally {}
  }
  
  public void go(long paramLong)
  {
    try
    {
      BaseWatchable.Gate localGate = new com/sun/pdfview/BaseWatchable$Gate;
      localGate.<init>(this);
      this.gate = localGate;
      localGate = this.gate;
      localGate.setStopTime(paramLong);
      localGate = null;
      execute(false);
      return;
    }
    finally {}
  }
  
  public void go(boolean paramBoolean)
  {
    Object localObject1 = null;
    try
    {
      this.gate = null;
      execute(paramBoolean);
      return;
    }
    finally {}
  }
  
  public boolean isExecutable()
  {
    int i = this.status;
    int j = 2;
    BaseWatchable.Gate localGate;
    boolean bool;
    if (i != j)
    {
      i = this.status;
      j = 4;
      if (i != j) {}
    }
    else
    {
      localGate = this.gate;
      if (localGate != null)
      {
        localGate = this.gate;
        bool = localGate.stop();
        if (bool) {}
      }
      else
      {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localGate = null;
    }
  }
  
  public boolean isFinished()
  {
    int i = getStatus();
    int k = 6;
    if (i != k)
    {
      int m = 7;
      if (i == m) {}
    }
    int j;
    for (i = 0;; j = 1) {
      return i;
    }
  }
  
  protected abstract int iterate();
  
  public void run()
  {
    int i = 2;
    int j = 4;
    int k = getStatus();
    int i2 = 1;
    if (k == i2) {
      setup();
    }
    setStatus(i);
    for (;;)
    {
      synchronized (this.parserLock)
      {
        boolean bool1 = isFinished();
        int m;
        if (!bool1)
        {
          m = getStatus();
          i = 5;
          if (m != i) {}
        }
        else
        {
          m = getStatus();
          i2 = 6;
          if (m != i2)
          {
            m = getStatus();
            i2 = 7;
            if (m != i2) {}
          }
          else
          {
            cleanup();
          }
          this.thread = null;
          return;
        }
        boolean bool2 = isExecutable();
        if (!bool2) {
          break label205;
        }
        int n = 4;
        setStatus(n);
        try
        {
          n = getStatus();
          if (n == j)
          {
            BaseWatchable.Gate localGate = this.gate;
            if (localGate != null)
            {
              localGate = this.gate;
              boolean bool3 = localGate.iterate();
              if (!bool3) {}
            }
          }
          else
          {
            i1 = getStatus();
            if (i1 != j) {
              continue;
            }
            i1 = 2;
            setStatus(i1);
          }
        }
        catch (Exception localException)
        {
          setError(localException);
        }
      }
      int i1 = iterate();
      setStatus(i1);
      continue;
      label205:
      synchronized (this.statusLock)
      {
        boolean bool4 = isExecutable();
        if (!bool4) {}
        try
        {
          Object localObject3 = this.statusLock;
          localObject3.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;) {}
        }
      }
    }
  }
  
  protected void setError(Exception paramException)
  {
    boolean bool = SuppressSetErrorStackTrace;
    if (!bool) {
      paramException.printStackTrace();
    }
    setStatus(7);
  }
  
  protected void setStatus(int paramInt)
  {
    synchronized (this.statusLock)
    {
      this.status = paramInt;
      Object localObject2 = this.statusLock;
      localObject2.notifyAll();
      return;
    }
  }
  
  protected void setup() {}
  
  public void stop()
  {
    setStatus(5);
  }
  
  public void waitForFinish()
  {
    synchronized (this.statusLock)
    {
      for (;;)
      {
        boolean bool = isFinished();
        if (!bool)
        {
          int i = getStatus();
          int j = 5;
          if (i != j) {}
        }
        else
        {
          return;
        }
        try
        {
          Object localObject2 = this.statusLock;
          localObject2.wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\BaseWatchable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */