package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class DashboardActivity$6
  extends AsyncHttpResponseHandler
{
  DashboardActivity$6(DashboardActivity paramDashboardActivity) {}
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    i = 1;
    localObject1 = "null";
    localObject2 = this.a.a;
    if (localObject2 != null)
    {
      localObject2 = this.a.a;
      bool = ((ProgressDialog)localObject2).isShowing();
      if (bool)
      {
        localObject2 = this.a.a;
        ((ProgressDialog)localObject2).dismiss();
      }
    }
    localObject2 = DashboardActivity.g(this.a);
    localObject5 = "dosen";
    bool = ((String)localObject2).equalsIgnoreCase((String)localObject5);
    if (!bool)
    {
      localObject2 = (c)DashboardActivity.f(this.a);
      localObject5 = "failed";
    }
    try
    {
      localObject6 = this.a;
      j = DashboardActivity.h((DashboardActivity)localObject6);
      ((c)localObject2).b((String)localObject5, j);
    }
    catch (JSONException localJSONException2)
    {
      for (;;)
      {
        try
        {
          localObject5 = new java/lang/String;
          localObject2 = "UTF-8";
          ((String)localObject5).<init>(paramArrayOfByte, (String)localObject2);
        }
        catch (JSONException localJSONException2)
        {
          try
          {
            bool = DashboardActivity.c();
            if (!bool)
            {
              Object localObject3 = this.a;
              localObject3 = ((DashboardActivity)localObject3).getApplicationContext();
              localObject5 = this.a;
              localObject5 = ((DashboardActivity)localObject5).getResources();
              j = 2131689796;
              localObject5 = ((Resources)localObject5).getString(j);
              j = 1;
              localObject3 = Toast.makeText((Context)localObject3, (CharSequence)localObject5, j);
              ((Toast)localObject3).show();
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
            continue;
            localJSONException2 = localJSONException2;
            localObject5 = localObject1;
            localJSONException2.printStackTrace();
            localObject1 = this.a.getApplicationContext();
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            str = "Errors: ";
            localObject6 = ((StringBuilder)localObject6).append(str);
            localObject5 = (String)localObject5;
            localObject5 = Toast.makeText((Context)localObject1, (CharSequence)localObject5, i);
            ((Toast)localObject5).show();
            localJSONException2.printStackTrace();
            continue;
            Object localObject4 = this.a;
            localObject4 = ((DashboardActivity)localObject4).getApplicationContext();
            localObject5 = this.a;
            localObject5 = ((DashboardActivity)localObject5).getResources();
            int j = 2131689693;
            localObject5 = ((Resources)localObject5).getString(j);
            j = 1;
            localObject4 = Toast.makeText((Context)localObject4, (CharSequence)localObject5, j);
            ((Toast)localObject4).show();
          }
          catch (IOException localIOException)
          {
            localIOException.printStackTrace();
          }
          continue;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          localObject5 = this.a.getApplicationContext();
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          String str = "Error - ";
          localObject6 = ((StringBuilder)localObject6).append(str);
          localObject1 = (String)localObject1;
          localObject5 = Toast.makeText((Context)localObject5, (CharSequence)localObject1, i);
          ((Toast)localObject5).show();
          localUnsupportedEncodingException1.printStackTrace();
          continue;
        }
        try
        {
          localObject2 = new org/json/JSONObject;
          localObject1 = new java/lang/String;
          localObject6 = "UTF-8";
          ((String)localObject1).<init>(paramArrayOfByte, (String)localObject6);
          ((JSONObject)localObject2).<init>((String)localObject1);
          localObject1 = "is_success";
          ((JSONObject)localObject2).getJSONObject((String)localObject1);
          localObject1 = "data";
          ((JSONObject)localObject2).getJSONObject((String)localObject1);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          localObject1 = localObject5;
          continue;
        }
        catch (JSONException localJSONException3)
        {
          continue;
        }
        localJSONException1 = localJSONException1;
        localJSONException1.printStackTrace();
      }
    }
    if (paramArrayOfByte == null) {}
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
        localObject2 = new java/lang/String;
        str1 = "UTF-8";
        ((String)localObject2).<init>(paramArrayOfByte, str1);
        ((JSONObject)localObject1).<init>((String)localObject2);
        localObject2 = "status";
        int i = ((JSONObject)localObject1).getInt((String)localObject2);
        int j = 200;
        if (i != j) {
          continue;
        }
        localObject2 = this.a;
        localObject2 = DashboardActivity.g((DashboardActivity)localObject2);
        str1 = "dosen";
        boolean bool = ((String)localObject2).equalsIgnoreCase(str1);
        if (bool)
        {
          localObject2 = this.a;
          str1 = "token";
          str1 = ((JSONObject)localObject1).getString(str1);
          str2 = "value";
          localObject1 = ((JSONObject)localObject1).getString(str2);
          DashboardActivity.a((DashboardActivity)localObject2, str1, (String)localObject1);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject1;
        Object localObject2;
        String str1;
        String str2;
        localJSONException.printStackTrace();
        continue;
        DashboardActivity localDashboardActivity = this.a;
        localDashboardActivity.d();
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        continue;
      }
      localObject2 = this.a;
      str1 = "token";
      str1 = ((JSONObject)localObject1).getString(str1);
      str2 = "value";
      localObject1 = ((JSONObject)localObject1).getString(str2);
      DashboardActivity.b((DashboardActivity)localObject2, str1, (String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */