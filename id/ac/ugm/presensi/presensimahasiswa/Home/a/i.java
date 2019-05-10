package id.ac.ugm.presensi.presensimahasiswa.Home.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

public class i
  extends RecyclerView.Adapter
{
  List a;
  private LayoutInflater b;
  private Context c;
  
  public i(Context paramContext, List paramList)
  {
    Object localObject = Collections.emptyList();
    this.a = ((List)localObject);
    this.c = paramContext;
    localObject = LayoutInflater.from(paramContext);
    this.b = ((LayoutInflater)localObject);
    this.a = paramList;
  }
  
  public i.a a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = this.b.inflate(2131427397, paramViewGroup, false);
    i.a locala = new id/ac/ugm/presensi/presensimahasiswa/Home/a/i$a;
    locala.<init>(this, localView);
    return locala;
  }
  
  public void a(i.a parama, int paramInt)
  {
    Object localObject = (h)this.a.get(paramInt);
    TextView localTextView = parama.a;
    localObject = ((h)localObject).a();
    localTextView.setText((CharSequence)localObject);
  }
  
  public int getItemCount()
  {
    return this.a.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\a\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */