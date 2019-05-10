package id.ac.ugm.presensi.presensimahasiswa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.d;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;

public class b
  extends AppCompatActivity
{
  public void onNewIntent(Intent paramIntent)
  {
    int i = Common.a(paramIntent, this);
    int j = -1;
    if (i != j)
    {
      j = -2;
      if (i != j) {}
    }
    else
    {
      Intent localIntent = new android/content/Intent;
      Class localClass = d.class;
      localIntent.<init>(this, localClass);
      startActivity(localIntent);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    Common.b(this);
  }
  
  public void onResume()
  {
    super.onResume();
    Common.a(this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */