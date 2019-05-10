package com.sun.pdfview;

class BaseWatchable$Gate
{
  private long nextGate;
  private boolean timeBased;
  
  BaseWatchable$Gate(BaseWatchable paramBaseWatchable) {}
  
  public boolean iterate()
  {
    boolean bool = this.timeBased;
    if (!bool)
    {
      long l1 = this.nextGate;
      long l2 = 1L;
      l1 -= l2;
      this.nextGate = l1;
    }
    return stop();
  }
  
  public void setStopIterations(int paramInt)
  {
    this.timeBased = false;
    long l = paramInt;
    this.nextGate = l;
  }
  
  public void setStopTime(long paramLong)
  {
    this.timeBased = true;
    long l = System.currentTimeMillis() + paramLong;
    this.nextGate = l;
  }
  
  public boolean stop()
  {
    boolean bool1 = true;
    boolean bool2 = this.timeBased;
    long l1;
    long l2;
    if (bool2)
    {
      l1 = System.currentTimeMillis();
      l2 = this.nextGate;
      bool2 = l1 < l2;
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      l1 = this.nextGate;
      l2 = 0L;
      bool2 = l1 < l2;
      if (!bool2) {
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\BaseWatchable$Gate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */