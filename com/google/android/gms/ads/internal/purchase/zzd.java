package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgc.zza;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzii;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class zzd
  extends zzgc.zza
{
  private Context mContext;
  private String zzFI;
  private ArrayList zzFJ;
  private String zzsy;
  
  public zzd(String paramString1, ArrayList paramArrayList, Context paramContext, String paramString2)
  {
    this.zzFI = paramString1;
    this.zzFJ = paramArrayList;
    this.zzsy = paramString2;
    this.mContext = paramContext;
  }
  
  public String getProductId()
  {
    return this.zzFI;
  }
  
  public void recordPlayBillingResolution(int paramInt)
  {
    if (paramInt == 0) {
      zzfX();
    }
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    Object localObject2 = String.valueOf(paramInt);
    ((HashMap)localObject1).put("google_play_status", localObject2);
    localObject2 = this.zzFI;
    ((HashMap)localObject1).put("sku", localObject2);
    int i = zzB(paramInt);
    localObject2 = String.valueOf(i);
    ((HashMap)localObject1).put("status", localObject2);
    localObject2 = new java/util/LinkedList;
    ((LinkedList)localObject2).<init>();
    Object localObject3 = this.zzFJ;
    Object localObject4 = ((ArrayList)localObject3).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject4).hasNext();
      if (!bool) {
        break;
      }
      localObject3 = (String)((Iterator)localObject4).next();
      localObject3 = zza((String)localObject3, (HashMap)localObject1);
      ((LinkedList)localObject2).add(localObject3);
    }
    localObject3 = zzr.zzbC();
    localObject1 = this.mContext;
    localObject4 = this.zzsy;
    ((zzir)localObject3).zza((Context)localObject1, (String)localObject4, (List)localObject2);
  }
  
  public void recordResolution(int paramInt)
  {
    int i = 1;
    if (paramInt == i) {
      zzfX();
    }
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    Object localObject2 = String.valueOf(paramInt);
    ((HashMap)localObject1).put("status", localObject2);
    localObject2 = this.zzFI;
    ((HashMap)localObject1).put("sku", localObject2);
    localObject2 = new java/util/LinkedList;
    ((LinkedList)localObject2).<init>();
    Object localObject3 = this.zzFJ;
    Object localObject4 = ((ArrayList)localObject3).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject4).hasNext();
      if (!bool) {
        break;
      }
      localObject3 = (String)((Iterator)localObject4).next();
      localObject3 = zza((String)localObject3, (HashMap)localObject1);
      ((LinkedList)localObject2).add(localObject3);
    }
    localObject3 = zzr.zzbC();
    localObject1 = this.mContext;
    localObject4 = this.zzsy;
    ((zzir)localObject3).zza((Context)localObject1, (String)localObject4, (List)localObject2);
  }
  
  protected int zzB(int paramInt)
  {
    int i = 1;
    if (paramInt == 0) {}
    for (;;)
    {
      return i;
      if (paramInt == i)
      {
        i = 2;
      }
      else
      {
        i = 4;
        if (paramInt == i) {
          i = 3;
        } else {
          i = 0;
        }
      }
    }
  }
  
  protected String zza(String paramString, HashMap paramHashMap)
  {
    i = 1;
    localObject1 = this.mContext.getPackageName();
    localObject2 = "";
    try
    {
      Object localObject3 = this.mContext;
      localObject3 = ((Context)localObject3).getPackageManager();
      localObject5 = null;
      localObject3 = ((PackageManager)localObject3).getPackageInfo((String)localObject1, 0);
      localObject2 = ((PackageInfo)localObject3).versionName;
      localObject3 = localObject2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      long l1;
      for (;;)
      {
        long l2;
        localObject5 = "Error to retrieve app version";
        zzin.zzd((String)localObject5, localNameNotFoundException);
        localObject4 = localObject2;
      }
      Object localObject5 = new Object[i];
      localObject5[0] = "sessionid";
      localObject2 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject5);
      Object localObject7 = new Object[i];
      Object localObject6 = zzr.zzbF().getSessionId();
      localObject7[0] = localObject6;
      localObject5 = String.format("$1%s$2", (Object[])localObject7);
      localObject2 = paramString.replaceAll((String)localObject2, (String)localObject5);
      localObject7 = new Object[i];
      localObject7[0] = "appid";
      localObject5 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject7);
      localObject6 = new Object[i];
      localObject6[0] = localObject1;
      localObject1 = String.format("$1%s$2", (Object[])localObject6);
      localObject2 = ((String)localObject2).replaceAll((String)localObject5, (String)localObject1);
      localObject5 = new Object[i];
      localObject5[0] = "osversion";
      localObject1 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject5);
      localObject7 = new Object[i];
      localObject6 = String.valueOf(Build.VERSION.SDK_INT);
      localObject7[0] = localObject6;
      localObject5 = String.format("$1%s$2", (Object[])localObject7);
      localObject2 = ((String)localObject2).replaceAll((String)localObject1, (String)localObject5);
      localObject5 = new Object[i];
      localObject5[0] = "sdkversion";
      localObject1 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject5);
      localObject7 = new Object[i];
      localObject6 = this.zzsy;
      localObject7[0] = localObject6;
      localObject5 = String.format("$1%s$2", (Object[])localObject7);
      localObject2 = ((String)localObject2).replaceAll((String)localObject1, (String)localObject5);
      localObject5 = new Object[i];
      localObject5[0] = "appversion";
      localObject1 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject5);
      localObject7 = new Object[i];
      localObject7[0] = localObject4;
      Object localObject4 = String.format("$1%s$2", (Object[])localObject7);
      localObject2 = ((String)localObject2).replaceAll((String)localObject1, (String)localObject4);
      localObject1 = new Object[i];
      localObject1[0] = "timestamp";
      localObject4 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject1);
      localObject5 = new Object[i];
      String str = String.valueOf(l1);
      localObject5[0] = str;
      localObject1 = String.format("$1%s$2", (Object[])localObject5);
      localObject2 = ((String)localObject2).replaceAll((String)localObject4, (String)localObject1);
      localObject1 = new Object[i];
      localObject1[0] = "[^@]+";
      localObject4 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject1);
      localObject5 = new Object[i];
      localObject5[0] = "";
      localObject1 = String.format("$1%s$2", (Object[])localObject5);
      return ((String)localObject2).replaceAll((String)localObject4, (String)localObject1).replaceAll("@@", "@");
    }
    l1 = zzr.zzbF().zzha().zzhl();
    l2 = SystemClock.elapsedRealtime();
    l1 = l2 - l1;
    localObject2 = paramHashMap.keySet();
    localObject5 = ((Set)localObject2).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject5).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (String)((Iterator)localObject5).next();
      localObject6 = new Object[i];
      localObject6[0] = localObject2;
      localObject7 = String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", (Object[])localObject6);
      localObject6 = "$1%s$2";
      Object[] arrayOfObject = new Object[i];
      localObject2 = paramHashMap.get(localObject2);
      arrayOfObject[0] = localObject2;
      localObject2 = String.format((String)localObject6, arrayOfObject);
      paramString = paramString.replaceAll((String)localObject7, (String)localObject2);
    }
  }
  
  void zzfX()
  {
    try
    {
      Object localObject1 = this.mContext;
      localObject1 = ((Context)localObject1).getClassLoader();
      str3 = "com.google.ads.conversiontracking.IAPConversionReporter";
      localObject1 = ((ClassLoader)localObject1).loadClass(str3);
      str3 = "reportWithProductId";
      int i = 4;
      Object localObject2 = new Class[i];
      int j = 0;
      Object localObject3 = Context.class;
      localObject2[0] = localObject3;
      j = 1;
      localObject3 = String.class;
      localObject2[j] = localObject3;
      j = 2;
      localObject3 = String.class;
      localObject2[j] = localObject3;
      j = 3;
      localObject3 = Boolean.TYPE;
      localObject2[j] = localObject3;
      localObject1 = ((Class)localObject1).getDeclaredMethod(str3, (Class[])localObject2);
      str3 = null;
      i = 4;
      localObject2 = new Object[i];
      j = 0;
      localObject3 = this.mContext;
      localObject2[0] = localObject3;
      j = 1;
      localObject3 = this.zzFI;
      localObject2[j] = localObject3;
      j = 2;
      localObject3 = "";
      localObject2[j] = localObject3;
      j = 3;
      boolean bool = true;
      localObject3 = Boolean.valueOf(bool);
      localObject2[j] = localObject3;
      ((Method)localObject1).invoke(null, (Object[])localObject2);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        String str1 = "Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.";
        zzin.zzaK(str1);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        String str2 = "Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.";
        zzin.zzaK(str2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str3 = "Fail to report a conversion.";
        zzin.zzd(str3, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */