package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class zzg
  extends zzz
{
  private long zzaVK;
  private String zzaVL;
  
  zzg(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  public String zzCA()
  {
    zzjv();
    return this.zzaVL;
  }
  
  public String zzCy()
  {
    zzjv();
    return Build.VERSION.RELEASE;
  }
  
  public long zzCz()
  {
    zzjv();
    return this.zzaVK;
  }
  
  public String zzht()
  {
    zzjv();
    return Build.MODEL;
  }
  
  protected void zziJ()
  {
    Object localObject1 = Calendar.getInstance();
    Object localObject2 = TimeUnit.MINUTES;
    int i = ((Calendar)localObject1).get(15);
    long l1 = ((Calendar)localObject1).get(16) + i;
    localObject1 = TimeUnit.MILLISECONDS;
    long l2 = ((TimeUnit)localObject2).convert(l1, (TimeUnit)localObject1);
    this.zzaVK = l2;
    localObject1 = Locale.getDefault();
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = ((Locale)localObject1).getLanguage();
    Locale localLocale = Locale.ENGLISH;
    localObject3 = ((String)localObject3).toLowerCase(localLocale);
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append("-");
    localObject1 = ((Locale)localObject1).getCountry();
    localObject3 = Locale.ENGLISH;
    localObject1 = ((String)localObject1).toLowerCase((Locale)localObject3);
    localObject1 = (String)localObject1;
    this.zzaVL = ((String)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */