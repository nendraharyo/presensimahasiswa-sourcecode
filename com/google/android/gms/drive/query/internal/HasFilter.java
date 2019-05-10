package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter
  extends AbstractFilter
{
  public static final zzi CREATOR;
  final int mVersionCode;
  final MetadataBundle zzauh;
  final MetadataField zzaui;
  
  static
  {
    zzi localzzi = new com/google/android/gms/drive/query/internal/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  HasFilter(int paramInt, MetadataBundle paramMetadataBundle)
  {
    this.mVersionCode = paramInt;
    this.zzauh = paramMetadataBundle;
    MetadataField localMetadataField = zze.zza(paramMetadataBundle);
    this.zzaui = localMetadataField;
  }
  
  public HasFilter(SearchableMetadataField paramSearchableMetadataField, Object paramObject)
  {
    this(1, localMetadataBundle);
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
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    MetadataField localMetadataField = this.zzaui;
    Object localObject = getValue();
    return paramzzf.zze(localMetadataField, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\HasFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */