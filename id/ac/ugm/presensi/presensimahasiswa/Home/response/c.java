package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a.a.b.h;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.ResponseHandlerInterface;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.g;
import id.ac.ugm.presensi.presensimahasiswa.a;
import id.ac.ugm.presensi.presensimahasiswa.utils.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;

public class c
  extends Fragment
{
  Button a;
  ProgressDialog b;
  private Vector c;
  private List d;
  private Gson e;
  private Activity f;
  private JSONArray g;
  private JSONArray h;
  private String i;
  private String j;
  private String k;
  private g l;
  private PersistentCookieStore m;
  
  public c()
  {
    Object localObject = new java/util/Vector;
    ((Vector)localObject).<init>();
    this.c = ((Vector)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.d = ((List)localObject);
    localObject = getActivity();
    this.f = ((Activity)localObject);
  }
  
  public c(DashboardActivity paramDashboardActivity)
  {
    Object localObject = new java/util/Vector;
    ((Vector)localObject).<init>();
    this.c = ((Vector)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.d = ((List)localObject);
    this.f = paramDashboardActivity;
  }
  
  private void a(String paramString1, String paramString2)
  {
    int n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    localObject1 = new com/loopj/android/http/RequestParams;
    ((RequestParams)localObject1).<init>();
    Object localObject3 = (TelephonyManager)getActivity().getSystemService("phone");
    localObject3 = Settings.Secure.getString(getActivity().getContentResolver(), "android_id");
    ((RequestParams)localObject1).add(paramString1, paramString2);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.l.a().get(n)).c();
    ((RequestParams)localObject1).add("dosen", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.l.a().get(n)).e();
    ((RequestParams)localObject1).add("kelas", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.l.a().get(n)).o();
    ((RequestParams)localObject1).add("pertemuan", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject4 = a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
    localObject4 = a.o;
    localObject3 = (String)localObject4;
    localObject4 = this.m;
    localAsyncHttpClient.setCookieStore((h)localObject4);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$3;
    ((c.3)localObject4).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject4);
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    localObject1 = new com/loopj/android/http/RequestParams;
    ((RequestParams)localObject1).<init>();
    Object localObject3 = (TelephonyManager)getActivity().getSystemService("phone");
    localObject3 = Settings.Secure.getString(getActivity().getContentResolver(), "android_id");
    ((RequestParams)localObject1).add(paramString2, paramString3);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    localObject2 = this.j;
    ((RequestParams)localObject1).add("username", (String)localObject2);
    localObject2 = this.k;
    ((RequestParams)localObject1).add("password", (String)localObject2);
    localObject3 = this.l.a();
    int n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).n();
    ((RequestParams)localObject1).add("user", (String)localObject3);
    localObject3 = this.l.a();
    n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).c();
    ((RequestParams)localObject1).add("dosen", (String)localObject3);
    localObject3 = this.l.a();
    n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).e();
    ((RequestParams)localObject1).add("kelas", (String)localObject3);
    localObject3 = this.l.a();
    n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).o();
    ((RequestParams)localObject1).add("pertemuan", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = a.m;
    localObject3 = (String)localObject2;
    localObject2 = this.m;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$5;
    ((c.5)localObject2).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject2);
  }
  
  private void b(String paramString1, String paramString2, String paramString3)
  {
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    localObject1 = new com/loopj/android/http/RequestParams;
    ((RequestParams)localObject1).<init>();
    Object localObject3 = (TelephonyManager)getActivity().getSystemService("phone");
    localObject3 = Settings.Secure.getString(getActivity().getContentResolver(), "android_id");
    ((RequestParams)localObject1).add(paramString2, paramString3);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    ((RequestParams)localObject1).add("hris", paramString1);
    localObject3 = this.l.a();
    int n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).n();
    ((RequestParams)localObject1).add("user", (String)localObject3);
    localObject3 = this.l.a();
    n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).c();
    ((RequestParams)localObject1).add("dosen", (String)localObject3);
    localObject3 = this.l.a();
    n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).e();
    ((RequestParams)localObject1).add("kelas", (String)localObject3);
    localObject3 = this.l.a();
    n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(n)).o();
    ((RequestParams)localObject1).add("pertemuan", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = a.n;
    localObject3 = (String)localObject2;
    localObject2 = this.m;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$6;
    ((c.6)localObject2).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject2);
  }
  
  private void c()
  {
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    RequestParams localRequestParams = new com/loopj/android/http/RequestParams;
    localRequestParams.<init>();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = a.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = a.d;
    localObject1 = (String)localObject2;
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = this.m;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$2;
    ((c.2)localObject2).<init>(this);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  private void d()
  {
    int n = 1;
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    RequestParams localRequestParams = new com/loopj/android/http/RequestParams;
    localRequestParams.<init>();
    localObject1 = new android/app/ProgressDialog;
    localObject2 = getActivity();
    ((ProgressDialog)localObject1).<init>((Context)localObject2);
    this.b = ((ProgressDialog)localObject1);
    this.b.setMessage("Loading, please wait..");
    this.b.setCancelable(false);
    this.b.setIndeterminate(n);
    this.b.show();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = a.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = a.d;
    localObject1 = (String)localObject2;
    localAsyncHttpClient.setMaxRetriesAndTimeout(n, 999);
    localObject2 = this.m;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$4;
    ((c.4)localObject2).<init>(this);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  public void a()
  {
    b();
    View localView = LayoutInflater.from(this.f).inflate(2131427382, null);
    Object localObject1 = new android/app/AlertDialog$Builder;
    Object localObject2 = this.f;
    ((AlertDialog.Builder)localObject1).<init>((Context)localObject2);
    localObject1 = ((AlertDialog.Builder)localObject1).create();
    localObject2 = ((AlertDialog)localObject1).getWindow();
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(0);
    ((Window)localObject2).setBackgroundDrawable(localColorDrawable);
    ((AlertDialog)localObject1).setView(localView);
    ((AlertDialog)localObject1).show();
    ((AlertDialog)localObject1).getWindow().setLayout(721, 821);
    this.c.add(localObject1);
  }
  
  public void a(long paramLong)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "" + paramLong;
    this.i = ((String)localObject);
    c();
  }
  
  public void a(String paramString, int paramInt)
  {
    b();
    Object localObject1 = LayoutInflater.from(this.f).inflate(2131427380, null);
    Object localObject2 = new android/app/AlertDialog$Builder;
    Object localObject3 = this.f;
    ((AlertDialog.Builder)localObject2).<init>((Context)localObject3);
    AlertDialog localAlertDialog = ((AlertDialog.Builder)localObject2).create();
    localObject2 = ((View)localObject1).findViewById(2131296309);
    Object localObject4 = localObject2;
    localObject4 = (Button)localObject2;
    localObject2 = (TextView)((View)localObject1).findViewById(2131296569);
    localObject3 = (TextView)((View)localObject1).findViewById(2131296570);
    Object localObject5 = ((View)localObject1).findViewById(2131296568);
    Object localObject6 = localObject5;
    localObject6 = (TextView)localObject5;
    ((TextView)localObject2).setText(paramString);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = paramInt + "";
    ((TextView)localObject3).setText((CharSequence)localObject2);
    localObject5 = new String[1];
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this.f, "data_local", "");
    localObject5[0] = localObject2;
    localObject2 = this.e;
    localObject3 = localObject5[0];
    localObject2 = ((g)((Gson)localObject2).fromJson((String)localObject3, g.class)).a();
    int n = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "kode_mk", 0);
    localObject2 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject2).get(n)).g();
    ((TextView)localObject6).setText((CharSequence)localObject2);
    localObject2 = localAlertDialog.getWindow();
    localObject3 = new android/graphics/drawable/ColorDrawable;
    ((ColorDrawable)localObject3).<init>(0);
    ((Window)localObject2).setBackgroundDrawable((Drawable)localObject3);
    localAlertDialog.setView((View)localObject1);
    localAlertDialog.show();
    this.c.add(localAlertDialog);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$7;
    localObject3 = this;
    localObject1 = paramString;
    ((c.7)localObject2).<init>(this, localAlertDialog, (String[])localObject5, paramInt, paramString);
    ((Button)localObject4).setOnClickListener((View.OnClickListener)localObject2);
  }
  
  public boolean a(JSONArray paramJSONArray, String paramString)
  {
    boolean bool1 = false;
    int n = 0;
    for (;;)
    {
      int i1 = paramJSONArray.length();
      if (n < i1)
      {
        String str = paramJSONArray.get(n).toString();
        boolean bool2 = str.equalsIgnoreCase(paramString);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      n += 1;
    }
  }
  
  public void b()
  {
    Object localObject = this.c;
    Iterator localIterator = ((Vector)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (AlertDialog)localIterator.next();
      boolean bool2 = ((AlertDialog)localObject).isShowing();
      if (bool2) {
        ((AlertDialog)localObject).dismiss();
      }
    }
  }
  
  public void b(String paramString, int paramInt)
  {
    int n = 741;
    b();
    Object localObject1 = LayoutInflater.from(this.f).inflate(2131427383, null);
    int i1 = 2131296392;
    Object localObject2 = (ImageView)((View)localObject1).findViewById(i1);
    Object localObject3 = "success";
    boolean bool1 = paramString.equalsIgnoreCase((String)localObject3);
    String str;
    Object localObject4;
    if (!bool1)
    {
      localObject3 = getActivity();
      str = "";
      localObject3 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b((Context)localObject3, "data_history", str);
      localObject4 = "";
      boolean bool2 = ((String)localObject3).equals(localObject4);
      if (!bool2) {
        break label355;
      }
      localObject3 = new org/json/JSONArray;
      ((JSONArray)localObject3).<init>();
      this.g = ((JSONArray)localObject3);
    }
    for (;;)
    {
      localObject3 = this.g;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append(paramInt);
      str = "";
      localObject4 = str;
      bool1 = a((JSONArray)localObject3, (String)localObject4);
      if (!bool1)
      {
        this.g.put(paramInt);
        localObject3 = getActivity();
        localObject4 = "data_history";
        str = this.g.toString();
        id.ac.ugm.presensi.presensimahasiswa.utils.f.a((Context)localObject3, (String)localObject4, str);
      }
      localObject3 = Glide.with(this);
      localObject4 = Integer.valueOf(2131623937);
      localObject3 = ((RequestManager)localObject3).load((Integer)localObject4);
      localObject4 = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE);
      localObject3 = ((RequestBuilder)localObject3).apply((RequestOptions)localObject4);
      localObject4 = new id/ac/ugm/presensi/presensimahasiswa/utils/b;
      ((b)localObject4).<init>((ImageView)localObject2, 1);
      ((RequestBuilder)localObject3).into((Target)localObject4);
      localObject2 = new android/app/AlertDialog$Builder;
      localObject3 = this.f;
      ((AlertDialog.Builder)localObject2).<init>((Context)localObject3);
      localObject2 = ((AlertDialog.Builder)localObject2).create();
      ((AlertDialog)localObject2).setView((View)localObject1);
      localObject3 = ((AlertDialog)localObject2).getWindow();
      localObject1 = new android/graphics/drawable/ColorDrawable;
      ((ColorDrawable)localObject1).<init>(0);
      ((Window)localObject3).setBackgroundDrawable((Drawable)localObject1);
      ((AlertDialog)localObject2).show();
      ((AlertDialog)localObject2).getWindow().setLayout(n, n);
      this.c.add(localObject2);
      return;
      try
      {
        label355:
        localObject4 = new org/json/JSONArray;
        ((JSONArray)localObject4).<init>((String)localObject3);
        this.g = ((JSONArray)localObject4);
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
      }
    }
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.f = paramActivity;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Object localObject1 = new com/google/gson/Gson;
    ((Gson)localObject1).<init>();
    this.e = ((Gson)localObject1);
    localObject1 = new com/loopj/android/http/PersistentCookieStore;
    Object localObject2 = getActivity();
    ((PersistentCookieStore)localObject1).<init>((Context)localObject2);
    this.m = ((PersistentCookieStore)localObject1);
    localObject2 = paramLayoutInflater.inflate(2131427391, paramViewGroup, false);
    Object localObject3 = getArguments();
    localObject1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getActivity(), "data_local", "");
    Object localObject4 = this.e;
    Class localClass = g.class;
    localObject1 = (g)((Gson)localObject4).fromJson((String)localObject1, localClass);
    this.l = ((g)localObject1);
    int n = 2131296306;
    localObject1 = (Button)((View)localObject2).findViewById(n);
    this.a = ((Button)localObject1);
    localObject1 = this.a;
    localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$1;
    ((c.1)localObject4).<init>(this);
    ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject4);
    if (localObject3 != null)
    {
      localObject1 = "name";
      boolean bool = ((Bundle)localObject3).containsKey((String)localObject1);
      if (bool)
      {
        localObject1 = "hasil";
        bool = ((Bundle)localObject3).containsKey((String)localObject1);
        if (bool)
        {
          localObject1 = ((Bundle)localObject3).getString("name");
          localObject4 = "hasil";
          localObject3 = ((Bundle)localObject3).getString((String)localObject4);
          int i1 = Integer.parseInt((String)localObject3);
          a((String)localObject1, i1);
        }
      }
    }
    return (View)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */