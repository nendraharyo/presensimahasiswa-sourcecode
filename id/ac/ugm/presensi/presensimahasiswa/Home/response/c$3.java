package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class c$3
  extends AsyncHttpResponseHandler
{
  c$3(c paramc) {}
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    int i = 1;
    Object localObject1 = "null";
    if (paramArrayOfByte != null) {}
    try
    {
      localObject1 = new java/lang/String;
      localObject3 = "UTF-8";
      ((String)localObject1).<init>(paramArrayOfByte, (String)localObject3);
      localObject1 = new org/json/JSONObject;
      localObject3 = new java/lang/String;
      str = "UTF-8";
      ((String)localObject3).<init>(paramArrayOfByte, str);
      ((JSONObject)localObject1).<init>((String)localObject3);
      localObject3 = "is_success";
      ((JSONObject)localObject1).getJSONObject((String)localObject3);
      localObject3 = "data";
      ((JSONObject)localObject1).getJSONObject((String)localObject3);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        try
        {
          boolean bool = LoginActivity.b();
          if (!bool)
          {
            localObject1 = this.a;
            localObject1 = ((c)localObject1).getActivity();
            localObject3 = this.a;
            localObject3 = ((c)localObject3).getResources();
            j = 2131689796;
            localObject3 = ((Resources)localObject3).getString(j);
            j = 1;
            localObject1 = Toast.makeText((Context)localObject1, (CharSequence)localObject3, j);
            ((Toast)localObject1).show();
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          continue;
          localJSONException = localJSONException;
          localJSONException.printStackTrace();
          localObject3 = this.a.getActivity();
          str = "Presensi Gagal.";
          localObject3 = Toast.makeText((Context)localObject3, str, i);
          ((Toast)localObject3).show();
          localJSONException.printStackTrace();
          continue;
          Object localObject2 = this.a;
          localObject2 = ((c)localObject2).getActivity();
          localObject3 = this.a;
          localObject3 = ((c)localObject3).getResources();
          int j = 2131689693;
          localObject3 = ((Resources)localObject3).getString(j);
          j = 1;
          localObject2 = Toast.makeText((Context)localObject2, (CharSequence)localObject3, j);
          ((Toast)localObject2).show();
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
        Object localObject3 = this.a.getActivity();
        String str = "Presensi Gagal.";
        localObject3 = Toast.makeText((Context)localObject3, str, i);
        ((Toast)localObject3).show();
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
      str1 = "content";
      ((JSONObject)localObject).getJSONObject(str1);
      str1 = "status";
      int i = ((JSONObject)localObject).getInt(str1);
      int j = 200;
      if (i == j)
      {
        localObject = this.a;
        c.b((c)localObject);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */