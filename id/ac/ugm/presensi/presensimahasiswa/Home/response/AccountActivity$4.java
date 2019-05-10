package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class AccountActivity$4
  extends AsyncHttpResponseHandler
{
  AccountActivity$4(AccountActivity paramAccountActivity) {}
  
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
            localObject1 = ((AccountActivity)localObject1).getApplicationContext();
            localObject3 = this.a;
            localObject3 = ((AccountActivity)localObject3).getResources();
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
          localObject3 = this.a.getApplicationContext();
          str = "Logout Failed";
          localObject3 = Toast.makeText((Context)localObject3, str, i);
          ((Toast)localObject3).show();
          localJSONException.printStackTrace();
          continue;
          Object localObject2 = this.a;
          localObject2 = ((AccountActivity)localObject2).getApplicationContext();
          localObject3 = this.a;
          localObject3 = ((AccountActivity)localObject3).getResources();
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
        Object localObject3 = this.a.getApplicationContext();
        String str = "Logout Failed";
        localObject3 = Toast.makeText((Context)localObject3, str, i);
        ((Toast)localObject3).show();
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void onFinish()
  {
    super.onFinish();
    ProgressDialog localProgressDialog = this.a.b;
    if (localProgressDialog != null)
    {
      localProgressDialog = this.a.b;
      boolean bool = localProgressDialog.isShowing();
      if (bool)
      {
        localProgressDialog = this.a.b;
        localProgressDialog.dismiss();
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
        localObject2 = new java/lang/String;
        Object localObject3 = "UTF-8";
        ((String)localObject2).<init>(paramArrayOfByte, (String)localObject3);
        ((JSONObject)localObject1).<init>((String)localObject2);
        localObject2 = "status";
        int i = ((JSONObject)localObject1).getInt((String)localObject2);
        int j = 200;
        if (i == j)
        {
          localObject1 = new android/content/Intent;
          localObject2 = this.a;
          localObject2 = ((AccountActivity)localObject2).getApplicationContext();
          localObject3 = LoginActivity.class;
          ((Intent)localObject1).<init>((Context)localObject2, (Class)localObject3);
          j = 268468224;
          ((Intent)localObject1).setFlags(j);
          localObject2 = this.a;
          localObject2 = ((AccountActivity)localObject2).getApplicationContext();
          localObject3 = "user_login";
          f.a((Context)localObject2, (String)localObject3, false);
          localObject2 = this.a;
          ((AccountActivity)localObject2).startActivity((Intent)localObject1);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject1;
        Object localObject2;
        int k;
        localJSONException.printStackTrace();
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        continue;
      }
      localObject1 = this.a;
      localObject1 = ((AccountActivity)localObject1).getApplicationContext();
      localObject2 = this.a;
      localObject2 = ((AccountActivity)localObject2).getResources();
      k = 2131689694;
      localObject2 = ((Resources)localObject2).getString(k);
      k = 1;
      localObject1 = Toast.makeText((Context)localObject1, (CharSequence)localObject2, k);
      ((Toast)localObject1).show();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\AccountActivity$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */