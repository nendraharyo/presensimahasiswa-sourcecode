package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.ProgressDialog;
import android.content.Context;
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

class AccountActivity$3
  extends AsyncHttpResponseHandler
{
  AccountActivity$3(AccountActivity paramAccountActivity) {}
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    int i = 1;
    Object localObject1 = this.a.b;
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = this.a.b;
      bool = ((ProgressDialog)localObject1).isShowing();
      if (bool)
      {
        localObject1 = this.a.b;
        ((ProgressDialog)localObject1).dismiss();
      }
    }
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
          bool = LoginActivity.b();
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
          localJSONException.printStackTrace();
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
        localObject3 = new java/lang/String;
        localObject4 = "UTF-8";
        ((String)localObject3).<init>(paramArrayOfByte, (String)localObject4);
        ((JSONObject)localObject1).<init>((String)localObject3);
        localObject3 = "status";
        int i = ((JSONObject)localObject1).getInt((String)localObject3);
        j = 200;
        if (i != j) {
          continue;
        }
        localObject3 = this.a;
        localObject3 = AccountActivity.b((AccountActivity)localObject3);
        localObject4 = "manualogout";
        boolean bool = ((String)localObject3).equalsIgnoreCase((String)localObject4);
        if (bool)
        {
          localObject3 = this.a;
          localObject4 = this.a;
          str1 = "user_username";
          str2 = "";
          localObject4 = f.b((Context)localObject4, str1, str2);
          str1 = "token";
          str1 = ((JSONObject)localObject1).getString(str1);
          str2 = "value";
          localObject1 = ((JSONObject)localObject1).getString(str2);
          AccountActivity.a((AccountActivity)localObject3, (String)localObject4, str1, (String)localObject1);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject1;
        String str2;
        localJSONException.printStackTrace();
        continue;
        Object localObject3 = this.a;
        localObject3 = ((AccountActivity)localObject3).getApplicationContext();
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str1 = "Gagal logout: ";
        localObject4 = ((StringBuilder)localObject4).append(str1);
        str1 = "status";
        int k = localJSONException.getInt(str1);
        Object localObject2 = ((StringBuilder)localObject4).append(k);
        localObject2 = ((StringBuilder)localObject2).toString();
        int j = 1;
        localObject2 = Toast.makeText((Context)localObject3, (CharSequence)localObject2, j);
        ((Toast)localObject2).show();
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        continue;
      }
      localObject3 = this.a;
      localObject4 = this.a;
      localObject4 = AccountActivity.b((AccountActivity)localObject4);
      str1 = "token";
      str1 = ((JSONObject)localObject1).getString(str1);
      str2 = "value";
      localObject1 = ((JSONObject)localObject1).getString(str2);
      AccountActivity.b((AccountActivity)localObject3, (String)localObject4, str1, (String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\AccountActivity$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */