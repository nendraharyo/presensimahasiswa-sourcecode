package id.ac.ugm.presensi.presensimahasiswa.Home.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

class d
  extends RecyclerView.ViewHolder
{
  private final TextView a;
  private final TextView b;
  private View c;
  private Context d;
  private a e;
  
  public d(View paramView1, c paramc, Context paramContext, View paramView2)
  {
    super(paramView1);
    this.c = paramView2;
    this.d = paramContext;
    TextView localTextView = (TextView)paramView1.findViewById(2131296478);
    this.a = localTextView;
    localTextView = (TextView)paramView1.findViewById(2131296571);
    this.b = localTextView;
  }
  
  public void a(a parama)
  {
    this.e = parama;
    TextView localTextView = this.a;
    String str = parama.a();
    localTextView.setText(str);
    localTextView = this.b;
    str = parama.b();
    localTextView.setText(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */