package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class DataSource
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
  public static final int TYPE_DERIVED = 1;
  public static final int TYPE_RAW;
  private final String mName;
  private final int mVersionCode;
  private final int zzabB;
  private final DataType zzavT;
  private final Device zzawr;
  private final Application zzaws;
  private final String zzawt;
  private final String zzawu;
  
  static
  {
    zzf localzzf = new com/google/android/gms/fitness/data/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  DataSource(int paramInt1, DataType paramDataType, String paramString1, int paramInt2, Device paramDevice, Application paramApplication, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.zzavT = paramDataType;
    this.zzabB = paramInt2;
    this.mName = paramString1;
    this.zzawr = paramDevice;
    this.zzaws = paramApplication;
    this.zzawt = paramString2;
    String str = zzun();
    this.zzawu = str;
  }
  
  private DataSource(DataSource.Builder paramBuilder)
  {
    this.mVersionCode = 3;
    Object localObject = DataSource.Builder.zza(paramBuilder);
    this.zzavT = ((DataType)localObject);
    int i = DataSource.Builder.zzb(paramBuilder);
    this.zzabB = i;
    localObject = DataSource.Builder.zzc(paramBuilder);
    this.mName = ((String)localObject);
    localObject = DataSource.Builder.zzd(paramBuilder);
    this.zzawr = ((Device)localObject);
    localObject = DataSource.Builder.zze(paramBuilder);
    this.zzaws = ((Application)localObject);
    localObject = DataSource.Builder.zzf(paramBuilder);
    this.zzawt = ((String)localObject);
    localObject = zzun();
    this.zzawu = ((String)localObject);
  }
  
  public static DataSource extract(Intent paramIntent)
  {
    if (paramIntent == null) {}
    Parcelable.Creator localCreator;
    for (DataSource localDataSource = null;; localDataSource = (DataSource)zzc.zza(paramIntent, "vnd.google.fitness.data_source", localCreator))
    {
      return localDataSource;
      localCreator = CREATOR;
    }
  }
  
  private String getTypeString()
  {
    int i = this.zzabB;
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("invalid type value");
      throw ((Throwable)localObject);
    }
    for (Object localObject = "raw";; localObject = "derived") {
      return (String)localObject;
    }
  }
  
  private boolean zza(DataSource paramDataSource)
  {
    String str1 = this.zzawu;
    String str2 = paramDataSource.zzawu;
    return str1.equals(str2);
  }
  
  private String zzun()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getTypeString();
    localStringBuilder.append((String)localObject);
    localObject = localStringBuilder.append(":");
    String str = this.zzavT.getName();
    ((StringBuilder)localObject).append(str);
    localObject = this.zzaws;
    if (localObject != null)
    {
      localObject = localStringBuilder.append(":");
      str = this.zzaws.getPackageName();
      ((StringBuilder)localObject).append(str);
    }
    localObject = this.zzawr;
    if (localObject != null)
    {
      localObject = localStringBuilder.append(":");
      str = this.zzawr.getStreamIdentifier();
      ((StringBuilder)localObject).append(str);
    }
    localObject = this.zzawt;
    if (localObject != null)
    {
      localObject = localStringBuilder.append(":");
      str = this.zzawt;
      ((StringBuilder)localObject).append(str);
    }
    return localStringBuilder.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof DataSource;
      if (!bool) {
        break label33;
      }
      paramObject = (DataSource)paramObject;
      bool = zza((DataSource)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String getAppPackageName()
  {
    Object localObject = this.zzaws;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaws.getPackageName()) {
      return (String)localObject;
    }
  }
  
  public DataType getDataType()
  {
    return this.zzavT;
  }
  
  public Device getDevice()
  {
    return this.zzawr;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getStreamIdentifier()
  {
    return this.zzawu;
  }
  
  public String getStreamName()
  {
    return this.zzawt;
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return this.zzawu.hashCode();
  }
  
  public String toDebugString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    int i = this.zzabB;
    label57:
    Object localObject3;
    if (i == 0)
    {
      localObject2 = "r";
      localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append(":");
      localObject1 = this.zzavT.zzuo();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = this.zzaws;
      if (localObject2 != null) {
        break label188;
      }
      localObject2 = "";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.zzawr;
      if (localObject2 == null) {
        break label252;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(":");
      localObject3 = this.zzawr.getModel();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(":");
      localObject3 = this.zzawr.getUid();
      localObject2 = (String)localObject3;
      label127:
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.zzawt;
      if (localObject2 == null) {
        break label258;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(":");
      localObject3 = this.zzawt;
    }
    label188:
    label252:
    label258:
    for (Object localObject2 = (String)localObject3;; localObject2 = "")
    {
      return (String)localObject2;
      localObject2 = "d";
      break;
      localObject2 = this.zzaws;
      localObject3 = Application.zzawa;
      boolean bool = ((Application)localObject2).equals(localObject3);
      if (bool)
      {
        localObject2 = ":gms";
        break label57;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(":");
      localObject3 = this.zzaws.getPackageName();
      localObject2 = (String)localObject3;
      break label57;
      localObject2 = "";
      break label127;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("DataSource{");
    Object localObject1 = getTypeString();
    localStringBuilder.append((String)localObject1);
    localObject1 = this.mName;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(":");
      localObject2 = this.mName;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = this.zzaws;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(":");
      localObject2 = this.zzaws;
      ((StringBuilder)localObject1).append(localObject2);
    }
    localObject1 = this.zzawr;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(":");
      localObject2 = this.zzawr;
      ((StringBuilder)localObject1).append(localObject2);
    }
    localObject1 = this.zzawt;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(":");
      localObject2 = this.zzawt;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = localStringBuilder.append(":");
    Object localObject2 = this.zzavT;
    ((StringBuilder)localObject1).append(localObject2);
    return "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public Application zzum()
  {
    return this.zzaws;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\DataSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */