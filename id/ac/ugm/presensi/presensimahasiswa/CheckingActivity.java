package id.ac.ugm.presensi.presensimahasiswa;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.location.LocationManager;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.a;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.util.List;
import pub.devrel.easypermissions.b.a;

public class CheckingActivity
  extends b
  implements b.a
{
  private String a = "CheckingSystemActivity";
  private AlertDialog b;
  private Intent c = null;
  
  private boolean a(Context paramContext)
  {
    String str = null;
    Object localObject = (LocationManager)paramContext.getSystemService("location");
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = ((LocationManager)localObject).getAllProviders();
      if (localObject == null)
      {
        bool = false;
        localObject = null;
      }
      else
      {
        str = "gps";
        bool = ((List)localObject).contains(str);
      }
    }
  }
  
  private void d()
  {
    boolean bool = Common.c();
    if (!bool)
    {
      int i = 2131689657;
      Object localObject1 = Html.fromHtml(getString(i));
      Object localObject2 = new android/app/AlertDialog$Builder;
      ((AlertDialog.Builder)localObject2).<init>(this);
      int j = 2131689658;
      localObject1 = ((AlertDialog.Builder)localObject2).setTitle(j).setMessage((CharSequence)localObject1).setIcon(17301543);
      CheckingActivity.8 local8 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$8;
      local8.<init>(this);
      localObject1 = ((AlertDialog.Builder)localObject1).setPositiveButton(2131689531, local8);
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$7;
      ((CheckingActivity.7)localObject2).<init>(this);
      localObject1 = ((AlertDialog.Builder)localObject1).setOnCancelListener((DialogInterface.OnCancelListener)localObject2).show();
      int k = 16908299;
      localObject1 = (TextView)((AlertDialog)localObject1).findViewById(k);
      localObject2 = LinkMovementMethod.getInstance();
      ((TextView)localObject1).setMovementMethod((MovementMethod)localObject2);
    }
    for (;;)
    {
      return;
      e();
    }
  }
  
  private void e()
  {
    int i = 268468224;
    Common.a(NfcAdapter.getDefaultAdapter(this));
    Object localObject1 = Common.e();
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = Common.e();
      bool = ((NfcAdapter)localObject1).isEnabled();
      if (!bool)
      {
        bool = Common.i();
        if (!bool)
        {
          localObject1 = this.b;
          if (localObject1 == null) {
            f();
          }
          localObject1 = this.b;
          ((AlertDialog)localObject1).show();
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = getApplicationContext();
      Object localObject2 = "user_login";
      Class localClass = null;
      bool = f.b((Context)localObject1, (String)localObject2, false);
      if (bool)
      {
        localObject1 = new android/content/Intent;
        localObject2 = getApplicationContext();
        localClass = DashboardActivity.class;
        ((Intent)localObject1).<init>((Context)localObject2, localClass);
        ((Intent)localObject1).setFlags(i);
        startActivity((Intent)localObject1);
        finish();
      }
      else
      {
        localObject1 = new android/content/Intent;
        localObject2 = getApplicationContext();
        localClass = LoginActivity.class;
        ((Intent)localObject1).<init>((Context)localObject2, localClass);
        ((Intent)localObject1).setFlags(i);
        startActivity((Intent)localObject1);
        finish();
      }
    }
  }
  
  private void f()
  {
    Object localObject1 = new android/app/AlertDialog$Builder;
    ((AlertDialog.Builder)localObject1).<init>(this);
    localObject1 = ((AlertDialog.Builder)localObject1).setTitle(2131689656).setMessage(2131689655).setIcon(17301659);
    Object localObject2 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$3;
    ((CheckingActivity.3)localObject2).<init>(this);
    localObject1 = ((AlertDialog.Builder)localObject1).setPositiveButton(2131689537, (DialogInterface.OnClickListener)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$2;
    ((CheckingActivity.2)localObject2).<init>(this);
    localObject1 = ((AlertDialog.Builder)localObject1).setNegativeButton(2131689531, (DialogInterface.OnClickListener)localObject2).create();
    this.b = ((AlertDialog)localObject1);
  }
  
  public void a()
  {
    boolean bool1 = true;
    Object localObject = new String[bool1];
    String str = "android.permission.READ_EXTERNAL_STORAGE";
    localObject[0] = str;
    boolean bool2 = pub.devrel.easypermissions.b.a(this, (String[])localObject);
    if (bool2)
    {
      localObject = getApplicationContext();
      str = "all_permission";
      f.a((Context)localObject, str, bool1);
      d();
    }
    for (;;)
    {
      return;
      f.a(getApplicationContext(), "all_permission", false);
      localObject = new String[bool1];
      str = "android.permission.READ_EXTERNAL_STORAGE";
      localObject[0] = str;
      int i = 125;
      a.a(this, (String[])localObject, i);
    }
  }
  
  public void a(int paramInt)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(this);
    localBuilder.setTitle("Grant Permission");
    Object localObject = "";
    int i = 124;
    int j;
    if (paramInt == i)
    {
      localObject = getResources();
      j = 2131689578;
      localObject = ((Resources)localObject).getString(j);
    }
    for (;;)
    {
      localObject = localBuilder.setMessage((CharSequence)localObject).setCancelable(false);
      CheckingActivity.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$1;
      local1.<init>(this);
      ((AlertDialog.Builder)localObject).setPositiveButton("Setting Permission", local1);
      localBuilder.show();
      return;
      i = 123;
      if (paramInt == i)
      {
        localObject = getResources();
        j = 2131689579;
        localObject = ((Resources)localObject).getString(j);
      }
      else
      {
        localObject = getResources();
        j = 2131689580;
        localObject = ((Resources)localObject).getString(j);
      }
    }
  }
  
  public void a(int paramInt, List paramList) {}
  
  public void b()
  {
    boolean bool1 = true;
    Object localObject = new String[bool1];
    String str = "android.permission.ACCESS_FINE_LOCATION";
    localObject[0] = str;
    boolean bool2 = pub.devrel.easypermissions.b.a(this, (String[])localObject);
    if (bool2)
    {
      setFinishOnTouchOutside(bool1);
      localObject = (LocationManager)getSystemService("location");
      str = "gps";
      boolean bool3 = ((LocationManager)localObject).isProviderEnabled(str);
      if (bool3)
      {
        bool3 = a(this);
        if (bool3) {
          a();
        }
      }
      bool3 = a(this);
      if (!bool3) {
        c();
      }
      str = "gps";
      bool2 = ((LocationManager)localObject).isProviderEnabled(str);
      if (!bool2)
      {
        bool2 = a(this);
        if (bool2) {
          c();
        }
      }
    }
    for (;;)
    {
      return;
      a();
      continue;
      f.a(getApplicationContext(), "all_permission", false);
      localObject = new String[bool1];
      str = "android.permission.ACCESS_FINE_LOCATION";
      localObject[0] = str;
      int i = 124;
      a.a(this, (String[])localObject, i);
    }
  }
  
  public void b(int paramInt, List paramList)
  {
    String str = null;
    int i = Build.VERSION.SDK_INT;
    int k = 23;
    Object localObject1;
    Object localObject2;
    if (i >= k)
    {
      localObject1 = "android.permission.ACCESS_FINE_LOCATION";
      boolean bool = shouldShowRequestPermissionRationale((String)localObject1);
      if (bool) {
        break label77;
      }
      localObject1 = new String[1];
      localObject2 = "android.permission.ACCESS_FINE_LOCATION";
      localObject1[0] = localObject2;
      bool = pub.devrel.easypermissions.b.a(this, (String[])localObject1);
      if (bool) {
        break label77;
      }
      int j = 124;
      a(j);
    }
    for (;;)
    {
      return;
      label77:
      localObject1 = new android/app/AlertDialog$Builder;
      ((AlertDialog.Builder)localObject1).<init>(this);
      ((AlertDialog.Builder)localObject1).setTitle("Status");
      localObject2 = ((AlertDialog.Builder)localObject1).setMessage("Grant all permissions needed to access Tolkita?").setCancelable(false);
      Object localObject3 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$5;
      ((CheckingActivity.5)localObject3).<init>(this);
      localObject2 = ((AlertDialog.Builder)localObject2).setNegativeButton("No", (DialogInterface.OnClickListener)localObject3);
      str = "Yes";
      localObject3 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$4;
      ((CheckingActivity.4)localObject3).<init>(this);
      ((AlertDialog.Builder)localObject2).setPositiveButton(str, (DialogInterface.OnClickListener)localObject3);
      ((AlertDialog.Builder)localObject1).show();
    }
  }
  
  public void c()
  {
    AlertDialog.Builder localBuilder1 = new android/app/AlertDialog$Builder;
    localBuilder1.<init>(this);
    localBuilder1.setTitle("GPS tidak aktif.");
    AlertDialog.Builder localBuilder2 = localBuilder1.setMessage("Silahkan aktifkan GPS terlabih dahulu.").setCancelable(false);
    CheckingActivity.6 local6 = new id/ac/ugm/presensi/presensimahasiswa/CheckingActivity$6;
    local6.<init>(this);
    localBuilder2.setPositiveButton("Tutup", local6);
    localBuilder1.show();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    int i = 101;
    if (paramInt1 == i) {
      b();
    }
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    a.a(this);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    b();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    pub.devrel.easypermissions.b.a(paramInt, paramArrayOfString, paramArrayOfInt, arrayOfObject);
  }
  
  public void onResume()
  {
    super.onResume();
    Context localContext = getApplicationContext();
    String str = "all_permission";
    boolean bool = f.b(localContext, str, false);
    if (bool) {
      d();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\CheckingActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */