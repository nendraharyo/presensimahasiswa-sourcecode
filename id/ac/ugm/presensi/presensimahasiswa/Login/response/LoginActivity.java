package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.location.Location;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import b.a.a.a.b.h;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.Geofence.Builder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class LoginActivity
  extends b
  implements LocationListener
{
  LocationRequest a;
  double b;
  double c;
  ProgressDialog d;
  Button e;
  Button f;
  private NfcAdapter g;
  private PendingIntent h;
  private NdefMessage i;
  private File j;
  private int k;
  private int l;
  private int m;
  private final Handler n;
  private boolean o;
  private List p;
  private GoogleApiClient q;
  private SparseArray r;
  private PersistentCookieStore s;
  private GoogleApiClient.ConnectionCallbacks t;
  private GoogleApiClient.OnConnectionFailedListener u;
  
  public LoginActivity()
  {
    Object localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.n = ((Handler)localObject);
    this.b = -7.780993177510204D;
    this.c = 110.37555307196455D;
    localObject = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$2;
    ((LoginActivity.2)localObject).<init>(this);
    this.t = ((GoogleApiClient.ConnectionCallbacks)localObject);
    localObject = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$3;
    ((LoginActivity.3)localObject).<init>(this);
    this.u = ((GoogleApiClient.OnConnectionFailedListener)localObject);
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
  
  private void a(long paramLong)
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
    this.d = ((ProgressDialog)localObject1);
    this.d.setMessage("Loading, please wait..");
    this.d.setCancelable(false);
    this.d.setIndeterminate(i1);
    this.d.show();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.d;
    localObject1 = (String)localObject2;
    localAsyncHttpClient.setMaxRetriesAndTimeout(i1, 999);
    localObject2 = this.s;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4;
    ((LoginActivity.4)localObject2).<init>(this, paramLong);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  private void a(long paramLong, String paramString1, String paramString2)
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
    ((RequestParams)localObject1).add(paramString1, paramString2);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = paramLong + "";
    ((RequestParams)localObject1).add("hris", (String)localObject2);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.e;
    localObject3 = (String)localObject2;
    localObject2 = this.s;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$5;
    ((LoginActivity.5)localObject2).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject2);
  }
  
  private void a(SparseArray paramSparseArray)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    long l1 = 0L;
    double d1 = 0.0D;
    Object localObject1 = "";
    if (paramSparseArray != null)
    {
      int i1 = 0;
      localObject1 = (String[])paramSparseArray.get(0);
      int i2;
      if (localObject1 != null)
      {
        i2 = 1;
        localObject1 = localObject1[i2];
      }
      i1 = paramSparseArray.size();
      int i3;
      if (i1 != 0)
      {
        i1 = Common.g();
        int i4 = i1;
        i1 = Common.h();
        if (i4 <= i1)
        {
          localObject1 = (String[])paramSparseArray.get(i4);
          Object localObject2 = new java/lang/StringBuilder;
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
      }
      else
      {
        i1 = 2131689737;
        i3 = 1;
        localObject1 = Toast.makeText(this, i1, i3);
        ((Toast)localObject1).show();
      }
    }
    localObject1 = getApplicationContext();
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject4 = l1 + "";
    f.a((Context)localObject1, "user_id", (String)localObject4);
    a(l1);
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
      f();
    }
  }
  
  private void a(d paramd, Context paramContext)
  {
    Thread localThread = new java/lang/Thread;
    LoginActivity.7 local7 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$7;
    local7.<init>(this, paramd);
    localThread.<init>(local7);
    localThread.start();
  }
  
  public static boolean b()
  {
    Runtime localRuntime = Runtime.getRuntime();
    Process localProcess = localRuntime.exec("ping -c 1 google.com");
    int i1 = localProcess.waitFor();
    if (i1 == 0) {
      i1 = 1;
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localProcess = null;
    }
  }
  
  private void d()
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
        break label262;
      }
      if (bool1) {
        break;
      }
      boolean bool2 = Common.b(this);
      if (bool2) {
        break;
      }
      int i3 = i1 + 1;
      i1 = i3;
    }
    localObject1 = Common.a("/PresensiUGM/key-files");
    boolean bool3 = ((File)localObject1).exists();
    int i4;
    if (!bool3)
    {
      i4 = ((File)localObject1).mkdirs();
      if (i4 != 0) {}
    }
    for (;;)
    {
      return;
      localObject1 = Common.a("/PresensiUGM/dump-files");
      bool3 = ((File)localObject1).exists();
      if (!bool3)
      {
        i4 = ((File)localObject1).mkdirs();
        if (i4 == 0) {}
      }
      else
      {
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
          int i7 = localObject2.length;
          i4 = 0;
          localObject1 = null;
          int i5;
          while (i4 < i7)
          {
            Object localObject3 = localObject2[i4];
            ((File)localObject3).delete();
            i4 += 1;
          }
          e();
          localObject2 = Common.b().edit();
          localObject1 = c.a.e;
          String str3 = ((c.a)localObject1).toString();
          if (!bool1) {
            i5 = 1;
          }
          for (;;)
          {
            localObject1 = ((SharedPreferences.Editor)localObject2).putBoolean(str3, i5);
            ((SharedPreferences.Editor)localObject1).commit();
            break;
            int i6 = 0;
            localObject1 = null;
          }
          label262:
          localObject1 = Common.b().edit();
          str1 = c.a.e.toString();
          localObject1 = ((SharedPreferences.Editor)localObject1).putBoolean(str1, bool1);
          ((SharedPreferences.Editor)localObject1).commit();
        }
      }
    }
  }
  
  private void e()
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
  
  private void f()
  {
    d locald = Common.c(this);
    if (locald == null) {}
    for (;;)
    {
      return;
      Thread localThread = new java/lang/Thread;
      LoginActivity.6 local6 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$6;
      local6.<init>(this, locald);
      localThread.<init>(local6);
      localThread.start();
    }
  }
  
  private void g()
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
  
  public void a()
  {
    Object localObject1 = new com/google/android/gms/common/api/GoogleApiClient$Builder;
    ((GoogleApiClient.Builder)localObject1).<init>(this);
    Object localObject2 = LocationServices.API;
    localObject1 = ((GoogleApiClient.Builder)localObject1).addApi((Api)localObject2);
    localObject2 = this.t;
    localObject1 = ((GoogleApiClient.Builder)localObject1).addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)localObject2);
    localObject2 = this.u;
    localObject1 = ((GoogleApiClient.Builder)localObject1).addOnConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)localObject2).build();
    this.q = ((GoogleApiClient)localObject1);
    this.q.connect();
  }
  
  public void a(double paramDouble1, double paramDouble2)
  {
    Object localObject = UUID.randomUUID().toString();
    Geofence.Builder localBuilder = new com/google/android/gms/location/Geofence$Builder;
    localBuilder.<init>();
    localBuilder = localBuilder.setRequestId((String)localObject).setTransitionTypes(3);
    float f1 = (float)300.0D;
    localObject = localBuilder.setCircularRegion(paramDouble1, paramDouble2, f1).setExpirationDuration(-1).build();
    this.p.add(localObject);
  }
  
  public void c()
  {
    int i1 = 1;
    Toast.makeText(getBaseContext(), "Login failed", i1).show();
    this.e.setEnabled(i1);
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
        f();
      }
    }
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    long l1 = 1000L;
    int i1 = 1;
    super.onCreate(paramBundle);
    setContentView(2131427358);
    Object localObject1 = new com/loopj/android/http/PersistentCookieStore;
    ((PersistentCookieStore)localObject1).<init>(this);
    this.s = ((PersistentCookieStore)localObject1);
    localObject1 = new Kit[i1];
    Object localObject2 = new com/crashlytics/android/Crashlytics;
    ((Crashlytics)localObject2).<init>();
    localObject1[0] = localObject2;
    Fabric.with(this, (Kit[])localObject1);
    localObject1 = (Button)findViewById(2131296309);
    this.f = ((Button)localObject1);
    int i2 = 2131296308;
    localObject1 = (Button)findViewById(i2);
    this.e = ((Button)localObject1);
    this.f.setEnabled(false);
    localObject1 = getApplicationContext();
    localObject2 = "mk_finished";
    f.a((Context)localObject1, (String)localObject2, false);
    localObject1 = "no_dialog_open";
    f.a(this, (String)localObject1, i1);
    int i3;
    if (paramBundle == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.p = ((List)localObject1);
      i2 = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
      if (i2 == 0)
      {
        a();
        localObject1 = LocationRequest.create();
        i3 = 100;
        localObject1 = ((LocationRequest)localObject1).setPriority(i3).setInterval(l1).setFastestInterval(l1);
        this.a = ((LocationRequest)localObject1);
      }
    }
    else
    {
      localObject1 = NfcAdapter.getDefaultAdapter(this);
      this.g = ((NfcAdapter)localObject1);
      localObject1 = new android/content/Intent;
      localObject2 = getClass();
      ((Intent)localObject1).<init>(this, (Class)localObject2);
      i3 = 536870912;
      localObject1 = ((Intent)localObject1).addFlags(i3);
      localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 0);
      this.h = ((PendingIntent)localObject1);
      localObject1 = new android/nfc/NdefMessage;
      localObject2 = new NdefRecord[i1];
      Locale localLocale = Locale.ENGLISH;
      NdefRecord localNdefRecord = a("Message from NFC Reader :-)", localLocale, i1);
      localObject2[0] = localNdefRecord;
      ((NdefMessage)localObject1).<init>((NdefRecord[])localObject2);
      this.i = ((NdefMessage)localObject1);
      boolean bool = Common.a(this);
      if (!bool) {
        break label388;
      }
      d();
    }
    for (;;)
    {
      localObject1 = this.e;
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$1;
      ((LoginActivity.1)localObject2).<init>(this);
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      g();
      return;
      localObject1 = "LoginActivity";
      localObject2 = "Your Device doesn't support Google Play Services.";
      Log.e((String)localObject1, (String)localObject2);
      break;
      label388:
      localObject1 = new String[i1];
      localObject2 = "android.permission.WRITE_EXTERNAL_STORAGE";
      localObject1[0] = localObject2;
      android.support.v4.app.a.a(this, (String[])localObject1, i1);
    }
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    double d1 = paramLocation.getLatitude();
    this.b = d1;
    d1 = paramLocation.getLongitude();
    this.c = d1;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    int i1 = 0;
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
    boolean bool3 = f.b(this, (String)localObject1, false);
    if (bool3) {
      g();
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
  
  protected void onStart()
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */