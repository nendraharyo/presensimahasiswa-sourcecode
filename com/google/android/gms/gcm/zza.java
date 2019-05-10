package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;

class zza
{
  static AppMeasurement zzaLx;
  
  private static void zza(Context paramContext, String paramString, Intent paramIntent)
  {
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    Object localObject2 = paramIntent.getStringExtra("google.c.a.c_id");
    localObject4 = paramIntent.getStringExtra("google.c.a.c_l");
    String str3;
    if ((localObject2 != null) && (localObject4 != null))
    {
      str3 = "_nmid";
      ((Bundle)localObject1).putString(str3, (String)localObject2);
      localObject2 = "_nmn";
      ((Bundle)localObject1).putString((String)localObject2, (String)localObject4);
    }
    localObject2 = paramIntent.getStringExtra("from");
    if (localObject2 != null)
    {
      localObject4 = "/topics/";
      boolean bool1 = ((String)localObject2).startsWith((String)localObject4);
      if (!bool1) {}
    }
    for (;;)
    {
      if (localObject2 != null)
      {
        localObject4 = "_nt";
        ((Bundle)localObject1).putString((String)localObject4, (String)localObject2);
      }
      localObject2 = "google.c.a.ts";
      try
      {
        localObject2 = paramIntent.getStringExtra((String)localObject2);
        localObject2 = Integer.valueOf((String)localObject2);
        int j = ((Integer)localObject2).intValue();
        localObject4 = "_nmt";
        ((Bundle)localObject1).putInt((String)localObject4, j);
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        for (;;)
        {
          boolean bool2;
          str1 = "GcmAnalytics";
          localObject4 = "Error while parsing timestamp in GCM event.";
          Log.w(str1, (String)localObject4);
        }
      }
      localObject2 = "google.c.a.udt";
      bool2 = paramIntent.hasExtra((String)localObject2);
      if (bool2) {
        localObject2 = "google.c.a.udt";
      }
      try
      {
        localObject2 = paramIntent.getStringExtra((String)localObject2);
        localObject2 = Integer.valueOf((String)localObject2);
        int k = ((Integer)localObject2).intValue();
        localObject4 = "_ndt";
        ((Bundle)localObject1).putInt((String)localObject4, k);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        for (;;)
        {
          int i;
          boolean bool3;
          localObject3 = "GcmAnalytics";
          localObject4 = "Error while parsing use_device_time in GCM event.";
          Log.w((String)localObject3, (String)localObject4);
          continue;
          localObject3 = zzaLx;
        }
      }
      localObject2 = "GcmAnalytics";
      i = 3;
      bool3 = Log.isLoggable((String)localObject2, i);
      if (bool3)
      {
        localObject2 = "GcmAnalytics";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Sending event=").append(paramString);
        str3 = " params=";
        localObject4 = str3 + localObject1;
        Log.d((String)localObject2, (String)localObject4);
      }
      try
      {
        localObject2 = zzaLx;
        if (localObject2 != null) {
          break label356;
        }
        localObject2 = AppMeasurement.getInstance(paramContext);
        localObject4 = "gcm";
        ((AppMeasurement)localObject2).zzd((String)localObject4, paramString, (Bundle)localObject1);
        return;
      }
      catch (NoClassDefFoundError localNoClassDefFoundError)
      {
        for (;;)
        {
          String str1;
          Object localObject3;
          String str2 = "GcmAnalytics";
          localObject1 = "Unable to log event, missing measurement library";
          Log.w(str2, (String)localObject1);
        }
      }
      bool3 = false;
      localObject2 = null;
    }
  }
  
  public static void zze(Context paramContext, Intent paramIntent)
  {
    zza(paramContext, "_nr", paramIntent);
  }
  
  public static void zzf(Context paramContext, Intent paramIntent)
  {
    zza(paramContext, "_no", paramIntent);
  }
  
  public static void zzg(Context paramContext, Intent paramIntent)
  {
    zza(paramContext, "_nd", paramIntent);
  }
  
  public static void zzh(Context paramContext, Intent paramIntent)
  {
    zza(paramContext, "_nf", paramIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */