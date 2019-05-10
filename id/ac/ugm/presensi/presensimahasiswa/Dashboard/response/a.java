package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.e;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.g;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.util.ArrayList;
import java.util.List;

public class a
  extends Fragment
{
  List a;
  Boolean b;
  RecyclerView c;
  RecyclerView.Adapter d;
  id.ac.ugm.presensi.presensimahasiswa.Dashboard.a.a e;
  RecyclerView.LayoutManager f;
  TextView g;
  CountDownTimer h;
  private Gson i;
  
  public a()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.a = ((List)localObject);
    localObject = Boolean.valueOf(true);
    this.b = ((Boolean)localObject);
  }
  
  private void a(View paramView)
  {
    Object localObject1 = (TextView)paramView.findViewById(2131296339);
    this.g = ((TextView)localObject1);
    int j = 2131296453;
    localObject1 = (RecyclerView)paramView.findViewById(j);
    this.c = ((RecyclerView)localObject1);
    localObject1 = new android/support/v7/widget/LinearLayoutManager;
    Object localObject2 = getActivity();
    ((LinearLayoutManager)localObject1).<init>((Context)localObject2);
    this.f = ((RecyclerView.LayoutManager)localObject1);
    localObject1 = this.c;
    localObject2 = this.f;
    ((RecyclerView)localObject1).setLayoutManager((RecyclerView.LayoutManager)localObject2);
    localObject1 = new com/google/gson/Gson;
    ((Gson)localObject1).<init>();
    this.i = ((Gson)localObject1);
    localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/a$1;
    long l1 = 1000000000L;
    long l2 = 1000L;
    localObject2 = this;
    ((a.1)localObject1).<init>(this, l1, l2);
    this.h = ((CountDownTimer)localObject1);
    this.h.start();
    localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Home/a/e;
    localObject2 = getActivity();
    ((e)localObject1).<init>((Context)localObject2, "");
    this.d = ((RecyclerView.Adapter)localObject1);
    localObject1 = f.b(getActivity(), "data_local", "");
    localObject2 = this.i;
    Object localObject3 = g.class;
    localObject1 = (g)((Gson)localObject2).fromJson((String)localObject1, (Class)localObject3);
    if (localObject1 != null)
    {
      localObject2 = ((g)localObject1).a();
      int k = ((List)localObject2).size();
      if (k > 0)
      {
        localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/a/a;
        localObject3 = getActivity();
        localObject1 = ((g)localObject1).a();
        RecyclerView localRecyclerView = this.c;
        m localm = getActivity().getSupportFragmentManager();
        ((id.ac.ugm.presensi.presensimahasiswa.Dashboard.a.a)localObject2).<init>((Context)localObject3, (List)localObject1, localRecyclerView, localm);
        this.e = ((id.ac.ugm.presensi.presensimahasiswa.Dashboard.a.a)localObject2);
        localObject1 = this.c;
        localObject2 = this.e;
        ((RecyclerView)localObject1).setAdapter((RecyclerView.Adapter)localObject2);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2131427388, paramViewGroup, false);
    a(localView);
    return localView;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    CountDownTimer localCountDownTimer = this.h;
    if (localCountDownTimer != null)
    {
      localCountDownTimer = this.h;
      localCountDownTimer.cancel();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */