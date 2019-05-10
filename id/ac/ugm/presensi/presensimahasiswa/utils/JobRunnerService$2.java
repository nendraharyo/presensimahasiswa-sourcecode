package id.ac.ugm.presensi.presensimahasiswa.utils;

import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class JobRunnerService$2
  extends AsyncHttpResponseHandler
{
  JobRunnerService$2(JobRunnerService paramJobRunnerService) {}
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    Object localObject = "null";
    if (paramArrayOfByte != null) {}
    try
    {
      localObject = new java/lang/String;
      String str1 = "UTF-8";
      ((String)localObject).<init>(paramArrayOfByte, str1);
      localObject = new org/json/JSONObject;
      str1 = new java/lang/String;
      String str2 = "UTF-8";
      str1.<init>(paramArrayOfByte, str2);
      ((JSONObject)localObject).<init>(str1);
      str1 = "is_success";
      ((JSONObject)localObject).getJSONObject(str1);
      str1 = "data";
      ((JSONObject)localObject).getJSONObject(str1);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        try
        {
          boolean bool = LoginActivity.b();
          if (bool) {}
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          continue;
          localJSONException = localJSONException;
          localJSONException.printStackTrace();
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void onFinish()
  {
    super.onFinish();
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      Object localObject2 = new java/lang/String;
      String str1 = "UTF-8";
      ((String)localObject2).<init>(paramArrayOfByte, str1);
      ((JSONObject)localObject1).<init>((String)localObject2);
      localObject2 = "status";
      int i = ((JSONObject)localObject1).getInt((String)localObject2);
      int j = 200;
      if (i == j)
      {
        localObject2 = this.a;
        str1 = "token";
        str1 = ((JSONObject)localObject1).getString(str1);
        String str2 = "value";
        localObject1 = ((JSONObject)localObject1).getString(str2);
        JobRunnerService.a((JobRunnerService)localObject2, str1, (String)localObject1);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\JobRunnerService$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */