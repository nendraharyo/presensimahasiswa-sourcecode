package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.Locale;

public class zzl
{
  private static boolean zzaed = false;
  protected final String mTag;
  private final boolean zzaee;
  private boolean zzaef;
  private boolean zzaeg;
  private String zzaeh;
  
  public zzl(String paramString)
  {
    this(paramString, bool);
  }
  
  public zzl(String paramString, boolean paramBoolean)
  {
    String str = "The log tag cannot be null or empty.";
    zzx.zzh(paramString, str);
    this.mTag = paramString;
    int i = paramString.length();
    int j = 23;
    if (i <= j) {
      i = 1;
    }
    for (;;)
    {
      this.zzaee = i;
      this.zzaef = paramBoolean;
      this.zzaeg = false;
      return;
      i = 0;
      str = null;
    }
  }
  
  public static boolean zzox()
  {
    return zzaed;
  }
  
  public void zzY(boolean paramBoolean)
  {
    this.zzaef = paramBoolean;
  }
  
  public void zza(String paramString, Object... paramVarArgs)
  {
    boolean bool = zzow();
    if (bool)
    {
      String str1 = this.mTag;
      String str2 = zzg(paramString, paramVarArgs);
      Log.v(str1, str2);
    }
  }
  
  public void zzb(String paramString, Object... paramVarArgs)
  {
    boolean bool = zzov();
    if (!bool)
    {
      bool = zzaed;
      if (!bool) {}
    }
    else
    {
      String str1 = this.mTag;
      String str2 = zzg(paramString, paramVarArgs);
      Log.d(str1, str2);
    }
  }
  
  public void zzb(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    boolean bool = zzov();
    if (!bool)
    {
      bool = zzaed;
      if (!bool) {}
    }
    else
    {
      String str1 = this.mTag;
      String str2 = zzg(paramString, paramVarArgs);
      Log.d(str1, str2, paramThrowable);
    }
  }
  
  public void zzc(String paramString, Object... paramVarArgs)
  {
    String str1 = this.mTag;
    String str2 = zzg(paramString, paramVarArgs);
    Log.e(str1, str2);
  }
  
  public void zzc(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    String str1 = this.mTag;
    String str2 = zzg(paramString, paramVarArgs);
    Log.w(str1, str2, paramThrowable);
  }
  
  public void zzcn(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      bool = false;
    }
    Object[] arrayOfObject;
    for (String str = null;; str = String.format("[%s] ", arrayOfObject))
    {
      this.zzaeh = str;
      return;
      int i = 1;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
    }
  }
  
  public void zze(String paramString, Object... paramVarArgs)
  {
    String str1 = this.mTag;
    String str2 = zzg(paramString, paramVarArgs);
    Log.i(str1, str2);
  }
  
  public void zzf(String paramString, Object... paramVarArgs)
  {
    String str1 = this.mTag;
    String str2 = zzg(paramString, paramVarArgs);
    Log.w(str1, str2);
  }
  
  protected String zzg(String paramString, Object... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i == 0) {}
    for (;;)
    {
      Object localObject = this.zzaeh;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = this.zzaeh;
        localObject = ((StringBuilder)localObject).append(str).append(paramString);
        paramString = ((StringBuilder)localObject).toString();
      }
      return paramString;
      localObject = Locale.ROOT;
      paramString = String.format((Locale)localObject, paramString, paramVarArgs);
    }
  }
  
  public boolean zzov()
  {
    boolean bool = this.zzaef;
    String str;
    if (!bool)
    {
      bool = this.zzaee;
      if (bool)
      {
        str = this.mTag;
        int i = 3;
        bool = Log.isLoggable(str, i);
        if (!bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public boolean zzow()
  {
    return this.zzaeg;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */