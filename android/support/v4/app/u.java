package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;

public final class u
{
  public static Intent a(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject1;
    if (i >= j)
    {
      localObject1 = paramActivity.getParentActivityIntent();
      if (localObject1 == null) {}
    }
    for (;;)
    {
      return (Intent)localObject1;
      localObject1 = b(paramActivity);
      if (localObject1 == null)
      {
        i = 0;
        localObject1 = null;
      }
      else
      {
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramActivity, (String)localObject1);
        try
        {
          localObject2 = b(paramActivity, localComponentName);
          if (localObject2 == null)
          {
            localObject1 = Intent.makeMainActivity(localComponentName);
          }
          else
          {
            localObject2 = new android/content/Intent;
            ((Intent)localObject2).<init>();
            localObject1 = ((Intent)localObject2).setComponent(localComponentName);
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          String str1 = "NavUtils";
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str2 = "getParentActivityIntent: bad parentActivityName '";
          localObject1 = ((StringBuilder)localObject2).append(str2).append((String)localObject1);
          localObject2 = "' in manifest";
          localObject1 = (String)localObject2;
          Log.e(str1, (String)localObject1);
          i = 0;
          localObject1 = null;
        }
      }
    }
  }
  
  public static Intent a(Context paramContext, ComponentName paramComponentName)
  {
    Object localObject = b(paramContext, paramComponentName);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (Intent)localObject;
      ComponentName localComponentName = new android/content/ComponentName;
      String str = paramComponentName.getPackageName();
      localComponentName.<init>(str, (String)localObject);
      localObject = b(paramContext, localComponentName);
      if (localObject == null)
      {
        localObject = Intent.makeMainActivity(localComponentName);
      }
      else
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        localObject = ((Intent)localObject).setComponent(localComponentName);
      }
    }
  }
  
  public static boolean a(Activity paramActivity, Intent paramIntent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    boolean bool;
    if (i >= j) {
      bool = paramActivity.shouldUpRecreateTask(paramIntent);
    }
    for (;;)
    {
      return bool;
      String str1 = paramActivity.getIntent().getAction();
      if (str1 != null)
      {
        String str2 = "android.intent.action.MAIN";
        bool = str1.equals(str2);
        if (!bool)
        {
          bool = true;
          continue;
        }
      }
      bool = false;
      str1 = null;
    }
  }
  
  public static String b(Activity paramActivity)
  {
    try
    {
      ComponentName localComponentName = paramActivity.getComponentName();
      return b(paramActivity, localComponentName);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(localNameNotFoundException);
      throw localIllegalArgumentException;
    }
  }
  
  public static String b(Context paramContext, ComponentName paramComponentName)
  {
    int i = 0;
    StringBuilder localStringBuilder = null;
    Object localObject1 = paramContext.getPackageManager();
    int j = 128;
    Object localObject2 = ((PackageManager)localObject1).getActivityInfo(paramComponentName, j);
    int k = Build.VERSION.SDK_INT;
    int m = 16;
    if (k >= m)
    {
      localObject1 = ((ActivityInfo)localObject2).parentActivityName;
      if (localObject1 == null) {}
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = ((ActivityInfo)localObject2).metaData;
      if (localObject1 == null)
      {
        k = 0;
        localObject1 = null;
      }
      else
      {
        localObject1 = ((ActivityInfo)localObject2).metaData;
        localObject2 = "android.support.PARENT_ACTIVITY";
        localObject1 = ((Bundle)localObject1).getString((String)localObject2);
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
        }
        else
        {
          localStringBuilder = null;
          i = ((String)localObject1).charAt(0);
          j = 46;
          if (i == j)
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject2 = paramContext.getPackageName();
            localStringBuilder = localStringBuilder.append((String)localObject2);
            localObject1 = (String)localObject1;
          }
        }
      }
    }
  }
  
  public static void b(Activity paramActivity, Intent paramIntent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {
      paramActivity.navigateUpTo(paramIntent);
    }
    for (;;)
    {
      return;
      i = 67108864;
      paramIntent.addFlags(i);
      paramActivity.startActivity(paramIntent);
      paramActivity.finish();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\ap\\u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */