package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.common.internal.zzx;

public final class DataSource$Builder
{
  private String mName;
  private int zzabB = -1;
  private DataType zzavT;
  private Device zzawr;
  private Application zzaws;
  private String zzawt = "";
  
  public DataSource build()
  {
    boolean bool1 = true;
    Object localObject = this.zzavT;
    int i;
    if (localObject != null)
    {
      boolean bool2 = bool1;
      String str = "Must set data type";
      zzx.zza(bool2, str);
      i = this.zzabB;
      if (i < 0) {
        break label57;
      }
    }
    for (;;)
    {
      zzx.zza(bool1, "Must set data source type");
      localObject = new com/google/android/gms/fitness/data/DataSource;
      ((DataSource)localObject).<init>(this, null);
      return (DataSource)localObject;
      i = 0;
      localObject = null;
      break;
      label57:
      bool1 = false;
    }
  }
  
  public Builder setAppPackageName(Context paramContext)
  {
    String str = paramContext.getPackageName();
    return setAppPackageName(str);
  }
  
  public Builder setAppPackageName(String paramString)
  {
    Application localApplication = Application.zzdn(paramString);
    this.zzaws = localApplication;
    return this;
  }
  
  public Builder setDataType(DataType paramDataType)
  {
    this.zzavT = paramDataType;
    return this;
  }
  
  public Builder setDevice(Device paramDevice)
  {
    this.zzawr = paramDevice;
    return this;
  }
  
  public Builder setName(String paramString)
  {
    this.mName = paramString;
    return this;
  }
  
  public Builder setStreamName(String paramString)
  {
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Must specify a valid stream name");
      this.zzawt = paramString;
      return this;
    }
  }
  
  public Builder setType(int paramInt)
  {
    this.zzabB = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\DataSource$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */