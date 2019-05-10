package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.support.v4.app.m;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import b.a.a.a.b.h;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.ResponseHandlerInterface;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.g;
import id.ac.ugm.presensi.presensimahasiswa.b;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.c.a;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;
import id.ac.ugm.presensi.presensimahasiswa.utils.e;
import java.io.File;
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
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

public class AccountActivity
  extends b
{
  Button a;
  ProgressDialog b;
  EditText c;
  EditText d;
  EditText e;
  EditText f;
  private NfcAdapter g;
  private PendingIntent h;
  private NdefMessage i;
  private File j;
  private int k;
  private int l;
  private int m;
  private final Handler n;
  private boolean o;
  private PersistentCookieStore p;
  private Gson q;
  private g r;
  private String s;
  private String t;
  private String u;
  private SparseArray v;
  private JSONArray w;
  
  public AccountActivity()
  {
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    this.n = localHandler;
  }
  
  private NdefRecord a(String paramString, Locale paramLocale, boolean paramBoolean)
  {
    short s1 = 1;
    byte[] arrayOfByte1 = null;
    Object localObject1 = paramLocale.getLanguage();
    Object localObject2 = Charset.forName("US-ASCII");
    localObject2 = ((String)localObject1).getBytes((Charset)localObject2);
    byte[] arrayOfByte2;
    int i1;
    if (paramBoolean)
    {
      localObject1 = Charset.forName("UTF-8");
      arrayOfByte2 = paramString.getBytes((Charset)localObject1);
      if (!paramBoolean) {
        break label184;
      }
      i1 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      int i2 = localObject2.length;
      i1 = (char)(i1 + i2);
      i2 = localObject2.length + 1;
      int i3 = arrayOfByte2.length;
      byte[] arrayOfByte3 = new byte[i2 + i3];
      i1 = (byte)i1;
      arrayOfByte3[0] = i1;
      i1 = localObject2.length;
      System.arraycopy(localObject2, 0, arrayOfByte3, s1, i1);
      i1 = localObject2.length + 1;
      int i4 = arrayOfByte2.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, i1, i4);
      localObject1 = new android/nfc/NdefRecord;
      localObject2 = NdefRecord.RTD_TEXT;
      arrayOfByte1 = new byte[0];
      ((NdefRecord)localObject1).<init>(s1, (byte[])localObject2, arrayOfByte1, arrayOfByte3);
      return (NdefRecord)localObject1;
      localObject1 = Charset.forName("UTF-16");
      break;
      label184:
      i1 = 128;
    }
  }
  
  private void a()
  {
    String str1 = null;
    Object localObject1 = Common.b();
    String str2 = c.a.e.toString();
    boolean bool1 = ((SharedPreferences)localObject1).getBoolean(str2, false);
    int i1 = 0;
    str2 = null;
    for (;;)
    {
      int i2 = 2;
      if (i1 >= i2) {
        break label178;
      }
      if (bool1) {
        break;
      }
      boolean bool2 = Common.b(this);
      if (bool2) {
        break;
      }
      i3 = i1 + 1;
      i1 = i3;
    }
    Object localObject2 = Common.a("/PresensiUGM/key-files").listFiles();
    int i5 = localObject2.length;
    int i3 = 0;
    localObject1 = null;
    while (i3 < i5)
    {
      Object localObject3 = localObject2[i3];
      ((File)localObject3).delete();
      i3 += 1;
    }
    d();
    localObject2 = Common.b().edit();
    localObject1 = c.a.e;
    String str3 = ((c.a)localObject1).toString();
    if (!bool1) {
      i3 = 1;
    }
    for (;;)
    {
      localObject1 = ((SharedPreferences.Editor)localObject2).putBoolean(str3, i3);
      ((SharedPreferences.Editor)localObject1).commit();
      break;
      int i4 = 0;
      localObject1 = null;
    }
    label178:
    localObject1 = Common.b().edit();
    str1 = c.a.e.toString();
    ((SharedPreferences.Editor)localObject1).putBoolean(str1, bool1).commit();
  }
  
  private void a(SparseArray paramSparseArray)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    long l1 = 0L;
    double d1 = 0.0D;
    Object localObject1 = "";
    int i1;
    int i3;
    if (paramSparseArray != null)
    {
      i1 = 0;
      localObject1 = (String[])paramSparseArray.get(0);
      int i2;
      if (localObject1 != null)
      {
        i2 = 1;
        localObject1 = localObject1[i2];
      }
      i1 = paramSparseArray.size();
      if (i1 == 0) {
        break label495;
      }
      i1 = Common.g();
      int i4 = i1;
      i1 = Common.h();
      if (i4 <= i1)
      {
        localObject1 = (String[])paramSparseArray.get(i4);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = "+Sector: ";
        localObject2 = (String)localObject3 + i4;
        localArrayList.add(localObject2);
        int i7;
        if (localObject1 != null)
        {
          i2 = 6;
          if (i4 == i2)
          {
            localObject2 = e.a(localObject1[0]);
            byte[] arrayOfByte = new byte[5];
            int i5 = localObject2[4];
            arrayOfByte[0] = i5;
            i5 = localObject2[3];
            arrayOfByte[1] = i5;
            i5 = localObject2[2];
            arrayOfByte[2] = i5;
            i5 = localObject2[1];
            arrayOfByte[3] = i5;
            int i6 = 4;
            i5 = 0;
            localObject3 = null;
            i2 = localObject2[0];
            arrayOfByte[i6] = i2;
            localObject2 = e.a(arrayOfByte, false);
            i7 = 16;
            d1 = (Long.parseLong((String)localObject2, i7) - 1408L) / 1.0D;
            l1 = Math.round(d1);
            long l2 = 9000000000L;
            boolean bool = l1 < l2;
            if (bool)
            {
              l2 = 9000000000L;
              l1 -= l2;
            }
          }
          i3 = 2;
          if (i4 == i3)
          {
            localObject3 = e.a(localObject1[1]);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            i3 = 0;
            localObject2 = null;
            for (;;)
            {
              String str = e.a((byte[])localObject3, false);
              int i8 = str.length();
              if (i3 >= i8) {
                break;
              }
              str = e.a((byte[])localObject3, false);
              int i9 = i3 + 2;
              str = str.substring(i3, i9);
              i9 = 16;
              i8 = (char)Integer.parseInt(str, i9);
              localStringBuilder.append(i8);
              i3 += 2;
            }
            localStringBuilder.toString();
          }
          Collections.addAll(localArrayList, (Object[])localObject1);
        }
        for (long l3 = l1;; l3 = l1)
        {
          i7 = i4 + 1;
          i4 = i7;
          l1 = l3;
          break;
          localObject1 = "*No keys found or dead sector";
          localArrayList.add(localObject1);
        }
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = "";
      localObject1 = (String)localObject2 + l1;
      this.s = ((String)localObject1);
      b();
    }
    for (;;)
    {
      return;
      label495:
      i1 = 2131689737;
      i3 = 1;
      localObject1 = Toast.makeText(this, i1, i3);
      ((Toast)localObject1).show();
    }
  }
  
  private void a(d paramd)
  {
    SparseArray localSparseArray = paramd.b();
    int i1 = localSparseArray.size();
    if (i1 == 0)
    {
      i1 = 0;
      localSparseArray = null;
      Common.a(null);
    }
    for (;;)
    {
      return;
      localSparseArray = paramd.b();
      Common.a(localSparseArray);
      e();
    }
  }
  
  private void a(d paramd, Context paramContext)
  {
    Thread localThread = new java/lang/Thread;
    AccountActivity.7 local7 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$7;
    local7.<init>(this, paramd);
    localThread.<init>(local7);
    localThread.start();
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = id.ac.ugm.presensi.presensimahasiswa.a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = id.ac.ugm.presensi.presensimahasiswa.a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    localObject1 = new com/loopj/android/http/RequestParams;
    ((RequestParams)localObject1).<init>();
    Object localObject3 = (TelephonyManager)getSystemService("phone");
    localObject3 = Settings.Secure.getString(getContentResolver(), "android_id");
    ((RequestParams)localObject1).add(paramString2, paramString3);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    localObject2 = this.t;
    ((RequestParams)localObject1).add("username", (String)localObject2);
    localObject2 = this.u;
    ((RequestParams)localObject1).add("password", (String)localObject2);
    localObject3 = this.r.a();
    int i1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getApplicationContext(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(i1)).n();
    ((RequestParams)localObject1).add("user", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.k;
    localObject3 = (String)localObject2;
    localObject2 = this.p;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$4;
    ((AccountActivity.4)localObject2).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject2);
  }
  
  private void b()
  {
    int i1 = 1;
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = id.ac.ugm.presensi.presensimahasiswa.a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = id.ac.ugm.presensi.presensimahasiswa.a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    RequestParams localRequestParams = new com/loopj/android/http/RequestParams;
    localRequestParams.<init>();
    localObject1 = new android/app/ProgressDialog;
    ((ProgressDialog)localObject1).<init>(this);
    this.b = ((ProgressDialog)localObject1);
    this.b.setMessage("Loading, please wait..");
    this.b.setCancelable(false);
    this.b.setIndeterminate(i1);
    this.b.show();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.d;
    localObject1 = (String)localObject2;
    localAsyncHttpClient.setMaxRetriesAndTimeout(i1, 999);
    localObject2 = this.p;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$3;
    ((AccountActivity.3)localObject2).<init>(this);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  private void b(String paramString1, String paramString2, String paramString3)
  {
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = id.ac.ugm.presensi.presensimahasiswa.a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = id.ac.ugm.presensi.presensimahasiswa.a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    localObject1 = new com/loopj/android/http/RequestParams;
    ((RequestParams)localObject1).<init>();
    Object localObject3 = (TelephonyManager)getSystemService("phone");
    localObject3 = Settings.Secure.getString(getContentResolver(), "android_id");
    ((RequestParams)localObject1).add(paramString2, paramString3);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    ((RequestParams)localObject1).add("hris", paramString1);
    localObject3 = this.r.a();
    int i1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getApplicationContext(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(i1)).n();
    ((RequestParams)localObject1).add("user", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.l;
    localObject3 = (String)localObject2;
    localObject2 = this.p;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$5;
    ((AccountActivity.5)localObject2).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject2);
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
    int i2 = ((ArrayList)localObject1).size();
    if (i2 > 0)
    {
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      boolean bool3 = localIterator.hasNext();
      if (bool3)
      {
        localObject1 = (String)localIterator.next();
        Object localObject4 = new java/io/File;
        File localFile = this.j;
        ((File)localObject4).<init>(localFile, (String)localObject1);
        boolean bool6 = ((File)localObject4).exists();
        if (!bool6) {
          break label394;
        }
        ((ArrayList)localObject3).add(localObject4);
        if (!bool2) {
          break label394;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject1 = ((StringBuilder)localObject4).append((String)localObject2).append((String)localObject1);
        localObject2 = "/";
      }
    }
    label256:
    label394:
    for (localObject1 = (String)localObject2;; localObject1 = localObject2)
    {
      localObject2 = localObject1;
      break;
      int i3 = ((ArrayList)localObject3).size();
      if (i3 > 0)
      {
        if (bool2)
        {
          localObject1 = getPreferences(0).edit();
          String str = "last_used_key_files";
          int i6 = ((String)localObject2).length() + -1;
          localObject2 = ((String)localObject2).substring(0, i6);
          ((SharedPreferences.Editor)localObject1).putString(str, (String)localObject2);
          ((SharedPreferences.Editor)localObject1).apply();
        }
        localObject2 = Common.c(this);
        if (localObject2 != null) {
          break label256;
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
          this.k = 2;
          this.l = 6;
          int i4 = this.k;
          int i1 = this.l;
          boolean bool5 = ((d)localObject2).a(i4, i1);
          if (!bool5)
          {
            ((d)localObject2).g();
          }
          else
          {
            int i5 = this.k;
            i1 = this.l;
            Common.a(i5, i1);
            i5 = -1;
            this.m = i5;
            this.o = bool1;
            a((d)localObject2, this);
          }
        }
      }
    }
  }
  
  private void d()
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
  
  private void e()
  {
    d locald = Common.c(this);
    if (locald == null) {}
    for (;;)
    {
      return;
      Thread localThread = new java/lang/Thread;
      AccountActivity.6 local6 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$6;
      local6.<init>(this, locald);
      localThread.<init>(local6);
      localThread.start();
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      return;
      int i1 = -1;
      if (paramInt2 != i1)
      {
        i1 = 4;
        if (paramInt2 == i1) {}
        finish();
      }
      else
      {
        e();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    super.onCreate(paramBundle);
    setContentView(2131427387);
    Object localObject1 = new com/google/gson/Gson;
    ((Gson)localObject1).<init>();
    this.q = ((Gson)localObject1);
    localObject1 = new com/loopj/android/http/PersistentCookieStore;
    ((PersistentCookieStore)localObject1).<init>(this);
    this.p = ((PersistentCookieStore)localObject1);
    localObject1 = NfcAdapter.getDefaultAdapter(this);
    this.g = ((NfcAdapter)localObject1);
    localObject1 = new android/content/Intent;
    Object localObject2 = getClass();
    ((Intent)localObject1).<init>(this, (Class)localObject2);
    int i2 = 536870912;
    localObject1 = ((Intent)localObject1).addFlags(i2);
    localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 0);
    this.h = ((PendingIntent)localObject1);
    localObject1 = new android/nfc/NdefMessage;
    localObject2 = new NdefRecord[bool1];
    Object localObject3 = Locale.ENGLISH;
    Object localObject4 = a("Message from NFC Reader :-)", (Locale)localObject3, bool1);
    localObject2[0] = localObject4;
    ((NdefMessage)localObject1).<init>((NdefRecord[])localObject2);
    this.i = ((NdefMessage)localObject1);
    boolean bool3 = Common.a(this);
    int i4;
    if (bool3)
    {
      a();
      localObject1 = (Button)findViewById(2131296307);
      this.a = ((Button)localObject1);
      localObject1 = (EditText)findViewById(2131296403);
      this.d = ((EditText)localObject1);
      localObject1 = (EditText)findViewById(2131296404);
      this.f = ((EditText)localObject1);
      localObject1 = (EditText)findViewById(2131296561);
      this.c = ((EditText)localObject1);
      localObject1 = (EditText)findViewById(2131296560);
      this.e = ((EditText)localObject1);
      i4 = 2131296414;
      localObject1 = (LinearLayout)findViewById(i4);
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$1;
      ((AccountActivity.1)localObject2).<init>(this);
      ((LinearLayout)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      ((LinearLayout)localObject1).setVisibility(8);
      localObject1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, "at_current_mk", "");
      localObject2 = "";
      boolean bool2 = ((String)localObject1).equals(localObject2);
      if (!bool2) {
        break label642;
      }
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>();
      this.w = ((JSONArray)localObject1);
    }
    for (;;)
    {
      int i3 = this.w.length();
      localObject1 = this.d;
      localObject4 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, "username", "");
      ((EditText)localObject1).setText((CharSequence)localObject4);
      localObject1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, "data_local", "");
      localObject1 = (g)this.q.fromJson((String)localObject1, g.class);
      this.r = ((g)localObject1);
      localObject4 = this.f;
      localObject1 = this.r.a();
      int i5 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(getApplicationContext(), "kode_mk", 0);
      localObject1 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject1).get(i5)).g();
      ((EditText)localObject4).setText((CharSequence)localObject1);
      localObject1 = this.c;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = i3 + "";
      ((EditText)localObject1).setText((CharSequence)localObject4);
      localObject4 = this.e;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ((StringBuilder)localObject1).append("");
      localObject1 = this.r.a();
      Context localContext = getApplicationContext();
      String str = "kode_mk";
      int i1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(localContext, str, 0);
      i4 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject1).get(i1)).b() - i3;
      localObject1 = i4;
      ((EditText)localObject4).setText((CharSequence)localObject1);
      localObject1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, "username", "");
      localObject2 = "";
      boolean bool4 = ((String)localObject1).equals(localObject2);
      if (bool4)
      {
        localObject1 = this.d;
        localObject2 = "Triyogatama Wahyu Widodo, M.Kom.";
        ((EditText)localObject1).setText((CharSequence)localObject2);
      }
      id.ac.ugm.presensi.presensimahasiswa.utils.f.a(this, "presence", 10001);
      localObject1 = this.a;
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/AccountActivity$2;
      ((AccountActivity.2)localObject2).<init>(this);
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      return;
      localObject1 = new String[i1];
      localObject2 = "android.permission.WRITE_EXTERNAL_STORAGE";
      localObject1[0] = localObject2;
      android.support.v4.app.a.a(this, (String[])localObject1, i1);
      break;
      try
      {
        label642:
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>((String)localObject1);
        this.w = ((JSONArray)localObject2);
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
      }
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    int i1 = 0;
    String str = null;
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
      int i2 = localObject2.length;
      NdefMessage[] arrayOfNdefMessage = new NdefMessage[i2];
      for (;;)
      {
        i2 = localObject2.length;
        if (i1 >= i2) {
          break;
        }
        localObject1 = (NdefMessage)localObject2[i1];
        arrayOfNdefMessage[i1] = localObject1;
        i2 = i1 + 1;
        i1 = i2;
      }
    }
    localObject1 = new byte[0];
    paramIntent.getByteArrayExtra("android.nfc.extra.ID");
    ((Tag)paramIntent.getParcelableExtra("android.nfc.extra.TAG")).getId();
    localObject1 = "no_dialog_open";
    boolean bool3 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, (String)localObject1, false);
    if (bool3)
    {
      c();
      localObject1 = getSupportFragmentManager();
      str = "presence";
      localObject1 = (c)((m)localObject1).a(str);
      if (localObject1 != null)
      {
        bool3 = ((c)localObject1).isVisible();
        if (!bool3) {}
      }
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.o = false;
    NfcAdapter localNfcAdapter = this.g;
    if (localNfcAdapter != null)
    {
      this.g.disableForegroundDispatch(this);
      localNfcAdapter = this.g;
      localNfcAdapter.disableForegroundNdefPush(this);
    }
  }
  
  public void onResume()
  {
    NdefMessage localNdefMessage = null;
    super.onResume();
    Object localObject = this.g;
    if (localObject != null)
    {
      NfcAdapter localNfcAdapter = this.g;
      PendingIntent localPendingIntent = this.h;
      localObject = (String[][])null;
      localNfcAdapter.enableForegroundDispatch(this, localPendingIntent, null, null);
      localObject = this.g;
      localNdefMessage = this.i;
      ((NfcAdapter)localObject).enableForegroundNdefPush(this, localNdefMessage);
    }
  }
  
  public void onStart()
  {
    int i1 = 1;
    String str = null;
    super.onStart();
    Object localObject1 = new java/io/File;
    Object localObject2 = Common.a("/PresensiUGM/key-files").getAbsolutePath();
    ((File)localObject1).<init>((String)localObject2);
    this.j = ((File)localObject1);
    localObject1 = Common.b();
    localObject2 = c.a.e.toString();
    boolean bool1 = ((SharedPreferences)localObject1).getBoolean((String)localObject2, false);
    if (!bool1)
    {
      bool1 = Common.b(this);
      if (!bool1)
      {
        int i2 = 3;
        setResult(i2);
        finish();
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.j;
      boolean bool2 = ((File)localObject1).exists();
      if (!bool2)
      {
        setResult(i1);
        finish();
      }
      else
      {
        localObject1 = Common.b();
        localObject2 = c.a.b.toString();
        bool2 = ((SharedPreferences)localObject1).getBoolean((String)localObject2, i1);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\AccountActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */