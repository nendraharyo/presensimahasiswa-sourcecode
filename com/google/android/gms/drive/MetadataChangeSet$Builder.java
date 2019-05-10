package com.google.android.gms.drive;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zznm.zzb;
import com.google.android.gms.internal.zznm.zzc;
import com.google.android.gms.internal.zznm.zzf;
import com.google.android.gms.internal.zznm.zzg;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zzno.zzb;
import java.util.Date;

public class MetadataChangeSet$Builder
{
  private final MetadataBundle zzape;
  private AppVisibleCustomProperties.zza zzapf;
  
  public MetadataChangeSet$Builder()
  {
    MetadataBundle localMetadataBundle = MetadataBundle.zztE();
    this.zzape = localMetadataBundle;
  }
  
  private int zzda(String paramString)
  {
    int i;
    byte[] arrayOfByte;
    if (paramString == null)
    {
      i = 0;
      arrayOfByte = null;
    }
    for (;;)
    {
      return i;
      arrayOfByte = paramString.getBytes();
      i = arrayOfByte.length;
    }
  }
  
  private String zzj(String paramString, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    return String.format("%s must be no more than %d bytes, but is %d bytes.", arrayOfObject);
  }
  
  private void zzk(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramInt1) {}
    for (boolean bool = true;; bool = false)
    {
      String str = zzj(paramString, paramInt1, paramInt2);
      zzx.zzb(bool, str);
      return;
    }
  }
  
  private AppVisibleCustomProperties.zza zzsN()
  {
    AppVisibleCustomProperties.zza localzza = this.zzapf;
    if (localzza == null)
    {
      localzza = new com/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$zza;
      localzza.<init>();
      this.zzapf = localzza;
    }
    return this.zzapf;
  }
  
  public MetadataChangeSet build()
  {
    Object localObject1 = this.zzapf;
    if (localObject1 != null)
    {
      localObject1 = this.zzape;
      localObject2 = zznm.zzasW;
      AppVisibleCustomProperties localAppVisibleCustomProperties = this.zzapf.zztA();
      ((MetadataBundle)localObject1).zzc((MetadataField)localObject2, localAppVisibleCustomProperties);
    }
    localObject1 = new com/google/android/gms/drive/MetadataChangeSet;
    Object localObject2 = this.zzape;
    ((MetadataChangeSet)localObject1).<init>((MetadataBundle)localObject2);
    return (MetadataChangeSet)localObject1;
  }
  
  public Builder deleteCustomProperty(CustomPropertyKey paramCustomPropertyKey)
  {
    zzx.zzb(paramCustomPropertyKey, "key");
    zzsN().zza(paramCustomPropertyKey, null);
    return this;
  }
  
  public Builder setCustomProperty(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    zzx.zzb(paramCustomPropertyKey, "key");
    zzx.zzb(paramString, "value");
    String str = paramCustomPropertyKey.getKey();
    int i = zzda(str);
    int j = zzda(paramString);
    i += j;
    zzk("The total size of key string and value string of a custom property", 124, i);
    zzsN().zza(paramCustomPropertyKey, paramString);
    return this;
  }
  
  public Builder setDescription(String paramString)
  {
    MetadataBundle localMetadataBundle = this.zzape;
    MetadataField localMetadataField = zznm.zzasX;
    localMetadataBundle.zzc(localMetadataField, paramString);
    return this;
  }
  
  public Builder setIndexableText(String paramString)
  {
    int i = zzda(paramString);
    zzk("Indexable text size", 131072, i);
    MetadataBundle localMetadataBundle = this.zzape;
    MetadataField localMetadataField = zznm.zzatd;
    localMetadataBundle.zzc(localMetadataField, paramString);
    return this;
  }
  
  public Builder setLastViewedByMeDate(Date paramDate)
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zzno.zzb localzzb = zzno.zzatN;
    localMetadataBundle.zzc(localzzb, paramDate);
    return this;
  }
  
  public Builder setMimeType(String paramString)
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzc localzzc = zznm.zzatr;
    localMetadataBundle.zzc(localzzc, paramString);
    return this;
  }
  
  public Builder setPinned(boolean paramBoolean)
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzb localzzb = zznm.zzatj;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localMetadataBundle.zzc(localzzb, localBoolean);
    return this;
  }
  
  public Builder setStarred(boolean paramBoolean)
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzf localzzf = zznm.zzaty;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localMetadataBundle.zzc(localzzf, localBoolean);
    return this;
  }
  
  public Builder setTitle(String paramString)
  {
    MetadataBundle localMetadataBundle = this.zzape;
    zznm.zzg localzzg = zznm.zzatA;
    localMetadataBundle.zzc(localzzg, paramString);
    return this;
  }
  
  public Builder setViewed(boolean paramBoolean)
  {
    MetadataBundle localMetadataBundle = this.zzape;
    MetadataField localMetadataField = zznm.zzatq;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localMetadataBundle.zzc(localMetadataField, localBoolean);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\MetadataChangeSet$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */