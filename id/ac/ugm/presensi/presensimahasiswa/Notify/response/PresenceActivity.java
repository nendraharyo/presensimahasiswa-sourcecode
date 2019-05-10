package id.ac.ugm.presensi.presensimahasiswa.Notify.response;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.google.gson.Gson;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.b;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.e;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.a;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.util.ArrayList;
import java.util.List;

public class PresenceActivity
  extends a
{
  List a;
  Boolean b;
  RecyclerView c;
  RecyclerView.Adapter d;
  RecyclerView.LayoutManager e;
  private Gson f;
  
  public PresenceActivity()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.a = ((List)localObject);
    localObject = Boolean.valueOf(true);
    this.b = ((Boolean)localObject);
  }
  
  private void a()
  {
    Object localObject = new id/ac/ugm/presensi/presensimahasiswa/Home/a/e;
    ((e)localObject).<init>(this, "");
    this.d = ((RecyclerView.Adapter)localObject);
    localObject = f.b(this, "data_local", "");
    String str = "";
    boolean bool = ((String)localObject).equalsIgnoreCase(str);
    if (bool) {
      localObject = "{\"history\":[],\"totalPage\":0}";
    }
    localObject = (b)this.f.fromJson((String)localObject, b.class);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131427360);
    Object localObject1 = (LinearLayout)findViewById(2131296414);
    Object localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Notify/response/PresenceActivity$1;
    ((PresenceActivity.1)localObject2).<init>(this);
    ((LinearLayout)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    localObject1 = (RecyclerView)findViewById(2131296453);
    this.c = ((RecyclerView)localObject1);
    localObject1 = new android/support/v7/widget/LinearLayoutManager;
    ((LinearLayoutManager)localObject1).<init>(this);
    this.e = ((RecyclerView.LayoutManager)localObject1);
    localObject1 = this.c;
    localObject2 = this.e;
    ((RecyclerView)localObject1).setLayoutManager((RecyclerView.LayoutManager)localObject2);
    localObject1 = new com/google/gson/Gson;
    ((Gson)localObject1).<init>();
    this.f = ((Gson)localObject1);
    a();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Notify\response\PresenceActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */