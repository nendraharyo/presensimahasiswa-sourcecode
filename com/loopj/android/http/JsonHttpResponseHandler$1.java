package com.loopj.android.http;

import b.a.a.a.e;
import org.json.JSONException;

class JsonHttpResponseHandler$1
  implements Runnable
{
  JsonHttpResponseHandler$1(JsonHttpResponseHandler paramJsonHttpResponseHandler, byte[] paramArrayOfByte, int paramInt, e[] paramArrayOfe) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject2 = this.val$responseBytes;
      localObject1 = ((JsonHttpResponseHandler)localObject1).parseResponse((byte[])localObject2);
      localObject2 = this.this$0;
      localObject3 = new com/loopj/android/http/JsonHttpResponseHandler$1$1;
      ((JsonHttpResponseHandler.1.1)localObject3).<init>(this, localObject1);
      ((JsonHttpResponseHandler)localObject2).postRunnable((Runnable)localObject3);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = this.this$0;
        Object localObject3 = new com/loopj/android/http/JsonHttpResponseHandler$1$2;
        ((JsonHttpResponseHandler.1.2)localObject3).<init>(this, localJSONException);
        ((JsonHttpResponseHandler)localObject2).postRunnable((Runnable)localObject3);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\JsonHttpResponseHandler$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */