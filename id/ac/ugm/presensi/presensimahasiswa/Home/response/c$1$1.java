package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.EditText;

class c$1$1
  implements DialogInterface.OnClickListener
{
  c$1$1(c.1 param1, DialogInterface[] paramArrayOfDialogInterface, EditText paramEditText) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a[0] = paramDialogInterface;
    Object localObject1 = this.b;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Password tidak sesuai.");
    String str = this.b.getText().toString();
    localObject2 = str;
    ((EditText)localObject1).setError((CharSequence)localObject2);
    this.b.requestFocus();
    localObject1 = new android/content/Intent;
    localObject2 = this.c.a.getActivity();
    ((Intent)localObject1).<init>((Context)localObject2, AccountActivity.class);
    this.c.a.startActivity((Intent)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */