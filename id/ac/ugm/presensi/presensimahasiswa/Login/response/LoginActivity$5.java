package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.Toast;
import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class LoginActivity$5
  extends AsyncHttpResponseHandler
{
  LoginActivity$5(LoginActivity paramLoginActivity) {}
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    Object localObject1 = "null";
    if (paramArrayOfByte != null) {}
    try
    {
      localObject1 = new java/lang/String;
      localObject3 = "UTF-8";
      ((String)localObject1).<init>(paramArrayOfByte, (String)localObject3);
      localObject1 = new org/json/JSONObject;
      localObject3 = new java/lang/String;
      String str = "UTF-8";
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
            localObject1 = ((LoginActivity)localObject1).getApplicationContext();
            localObject3 = this.a;
            localObject3 = ((LoginActivity)localObject3).getResources();
            i = 2131689796;
            localObject3 = ((Resources)localObject3).getString(i);
            i = 1;
            localObject1 = Toast.makeText((Context)localObject1, (CharSequence)localObject3, i);
            ((Toast)localObject1).show();
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          continue;
          localJSONException = localJSONException;
          localObject3 = this.a;
          ((LoginActivity)localObject3).c();
          localJSONException.printStackTrace();
          continue;
          Object localObject2 = this.a;
          localObject2 = ((LoginActivity)localObject2).getApplicationContext();
          localObject3 = this.a;
          localObject3 = ((LoginActivity)localObject3).getResources();
          int i = 2131689693;
          localObject3 = ((Resources)localObject3).getString(i);
          i = 1;
          localObject2 = Toast.makeText((Context)localObject2, (CharSequence)localObject3, i);
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
        Object localObject3 = this.a;
        ((LoginActivity)localObject3).c();
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void onFinish()
  {
    super.onFinish();
    Object localObject = this.a.d;
    if (localObject != null)
    {
      localObject = this.a.d;
      boolean bool1 = ((ProgressDialog)localObject).isShowing();
      if (bool1)
      {
        this.a.d.dismiss();
        localObject = this.a.e;
        boolean bool2 = true;
        ((Button)localObject).setEnabled(bool2);
      }
    }
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        localObject1 = new org/json/JSONObject;
        Object localObject2 = new java/lang/String;
        Object localObject3 = "UTF-8";
        ((String)localObject2).<init>(paramArrayOfByte, (String)localObject3);
        ((JSONObject)localObject1).<init>((String)localObject2);
        localObject2 = "status";
        int i = ((JSONObject)localObject1).getInt((String)localObject2);
        int j = 200;
        if (i == j)
        {
          localObject2 = this.a;
          localObject2 = ((LoginActivity)localObject2).getApplicationContext();
          localObject3 = "data_local";
          localObject1 = ((JSONObject)localObject1).toString();
          f.a((Context)localObject2, (String)localObject3, (String)localObject1);
          localObject1 = new android/content/Intent;
          localObject2 = this.a;
          localObject2 = ((LoginActivity)localObject2).getApplicationContext();
          localObject3 = DashboardActivity.class;
          ((Intent)localObject1).<init>((Context)localObject2, (Class)localObject3);
          i = 268468224;
          ((Intent)localObject1).setFlags(i);
          localObject2 = this.a;
          localObject2 = ((LoginActivity)localObject2).getApplicationContext();
          localObject3 = "user_login";
          boolean bool = true;
          f.a((Context)localObject2, (String)localObject3, bool);
          localObject2 = this.a;
          ((LoginActivity)localObject2).startActivity((Intent)localObject1);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject1;
        localJSONException.printStackTrace();
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        continue;
      }
      localObject1 = this.a;
      ((LoginActivity)localObject1).c();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */