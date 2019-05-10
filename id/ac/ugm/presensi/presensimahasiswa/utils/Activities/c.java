package id.ac.ugm.presensi.presensimahasiswa.utils.Activities;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;

public class c
  extends a
{
  CheckBox a;
  CheckBox b;
  CheckBox c;
  CheckBox d;
  CheckBox e;
  EditText f;
  
  public void onCancel(View paramView)
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    super.onCreate(paramBundle);
    SharedPreferences localSharedPreferences = Common.b();
    Object localObject1 = this.a;
    Object localObject2 = c.a.a.toString();
    boolean bool2 = localSharedPreferences.getBoolean((String)localObject2, false);
    ((CheckBox)localObject1).setChecked(bool2);
    localObject1 = this.b;
    localObject2 = c.a.b.toString();
    bool2 = localSharedPreferences.getBoolean((String)localObject2, bool1);
    ((CheckBox)localObject1).setChecked(bool2);
    localObject1 = this.c;
    localObject2 = c.a.c.toString();
    bool2 = localSharedPreferences.getBoolean((String)localObject2, false);
    ((CheckBox)localObject1).setChecked(bool2);
    localObject1 = this.f;
    bool2 = this.c.isChecked();
    ((EditText)localObject1).setEnabled(bool2);
    localObject1 = this.f;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("");
    String str = c.a.d.toString();
    int i = localSharedPreferences.getInt(str, 16);
    localObject2 = i;
    ((EditText)localObject1).setText((CharSequence)localObject2);
    localObject1 = this.e;
    localObject2 = c.a.e.toString();
    bool2 = localSharedPreferences.getBoolean((String)localObject2, false);
    ((CheckBox)localObject1).setChecked(bool2);
    localObject1 = this.d;
    localObject2 = c.a.f.toString();
    boolean bool3 = localSharedPreferences.getBoolean((String)localObject2, bool1);
    ((CheckBox)localObject1).setChecked(bool3);
  }
  
  public void onSave(View paramView)
  {
    Object localObject = this.f.getText().toString();
    int i = Integer.parseInt((String)localObject);
    int j = 40;
    if ((i > j) || (i <= 0))
    {
      i = 2131689745;
      j = 1;
      localObject = Toast.makeText(this, i, j);
      ((Toast)localObject).show();
    }
    for (;;)
    {
      return;
      SharedPreferences.Editor localEditor = Common.b().edit();
      String str = c.a.a.toString();
      boolean bool = this.a.isChecked();
      localEditor.putBoolean(str, bool);
      str = c.a.b.toString();
      bool = this.b.isChecked();
      localEditor.putBoolean(str, bool);
      str = c.a.c.toString();
      bool = this.c.isChecked();
      localEditor.putBoolean(str, bool);
      str = c.a.f.toString();
      bool = this.d.isChecked();
      localEditor.putBoolean(str, bool);
      str = c.a.e.toString();
      CheckBox localCheckBox = this.e;
      bool = localCheckBox.isChecked();
      localEditor.putBoolean(str, bool);
      str = c.a.d.toString();
      localEditor.putInt(str, i);
      localEditor.apply();
      finish();
    }
  }
  
  public void onShowAutoReconnectInfo(View paramView)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(this);
    localBuilder = localBuilder.setTitle(2131689638).setMessage(2131689637).setIcon(17301659);
    c.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/c$1;
    local1.<init>(this);
    localBuilder.setPositiveButton(2131689538, local1).show();
  }
  
  public void onShowCustomSectorCountInfo(View paramView)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(this);
    localBuilder = localBuilder.setTitle(2131689643).setMessage(2131689642).setIcon(17301659);
    c.2 local2 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/c$2;
    local2.<init>(this);
    localBuilder.setPositiveButton(2131689538, local2).show();
  }
  
  public void onShowRetryAuthenticationInfo(View paramView)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(this);
    localBuilder = localBuilder.setTitle(2131689666).setMessage(2131689665).setIcon(17301659);
    c.4 local4 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/c$4;
    local4.<init>(this);
    localBuilder.setPositiveButton(2131689538, local4).show();
  }
  
  public void onShowUseInternalStorageInfo(View paramView)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(this);
    localBuilder = localBuilder.setTitle(2131689683).setMessage(2131689682).setIcon(17301659);
    c.3 local3 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/c$3;
    local3.<init>(this);
    localBuilder.setPositiveButton(2131689538, local3).show();
  }
  
  public void onUseCustomSectorCountChanged(View paramView)
  {
    EditText localEditText = this.f;
    boolean bool = this.c.isChecked();
    localEditText.setEnabled(bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Activities\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */