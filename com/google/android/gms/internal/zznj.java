package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zznj
{
  private static final Method zzaol = ;
  private static final Method zzaom = zzsq();
  private static final Method zzaon = zzsr();
  private static final Method zzaoo = zzss();
  private static final Method zzaop = zzst();
  
  public static int zza(WorkSource paramWorkSource)
  {
    Object localObject1 = zzaon;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = zzaon;
        localObject3 = null;
        localObject3 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(paramWorkSource, (Object[])localObject3);
        localObject1 = (Integer)localObject1;
        i = ((Integer)localObject1).intValue();
        return i;
      }
      catch (Exception localException)
      {
        Object localObject3 = "WorkSourceUtil";
        String str = "Unable to assign blame through WorkSource";
        Log.wtf((String)localObject3, str, localException);
      }
      int i = 0;
      Object localObject2 = null;
    }
  }
  
  public static String zza(WorkSource paramWorkSource, int paramInt)
  {
    Object localObject1 = zzaop;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = zzaop;
        int i = 1;
        localObject3 = new Object[i];
        str = null;
        Integer localInteger = Integer.valueOf(paramInt);
        localObject3[0] = localInteger;
        localObject1 = ((Method)localObject1).invoke(paramWorkSource, (Object[])localObject3);
        localObject1 = (String)localObject1;
        return (String)localObject1;
      }
      catch (Exception localException)
      {
        Object localObject3 = "WorkSourceUtil";
        String str = "Unable to assign blame through WorkSource";
        Log.wtf((String)localObject3, str, localException);
      }
      Object localObject2 = null;
    }
  }
  
  public static void zza(WorkSource paramWorkSource, int paramInt, String paramString)
  {
    Method localMethod1 = zzaom;
    if (localMethod1 != null) {
      if (paramString == null) {
        paramString = "";
      }
    }
    for (;;)
    {
      int i;
      Object localObject;
      int j;
      String str;
      Integer localInteger;
      try
      {
        localMethod1 = zzaom;
        i = 2;
        localObject = new Object[i];
        j = 0;
        str = null;
        localInteger = Integer.valueOf(paramInt);
        localObject[0] = localInteger;
        j = 1;
        localObject[j] = paramString;
        localMethod1.invoke(paramWorkSource, (Object[])localObject);
        return;
      }
      catch (Exception localException1)
      {
        localObject = "WorkSourceUtil";
        str = "Unable to assign blame through WorkSource";
        Log.wtf((String)localObject, str, localException1);
        continue;
      }
      Method localMethod2 = zzaol;
      if (localMethod2 != null) {
        try
        {
          localMethod2 = zzaol;
          i = 1;
          localObject = new Object[i];
          j = 0;
          str = null;
          localInteger = Integer.valueOf(paramInt);
          localObject[0] = localInteger;
          localMethod2.invoke(paramWorkSource, (Object[])localObject);
        }
        catch (Exception localException2)
        {
          localObject = "WorkSourceUtil";
          str = "Unable to assign blame through WorkSource";
          Log.wtf((String)localObject, str, localException2);
        }
      }
    }
  }
  
  public static boolean zzaA(Context paramContext)
  {
    boolean bool = false;
    if (paramContext == null) {}
    for (;;)
    {
      return bool;
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager != null)
      {
        String str1 = "android.permission.UPDATE_DEVICE_STATS";
        String str2 = paramContext.getPackageName();
        int i = localPackageManager.checkPermission(str1, str2);
        if (i == 0) {
          bool = true;
        }
      }
    }
  }
  
  public static List zzb(WorkSource paramWorkSource)
  {
    int i = 0;
    int j;
    Object localObject;
    if (paramWorkSource == null)
    {
      j = 0;
      if (j != 0) {
        break label30;
      }
      localObject = Collections.EMPTY_LIST;
    }
    for (;;)
    {
      return (List)localObject;
      int k = zza(paramWorkSource);
      j = k;
      break;
      label30:
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      while (i < j)
      {
        String str = zza(paramWorkSource, i);
        boolean bool = zzni.zzcV(str);
        if (!bool) {
          ((List)localObject).add(str);
        }
        i += 1;
      }
    }
  }
  
  public static WorkSource zzf(int paramInt, String paramString)
  {
    WorkSource localWorkSource = new android/os/WorkSource;
    localWorkSource.<init>();
    zza(localWorkSource, paramInt, paramString);
    return localWorkSource;
  }
  
  public static WorkSource zzl(Context paramContext, String paramString)
  {
    int i = 0;
    WorkSource localWorkSource = null;
    Object localObject1;
    if (paramContext != null)
    {
      localObject1 = paramContext.getPackageManager();
      if (localObject1 != null) {
        break label21;
      }
    }
    for (;;)
    {
      return localWorkSource;
      label21:
      String str1;
      try
      {
        localObject1 = paramContext.getPackageManager();
        localObject2 = null;
        localObject1 = ((PackageManager)localObject1).getApplicationInfo(paramString, 0);
        if (localObject1 != null) {
          break label136;
        }
        localObject1 = "WorkSourceUtil";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str2 = "Could not get applicationInfo from package: ";
        localObject2 = str2 + paramString;
        Log.e((String)localObject1, (String)localObject2);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        str1 = "WorkSourceUtil";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Could not find package: ";
        localObject2 = str2 + paramString;
        Log.e(str1, (String)localObject2);
      }
      continue;
      label136:
      i = str1.uid;
      localWorkSource = zzf(i, paramString);
    }
  }
  
  private static Method zzsp()
  {
    Method localMethod = null;
    Class localClass1 = WorkSource.class;
    String str = "add";
    int i = 1;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass2 = Integer.TYPE;
      arrayOfClass[0] = localClass2;
      localMethod = localClass1.getMethod(str, arrayOfClass);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localMethod;
  }
  
  private static Method zzsq()
  {
    Method localMethod = null;
    boolean bool = zzne.zzsj();
    Class localClass1;
    String str;
    int i;
    if (bool)
    {
      localClass1 = WorkSource.class;
      str = "add";
      i = 2;
    }
    try
    {
      Class[] arrayOfClass = new Class[i];
      int j = 0;
      Class localClass2 = Integer.TYPE;
      arrayOfClass[0] = localClass2;
      j = 1;
      localClass2 = String.class;
      arrayOfClass[j] = localClass2;
      localMethod = localClass1.getMethod(str, arrayOfClass);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localMethod;
  }
  
  private static Method zzsr()
  {
    Method localMethod = null;
    Class localClass = WorkSource.class;
    String str = "size";
    Class[] arrayOfClass = null;
    try
    {
      arrayOfClass = new Class[0];
      localMethod = localClass.getMethod(str, arrayOfClass);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localMethod;
  }
  
  private static Method zzss()
  {
    Method localMethod = null;
    Class localClass1 = WorkSource.class;
    String str = "get";
    int i = 1;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass2 = Integer.TYPE;
      arrayOfClass[0] = localClass2;
      localMethod = localClass1.getMethod(str, arrayOfClass);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localMethod;
  }
  
  private static Method zzst()
  {
    Method localMethod = null;
    boolean bool = zzne.zzsj();
    Class localClass1;
    String str;
    int i;
    if (bool)
    {
      localClass1 = WorkSource.class;
      str = "getName";
      i = 1;
    }
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass2 = Integer.TYPE;
      arrayOfClass[0] = localClass2;
      localMethod = localClass1.getMethod(str, arrayOfClass);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localMethod;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */