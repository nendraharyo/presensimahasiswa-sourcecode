package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class FieldOnlyFilter
  extends AbstractFilter
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final MetadataBundle zzauh;
  private final MetadataField zzaui;
  
  static
  {
    zzb localzzb = new com/google/android/gms/drive/query/internal/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  FieldOnlyFilter(int paramInt, MetadataBundle paramMetadataBundle)
  {
    this.mVersionCode = paramInt;
    this.zzauh = paramMetadataBundle;
    MetadataField localMetadataField = zze.zza(paramMetadataBundle);
    this.zzaui = localMetadataField;
  }
  
  public FieldOnlyFilter(SearchableMetadataField paramSearchableMetadataField)
  {
    this(1, localMetadataBundle);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    MetadataField localMetadataField = this.zzaui;
    return paramzzf.zze(localMetadataField);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\FieldOnlyFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */