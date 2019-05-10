package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.a.b;

public class a
  extends b
{
  private static a.b a;
  
  public static a.b a()
  {
    return a;
  }
  
  public static void a(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {
      paramActivity.finishAffinity();
    }
    for (;;)
    {
      return;
      paramActivity.finish();
    }
  }
  
  public static void a(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
    }
    for (;;)
    {
      return;
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
  }
  
  public static void a(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
    }
    for (;;)
    {
      return;
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static void a(Activity paramActivity, ab paramab)
  {
    Object localObject = null;
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j)
    {
      if (paramab != null)
      {
        localObject = new android/support/v4/app/a$e;
        ((a.e)localObject).<init>(paramab);
      }
      paramActivity.setEnterSharedElementCallback((SharedElementCallback)localObject);
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 21;
      if (i >= j)
      {
        if (paramab != null)
        {
          localObject = new android/support/v4/app/a$d;
          ((a.d)localObject).<init>(paramab);
        }
        paramActivity.setEnterSharedElementCallback((SharedElementCallback)localObject);
      }
    }
  }
  
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    Object localObject1 = a;
    if (localObject1 != null)
    {
      localObject1 = a;
      boolean bool1 = ((a.b)localObject1).a(paramActivity, paramArrayOfString, paramInt);
      if (!bool1) {}
    }
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 23;
      boolean bool2;
      if (i >= j)
      {
        bool2 = paramActivity instanceof a.c;
        if (bool2)
        {
          localObject1 = paramActivity;
          localObject1 = (a.c)paramActivity;
          ((a.c)localObject1).validateRequestPermissionsRequestCode(paramInt);
        }
        ((Activity)paramActivity).requestPermissions(paramArrayOfString, paramInt);
      }
      else
      {
        bool2 = paramActivity instanceof a.a;
        if (bool2)
        {
          localObject1 = new android/os/Handler;
          Object localObject2 = Looper.getMainLooper();
          ((Handler)localObject1).<init>((Looper)localObject2);
          localObject2 = new android/support/v4/app/a$1;
          ((a.1)localObject2).<init>(paramArrayOfString, (Activity)paramActivity, paramInt);
          ((Handler)localObject1).post((Runnable)localObject2);
        }
      }
    }
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {}
    for (boolean bool = paramActivity.shouldShowRequestPermissionRationale(paramString);; bool = false) {
      return bool;
    }
  }
  
  public static void b(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramActivity.finishAfterTransition();
    }
    for (;;)
    {
      return;
      paramActivity.finish();
    }
  }
  
  public static void b(Activity paramActivity, ab paramab)
  {
    Object localObject = null;
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j)
    {
      if (paramab != null)
      {
        localObject = new android/support/v4/app/a$e;
        ((a.e)localObject).<init>(paramab);
      }
      paramActivity.setExitSharedElementCallback((SharedElementCallback)localObject);
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 21;
      if (i >= j)
      {
        if (paramab != null)
        {
          localObject = new android/support/v4/app/a$d;
          ((a.d)localObject).<init>(paramab);
        }
        paramActivity.setExitSharedElementCallback((SharedElementCallback)localObject);
      }
    }
  }
  
  public static void c(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramActivity.postponeEnterTransition();
    }
  }
  
  public static void d(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      paramActivity.startPostponedEnterTransition();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */