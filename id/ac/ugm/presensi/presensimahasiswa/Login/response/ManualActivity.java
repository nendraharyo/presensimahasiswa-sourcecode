package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.app.PendingIntent;
import android.app.ProgressDialog;
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
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import b.a.a.a.b.h;
import com.crashlytics.android.Crashlytics;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.ResponseHandlerInterface;
import id.ac.ugm.presensi.presensimahasiswa.b;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.c.a;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.d;
import id.ac.ugm.presensi.presensimahasiswa.utils.e;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
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
import java.util.Locale;

public class ManualActivity
  extends b
{
  ProgressDialog a;
  EditText b;
  EditText c;
  Button d;
  TextView e;
  private NfcAdapter f;
  private PendingIntent g;
  private NdefMessage h;
  private File i;
  private final Handler j;
  private boolean k;
  private PersistentCookieStore l;
  private SparseArray m;
  
  public ManualActivity()
  {
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    this.j = localHandler;
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
  
  private void a(SparseArray paramSparseArray)
  {
    int n = 3;
    int i1 = 2;
    int i2 = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "Fail to read sector binary";
    if (paramSparseArray != null)
    {
      localObject1 = (String[])paramSparseArray.get(0);
      if (localObject1 != null) {
        localObject1 = localObject1[i2];
      }
      int i3 = paramSparseArray.size();
      if (i3 != 0)
      {
        i3 = Common.g();
        int i4 = i3;
        i3 = Common.h();
        if (i4 <= i3)
        {
          localObject1 = (String[])paramSparseArray.get(i4);
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          Object localObject3 = "+Sector: ";
          localObject2 = (String)localObject3 + i4;
          localArrayList.add(localObject2);
          if (localObject1 != null)
          {
            int i5 = 6;
            if (i4 == i5)
            {
              localObject2 = e.a(localObject1[0]);
              localObject3 = new byte[4];
              int i6 = localObject2[n];
              localObject3[0] = i6;
              i6 = localObject2[i1];
              localObject3[i2] = i6;
              i6 = localObject2[i2];
              localObject3[i1] = i6;
              i5 = localObject2[0];
              localObject3[n] = i5;
              localObject2 = e.a((byte[])localObject3, false);
              int i7 = 16;
              double d1 = Long.parseLong((String)localObject2, i7) - 1408L;
              double d2 = 4096.0D;
              d1 /= d2;
              long l1 = Math.round(d1);
              i5 = (int)l1;
            }
            Collections.addAll(localArrayList, (Object[])localObject1);
          }
          for (;;)
          {
            i3 = i4 + 1;
            i4 = i3;
            break;
            localObject1 = "*No keys found or dead sector";
            localArrayList.add(localObject1);
          }
        }
      }
      else
      {
        i3 = 2131689737;
        localObject1 = Toast.makeText(this, i3, i2);
        ((Toast)localObject1).show();
      }
    }
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4)
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
    ((RequestParams)localObject1).add(paramString3, paramString4);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    ((RequestParams)localObject1).add("username", paramString1);
    ((RequestParams)localObject1).add("password", paramString2);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.g;
    localObject3 = (String)localObject2;
    localObject2 = this.l;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/ManualActivity$4;
    ((ManualActivity.4)localObject2).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject2);
  }
  
  public static boolean a()
  {
    Runtime localRuntime = Runtime.getRuntime();
    Process localProcess = localRuntime.exec("ping -c 1 google.com");
    int n = localProcess.waitFor();
    if (n == 0) {
      n = 1;
    }
    for (;;)
    {
      return n;
      int i1 = 0;
      localProcess = null;
    }
  }
  
  private void d()
  {
    int n = 1;
    String str1 = this.b.getText().toString();
    String str2 = this.c.getText().toString();
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str3 = id.ac.ugm.presensi.presensimahasiswa.a.a;
    localObject2 = ((StringBuilder)localObject2).append(str3).append(":");
    str3 = id.ac.ugm.presensi.presensimahasiswa.a.b;
    localObject2 = Base64.encodeToString(str3.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    RequestParams localRequestParams = new com/loopj/android/http/RequestParams;
    localRequestParams.<init>();
    localObject1 = new android/app/ProgressDialog;
    ((ProgressDialog)localObject1).<init>(this);
    this.a = ((ProgressDialog)localObject1);
    this.a.setMessage("Loading, please wait..");
    this.a.setCancelable(false);
    this.a.setIndeterminate(n);
    this.a.show();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.d;
    localObject1 = (String)localObject2;
    localAsyncHttpClient.setMaxRetriesAndTimeout(n, 999);
    localObject2 = this.l;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/ManualActivity$3;
    ((ManualActivity.3)localObject2).<init>(this, str1, str2);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  private void e()
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
        break label179;
      }
      if (bool1) {
        break;
      }
      boolean bool2 = Common.b(this);
      if (bool2) {
        break;
      }
      i2 = n + 1;
      n = i2;
    }
    Object localObject2 = Common.a("/PresensiUGM/key-files").listFiles();
    int i4 = localObject2.length;
    int i2 = 0;
    localObject1 = null;
    while (i2 < i4)
    {
      Object localObject3 = localObject2[i2];
      ((File)localObject3).delete();
      i2 += 1;
    }
    f();
    localObject2 = Common.b().edit();
    localObject1 = c.a.e;
    String str3 = ((c.a)localObject1).toString();
    if (!bool1) {
      i2 = 1;
    }
    for (;;)
    {
      localObject1 = ((SharedPreferences.Editor)localObject2).putBoolean(str3, i2);
      ((SharedPreferences.Editor)localObject1).commit();
      break;
      int i3 = 0;
      localObject1 = null;
    }
    label179:
    localObject1 = Common.b().edit();
    str1 = c.a.e.toString();
    ((SharedPreferences.Editor)localObject1).putBoolean(str1, bool1).commit();
  }
  
  private void f()
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
  
  private void g()
  {
    d locald = Common.c(this);
    if (locald == null) {}
    for (;;)
    {
      return;
      Thread localThread = new java/lang/Thread;
      ManualActivity.5 local5 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/ManualActivity$5;
      local5.<init>(this, locald);
      localThread.<init>(local5);
      localThread.start();
    }
  }
  
  public void b()
  {
    int n = 1;
    Toast.makeText(getBaseContext(), "Login failed", n).show();
    this.d.setEnabled(n);
  }
  
  public boolean c()
  {
    int n = 2;
    EditText localEditText = null;
    int i1 = 1;
    Object localObject = this.b.getText().toString();
    String str1 = this.c.getText().toString();
    boolean bool1 = ((String)localObject).isEmpty();
    if (bool1)
    {
      localObject = this.b;
      String str2 = "enter a valid username";
      ((EditText)localObject).setError(str2);
      this.b.requestFocus();
      ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(n, i1);
      bool1 = false;
      localObject = null;
      boolean bool2 = str1.isEmpty();
      if (!bool2)
      {
        int i3 = str1.length();
        int i2 = 3;
        if (i3 >= i2) {
          break label186;
        }
      }
      localObject = this.c;
      str1 = "minimal 3 characters";
      ((EditText)localObject).setError(str1);
      this.c.requestFocus();
      ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(n, i1);
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return bool1;
      localObject = this.b;
      ((EditText)localObject).setError(null);
      bool1 = i1;
      break;
      label186:
      localEditText = this.c;
      localEditText.setError(null);
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
      int n = -1;
      if (paramInt2 != n)
      {
        n = 4;
        if (paramInt2 == n) {}
        finish();
      }
      else
      {
        g();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int n = 1;
    super.onCreate(paramBundle);
    setContentView(2131427359);
    Object localObject1 = new Kit[n];
    Object localObject2 = new com/crashlytics/android/Crashlytics;
    ((Crashlytics)localObject2).<init>();
    localObject1[0] = localObject2;
    Fabric.with(this, (Kit[])localObject1);
    localObject1 = new com/loopj/android/http/PersistentCookieStore;
    ((PersistentCookieStore)localObject1).<init>(this);
    this.l = ((PersistentCookieStore)localObject1);
    localObject1 = (EditText)findViewById(2131296358);
    this.b = ((EditText)localObject1);
    localObject1 = (EditText)findViewById(2131296464);
    this.c = ((EditText)localObject1);
    localObject1 = (Button)findViewById(2131296417);
    this.d = ((Button)localObject1);
    localObject1 = (TextView)findViewById(2131296372);
    this.e = ((TextView)localObject1);
    f.a(this, "no_dialog_open", n);
    localObject1 = NfcAdapter.getDefaultAdapter(this);
    this.f = ((NfcAdapter)localObject1);
    localObject1 = new android/content/Intent;
    localObject2 = getClass();
    ((Intent)localObject1).<init>(this, (Class)localObject2);
    int i1 = 536870912;
    localObject1 = ((Intent)localObject1).addFlags(i1);
    localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 0);
    this.g = ((PendingIntent)localObject1);
    localObject1 = new android/nfc/NdefMessage;
    localObject2 = new NdefRecord[n];
    Locale localLocale = Locale.ENGLISH;
    NdefRecord localNdefRecord = a("Message from NFC Reader :-)", localLocale, n);
    localObject2[0] = localNdefRecord;
    ((NdefMessage)localObject1).<init>((NdefRecord[])localObject2);
    this.h = ((NdefMessage)localObject1);
    boolean bool = Common.a(this);
    if (bool) {
      e();
    }
    for (;;)
    {
      localObject1 = this.d;
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/ManualActivity$1;
      ((ManualActivity.1)localObject2).<init>(this);
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      localObject1 = this.e;
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/ManualActivity$2;
      ((ManualActivity.2)localObject2).<init>(this);
      ((TextView)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      return;
      localObject1 = new String[n];
      localObject2 = "android.permission.WRITE_EXTERNAL_STORAGE";
      localObject1[0] = localObject2;
      android.support.v4.app.a.a(this, (String[])localObject1, n);
    }
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
    if (bool3) {}
  }
  
  public void onPause()
  {
    super.onPause();
    this.k = false;
    NfcAdapter localNfcAdapter = this.f;
    if (localNfcAdapter != null)
    {
      this.f.disableForegroundDispatch(this);
      localNfcAdapter = this.f;
      localNfcAdapter.disableForegroundNdefPush(this);
    }
  }
  
  public void onResume()
  {
    NdefMessage localNdefMessage = null;
    super.onResume();
    Object localObject = this.f;
    if (localObject != null)
    {
      NfcAdapter localNfcAdapter = this.f;
      PendingIntent localPendingIntent = this.g;
      localObject = (String[][])null;
      localNfcAdapter.enableForegroundDispatch(this, localPendingIntent, null, null);
      localObject = this.f;
      localNdefMessage = this.h;
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
    this.i = ((File)localObject1);
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
      localObject1 = this.i;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\ManualActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */