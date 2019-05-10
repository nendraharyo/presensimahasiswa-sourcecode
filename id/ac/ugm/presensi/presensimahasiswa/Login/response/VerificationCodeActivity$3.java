package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.content.res.Resources;
import android.os.CountDownTimer;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

class VerificationCodeActivity$3
  extends CountDownTimer
{
  VerificationCodeActivity$3(VerificationCodeActivity paramVerificationCodeActivity, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public void onFinish()
  {
    VerificationCodeActivity.a(null);
    VerificationCodeActivity.c(this.a).setEnabled(true);
    VerificationCodeActivity.d(this.a).setVisibility(8);
    TextView localTextView = VerificationCodeActivity.c(this.a);
    int i = this.a.getResources().getColor(2131099693);
    localTextView.setTextColor(i);
  }
  
  public void onTick(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    long l1 = TimeUnit.MILLISECONDS.toMinutes(paramLong);
    Object localObject = TimeUnit.HOURS;
    long l2 = TimeUnit.MILLISECONDS.toHours(paramLong);
    l2 = ((TimeUnit)localObject).toMinutes(l2);
    localObject = Long.valueOf(l1 - l2);
    arrayOfObject[0] = localObject;
    l1 = TimeUnit.MILLISECONDS.toSeconds(paramLong);
    localObject = TimeUnit.MINUTES;
    l2 = TimeUnit.MILLISECONDS.toMinutes(paramLong);
    l2 = ((TimeUnit)localObject).toSeconds(l2);
    localObject = Long.valueOf(l1 - l2);
    arrayOfObject[1] = localObject;
    String str = String.format("%02d:%02d", arrayOfObject);
    VerificationCodeActivity.d(this.a).setText(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\VerificationCodeActivity$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */