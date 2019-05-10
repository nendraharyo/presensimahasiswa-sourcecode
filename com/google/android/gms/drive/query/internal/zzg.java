package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.Filter;
import java.util.List;

public class zzg
  implements zzf
{
  private Boolean zzaut;
  
  private zzg()
  {
    Boolean localBoolean = Boolean.valueOf(false);
    this.zzaut = localBoolean;
  }
  
  public static boolean zza(Filter paramFilter)
  {
    boolean bool;
    Object localObject;
    if (paramFilter == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = new com/google/android/gms/drive/query/internal/zzg;
      ((zzg)localObject).<init>();
      localObject = (Boolean)paramFilter.zza((zzf)localObject);
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public Boolean zzc(zzb paramzzb, Object paramObject)
  {
    return this.zzaut;
  }
  
  public Boolean zzc(Operator paramOperator, MetadataField paramMetadataField, Object paramObject)
  {
    return this.zzaut;
  }
  
  public Boolean zzc(Operator paramOperator, List paramList)
  {
    return this.zzaut;
  }
  
  public Boolean zzd(Boolean paramBoolean)
  {
    return this.zzaut;
  }
  
  public Boolean zzdk(String paramString)
  {
    boolean bool = paramString.isEmpty();
    if (!bool)
    {
      bool = true;
      Boolean localBoolean = Boolean.valueOf(bool);
      this.zzaut = localBoolean;
    }
    return this.zzaut;
  }
  
  public Boolean zzf(MetadataField paramMetadataField)
  {
    return this.zzaut;
  }
  
  public Boolean zzf(MetadataField paramMetadataField, Object paramObject)
  {
    return this.zzaut;
  }
  
  public Boolean zztR()
  {
    return this.zzaut;
  }
  
  public Boolean zztS()
  {
    return this.zzaut;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */