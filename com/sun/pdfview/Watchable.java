package com.sun.pdfview;

public abstract interface Watchable
{
  public static final int COMPLETED = 6;
  public static final int ERROR = 7;
  public static final int NEEDS_DATA = 3;
  public static final int NOT_STARTED = 1;
  public static final int PAUSED = 2;
  public static final int RUNNING = 4;
  public static final int STOPPED = 5;
  public static final int UNKNOWN;
  
  public abstract int getStatus();
  
  public abstract void go();
  
  public abstract void go(int paramInt);
  
  public abstract void go(long paramLong);
  
  public abstract void stop();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\Watchable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */