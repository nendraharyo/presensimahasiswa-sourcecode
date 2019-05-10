package com.loopj.android.http;

import b.a.a.a.e;
import b.a.a.a.s;
import java.net.URI;

public abstract interface ResponseHandlerInterface
{
  public abstract e[] getRequestHeaders();
  
  public abstract URI getRequestURI();
  
  public abstract Object getTag();
  
  public abstract boolean getUsePoolThread();
  
  public abstract boolean getUseSynchronousMode();
  
  public abstract void onPostProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, s params);
  
  public abstract void onPreProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, s params);
  
  public abstract void sendCancelMessage();
  
  public abstract void sendFailureMessage(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable);
  
  public abstract void sendFinishMessage();
  
  public abstract void sendProgressMessage(long paramLong1, long paramLong2);
  
  public abstract void sendResponseMessage(s params);
  
  public abstract void sendRetryMessage(int paramInt);
  
  public abstract void sendStartMessage();
  
  public abstract void sendSuccessMessage(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte);
  
  public abstract void setRequestHeaders(e[] paramArrayOfe);
  
  public abstract void setRequestURI(URI paramURI);
  
  public abstract void setTag(Object paramObject);
  
  public abstract void setUsePoolThread(boolean paramBoolean);
  
  public abstract void setUseSynchronousMode(boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\ResponseHandlerInterface.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */