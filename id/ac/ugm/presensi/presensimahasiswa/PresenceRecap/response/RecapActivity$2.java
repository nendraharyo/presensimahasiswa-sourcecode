package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.response;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import id.ac.ugm.presensi.presensimahasiswa.Notify.response.PresenceActivity;

class RecapActivity$2
  implements View.OnClickListener
{
  RecapActivity$2(RecapActivity paramRecapActivity) {}
  
  public void onClick(View paramView)
  {
    Intent localIntent = new android/content/Intent;
    Context localContext = this.a.getApplicationContext();
    localIntent.<init>(localContext, PresenceActivity.class);
    this.a.startActivity(localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\response\RecapActivity$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */