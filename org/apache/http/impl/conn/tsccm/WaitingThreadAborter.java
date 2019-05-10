package org.apache.http.impl.conn.tsccm;

public class WaitingThreadAborter
{
  private boolean aborted;
  private WaitingThread waitingThread;
  
  public void abort()
  {
    boolean bool = true;
    this.aborted = bool;
    WaitingThread localWaitingThread = this.waitingThread;
    if (localWaitingThread != null)
    {
      localWaitingThread = this.waitingThread;
      localWaitingThread.interrupt();
    }
  }
  
  public void setWaitingThread(WaitingThread paramWaitingThread)
  {
    this.waitingThread = paramWaitingThread;
    boolean bool = this.aborted;
    if (bool) {
      paramWaitingThread.interrupt();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\WaitingThreadAborter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */