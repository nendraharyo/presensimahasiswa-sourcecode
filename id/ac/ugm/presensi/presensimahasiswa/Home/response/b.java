package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.a;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.c;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.e;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.util.ArrayList;
import java.util.List;

public class b
  extends Fragment
{
  List a;
  Boolean b;
  RecyclerView c;
  RecyclerView.Adapter d;
  c e;
  RecyclerView.LayoutManager f;
  private Gson g;
  
  public b()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.a = ((List)localObject);
    localObject = Boolean.valueOf(true);
    this.b = ((Boolean)localObject);
  }
  
  private void a()
  {
    Object localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Home/a/e;
    Object localObject2 = getActivity();
    ((e)localObject1).<init>((Context)localObject2, "");
    this.d = ((RecyclerView.Adapter)localObject1);
    localObject1 = (id.ac.ugm.presensi.presensimahasiswa.Home.a.b)this.g.fromJson("{\"message\":\"The request has succeeded\",\"status\":200,\"heading\":\"Success\",\"content\":[{\"dosen_id\":\"vw4DhUXuQMHJQRd_dXxepeUTP75SR8JB3stqmG3sCUQ=\",\"dosen_nama\":\"Widyawan, S.T., M.Sc., Ph.D.\",\"mk_kelas_id\":\"Li-11yB1o2BEKZnHnTHDjfuEgG1NbrrMQyClgwXUMYA=\",\"matakuliah_kode\":\"Block A.1\",\"mk_rumpun_nama_ID\":\"Being A Medical Student and Locomotor System\",\"mk_rumpun_sks\":\"6\",\"kelas\":\"A\",\"pertemuan_ke\":\"2\",\"mulai\":\"2018-11-13 08:00:00\",\"selesai\":\"2018-11-13 10:00:00\",\"ruang_nama\":\"S1.101\",\"user_id\":\"JjodD4Ke1byY8AbIUXgzBy3TKkfoAR5wziPBkzOSJWE=\",\"pertemuan_id\":\"XaYFVQMFTV_CE_WVXdU-vlLijCoup9qkkc5Y8g7bjbc=\",\"server_time\":\"2018-12-10 09:42:45\"},{\"dosen_id\":\"j0aL-q0vJgu2OkoQvviwAstEG2eosa-6YUpwsR9dwoc=\",\"dosen_nama\":\"Triyogatama Wahyu Widodo, M.Kom.\",\"mk_kelas_id\":\"ZZ0jdyejSDENy2F11kqm4c8V9pTGj2cm5Zju3SeXWAA=\",\"matakuliah_kode\":\"MK BD5gtO\",\"mk_rumpun_nama_ID\":\"Sistem Terdistribusi\",\"mk_rumpun_sks\":\"3\",\"kelas\":\"B\",\"pertemuan_ke\":\"2\",\"mulai\":\"2018-11-13 08:00:00\",\"selesai\":\"2018-11-13 09:00:00\",\"ruang_nama\":\"S1.103\",\"user_id\":\"3IloFAA1KdtLxXn83CfjfVStd8sqHsPzGvFIygTzS1Q=\",\"pertemuan_id\":\"hJeolCTksWg5VUQDmcs3sUKX6lI3NqyT8cffTepTqFU=\",\"server_time\":\"2018-12-10 09:42:45\"}]}", id.ac.ugm.presensi.presensimahasiswa.Home.a.b.class);
    localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Home/a/c;
    localObject2 = getActivity();
    List localList = this.a;
    RecyclerView localRecyclerView = this.c;
    ((c)localObject1).<init>((Context)localObject2, localList, localRecyclerView);
    this.e = ((c)localObject1);
    localObject1 = this.c;
    localObject2 = this.e;
    ((RecyclerView)localObject1).setAdapter((RecyclerView.Adapter)localObject2);
  }
  
  public void a(int paramInt, String paramString)
  {
    AlertDialog.Builder localBuilder = null;
    Object localObject1 = Boolean.valueOf(false);
    this.b = ((Boolean)localObject1);
    int i = 0;
    Object localObject2 = null;
    localObject1 = this.a;
    int j = ((List)localObject1).size();
    Object localObject3;
    String str;
    boolean bool;
    if (i < j)
    {
      localObject1 = ((a)this.a.get(i)).b();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(paramInt);
      str = "";
      localObject3 = str;
      bool = ((String)localObject1).equalsIgnoreCase((String)localObject3);
      if (bool)
      {
        bool = true;
        localObject1 = Boolean.valueOf(bool);
        this.b = ((Boolean)localObject1);
      }
    }
    else
    {
      localObject1 = this.b;
      bool = ((Boolean)localObject1).booleanValue();
      if (bool) {
        break label257;
      }
      List localList = this.a;
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Home/a/a;
      i = 33;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = paramInt + "";
      str = "1231";
      ((a)localObject1).<init>(0, i, (String)localObject3, str, paramString);
      localList.add(0, localObject1);
      localObject1 = this.e;
      ((c)localObject1).notifyItemInserted(0);
    }
    for (;;)
    {
      return;
      localObject1 = this.g;
      localObject3 = this.a;
      ((Gson)localObject1).toJson(localObject3);
      int k = i + 1;
      i = k;
      break;
      label257:
      localObject1 = new android/app/AlertDialog$Builder;
      localObject2 = getActivity();
      ((AlertDialog.Builder)localObject1).<init>((Context)localObject2);
      ((AlertDialog.Builder)localObject1).setTitle("Duplikasi data.");
      localBuilder = ((AlertDialog.Builder)localObject1).setMessage("Presensi mahasiswa telah tersimpan.").setCancelable(false);
      localObject2 = "OK";
      localObject3 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/b$1;
      ((b.1)localObject3).<init>(this);
      localBuilder.setPositiveButton((CharSequence)localObject2, (DialogInterface.OnClickListener)localObject3);
      ((AlertDialog.Builder)localObject1).show();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2131427389, paramViewGroup, false);
    int i = 2131296338;
    TextView localTextView = (TextView)localView.findViewById(i);
    int j = 2131296477;
    Object localObject1 = (RecyclerView)localView.findViewById(j);
    this.c = ((RecyclerView)localObject1);
    this.c.setHasFixedSize(true);
    localObject1 = new android/support/v7/widget/LinearLayoutManager;
    Object localObject2 = getActivity();
    ((LinearLayoutManager)localObject1).<init>((Context)localObject2);
    this.f = ((RecyclerView.LayoutManager)localObject1);
    localObject1 = this.c;
    localObject2 = this.f;
    ((RecyclerView)localObject1).setLayoutManager((RecyclerView.LayoutManager)localObject2);
    localObject1 = new com/google/gson/Gson;
    ((Gson)localObject1).<init>();
    this.g = ((Gson)localObject1);
    a();
    localObject1 = getActivity().getIntent();
    localObject2 = "ctn";
    boolean bool2 = ((Intent)localObject1).hasExtra((String)localObject2);
    String str1;
    if (bool2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("data ===> ");
      str1 = "ctn";
      localObject1 = ((Intent)localObject1).getStringExtra(str1);
      localObject1 = (String)localObject1;
      localTextView.setText((CharSequence)localObject1);
    }
    for (;;)
    {
      return localView;
      localObject1 = getActivity().getApplicationContext();
      str1 = "";
      localObject1 = f.b((Context)localObject1, "user_id", str1);
      localObject2 = "";
      boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (!bool1)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("data ===> ");
        localObject2 = getActivity().getApplicationContext();
        str1 = "user_id";
        String str2 = "---";
        localObject2 = f.b((Context)localObject2, str1, str2);
        localObject1 = (String)localObject2;
        localTextView.setText((CharSequence)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */