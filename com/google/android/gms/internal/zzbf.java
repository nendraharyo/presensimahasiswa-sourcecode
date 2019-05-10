package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class zzbf
  extends Thread
{
  private boolean mStarted = false;
  private boolean zzam = false;
  private final Object zzpV;
  private final int zzsK;
  private final int zzsM;
  private boolean zzsY = false;
  private final zzbe zzsZ;
  private final zzbd zzta;
  private final zzha zztb;
  private final int zztc;
  private final int zztd;
  private final int zzte;
  
  public zzbf(zzbe paramzzbe, zzbd paramzzbd, zzha paramzzha)
  {
    this.zzsZ = paramzzbe;
    this.zzta = paramzzbd;
    this.zztb = paramzzha;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    int i = ((Integer)zzbt.zzwk.get()).intValue();
    this.zzsK = i;
    i = ((Integer)zzbt.zzwl.get()).intValue();
    this.zztd = i;
    i = ((Integer)zzbt.zzwm.get()).intValue();
    this.zzsM = i;
    i = ((Integer)zzbt.zzwn.get()).intValue();
    this.zzte = i;
    i = ((Integer)zzbt.zzwo.get()).intValue();
    this.zztc = i;
    setName("ContentFetchTask");
  }
  
  public void run()
  {
    for (;;)
    {
      boolean bool1 = this.zzam;
      if (!bool1) {
        try
        {
          bool1 = zzcH();
          if (bool1)
          {
            Object localObject1 = this.zzsZ;
            localObject1 = ((zzbe)localObject1).getActivity();
            if (localObject1 == null)
            {
              localObject1 = "ContentFetchThread: no activity";
              zzin.zzaI((String)localObject1);
              continue;
            }
          }
        }
        finally
        {
          zzin.zzb("Error in ContentFetchTask", localThrowable);
          ??? = this.zztb;
          boolean bool2 = true;
          ((zzha)???).zza(localThrowable, bool2);
          synchronized (this.zzpV)
          {
            for (;;)
            {
              bool1 = this.zzsY;
              if (!bool1) {
                break;
              }
              Object localObject2 = "ContentFetchTask: waiting";
              try
              {
                zzin.zzaI((String)localObject2);
                localObject2 = this.zzpV;
                localObject2.wait();
              }
              catch (InterruptedException localInterruptedException) {}
            }
            zza(localInterruptedException);
            for (;;)
            {
              int i = this.zztc * 1000;
              long l = i;
              Thread.sleep(l);
              break;
              String str = "ContentFetchTask: sleeping";
              zzin.zzaI(str);
              zzcJ();
            }
          }
        }
      }
    }
  }
  
  public void wakeup()
  {
    Object localObject1 = this.zzpV;
    Object localObject2 = null;
    try
    {
      this.zzsY = false;
      localObject2 = this.zzpV;
      localObject2.notifyAll();
      localObject2 = "ContentFetchThread: wakeup";
      zzin.zzaI((String)localObject2);
      return;
    }
    finally {}
  }
  
  zzbf.zza zza(View paramView, zzbc paramzzbc)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    Object localObject2;
    if (paramView == null)
    {
      localObject2 = new com/google/android/gms/internal/zzbf$zza;
      ((zzbf.zza)localObject2).<init>(this, 0, 0);
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (zzbf.zza)localObject1;
      localObject2 = new android/graphics/Rect;
      ((Rect)localObject2).<init>();
      int k = paramView.getGlobalVisibleRect((Rect)localObject2);
      int n = paramView instanceof TextView;
      Object localObject3;
      if (n != 0)
      {
        n = paramView instanceof EditText;
        if (n == 0)
        {
          paramView = (TextView)paramView;
          localObject3 = paramView.getText();
          boolean bool = TextUtils.isEmpty((CharSequence)localObject3);
          if (!bool)
          {
            localObject3 = ((CharSequence)localObject3).toString();
            paramzzbc.zzd((String)localObject3, k);
            localObject2 = new com/google/android/gms/internal/zzbf$zza;
            ((zzbf.zza)localObject2).<init>(this, i, 0);
            localObject1 = localObject2;
            continue;
          }
          localObject2 = new com/google/android/gms/internal/zzbf$zza;
          ((zzbf.zza)localObject2).<init>(this, 0, 0);
          localObject1 = localObject2;
          continue;
        }
      }
      n = paramView instanceof WebView;
      if (n != 0)
      {
        n = paramView instanceof zzjp;
        if (n == 0)
        {
          paramzzbc.zzcC();
          paramView = (WebView)paramView;
          k = zza(paramView, paramzzbc, k);
          if (k != 0)
          {
            localObject2 = new com/google/android/gms/internal/zzbf$zza;
            ((zzbf.zza)localObject2).<init>(this, 0, i);
            localObject1 = localObject2;
            continue;
          }
          localObject2 = new com/google/android/gms/internal/zzbf$zza;
          ((zzbf.zza)localObject2).<init>(this, 0, 0);
          localObject1 = localObject2;
          continue;
        }
      }
      k = paramView instanceof ViewGroup;
      if (k != 0)
      {
        paramView = (ViewGroup)paramView;
        k = 0;
        localObject2 = null;
        n = 0;
        localObject3 = null;
        int i1;
        int m;
        for (;;)
        {
          int i2 = paramView.getChildCount();
          if (j >= i2) {
            break;
          }
          Object localObject4 = paramView.getChildAt(j);
          localObject4 = zza((View)localObject4, paramzzbc);
          i = ((zzbf.zza)localObject4).zztm;
          n += i;
          i2 = ((zzbf.zza)localObject4).zztn;
          k += i2;
          j += 1;
        }
        localObject1 = new com/google/android/gms/internal/zzbf$zza;
        ((zzbf.zza)localObject1).<init>(this, i1, m);
      }
      else
      {
        localObject2 = new com/google/android/gms/internal/zzbf$zza;
        ((zzbf.zza)localObject2).<init>(this, 0, 0);
        localObject1 = localObject2;
      }
    }
  }
  
  void zza(Activity paramActivity)
  {
    if (paramActivity == null) {}
    for (;;)
    {
      return;
      View localView = null;
      Object localObject = paramActivity.getWindow();
      if (localObject != null)
      {
        localObject = paramActivity.getWindow().getDecorView();
        if (localObject != null)
        {
          localView = paramActivity.getWindow().getDecorView();
          int i = 16908290;
          localView = localView.findViewById(i);
        }
      }
      if (localView != null) {
        zze(localView);
      }
    }
  }
  
  void zza(zzbc paramzzbc, WebView paramWebView, String paramString, boolean paramBoolean)
  {
    paramzzbc.zzcB();
    for (;;)
    {
      try
      {
        boolean bool1 = TextUtils.isEmpty(paramString);
        if (!bool1)
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>(paramString);
          localObject2 = "text";
          localObject1 = ((JSONObject)localObject1).optString((String)localObject2);
          localObject2 = paramWebView.getTitle();
          boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
          if (!bool2)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            String str2 = paramWebView.getTitle();
            localObject2 = ((StringBuilder)localObject2).append(str2);
            str2 = "\n";
            localObject2 = ((StringBuilder)localObject2).append(str2);
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject1 = ((StringBuilder)localObject1).toString();
            paramzzbc.zzc((String)localObject1, paramBoolean);
          }
        }
        else
        {
          bool1 = paramzzbc.zzcx();
          if (bool1)
          {
            localObject1 = this.zzta;
            ((zzbd)localObject1).zzb(paramzzbc);
          }
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject1;
        String str1 = "Json string may be malformed.";
        zzin.zzaI(str1);
        continue;
      }
      finally
      {
        zzin.zza("Failed to get webview content.", localThrowable);
        Object localObject2 = this.zztb;
        boolean bool3 = true;
        ((zzha)localObject2).zza(localThrowable, bool3);
        continue;
      }
      paramzzbc.zzc((String)localObject1, paramBoolean);
    }
  }
  
  boolean zza(ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo)
  {
    int i = paramRunningAppProcessInfo.importance;
    int k = 100;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean zza(WebView paramWebView, zzbc paramzzbc, boolean paramBoolean)
  {
    boolean bool = zzne.zzsk();
    zzbf.2 local2;
    if (!bool)
    {
      bool = false;
      local2 = null;
    }
    for (;;)
    {
      return bool;
      paramzzbc.zzcC();
      local2 = new com/google/android/gms/internal/zzbf$2;
      local2.<init>(this, paramzzbc, paramWebView, paramBoolean);
      paramWebView.post(local2);
      bool = true;
    }
  }
  
  public void zzcG()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.mStarted;
      if (bool)
      {
        String str = "Content hash thread already started, quiting...";
        zzin.zzaI(str);
        return;
      }
      bool = true;
      this.mStarted = bool;
      start();
    }
  }
  
  boolean zzcH()
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzsZ;
        localContext = ((zzbe)localObject1).getContext();
        if (localContext != null) {
          continue;
        }
        bool = false;
        localObject1 = null;
      }
      finally
      {
        Object localObject1;
        Context localContext;
        Object localObject4;
        Iterator localIterator;
        int i;
        int j;
        boolean bool = false;
        Object localObject3 = null;
        continue;
      }
      return bool;
      localObject1 = "activity";
      localObject1 = localContext.getSystemService((String)localObject1);
      localObject1 = (ActivityManager)localObject1;
      localObject4 = "keyguard";
      localObject4 = localContext.getSystemService((String)localObject4);
      localObject4 = (KeyguardManager)localObject4;
      if ((localObject1 == null) || (localObject4 == null))
      {
        bool = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses();
        if (localObject1 == null)
        {
          bool = false;
          localObject1 = null;
        }
        else
        {
          localIterator = ((List)localObject1).iterator();
          bool = localIterator.hasNext();
          if (bool)
          {
            localObject1 = localIterator.next();
            localObject1 = (ActivityManager.RunningAppProcessInfo)localObject1;
            i = Process.myPid();
            j = ((ActivityManager.RunningAppProcessInfo)localObject1).pid;
            if (i != j) {
              continue;
            }
            bool = zza((ActivityManager.RunningAppProcessInfo)localObject1);
            if (bool)
            {
              bool = ((KeyguardManager)localObject4).inKeyguardRestrictedInputMode();
              if (!bool)
              {
                bool = zzs(localContext);
                if (bool)
                {
                  bool = true;
                  continue;
                }
              }
            }
          }
          bool = false;
          localObject1 = null;
        }
      }
    }
  }
  
  public zzbc zzcI()
  {
    return this.zzta.zzcF();
  }
  
  public void zzcJ()
  {
    Object localObject1 = this.zzpV;
    boolean bool1 = true;
    try
    {
      this.zzsY = bool1;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "ContentFetchThread: paused, mPause = ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      boolean bool2 = this.zzsY;
      localObject2 = ((StringBuilder)localObject2).append(bool2);
      localObject2 = ((StringBuilder)localObject2).toString();
      zzin.zzaI((String)localObject2);
      return;
    }
    finally {}
  }
  
  public boolean zzcK()
  {
    return this.zzsY;
  }
  
  boolean zze(View paramView)
  {
    boolean bool;
    zzbf.1 local1;
    if (paramView == null)
    {
      bool = false;
      local1 = null;
    }
    for (;;)
    {
      return bool;
      local1 = new com/google/android/gms/internal/zzbf$1;
      local1.<init>(this, paramView);
      paramView.post(local1);
      bool = true;
    }
  }
  
  void zzf(View paramView)
  {
    for (;;)
    {
      try
      {
        localzzbc = new com/google/android/gms/internal/zzbc;
        i = this.zzsK;
        j = this.zztd;
        int k = this.zzsM;
        int m = this.zzte;
        localzzbc.<init>(i, j, k, m);
        localObject = zza(paramView, localzzbc);
        localzzbc.zzcD();
        j = ((zzbf.zza)localObject).zztm;
        if (j == 0)
        {
          j = ((zzbf.zza)localObject).zztn;
          if (j == 0) {
            return;
          }
        }
      }
      catch (Exception localException)
      {
        zzbc localzzbc;
        int i;
        boolean bool;
        zzin.zzb("Exception in fetchContentOnUIThread", localException);
        Object localObject = this.zztb;
        int j = 1;
        ((zzha)localObject).zza(localException, j);
        continue;
      }
      j = ((zzbf.zza)localObject).zztn;
      if (j == 0)
      {
        j = localzzbc.zzcE();
        if (j == 0) {}
      }
      else
      {
        i = ((zzbf.zza)localObject).zztn;
        if (i == 0)
        {
          localObject = this.zzta;
          bool = ((zzbd)localObject).zza(localzzbc);
          if (bool) {}
        }
        else
        {
          localObject = this.zzta;
          ((zzbd)localObject).zzc(localzzbc);
        }
      }
    }
  }
  
  boolean zzs(Context paramContext)
  {
    PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
    boolean bool;
    if (localPowerManager == null)
    {
      bool = false;
      localPowerManager = null;
    }
    for (;;)
    {
      return bool;
      bool = localPowerManager.isScreenOn();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */