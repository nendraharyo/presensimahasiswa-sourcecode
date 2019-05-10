package id.ac.ugm.presensi.presensimahasiswa.Home.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class c
  extends RecyclerView.Adapter
{
  private final LayoutInflater a;
  private final List b;
  private final Context c;
  private final View d;
  
  public c(Context paramContext, List paramList, View paramView)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    this.a = localLayoutInflater;
    this.b = paramList;
    this.c = paramContext;
    this.d = paramView;
  }
  
  public d a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView1 = this.a.inflate(2131427392, paramViewGroup, false);
    d locald = new id/ac/ugm/presensi/presensimahasiswa/Home/a/d;
    Context localContext = this.c;
    View localView2 = this.d;
    locald.<init>(localView1, this, localContext, localView2);
    return locald;
  }
  
  public void a(d paramd, int paramInt)
  {
    a locala = (a)this.b.get(paramInt);
    paramd.a(locala);
  }
  
  public int getItemCount()
  {
    return this.b.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */