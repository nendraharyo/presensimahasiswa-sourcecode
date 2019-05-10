package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.response;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.d;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.e;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.g;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.i;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.w;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.a;
import java.io.Serializable;

public class RecapActivity
  extends a
{
  private static int[] a;
  private d b;
  private g c;
  private Button d;
  private i e;
  
  static
  {
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = -16711936;
    arrayOfInt[1] = -16776961;
    arrayOfInt[2] = -65281;
    arrayOfInt[3] = -16711681;
    a = arrayOfInt;
  }
  
  public RecapActivity()
  {
    Object localObject = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/d;
    ((d)localObject).<init>("");
    this.b = ((d)localObject);
    localObject = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/g;
    ((g)localObject).<init>();
    this.c = ((g)localObject);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    int i = -1;
    super.onCreate(paramBundle);
    setContentView(2131427361);
    int j = 2131296414;
    Object localObject1 = (LinearLayout)findViewById(j);
    int k = 2131296431;
    Object localObject2 = (TextView)findViewById(k);
    Object localObject3 = (Button)findViewById(2131296449);
    this.d = ((Button)localObject3);
    int m = 2131296433;
    localObject3 = (TextView)findViewById(m);
    int i1 = 2131296427;
    Object localObject4 = (TextView)findViewById(i1);
    Object localObject5 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/response/RecapActivity$1;
    ((RecapActivity.1)localObject5).<init>(this);
    ((LinearLayout)localObject1).setOnClickListener((View.OnClickListener)localObject5);
    localObject1 = this.d;
    localObject5 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/response/RecapActivity$2;
    ((RecapActivity.2)localObject5).<init>(this);
    ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject5);
    double d1 = 1.0D;
    double d2 = 0.0D;
    localObject1 = "7";
    for (;;)
    {
      try
      {
        double d3 = Double.parseDouble((String)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        int i2 = (int)d3;
        localObject1 = ((StringBuilder)localObject1).append(i2);
        String str = "";
        localObject1 = str;
        ((TextView)localObject2).setText((CharSequence)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        k = (int)d1;
        localObject1 = k + "";
        ((TextView)localObject3).setText((CharSequence)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        k = (int)d2;
        localObject1 = ((StringBuilder)localObject1).append(k);
        localObject2 = "";
        localObject1 = (String)localObject2;
        ((TextView)localObject4).setText((CharSequence)localObject1);
        localObject1 = this.e;
        if (localObject1 == null)
        {
          j = 2131296322;
          localObject1 = (LinearLayout)findViewById(j);
          localObject2 = this.b;
          localObject3 = this.c;
          localObject2 = e.a(this, (d)localObject2, (g)localObject3);
          this.e = ((i)localObject2);
          localObject2 = this.c;
          m = 1;
          ((g)localObject2).e(m);
          localObject2 = this.e;
          localObject3 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/response/RecapActivity$3;
          ((RecapActivity.3)localObject3).<init>(this);
          ((i)localObject2).setOnClickListener((View.OnClickListener)localObject3);
          localObject2 = this.e;
          localObject3 = new android/view/ViewGroup$LayoutParams;
          ((ViewGroup.LayoutParams)localObject3).<init>(i, i);
          ((LinearLayout)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
          this.b.a("Masuk ", d3);
          localObject1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/w;
          ((w)localObject1).<init>();
          localObject2 = a;
          int n = this.b.a() + -1;
          i1 = a.length;
          n %= i1;
          k = localObject2[n];
          ((w)localObject1).a(k);
          this.c.a((w)localObject1);
          this.b.a("Sakit ", d1);
          localObject1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/w;
          ((w)localObject1).<init>();
          localObject2 = a;
          n = this.b.a() + -1;
          i1 = a.length;
          n %= i1;
          k = localObject2[n];
          ((w)localObject1).a(k);
          this.c.a((w)localObject1);
          this.b.a("Alpha ", d2);
          localObject1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/w;
          ((w)localObject1).<init>();
          localObject2 = a;
          localObject3 = this.b;
          n = ((d)localObject3).a() + -1;
          localObject4 = a;
          i1 = localObject4.length;
          n %= i1;
          k = localObject2[n];
          ((w)localObject1).a(k);
          localObject2 = this.c;
          n = 2131099688;
          ((g)localObject2).b(n);
          localObject2 = this.c;
          ((g)localObject2).a((w)localObject1);
          localObject1 = this.e;
          ((i)localObject1).d();
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        continue;
      }
      localObject1 = this.e;
      ((i)localObject1).d();
    }
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    Object localObject = (d)paramBundle.getSerializable("current_series");
    this.b = ((d)localObject);
    localObject = (g)paramBundle.getSerializable("current_renderer");
    this.c = ((g)localObject);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = this.b;
    paramBundle.putSerializable("current_series", (Serializable)localObject);
    localObject = this.c;
    paramBundle.putSerializable("current_renderer", (Serializable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\response\RecapActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */