package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;

public class a
  extends Fragment
{
  Button a;
  EditText b;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2131427387, paramViewGroup, false);
    Object localObject1 = (Button)localView.findViewById(2131296307);
    this.a = ((Button)localObject1);
    localObject1 = (EditText)localView.findViewById(2131296403);
    this.b = ((EditText)localObject1);
    localObject1 = this.b;
    Object localObject2 = f.b(getActivity(), "username", "");
    ((EditText)localObject1).setText((CharSequence)localObject2);
    localObject1 = this.a;
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/a$1;
    ((a.1)localObject2).<init>(this);
    ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    return localView;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */