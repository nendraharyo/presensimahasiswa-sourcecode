package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.response;

import android.view.View;
import android.view.View.OnClickListener;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.d;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.g;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.i;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.v;
import id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a.w;

class RecapActivity$3
  implements View.OnClickListener
{
  RecapActivity$3(RecapActivity paramRecapActivity) {}
  
  public void onClick(View paramView)
  {
    i locali = RecapActivity.a(this.a);
    v localv = locali.getCurrentSeriesAndPoint();
    if (localv == null) {}
    for (;;)
    {
      return;
      int i = 0;
      locali = null;
      Object localObject = RecapActivity.b(this.a);
      int j = ((d)localObject).a();
      if (i < j)
      {
        localObject = RecapActivity.c(this.a);
        w localw = ((g)localObject).a(i);
        j = localv.a();
        if (i == j) {
          j = 1;
        }
        for (;;)
        {
          localw.a(j);
          i += 1;
          break;
          int k = 0;
          localObject = null;
        }
      }
      locali = RecapActivity.a(this.a);
      locali.d();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\response\RecapActivity$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */