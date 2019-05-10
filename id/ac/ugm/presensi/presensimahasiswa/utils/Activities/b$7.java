package id.ac.ugm.presensi.presensimahasiswa.utils.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import com.sun.pdfview.PDFFile;

class b$7
  implements DialogInterface.OnClickListener
{
  b$7(b paramb, EditText paramEditText) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = 1;
    Object localObject1 = this.a.getText().toString();
    b localb1 = this.b;
    int j = b.c(localb1);
    try
    {
      j = Integer.parseInt((String)localObject1);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int k;
      int m;
      Object localObject2;
      b localb2;
      int i1;
      int n;
      b localb3;
      float f;
      for (;;) {}
    }
    localObject1 = this.b;
    k = b.c((b)localObject1);
    if ((j != k) && (j >= i))
    {
      localObject1 = b.a(this.b);
      m = ((PDFFile)localObject1).getNumPages();
      if (j <= m)
      {
        b.a(this.b, j);
        b.d(this.b).a.setEnabled(i);
        b.d(this.b).b.setEnabled(i);
        localb1 = this.b;
        localObject1 = this.b;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Loading PDF Page ");
        localb2 = this.b;
        i1 = b.c(localb2);
        localObject2 = i1;
        localObject1 = ProgressDialog.show((Context)localObject1, "Loading", (CharSequence)localObject2, i, i);
        b.a(localb1, (ProgressDialog)localObject1);
        localb1 = this.b;
        localObject1 = this.b;
        n = b.c((b)localObject1);
        localb3 = this.b;
        f = b.e(localb3);
        b.b(localb1, n, f);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Activities\b$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */