package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.a;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.c.a;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;
import id.ac.ugm.presensi.presensimahasiswa.utils.e;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

public class HomeActivity
  extends id.ac.ugm.presensi.presensimahasiswa.b
  implements FragmentDrawer.b
{
  Toolbar a;
  Fragment b;
  private FragmentDrawer c;
  private NfcAdapter d;
  private PendingIntent e;
  private NdefMessage f;
  private File g;
  private int h;
  private int i;
  private int j;
  private final Handler k;
  private boolean l;
  private SparseArray m;
  
  public HomeActivity()
  {
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    this.k = localHandler;
  }
  
  private NdefRecord a(String paramString, Locale paramLocale, boolean paramBoolean)
  {
    short s = 1;
    byte[] arrayOfByte1 = null;
    Object localObject1 = paramLocale.getLanguage();
    Object localObject2 = Charset.forName("US-ASCII");
    localObject2 = ((String)localObject1).getBytes((Charset)localObject2);
    byte[] arrayOfByte2;
    int n;
    if (paramBoolean)
    {
      localObject1 = Charset.forName("UTF-8");
      arrayOfByte2 = paramString.getBytes((Charset)localObject1);
      if (!paramBoolean) {
        break label184;
      }
      n = 0;
      localObject1 = null;
    }
    for (;;)
    {
      int i1 = localObject2.length;
      n = (char)(n + i1);
      i1 = localObject2.length + 1;
      int i2 = arrayOfByte2.length;
      byte[] arrayOfByte3 = new byte[i1 + i2];
      n = (byte)n;
      arrayOfByte3[0] = n;
      n = localObject2.length;
      System.arraycopy(localObject2, 0, arrayOfByte3, s, n);
      n = localObject2.length + 1;
      int i3 = arrayOfByte2.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, n, i3);
      localObject1 = new android/nfc/NdefRecord;
      localObject2 = NdefRecord.RTD_TEXT;
      arrayOfByte1 = new byte[0];
      ((NdefRecord)localObject1).<init>(s, (byte[])localObject2, arrayOfByte1, arrayOfByte3);
      return (NdefRecord)localObject1;
      localObject1 = Charset.forName("UTF-16");
      break;
      label184:
      n = 128;
    }
  }
  
  private void a()
  {
    String str1 = null;
    Object localObject1 = Common.b();
    String str2 = c.a.e.toString();
    boolean bool1 = ((SharedPreferences)localObject1).getBoolean(str2, false);
    int n = 0;
    str2 = null;
    for (;;)
    {
      int i1 = 2;
      if (n >= i1) {
        break label237;
      }
      if (bool1) {
        break;
      }
      boolean bool2 = Common.b(this);
      if (bool2) {
        break;
      }
      int i2 = n + 1;
      n = i2;
    }
    Common.a("/PresensiUGM/key-files");
    localObject1 = Common.a("/PresensiUGM/dump-files");
    boolean bool3 = ((File)localObject1).exists();
    int i3;
    if (!bool3)
    {
      i3 = ((File)localObject1).mkdirs();
      if (i3 != 0) {}
    }
    for (;;)
    {
      return;
      localObject1 = Common.a("/PresensiUGM/tmp");
      bool3 = ((File)localObject1).exists();
      if (!bool3)
      {
        bool3 = ((File)localObject1).mkdirs();
        if (!bool3) {}
      }
      else
      {
        Object localObject2 = ((File)localObject1).listFiles();
        int i6 = localObject2.length;
        i3 = 0;
        localObject1 = null;
        int i4;
        while (i3 < i6)
        {
          Object localObject3 = localObject2[i3];
          ((File)localObject3).delete();
          i3 += 1;
        }
        b();
        localObject2 = Common.b().edit();
        localObject1 = c.a.e;
        String str3 = ((c.a)localObject1).toString();
        if (!bool1) {
          i4 = 1;
        }
        for (;;)
        {
          localObject1 = ((SharedPreferences.Editor)localObject2).putBoolean(str3, i4);
          ((SharedPreferences.Editor)localObject1).commit();
          break;
          int i5 = 0;
          localObject1 = null;
        }
        label237:
        localObject1 = Common.b().edit();
        str1 = c.a.e.toString();
        localObject1 = ((SharedPreferences.Editor)localObject1).putBoolean(str1, bool1);
        ((SharedPreferences.Editor)localObject1).commit();
      }
    }
  }
  
  private void a(int paramInt)
  {
    int n = 2131689582;
    String str = getString(n);
    switch (paramInt)
    {
    }
    for (;;)
    {
      Object localObject = this.b;
      if (localObject != null)
      {
        localObject = getSupportFragmentManager().a();
        int i1 = 2131296330;
        Fragment localFragment = this.b;
        ((p)localObject).a(i1, localFragment);
        ((p)localObject).c();
        localObject = getSupportActionBar();
        ((ActionBar)localObject).setTitle(str);
      }
      return;
      localObject = new id/ac/ugm/presensi/presensimahasiswa/Home/response/b;
      ((b)localObject).<init>();
      this.b = ((Fragment)localObject);
      continue;
      n = 2131689815;
      str = getString(n);
      continue;
      n = 2131689767;
      str = getString(n);
    }
  }
  
  public static void a(Context paramContext, File paramFile)
  {
    Uri localUri = Uri.fromFile(paramFile);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.VIEW");
    String str1 = paramFile.toString();
    String str2 = ".doc";
    boolean bool = str1.contains(str2);
    if (!bool)
    {
      str1 = paramFile.toString();
      str2 = ".docx";
      bool = str1.contains(str2);
      if (!bool) {}
    }
    else
    {
      str1 = "application/msword";
      localIntent.setDataAndType(localUri, str1);
    }
    for (;;)
    {
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
      return;
      str1 = paramFile.toString();
      str2 = ".pdf";
      bool = str1.contains(str2);
      if (bool)
      {
        str1 = "application/pdf";
        localIntent.setDataAndType(localUri, str1);
      }
      else
      {
        str1 = paramFile.toString();
        str2 = ".ppt";
        bool = str1.contains(str2);
        if (!bool)
        {
          str1 = paramFile.toString();
          str2 = ".pptx";
          bool = str1.contains(str2);
          if (!bool) {}
        }
        else
        {
          str1 = "application/vnd.ms-powerpoint";
          localIntent.setDataAndType(localUri, str1);
          continue;
        }
        str1 = paramFile.toString();
        str2 = ".xls";
        bool = str1.contains(str2);
        if (!bool)
        {
          str1 = paramFile.toString();
          str2 = ".xlsx";
          bool = str1.contains(str2);
          if (!bool) {}
        }
        else
        {
          str1 = "application/vnd.ms-excel";
          localIntent.setDataAndType(localUri, str1);
          continue;
        }
        str1 = paramFile.toString();
        str2 = ".zip";
        bool = str1.contains(str2);
        if (!bool)
        {
          str1 = paramFile.toString();
          str2 = ".rar";
          bool = str1.contains(str2);
          if (!bool) {}
        }
        else
        {
          str1 = "application/x-wav";
          localIntent.setDataAndType(localUri, str1);
          continue;
        }
        str1 = paramFile.toString();
        str2 = ".rtf";
        bool = str1.contains(str2);
        if (bool)
        {
          str1 = "application/rtf";
          localIntent.setDataAndType(localUri, str1);
        }
        else
        {
          str1 = paramFile.toString();
          str2 = ".wav";
          bool = str1.contains(str2);
          if (!bool)
          {
            str1 = paramFile.toString();
            str2 = ".mp3";
            bool = str1.contains(str2);
            if (!bool) {}
          }
          else
          {
            str1 = "audio/x-wav";
            localIntent.setDataAndType(localUri, str1);
            continue;
          }
          str1 = paramFile.toString();
          str2 = ".gif";
          bool = str1.contains(str2);
          if (bool)
          {
            str1 = "image/gif";
            localIntent.setDataAndType(localUri, str1);
          }
          else
          {
            str1 = paramFile.toString();
            str2 = ".jpg";
            bool = str1.contains(str2);
            if (!bool)
            {
              str1 = paramFile.toString();
              str2 = ".jpeg";
              bool = str1.contains(str2);
              if (!bool)
              {
                str1 = paramFile.toString();
                str2 = ".png";
                bool = str1.contains(str2);
                if (!bool) {
                  break label554;
                }
              }
            }
            str1 = "image/jpeg";
            localIntent.setDataAndType(localUri, str1);
            continue;
            label554:
            str1 = paramFile.toString();
            str2 = ".txt";
            bool = str1.contains(str2);
            if (bool)
            {
              str1 = "text/plain";
              localIntent.setDataAndType(localUri, str1);
            }
            else
            {
              str1 = paramFile.toString();
              str2 = ".3gp";
              bool = str1.contains(str2);
              if (!bool)
              {
                str1 = paramFile.toString();
                str2 = ".mpg";
                bool = str1.contains(str2);
                if (!bool)
                {
                  str1 = paramFile.toString();
                  str2 = ".mpeg";
                  bool = str1.contains(str2);
                  if (!bool)
                  {
                    str1 = paramFile.toString();
                    str2 = ".mpe";
                    bool = str1.contains(str2);
                    if (!bool)
                    {
                      str1 = paramFile.toString();
                      str2 = ".mp4";
                      bool = str1.contains(str2);
                      if (!bool)
                      {
                        str1 = paramFile.toString();
                        str2 = ".avi";
                        bool = str1.contains(str2);
                        if (!bool) {
                          break label761;
                        }
                      }
                    }
                  }
                }
              }
              str1 = "video/*";
              localIntent.setDataAndType(localUri, str1);
              continue;
              label761:
              str1 = "*/*";
              localIntent.setDataAndType(localUri, str1);
            }
          }
        }
      }
    }
  }
  
  private void a(SparseArray paramSparseArray)
  {
    int n = 16;
    int i1 = 3;
    int i2 = 2;
    int i3 = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "Fail to read sector binary";
    String str1 = "";
    if (paramSparseArray != null)
    {
      localObject1 = (String[])paramSparseArray.get(0);
      if (localObject1 != null) {
        localObject1 = localObject1[i3];
      }
      int i4 = paramSparseArray.size();
      if (i4 == 0) {
        break label472;
      }
      i4 = Common.g();
      int i6 = i4;
      int i7 = 0;
      Object localObject2 = null;
      i4 = Common.h();
      if (i6 <= i4)
      {
        localObject1 = (String[])paramSparseArray.get(i6);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject4 = "+Sector: ";
        localObject3 = (String)localObject4 + i6;
        localArrayList.add(localObject3);
        if (localObject1 != null)
        {
          int i8 = 6;
          if (i6 == i8)
          {
            localObject2 = e.a(localObject1[0]);
            i8 = 4;
            localObject3 = new byte[i8];
            int i9 = localObject2[i1];
            localObject3[0] = i9;
            i9 = localObject2[i2];
            localObject3[i3] = i9;
            i9 = localObject2[i3];
            localObject3[i2] = i9;
            i7 = localObject2[0];
            localObject3[i1] = i7;
            localObject2 = e.a((byte[])localObject3, false);
            double d1 = Long.parseLong((String)localObject2, n) - 1408L;
            double d2 = 4096.0D;
            d1 /= d2;
            long l1 = Math.round(d1);
            i7 = (int)l1;
          }
          if (i6 == i2)
          {
            localObject3 = e.a(localObject1[i3]);
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            int i10 = 0;
            str1 = null;
            for (;;)
            {
              String str2 = e.a((byte[])localObject3, false);
              int i11 = str2.length();
              if (i10 >= i11) {
                break;
              }
              str2 = e.a((byte[])localObject3, false);
              int i12 = i10 + 2;
              str2 = str2.substring(i10, i12);
              i11 = (char)Integer.parseInt(str2, n);
              ((StringBuilder)localObject4).append(i11);
              i10 += 2;
            }
            str1 = ((StringBuilder)localObject4).toString();
          }
          Collections.addAll(localArrayList, (Object[])localObject1);
        }
        for (i4 = i7;; i4 = i7)
        {
          i6 += 1;
          i7 = i4;
          break;
          localObject1 = "*No keys found or dead sector";
          localArrayList.add(localObject1);
        }
      }
      localObject1 = this.b;
      boolean bool = localObject1 instanceof b;
      if (bool)
      {
        localObject1 = (b)this.b;
        ((b)localObject1).a(i7, str1);
      }
    }
    for (;;)
    {
      return;
      label472:
      int i5 = 2131689737;
      localObject1 = Toast.makeText(this, i5, i3);
      ((Toast)localObject1).show();
    }
  }
  
  private void a(d paramd)
  {
    Object localObject = paramd.b();
    int n = ((SparseArray)localObject).size();
    if (n == 0)
    {
      Common.a(null);
      n = 2131689734;
      int i1 = 1;
      localObject = Toast.makeText(this, n, i1);
      ((Toast)localObject).show();
    }
    for (;;)
    {
      return;
      localObject = paramd.b();
      Common.a((SparseArray)localObject);
      d();
    }
  }
  
  private void a(d paramd, Context paramContext)
  {
    Thread localThread = new java/lang/Thread;
    HomeActivity.3 local3 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/HomeActivity$3;
    local3.<init>(this, paramd);
    localThread.<init>(local3);
    localThread.start();
  }
  
  private void b()
  {
    Object localObject1 = Common.a("/PresensiUGM/key-files/std.keys");
    File localFile = Common.a("/PresensiUGM/key-files/extended-std.keys");
    Object localObject2 = getAssets();
    boolean bool1 = ((File)localObject1).exists();
    Object localObject3;
    if (!bool1) {
      localObject3 = "key-files/std.keys";
    }
    try
    {
      localObject3 = ((AssetManager)localObject2).open((String)localObject3);
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject1);
      Common.a((InputStream)localObject3, localFileOutputStream);
      ((InputStream)localObject3).close();
      localFileOutputStream.flush();
      localFileOutputStream.close();
    }
    catch (IOException localIOException2)
    {
      boolean bool2;
      for (;;) {}
    }
    bool2 = localFile.exists();
    if (!bool2) {
      localObject1 = "key-files/extended-std.keys";
    }
    try
    {
      localObject1 = ((AssetManager)localObject2).open((String)localObject1);
      localObject2 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject2).<init>(localFile);
      Common.a((InputStream)localObject1, (OutputStream)localObject2);
      ((InputStream)localObject1).close();
      ((OutputStream)localObject2).flush();
      ((OutputStream)localObject2).close();
      return;
    }
    catch (IOException localIOException1)
    {
      for (;;) {}
    }
  }
  
  private void c()
  {
    boolean bool1 = true;
    Object localObject1 = Common.b();
    Object localObject2 = c.a.b.toString();
    boolean bool2 = ((SharedPreferences)localObject1).getBoolean((String)localObject2, bool1);
    localObject2 = "";
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject3 = "std.keys";
    ((ArrayList)localObject1).add(localObject3);
    int i1 = ((ArrayList)localObject1).size();
    if (i1 > 0)
    {
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      boolean bool3 = localIterator.hasNext();
      if (bool3)
      {
        localObject1 = (String)localIterator.next();
        Object localObject4 = new java/io/File;
        File localFile = this.g;
        ((File)localObject4).<init>(localFile, (String)localObject1);
        boolean bool6 = ((File)localObject4).exists();
        if (!bool6) {
          break label403;
        }
        ((ArrayList)localObject3).add(localObject4);
        if (!bool2) {
          break label403;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject1 = ((StringBuilder)localObject4).append((String)localObject2).append((String)localObject1);
        localObject2 = "/";
      }
    }
    label257:
    label403:
    for (localObject1 = (String)localObject2;; localObject1 = localObject2)
    {
      localObject2 = localObject1;
      break;
      int i2 = ((ArrayList)localObject3).size();
      if (i2 > 0)
      {
        if (bool2)
        {
          localObject1 = getPreferences(0).edit();
          String str = "last_used_key_files";
          int i5 = ((String)localObject2).length() + -1;
          localObject2 = ((String)localObject2).substring(0, i5);
          ((SharedPreferences.Editor)localObject1).putString(str, (String)localObject2);
          ((SharedPreferences.Editor)localObject1).apply();
        }
        localObject2 = Common.c(this);
        if (localObject2 != null) {
          break label257;
        }
      }
      for (;;)
      {
        return;
        localObject1 = new File[((ArrayList)localObject3).size()];
        localObject1 = (File[])((ArrayList)localObject3).toArray((Object[])localObject1);
        boolean bool4 = ((d)localObject2).a((File[])localObject1, this);
        if (!bool4)
        {
          ((d)localObject2).g();
        }
        else
        {
          localObject1 = getWindow();
          ((Window)localObject1).addFlags(128);
          this.h = 0;
          int i3 = ((d)localObject2).d() + -1;
          this.i = i3;
          i3 = this.h;
          int n = this.i;
          boolean bool5 = ((d)localObject2).a(i3, n);
          if (!bool5)
          {
            ((d)localObject2).g();
          }
          else
          {
            int i4 = this.h;
            n = this.i;
            Common.a(i4, n);
            i4 = -1;
            this.j = i4;
            this.l = bool1;
            a((d)localObject2, this);
          }
        }
      }
    }
  }
  
  private void d()
  {
    d locald = Common.c(this);
    if (locald == null) {}
    for (;;)
    {
      return;
      Thread localThread = new java/lang/Thread;
      HomeActivity.4 local4 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/HomeActivity$4;
      local4.<init>(this, locald);
      localThread.<init>(local4);
      localThread.start();
    }
  }
  
  public void a(View paramView, int paramInt)
  {
    a(paramInt);
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    m localm = getSupportFragmentManager();
    int n = localm.d();
    int i1 = 1;
    if (n < i1) {
      finish();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    int n = 2131296374;
    int i1 = 1;
    super.onCreate(paramBundle);
    setContentView(2131427357);
    Object localObject1 = (Toolbar)findViewById(2131296556);
    this.a = ((Toolbar)localObject1);
    localObject1 = this.a;
    setSupportActionBar((Toolbar)localObject1);
    localObject1 = (FragmentDrawer)getSupportFragmentManager().a(n);
    this.c = ((FragmentDrawer)localObject1);
    Object localObject2 = this.c;
    localObject1 = (DrawerLayout)findViewById(2131296356);
    Object localObject3 = this.a;
    ((FragmentDrawer)localObject2).a(n, (DrawerLayout)localObject1, (Toolbar)localObject3);
    this.c.a(this);
    a(0);
    localObject1 = NfcAdapter.getDefaultAdapter(this);
    this.d = ((NfcAdapter)localObject1);
    localObject1 = new android/content/Intent;
    localObject2 = getClass();
    ((Intent)localObject1).<init>(this, (Class)localObject2);
    int i2 = 536870912;
    localObject1 = ((Intent)localObject1).addFlags(i2);
    localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 0);
    this.e = ((PendingIntent)localObject1);
    localObject1 = new android/nfc/NdefMessage;
    localObject2 = new NdefRecord[i1];
    Locale localLocale = Locale.ENGLISH;
    localObject3 = a("Message from NFC Reader :-)", localLocale, i1);
    localObject2[0] = localObject3;
    ((NdefMessage)localObject1).<init>((NdefRecord[])localObject2);
    this.f = ((NdefMessage)localObject1);
    boolean bool = Common.a(this);
    if (bool) {
      a();
    }
    for (;;)
    {
      return;
      localObject1 = new String[i1];
      localObject2 = "android.permission.WRITE_EXTERNAL_STORAGE";
      localObject1[0] = localObject2;
      a.a(this, (String[])localObject1, i1);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131492865, paramMenu);
    return true;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    int n = 0;
    setIntent(paramIntent);
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = "android.nfc.action.TAG_DISCOVERED";
    boolean bool1 = ((String)localObject2).equals(localObject1);
    if (!bool1)
    {
      localObject2 = "android.nfc.action.TECH_DISCOVERED";
      bool1 = ((String)localObject2).equals(localObject1);
      if (!bool1)
      {
        localObject2 = "android.nfc.action.NDEF_DISCOVERED";
        boolean bool2 = ((String)localObject2).equals(localObject1);
        if (!bool2) {
          return;
        }
      }
    }
    Common.a(d.a((Tag)paramIntent.getParcelableExtra("android.nfc.extra.TAG")));
    localObject1 = "android.nfc.extra.NDEF_MESSAGES";
    localObject2 = paramIntent.getParcelableArrayExtra((String)localObject1);
    if (localObject2 != null)
    {
      int i1 = localObject2.length;
      NdefMessage[] arrayOfNdefMessage = new NdefMessage[i1];
      for (;;)
      {
        i1 = localObject2.length;
        if (n >= i1) {
          break;
        }
        localObject1 = (NdefMessage)localObject2[n];
        arrayOfNdefMessage[n] = localObject1;
        i1 = n + 1;
        n = i1;
      }
    }
    localObject1 = new byte[0];
    paramIntent.getByteArrayExtra("android.nfc.extra.ID");
    ((Tag)paramIntent.getParcelableExtra("android.nfc.extra.TAG")).getId();
    localObject1 = "no_dialog_open";
    boolean bool3 = f.b(this, (String)localObject1, false);
    if (bool3) {
      c();
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    int n = paramMenuItem.getItemId();
    int i2 = 2131296281;
    Object localObject1;
    Object localObject3;
    Object localObject4;
    int i1;
    String str;
    if (n == i2)
    {
      getIntent();
      localObject1 = getApplicationContext();
      localObject3 = "";
      localObject1 = f.b((Context)localObject1, "data_history", (String)localObject3);
      localObject4 = "";
      i1 = ((String)localObject1).equalsIgnoreCase((String)localObject4);
      if (i1 == 0)
      {
        localObject4 = "/storage/emulated/0/Download/temp.pdf";
        localObject1 = getApplicationContext();
        localObject3 = "data_history";
        str = "";
        localObject1 = Base64.decode(f.b((Context)localObject1, (String)localObject3, str), 0);
      }
    }
    for (;;)
    {
      try
      {
        localObject3 = new java/io/FileOutputStream;
        str = null;
        ((FileOutputStream)localObject3).<init>((String)localObject4, false);
        ((FileOutputStream)localObject3).write((byte[])localObject1);
        ((FileOutputStream)localObject3).flush();
        ((FileOutputStream)localObject3).close();
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        localFileNotFoundException.printStackTrace();
        continue;
      }
      catch (IOException localIOException1)
      {
        localIOException1.printStackTrace();
        continue;
      }
      try
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((String)localObject4);
        localObject4 = getApplicationContext();
        a((Context)localObject4, (File)localObject1);
      }
      catch (IOException localIOException2)
      {
        localIOException2.printStackTrace();
        continue;
      }
      return bool;
      i2 = 2131296275;
      if (i1 == i2)
      {
        Object localObject2 = new android/app/AlertDialog$Builder;
        ((AlertDialog.Builder)localObject2).<init>(this);
        localObject4 = getResources();
        int i3 = 2131689788;
        localObject4 = ((Resources)localObject4).getString(i3);
        ((AlertDialog.Builder)localObject2).setMessage((CharSequence)localObject4);
        ((AlertDialog.Builder)localObject2).setCancelable(false);
        localObject3 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/HomeActivity$1;
        ((HomeActivity.1)localObject3).<init>(this);
        ((AlertDialog.Builder)localObject2).setNegativeButton("Tidak", (DialogInterface.OnClickListener)localObject3);
        localObject4 = "Ya";
        localObject3 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/HomeActivity$2;
        ((HomeActivity.2)localObject3).<init>(this);
        ((AlertDialog.Builder)localObject2).setPositiveButton((CharSequence)localObject4, (DialogInterface.OnClickListener)localObject3);
        localObject2 = ((AlertDialog.Builder)localObject2).create();
        ((AlertDialog)localObject2).show();
      }
      else
      {
        bool = super.onOptionsItemSelected(paramMenuItem);
      }
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.l = false;
    NfcAdapter localNfcAdapter = this.d;
    if (localNfcAdapter != null)
    {
      this.d.disableForegroundDispatch(this);
      localNfcAdapter = this.d;
      localNfcAdapter.disableForegroundNdefPush(this);
    }
  }
  
  public void onResume()
  {
    NdefMessage localNdefMessage = null;
    super.onResume();
    Object localObject = this.d;
    if (localObject != null)
    {
      NfcAdapter localNfcAdapter = this.d;
      PendingIntent localPendingIntent = this.e;
      localObject = (String[][])null;
      localNfcAdapter.enableForegroundDispatch(this, localPendingIntent, null, null);
      localObject = this.d;
      localNdefMessage = this.f;
      ((NfcAdapter)localObject).enableForegroundNdefPush(this, localNdefMessage);
    }
  }
  
  protected void onStart()
  {
    int n = 1;
    String str = null;
    super.onStart();
    Object localObject1 = new java/io/File;
    Object localObject2 = Common.a("/PresensiUGM/key-files").getAbsolutePath();
    ((File)localObject1).<init>((String)localObject2);
    this.g = ((File)localObject1);
    localObject1 = Common.b();
    localObject2 = c.a.e.toString();
    boolean bool1 = ((SharedPreferences)localObject1).getBoolean((String)localObject2, false);
    if (!bool1)
    {
      bool1 = Common.b(this);
      if (!bool1)
      {
        int i1 = 3;
        setResult(i1);
        finish();
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.g;
      boolean bool2 = ((File)localObject1).exists();
      if (!bool2)
      {
        setResult(n);
        finish();
      }
      else
      {
        localObject1 = Common.b();
        localObject2 = c.a.b.toString();
        bool2 = ((SharedPreferences)localObject1).getBoolean((String)localObject2, n);
        if (bool2)
        {
          localObject1 = getPreferences(0);
          localObject2 = "last_used_key_files";
          str = null;
          localObject1 = ((SharedPreferences)localObject1).getString((String)localObject2, null);
          if (localObject1 != null)
          {
            localObject2 = new java/util/ArrayList;
            str = "/";
            localObject1 = Arrays.asList(((String)localObject1).split(str));
            ((ArrayList)localObject2).<init>((Collection)localObject1);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\HomeActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */