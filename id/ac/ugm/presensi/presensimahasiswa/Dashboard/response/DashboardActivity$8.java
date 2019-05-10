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

class DashboardActivity$8
  extends AsyncHttpResponseHandler
{
  DashboardActivity$8(DashboardActivity paramDashboardActivity) {}
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    i = 1;
    localObject1 = "null";
    localObject2 = this.a.a;
    if (localObject2 != null)
    {
      localObject2 = this.a.a;
      boolean bool1 = ((ProgressDialog)localObject2).isShowing();
      if (bool1)
      {
        localObject2 = this.a.a;
        ((ProgressDialog)localObject2).dismiss();
      }
    }
    if (paramArrayOfByte != null) {}
    try
    {
      localObject2 = this.a;
      localObject2 = DashboardActivity.f((DashboardActivity)localObject2);
      localObject2 = (c)localObject2;
      localObject5 = "failed";
      localObject8 = this.a;
      j = DashboardActivity.h((DashboardActivity)localObject8);
      ((c)localObject2).b((String)localObject5, j);
      localObject5 = new java/lang/String;
      localObject2 = "UTF-8";
      ((String)localObject5).<init>(paramArrayOfByte, (String)localObject2);
    }
    catch (JSONException localJSONException1)
    {
      for (;;)
      {
        try
        {
          Object localObject5;
          boolean bool2 = DashboardActivity.c();
          if (!bool2)
          {
            localObject5 = this.a;
            localObject5 = ((DashboardActivity)localObject5).getApplicationContext();
            localObject8 = this.a;
            localObject8 = ((DashboardActivity)localObject8).getResources();
            k = 2131689796;
            localObject8 = ((Resources)localObject8).getString(k);
            k = 1;
            localObject5 = Toast.makeText((Context)localObject5, (CharSequence)localObject8, k);
            ((Toast)localObject5).show();
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          Object localObject6 = "failed";
          localObject8 = this.a;
          j = DashboardActivity.h((DashboardActivity)localObject8);
          ((c)localObject2).b((String)localObject6, j);
          continue;
          localJSONException1 = localJSONException1;
          localObject6 = localJSONException1;
          localObject3 = (c)DashboardActivity.f(this.a);
          localObject8 = "failed";
          try
          {
            localObject9 = this.a;
            k = DashboardActivity.h((DashboardActivity)localObject9);
            ((c)localObject3).b((String)localObject8, k);
          }
          catch (JSONException localJSONException2)
          {
            Object localObject9;
            Object localObject4;
            localJSONException2.printStackTrace();
            continue;
          }
          ((JSONException)localObject6).printStackTrace();
          localObject3 = this.a.getApplicationContext();
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          localObject9 = "Errors: ";
          localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
          localObject1 = (String)localObject1;
          localObject3 = Toast.makeText((Context)localObject3, (CharSequence)localObject1, i);
          ((Toast)localObject3).show();
          ((JSONException)localObject6).printStackTrace();
          continue;
          localObject6 = this.a;
          localObject6 = ((DashboardActivity)localObject6).getApplicationContext();
          localObject8 = this.a;
          localObject8 = ((DashboardActivity)localObject8).getResources();
          k = 2131689693;
          localObject8 = ((Resources)localObject8).getString(k);
          k = 1;
          localObject6 = Toast.makeText((Context)localObject6, (CharSequence)localObject8, k);
          ((Toast)localObject6).show();
        }
        catch (IOException localIOException)
        {
          Object localObject3;
          localIOException.printStackTrace();
          localObject7 = "failed";
          localObject8 = this.a;
          int j = DashboardActivity.h((DashboardActivity)localObject8);
          ((c)localObject3).b((String)localObject7, j);
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException1)
    {
      for (;;)
      {
        int k;
        localObject7 = localUnsupportedEncodingException1;
        localObject4 = (c)DashboardActivity.f(this.a);
        Object localObject8 = "failed";
        try
        {
          localObject9 = this.a;
          k = DashboardActivity.h((DashboardActivity)localObject9);
          ((c)localObject4).b((String)localObject8, k);
        }
        catch (JSONException localJSONException3)
        {
          for (;;)
          {
            localJSONException3.printStackTrace();
          }
        }
        localObject4 = this.a.getApplicationContext();
        localObject8 = new java/lang/StringBuilder;
        ((StringBuilder)localObject8).<init>();
        localObject9 = "Error - ";
        localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
        localObject1 = (String)localObject1;
        localObject4 = Toast.makeText((Context)localObject4, (CharSequence)localObject1, i);
        ((Toast)localObject4).show();
        ((UnsupportedEncodingException)localObject7).printStackTrace();
      }
    }
    try
    {
      localObject2 = new org/json/JSONObject;
      localObject1 = new java/lang/String;
      localObject8 = "UTF-8";
      ((String)localObject1).<init>(paramArrayOfByte, (String)localObject8);
      ((JSONObject)localObject2).<init>((String)localObject1);
      localObject1 = "is_success";
      ((JSONObject)localObject2).getJSONObject((String)localObject1);
      localObject1 = "data";
      ((JSONObject)localObject2).getJSONObject((String)localObject1);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException2)
    {
      localObject1 = localObject7;
      localObject7 = localUnsupportedEncodingException2;
      break label550;
    }
    catch (JSONException localJSONException4)
    {
      localObject1 = localObject7;
      localObject7 = localJSONException4;
      break label336;
    }
    localObject2 = this.a;
    localObject2 = DashboardActivity.f((DashboardActivity)localObject2);
    localObject2 = (c)localObject2;
    localObject5 = "failed";
    localObject8 = this.a;
    j = DashboardActivity.h((DashboardActivity)localObject8);
    ((c)localObject2).b((String)localObject5, j);
  }
  
  public void onFinish()
  {
    super.onFinish();
    ProgressDialog localProgressDialog = this.a.a;
    if (localProgressDialog != null)
    {
      localProgressDialog = this.a.a;
      boolean bool = localProgressDialog.isShowing();
      if (bool)
      {
        localProgressDialog = this.a.a;
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
        str = new java/lang/String;
        localObject2 = "UTF-8";
        str.<init>(paramArrayOfByte, (String)localObject2);
        ((JSONObject)localObject1).<init>(str);
        str = "status";
        int i = ((JSONObject)localObject1).getInt(str);
        int j = 200;
        if (i == j)
        {
          localObject1 = this.a;
          localObject1 = DashboardActivity.f((DashboardActivity)localObject1);
          localObject1 = (c)localObject1;
          str = "success";
          localObject2 = this.a;
          k = DashboardActivity.h((DashboardActivity)localObject2);
          ((c)localObject1).b(str, k);
          return;
        }
      }
      catch (JSONException localJSONException3)
      {
        localJSONException3.printStackTrace();
        Object localObject1 = (c)DashboardActivity.f(this.a);
        str = "failed";
        try
        {
          localObject2 = this.a;
          k = DashboardActivity.h((DashboardActivity)localObject2);
          ((c)localObject1).b(str, k);
        }
        catch (JSONException localJSONException1)
        {
          localJSONException1.printStackTrace();
        }
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Object localObject2;
        int k;
        localUnsupportedEncodingException.printStackTrace();
        c localc = (c)DashboardActivity.f(this.a);
        String str = "failed";
        try
        {
          localObject2 = this.a;
          k = DashboardActivity.h((DashboardActivity)localObject2);
          localc.b(str, k);
        }
        catch (JSONException localJSONException2)
        {
          localJSONException2.printStackTrace();
        }
        continue;
      }
      localObject1 = this.a;
      localObject1 = DashboardActivity.f((DashboardActivity)localObject1);
      localObject1 = (c)localObject1;
      str = "failed";
      localObject2 = this.a;
      k = DashboardActivity.h((DashboardActivity)localObject2);
      ((c)localObject1).b(str, k);
      localObject1 = this.a;
      ((DashboardActivity)localObject1).d();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */