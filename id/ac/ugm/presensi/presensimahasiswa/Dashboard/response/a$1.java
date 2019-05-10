package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.os.CountDownTimer;
import android.widget.TextView;
import id.ac.ugm.presensi.presensimahasiswa.utils.e;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class a$1
  extends CountDownTimer
{
  a$1(a parama, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public void onFinish() {}
  
  public void onTick(long paramLong)
  {
    int i = 7;
    int j = 5;
    int k = 2;
    int m = 1;
    Calendar localCalendar = Calendar.getInstance();
    Object localObject1 = "";
    int n = localCalendar.get(i);
    if (k == n) {
      localObject1 = "Senin";
    }
    for (;;)
    {
      new SimpleDateFormat("dd-MM-yyyy");
      new SimpleDateFormat("HH:mm:ss");
      TextView localTextView = this.a.g;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(", ");
      int i1 = localCalendar.get(j);
      localObject1 = ((StringBuilder)localObject1).append(i1).append(" ");
      localObject2 = e.a(localCalendar.get(k));
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" ");
      int i2 = localCalendar.get(m);
      localObject1 = i2;
      localTextView.setText((CharSequence)localObject1);
      return;
      i1 = 3;
      if (i1 == n)
      {
        localObject1 = "Selasa";
      }
      else
      {
        i1 = 4;
        if (i1 == n)
        {
          localObject1 = "Rabu";
        }
        else if (j == n)
        {
          localObject1 = "Kamis";
        }
        else
        {
          i1 = 6;
          if (i1 == n) {
            localObject1 = "Jum'at";
          } else if (i == n) {
            localObject1 = "Sabtu";
          } else if (m == n) {
            localObject1 = "Minggu";
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */