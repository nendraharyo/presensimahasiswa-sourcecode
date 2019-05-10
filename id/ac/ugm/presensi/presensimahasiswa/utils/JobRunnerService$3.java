package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.content.Context;
import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class JobRunnerService$3
  extends AsyncHttpResponseHandler
{
  JobRunnerService$3(JobRunnerService paramJobRunnerService) {}
  
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
      Object localObject = new org/json/JSONObject;
      String str1 = new java/lang/String;
      String str2 = "UTF-8";
      str1.<init>(paramArrayOfByte, str2);
      ((JSONObject)localObject).<init>(str1);
      str1 = "status";
      int i = ((JSONObject)localObject).getInt(str1);
      int j = 200;
      if (i == j)
      {
        localObject = this.a;
        localObject = ((JobRunnerService)localObject).getApplicationContext();
        str1 = "data_history";
        str2 = "";
        f.a((Context)localObject, str1, str2);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\JobRunnerService$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */