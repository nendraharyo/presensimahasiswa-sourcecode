package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ComparisonFilter
  extends AbstractFilter
{
  public static final zza CREATOR;
  final int mVersionCode;
  final Operator zzaug;
  final MetadataBundle zzauh;
  final MetadataField zzaui;
  
  static
  {
    zza localzza = new com/google/android/gms/drive/query/internal/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ComparisonFilter(int paramInt, Operator paramOperator, MetadataBundle paramMetadataBundle)
  {
    this.mVersionCode = paramInt;
    this.zzaug = paramOperator;
    this.zzauh = paramMetadataBundle;
    MetadataField localMetadataField = zze.zza(paramMetadataBundle);
    this.zzaui = localMetadataField;
  }
  
  public ComparisonFilter(Operator paramOperator, SearchableMetadataField paramSearchableMetadataField, Object paramObject)
  {
    this(1, paramOperator, localMetadataBundle);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object getValue()
  {
    MetadataBundle localMetadataBundle = this.zzauh;
    MetadataField localMetadataField = this.zzaui;
    return localMetadataBundle.zza(localMetadataField);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    Operator localOperator = this.zzaug;
    MetadataField localMetadataField = this.zzaui;
    Object localObject = getValue();
    return paramzzf.zzb(localOperator, localMetadataField, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\ComparisonFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */