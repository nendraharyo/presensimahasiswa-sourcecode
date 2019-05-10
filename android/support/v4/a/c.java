package android.support.v4.a;

import android.content.Context;
import android.support.v4.h.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c
{
  boolean mAbandoned = false;
  boolean mContentChanged = false;
  Context mContext;
  int mId;
  c.b mListener;
  c.a mOnLoadCanceledListener;
  boolean mProcessingChange = false;
  boolean mReset = true;
  boolean mStarted = false;
  
  public c(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.mContext = localContext;
  }
  
  public void abandon()
  {
    this.mAbandoned = true;
    onAbandon();
  }
  
  public boolean cancelLoad()
  {
    return onCancelLoad();
  }
  
  public void commitContentChanged()
  {
    this.mProcessingChange = false;
  }
  
  public String dataToString(Object paramObject)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    d.a(paramObject, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void deliverCancellation()
  {
    c.a locala = this.mOnLoadCanceledListener;
    if (locala != null)
    {
      locala = this.mOnLoadCanceledListener;
      locala.a(this);
    }
  }
  
  public void deliverResult(Object paramObject)
  {
    c.b localb = this.mListener;
    if (localb != null)
    {
      localb = this.mListener;
      localb.a(this, paramObject);
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    int i = this.mId;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mListener=");
    Object localObject = this.mListener;
    paramPrintWriter.println(localObject);
    boolean bool = this.mStarted;
    if (!bool)
    {
      bool = this.mContentChanged;
      if (!bool)
      {
        bool = this.mProcessingChange;
        if (!bool) {
          break label137;
        }
      }
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    bool = this.mStarted;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mContentChanged=");
    bool = this.mContentChanged;
    paramPrintWriter.print(bool);
    localObject = " mProcessingChange=";
    paramPrintWriter.print((String)localObject);
    bool = this.mProcessingChange;
    paramPrintWriter.println(bool);
    label137:
    bool = this.mAbandoned;
    if (!bool)
    {
      bool = this.mReset;
      if (!bool) {}
    }
    else
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      bool = this.mAbandoned;
      paramPrintWriter.print(bool);
      localObject = " mReset=";
      paramPrintWriter.print((String)localObject);
      bool = this.mReset;
      paramPrintWriter.println(bool);
    }
  }
  
  public void forceLoad()
  {
    onForceLoad();
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public boolean isAbandoned()
  {
    return this.mAbandoned;
  }
  
  public boolean isReset()
  {
    return this.mReset;
  }
  
  public boolean isStarted()
  {
    return this.mStarted;
  }
  
  protected void onAbandon() {}
  
  protected boolean onCancelLoad()
  {
    return false;
  }
  
  public void onContentChanged()
  {
    boolean bool = this.mStarted;
    if (bool) {
      forceLoad();
    }
    for (;;)
    {
      return;
      bool = true;
      this.mContentChanged = bool;
    }
  }
  
  protected void onForceLoad() {}
  
  protected void onReset() {}
  
  protected void onStartLoading() {}
  
  protected void onStopLoading() {}
  
  public void registerListener(int paramInt, c.b paramb)
  {
    Object localObject = this.mListener;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("There is already a listener registered");
      throw ((Throwable)localObject);
    }
    this.mListener = paramb;
    this.mId = paramInt;
  }
  
  public void registerOnLoadCanceledListener(c.a parama)
  {
    Object localObject = this.mOnLoadCanceledListener;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("There is already a listener registered");
      throw ((Throwable)localObject);
    }
    this.mOnLoadCanceledListener = parama;
  }
  
  public void reset()
  {
    onReset();
    this.mReset = true;
    this.mStarted = false;
    this.mAbandoned = false;
    this.mContentChanged = false;
    this.mProcessingChange = false;
  }
  
  public void rollbackContentChanged()
  {
    boolean bool = this.mProcessingChange;
    if (bool) {
      onContentChanged();
    }
  }
  
  public final void startLoading()
  {
    this.mStarted = true;
    this.mReset = false;
    this.mAbandoned = false;
    onStartLoading();
  }
  
  public void stopLoading()
  {
    this.mStarted = false;
    onStopLoading();
  }
  
  public boolean takeContentChanged()
  {
    boolean bool1 = this.mContentChanged;
    this.mContentChanged = false;
    boolean bool2 = this.mProcessingChange | bool1;
    this.mProcessingChange = bool2;
    return bool1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    d.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    int i = this.mId;
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void unregisterListener(c.b paramb)
  {
    Object localObject = this.mListener;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No listener register");
      throw ((Throwable)localObject);
    }
    localObject = this.mListener;
    if (localObject != paramb)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Attempting to unregister the wrong listener");
      throw ((Throwable)localObject);
    }
    this.mListener = null;
  }
  
  public void unregisterOnLoadCanceledListener(c.a parama)
  {
    Object localObject = this.mOnLoadCanceledListener;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No listener register");
      throw ((Throwable)localObject);
    }
    localObject = this.mOnLoadCanceledListener;
    if (localObject != parama)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Attempting to unregister the wrong listener");
      throw ((Throwable)localObject);
    }
    this.mOnLoadCanceledListener = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */