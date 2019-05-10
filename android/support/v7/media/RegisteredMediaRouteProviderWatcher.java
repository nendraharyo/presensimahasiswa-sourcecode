package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class RegisteredMediaRouteProviderWatcher
{
  private final RegisteredMediaRouteProviderWatcher.Callback mCallback;
  private final Context mContext;
  private final Handler mHandler;
  private final PackageManager mPackageManager;
  private final ArrayList mProviders;
  private boolean mRunning;
  private final BroadcastReceiver mScanPackagesReceiver;
  private final Runnable mScanPackagesRunnable;
  
  public RegisteredMediaRouteProviderWatcher(Context paramContext, RegisteredMediaRouteProviderWatcher.Callback paramCallback)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mProviders = ((ArrayList)localObject);
    localObject = new android/support/v7/media/RegisteredMediaRouteProviderWatcher$1;
    ((RegisteredMediaRouteProviderWatcher.1)localObject).<init>(this);
    this.mScanPackagesReceiver = ((BroadcastReceiver)localObject);
    localObject = new android/support/v7/media/RegisteredMediaRouteProviderWatcher$2;
    ((RegisteredMediaRouteProviderWatcher.2)localObject).<init>(this);
    this.mScanPackagesRunnable = ((Runnable)localObject);
    this.mContext = paramContext;
    this.mCallback = paramCallback;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.mHandler = ((Handler)localObject);
    localObject = paramContext.getPackageManager();
    this.mPackageManager = ((PackageManager)localObject);
  }
  
  private int findProvider(String paramString1, String paramString2)
  {
    Object localObject = this.mProviders;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = (RegisteredMediaRouteProvider)this.mProviders.get(j);
      k = ((RegisteredMediaRouteProvider)localObject).hasComponentName(paramString1, paramString2);
      if (k == 0) {}
    }
    int m;
    for (int k = j;; m = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  private void scanPackages()
  {
    boolean bool = false;
    Object localObject1 = null;
    int j = this.mRunning;
    if (j == 0) {
      return;
    }
    Object localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("android.media.MediaRouteProviderService");
    Iterator localIterator = this.mPackageManager.queryIntentServices((Intent)localObject2, 0).iterator();
    j = 0;
    localObject2 = null;
    label48:
    bool = localIterator.hasNext();
    Object localObject3;
    Object localObject4;
    int k;
    int i;
    if (bool)
    {
      localObject1 = ((ResolveInfo)localIterator.next()).serviceInfo;
      if (localObject1 == null) {
        break label327;
      }
      localObject3 = ((ServiceInfo)localObject1).packageName;
      localObject4 = ((ServiceInfo)localObject1).name;
      k = findProvider((String)localObject3, (String)localObject4);
      if (k < 0)
      {
        localObject3 = new android/support/v7/media/RegisteredMediaRouteProvider;
        localObject4 = this.mContext;
        ComponentName localComponentName = new android/content/ComponentName;
        String str = ((ServiceInfo)localObject1).packageName;
        localObject1 = ((ServiceInfo)localObject1).name;
        localComponentName.<init>(str, (String)localObject1);
        ((RegisteredMediaRouteProvider)localObject3).<init>((Context)localObject4, localComponentName);
        ((RegisteredMediaRouteProvider)localObject3).start();
        localObject4 = this.mProviders;
        i = j + 1;
        ((ArrayList)localObject4).add(j, localObject3);
        localObject2 = this.mCallback;
        ((RegisteredMediaRouteProviderWatcher.Callback)localObject2).addProvider((MediaRouteProvider)localObject3);
      }
    }
    for (;;)
    {
      j = i;
      break label48;
      if (k >= j)
      {
        localObject1 = (RegisteredMediaRouteProvider)this.mProviders.get(k);
        ((RegisteredMediaRouteProvider)localObject1).start();
        ((RegisteredMediaRouteProvider)localObject1).rebindIfDisconnected();
        localObject4 = this.mProviders;
        i = j + 1;
        Collections.swap((List)localObject4, k, j);
        continue;
        localObject1 = this.mProviders;
        i = ((ArrayList)localObject1).size();
        if (j >= i) {
          break;
        }
        localObject1 = this.mProviders;
        i = ((ArrayList)localObject1).size() + -1;
        for (int m = i; m >= j; m = i)
        {
          localObject1 = (RegisteredMediaRouteProvider)this.mProviders.get(m);
          this.mCallback.removeProvider((MediaRouteProvider)localObject1);
          localObject3 = this.mProviders;
          ((ArrayList)localObject3).remove(localObject1);
          ((RegisteredMediaRouteProvider)localObject1).stop();
          i = m + -1;
        }
        break;
      }
      label327:
      i = j;
    }
  }
  
  public void start()
  {
    boolean bool = this.mRunning;
    if (!bool)
    {
      bool = true;
      this.mRunning = bool;
      Object localObject1 = new android/content/IntentFilter;
      ((IntentFilter)localObject1).<init>();
      ((IntentFilter)localObject1).addAction("android.intent.action.PACKAGE_ADDED");
      ((IntentFilter)localObject1).addAction("android.intent.action.PACKAGE_REMOVED");
      ((IntentFilter)localObject1).addAction("android.intent.action.PACKAGE_CHANGED");
      ((IntentFilter)localObject1).addAction("android.intent.action.PACKAGE_REPLACED");
      ((IntentFilter)localObject1).addAction("android.intent.action.PACKAGE_RESTARTED");
      ((IntentFilter)localObject1).addDataScheme("package");
      Object localObject2 = this.mContext;
      BroadcastReceiver localBroadcastReceiver = this.mScanPackagesReceiver;
      Handler localHandler = this.mHandler;
      ((Context)localObject2).registerReceiver(localBroadcastReceiver, (IntentFilter)localObject1, null, localHandler);
      localObject1 = this.mHandler;
      localObject2 = this.mScanPackagesRunnable;
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
  
  public void stop()
  {
    boolean bool = this.mRunning;
    if (bool)
    {
      this.mRunning = false;
      Object localObject1 = this.mContext;
      Object localObject2 = this.mScanPackagesReceiver;
      ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject2);
      localObject1 = this.mHandler;
      localObject2 = this.mScanPackagesRunnable;
      ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
      localObject1 = this.mProviders;
      int i = ((ArrayList)localObject1).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject1 = (RegisteredMediaRouteProvider)this.mProviders.get(j);
        ((RegisteredMediaRouteProvider)localObject1).stop();
        i = j + -1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RegisteredMediaRouteProviderWatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */