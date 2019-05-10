package com.loopj.android.http;

import b.a.a.a.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsonHttpResponseHandler$2$1
  implements Runnable
{
  JsonHttpResponseHandler$2$1(JsonHttpResponseHandler.2 param2, Object paramObject) {}
  
  public void run()
  {
    Object localObject1 = null;
    Object localObject2 = this.this$1.this$0;
    boolean bool = JsonHttpResponseHandler.access$000((JsonHttpResponseHandler)localObject2);
    JsonHttpResponseHandler.2 local2;
    int i;
    e[] arrayOfe;
    Object localObject3;
    if (!bool)
    {
      localObject2 = this.val$jsonResponse;
      if (localObject2 == null)
      {
        localObject2 = this.this$1.this$0;
        local2 = this.this$1;
        i = local2.val$statusCode;
        arrayOfe = this.this$1.val$headers;
        localObject1 = (String)null;
        localObject3 = this.this$1.val$throwable;
        ((JsonHttpResponseHandler)localObject2).onFailure(i, arrayOfe, null, (Throwable)localObject3);
      }
    }
    for (;;)
    {
      return;
      localObject2 = this.val$jsonResponse;
      bool = localObject2 instanceof JSONObject;
      if (bool)
      {
        localObject2 = this.this$1.this$0;
        i = this.this$1.val$statusCode;
        arrayOfe = this.this$1.val$headers;
        localObject3 = this.this$1.val$throwable;
        localObject1 = (JSONObject)this.val$jsonResponse;
        ((JsonHttpResponseHandler)localObject2).onFailure(i, arrayOfe, (Throwable)localObject3, (JSONObject)localObject1);
      }
      else
      {
        localObject2 = this.val$jsonResponse;
        bool = localObject2 instanceof JSONArray;
        if (bool)
        {
          localObject2 = this.this$1.this$0;
          i = this.this$1.val$statusCode;
          arrayOfe = this.this$1.val$headers;
          localObject3 = this.this$1.val$throwable;
          localObject1 = (JSONArray)this.val$jsonResponse;
          ((JsonHttpResponseHandler)localObject2).onFailure(i, arrayOfe, (Throwable)localObject3, (JSONArray)localObject1);
        }
        else
        {
          localObject2 = this.val$jsonResponse;
          bool = localObject2 instanceof String;
          if (bool)
          {
            localObject2 = this.this$1.this$0;
            i = this.this$1.val$statusCode;
            arrayOfe = this.this$1.val$headers;
            localObject1 = (String)this.val$jsonResponse;
            localObject3 = this.this$1.val$throwable;
            ((JsonHttpResponseHandler)localObject2).onFailure(i, arrayOfe, (String)localObject1, (Throwable)localObject3);
          }
          else
          {
            localObject2 = this.this$1.this$0;
            local2 = this.this$1;
            i = local2.val$statusCode;
            arrayOfe = this.this$1.val$headers;
            localObject3 = new org/json/JSONException;
            Object localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = ((StringBuilder)localObject4).append("Unexpected response type ");
            String str = this.val$jsonResponse.getClass().getName();
            localObject4 = str;
            ((JSONException)localObject3).<init>((String)localObject4);
            localObject1 = (JSONObject)null;
            ((JsonHttpResponseHandler)localObject2).onFailure(i, arrayOfe, (Throwable)localObject3, null);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\JsonHttpResponseHandler$2$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */