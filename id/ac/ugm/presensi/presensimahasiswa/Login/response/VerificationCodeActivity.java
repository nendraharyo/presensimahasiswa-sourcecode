package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.loopj.android.http.PersistentCookieStore;
import id.ac.ugm.presensi.presensimahasiswa.b;

public class VerificationCodeActivity
  extends b
{
  private static CountDownTimer e;
  private Button a;
  private TextView b;
  private TextView c;
  private EditText d;
  private PersistentCookieStore f;
  
  private void a(int paramInt)
  {
    VerificationCodeActivity.3 local3 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/VerificationCodeActivity$3;
    long l = paramInt;
    local3.<init>(this, l, 1000L);
    e = local3.start();
  }
  
  private void b()
  {
    int i = 1;
    Toast.makeText(getBaseContext(), "Verifikasi gagal.", i).show();
    this.a.setEnabled(i);
  }
  
  public boolean a()
  {
    int i = 1;
    Object localObject = this.d.getText().toString();
    boolean bool = ((String)localObject).isEmpty();
    String str;
    int j;
    if (bool)
    {
      localObject = this.d;
      str = "Kode verifikasi tidak boleh kosong.";
      ((EditText)localObject).setError(str);
      this.d.requestFocus();
      localObject = (InputMethodManager)getSystemService("input_method");
      j = 2;
      ((InputMethodManager)localObject).toggleSoftInput(j, i);
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = this.d;
      j = 0;
      str = null;
      ((EditText)localObject).setError(null);
      bool = i;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131427363);
    Object localObject1 = new com/loopj/android/http/PersistentCookieStore;
    ((PersistentCookieStore)localObject1).<init>(this);
    this.f = ((PersistentCookieStore)localObject1);
    localObject1 = (Button)findViewById(2131296309);
    this.a = ((Button)localObject1);
    localObject1 = (EditText)findViewById(2131296579);
    this.d = ((EditText)localObject1);
    localObject1 = (TextView)findViewById(2131296484);
    this.c = ((TextView)localObject1);
    localObject1 = (TextView)findViewById(2131296436);
    this.b = ((TextView)localObject1);
    this.b.setVisibility(8);
    localObject1 = this.a;
    Object localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/VerificationCodeActivity$1;
    ((VerificationCodeActivity.1)localObject2).<init>(this);
    ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    localObject1 = this.c;
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/VerificationCodeActivity$2;
    ((VerificationCodeActivity.2)localObject2).<init>(this);
    ((TextView)localObject1).setOnClickListener((View.OnClickListener)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\VerificationCodeActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */