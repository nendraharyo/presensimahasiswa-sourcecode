package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Binder;
import java.util.Iterator;
import java.util.List;

public class zznf
{
  private static String zza(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    int i = paramInt + 4;
    int j = paramArrayOfStackTraceElement.length;
    if (i >= j) {}
    StringBuilder localStringBuilder;
    for (Object localObject = "<bottom of call stack>";; localObject = i)
    {
      return (String)localObject;
      i = paramInt + 4;
      localObject = paramArrayOfStackTraceElement[i];
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = ((StackTraceElement)localObject).getClassName();
      localStringBuilder = localStringBuilder.append(str).append(".");
      str = ((StackTraceElement)localObject).getMethodName();
      localStringBuilder = localStringBuilder.append(str);
      str = ":";
      localStringBuilder = localStringBuilder.append(str);
      i = ((StackTraceElement)localObject).getLineNumber();
    }
  }
  
  public static String zzaz(Context paramContext)
  {
    int i = Binder.getCallingPid();
    return zzi(paramContext, i);
  }
  
  public static String zzi(Context paramContext, int paramInt)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    boolean bool;
    if (localObject != null)
    {
      Iterator localIterator = ((List)localObject).iterator();
      int i;
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        i = ((ActivityManager.RunningAppProcessInfo)localObject).pid;
      } while (i != paramInt);
    }
    for (localObject = ((ActivityManager.RunningAppProcessInfo)localObject).processName;; localObject = null)
    {
      return (String)localObject;
      bool = false;
    }
  }
  
  public static String zzn(int paramInt1, int paramInt2)
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int i = paramInt2 + paramInt1;
    while (paramInt1 < i)
    {
      Object localObject = zza(arrayOfStackTraceElement, paramInt1);
      localObject = localStringBuffer.append((String)localObject);
      String str = " ";
      ((StringBuffer)localObject).append(str);
      paramInt1 += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */