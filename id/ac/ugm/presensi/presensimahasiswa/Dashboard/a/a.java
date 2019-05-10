package id.ac.ugm.presensi.presensimahasiswa.Dashboard.a;

import android.content.Context;
import android.support.v4.app.m;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.f;
import java.util.List;

public class a
  extends RecyclerView.Adapter
{
  private final LayoutInflater a;
  private final List b;
  private final Context c;
  private final View d;
  private m e;
  
  public a(Context paramContext, List paramList, View paramView, m paramm)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    this.a = localLayoutInflater;
    this.b = paramList;
    this.c = paramContext;
    this.d = paramView;
    this.e = paramm;
  }
  
  public b a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView1 = this.a.inflate(2131427393, paramViewGroup, false);
    b localb = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/a/b;
    Context localContext = this.c;
    View localView2 = this.d;
    localb.<init>(localView1, this, localContext, localView2);
    return localb;
  }
  
  public void a(b paramb, int paramInt)
  {
    f localf = (f)this.b.get(paramInt);
    paramb.a(localf);
    View localView = paramb.itemView;
    a.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/a/a$1;
    local1.<init>(this, paramInt, localf);
    localView.setOnClickListener(local1);
  }
  
  public int getItemCount()
  {
    return this.b.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */