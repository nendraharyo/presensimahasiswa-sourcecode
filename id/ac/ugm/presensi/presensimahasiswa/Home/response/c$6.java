package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.support.v4.app.i;
import android.widget.Toast;
import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class c$6
  extends AsyncHttpResponseHandler
{
  c$6(c paramc) {}
  
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
          localObject1 = new android/app/AlertDialog$Builder;
          localObject2 = this.a;
          localObject2 = ((c)localObject2).getActivity();
          ((AlertDialog.Builder)localObject1).<init>((Context)localObject2);
          localObject2 = this.a;
          localObject2 = ((c)localObject2).getActivity();
          localObject2 = ((i)localObject2).getResources();
          k = 2131689787;
          localObject2 = ((Resources)localObject2).getString(k);
          ((AlertDialog.Builder)localObject1).setMessage((CharSequence)localObject2);
          j = 0;
          localObject2 = null;
          ((AlertDialog.Builder)localObject1).setCancelable(false);
          localObject2 = "Tidak";
          localObject3 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$6$1;
          ((c.6.1)localObject3).<init>(this);
          ((AlertDialog.Builder)localObject1).setNegativeButton((CharSequence)localObject2, (DialogInterface.OnClickListener)localObject3);
          localObject2 = "Ya";
          localObject3 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$6$2;
          ((c.6.2)localObject3).<init>(this);
          ((AlertDialog.Builder)localObject1).setPositiveButton((CharSequence)localObject2, (DialogInterface.OnClickListener)localObject3);
          localObject1 = ((AlertDialog.Builder)localObject1).create();
          ((AlertDialog)localObject1).show();
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
      localObject1 = ((c)localObject1).getActivity();
      localObject2 = this.a;
      localObject2 = ((c)localObject2).getResources();
      k = 2131689694;
      localObject2 = ((Resources)localObject2).getString(k);
      k = 1;
      localObject1 = Toast.makeText((Context)localObject1, (CharSequence)localObject2, k);
      ((Toast)localObject1).show();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */