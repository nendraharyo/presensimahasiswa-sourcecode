package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.Collection;
import java.util.Iterator;

public class InFilter
  extends AbstractFilter
{
  public static final zzj CREATOR;
  final int mVersionCode;
  final MetadataBundle zzauh;
  private final zzb zzauu;
  
  static
  {
    zzj localzzj = new com/google/android/gms/drive/query/internal/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  InFilter(int paramInt, MetadataBundle paramMetadataBundle)
  {
    this.mVersionCode = paramInt;
    this.zzauh = paramMetadataBundle;
    zzb localzzb = (zzb)zze.zza(paramMetadataBundle);
    this.zzauu = localzzb;
  }
  
  public InFilter(SearchableCollectionMetadataField paramSearchableCollectionMetadataField, Object paramObject)
  {
    this(1, (MetadataBundle)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object getValue()
  {
    MetadataBundle localMetadataBundle = this.zzauh;
    zzb localzzb = this.zzauu;
    return ((Collection)localMetadataBundle.zza(localzzb)).iterator().next();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    zzb localzzb = this.zzauu;
    Object localObject = getValue();
    return paramzzf.zzb(localzzb, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\InFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */