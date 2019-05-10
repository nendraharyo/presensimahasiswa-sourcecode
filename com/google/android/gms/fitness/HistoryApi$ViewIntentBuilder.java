package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

public class HistoryApi$ViewIntentBuilder
{
  private final Context mContext;
  private long zzRD;
  private final DataType zzavT;
  private DataSource zzavU;
  private long zzavV;
  private String zzavW;
  
  public HistoryApi$ViewIntentBuilder(Context paramContext, DataType paramDataType)
  {
    this.mContext = paramContext;
    this.zzavT = paramDataType;
  }
  
  private Intent zzl(Intent paramIntent)
  {
    Object localObject1 = this.zzavW;
    if (localObject1 == null) {}
    for (;;)
    {
      return paramIntent;
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>(paramIntent);
      Object localObject2 = this.zzavW;
      localObject1 = ((Intent)localObject1).setPackage((String)localObject2);
      localObject2 = this.mContext.getPackageManager();
      ComponentName localComponentName = null;
      localObject2 = ((PackageManager)localObject2).resolveActivity((Intent)localObject1, 0);
      if (localObject2 != null)
      {
        localObject2 = ((ResolveInfo)localObject2).activityInfo.name;
        localComponentName = new android/content/ComponentName;
        String str = this.zzavW;
        localComponentName.<init>(str, (String)localObject2);
        ((Intent)localObject1).setComponent(localComponentName);
        paramIntent = (Intent)localObject1;
      }
    }
  }
  
  public Intent build()
  {
    boolean bool1 = true;
    long l1 = this.zzRD;
    long l2 = 0L;
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      bool2 = bool1;
      String str1 = "Start time must be set";
      zzx.zza(bool2, str1);
      l1 = this.zzavV;
      l2 = this.zzRD;
      bool2 = l1 < l2;
      if (!bool2) {
        break label154;
      }
    }
    for (;;)
    {
      zzx.zza(bool1, "End time must be set and after start time");
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("vnd.google.fitness.VIEW");
      String str2 = DataType.getMimeType(this.zzavU.getDataType());
      localIntent.setType(str2);
      long l3 = this.zzRD;
      localIntent.putExtra("vnd.google.fitness.start_time", l3);
      l3 = this.zzavV;
      localIntent.putExtra("vnd.google.fitness.end_time", l3);
      zzc.zza(this.zzavU, localIntent, "vnd.google.fitness.data_source");
      return zzl(localIntent);
      bool2 = false;
      localIntent = null;
      break;
      label154:
      bool1 = false;
      str2 = null;
    }
  }
  
  public ViewIntentBuilder setDataSource(DataSource paramDataSource)
  {
    DataType localDataType1 = paramDataSource.getDataType();
    DataType localDataType2 = this.zzavT;
    boolean bool = localDataType1.equals(localDataType2);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramDataSource;
    DataType localDataType3 = this.zzavT;
    arrayOfObject[1] = localDataType3;
    zzx.zzb(bool, "Data source %s is not for the data type %s", arrayOfObject);
    this.zzavU = paramDataSource;
    return this;
  }
  
  public ViewIntentBuilder setPreferredApplication(String paramString)
  {
    this.zzavW = paramString;
    return this;
  }
  
  public ViewIntentBuilder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    long l = paramTimeUnit.toMillis(paramLong1);
    this.zzRD = l;
    l = paramTimeUnit.toMillis(paramLong2);
    this.zzavV = l;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\HistoryApi$ViewIntentBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */