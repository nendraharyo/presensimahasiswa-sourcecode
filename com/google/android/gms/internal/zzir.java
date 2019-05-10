package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zze;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzir
{
  public static final Handler zzMc;
  private boolean zzMd;
  private boolean zzMe;
  private final Object zzpV;
  private String zzzN;
  
  static
  {
    zzio localzzio = new com/google/android/gms/internal/zzio;
    Looper localLooper = Looper.getMainLooper();
    localzzio.<init>(localLooper);
    zzMc = localzzio;
  }
  
  public zzir()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzMd = true;
    this.zzMe = false;
  }
  
  public static void runOnUiThread(Runnable paramRunnable)
  {
    Object localObject = Looper.getMainLooper().getThread();
    Thread localThread = Thread.currentThread();
    if (localObject == localThread) {
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      localObject = zzMc;
      ((Handler)localObject).post(paramRunnable);
    }
  }
  
  private JSONArray zza(Collection paramCollection)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      zza(localJSONArray, localObject);
    }
    return localJSONArray;
  }
  
  private void zza(JSONArray paramJSONArray, Object paramObject)
  {
    boolean bool = paramObject instanceof Bundle;
    Object localObject;
    if (bool)
    {
      paramObject = (Bundle)paramObject;
      localObject = zzf((Bundle)paramObject);
      paramJSONArray.put(localObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Map;
      if (bool)
      {
        paramObject = (Map)paramObject;
        localObject = zzG((Map)paramObject);
        paramJSONArray.put(localObject);
      }
      else
      {
        bool = paramObject instanceof Collection;
        if (bool)
        {
          paramObject = (Collection)paramObject;
          localObject = zza((Collection)paramObject);
          paramJSONArray.put(localObject);
        }
        else
        {
          bool = paramObject instanceof Object[];
          if (bool)
          {
            paramObject = (Object[])paramObject;
            localObject = zza((Object[])paramObject);
            paramJSONArray.put(localObject);
          }
          else
          {
            paramJSONArray.put(paramObject);
          }
        }
      }
    }
  }
  
  private void zza(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    boolean bool = paramObject instanceof Bundle;
    Object localObject;
    if (bool)
    {
      paramObject = (Bundle)paramObject;
      localObject = zzf((Bundle)paramObject);
      paramJSONObject.put(paramString, localObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Map;
      if (bool)
      {
        paramObject = (Map)paramObject;
        localObject = zzG((Map)paramObject);
        paramJSONObject.put(paramString, localObject);
      }
      else
      {
        bool = paramObject instanceof Collection;
        if (bool)
        {
          if (paramString != null) {}
          for (;;)
          {
            paramObject = (Collection)paramObject;
            localObject = zza((Collection)paramObject);
            paramJSONObject.put(paramString, localObject);
            break;
            paramString = "null";
          }
        }
        bool = paramObject instanceof Object[];
        if (bool)
        {
          paramObject = (Object[])paramObject;
          localObject = Arrays.asList((Object[])paramObject);
          localObject = zza((Collection)localObject);
          paramJSONObject.put(paramString, localObject);
        }
        else
        {
          paramJSONObject.put(paramString, paramObject);
        }
      }
    }
  }
  
  private boolean zza(KeyguardManager paramKeyguardManager)
  {
    if (paramKeyguardManager == null) {}
    for (boolean bool = false;; bool = paramKeyguardManager.inKeyguardRestrictedInputMode()) {
      return bool;
    }
  }
  
  private boolean zza(PowerManager paramPowerManager)
  {
    if (paramPowerManager != null)
    {
      bool = paramPowerManager.isScreenOn();
      if (!bool) {
        break label17;
      }
    }
    label17:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private JSONObject zzf(Bundle paramBundle)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = paramBundle.get((String)localObject1);
      zza(localJSONObject, (String)localObject1, localObject2);
    }
    return localJSONObject;
  }
  
  private boolean zzs(Context paramContext)
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
  
  public JSONObject zzG(Map paramMap)
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      Object localObject2 = paramMap.keySet();
      Object localObject3 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject3).next();
        localObject2 = (String)localObject2;
        Object localObject4 = paramMap.get(localObject2);
        zza((JSONObject)localObject1, (String)localObject2, localObject4);
      }
      String str;
      return (JSONObject)localObject1;
    }
    catch (ClassCastException localClassCastException)
    {
      localObject1 = new org/json/JSONException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Could not convert map to JSON: ");
      str = localClassCastException.getMessage();
      str = str;
      ((JSONException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
  }
  
  public boolean zzI(Context paramContext)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool = false;
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>();
    ((Intent)localObject1).setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    Object localObject2 = paramContext.getPackageManager();
    int j = 65536;
    localObject2 = ((PackageManager)localObject2).resolveActivity((Intent)localObject1, j);
    if (localObject2 != null)
    {
      localObject1 = ((ResolveInfo)localObject2).activityInfo;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
      zzin.zzaK((String)localObject1);
      return bool;
    }
    String str1 = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
    localObject1 = ((ResolveInfo)localObject2).activityInfo;
    int k = ((ActivityInfo)localObject1).configChanges & 0x10;
    Object localObject3;
    if (k == 0)
    {
      localObject1 = new Object[i];
      localObject3 = "keyboard";
      localObject1[0] = localObject3;
      zzin.zzaK(String.format(str1, (Object[])localObject1));
      k = 0;
      localObject1 = null;
    }
    for (;;)
    {
      localObject3 = ((ResolveInfo)localObject2).activityInfo;
      int m = ((ActivityInfo)localObject3).configChanges & 0x20;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "keyboardHidden";
        localObject1[0] = localObject3;
        zzin.zzaK(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = ((ResolveInfo)localObject2).activityInfo;
      m = ((ActivityInfo)localObject3).configChanges & 0x80;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "orientation";
        localObject1[0] = localObject3;
        zzin.zzaK(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = ((ResolveInfo)localObject2).activityInfo;
      m = ((ActivityInfo)localObject3).configChanges & 0x100;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "screenLayout";
        localObject1[0] = localObject3;
        zzin.zzaK(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = ((ResolveInfo)localObject2).activityInfo;
      m = ((ActivityInfo)localObject3).configChanges & 0x200;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "uiMode";
        localObject1[0] = localObject3;
        zzin.zzaK(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject3 = ((ResolveInfo)localObject2).activityInfo;
      m = ((ActivityInfo)localObject3).configChanges & 0x400;
      if (m == 0)
      {
        localObject1 = new Object[i];
        localObject3 = "screenSize";
        localObject1[0] = localObject3;
        zzin.zzaK(String.format(str1, (Object[])localObject1));
        k = 0;
        localObject1 = null;
      }
      localObject2 = ((ResolveInfo)localObject2).activityInfo;
      int n = ((ActivityInfo)localObject2).configChanges & 0x800;
      if (n == 0)
      {
        localObject1 = new Object[i];
        String str2 = "smallestScreenSize";
        localObject1[0] = str2;
        localObject1 = String.format(str1, (Object[])localObject1);
        zzin.zzaK((String)localObject1);
        break;
      }
      bool = k;
      break;
      k = i;
    }
  }
  
  public boolean zzJ(Context paramContext)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzMe;
    if (bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      IntentFilter localIntentFilter = new android/content/IntentFilter;
      localIntentFilter.<init>();
      localIntentFilter.addAction("android.intent.action.USER_PRESENT");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      Context localContext = paramContext.getApplicationContext();
      zzir.zza localzza = new com/google/android/gms/internal/zzir$zza;
      localzza.<init>(this, null);
      localContext.registerReceiver(localzza, localIntentFilter);
      this.zzMe = bool1;
    }
  }
  
  protected String zzK(Context paramContext)
  {
    WebView localWebView = new android/webkit/WebView;
    localWebView.<init>(paramContext);
    return localWebView.getSettings().getUserAgentString();
  }
  
  public AlertDialog.Builder zzL(Context paramContext)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(paramContext);
    return localBuilder;
  }
  
  public zzbl zzM(Context paramContext)
  {
    zzbl localzzbl = new com/google/android/gms/internal/zzbl;
    localzzbl.<init>(paramContext);
    return localzzbl;
  }
  
  public String zzN(Context paramContext)
  {
    for (Object localObject1 = "activity";; localObject1 = ((ComponentName)localObject1).getClassName())
    {
      try
      {
        localObject1 = paramContext.getSystemService((String)localObject1);
        localObject1 = (ActivityManager)localObject1;
        if (localObject1 != null) {
          break label23;
        }
        localObject1 = null;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label23:
          int i;
          boolean bool;
          ComponentName localComponentName;
          Object localObject2 = null;
        }
      }
      return (String)localObject1;
      i = 1;
      localObject1 = ((ActivityManager)localObject1).getRunningTasks(i);
      if (localObject1 == null) {
        break;
      }
      bool = ((List)localObject1).isEmpty();
      if (bool) {
        break;
      }
      bool = false;
      localComponentName = null;
      localObject1 = ((List)localObject1).get(0);
      localObject1 = (ActivityManager.RunningTaskInfo)localObject1;
      if (localObject1 == null) {
        break;
      }
      localComponentName = ((ActivityManager.RunningTaskInfo)localObject1).topActivity;
      if (localComponentName == null) {
        break;
      }
      localObject1 = ((ActivityManager.RunningTaskInfo)localObject1).topActivity;
    }
  }
  
  public boolean zzO(Context paramContext)
  {
    Object localObject1 = "activity";
    for (;;)
    {
      try
      {
        localObject1 = paramContext.getSystemService((String)localObject1);
        localObject1 = (ActivityManager)localObject1;
        localObject4 = "keyguard";
        localObject4 = paramContext.getSystemService((String)localObject4);
        localObject4 = (KeyguardManager)localObject4;
        if ((localObject1 != null) && (localObject4 != null)) {
          continue;
        }
        bool1 = false;
        localObject1 = null;
      }
      finally
      {
        Object localObject4;
        boolean bool1;
        Iterator localIterator;
        int j;
        int k;
        int i;
        int m;
        boolean bool2 = false;
        Object localObject3 = null;
        continue;
      }
      return bool1;
      localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses();
      if (localObject1 == null)
      {
        bool1 = false;
        localObject1 = null;
      }
      else
      {
        localIterator = ((List)localObject1).iterator();
        bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (ActivityManager.RunningAppProcessInfo)localObject1;
          j = Process.myPid();
          k = ((ActivityManager.RunningAppProcessInfo)localObject1).pid;
          if (j != k) {
            continue;
          }
          i = ((ActivityManager.RunningAppProcessInfo)localObject1).importance;
          m = 100;
          if (i == m)
          {
            bool2 = ((KeyguardManager)localObject4).inKeyguardRestrictedInputMode();
            if (!bool2)
            {
              bool2 = zzs(paramContext);
              if (bool2)
              {
                bool2 = true;
                continue;
              }
            }
          }
        }
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  public Bitmap zzP(Context paramContext)
  {
    Object localObject1 = null;
    boolean bool = paramContext instanceof Activity;
    if (!bool) {}
    for (;;)
    {
      return (Bitmap)localObject1;
      try
      {
        paramContext = (Activity)paramContext;
        Object localObject2 = paramContext.getWindow();
        localObject3 = ((Window)localObject2).getDecorView();
        int i = ((View)localObject3).getWidth();
        int j = ((View)localObject3).getHeight();
        Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
        localObject2 = Bitmap.createBitmap(i, j, localConfig);
        Canvas localCanvas = new android/graphics/Canvas;
        localCanvas.<init>((Bitmap)localObject2);
        localConfig = null;
        int k = ((View)localObject3).getWidth();
        int m = ((View)localObject3).getHeight();
        ((View)localObject3).layout(0, 0, k, m);
        ((View)localObject3).draw(localCanvas);
        localObject1 = localObject2;
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject3 = "Fail to capture screen shot";
        zzin.zzb((String)localObject3, localRuntimeException);
      }
    }
  }
  
  public float zzQ(Context paramContext)
  {
    int i = 3;
    float f1 = 0.0F;
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    if (localAudioManager == null) {
      return f1;
    }
    int j = localAudioManager.getStreamMaxVolume(i);
    int k = localAudioManager.getStreamVolume(i);
    if (j == 0)
    {
      k = 0;
      localAudioManager = null;
    }
    for (float f2 = 0.0F;; f2 /= f1)
    {
      f1 = f2;
      break;
      f2 = k;
      f1 = j;
    }
  }
  
  public int zzR(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    int i;
    if (localApplicationInfo == null)
    {
      i = 0;
      localApplicationInfo = null;
    }
    for (;;)
    {
      return i;
      i = localApplicationInfo.targetSdkVersion;
    }
  }
  
  public DisplayMetrics zza(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
    localDisplayMetrics.<init>();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public PopupWindow zza(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    PopupWindow localPopupWindow = new android/widget/PopupWindow;
    localPopupWindow.<init>(paramView, paramInt1, paramInt2, paramBoolean);
    return localPopupWindow;
  }
  
  public String zza(Context paramContext, View paramView, AdSizeParcel paramAdSizeParcel)
  {
    String str1 = null;
    Object localObject1 = (Boolean)zzbt.zzwz.get();
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (!bool1) {}
    for (;;)
    {
      return str1;
      try
      {
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>();
        localObject2 = "width";
        int k = paramAdSizeParcel.width;
        ((JSONObject)localObject1).put((String)localObject2, k);
        localObject2 = "height";
        k = paramAdSizeParcel.height;
        ((JSONObject)localObject1).put((String)localObject2, k);
        localObject2 = "size";
        localJSONObject1.put((String)localObject2, localObject1);
        localObject1 = "activity";
        localObject2 = zzN(paramContext);
        localJSONObject1.put((String)localObject1, localObject2);
        bool1 = paramAdSizeParcel.zzui;
        if (!bool1)
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>();
          if (paramView != null)
          {
            localObject2 = paramView.getParent();
            if (localObject2 != null)
            {
              int i = -1;
              boolean bool3 = localObject2 instanceof ViewGroup;
              if (bool3)
              {
                Object localObject3 = localObject2;
                localObject3 = (ViewGroup)localObject2;
                localObject1 = localObject3;
                i = ((ViewGroup)localObject3).indexOfChild(paramView);
              }
              JSONObject localJSONObject2 = new org/json/JSONObject;
              localJSONObject2.<init>();
              String str2 = "type";
              Object localObject4 = localObject2.getClass();
              localObject4 = ((Class)localObject4).getName();
              localJSONObject2.put(str2, localObject4);
              str2 = "index_of_child";
              localJSONObject2.put(str2, i);
              localJSONArray.put(localJSONObject2);
            }
            if (localObject2 != null)
            {
              boolean bool2 = localObject2 instanceof View;
              if (!bool2) {}
            }
            for (localObject2 = (View)localObject2;; localObject2 = null)
            {
              paramView = (View)localObject2;
              break;
            }
          }
          int j = localJSONArray.length();
          if (j > 0)
          {
            localObject1 = "parents";
            localJSONObject1.put((String)localObject1, localJSONArray);
          }
        }
        str1 = localJSONObject1.toString();
      }
      catch (JSONException localJSONException)
      {
        Object localObject2 = "Fail to get view hierarchy json";
        zzin.zzd((String)localObject2, localJSONException);
      }
    }
  }
  
  public String zza(Context paramContext, zzan paramzzan, String paramString)
  {
    if (paramzzan == null) {}
    for (;;)
    {
      return paramString;
      try
      {
        Uri localUri = Uri.parse(paramString);
        boolean bool = paramzzan.zzc(localUri);
        if (bool) {
          localUri = paramzzan.zza(localUri, paramContext);
        }
        paramString = localUri.toString();
      }
      catch (Exception localException) {}
    }
  }
  
  public String zza(zzjp paramzzjp, String paramString)
  {
    Context localContext = paramzzjp.getContext();
    zzan localzzan = paramzzjp.zzhW();
    return zza(localContext, localzzan, paramString);
  }
  
  public String zza(InputStreamReader paramInputStreamReader)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(8192);
    int i = 2048;
    char[] arrayOfChar = new char[i];
    for (;;)
    {
      int j = paramInputStreamReader.read(arrayOfChar);
      int k = -1;
      if (j == k) {
        break;
      }
      k = 0;
      localStringBuilder.append(arrayOfChar, 0, j);
    }
    return localStringBuilder.toString();
  }
  
  JSONArray zza(Object[] paramArrayOfObject)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    int i = paramArrayOfObject.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramArrayOfObject[j];
      zza(localJSONArray, localObject);
      j += 1;
    }
    return localJSONArray;
  }
  
  public void zza(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Object localObject1 = paramActivity.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = ((Window)localObject1).getDecorView();
      if (localObject2 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView().getViewTreeObserver();
        if (localObject2 != null)
        {
          localObject1 = ((Window)localObject1).getDecorView().getViewTreeObserver();
          ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener(paramOnGlobalLayoutListener);
        }
      }
    }
  }
  
  public void zza(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    Object localObject1 = paramActivity.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = ((Window)localObject1).getDecorView();
      if (localObject2 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView().getViewTreeObserver();
        if (localObject2 != null)
        {
          localObject1 = ((Window)localObject1).getDecorView().getViewTreeObserver();
          ((ViewTreeObserver)localObject1).addOnScrollChangedListener(paramOnScrollChangedListener);
        }
      }
    }
  }
  
  public void zza(Context paramContext, String paramString, WebSettings paramWebSettings)
  {
    String str = zze(paramContext, paramString);
    paramWebSettings.setUserAgentString(str);
  }
  
  public void zza(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = paramContext.getApplicationContext();
      if (localObject1 == null) {
        localObject1 = paramContext;
      }
      localObject2 = Build.VERSION.RELEASE;
      paramBundle.putString("os", (String)localObject2);
      int i = Build.VERSION.SDK_INT;
      localObject2 = String.valueOf(i);
      paramBundle.putString("api", (String)localObject2);
      localObject2 = zzr.zzbC().zzht();
      paramBundle.putString("device", (String)localObject2);
      localObject1 = ((Context)localObject1).getPackageName();
      paramBundle.putString("appid", (String)localObject1);
      localObject1 = "eids";
      localObject2 = zzbt.zzdr();
      localObject3 = TextUtils.join(",", (Iterable)localObject2);
      paramBundle.putString((String)localObject1, (String)localObject3);
      if (paramString1 == null) {
        break label234;
      }
      localObject1 = "js";
      paramBundle.putString((String)localObject1, paramString1);
    }
    for (;;)
    {
      localObject1 = new android/net/Uri$Builder;
      ((Uri.Builder)localObject1).<init>();
      localObject3 = ((Uri.Builder)localObject1).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", paramString2);
      localObject1 = paramBundle.keySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        String str = paramBundle.getString((String)localObject1);
        ((Uri.Builder)localObject3).appendQueryParameter((String)localObject1, str);
      }
      label234:
      localObject1 = "gmscore_version";
      int j = zze.zzaj(paramContext);
      localObject3 = Integer.toString(j);
      paramBundle.putString((String)localObject1, (String)localObject3);
    }
    Object localObject1 = zzr.zzbC();
    Object localObject3 = ((Uri.Builder)localObject3).toString();
    ((zzir)localObject1).zzc(paramContext, paramString1, (String)localObject3);
  }
  
  public void zza(Context paramContext, String paramString, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      zziy localzziy = new com/google/android/gms/internal/zziy;
      localzziy.<init>(paramContext, paramString, str);
      localzziy.zzhn();
    }
  }
  
  public void zza(Context paramContext, String paramString1, List paramList, String paramString2)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      zziy localzziy = new com/google/android/gms/internal/zziy;
      localzziy.<init>(paramContext, paramString1, str, paramString2);
      localzziy.zzhn();
    }
  }
  
  public void zza(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    zza(paramContext, paramString, paramBoolean, paramHttpURLConnection, false);
  }
  
  public void zza(Context paramContext, String paramString1, boolean paramBoolean, HttpURLConnection paramHttpURLConnection, String paramString2)
  {
    int i = 60000;
    paramHttpURLConnection.setConnectTimeout(i);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean);
    paramHttpURLConnection.setReadTimeout(i);
    paramHttpURLConnection.setRequestProperty("User-Agent", paramString2);
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public void zza(Context paramContext, String paramString, boolean paramBoolean1, HttpURLConnection paramHttpURLConnection, boolean paramBoolean2)
  {
    int i = 60000;
    paramHttpURLConnection.setConnectTimeout(i);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean1);
    paramHttpURLConnection.setReadTimeout(i);
    String str = zze(paramContext, paramString);
    paramHttpURLConnection.setRequestProperty("User-Agent", str);
    paramHttpURLConnection.setUseCaches(paramBoolean2);
  }
  
  public boolean zza(Context paramContext, Bitmap paramBitmap, String paramString)
  {
    boolean bool = false;
    zzx.zzcE("saveImageToFile must not be called on the main UI thread.");
    FileOutputStream localFileOutputStream = null;
    try
    {
      localFileOutputStream = paramContext.openFileOutput(paramString, 0);
      localObject = Bitmap.CompressFormat.PNG;
      int i = 100;
      paramBitmap.compress((Bitmap.CompressFormat)localObject, i, localFileOutputStream);
      localFileOutputStream.close();
      paramBitmap.recycle();
      bool = true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = "Fail to save file";
        zzin.zzb((String)localObject, localException);
      }
    }
    return bool;
  }
  
  public boolean zza(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    int i = paramPackageManager.checkPermission(paramString2, paramString1);
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean zza(View paramView, Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = paramContext.getApplicationContext();
    if (localObject2 != null) {
      localObject2 = (PowerManager)((Context)localObject2).getSystemService("power");
    }
    for (Object localObject3 = localObject2;; localObject3 = null)
    {
      localObject2 = paramContext.getSystemService("keyguard");
      if (localObject2 != null)
      {
        boolean bool = localObject2 instanceof KeyguardManager;
        if (bool)
        {
          localObject2 = (KeyguardManager)localObject2;
          localObject1 = localObject2;
        }
      }
      return zza(paramView, (PowerManager)localObject3, (KeyguardManager)localObject1);
    }
  }
  
  public boolean zza(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    int i = paramView.getVisibility();
    boolean bool;
    zzir localzzir;
    if (i == 0)
    {
      bool = paramView.isShown();
      if (bool)
      {
        bool = zza(paramPowerManager);
        if (bool)
        {
          localzzir = zzr.zzbC();
          bool = localzzir.zzhq();
          if (!bool)
          {
            bool = zza(paramKeyguardManager);
            if (bool) {}
          }
          else
          {
            bool = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzir = null;
    }
  }
  
  public boolean zza(ClassLoader paramClassLoader, Class paramClass, String paramString)
  {
    boolean bool = false;
    Class localClass = null;
    try
    {
      localClass = Class.forName(paramString, false, paramClassLoader);
      bool = paramClass.isAssignableFrom(localClass);
    }
    finally
    {
      for (;;) {}
    }
    return bool;
  }
  
  public String zzaC(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }
  
  public int zzaD(String paramString)
  {
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "Could not parse value:";
        localStringBuilder = localStringBuilder.append(str);
        zzin.zzaK(localNumberFormatException);
        int i = 0;
        Object localObject = null;
      }
    }
    return i;
  }
  
  public boolean zzaE(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    String str;
    if (bool)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      str = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)";
      bool = paramString.matches(str);
    }
  }
  
  public void zzb(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    Object localObject1 = paramActivity.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = ((Window)localObject1).getDecorView();
      if (localObject2 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView().getViewTreeObserver();
        if (localObject2 != null)
        {
          localObject1 = ((Window)localObject1).getDecorView().getViewTreeObserver();
          ((ViewTreeObserver)localObject1).removeOnScrollChangedListener(paramOnScrollChangedListener);
        }
      }
    }
  }
  
  /* Error */
  public void zzb(Context paramContext, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokevirtual 792	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   5: return
    //   6: pop
    //   7: ldc_w 793
    //   10: istore_3
    //   11: aload_2
    //   12: iload_3
    //   13: invokevirtual 798	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   16: pop
    //   17: aload_1
    //   18: aload_2
    //   19: invokevirtual 792	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   22: goto -17 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	25	0	this	zzir
    //   0	25	1	paramContext	Context
    //   0	25	2	paramIntent	Intent
    //   10	3	3	i	int
    // Exception table:
    //   from	to	target	type
    //   1	5	6	finally
  }
  
  public void zzb(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    Boolean localBoolean = (Boolean)zzbt.zzwN.get();
    boolean bool = localBoolean.booleanValue();
    if (bool) {
      zza(paramContext, paramString1, paramString2, paramBundle, paramBoolean);
    }
  }
  
  public float zzbt()
  {
    com.google.android.gms.ads.internal.zzn localzzn = zzr.zzbQ().zzbs();
    if (localzzn != null)
    {
      boolean bool = localzzn.zzbu();
      if (!bool) {}
    }
    for (float f = localzzn.zzbt();; f = 1.0F) {
      return f;
    }
  }
  
  public void zzc(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localArrayList.add(paramString2);
    zza(paramContext, paramString1, localArrayList);
  }
  
  public String zze(Context paramContext, String paramString)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        Object localObject2 = this.zzzN;
        if (localObject2 != null)
        {
          localObject2 = this.zzzN;
          return (String)localObject2;
        }
        try
        {
          localObject2 = zzr.zzbE();
          localObject2 = ((zzis)localObject2).getDefaultUserAgent(paramContext);
          this.zzzN = ((String)localObject2);
        }
        catch (Exception localException2)
        {
          boolean bool;
          Object localObject6;
          continue;
        }
        localObject2 = this.zzzN;
        bool = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool)
        {
          localObject2 = com.google.android.gms.ads.internal.client.zzn.zzcS();
          bool = ((zza)localObject2).zzhJ();
          if (!bool)
          {
            bool = false;
            localObject2 = null;
            this.zzzN = null;
            localObject2 = zzMc;
            localObject6 = new com/google/android/gms/internal/zzir$1;
            ((zzir.1)localObject6).<init>(this, paramContext);
            ((Handler)localObject2).post((Runnable)localObject6);
            localObject2 = this.zzzN;
            if (localObject2 != null) {
              break label232;
            }
            try
            {
              localObject2 = this.zzpV;
              localObject2.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Object localObject3 = zzhr();
              this.zzzN = ((String)localObject3);
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject6 = "Interrupted, use default user agent: ";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
              localObject6 = this.zzzN;
              localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
              localObject3 = ((StringBuilder)localObject3).toString();
              zzin.zzaK((String)localObject3);
            }
          }
        }
      }
      try
      {
        localObject5 = zzK(paramContext);
        this.zzzN = ((String)localObject5);
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          Object localObject5;
          label232:
          String str = zzhr();
          this.zzzN = str;
        }
      }
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject6 = this.zzzN;
      localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
      localObject6 = " (Mobile; ";
      localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
      localObject5 = ((StringBuilder)localObject5).append(paramString);
      localObject6 = ")";
      localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
      localObject5 = ((StringBuilder)localObject5).toString();
      this.zzzN = ((String)localObject5);
      localObject5 = this.zzzN;
    }
  }
  
  public Map zze(Uri paramUri)
  {
    boolean bool;
    if (paramUri == null) {
      bool = false;
    }
    HashMap localHashMap;
    for (Object localObject = null;; localObject = localHashMap)
    {
      return (Map)localObject;
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localObject = zzr.zzbE().zzf(paramUri);
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (String)localIterator.next();
        String str = paramUri.getQueryParameter((String)localObject);
        localHashMap.put(localObject, str);
      }
    }
  }
  
  public int[] zze(Activity paramActivity)
  {
    Object localObject = paramActivity.getWindow();
    if (localObject != null)
    {
      int i = 16908290;
      View localView = ((Window)localObject).findViewById(i);
      if (localView != null)
      {
        int j = 2;
        localObject = new int[j];
        int k = localView.getWidth();
        localObject[0] = k;
        int m = 1;
        i = localView.getHeight();
        localObject[m] = i;
      }
    }
    for (;;)
    {
      return (int[])localObject;
      localObject = zzhu();
    }
  }
  
  public Bitmap zzf(Context paramContext, String paramString)
  {
    Object localObject1 = "getBackgroundImage must not be called on the main UI thread.";
    zzx.zzcE((String)localObject1);
    try
    {
      FileInputStream localFileInputStream = paramContext.openFileInput(paramString);
      localObject1 = BitmapFactory.decodeStream(localFileInputStream);
      localFileInputStream.close();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        zzin.e("Fail to get background image");
        Object localObject2 = null;
      }
    }
    return (Bitmap)localObject1;
  }
  
  public int[] zzf(Activity paramActivity)
  {
    int i = 1;
    int[] arrayOfInt1 = zze(paramActivity);
    int[] arrayOfInt2 = new int[2];
    zza localzza = com.google.android.gms.ads.internal.client.zzn.zzcS();
    int j = arrayOfInt1[0];
    int k = localzza.zzc(paramActivity, j);
    arrayOfInt2[0] = k;
    localzza = com.google.android.gms.ads.internal.client.zzn.zzcS();
    int m = arrayOfInt1[i];
    m = localzza.zzc(paramActivity, m);
    arrayOfInt2[i] = m;
    return arrayOfInt2;
  }
  
  public void zzg(Context paramContext, String paramString)
  {
    zzx.zzcE("deleteFile must not be called on the main UI thread.");
    paramContext.deleteFile(paramString);
  }
  
  public int[] zzg(Activity paramActivity)
  {
    Object localObject = paramActivity.getWindow();
    if (localObject != null)
    {
      int i = 16908290;
      View localView = ((Window)localObject).findViewById(i);
      if (localView != null)
      {
        int j = 2;
        localObject = new int[j];
        int k = localView.getTop();
        localObject[0] = k;
        int m = 1;
        i = localView.getBottom();
        localObject[m] = i;
      }
    }
    for (;;)
    {
      return (int[])localObject;
      localObject = zzhu();
    }
  }
  
  public int[] zzh(Activity paramActivity)
  {
    int i = 1;
    int[] arrayOfInt1 = zzg(paramActivity);
    int[] arrayOfInt2 = new int[2];
    zza localzza = com.google.android.gms.ads.internal.client.zzn.zzcS();
    int j = arrayOfInt1[0];
    int k = localzza.zzc(paramActivity, j);
    arrayOfInt2[0] = k;
    localzza = com.google.android.gms.ads.internal.client.zzn.zzcS();
    int m = arrayOfInt1[i];
    m = localzza.zzc(paramActivity, m);
    arrayOfInt2[i] = m;
    return arrayOfInt2;
  }
  
  public boolean zzhq()
  {
    return this.zzMd;
  }
  
  String zzhr()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int i = 256;
    localStringBuffer.<init>(i);
    localStringBuffer.append("Mozilla/5.0 (Linux; U; Android");
    Object localObject1 = Build.VERSION.RELEASE;
    if (localObject1 != null)
    {
      localObject1 = localStringBuffer.append(" ");
      localObject2 = Build.VERSION.RELEASE;
      ((StringBuffer)localObject1).append((String)localObject2);
    }
    localObject1 = localStringBuffer.append("; ");
    Object localObject2 = Locale.getDefault();
    ((StringBuffer)localObject1).append(localObject2);
    localObject1 = Build.DEVICE;
    if (localObject1 != null)
    {
      localObject1 = localStringBuffer.append("; ");
      localObject2 = Build.DEVICE;
      ((StringBuffer)localObject1).append((String)localObject2);
      localObject1 = Build.DISPLAY;
      if (localObject1 != null)
      {
        localObject1 = localStringBuffer.append(" Build/");
        localObject2 = Build.DISPLAY;
        ((StringBuffer)localObject1).append((String)localObject2);
      }
    }
    localStringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuffer.toString();
  }
  
  public String zzhs()
  {
    int i = 1;
    Object localObject1 = UUID.randomUUID();
    long l1 = ((UUID)localObject1).getLeastSignificantBits();
    byte[] arrayOfByte1 = BigInteger.valueOf(l1).toByteArray();
    long l2 = ((UUID)localObject1).getMostSignificantBits();
    byte[] arrayOfByte2 = BigInteger.valueOf(l2).toByteArray();
    localObject1 = new java/math/BigInteger;
    ((BigInteger)localObject1).<init>(i, arrayOfByte1);
    String str = ((BigInteger)localObject1).toString();
    int j = 0;
    localObject1 = null;
    for (;;)
    {
      int k = 2;
      if (j >= k) {
        break;
      }
      Object localObject2 = "MD5";
      try
      {
        localObject2 = MessageDigest.getInstance((String)localObject2);
        ((MessageDigest)localObject2).update(arrayOfByte1);
        ((MessageDigest)localObject2).update(arrayOfByte2);
        int m = 8;
        byte[] arrayOfByte3 = new byte[m];
        localObject2 = ((MessageDigest)localObject2).digest();
        i = 0;
        int n = 8;
        System.arraycopy(localObject2, 0, arrayOfByte3, 0, n);
        localObject2 = new java/math/BigInteger;
        i = 1;
        ((BigInteger)localObject2).<init>(i, arrayOfByte3);
        str = ((BigInteger)localObject2).toString();
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
      j += 1;
    }
    return str;
  }
  
  public String zzht()
  {
    Object localObject1 = Build.MANUFACTURER;
    String str = Build.MODEL;
    boolean bool = str.startsWith((String)localObject1);
    if (bool) {}
    for (;;)
    {
      return str;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = " ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      str = str;
    }
  }
  
  protected int[] zzhu()
  {
    int[] arrayOfInt = new int[2];
    int[] tmp5_4 = arrayOfInt;
    tmp5_4[0] = 0;
    tmp5_4[1] = 0;
    return arrayOfInt;
  }
  
  public Bitmap zzk(View paramView)
  {
    paramView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return localBitmap;
  }
  
  public int zzl(View paramView)
  {
    int i = -1;
    int j;
    if (paramView == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      for (Object localObject = paramView.getParent(); localObject != null; localObject = ((ViewParent)localObject).getParent())
      {
        boolean bool = localObject instanceof AdapterView;
        if (bool) {
          break;
        }
      }
      if (localObject == null)
      {
        j = i;
      }
      else
      {
        localObject = (AdapterView)localObject;
        j = ((AdapterView)localObject).getPositionForView(paramView);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzir.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */