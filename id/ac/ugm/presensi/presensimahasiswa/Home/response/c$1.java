package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

class c$1
  implements View.OnClickListener
{
  c$1(c paramc) {}
  
  public void onClick(View paramView)
  {
    Object localObject1 = new DialogInterface[1];
    Object localObject2 = new android/app/AlertDialog$Builder;
    Object localObject3 = this.a.getActivity();
    ((AlertDialog.Builder)localObject2).<init>((Context)localObject3);
    ((AlertDialog.Builder)localObject2).setTitle("Masukkan akun SSO");
    localObject3 = (ViewGroup)((ViewGroup)this.a.getActivity().findViewById(16908290)).getChildAt(0);
    Object localObject4 = LayoutInflater.from(this.a.getActivity()).inflate(2131427424, (ViewGroup)localObject3, false);
    localObject3 = (EditText)((View)localObject4).findViewById(2131296574);
    EditText localEditText = (EditText)((View)localObject4).findViewById(2131296402);
    ((AlertDialog.Builder)localObject2).setView((View)localObject4);
    Object localObject5 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$1$1;
    ((c.1.1)localObject5).<init>(this, (DialogInterface[])localObject1, localEditText);
    ((AlertDialog.Builder)localObject2).setPositiveButton(17039370, (DialogInterface.OnClickListener)localObject5);
    localObject5 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$1$2;
    ((c.1.2)localObject5).<init>(this);
    ((AlertDialog.Builder)localObject2).setNegativeButton(17039360, (DialogInterface.OnClickListener)localObject5);
    localObject2 = ((AlertDialog.Builder)localObject2).create();
    localObject1[0] = localObject2;
    ((AlertDialog)localObject2).show();
    localObject1 = ((AlertDialog)localObject2).getButton(-1);
    localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c$1$3;
    ((c.1.3)localObject4).<init>(this, localEditText, (AlertDialog)localObject2, (EditText)localObject3);
    ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */