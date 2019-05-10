package id.ac.ugm.presensi.presensimahasiswa.utils.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import c.a.a.c.a.a;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;

class b$a
  extends a
{
  ImageButton a;
  ImageButton b;
  private Bitmap f;
  private ImageView g;
  private Button h;
  private Button i;
  
  public b$a(b paramb, Context paramContext)
  {
    super(paramContext);
    Object localObject1 = new android/widget/LinearLayout$LayoutParams;
    float f1 = 1.0F;
    ((LinearLayout.LayoutParams)localObject1).<init>(m, m, f1);
    Object localObject2 = new android/widget/LinearLayout$LayoutParams;
    float f2 = 10.0F;
    ((LinearLayout.LayoutParams)localObject2).<init>(m, m, f2);
    LinearLayout localLinearLayout = new android/widget/LinearLayout;
    localLinearLayout.<init>(paramContext);
    localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    localLinearLayout.setOrientation(n);
    localObject2 = b.f(paramb);
    if (localObject2 == null)
    {
      String str = "Loading PDF Page";
      localObject2 = ProgressDialog.show(paramb, "Loading", str, n, n);
      b.a(paramb, (ProgressDialog)localObject2);
    }
    a(localLinearLayout);
    localObject2 = this.h;
    this.i = ((Button)localObject2);
    localObject2 = new android/widget/ImageView;
    ((ImageView)localObject2).<init>(paramContext);
    this.g = ((ImageView)localObject2);
    a(null);
    c();
    this.g.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.g.setPadding(k, k, k, k);
    localObject1 = this.g;
    localLinearLayout.addView((View)localObject1);
    localObject1 = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject1).<init>(j, j, 100);
    setLayoutParams((ViewGroup.LayoutParams)localObject1);
    setBackgroundColor(-3355444);
    setHorizontalScrollBarEnabled(n);
    setHorizontalFadingEdgeEnabled(n);
    setVerticalScrollBarEnabled(n);
    setVerticalFadingEdgeEnabled(n);
    addView(localLinearLayout);
  }
  
  private void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {
      this.f = paramBitmap;
    }
  }
  
  private void a(ViewGroup paramViewGroup)
  {
    int j = 20;
    int k = -2;
    int m = 6;
    a(paramViewGroup, m, m);
    Object localObject1 = new android/widget/LinearLayout$LayoutParams;
    ((LinearLayout.LayoutParams)localObject1).<init>(k, k, 1.0F);
    Object localObject2 = new android/widget/LinearLayout$LayoutParams;
    float f1 = 10.0F;
    ((LinearLayout.LayoutParams)localObject2).<init>(k, k, f1);
    Context localContext = paramViewGroup.getContext();
    LinearLayout localLinearLayout = new android/widget/LinearLayout;
    localLinearLayout.<init>(localContext);
    localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    int n = 0;
    localLinearLayout.setOrientation(0);
    localObject2 = new android/widget/ImageButton;
    ((ImageButton)localObject2).<init>(localContext);
    this.a = ((ImageButton)localObject2);
    this.a.setBackgroundDrawable(null);
    this.a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localObject2 = this.a;
    int i1 = this.c.d();
    ((ImageButton)localObject2).setImageResource(i1);
    localObject2 = this.a;
    Object localObject3 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a$1;
    ((b.a.1)localObject3).<init>(this);
    ((ImageButton)localObject2).setOnClickListener((View.OnClickListener)localObject3);
    localObject2 = this.a;
    localLinearLayout.addView((View)localObject2);
    localObject2 = new android/widget/ImageButton;
    ((ImageButton)localObject2).<init>(localContext);
    this.b = ((ImageButton)localObject2);
    this.b.setBackgroundDrawable(null);
    this.b.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localObject2 = this.b;
    i1 = this.c.c();
    ((ImageButton)localObject2).setImageResource(i1);
    localObject2 = this.b;
    localObject3 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a$2;
    ((b.a.2)localObject3).<init>(this);
    ((ImageButton)localObject2).setOnClickListener((View.OnClickListener)localObject3);
    localObject2 = this.b;
    localLinearLayout.addView((View)localObject2);
    a(localLinearLayout, m, m);
    localObject2 = new android/widget/ImageButton;
    ((ImageButton)localObject2).<init>(localContext);
    ((ImageButton)localObject2).setBackgroundDrawable(null);
    ((ImageButton)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    i1 = this.c.a();
    ((ImageButton)localObject2).setImageResource(i1);
    localObject3 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a$3;
    ((b.a.3)localObject3).<init>(this);
    ((ImageButton)localObject2).setOnClickListener((View.OnClickListener)localObject3);
    localLinearLayout.addView((View)localObject2);
    localObject2 = new android/widget/Button;
    ((Button)localObject2).<init>(localContext);
    this.h = ((Button)localObject2);
    this.h.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localObject2 = b.a(this.c);
    if (localObject2 == null) {}
    for (localObject2 = "0";; localObject2 = Integer.toString(n))
    {
      localObject3 = this.h;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int i2 = b.c(this.c);
      localObject2 = i2 + "/" + (String)localObject2;
      ((Button)localObject3).setText((CharSequence)localObject2);
      localObject2 = this.h;
      localObject3 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a$4;
      ((b.a.4)localObject3).<init>(this);
      ((Button)localObject2).setOnClickListener((View.OnClickListener)localObject3);
      localObject2 = this.h;
      localLinearLayout.addView((View)localObject2);
      localObject2 = new android/widget/ImageButton;
      ((ImageButton)localObject2).<init>(localContext);
      ((ImageButton)localObject2).setBackgroundDrawable(null);
      ((ImageButton)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      int i3 = this.c.b();
      ((ImageButton)localObject2).setImageResource(i3);
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a$5;
      ((b.a.5)localObject1).<init>(this);
      ((ImageButton)localObject2).setOnClickListener((View.OnClickListener)localObject1);
      localLinearLayout.addView((View)localObject2);
      a(localLinearLayout, j, j);
      paramViewGroup.addView(localLinearLayout);
      a(paramViewGroup, m, m);
      return;
      n = b.a(this.c).getNumPages();
    }
  }
  
  private void a(ViewGroup paramViewGroup, int paramInt1, int paramInt2)
  {
    TextView localTextView = new android/widget/TextView;
    Object localObject = paramViewGroup.getContext();
    localTextView.<init>((Context)localObject);
    localObject = new android/widget/LinearLayout$LayoutParams;
    ((LinearLayout.LayoutParams)localObject).<init>(paramInt1, paramInt2, 1.0F);
    localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localTextView.setText("");
    paramViewGroup.addView(localTextView);
  }
  
  private void a(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "ST='" + paramString + "'";
    Log.i("PDFVIEWER", (String)localObject);
    b();
  }
  
  private void b()
  {
    Handler localHandler = b.l(this.c);
    b.a.6 local6 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a$6;
    local6.<init>(this);
    localHandler.post(local6);
  }
  
  private void c()
  {
    Handler localHandler = b.l(this.c);
    b.a.7 local7 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a$7;
    local7.<init>(this);
    localHandler.post(local7);
  }
  
  protected void a()
  {
    Object localObject1 = b.m(this.c);
    if (localObject1 != null)
    {
      localObject1 = this.h;
      Object localObject2;
      int j;
      PDFFile localPDFFile;
      if (localObject1 != null)
      {
        localObject1 = this.h;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        j = b.m(this.c).getPageNumber();
        localObject2 = ((StringBuilder)localObject2).append(j).append("/");
        localPDFFile = b.a(this.c);
        j = localPDFFile.getNumPages();
        localObject2 = j;
        ((Button)localObject1).setText((CharSequence)localObject2);
      }
      localObject1 = this.i;
      if (localObject1 != null)
      {
        localObject1 = this.i;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        j = b.m(this.c).getPageNumber();
        localObject2 = ((StringBuilder)localObject2).append(j).append("/");
        localPDFFile = b.a(this.c);
        j = localPDFFile.getNumPages();
        localObject2 = j;
        ((Button)localObject1).setText((CharSequence)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Activities\b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */