package com.loopj.android.http;

import b.a.a.a.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsonHttpResponseHandler$1$1
  implements Runnable
{
  JsonHttpResponseHandler$1$1(JsonHttpResponseHandler.1 param1, Object paramObject) {}
  
  public void run()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.this$1.this$0;
    boolean bool2 = JsonHttpResponseHandler.access$000((JsonHttpResponseHandler)localObject2);
    JsonHttpResponseHandler.1 local1;
    int i;
    e[] arrayOfe;
    if (!bool2)
    {
      localObject2 = this.val$jsonResponse;
      if (localObject2 == null)
      {
        localObject2 = this.this$1.this$0;
        local1 = this.this$1;
        i = local1.val$statusCode;
        arrayOfe = this.this$1.val$headers;
        localObject1 = (String)null;
        ((JsonHttpResponseHandler)localObject2).onSuccess(i, arrayOfe, null);
      }
    }
    for (;;)
    {
      return;
      localObject2 = this.val$jsonResponse;
      bool2 = localObject2 instanceof JSONObject;
      if (bool2)
      {
        localObject2 = this.this$1.this$0;
        i = this.this$1.val$statusCode;
        arrayOfe = this.this$1.val$headers;
        localObject1 = (JSONObject)this.val$jsonResponse;
        ((JsonHttpResponseHandler)localObject2).onSuccess(i, arrayOfe, (JSONObject)localObject1);
      }
      else
      {
        localObject2 = this.val$jsonResponse;
        bool2 = localObject2 instanceof JSONArray;
        if (bool2)
        {
          localObject2 = this.this$1.this$0;
          i = this.this$1.val$statusCode;
          arrayOfe = this.this$1.val$headers;
          localObject1 = (JSONArray)this.val$jsonResponse;
          ((JsonHttpResponseHandler)localObject2).onSuccess(i, arrayOfe, (JSONArray)localObject1);
        }
        else
        {
          localObject2 = this.val$jsonResponse;
          bool2 = localObject2 instanceof String;
          JSONException localJSONException;
          Object localObject3;
          if (bool2)
          {
            localObject1 = this.this$1.this$0;
            bool1 = JsonHttpResponseHandler.access$000((JsonHttpResponseHandler)localObject1);
            if (bool1)
            {
              localObject2 = this.this$1.this$0;
              i = this.this$1.val$statusCode;
              arrayOfe = this.this$1.val$headers;
              localObject1 = (String)this.val$jsonResponse;
              localJSONException = new org/json/JSONException;
              localObject3 = "Response cannot be parsed as JSON data";
              localJSONException.<init>((String)localObject3);
              ((JsonHttpResponseHandler)localObject2).onFailure(i, arrayOfe, (String)localObject1, localJSONException);
            }
            else
            {
              localObject2 = this.this$1.this$0;
              i = this.this$1.val$statusCode;
              arrayOfe = this.this$1.val$headers;
              localObject1 = (String)this.val$jsonResponse;
              ((JsonHttpResponseHandler)localObject2).onSuccess(i, arrayOfe, (String)localObject1);
            }
          }
          else
          {
            localObject2 = this.this$1.this$0;
            local1 = this.this$1;
            i = local1.val$statusCode;
            arrayOfe = this.this$1.val$headers;
            localJSONException = new org/json/JSONException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = ((StringBuilder)localObject3).append("Unexpected response type ");
            String str = this.val$jsonResponse.getClass().getName();
            localObject3 = str;
            localJSONException.<init>((String)localObject3);
            localObject1 = (JSONObject)null;
            ((JsonHttpResponseHandler)localObject2).onFailure(i, arrayOfe, localJSONException, null);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\JsonHttpResponseHandler$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */