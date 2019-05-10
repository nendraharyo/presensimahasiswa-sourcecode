package com.loopj.android.http;

import b.a.a.a.e;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHttpResponseHandler
  extends TextHttpResponseHandler
{
  private static final String LOG_TAG = "JsonHttpRH";
  private boolean useRFC5179CompatibilityMode = true;
  
  public JsonHttpResponseHandler()
  {
    super("UTF-8");
  }
  
  public JsonHttpResponseHandler(String paramString)
  {
    super(paramString);
  }
  
  public JsonHttpResponseHandler(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.useRFC5179CompatibilityMode = paramBoolean;
  }
  
  public JsonHttpResponseHandler(boolean paramBoolean)
  {
    super("UTF-8");
    this.useRFC5179CompatibilityMode = paramBoolean;
  }
  
  public boolean isUseRFC5179CompatibilityMode()
  {
    return this.useRFC5179CompatibilityMode;
  }
  
  public void onFailure(int paramInt, e[] paramArrayOfe, String paramString, Throwable paramThrowable)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received", paramThrowable);
  }
  
  public void onFailure(int paramInt, e[] paramArrayOfe, Throwable paramThrowable, JSONArray paramJSONArray)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], Throwable, JSONArray) was not overriden, but callback was received", paramThrowable);
  }
  
  public void onFailure(int paramInt, e[] paramArrayOfe, Throwable paramThrowable, JSONObject paramJSONObject)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received", paramThrowable);
  }
  
  public final void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramArrayOfByte != null)
    {
      localObject1 = new com/loopj/android/http/JsonHttpResponseHandler$2;
      localObject2 = this;
      localObject3 = paramArrayOfByte;
      ((JsonHttpResponseHandler.2)localObject1).<init>(this, paramArrayOfByte, paramInt, paramArrayOfe, paramThrowable);
      boolean bool = getUseSynchronousMode();
      if (!bool)
      {
        bool = getUsePoolThread();
        if (!bool)
        {
          localObject2 = new java/lang/Thread;
          ((Thread)localObject2).<init>((Runnable)localObject1);
          ((Thread)localObject2).start();
        }
      }
    }
    for (;;)
    {
      return;
      ((Runnable)localObject1).run();
      continue;
      localObject1 = AsyncHttpClient.log;
      localObject2 = "JsonHttpRH";
      localObject3 = "response body is null, calling onFailure(Throwable, JSONObject)";
      ((LogInterface)localObject1).v((String)localObject2, (String)localObject3);
      localObject1 = (JSONObject)null;
      onFailure(paramInt, paramArrayOfe, paramThrowable, null);
    }
  }
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, String paramString)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], String) was not overriden, but callback was received");
  }
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, JSONArray paramJSONArray)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received");
  }
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, JSONObject paramJSONObject)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received");
  }
  
  public final void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    int i = 204;
    Object localObject;
    if (paramInt != i)
    {
      localObject = new com/loopj/android/http/JsonHttpResponseHandler$1;
      ((JsonHttpResponseHandler.1)localObject).<init>(this, paramArrayOfByte, paramInt, paramArrayOfe);
      boolean bool = getUseSynchronousMode();
      if (!bool)
      {
        bool = getUsePoolThread();
        if (!bool)
        {
          Thread localThread = new java/lang/Thread;
          localThread.<init>((Runnable)localObject);
          localThread.start();
        }
      }
    }
    for (;;)
    {
      return;
      ((Runnable)localObject).run();
      continue;
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      onSuccess(paramInt, paramArrayOfe, (JSONObject)localObject);
    }
  }
  
  protected Object parseResponse(byte[] paramArrayOfByte)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramArrayOfByte == null) {}
    label219:
    label288:
    label299:
    for (;;)
    {
      return localObject1;
      Object localObject2 = getCharset();
      localObject2 = getResponseString(paramArrayOfByte, (String)localObject2);
      boolean bool;
      String str;
      Object localObject3;
      if (localObject2 != null)
      {
        localObject2 = ((String)localObject2).trim();
        bool = this.useRFC5179CompatibilityMode;
        if (bool)
        {
          str = "{";
          bool = ((String)localObject2).startsWith(str);
          if (!bool)
          {
            str = "[";
            bool = ((String)localObject2).startsWith(str);
            if (!bool) {
              break label288;
            }
          }
          localObject1 = new org/json/JSONTokener;
          ((JSONTokener)localObject1).<init>((String)localObject2);
          localObject1 = ((JSONTokener)localObject1).nextValue();
          localObject3 = localObject2;
          localObject2 = localObject1;
          localObject1 = localObject3;
        }
      }
      for (;;)
      {
        if (localObject2 == null) {
          break label299;
        }
        localObject1 = localObject2;
        break;
        str = "{";
        bool = ((String)localObject2).startsWith(str);
        if (bool)
        {
          str = "}";
          bool = ((String)localObject2).endsWith(str);
          if (bool) {}
        }
        else
        {
          str = "[";
          bool = ((String)localObject2).startsWith(str);
          if (!bool) {
            break label219;
          }
          str = "]";
          bool = ((String)localObject2).endsWith(str);
          if (!bool) {
            break label219;
          }
        }
        localObject1 = new org/json/JSONTokener;
        ((JSONTokener)localObject1).<init>((String)localObject2);
        localObject1 = ((JSONTokener)localObject1).nextValue();
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
        continue;
        str = "\"";
        bool = ((String)localObject2).startsWith(str);
        if (bool)
        {
          str = "\"";
          bool = ((String)localObject2).endsWith(str);
          if (bool)
          {
            i = 1;
            int j = ((String)localObject2).length() + -1;
            localObject1 = ((String)localObject2).substring(i, j);
            localObject3 = localObject2;
            localObject2 = localObject1;
            localObject1 = localObject3;
            continue;
          }
        }
        localObject3 = localObject2;
        localObject2 = null;
        localObject1 = localObject3;
      }
    }
  }
  
  public void setUseRFC5179CompatibilityMode(boolean paramBoolean)
  {
    this.useRFC5179CompatibilityMode = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\JsonHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */