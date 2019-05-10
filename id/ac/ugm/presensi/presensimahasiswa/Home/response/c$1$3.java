package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class c$1$3
  implements View.OnClickListener
{
  c$1$3(c.1 param1, EditText paramEditText1, AlertDialog paramAlertDialog, EditText paramEditText2) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this.a.getText().toString();
    String str = "";
    boolean bool = ((String)localObject).equals(str);
    if (bool)
    {
      localObject = this.a;
      str = "Password harus diisi.";
      ((EditText)localObject).setError(str);
      localObject = this.a;
      ((EditText)localObject).requestFocus();
    }
    for (;;)
    {
      return;
      this.b.dismiss();
      c.a(this.d.a, "manualogout");
      localObject = this.d.a;
      str = this.a.getText().toString();
      c.b((c)localObject, str);
      localObject = this.d.a;
      str = this.c.getText().toString();
      c.c((c)localObject, str);
      localObject = this.d.a;
      c.a((c)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c$1$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */