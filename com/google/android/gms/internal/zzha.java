package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;

public class zzha
  implements Thread.UncaughtExceptionHandler
{
  private Context mContext;
  private VersionInfoParcel zzEZ;
  private Thread.UncaughtExceptionHandler zzHe;
  private Thread.UncaughtExceptionHandler zzHf;
  
  public zzha(Context paramContext, VersionInfoParcel paramVersionInfoParcel, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler1, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler2)
  {
    this.zzHe = paramUncaughtExceptionHandler1;
    this.zzHf = paramUncaughtExceptionHandler2;
    this.mContext = paramContext;
    this.zzEZ = paramVersionInfoParcel;
  }
  
  private static boolean zzA(Context paramContext)
  {
    return ((Boolean)zzbt.zzvG.get()).booleanValue();
  }
  
  public static zzha zza(Context paramContext, Thread paramThread, VersionInfoParcel paramVersionInfoParcel)
  {
    boolean bool1;
    Object localObject1;
    if ((paramContext == null) || (paramThread == null) || (paramVersionInfoParcel == null))
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (zzha)localObject1;
      bool1 = zzA(paramContext);
      if (!bool1)
      {
        bool1 = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = paramThread.getUncaughtExceptionHandler();
        Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Object localObject2 = new com/google/android/gms/internal/zzha;
        ((zzha)localObject2).<init>(paramContext, paramVersionInfoParcel, (Thread.UncaughtExceptionHandler)localObject1, localUncaughtExceptionHandler);
        if (localObject1 != null)
        {
          boolean bool2 = localObject1 instanceof zzha;
          if (bool2) {}
        }
        else
        {
          try
          {
            paramThread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject2);
            localObject1 = localObject2;
          }
          catch (SecurityException localSecurityException)
          {
            localObject2 = "Fail to set UncaughtExceptionHandler.";
            zzin.zzc((String)localObject2, localSecurityException);
            bool1 = false;
            localzzha = null;
          }
          continue;
        }
        zzha localzzha = (zzha)localzzha;
      }
    }
  }
  
  private Throwable zzb(Throwable paramThrowable)
  {
    int i = 1;
    Object localObject1 = (Boolean)zzbt.zzvH.get();
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (bool1) {
      return paramThrowable;
    }
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    while (paramThrowable != null)
    {
      localLinkedList.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    Object localObject2 = null;
    label56:
    bool1 = localLinkedList.isEmpty();
    Object localObject3;
    if (!bool1)
    {
      localObject1 = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = ((Throwable)localObject1).getStackTrace();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject3 = new java/lang/StackTraceElement;
      String str1 = localObject1.getClass().getName();
      String str2 = "<filtered>";
      Object localObject4 = "<filtered>";
      ((StackTraceElement)localObject3).<init>(str1, str2, (String)localObject4, i);
      localArrayList.add(localObject3);
      int j = arrayOfStackTraceElement.length;
      int k = 0;
      str1 = null;
      int m = 0;
      localObject3 = null;
      if (k < j)
      {
        localObject4 = arrayOfStackTraceElement[k];
        String str3 = ((StackTraceElement)localObject4).getClassName();
        boolean bool2 = zzat(str3);
        if (bool2)
        {
          localArrayList.add(localObject4);
          m = i;
        }
        for (;;)
        {
          k += 1;
          break;
          str3 = ((StackTraceElement)localObject4).getClassName();
          bool2 = zzau(str3);
          if (bool2)
          {
            localArrayList.add(localObject4);
          }
          else
          {
            localObject4 = new java/lang/StackTraceElement;
            str3 = "<filtered>";
            String str4 = "<filtered>";
            String str5 = "<filtered>";
            ((StackTraceElement)localObject4).<init>(str3, str4, str5, i);
            localArrayList.add(localObject4);
          }
        }
      }
      if (m == 0) {
        break label358;
      }
      if (localObject2 == null)
      {
        localObject3 = new java/lang/Throwable;
        localObject1 = ((Throwable)localObject1).getMessage();
        ((Throwable)localObject3).<init>((String)localObject1);
        label303:
        localObject1 = new StackTraceElement[0];
        localObject1 = (StackTraceElement[])localArrayList.toArray((Object[])localObject1);
        ((Throwable)localObject3).setStackTrace((StackTraceElement[])localObject1);
      }
    }
    for (;;)
    {
      localObject2 = localObject3;
      break label56;
      localObject3 = new java/lang/Throwable;
      localObject1 = ((Throwable)localObject1).getMessage();
      ((Throwable)localObject3).<init>((String)localObject1, (Throwable)localObject2);
      break label303;
      paramThrowable = (Throwable)localObject2;
      break;
      label358:
      localObject3 = localObject2;
    }
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    boolean bool = zza(paramThrowable);
    Object localObject;
    if (bool)
    {
      localObject = Looper.getMainLooper().getThread();
      if (localObject != paramThread)
      {
        bool = true;
        zza(paramThrowable, bool);
      }
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      zza(paramThrowable, false);
      localObject = this.zzHe;
      if (localObject != null)
      {
        localObject = this.zzHe;
        ((Thread.UncaughtExceptionHandler)localObject).uncaughtException(paramThread, paramThrowable);
      }
      else
      {
        localObject = this.zzHf;
        if (localObject != null)
        {
          localObject = this.zzHf;
          ((Thread.UncaughtExceptionHandler)localObject).uncaughtException(paramThread, paramThrowable);
        }
      }
    }
  }
  
  String zza(Class paramClass, Throwable paramThrowable, boolean paramBoolean)
  {
    Object localObject1 = new java/io/StringWriter;
    ((StringWriter)localObject1).<init>();
    Object localObject2 = new java/io/PrintWriter;
    ((PrintWriter)localObject2).<init>((Writer)localObject1);
    paramThrowable.printStackTrace((PrintWriter)localObject2);
    localObject2 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject2).<init>();
    localObject2 = ((Uri.Builder)localObject2).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception");
    Object localObject3 = Build.VERSION.RELEASE;
    localObject2 = ((Uri.Builder)localObject2).appendQueryParameter("os", (String)localObject3);
    localObject3 = String.valueOf(Build.VERSION.SDK_INT);
    localObject2 = ((Uri.Builder)localObject2).appendQueryParameter("api", (String)localObject3);
    localObject3 = zzr.zzbC().zzht();
    localObject2 = ((Uri.Builder)localObject2).appendQueryParameter("device", (String)localObject3);
    localObject3 = this.zzEZ.afmaVersion;
    localObject2 = ((Uri.Builder)localObject2).appendQueryParameter("js", (String)localObject3);
    localObject3 = this.mContext.getApplicationContext().getPackageName();
    localObject2 = ((Uri.Builder)localObject2).appendQueryParameter("appid", (String)localObject3);
    localObject3 = paramClass.getName();
    localObject2 = ((Uri.Builder)localObject2).appendQueryParameter("exceptiontype", (String)localObject3);
    localObject1 = ((StringWriter)localObject1).toString();
    localObject1 = ((Uri.Builder)localObject2).appendQueryParameter("stacktrace", (String)localObject1);
    localObject3 = zzbt.zzdr();
    String str = TextUtils.join(",", (Iterable)localObject3);
    localObject1 = ((Uri.Builder)localObject1).appendQueryParameter("eids", str);
    str = String.valueOf(paramBoolean);
    return ((Uri.Builder)localObject1).appendQueryParameter("trapped", str).toString();
  }
  
  public void zza(Throwable paramThrowable, boolean paramBoolean)
  {
    Object localObject1 = this.mContext;
    boolean bool = zzA((Context)localObject1);
    if (!bool) {}
    for (;;)
    {
      return;
      localObject1 = zzb(paramThrowable);
      if (localObject1 != null)
      {
        Object localObject2 = paramThrowable.getClass();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject1 = zza((Class)localObject2, (Throwable)localObject1, paramBoolean);
        localArrayList.add(localObject1);
        localObject1 = zzr.zzbC();
        localObject2 = this.mContext;
        String str1 = this.zzEZ.afmaVersion;
        String str2 = zzr.zzbF().zzhe();
        ((zzir)localObject1).zza((Context)localObject2, str1, localArrayList, str2);
      }
    }
  }
  
  protected boolean zza(Throwable paramThrowable)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramThrowable == null) {
      return bool2;
    }
    int i = 0;
    int j = 0;
    while (paramThrowable != null)
    {
      StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
      int k = arrayOfStackTraceElement.length;
      int m = 0;
      while (m < k)
      {
        Object localObject = arrayOfStackTraceElement[m];
        String str = ((StackTraceElement)localObject).getClassName();
        boolean bool3 = zzat(str);
        if (bool3) {
          j = bool1;
        }
        str = getClass().getName();
        localObject = ((StackTraceElement)localObject).getClassName();
        boolean bool4 = str.equals(localObject);
        if (bool4) {
          i = bool1;
        }
        m += 1;
      }
      paramThrowable = paramThrowable.getCause();
    }
    if ((j != 0) && (i == 0)) {}
    for (;;)
    {
      bool2 = bool1;
      break;
      bool1 = false;
    }
  }
  
  protected boolean zzat(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = TextUtils.isEmpty(paramString);
    if (bool3) {}
    for (;;)
    {
      return bool2;
      Object localObject = "com.google.android.gms.ads";
      bool3 = paramString.startsWith((String)localObject);
      if (bool3)
      {
        bool2 = bool1;
      }
      else
      {
        localObject = "com.google.ads";
        bool3 = paramString.startsWith((String)localObject);
        if (bool3) {
          bool2 = bool1;
        } else {
          try
          {
            Class localClass = Class.forName(paramString);
            localObject = zzhb.class;
            bool2 = localClass.isAnnotationPresent((Class)localObject);
          }
          catch (Exception localException)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            String str = "Fail to check class type for class ";
            localObject = str + paramString;
            zzin.zza((String)localObject, localException);
          }
        }
      }
    }
  }
  
  protected boolean zzau(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = TextUtils.isEmpty(paramString);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      String str = "android.";
      bool2 = paramString.startsWith(str);
      if (!bool2)
      {
        str = "java.";
        bool2 = paramString.startsWith(str);
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzha.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */