package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zznm.zza;
import com.google.android.gms.internal.zznm.zzb;
import com.google.android.gms.internal.zznm.zzc;
import com.google.android.gms.internal.zznm.zzf;
import com.google.android.gms.internal.zznm.zzg;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zzno.zzb;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public final class MetadataChangeSet
{
  public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
  public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 131072;
  public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
  public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
  public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
  public static final MetadataChangeSet zzapd;
  private final MetadataBundle zzape;
  
  static
  {
    MetadataChangeSet localMetadataChangeSet = new com/google/android/gms/drive/MetadataChangeSet;
    MetadataBundle localMetadataBundle = MetadataBundle.zztE();
    localMetadataChangeSet.<init>(localMetadataBundle);
    zzapd = localMetadataChangeSet;
  }
  
  public MetadataChangeSet(MetadataBundle paramMetadataBundle)
  {
    MetadataBundle localMetadataBundle = paramMetadataBundle.zztF();
    this.zzape = localMetadataBundle;
  }
  
  public Map getCustomPropertyChangeMap()
  {
    Object localObject = this.zzape;
    zznm.zza localzza = zznm.zzasW;
    localObject = (AppVisibleCustomProperties)((MetadataBundle)localObject).zza(localzza);
    if (localObject == null) {}
    for (localObject = Collections.emptyMap();; localObject = ((AppVisibleCustomProperties)localObject).zztz()) {
      return (Map)localObject;
    }
  }
  
  public String getDescription()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    MetadataField localMetadataField = zznm.zzasX;
    return (String)localMetadataBundle.zza(localMetadataField);
  }
  
  public String getIndexableText()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    MetadataField localMetadataField = zznm.zzatd;
    return (String)localMetadataBundle.zza(localMetadataField);
  }
  
  public Date getLastViewedByMeDate()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zzno.zzb localzzb = zzno.zzatN;
    return (Date)localMetadataBundle.zza(localzzb);
  }
  
  public String getMimeType()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzc localzzc = zznm.zzatr;
    return (String)localMetadataBundle.zza(localzzc);
  }
  
  public String getTitle()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzg localzzg = zznm.zzatA;
    return (String)localMetadataBundle.zza(localzzg);
  }
  
  public Boolean isPinned()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzb localzzb = zznm.zzatj;
    return (Boolean)localMetadataBundle.zza(localzzb);
  }
  
  public Boolean isStarred()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzf localzzf = zznm.zzaty;
    return (Boolean)localMetadataBundle.zza(localzzf);
  }
  
  public Boolean isViewed()
  {
    MetadataBundle localMetadataBundle = this.zzape;
    MetadataField localMetadataField = zznm.zzatq;
    return (Boolean)localMetadataBundle.zza(localMetadataField);
  }
  
  public MetadataChangeSet zza(MetadataField paramMetadataField, Object paramObject)
  {
    MetadataChangeSet localMetadataChangeSet = zzsM();
    localMetadataChangeSet.zzsL().zzc(paramMetadataField, paramObject);
    return localMetadataChangeSet;
  }
  
  public MetadataBundle zzsL()
  {
    return this.zzape;
  }
  
  public MetadataChangeSet zzsM()
  {
    MetadataChangeSet localMetadataChangeSet = new com/google/android/gms/drive/MetadataChangeSet;
    MetadataBundle localMetadataBundle = zzsL();
    localMetadataChangeSet.<init>(localMetadataBundle);
    return localMetadataChangeSet;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\MetadataChangeSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */