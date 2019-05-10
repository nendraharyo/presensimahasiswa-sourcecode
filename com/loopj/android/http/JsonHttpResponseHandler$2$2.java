package com.loopj.android.http;

import b.a.a.a.e;
import org.json.JSONException;
import org.json.JSONObject;

class JsonHttpResponseHandler$2$2
  implements Runnable
{
  JsonHttpResponseHandler$2$2(JsonHttpResponseHandler.2 param2, JSONException paramJSONException) {}
  
  public void run()
  {
    JsonHttpResponseHandler localJsonHttpResponseHandler = this.this$1.this$0;
    int i = this.this$1.val$statusCode;
    e[] arrayOfe = this.this$1.val$headers;
    JSONException localJSONException = this.val$ex;
    ((JSONObject)null);
    localJsonHttpResponseHandler.onFailure(i, arrayOfe, localJSONException, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\JsonHttpResponseHandler$2$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */