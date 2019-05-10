package android.support.v4.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

public class b
{
  private static final Object a;
  private static TypedValue b;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public static int a(Context paramContext, String paramString)
  {
    if (paramString == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("permission is null");
      throw localIllegalArgumentException;
    }
    int i = Process.myPid();
    int j = Process.myUid();
    return paramContext.checkPermission(paramString, i, j);
  }
  
  public static Drawable a(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject1;
    if (i >= j) {
      localObject1 = paramContext.getDrawable(paramInt);
    }
    for (;;)
    {
      return (Drawable)localObject1;
      i = Build.VERSION.SDK_INT;
      j = 16;
      if (i >= j)
      {
        localObject1 = paramContext.getResources().getDrawable(paramInt);
        continue;
      }
      synchronized (a)
      {
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = new android/util/TypedValue;
          ((TypedValue)localObject1).<init>();
          b = (TypedValue)localObject1;
        }
        localObject1 = paramContext.getResources();
        TypedValue localTypedValue = b;
        boolean bool = true;
        ((Resources)localObject1).getValue(paramInt, localTypedValue, bool);
        localObject1 = b;
        i = ((TypedValue)localObject1).resourceId;
        ??? = paramContext.getResources();
        localObject1 = ((Resources)???).getDrawable(i);
      }
    }
  }
  
  public static File a(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {}
    File localFile;
    for (Object localObject = paramContext.getNoBackupFilesDir();; localObject = a(localFile))
    {
      return (File)localObject;
      localObject = paramContext.getApplicationInfo();
      localFile = new java/io/File;
      localObject = ((ApplicationInfo)localObject).dataDir;
      String str = "no_backup";
      localFile.<init>((String)localObject, str);
    }
  }
  
  private static File a(File paramFile)
  {
    synchronized (b.class)
    {
      boolean bool = paramFile.exists();
      if (!bool)
      {
        bool = paramFile.mkdirs();
        if (!bool)
        {
          bool = paramFile.exists();
          if (!bool) {
            break label36;
          }
        }
      }
      return paramFile;
      label36:
      String str1 = "ContextCompat";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = "Unable to create files subdir ";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      str2 = paramFile.getPath();
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject2 = ((StringBuilder)localObject2).toString();
      Log.w(str1, (String)localObject2);
      paramFile = null;
    }
  }
  
  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
    }
    for (;;)
    {
      return true;
      paramContext.startActivities(paramArrayOfIntent);
    }
  }
  
  public static ColorStateList b(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {}
    for (ColorStateList localColorStateList = paramContext.getColorStateList(paramInt);; localColorStateList = paramContext.getResources().getColorStateList(paramInt)) {
      return localColorStateList;
    }
  }
  
  public static int c(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {}
    Resources localResources;
    for (i = paramContext.getColor(paramInt);; i = localResources.getColor(paramInt))
    {
      return i;
      localResources = paramContext.getResources();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */