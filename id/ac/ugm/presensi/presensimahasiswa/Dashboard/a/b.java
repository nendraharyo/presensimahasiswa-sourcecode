package id.ac.ugm.presensi.presensimahasiswa.Dashboard.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.f;

public class b
  extends RecyclerView.ViewHolder
{
  public TextView a;
  public TextView b;
  public TextView c;
  public TextView d;
  public TextView e;
  private final TextView f;
  private final TextView g;
  private final TextView h;
  private final TextView i;
  private final TextView j;
  private final TextView k;
  private final LinearLayout l;
  private final LinearLayout m;
  private View n;
  private Context o;
  private f p;
  
  public b(View paramView1, a parama, Context paramContext, View paramView2)
  {
    super(paramView1);
    this.n = paramView2;
    this.o = paramContext;
    Object localObject = (TextView)paramView1.findViewById(2131296450);
    this.b = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296429);
    this.f = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296430);
    this.g = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296400);
    this.c = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296432);
    this.d = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296428);
    this.e = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296437);
    this.i = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296573);
    this.a = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296572);
    this.h = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296438);
    this.j = ((TextView)localObject);
    localObject = (TextView)paramView1.findViewById(2131296439);
    this.k = ((TextView)localObject);
    localObject = (LinearLayout)paramView1.findViewById(2131296385);
    this.l = ((LinearLayout)localObject);
    localObject = (LinearLayout)paramView1.findViewById(2131296580);
    this.m = ((LinearLayout)localObject);
  }
  
  public void a(f paramf)
  {
    int i1 = 16;
    int i2 = 11;
    this.p = paramf;
    TextView localTextView = this.b;
    String str = paramf.d();
    localTextView.setText(str);
    localTextView = this.f;
    str = paramf.g();
    localTextView.setText(str);
    localTextView = this.i;
    str = paramf.f();
    localTextView.setText(str);
    localTextView = this.g;
    str = paramf.h();
    localTextView.setText(str);
    localTextView = this.d;
    str = paramf.m();
    localTextView.setText(str);
    localTextView = this.e;
    str = paramf.i();
    localTextView.setText(str);
    localTextView = this.c;
    str = paramf.j();
    localTextView.setText(str);
    localTextView = this.j;
    str = paramf.k().substring(i2, i1);
    localTextView.setText(str);
    localTextView = this.k;
    str = paramf.l().substring(i2, i1);
    localTextView.setText(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */