package com.loopj.android.http;

import android.content.Context;
import b.a.a.a.b.c.l;
import b.a.a.a.e.c.i;
import b.a.a.a.i.b.k;
import b.a.a.a.n.e;

public class SyncHttpClient
  extends AsyncHttpClient
{
  public SyncHttpClient()
  {
    super(false, 80, 443);
  }
  
  public SyncHttpClient(int paramInt)
  {
    super(false, paramInt, 443);
  }
  
  public SyncHttpClient(int paramInt1, int paramInt2)
  {
    super(false, paramInt1, paramInt2);
  }
  
  public SyncHttpClient(i parami)
  {
    super(parami);
  }
  
  public SyncHttpClient(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    super(paramBoolean, paramInt1, paramInt2);
  }
  
  protected RequestHandle sendRequest(k paramk, e parame, l paraml, String paramString, ResponseHandlerInterface paramResponseHandlerInterface, Context paramContext)
  {
    if (paramString != null)
    {
      localObject = "Content-Type";
      paraml.addHeader((String)localObject, paramString);
    }
    paramResponseHandlerInterface.setUseSynchronousMode(true);
    newAsyncHttpRequest(paramk, parame, paraml, paramString, paramResponseHandlerInterface, paramContext).run();
    Object localObject = new com/loopj/android/http/RequestHandle;
    ((RequestHandle)localObject).<init>(null);
    return (RequestHandle)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\SyncHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */