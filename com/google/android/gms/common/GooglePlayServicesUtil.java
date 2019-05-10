package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.Style;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.w.c;
import android.util.TypedValue;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzh;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmu;
import com.google.android.gms.internal.zzne;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GooglePlayServicesUtil
  extends zze
{
  public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = zze.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return getErrorDialog(paramInt1, paramActivity, paramInt2, null);
  }
  
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return zza(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }
  
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return zze.getErrorPendingIntent(paramInt1, paramContext, paramInt2);
  }
  
  public static String getErrorString(int paramInt)
  {
    return zze.getErrorString(paramInt);
  }
  
  public static String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    return zze.getOpenSourceSoftwareLicenseInfo(paramContext);
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    return zze.getRemoteContext(paramContext);
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    return zze.getRemoteResource(paramContext);
  }
  
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    return zze.isGooglePlayServicesAvailable(paramContext);
  }
  
  public static boolean isUserRecoverableError(int paramInt)
  {
    return zze.isUserRecoverableError(paramInt);
  }
  
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, paramInt2, null);
  }
  
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }
  
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = zza(paramInt1, paramActivity, paramFragment, paramInt2, paramOnCancelListener);
    boolean bool;
    if (localDialog == null)
    {
      bool = false;
      localDialog = null;
    }
    for (;;)
    {
      return bool;
      String str = "GooglePlayServicesErrorDialog";
      zza(paramActivity, paramOnCancelListener, str, localDialog);
      bool = true;
    }
  }
  
  public static void showErrorNotification(int paramInt, Context paramContext)
  {
    boolean bool1 = zzmu.zzaw(paramContext);
    if (bool1)
    {
      int i = 2;
      if (paramInt == i) {
        paramInt = 42;
      }
    }
    boolean bool2 = zzd(paramContext, paramInt);
    if (!bool2)
    {
      bool2 = zze(paramContext, paramInt);
      if (!bool2) {}
    }
    else
    {
      zzam(paramContext);
    }
    for (;;)
    {
      return;
      zza(paramInt, paramContext);
    }
  }
  
  private static Dialog zza(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject1 = null;
    if (paramInt1 == 0) {
      return (Dialog)localObject1;
    }
    boolean bool1 = zzmu.zzaw(paramActivity);
    if (bool1)
    {
      int i = 2;
      if (paramInt1 == i) {
        paramInt1 = 42;
      }
    }
    boolean bool2 = zzd(paramActivity, paramInt1);
    if (bool2) {
      paramInt1 = 18;
    }
    bool2 = zzne.zzsg();
    if (bool2)
    {
      localObject2 = new android/util/TypedValue;
      ((TypedValue)localObject2).<init>();
      localObject3 = paramActivity.getTheme();
      int m = 16843529;
      boolean bool4 = true;
      ((Resources.Theme)localObject3).resolveAttribute(m, (TypedValue)localObject2, bool4);
      localObject3 = paramActivity.getResources();
      int j = ((TypedValue)localObject2).resourceId;
      localObject2 = ((Resources)localObject3).getResourceEntryName(j);
      localObject3 = "Theme.Dialog.Alert";
      boolean bool3 = ((String)localObject3).equals(localObject2);
      if (bool3)
      {
        localObject1 = new android/app/AlertDialog$Builder;
        int k = 5;
        ((AlertDialog.Builder)localObject1).<init>(paramActivity, k);
      }
    }
    if (localObject1 == null)
    {
      localObject1 = new android/app/AlertDialog$Builder;
      ((AlertDialog.Builder)localObject1).<init>(paramActivity);
    }
    Object localObject2 = zzao(paramActivity);
    localObject2 = zzg.zzc(paramActivity, paramInt1, (String)localObject2);
    ((AlertDialog.Builder)localObject1).setMessage((CharSequence)localObject2);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject1).setOnCancelListener(paramOnCancelListener);
    }
    localObject2 = GoogleApiAvailability.getInstance();
    Object localObject3 = ((GoogleApiAvailability)localObject2).zza(paramActivity, paramInt1, "d");
    if (paramFragment == null)
    {
      localObject2 = new com/google/android/gms/common/internal/zzh;
      ((zzh)localObject2).<init>(paramActivity, (Intent)localObject3, paramInt2);
    }
    for (;;)
    {
      localObject3 = zzg.zzh(paramActivity, paramInt1);
      if (localObject3 != null) {
        ((AlertDialog.Builder)localObject1).setPositiveButton((CharSequence)localObject3, (DialogInterface.OnClickListener)localObject2);
      }
      localObject2 = zzg.zzg(paramActivity, paramInt1);
      if (localObject2 != null) {
        ((AlertDialog.Builder)localObject1).setTitle((CharSequence)localObject2);
      }
      localObject1 = ((AlertDialog.Builder)localObject1).create();
      break;
      localObject2 = new com/google/android/gms/common/internal/zzh;
      ((zzh)localObject2).<init>(paramFragment, (Intent)localObject3, paramInt2);
    }
  }
  
  private static void zza(int paramInt, Context paramContext)
  {
    zza(paramInt, paramContext, null);
  }
  
  private static void zza(int paramInt, Context paramContext, String paramString)
  {
    int i = 17301642;
    boolean bool1 = true;
    Object localObject1 = paramContext.getResources();
    Object localObject2 = zzao(paramContext);
    Object localObject3 = zzg.zzg(paramContext, paramInt);
    if (localObject3 == null)
    {
      int j = R.string.common_google_play_services_notification_ticker;
      localObject3 = ((Resources)localObject1).getString(j);
    }
    localObject2 = zzg.zzc(paramContext, paramInt, (String)localObject2);
    Object localObject4 = GoogleApiAvailability.getInstance();
    Object localObject5 = "n";
    localObject4 = ((GoogleApiAvailability)localObject4).zza(paramContext, paramInt, 0, (String)localObject5);
    boolean bool3 = zzmu.zzaw(paramContext);
    int n;
    int m;
    int k;
    if (bool3)
    {
      zzx.zzab(zzne.zzsh());
      localObject5 = new android/app/Notification$Builder;
      ((Notification.Builder)localObject5).<init>(paramContext);
      i = R.drawable.common_ic_googleplayservices;
      localObject5 = ((Notification.Builder)localObject5).setSmallIcon(i);
      i = 2;
      localObject5 = ((Notification.Builder)localObject5).setPriority(i).setAutoCancel(bool1);
      Notification.BigTextStyle localBigTextStyle = new android/app/Notification$BigTextStyle;
      localBigTextStyle.<init>();
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject3 = ((StringBuilder)localObject6).append((String)localObject3);
      localObject6 = " ";
      localObject3 = (String)localObject6 + (String)localObject2;
      localObject3 = localBigTextStyle.bigText((CharSequence)localObject3);
      localObject3 = ((Notification.Builder)localObject5).setStyle((Notification.Style)localObject3);
      n = R.drawable.common_full_open_on_phone;
      m = R.string.common_open_on_phone;
      localObject1 = ((Resources)localObject1).getString(m);
      localObject3 = ((Notification.Builder)localObject3).addAction(n, (CharSequence)localObject1, (PendingIntent)localObject4).build();
      localObject1 = localObject3;
      boolean bool2 = zzbw(paramInt);
      if (!bool2) {
        break label555;
      }
      k = 10436;
      localObject2 = zzafQ;
      ((AtomicBoolean)localObject2).set(false);
      n = k;
      label268:
      localObject3 = (NotificationManager)paramContext.getSystemService("notification");
      if (paramString == null) {
        break label567;
      }
      ((NotificationManager)localObject3).notify(paramString, n, (Notification)localObject1);
    }
    for (;;)
    {
      return;
      m = R.string.common_google_play_services_notification_ticker;
      localObject1 = ((Resources)localObject1).getString(m);
      boolean bool4 = zzne.zzsd();
      if (bool4)
      {
        localObject5 = new android/app/Notification$Builder;
        ((Notification.Builder)localObject5).<init>(paramContext);
        localObject5 = ((Notification.Builder)localObject5).setSmallIcon(i);
        localObject3 = ((Notification.Builder)localObject5).setContentTitle((CharSequence)localObject3).setContentText((CharSequence)localObject2).setContentIntent((PendingIntent)localObject4).setTicker((CharSequence)localObject1).setAutoCancel(bool1);
        boolean bool5 = zzne.zzsl();
        if (bool5) {
          ((Notification.Builder)localObject3).setLocalOnly(bool1);
        }
        bool5 = zzne.zzsh();
        if (bool5)
        {
          localObject1 = new android/app/Notification$BigTextStyle;
          ((Notification.BigTextStyle)localObject1).<init>();
          localObject1 = ((Notification.BigTextStyle)localObject1).bigText((CharSequence)localObject2);
          ((Notification.Builder)localObject3).setStyle((Notification.Style)localObject1);
        }
        for (localObject3 = ((Notification.Builder)localObject3).build();; localObject3 = ((Notification.Builder)localObject3).getNotification())
        {
          int i1 = Build.VERSION.SDK_INT;
          n = 19;
          if (i1 == n)
          {
            localObject1 = ((Notification)localObject3).extras;
            localObject2 = "android.support.localOnly";
            ((Bundle)localObject1).putBoolean((String)localObject2, bool1);
          }
          localObject1 = localObject3;
          break;
        }
      }
      localObject5 = new android/support/v4/app/w$c;
      ((w.c)localObject5).<init>(paramContext);
      localObject5 = ((w.c)localObject5).a(i);
      localObject1 = ((w.c)localObject5).c((CharSequence)localObject1);
      long l = System.currentTimeMillis();
      localObject3 = ((w.c)localObject1).a(l).b(bool1).a((PendingIntent)localObject4).a((CharSequence)localObject3).b((CharSequence)localObject2).a();
      localObject1 = localObject3;
      break;
      label555:
      k = 39789;
      n = k;
      break label268;
      label567:
      ((NotificationManager)localObject3).notify(n, (Notification)localObject1);
    }
  }
  
  public static void zza(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener, String paramString, Dialog paramDialog)
  {
    boolean bool = paramActivity instanceof i;
    Object localObject2;
    if (bool)
    {
      paramActivity = (i)paramActivity;
      localObject1 = paramActivity.getSupportFragmentManager();
      localObject2 = SupportErrorDialogFragment.newInstance(paramDialog, paramOnCancelListener);
      ((SupportErrorDialogFragment)localObject2).show((m)localObject1, paramString);
    }
    for (;;)
    {
      return;
      bool = zzne.zzsd();
      if (!bool) {
        break;
      }
      localObject1 = paramActivity.getFragmentManager();
      localObject2 = ErrorDialogFragment.newInstance(paramDialog, paramOnCancelListener);
      ((ErrorDialogFragment)localObject2).show((FragmentManager)localObject1, paramString);
    }
    Object localObject1 = new java/lang/RuntimeException;
    ((RuntimeException)localObject1).<init>("This Activity does not support Fragments.");
    throw ((Throwable)localObject1);
  }
  
  private static void zzam(Context paramContext)
  {
    GooglePlayServicesUtil.zza localzza = new com/google/android/gms/common/GooglePlayServicesUtil$zza;
    localzza.<init>(paramContext);
    Message localMessage = localzza.obtainMessage(1);
    localzza.sendMessageDelayed(localMessage, 120000L);
  }
  
  public static Intent zzbv(int paramInt)
  {
    return zze.zzbv(paramInt);
  }
  
  public static boolean zzd(Context paramContext, int paramInt)
  {
    return zze.zzd(paramContext, paramInt);
  }
  
  public static boolean zze(Context paramContext, int paramInt)
  {
    return zze.zze(paramContext, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\GooglePlayServicesUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */