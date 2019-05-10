package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.MifareUltralight;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.b;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.ResponseHandlerInterface;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.AccountActivity;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.c;
import id.ac.ugm.presensi.presensimahasiswa.Login.response.LoginActivity;
import id.ac.ugm.presensi.presensimahasiswa.b;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.c.a;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.JobRunnerService;
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

public class DashboardActivity
  extends b
{
  private BottomNavigationView.b A;
  ProgressDialog a;
  DialogInterface b;
  id.ac.ugm.presensi.presensimahasiswa.Home.a.g c;
  private Toolbar d;
  private Fragment e;
  private NfcAdapter f;
  private PendingIntent g;
  private NdefMessage h;
  private File i;
  private int j;
  private int k;
  private int l;
  private final Handler m;
  private boolean n;
  private PersistentCookieStore o;
  private SparseArray p;
  private Gson q;
  private String r;
  private boolean s;
  private int t;
  private JobScheduler u;
  private TextView v;
  private NfcAdapter w;
  private String x;
  private String y;
  private String[][] z;
  
  public DashboardActivity()
  {
    Object localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.m = ((Handler)localObject);
    this.x = "android.permission.WRITE_EXTERNAL_STORAGE";
    this.y = "android.permission.READ_EXTERNAL_STORAGE";
    localObject = (String[][])null;
    localObject = (String[][])null;
    this.z = null;
    localObject = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$9;
    ((DashboardActivity.9)localObject).<init>(this);
    this.A = ((BottomNavigationView.b)localObject);
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
  
  private void a(Intent paramIntent)
  {
    Object localObject = paramIntent.getAction();
    String str = "android.nfc.action.TAG_DISCOVERED";
    boolean bool1 = str.equals(localObject);
    if (!bool1)
    {
      str = "android.nfc.action.TECH_DISCOVERED";
      boolean bool2 = str.equals(localObject);
      if (!bool2) {}
    }
    else
    {
      localObject = (Tag)paramIntent.getParcelableExtra("android.nfc.extra.TAG");
      if (localObject != null)
      {
        a((Tag)localObject);
        b((Tag)localObject);
      }
    }
  }
  
  private void a(Fragment paramFragment)
  {
    p localp = getSupportFragmentManager().a();
    localp.a(2131296375, paramFragment);
    localp.c();
  }
  
  private void a(SparseArray paramSparseArray)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "";
    int i1 = 0;
    Object localObject2 = null;
    long l1 = 0L;
    double d1 = 0.0D;
    String str1 = "";
    int i10;
    int i13;
    if (paramSparseArray != null)
    {
      int i2 = 0;
      localObject1 = (String[])paramSparseArray.get(0);
      if (localObject1 != null)
      {
        i4 = 1;
        localObject1 = localObject1[i4];
      }
      i2 = paramSparseArray.size();
      if (i2 == 0) {
        break label683;
      }
      i2 = Common.g();
      int i4 = i2;
      i2 = Common.h();
      if (i4 <= i2)
      {
        localObject1 = (String[])paramSparseArray.get(i4);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject4 = "+Sector: ";
        localObject3 = (String)localObject4 + i4;
        localArrayList.add(localObject3);
        if (localObject1 != null)
        {
          int i5 = 6;
          String str2;
          int i7;
          int i8;
          if (i4 == i5)
          {
            localObject3 = localObject1[0];
            localObject2 = e.a((String)localObject3);
            localObject4 = new byte[4];
            str2 = null;
            i7 = localObject2[3];
            localObject4[0] = i7;
            i7 = localObject2[2];
            localObject4[1] = i7;
            i7 = localObject2[1];
            localObject4[2] = i7;
            i8 = 3;
            i7 = 0;
            i1 = localObject2[0];
            localObject4[i8] = i1;
            localObject2 = e.a((byte[])localObject4, false);
            double d2 = Long.parseLong((String)localObject2, 16) - 1408L;
            double d3 = 4096.0D;
            d2 /= d3;
            long l2 = Math.round(d2);
            i1 = (int)l2;
            int i9 = 200000;
            if (i1 < i9)
            {
              this.s = true;
              Object localObject5 = e.a((String)localObject3);
              byte[] arrayOfByte = new byte[5];
              localObject3 = null;
              i9 = localObject5[4];
              arrayOfByte[0] = i9;
              i9 = localObject5[3];
              arrayOfByte[1] = i9;
              i9 = localObject5[2];
              arrayOfByte[2] = i9;
              i9 = localObject5[1];
              arrayOfByte[3] = i9;
              i9 = 0;
              localObject4 = null;
              i10 = localObject5[0];
              arrayOfByte[4] = i10;
              i10 = 0;
              localObject5 = e.a(arrayOfByte, false);
              int i11 = 16;
              d1 = (Long.parseLong((String)localObject5, i11) - 1408L) / 1.0D;
              l1 = Math.round(d1);
              l2 = 9000000000L;
              d2 = 4.4465908126E-314D;
              boolean bool2 = l1 < l2;
              if (bool2)
              {
                l2 = 9000000000L;
                d2 = 4.4465908126E-314D;
                l1 -= l2;
              }
            }
          }
          int i6 = 2;
          if (i4 == i6)
          {
            localObject3 = e.a(localObject1[1]);
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            int i12 = 0;
            str1 = null;
            for (;;)
            {
              str2 = e.a((byte[])localObject3, false);
              i8 = str2.length();
              if (i12 >= i8) {
                break;
              }
              str2 = e.a((byte[])localObject3, false);
              i7 = i12 + 2;
              str2 = str2.substring(i12, i7);
              i7 = 16;
              i8 = (char)Integer.parseInt(str2, i7);
              ((StringBuilder)localObject4).append(i8);
              i12 += 2;
            }
            str1 = ((StringBuilder)localObject4).toString();
          }
          Collections.addAll(localArrayList, (Object[])localObject1);
        }
        for (i2 = i1;; i2 = i1)
        {
          i4 += 1;
          i1 = i2;
          break;
          localObject1 = "*No keys found or dead sector";
          localArrayList.add(localObject1);
        }
      }
      boolean bool1 = this.s;
      if (!bool1) {
        break label640;
      }
      ((c)this.e).a(l1);
      bool1 = false;
      localObject1 = null;
      this.s = false;
    }
    for (;;)
    {
      return;
      label640:
      this.r = str1;
      this.t = i1;
      localObject1 = (c)this.e;
      str1 = this.r;
      i10 = this.t;
      ((c)localObject1).a(str1, i10);
      continue;
      label683:
      int i3 = 2131689737;
      i13 = 1;
      localObject1 = Toast.makeText(this, i3, i13);
      ((Toast)localObject1).show();
    }
  }
  
  private void a(d paramd, Context paramContext, Intent paramIntent)
  {
    Thread localThread = new java/lang/Thread;
    DashboardActivity.2 local2 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$2;
    local2.<init>(this, paramd, paramIntent);
    localThread.<init>(local2);
    localThread.start();
  }
  
  private void a(d paramd, Intent paramIntent)
  {
    SparseArray localSparseArray = paramd.b();
    int i1 = localSparseArray.size();
    if (i1 == 0)
    {
      i1 = 0;
      localSparseArray = null;
      Common.a(null);
      a(paramIntent);
    }
    for (;;)
    {
      return;
      localSparseArray = paramd.b();
      Common.a(localSparseArray);
      g();
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    int i1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, "kode_mk", 0);
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
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).c();
    ((RequestParams)localObject1).add("dosen", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).e();
    ((RequestParams)localObject1).add("kelas", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).n();
    ((RequestParams)localObject1).add("user", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).o();
    ((RequestParams)localObject1).add("pertemuan", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject4 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
    localObject4 = id.ac.ugm.presensi.presensimahasiswa.a.h;
    localObject3 = (String)localObject4;
    localObject4 = this.o;
    localAsyncHttpClient.setCookieStore((b.a.a.a.b.h)localObject4);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7;
    ((DashboardActivity.7)localObject4).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject4);
  }
  
  private void b(Intent paramIntent)
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
        File localFile = this.i;
        ((File)localObject4).<init>(localFile, (String)localObject1);
        boolean bool6 = ((File)localObject4).exists();
        if (!bool6) {
          break label418;
        }
        ((ArrayList)localObject3).add(localObject4);
        if (!bool2) {
          break label418;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject1 = ((StringBuilder)localObject4).append((String)localObject2).append((String)localObject1);
        localObject2 = "/";
      }
    }
    label274:
    label418:
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
          break label274;
        }
        a(paramIntent);
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
          this.j = 2;
          this.k = 6;
          int i4 = this.j;
          int i1 = this.k;
          boolean bool5 = ((d)localObject2).a(i4, i1);
          if (!bool5)
          {
            ((d)localObject2).g();
          }
          else
          {
            int i5 = this.j;
            i1 = this.k;
            Common.a(i5, i1);
            i5 = -1;
            this.l = i5;
            this.n = bool1;
            a((d)localObject2, this, paramIntent);
          }
        }
      }
    }
  }
  
  private void b(String paramString1, String paramString2)
  {
    int i1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, "kode_mk", 0);
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
    localObject2 = String.valueOf(this.t);
    ((RequestParams)localObject1).add("mahasiswa", (String)localObject2);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).c();
    ((RequestParams)localObject1).add("dosen", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).e();
    ((RequestParams)localObject1).add("kelas", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).n();
    ((RequestParams)localObject1).add("user", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(i1)).o();
    ((RequestParams)localObject1).add("pertemuan", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject4 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
    localObject4 = id.ac.ugm.presensi.presensimahasiswa.a.i;
    localObject3 = (String)localObject4;
    localObject4 = this.o;
    localAsyncHttpClient.setCookieStore((b.a.a.a.b.h)localObject4);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$8;
    ((DashboardActivity.8)localObject4).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject4);
  }
  
  private String[] b(Tag paramTag)
  {
    int i1 = 1;
    Object localObject1 = "android.nfc.tech.";
    String[] arrayOfString1 = new String[2];
    Object localObject2 = paramTag.getId();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append("UID In Hex: ");
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.utils.h.b((byte[])localObject2);
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append("\n");
    localObject2 = ((StringBuilder)localObject3).toString();
    arrayOfString1[0] = localObject2;
    String[] arrayOfString2 = paramTag.getTechList();
    int i2 = arrayOfString2.length;
    localObject3 = "Technologies: ";
    int i3 = 0;
    localObject2 = null;
    String str;
    while (i3 < i2)
    {
      str = arrayOfString2[i3];
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append((String)localObject3);
      i4 = ((String)localObject1).length();
      localObject3 = str.substring(i4);
      localStringBuilder.append((String)localObject3);
      localStringBuilder.append(",");
      localObject3 = localStringBuilder.toString();
      i3 += 1;
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = arrayOfString1[0];
    ((StringBuilder)localObject2).append((String)localObject1);
    int i5 = ((String)localObject3).length() + -1;
    localObject3 = ((String)localObject3).substring(0, i5);
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append("\n\n");
    localObject2 = ((StringBuilder)localObject2).toString();
    arrayOfString1[0] = localObject2;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject3 = arrayOfString1[0];
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append("Card Type: ");
    localObject2 = ((StringBuilder)localObject2).toString();
    arrayOfString1[0] = localObject2;
    localObject2 = "Unknown";
    int i4 = 0;
    localObject3 = null;
    i5 = arrayOfString2.length;
    if (i4 < i5)
    {
      localObject1 = arrayOfString2[i4];
      Object localObject4 = MifareClassic.class.getName();
      boolean bool1 = ((String)localObject1).equals(localObject4);
      if (bool1)
      {
        arrayOfString1[i1] = "Mifare Classic";
        localObject1 = MifareClassic.get(paramTag);
        i2 = ((MifareClassic)localObject1).getType();
        switch (i2)
        {
        default: 
          label388:
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = arrayOfString1[0];
          ((StringBuilder)localObject4).append(str);
          ((StringBuilder)localObject4).append("Mifare ");
          ((StringBuilder)localObject4).append((String)localObject2);
          ((StringBuilder)localObject4).append("\n");
          localObject4 = ((StringBuilder)localObject4).toString();
          arrayOfString1[0] = localObject4;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = arrayOfString1[0];
          ((StringBuilder)localObject4).append(str);
          ((StringBuilder)localObject4).append("Size: ");
          int i8 = ((MifareClassic)localObject1).getSize();
          ((StringBuilder)localObject4).append(i8);
          ((StringBuilder)localObject4).append(" bytes \nSector Count: ");
          i8 = ((MifareClassic)localObject1).getSectorCount();
          ((StringBuilder)localObject4).append(i8);
          str = "\nBlock Count: ";
          ((StringBuilder)localObject4).append(str);
          int i6 = ((MifareClassic)localObject1).getBlockCount();
          ((StringBuilder)localObject4).append(i6);
          ((StringBuilder)localObject4).append("\n");
          localObject1 = ((StringBuilder)localObject4).toString();
          arrayOfString1[0] = localObject1;
        }
      }
      for (;;)
      {
        i4 += 1;
        break;
        localObject2 = "Classic";
        break label388;
        localObject2 = "Plus";
        break label388;
        localObject2 = "Pro";
        break label388;
        localObject1 = arrayOfString2[i4];
        localObject4 = MifareUltralight.class.getName();
        boolean bool2 = ((String)localObject1).equals(localObject4);
        if (bool2)
        {
          arrayOfString1[i1] = "Mifare UltraLight";
          localObject1 = MifareUltralight.get(paramTag);
          int i7 = ((MifareUltralight)localObject1).getType();
          switch (i7)
          {
          }
          for (;;)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject4 = arrayOfString1[0];
            ((StringBuilder)localObject1).append((String)localObject4);
            ((StringBuilder)localObject1).append("Mifare ");
            ((StringBuilder)localObject1).append((String)localObject2);
            localObject4 = "\n";
            ((StringBuilder)localObject1).append((String)localObject4);
            localObject1 = ((StringBuilder)localObject1).toString();
            arrayOfString1[0] = localObject1;
            break;
            localObject2 = "Ultralight";
            continue;
            localObject2 = "Ultralight C";
          }
        }
        localObject1 = arrayOfString2[i4];
        localObject4 = IsoDep.class.getName();
        boolean bool3 = ((String)localObject1).equals(localObject4);
        if (bool3)
        {
          arrayOfString1[i1] = "IsoDep";
          IsoDep.get(paramTag);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject4 = arrayOfString1[0];
          ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "IsoDep \n";
          ((StringBuilder)localObject1).append((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).toString();
          arrayOfString1[0] = localObject1;
        }
        else
        {
          localObject1 = arrayOfString2[i4];
          localObject4 = Ndef.class.getName();
          bool3 = ((String)localObject1).equals(localObject4);
          if (bool3)
          {
            localObject1 = Ndef.get(paramTag);
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            str = arrayOfString1[0];
            ((StringBuilder)localObject4).append(str);
            ((StringBuilder)localObject4).append("Is Writable: ");
            boolean bool4 = ((Ndef)localObject1).isWritable();
            ((StringBuilder)localObject4).append(bool4);
            str = "\nCan Make ReadOnly: ";
            ((StringBuilder)localObject4).append(str);
            bool3 = ((Ndef)localObject1).canMakeReadOnly();
            ((StringBuilder)localObject4).append(bool3);
            ((StringBuilder)localObject4).append("\n");
            localObject1 = ((StringBuilder)localObject4).toString();
            arrayOfString1[0] = localObject1;
          }
          else
          {
            localObject1 = arrayOfString2[i4];
            localObject4 = NdefFormatable.class.getName();
            bool3 = ((String)localObject1).equals(localObject4);
            if (bool3)
            {
              localObject1 = NdefFormatable.get(paramTag);
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              str = arrayOfString1[0];
              ((StringBuilder)localObject4).append(str);
              str = "NdefFormatable: ";
              ((StringBuilder)localObject4).append(str);
              localObject1 = ((NdefFormatable)localObject1).getTag().toString();
              ((StringBuilder)localObject4).append((String)localObject1);
              ((StringBuilder)localObject4).append("\n");
              localObject1 = ((StringBuilder)localObject4).toString();
              arrayOfString1[0] = localObject1;
            }
          }
        }
      }
    }
    localObject2 = this.v;
    return arrayOfString1;
  }
  
  public static boolean c()
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
  
  private void e()
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
        break label179;
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
    f();
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
      DashboardActivity.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$1;
      local1.<init>(this, locald);
      localThread.<init>(local1);
      localThread.start();
    }
  }
  
  private void h()
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
    this.a = ((ProgressDialog)localObject1);
    this.a.setMessage("Loading, please wait..");
    this.a.setCancelable(false);
    this.a.setIndeterminate(i1);
    this.a.show();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = id.ac.ugm.presensi.presensimahasiswa.a.d;
    localObject1 = (String)localObject2;
    localAsyncHttpClient.setMaxRetriesAndTimeout(i1, 999);
    localObject2 = this.o;
    localAsyncHttpClient.setCookieStore((b.a.a.a.b.h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$6;
    ((DashboardActivity.6)localObject2).<init>(this);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  public void a()
  {
    h();
  }
  
  protected void a(Tag paramTag)
  {
    Object localObject1 = IsoDep.get(paramTag);
    if (localObject1 != null) {}
    try
    {
      ((IsoDep)localObject1).connect();
    }
    catch (IOException localIOException2)
    {
      try
      {
        Object localObject2 = id.ac.ugm.presensi.presensimahasiswa.utils.g.e;
        localObject2 = ((IsoDep)localObject1).transceive((byte[])localObject2);
        boolean bool1 = id.ac.ugm.presensi.presensimahasiswa.utils.h.a((byte[])localObject2);
        if (bool1)
        {
          localObject2 = new id/ac/ugm/presensi/presensimahasiswa/utils/g;
          ((id.ac.ugm.presensi.presensimahasiswa.utils.g)localObject2).<init>((IsoDep)localObject1);
          boolean bool2 = ((id.ac.ugm.presensi.presensimahasiswa.utils.g)localObject2).a();
          if (bool2)
          {
            localObject4 = "-";
            this.r = ((String)localObject4);
            localObject2 = ((id.ac.ugm.presensi.presensimahasiswa.utils.g)localObject2).b();
            int i1 = Integer.parseInt((String)localObject2);
            this.t = i1;
            localObject2 = this.e;
            localObject2 = (c)localObject2;
            localObject4 = this.r;
            i3 = this.t;
            ((c)localObject2).a((String)localObject4, i3);
          }
        }
      }
      catch (IOException localIOException2)
      {
        try
        {
          for (;;)
          {
            ((IsoDep)localObject1).close();
            return;
            localIOException1 = localIOException1;
            localIOException1.printStackTrace();
            Object localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append(localIOException1);
            Object localObject3 = "";
            ((StringBuilder)localObject4).append((String)localObject3);
            continue;
            localObject3 = getApplicationContext();
            int i2 = 2131689797;
            int i3 = 1;
            localObject3 = Toast.makeText((Context)localObject3, i2, i3);
            ((Toast)localObject3).show();
            continue;
            localIOException2 = localIOException2;
            localIOException2.printStackTrace();
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append(localIOException2);
            String str1 = "";
            ((StringBuilder)localObject4).append(str1);
          }
        }
        catch (IOException localIOException3)
        {
          for (;;)
          {
            localIOException3.printStackTrace();
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append(localIOException3);
            String str2 = "";
            ((StringBuilder)localObject1).append(str2);
          }
        }
      }
    }
  }
  
  public void b()
  {
    this.r = "Dosen";
    h();
  }
  
  public void d()
  {
    Toast.makeText(getBaseContext(), "Login failed", 1).show();
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
        g();
      }
    }
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    int i1 = 268468224;
    int i2 = 10001;
    int i3 = 1;
    super.onCreate(paramBundle);
    setContentView(2131427356);
    Object localObject1 = new com/loopj/android/http/PersistentCookieStore;
    ((PersistentCookieStore)localObject1).<init>(this);
    this.o = ((PersistentCookieStore)localObject1);
    localObject1 = NfcAdapter.getDefaultAdapter(this);
    this.f = ((NfcAdapter)localObject1);
    localObject1 = new com/google/gson/Gson;
    ((Gson)localObject1).<init>();
    this.q = ((Gson)localObject1);
    this.s = false;
    localObject1 = new android/content/Intent;
    Object localObject2 = getClass();
    ((Intent)localObject1).<init>(this, (Class)localObject2);
    int i4 = 536870912;
    localObject1 = ((Intent)localObject1).addFlags(i4);
    localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 0);
    this.g = ((PendingIntent)localObject1);
    localObject1 = new android/nfc/NdefMessage;
    localObject2 = new NdefRecord[i3];
    Object localObject3 = Locale.ENGLISH;
    Object localObject4 = a("Message from NFC Reader :-)", (Locale)localObject3, i3);
    localObject2[0] = localObject4;
    ((NdefMessage)localObject1).<init>((NdefRecord[])localObject2);
    this.h = ((NdefMessage)localObject1);
    localObject1 = (JobScheduler)getSystemService("jobscheduler");
    this.u = ((JobScheduler)localObject1);
    localObject1 = new android/app/job/JobInfo$Builder;
    localObject2 = new android/content/ComponentName;
    localObject4 = getPackageName();
    localObject3 = JobRunnerService.class.getName();
    ((ComponentName)localObject2).<init>((String)localObject4, (String)localObject3);
    ((JobInfo.Builder)localObject1).<init>(i3, (ComponentName)localObject2);
    long l1 = 30000L;
    ((JobInfo.Builder)localObject1).setPeriodic(l1);
    localObject2 = this.u;
    localObject1 = ((JobInfo.Builder)localObject1).build();
    int i5 = ((JobScheduler)localObject2).schedule((JobInfo)localObject1);
    if (i5 <= 0) {}
    boolean bool1 = Common.a(this);
    if (bool1)
    {
      e();
      localObject1 = (Toolbar)findViewById(2131296556);
      this.d = ((Toolbar)localObject1);
      localObject1 = this.d;
      setSupportActionBar((Toolbar)localObject1);
      localObject1 = (BottomNavigationView)findViewById(2131296446);
      i4 = 8;
      ((BottomNavigationView)localObject1).setVisibility(i4);
      localObject2 = this.A;
      ((BottomNavigationView)localObject1).setOnNavigationItemSelectedListener((BottomNavigationView.b)localObject2);
      localObject1 = getApplicationContext();
      localObject2 = "user_login";
      bool1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b((Context)localObject1, (String)localObject2, false);
      if (bool1) {
        break label648;
      }
      localObject1 = new android/content/Intent;
      localObject2 = getApplicationContext();
      ((Intent)localObject1).<init>((Context)localObject2, LoginActivity.class);
      localObject2 = getApplicationContext();
      localObject4 = "mk_finished";
      id.ac.ugm.presensi.presensimahasiswa.utils.f.a((Context)localObject2, (String)localObject4, false);
      ((Intent)localObject1).setFlags(i1);
      startActivity((Intent)localObject1);
      finish();
      label435:
      localObject1 = NfcAdapter.getDefaultAdapter(this);
      this.w = ((NfcAdapter)localObject1);
      localObject1 = new String[i3][];
      i4 = 2;
      localObject2 = new String[i4];
      localObject4 = IsoDep.class.getName();
      localObject2[0] = localObject4;
      localObject4 = NfcA.class.getName();
      localObject2[i3] = localObject4;
      localObject1[0] = localObject2;
      this.z = ((String[][])localObject1);
      localObject1 = getApplicationContext();
      localObject2 = "presence";
      int i6 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b((Context)localObject1, (String)localObject2, i2);
      if (i6 != i2) {
        break label730;
      }
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/a;
      ((a)localObject1).<init>();
      a((Fragment)localObject1);
    }
    for (;;)
    {
      localObject1 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b(this, "data_local", "");
      localObject1 = (id.ac.ugm.presensi.presensimahasiswa.Home.a.g)this.q.fromJson((String)localObject1, id.ac.ugm.presensi.presensimahasiswa.Home.a.g.class);
      this.c = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.g)localObject1);
      localObject2 = getApplicationContext();
      localObject1 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.c.a().get(0)).a();
      id.ac.ugm.presensi.presensimahasiswa.utils.f.a((Context)localObject2, "user_username", (String)localObject1);
      return;
      localObject1 = new String[i3];
      localObject2 = "android.permission.WRITE_EXTERNAL_STORAGE";
      localObject1[0] = localObject2;
      android.support.v4.app.a.a(this, (String[])localObject1, i3);
      break;
      label648:
      localObject1 = getApplicationContext();
      localObject2 = "mk_finished";
      boolean bool2 = id.ac.ugm.presensi.presensimahasiswa.utils.f.b((Context)localObject1, (String)localObject2, false);
      if (bool2)
      {
        localObject1 = new android/content/Intent;
        localObject2 = AccountActivity.class;
        ((Intent)localObject1).<init>(this, (Class)localObject2);
        ((Intent)localObject1).setFlags(i1);
        startActivity((Intent)localObject1);
        break label435;
      }
      localObject1 = getApplicationContext();
      localObject2 = "mk_finished";
      id.ac.ugm.presensi.presensimahasiswa.utils.f.a((Context)localObject1, (String)localObject2, false);
      break label435;
      label730:
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c;
      ((c)localObject1).<init>();
      this.e = ((Fragment)localObject1);
      localObject1 = this.e;
      a((Fragment)localObject1);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131492865, paramMenu);
    paramMenu.findItem(2131296281).setVisible(false);
    paramMenu.findItem(2131296275).setVisible(false);
    paramMenu.findItem(2131296262).setVisible(false);
    paramMenu.findItem(2131296457).setVisible(false);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
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
      localObject1 = this.e;
      bool3 = localObject1 instanceof c;
      if (bool3)
      {
        localObject1 = this.b;
        if (localObject1 != null)
        {
          localObject1 = this.b;
          ((DialogInterface)localObject1).dismiss();
        }
        b(paramIntent);
      }
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
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getItemId();
    int i2 = 2131296262;
    if (i1 == i2)
    {
      Object localObject1 = new android/app/AlertDialog$Builder;
      ((AlertDialog.Builder)localObject1).<init>(this);
      ((AlertDialog.Builder)localObject1).setTitle("Masukkan password");
      Object localObject2 = (ViewGroup)((ViewGroup)findViewById(16908290)).getChildAt(0);
      Object localObject3 = LayoutInflater.from(this);
      int i3 = 2131427424;
      localObject3 = ((LayoutInflater)localObject3).inflate(i3, (ViewGroup)localObject2, false);
      localObject2 = (EditText)((View)localObject3).findViewById(2131296402);
      ((AlertDialog.Builder)localObject1).setView((View)localObject3);
      Object localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$3;
      ((DashboardActivity.3)localObject4).<init>(this, (EditText)localObject2);
      ((AlertDialog.Builder)localObject1).setPositiveButton(17039370, (DialogInterface.OnClickListener)localObject4);
      localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$4;
      ((DashboardActivity.4)localObject4).<init>(this);
      ((AlertDialog.Builder)localObject1).setNegativeButton(17039360, (DialogInterface.OnClickListener)localObject4);
      localObject1 = ((AlertDialog.Builder)localObject1).create();
      this.b = ((DialogInterface)localObject1);
      ((AlertDialog)localObject1).show();
      int i4 = -1;
      localObject3 = ((AlertDialog)localObject1).getButton(i4);
      localObject4 = new id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$5;
      ((DashboardActivity.5)localObject4).<init>(this, (EditText)localObject2, (AlertDialog)localObject1);
      ((Button)localObject3).setOnClickListener((View.OnClickListener)localObject4);
    }
    boolean bool;
    for (i1 = 1;; bool = super.onOptionsItemSelected(paramMenuItem)) {
      return i1;
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.n = false;
    Object localObject = this.f;
    if (localObject != null)
    {
      this.f.disableForegroundDispatch(this);
      localObject = this.f;
      ((NfcAdapter)localObject).disableForegroundNdefPush(this);
    }
    localObject = getIntent();
    String str = "android.nfc.extra.TAG";
    ((Intent)localObject).removeExtra(str);
    localObject = this.w;
    if (localObject != null)
    {
      this.w.disableForegroundDispatch(this);
      localObject = this.w;
      ((NfcAdapter)localObject).disableReaderMode(this);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    Object localObject1 = this.f;
    if (localObject1 != null)
    {
      localObject2 = this.f;
      localObject3 = this.g;
      localObject1 = (String[][])null;
      ((NfcAdapter)localObject2).enableForegroundDispatch(this, (PendingIntent)localObject3, null, null);
      localObject1 = this.f;
      localObject2 = this.h;
      ((NfcAdapter)localObject1).enableForegroundNdefPush(this, (NdefMessage)localObject2);
    }
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>(this, DashboardActivity.class);
    int i1 = 536870912;
    ((Intent)localObject1).setFlags(i1);
    localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 0);
    Object localObject2 = new IntentFilter[0];
    Object localObject3 = this.w;
    if (localObject3 != null)
    {
      localObject3 = this.w;
      boolean bool = ((NfcAdapter)localObject3).isEnabled();
      if (!bool) {
        break label137;
      }
      localObject3 = this.w;
      ((String[][])null);
      ((String[][])null);
      ((NfcAdapter)localObject3).enableForegroundDispatch(this, (PendingIntent)localObject1, (IntentFilter[])localObject2, null);
    }
    for (;;)
    {
      return;
      label137:
      localObject1 = Toast.makeText(this, "NFC tidak aktif. Silakan Aktifkan NFC.", 0);
      ((Toast)localObject1).show();
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
    this.i = ((File)localObject1);
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
      localObject1 = this.i;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */