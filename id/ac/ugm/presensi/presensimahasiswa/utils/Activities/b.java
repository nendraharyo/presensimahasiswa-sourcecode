package id.ac.ugm.presensi.presensimahasiswa.utils.Activities;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import c.a.a.d.a;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;
import com.sun.pdfview.decrypt.PDFAuthenticationFailureException;
import com.sun.pdfview.decrypt.PDFPassword;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public abstract class b
  extends Activity
{
  private b.a a;
  private b.a b;
  private String c;
  private PDFFile d;
  private int e;
  private float f;
  private File g;
  private ProgressDialog h;
  private PDFPage i;
  private Thread j;
  private Handler k;
  
  private String a(Uri paramUri)
  {
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    int m;
    try
    {
      localObject2 = this.g;
      if (localObject2 == null)
      {
        localObject2 = Environment.getExternalStorageDirectory();
        if (localObject2 == null)
        {
          localObject2 = new java/lang/Exception;
          localObject3 = "external storage dir not found";
          ((Exception)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
      }
    }
    catch (Exception localException2)
    {
      m = 0;
      localObject2 = null;
      localObject1 = localException2;
    }
    for (;;)
    {
      localObject3 = "PDFVIEWER";
      Object localObject4 = ((Exception)localObject1).getMessage();
      Log.e((String)localObject3, (String)localObject4, (Throwable)localObject1);
      for (;;)
      {
        return (String)localObject2;
        localObject3 = new java/io/File;
        localObject4 = "AndroidPdfViewer/AndroidPdfViewer_temp.pdf";
        ((File)localObject3).<init>((File)localObject2, (String)localObject4);
        this.g = ((File)localObject3);
        localObject2 = this.g;
        localObject2 = ((File)localObject2).getParentFile();
        ((File)localObject2).mkdirs();
        localObject2 = this.g;
        ((File)localObject2).delete();
        for (;;)
        {
          localObject2 = getContentResolver();
          localObject3 = ((ContentResolver)localObject2).openInputStream(paramUri);
          localObject4 = new java/io/FileOutputStream;
          localObject2 = this.g;
          ((FileOutputStream)localObject4).<init>((File)localObject2);
          m = 1024;
          byte[] arrayOfByte = new byte[m];
          for (m = ((InputStream)localObject3).read(arrayOfByte); m > 0; m = ((InputStream)localObject3).read(arrayOfByte)) {
            ((OutputStream)localObject4).write(arrayOfByte, 0, m);
          }
          localObject2 = this.g;
          ((File)localObject2).delete();
        }
        ((OutputStream)localObject4).close();
        ((InputStream)localObject3).close();
        localObject2 = this.g;
        localObject2 = ((File)localObject2).getCanonicalPath();
        try
        {
          localObject1 = this.g;
          ((File)localObject1).deleteOnExit();
        }
        catch (Exception localException1) {}
      }
    }
  }
  
  /* Error */
  private void a(int paramInt, float paramFloat)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 118	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b:j	Ljava/lang/Thread;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 120	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b:b	Lid/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a;
    //   18: astore_3
    //   19: new 122	java/lang/StringBuilder
    //   22: astore 4
    //   24: aload 4
    //   26: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   29: ldc 125
    //   31: astore 5
    //   33: aload 4
    //   35: aload 5
    //   37: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: astore 4
    //   42: aload 4
    //   44: iload_1
    //   45: invokevirtual 132	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   48: astore 4
    //   50: ldc -122
    //   52: astore 5
    //   54: aload 4
    //   56: aload 5
    //   58: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: astore 4
    //   63: aload 4
    //   65: fload_2
    //   66: invokevirtual 137	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   69: astore 4
    //   71: aload 4
    //   73: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore 4
    //   78: aload_3
    //   79: aload 4
    //   81: invokestatic 145	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a:a	(Lid/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a;Ljava/lang/String;)V
    //   84: new 147	java/lang/Thread
    //   87: astore_3
    //   88: new 149	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$3
    //   91: astore 4
    //   93: aload 4
    //   95: aload_0
    //   96: iload_1
    //   97: fload_2
    //   98: invokespecial 152	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$3:<init>	(Lid/ac/ugm/presensi/presensimahasiswa/utils/Activities/b;IF)V
    //   101: aload_3
    //   102: aload 4
    //   104: invokespecial 155	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   107: aload_0
    //   108: aload_3
    //   109: putfield 118	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b:j	Ljava/lang/Thread;
    //   112: aload_0
    //   113: invokespecial 158	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b:l	()V
    //   116: aload_0
    //   117: getfield 118	id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b:j	Ljava/lang/Thread;
    //   120: astore_3
    //   121: aload_3
    //   122: invokevirtual 161	java/lang/Thread:start	()V
    //   125: goto -114 -> 11
    //   128: astore_3
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_3
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	b
    //   0	133	1	paramInt	int
    //   0	133	2	paramFloat	float
    //   6	116	3	localObject1	Object
    //   128	4	3	localObject2	Object
    //   22	81	4	localObject3	Object
    //   31	26	5	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	128	finally
    //   14	18	128	finally
    //   19	22	128	finally
    //   24	29	128	finally
    //   35	40	128	finally
    //   44	48	128	finally
    //   56	61	128	finally
    //   65	69	128	finally
    //   71	76	128	finally
    //   79	84	128	finally
    //   84	87	128	finally
    //   88	91	128	finally
    //   97	101	128	finally
    //   102	107	128	finally
    //   108	112	128	finally
    //   112	116	128	finally
    //   116	120	128	finally
    //   121	125	128	finally
  }
  
  private void a(String paramString)
  {
    try
    {
      Object localObject1 = this.c;
      a((String)localObject1, paramString);
      localObject1 = this.b;
      setContentView((View)localObject1);
      m = this.e;
      float f1 = this.f;
      a(m, f1);
      return;
    }
    catch (PDFAuthenticationFailureException localPDFAuthenticationFailureException)
    {
      for (;;)
      {
        int m = e();
        setContentView(m);
        m = g();
        Object localObject2 = (EditText)findViewById(m);
        int n = h();
        Button localButton1 = (Button)findViewById(n);
        int i1 = i();
        Button localButton2 = (Button)findViewById(i1);
        b.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$1;
        local1.<init>(this, (EditText)localObject2);
        localButton1.setOnClickListener(local1);
        localObject2 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$2;
        ((b.2)localObject2).<init>(this);
        localButton2.setOnClickListener((View.OnClickListener)localObject2);
      }
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString1);
        l1 = ((File)localObject1).length();
        long l2 = 0L;
        boolean bool = l1 < l2;
        if (!bool)
        {
          localObject1 = this.b;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "file '";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject3 = ((StringBuilder)localObject3).append(paramString1);
          localObject4 = "' not found";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject3 = ((StringBuilder)localObject3).toString();
          b.a.a((b.a)localObject1, (String)localObject3);
          return;
        }
      }
      catch (PDFAuthenticationFailureException localPDFAuthenticationFailureException) {}finally
      {
        Object localObject1;
        long l1;
        StringBuilder localStringBuilder;
        String str2;
        ((Throwable)localObject2).printStackTrace();
        Object localObject3 = this.b;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str3 = "Exception: ";
        localObject4 = ((StringBuilder)localObject4).append(str3);
        String str1 = ((Throwable)localObject2).getMessage();
        str1 = str1;
        b.a.a((b.a)localObject3, str1);
        continue;
      }
      localObject3 = this.b;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str2 = "file '";
      localStringBuilder = localStringBuilder.append(str2);
      localStringBuilder = localStringBuilder.append(paramString1);
      str2 = "' has ";
      localStringBuilder = localStringBuilder.append(str2);
      localObject4 = localStringBuilder.append(l1);
      str3 = " bytes";
      localObject4 = ((StringBuilder)localObject4).append(str3);
      localObject4 = ((StringBuilder)localObject4).toString();
      b.a.a((b.a)localObject3, (String)localObject4);
      a((File)localObject1, paramString2);
    }
  }
  
  private void b(int paramInt, float paramFloat)
  {
    try
    {
      Object localObject1 = this.b;
      boolean bool1 = false;
      float f1 = 0.0F;
      locala = null;
      b.a.b((b.a)localObject1, null);
      localObject1 = this.b;
      b.a.d((b.a)localObject1);
      localObject1 = this.i;
      if (localObject1 != null)
      {
        localObject1 = this.i;
        int n = ((PDFPage)localObject1).getPageNumber();
        if (n == paramInt) {}
      }
      else
      {
        localObject1 = this.d;
        bool1 = true;
        f1 = Float.MIN_VALUE;
        localObject1 = ((PDFFile)localObject1).getPage(paramInt, bool1);
        this.i = ((PDFPage)localObject1);
      }
      localObject1 = this.i;
      f1 = ((PDFPage)localObject1).getWidth();
      localObject1 = this.i;
      float f2 = ((PDFPage)localObject1).getHeight();
      str2 = null;
      localObject1 = this.i;
      f1 *= paramFloat;
      int m = (int)f1;
      f2 *= paramFloat;
      int i1 = (int)f2;
      boolean bool2 = true;
      boolean bool3 = true;
      localObject1 = ((PDFPage)localObject1).getImage(m, i1, null, bool2, bool3);
      locala = this.b;
      b.a.b(locala, (Bitmap)localObject1);
      localObject1 = this.b;
      b.a.d((b.a)localObject1);
      localObject1 = this.h;
      if (localObject1 != null)
      {
        localObject1 = this.h;
        ((ProgressDialog)localObject1).dismiss();
      }
      return;
    }
    finally
    {
      for (;;)
      {
        Object localObject2 = localThrowable.getMessage();
        Log.e("PDFVIEWER", (String)localObject2, localThrowable);
        b.a locala = this.b;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Exception: ";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        String str1 = localThrowable.getMessage();
        str1 = str1;
        b.a.a(locala, str1);
      }
    }
  }
  
  private boolean k()
  {
    boolean bool = false;
    this.a = null;
    Object localObject1 = "restoreInstance";
    Log.e("PDFVIEWER", (String)localObject1);
    Object localObject2 = getLastNonConfigurationInstance();
    if (localObject2 == null)
    {
      bool = false;
      localObject2 = null;
    }
    for (;;)
    {
      return bool;
      localObject2 = (b)getLastNonConfigurationInstance();
      if (localObject2 != this)
      {
        String str = "restoring Instance";
        Log.e("PDFVIEWER", str);
        localObject1 = ((b)localObject2).b;
        this.a = ((b.a)localObject1);
        int m = ((b)localObject2).e;
        this.e = m;
        localObject1 = ((b)localObject2).d;
        this.d = ((PDFFile)localObject1);
        localObject1 = ((b)localObject2).i;
        this.i = ((PDFPage)localObject1);
        localObject1 = ((b)localObject2).g;
        this.g = ((File)localObject1);
        float f1 = ((b)localObject2).f;
        this.f = f1;
        localObject1 = ((b)localObject2).c;
        this.c = ((String)localObject1);
        localObject2 = ((b)localObject2).j;
        this.j = ((Thread)localObject2);
      }
      bool = true;
    }
  }
  
  private void l()
  {
    Object localObject = this.j;
    if (localObject == null)
    {
      localObject = this.b;
      b.a.c((b.a)localObject);
    }
    for (;;)
    {
      return;
      b.a.c(this.b);
      localObject = this.b;
      b.4 local4 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$4;
      local4.<init>(this);
      long l = 1000L;
      ((b.a)localObject).postDelayed(local4, l);
    }
  }
  
  private void m()
  {
    boolean bool1 = true;
    float f1 = 3.0F;
    Object localObject = this.d;
    float f3;
    if (localObject != null)
    {
      float f2 = this.f;
      boolean bool2 = f2 < f1;
      if (bool2)
      {
        f2 = this.f;
        f3 = 1.5F;
        f2 *= f3;
        this.f = f2;
        f2 = this.f;
        bool2 = f2 < f1;
        if (bool2) {
          this.f = f1;
        }
        f2 = this.f;
        bool2 = f2 < f1;
        if (bool2) {
          break label154;
        }
        Log.d("PDFVIEWER", "Disabling zoom in button");
        localObject = this.b.b;
        f3 = 0.0F;
        ((ImageButton)localObject).setEnabled(false);
      }
    }
    for (;;)
    {
      localObject = this.b.a;
      ((ImageButton)localObject).setEnabled(bool1);
      int m = this.e;
      f3 = this.f;
      a(m, f3);
      return;
      label154:
      localObject = this.b.b;
      ((ImageButton)localObject).setEnabled(bool1);
    }
  }
  
  private void n()
  {
    boolean bool1 = true;
    float f1 = 0.25F;
    Object localObject = this.d;
    float f3;
    if (localObject != null)
    {
      float f2 = this.f;
      boolean bool2 = f2 < f1;
      if (bool2)
      {
        f2 = this.f;
        f3 = 1.5F;
        f2 /= f3;
        this.f = f2;
        f2 = this.f;
        bool2 = f2 < f1;
        if (bool2) {
          this.f = f1;
        }
        f2 = this.f;
        bool2 = f2 < f1;
        if (bool2) {
          break label154;
        }
        Log.d("PDFVIEWER", "Disabling zoom out button");
        localObject = this.b.a;
        f3 = 0.0F;
        ((ImageButton)localObject).setEnabled(false);
      }
    }
    for (;;)
    {
      localObject = this.b.b;
      ((ImageButton)localObject).setEnabled(bool1);
      int m = this.e;
      f3 = this.f;
      a(m, f3);
      return;
      label154:
      localObject = this.b.a;
      ((ImageButton)localObject).setEnabled(bool1);
    }
  }
  
  private void o()
  {
    boolean bool = true;
    Object localObject1 = this.d;
    if (localObject1 != null)
    {
      int m = this.e;
      Object localObject2 = this.d;
      int n = ((PDFFile)localObject2).getNumPages();
      if (m < n)
      {
        m = this.e + 1;
        this.e = m;
        this.b.a.setEnabled(bool);
        this.b.b.setEnabled(bool);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "Loading PDF Page ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        int i1 = this.e;
        localObject2 = i1;
        localObject1 = ProgressDialog.show(this, "Loading", (CharSequence)localObject2, bool, bool);
        this.h = ((ProgressDialog)localObject1);
        m = this.e;
        float f1 = this.f;
        a(m, f1);
      }
    }
  }
  
  private void p()
  {
    int m = 1;
    Object localObject1 = this.d;
    if (localObject1 != null)
    {
      int n = this.e;
      if (n > m)
      {
        int i1 = this.e + -1;
        this.e = i1;
        this.b.a.setEnabled(m);
        this.b.b.setEnabled(m);
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "Loading PDF Page ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        int i2 = this.e;
        localObject2 = i2;
        localObject1 = ProgressDialog.show(this, "Loading", (CharSequence)localObject2, m, m);
        this.h = ((ProgressDialog)localObject1);
        i1 = this.e;
        float f1 = this.f;
        a(i1, f1);
      }
    }
  }
  
  private void q()
  {
    PDFFile localPDFFile = this.d;
    if (localPDFFile != null)
    {
      int m = 1;
      showDialog(m);
    }
  }
  
  public abstract int a();
  
  public void a(File paramFile, String paramString)
  {
    Object localObject1 = new java/io/RandomAccessFile;
    ((RandomAccessFile)localObject1).<init>(paramFile, "r");
    localObject1 = ((RandomAccessFile)localObject1).getChannel();
    Object localObject2 = FileChannel.MapMode.READ_ONLY;
    long l1 = 0L;
    long l2 = ((FileChannel)localObject1).size();
    localObject1 = c.a.a.b.b.a(((FileChannel)localObject1).map((FileChannel.MapMode)localObject2, l1, l2));
    if (paramString == null)
    {
      localObject2 = new com/sun/pdfview/PDFFile;
      ((PDFFile)localObject2).<init>((c.a.a.b.b)localObject1);
    }
    for (this.d = ((PDFFile)localObject2);; this.d = ((PDFFile)localObject2))
    {
      localObject1 = this.b;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Anzahl Seiten:");
      int m = this.d.getNumPages();
      localObject2 = m;
      b.a.a((b.a)localObject1, (String)localObject2);
      return;
      localObject2 = new com/sun/pdfview/PDFFile;
      PDFPassword localPDFPassword = new com/sun/pdfview/decrypt/PDFPassword;
      localPDFPassword.<init>(paramString);
      ((PDFFile)localObject2).<init>((c.a.a.b.b)localObject1, localPDFPassword);
    }
  }
  
  public abstract int b();
  
  public abstract int c();
  
  public abstract int d();
  
  public abstract int e();
  
  public abstract int f();
  
  public abstract int g();
  
  public abstract int h();
  
  public abstract int i();
  
  public abstract int j();
  
  public void onCreate(Bundle paramBundle)
  {
    int m = 1;
    super.onCreate(paramBundle);
    Object localObject1 = "onCreate";
    Log.i("PDFVIEWER", (String)localObject1);
    Object localObject2 = new android/os/Handler;
    ((Handler)localObject2).<init>();
    this.k = ((Handler)localObject2);
    k();
    localObject2 = this.a;
    if (localObject2 != null)
    {
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a;
      ((b.a)localObject2).<init>(this, this);
      this.b = ((b.a)localObject2);
      localObject2 = this.b;
      localObject1 = b.a.a(this.a);
      b.a.a((b.a)localObject2, (Bitmap)localObject1);
      this.a = null;
      localObject2 = b.a.b(this.b);
      localObject1 = b.a.a(this.b);
      ((ImageView)localObject2).setImageBitmap((Bitmap)localObject1);
      this.b.a();
      localObject2 = this.b;
      setContentView((View)localObject2);
      return;
    }
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$a;
    ((b.a)localObject2).<init>(this, this);
    this.b = ((b.a)localObject2);
    localObject2 = getIntent();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    String str = "";
    localObject3 = str + localObject2;
    Log.i("PDFVIEWER", (String)localObject3);
    com.sun.pdfview.PDFImage.sShowImages = getIntent().getBooleanExtra("net.sf.andpdf.extra.SHOWIMAGES", m);
    com.sun.pdfview.PDFPaint.s_doAntiAlias = getIntent().getBooleanExtra("net.sf.andpdf.extra.ANTIALIAS", m);
    com.sun.pdfview.font.PDFFont.sUseFontSubstitution = getIntent().getBooleanExtra("net.sf.andpdf.extra.USEFONTSUBSTITUTION", false);
    localObject1 = getIntent();
    localObject3 = "net.sf.andpdf.extra.KEEPCACHES";
    boolean bool = ((Intent)localObject1).getBooleanExtra((String)localObject3, false);
    a.a = bool;
    if (localObject2 != null)
    {
      localObject1 = "android.intent.action.VIEW";
      localObject3 = ((Intent)localObject2).getAction();
      bool = ((String)localObject1).equals(localObject3);
      if (!bool) {
        break label363;
      }
      localObject2 = ((Intent)localObject2).getData();
      localObject2 = a((Uri)localObject2);
    }
    for (this.c = ((String)localObject2);; this.c = ((String)localObject2))
    {
      localObject2 = this.c;
      if (localObject2 == null)
      {
        localObject2 = "no file selected";
        this.c = ((String)localObject2);
      }
      this.e = m;
      float f1 = 1.79F;
      this.f = f1;
      a(null);
      break;
      label363:
      localObject2 = getIntent();
      localObject1 = "net.sf.andpdf.extra.PDFFILENAME";
      localObject2 = ((Intent)localObject2).getStringExtra((String)localObject1);
    }
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    int m = 0;
    Object localObject1 = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return (Dialog)localObject1;
      Object localObject2 = LayoutInflater.from(this);
      int n = f();
      localObject2 = ((LayoutInflater)localObject2).inflate(n, null);
      m = j();
      localObject1 = (EditText)((View)localObject2).findViewById(m);
      n = this.e;
      Object localObject3 = Integer.toString(n);
      ((EditText)localObject1).setText((CharSequence)localObject3);
      localObject3 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$5;
      ((b.5)localObject3).<init>(this, (EditText)localObject1);
      ((EditText)localObject1).setOnEditorActionListener((TextView.OnEditorActionListener)localObject3);
      localObject3 = new android/app/AlertDialog$Builder;
      ((AlertDialog.Builder)localObject3).<init>(this);
      localObject2 = ((AlertDialog.Builder)localObject3).setTitle("Jump to page").setView((View)localObject2);
      b.7 local7 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$7;
      local7.<init>(this, (EditText)localObject1);
      localObject1 = ((AlertDialog.Builder)localObject2).setPositiveButton("OK", local7);
      localObject2 = "Cancel";
      localObject3 = new id/ac/ugm/presensi/presensimahasiswa/utils/Activities/b$6;
      ((b.6)localObject3).<init>(this);
      localObject1 = ((AlertDialog.Builder)localObject1).setNegativeButton((CharSequence)localObject2, (DialogInterface.OnClickListener)localObject3).create();
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    int m = 1;
    super.onCreateOptionsMenu(paramMenu);
    MenuItem localMenuItem = paramMenu.add(0, 2, 0, "Previous Page");
    int n = a();
    localMenuItem.setIcon(n);
    localMenuItem = paramMenu.add(0, m, 0, "Next Page");
    n = b();
    localMenuItem.setIcon(n);
    paramMenu.add(0, 3, 0, "Goto Page");
    localMenuItem = paramMenu.add(0, 5, 0, "Zoom Out");
    n = d();
    localMenuItem.setIcon(n);
    String str = "Zoom In";
    localMenuItem = paramMenu.add(0, 4, 0, str);
    n = c();
    localMenuItem.setIcon(n);
    boolean bool = a.a;
    if (bool)
    {
      int i1 = 7;
      str = "Clear Caches";
      paramMenu.add(0, i1, 0, str);
    }
    return m;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    File localFile = this.g;
    if (localFile != null)
    {
      this.g.delete();
      localFile = null;
      this.g = null;
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    super.onOptionsItemSelected(paramMenuItem);
    int m = paramMenuItem.getItemId();
    switch (m)
    {
    }
    for (;;)
    {
      return true;
      o();
      continue;
      p();
      continue;
      q();
      continue;
      m();
      continue;
      n();
      continue;
      finish();
      continue;
      a.a();
    }
  }
  
  public Object onRetainNonConfigurationInstance()
  {
    Log.e("PDFVIEWER", "onRetainNonConfigurationInstance");
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Activities\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */