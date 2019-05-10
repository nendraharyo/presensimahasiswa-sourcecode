package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.internal.zzae;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StandardExceptionParser
  implements ExceptionParser
{
  private final TreeSet zzPr;
  
  public StandardExceptionParser(Context paramContext, Collection paramCollection)
  {
    TreeSet localTreeSet = new java/util/TreeSet;
    localTreeSet.<init>();
    this.zzPr = localTreeSet;
    setIncludedPackages(paramContext, paramCollection);
  }
  
  protected StackTraceElement getBestStackTraceElement(Throwable paramThrowable)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    int i;
    Object localObject;
    if (arrayOfStackTraceElement != null)
    {
      i = arrayOfStackTraceElement.length;
      if (i != 0) {}
    }
    else
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (StackTraceElement)localObject;
      int k = arrayOfStackTraceElement.length;
      int j;
      for (int m = 0;; m = j)
      {
        if (m >= k) {
          break label118;
        }
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[m];
        String str = localStackTraceElement.getClassName();
        localObject = this.zzPr;
        Iterator localIterator = ((TreeSet)localObject).iterator();
        boolean bool;
        do
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject = (String)localIterator.next();
          bool = str.startsWith((String)localObject);
        } while (!bool);
        localObject = localStackTraceElement;
        break;
        j = m + 1;
      }
      label118:
      localObject = arrayOfStackTraceElement[0];
    }
  }
  
  protected Throwable getCause(Throwable paramThrowable)
  {
    for (;;)
    {
      Throwable localThrowable = paramThrowable.getCause();
      if (localThrowable == null) {
        break;
      }
      paramThrowable = paramThrowable.getCause();
    }
    return paramThrowable;
  }
  
  public String getDescription(String paramString, Throwable paramThrowable)
  {
    Throwable localThrowable = getCause(paramThrowable);
    Object localObject = getCause(paramThrowable);
    localObject = getBestStackTraceElement((Throwable)localObject);
    return getDescription(localThrowable, (StackTraceElement)localObject, paramString);
  }
  
  protected String getDescription(Throwable paramThrowable, StackTraceElement paramStackTraceElement, String paramString)
  {
    int i = 1;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = paramThrowable.getClass().getSimpleName();
    localStringBuilder.append(str);
    Object localObject;
    if (paramStackTraceElement != null)
    {
      localObject = paramStackTraceElement.getClassName().split("\\.");
      str = "unknown";
      if (localObject != null)
      {
        j = localObject.length;
        if (j > 0)
        {
          k = localObject.length + -1;
          str = localObject[k];
        }
      }
      localObject = " (@%s:%s:%s)";
      int j = 3;
      Object[] arrayOfObject = new Object[j];
      arrayOfObject[0] = str;
      str = paramStackTraceElement.getMethodName();
      arrayOfObject[i] = str;
      int k = 2;
      int m = paramStackTraceElement.getLineNumber();
      Integer localInteger = Integer.valueOf(m);
      arrayOfObject[k] = localInteger;
      str = String.format((String)localObject, arrayOfObject);
      localStringBuilder.append(str);
    }
    if (paramString != null)
    {
      localObject = new Object[i];
      localObject[0] = paramString;
      str = String.format(" {%s}", (Object[])localObject);
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public void setIncludedPackages(Context paramContext, Collection paramCollection)
  {
    int i = 1;
    Object localObject1 = this.zzPr;
    ((TreeSet)localObject1).clear();
    Object localObject2 = new java/util/HashSet;
    ((HashSet)localObject2).<init>();
    if (paramCollection != null) {
      ((Set)localObject2).addAll(paramCollection);
    }
    Object localObject3;
    Object localObject4;
    String str;
    if (paramContext != null) {
      try
      {
        localObject1 = paramContext.getApplicationContext();
        localObject1 = ((Context)localObject1).getPackageName();
        localObject3 = this.zzPr;
        ((TreeSet)localObject3).add(localObject1);
        localObject3 = paramContext.getApplicationContext();
        localObject3 = ((Context)localObject3).getPackageManager();
        int j = 1;
        localObject1 = ((PackageManager)localObject3).getPackageInfo((String)localObject1, j);
        localObject3 = ((PackageInfo)localObject1).activities;
        if (localObject3 != null)
        {
          j = localObject3.length;
          int k = 0;
          localObject1 = null;
          while (k < j)
          {
            localObject4 = localObject3[k];
            localObject4 = ((ActivityInfo)localObject4).packageName;
            ((Set)localObject2).add(localObject4);
            k += 1;
          }
        }
        localIterator = ((Set)localObject2).iterator();
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        str = "No package found";
        zzae.zzaJ(str);
      }
    }
    Iterator localIterator;
    boolean bool1 = localIterator.hasNext();
    if (bool1)
    {
      str = (String)localIterator.next();
      localObject2 = this.zzPr;
      localObject4 = ((TreeSet)localObject2).iterator();
      int m = i;
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject4).hasNext();
        if (bool2)
        {
          localObject2 = (String)((Iterator)localObject4).next();
          boolean bool3 = str.startsWith((String)localObject2);
          if (bool3) {
            break label309;
          }
          boolean bool4 = ((String)localObject2).startsWith(str);
          if (bool4)
          {
            localObject4 = this.zzPr;
            ((TreeSet)localObject4).remove(localObject2);
          }
        }
        if (m == 0) {
          break;
        }
        localObject2 = this.zzPr;
        ((TreeSet)localObject2).add(str);
        break;
        label309:
        m = 0;
        localObject3 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\StandardExceptionParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */