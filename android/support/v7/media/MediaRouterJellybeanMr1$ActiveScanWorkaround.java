package android.support.v7.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybeanMr1$ActiveScanWorkaround
  implements Runnable
{
  private static final int WIFI_DISPLAY_SCAN_INTERVAL = 15000;
  private boolean mActivelyScanningWifiDisplays;
  private final DisplayManager mDisplayManager;
  private final Handler mHandler;
  private Method mScanWifiDisplaysMethod;
  
  public MediaRouterJellybeanMr1$ActiveScanWorkaround(Context paramContext, Handler paramHandler)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i != j)
    {
      localObject = new java/lang/UnsupportedOperationException;
      ((UnsupportedOperationException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    Object localObject = (DisplayManager)paramContext.getSystemService("display");
    this.mDisplayManager = ((DisplayManager)localObject);
    this.mHandler = paramHandler;
    localObject = DisplayManager.class;
    String str = "scanWifiDisplays";
    Class[] arrayOfClass = null;
    try
    {
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      this.mScanWifiDisplaysMethod = ((Method)localObject);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public void run()
  {
    boolean bool = this.mActivelyScanningWifiDisplays;
    if (bool) {}
    try
    {
      localObject1 = this.mScanWifiDisplaysMethod;
      localObject2 = this.mDisplayManager;
      localObject3 = null;
      localObject3 = new Object[0];
      ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject1;
        long l;
        localObject2 = "MediaRouterJellybeanMr1";
        localObject3 = "Cannot scan for wifi displays.";
        Log.w((String)localObject2, (String)localObject3, localIllegalAccessException);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Object localObject2 = "MediaRouterJellybeanMr1";
        Object localObject3 = "Cannot scan for wifi displays.";
        Log.w((String)localObject2, (String)localObject3, localInvocationTargetException);
      }
    }
    localObject1 = this.mHandler;
    l = 15000L;
    ((Handler)localObject1).postDelayed(this, l);
  }
  
  public void setActiveScanRouteTypes(int paramInt)
  {
    int i = paramInt & 0x2;
    boolean bool;
    Object localObject;
    if (i != 0)
    {
      bool = this.mActivelyScanningWifiDisplays;
      if (!bool)
      {
        localObject = this.mScanWifiDisplaysMethod;
        if (localObject == null) {
          break label45;
        }
        bool = true;
        this.mActivelyScanningWifiDisplays = bool;
        localObject = this.mHandler;
        ((Handler)localObject).post(this);
      }
    }
    for (;;)
    {
      return;
      label45:
      localObject = "MediaRouterJellybeanMr1";
      String str = "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.";
      Log.w((String)localObject, str);
      continue;
      bool = this.mActivelyScanningWifiDisplays;
      if (bool)
      {
        bool = false;
        this.mActivelyScanningWifiDisplays = false;
        localObject = this.mHandler;
        ((Handler)localObject).removeCallbacks(this);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybeanMr1$ActiveScanWorkaround.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */