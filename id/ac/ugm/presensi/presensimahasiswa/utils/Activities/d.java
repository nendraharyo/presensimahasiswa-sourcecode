package id.ac.ugm.presensi.presensimahasiswa.utils.Activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;

public class d
  extends a
{
  LinearLayout a;
  int b;
  
  private int a(String paramString1, String paramString2, String paramString3)
  {
    String str1 = "tag_";
    Object localObject1 = paramString3.replace("-", "");
    Object localObject2 = getResources();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject1 = str1 + paramString1 + paramString2 + (String)localObject1;
    localObject3 = "string";
    String str2 = getPackageName();
    int i = ((Resources)localObject2).getIdentifier((String)localObject1, (String)localObject3, str2);
    if (i == 0)
    {
      localObject1 = getResources();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = str1 + paramString1 + paramString2;
      localObject3 = "string";
      str2 = getPackageName();
      i = ((Resources)localObject1).getIdentifier((String)localObject2, (String)localObject3, str2);
    }
    if (i == 0)
    {
      localObject1 = getResources();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str1 = str1 + paramString1;
      localObject2 = "string";
      localObject3 = getPackageName();
      i = ((Resources)localObject1).getIdentifier(str1, (String)localObject2, (String)localObject3);
    }
    return i;
  }
  
  private void a(Tag paramTag)
  {
    int i = 16973890;
    int j = 5;
    int k = 2;
    int m = 1;
    int n = 0;
    int i1;
    Object localObject1;
    Object localObject2;
    if (paramTag != null)
    {
      i1 = Common.a(paramTag, this);
      this.b = i1;
      this.a.removeAllViews();
      localObject1 = new android/widget/TextView;
      ((TextView)localObject1).<init>(this);
      ((TextView)localObject1).setTextAppearance(this, i);
      ((TextView)localObject1).setGravity(m);
      j = Common.a(j);
      ((TextView)localObject1).setPadding(j, j, j, j);
      this.a.addView((View)localObject1);
      localObject1 = new android/widget/TextView;
      ((TextView)localObject1).<init>(this);
      ((TextView)localObject1).setPadding(j, j, j, j);
      ((TextView)localObject1).setTextAppearance(this, 16973892);
      this.a.addView((View)localObject1);
      localObject1 = Common.a(paramTag.getId());
      localObject2 = paramTag.getId();
      j = localObject2.length;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1).append(" (").append(j);
      localObject3 = " byte";
      localObject1 = (String)localObject3;
      i = 7;
      if (j == i)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ", CL2";
        localObject1 = (String)localObject2;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append((String)localObject1).append(")").toString();
        localObject1 = NfcA.get(paramTag);
        localObject2 = ((NfcA)localObject1).getAtqa();
        localObject3 = new byte[k];
        int i2 = localObject2[m];
        localObject3[0] = i2;
        j = localObject2[0];
        localObject3[m] = j;
        localObject3 = Common.a((byte[])localObject3);
        localObject2 = new byte[k];
        i2 = (byte)(((NfcA)localObject1).getSak() >> 8 & 0xFF);
        localObject2[0] = i2;
        i1 = (byte)(((NfcA)localObject1).getSak() & 0xFF);
        localObject2[m] = i1;
        i1 = localObject2[0];
        if (i1 == 0) {
          break label471;
        }
        localObject1 = Common.a((byte[])localObject2);
        label369:
        localObject2 = "-";
        Object localObject4 = IsoDep.get(paramTag);
        if (localObject4 != null)
        {
          localObject4 = ((IsoDep)localObject4).getHistoricalBytes();
          if (localObject4 != null)
          {
            n = localObject4.length;
            if (n > 0) {
              localObject2 = Common.a((byte[])localObject4);
            }
          }
        }
        a((String)localObject3, (String)localObject1, (String)localObject2);
      }
    }
    for (;;)
    {
      return;
      i = 10;
      if (j != i) {
        break;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ", CL3";
      localObject1 = (String)localObject2;
      break;
      label471:
      localObject1 = new byte[m];
      j = localObject2[m];
      localObject1[0] = j;
      localObject1 = Common.a((byte[])localObject1);
      break label369;
      localObject1 = new android/widget/TextView;
      ((TextView)localObject1).<init>(this);
      j = Common.a(j);
      ((TextView)localObject1).setPadding(j, j, 0, 0);
      ((TextView)localObject1).setTextAppearance(this, i);
      j = 2131689888;
      localObject2 = getString(j);
      ((TextView)localObject1).setText((CharSequence)localObject2);
      this.a.removeAllViews();
      localObject2 = this.a;
      ((LinearLayout)localObject2).addView((View)localObject1);
      i1 = 2131689735;
      localObject1 = Toast.makeText(this, i1, 0);
      ((Toast)localObject1).show();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Tag localTag = Common.d();
    a(localTag);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    Common.a(paramIntent, this);
    Object localObject = "android.nfc.action.TECH_DISCOVERED";
    String str = paramIntent.getAction();
    boolean bool = ((String)localObject).equals(str);
    if (bool)
    {
      localObject = Common.d();
      a((Tag)localObject);
    }
  }
  
  public void onReadMore(View paramView)
  {
    int i = 0;
    Object localObject1 = null;
    int j = this.b;
    int k = -1;
    if (j == k)
    {
      j = 2131689658;
      i = 2131689657;
    }
    for (;;)
    {
      localObject1 = Html.fromHtml(getString(i));
      Object localObject2 = new android/app/AlertDialog$Builder;
      ((AlertDialog.Builder)localObject2).<init>(this);
      localObject1 = ((AlertDialog.Builder)localObject2).setTitle(j).setMessage((CharSequence)localObject1).setIcon(17301543);
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/d$1;
      ((d.1)localObject2).<init>(this);
      localObject1 = (TextView)((AlertDialog.Builder)localObject1).setPositiveButton(2131689538, (DialogInterface.OnClickListener)localObject2).show().findViewById(16908299);
      MovementMethod localMovementMethod = LinkMovementMethod.getInstance();
      ((TextView)localObject1).setMovementMethod(localMovementMethod);
      return;
      j = this.b;
      k = -2;
      if (j == k)
      {
        j = 2131689660;
        i = 2131689659;
      }
      else
      {
        j = 0;
        localMovementMethod = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Activities\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */