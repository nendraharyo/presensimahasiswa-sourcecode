package android.support.v4.a;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.h.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public abstract class a
  extends c
{
  static final boolean DEBUG = false;
  static final String TAG = "AsyncTaskLoader";
  volatile a.a mCancellingTask;
  private final Executor mExecutor;
  Handler mHandler;
  long mLastLoadCompleteTime = -10000L;
  volatile a.a mTask;
  long mUpdateThrottle;
  
  public a(Context paramContext)
  {
    this(paramContext, localExecutor);
  }
  
  private a(Context paramContext, Executor paramExecutor)
  {
    super(paramContext);
    this.mExecutor = paramExecutor;
  }
  
  public void cancelLoadInBackground() {}
  
  void dispatchOnCancelled(a.a parama, Object paramObject)
  {
    onCanceled(paramObject);
    a.a locala = this.mCancellingTask;
    if (locala == parama)
    {
      rollbackContentChanged();
      long l = SystemClock.uptimeMillis();
      this.mLastLoadCompleteTime = l;
      locala = null;
      this.mCancellingTask = null;
      deliverCancellation();
      executePendingTask();
    }
  }
  
  void dispatchOnLoadComplete(a.a parama, Object paramObject)
  {
    a.a locala = this.mTask;
    if (locala != parama) {
      dispatchOnCancelled(parama, paramObject);
    }
    for (;;)
    {
      return;
      boolean bool = isAbandoned();
      if (bool)
      {
        onCanceled(paramObject);
      }
      else
      {
        commitContentChanged();
        long l = SystemClock.uptimeMillis();
        this.mLastLoadCompleteTime = l;
        bool = false;
        locala = null;
        this.mTask = null;
        deliverResult(paramObject);
      }
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Object localObject = this.mTask;
    if (localObject != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      localObject = this.mTask;
      paramPrintWriter.print(localObject);
      paramPrintWriter.print(" waiting=");
      localObject = this.mTask;
      bool = ((a.a)localObject).a;
      paramPrintWriter.println(bool);
    }
    localObject = this.mCancellingTask;
    if (localObject != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      localObject = this.mCancellingTask;
      paramPrintWriter.print(localObject);
      paramPrintWriter.print(" waiting=");
      localObject = this.mCancellingTask;
      bool = ((a.a)localObject).a;
      paramPrintWriter.println(bool);
    }
    long l1 = this.mUpdateThrottle;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      o.a(this.mUpdateThrottle, paramPrintWriter);
      localObject = " mLastLoadCompleteTime=";
      paramPrintWriter.print((String)localObject);
      l1 = this.mLastLoadCompleteTime;
      l2 = SystemClock.uptimeMillis();
      o.a(l1, l2, paramPrintWriter);
      paramPrintWriter.println();
    }
  }
  
  void executePendingTask()
  {
    Object localObject = this.mCancellingTask;
    boolean bool1;
    a.a locala;
    if (localObject == null)
    {
      localObject = this.mTask;
      if (localObject != null)
      {
        localObject = this.mTask;
        bool1 = ((a.a)localObject).a;
        if (bool1)
        {
          localObject = this.mTask;
          bool2 = false;
          ((a.a)localObject).a = false;
          localObject = this.mHandler;
          locala = this.mTask;
          ((Handler)localObject).removeCallbacks(locala);
        }
        long l1 = this.mUpdateThrottle;
        long l2 = 0L;
        bool1 = l1 < l2;
        if (!bool1) {
          break label166;
        }
        l1 = SystemClock.uptimeMillis();
        l2 = this.mLastLoadCompleteTime;
        long l3 = this.mUpdateThrottle;
        l2 += l3;
        bool1 = l1 < l2;
        if (!bool1) {
          break label166;
        }
        localObject = this.mTask;
        boolean bool2 = true;
        ((a.a)localObject).a = bool2;
        localObject = this.mHandler;
        locala = this.mTask;
        l2 = this.mLastLoadCompleteTime;
        l3 = this.mUpdateThrottle;
        l2 += l3;
        ((Handler)localObject).postAtTime(locala, l2);
      }
    }
    for (;;)
    {
      return;
      label166:
      locala = this.mTask;
      Executor localExecutor = this.mExecutor;
      bool1 = false;
      localObject = (Void[])null;
      locala.a(localExecutor, null);
    }
  }
  
  public boolean isLoadInBackgroundCanceled()
  {
    a.a locala = this.mCancellingTask;
    boolean bool;
    if (locala != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  public abstract Object loadInBackground();
  
  protected boolean onCancelLoad()
  {
    boolean bool1 = false;
    Object localObject = this.mTask;
    boolean bool2;
    a.a locala;
    if (localObject != null)
    {
      bool2 = this.mStarted;
      if (!bool2)
      {
        bool2 = true;
        this.mContentChanged = bool2;
      }
      localObject = this.mCancellingTask;
      if (localObject == null) {
        break label82;
      }
      localObject = this.mTask;
      bool2 = ((a.a)localObject).a;
      if (bool2)
      {
        this.mTask.a = false;
        localObject = this.mHandler;
        locala = this.mTask;
        ((Handler)localObject).removeCallbacks(locala);
      }
      this.mTask = null;
    }
    for (;;)
    {
      return bool1;
      label82:
      localObject = this.mTask;
      bool2 = ((a.a)localObject).a;
      if (bool2)
      {
        this.mTask.a = false;
        localObject = this.mHandler;
        locala = this.mTask;
        ((Handler)localObject).removeCallbacks(locala);
        this.mTask = null;
      }
      else
      {
        localObject = this.mTask;
        bool1 = ((a.a)localObject).a(false);
        if (bool1)
        {
          localObject = this.mTask;
          this.mCancellingTask = ((a.a)localObject);
          cancelLoadInBackground();
        }
        this.mTask = null;
      }
    }
  }
  
  public void onCanceled(Object paramObject) {}
  
  protected void onForceLoad()
  {
    super.onForceLoad();
    cancelLoad();
    a.a locala = new android/support/v4/a/a$a;
    locala.<init>(this);
    this.mTask = locala;
    executePendingTask();
  }
  
  protected Object onLoadInBackground()
  {
    return loadInBackground();
  }
  
  public void setUpdateThrottle(long paramLong)
  {
    this.mUpdateThrottle = paramLong;
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool)
    {
      Handler localHandler = new android/os/Handler;
      localHandler.<init>();
      this.mHandler = localHandler;
    }
  }
  
  public void waitForLoader()
  {
    a.a locala = this.mTask;
    if (locala != null) {
      locala.a();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */