package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;

public class SortOrder$Builder
{
  private final List zzaud;
  private boolean zzaue;
  
  public SortOrder$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaud = localArrayList;
    this.zzaue = false;
  }
  
  public Builder addSortAscending(SortableMetadataField paramSortableMetadataField)
  {
    List localList = this.zzaud;
    FieldWithSortOrder localFieldWithSortOrder = new com/google/android/gms/drive/query/internal/FieldWithSortOrder;
    String str = paramSortableMetadataField.getName();
    localFieldWithSortOrder.<init>(str, true);
    localList.add(localFieldWithSortOrder);
    return this;
  }
  
  public Builder addSortDescending(SortableMetadataField paramSortableMetadataField)
  {
    List localList = this.zzaud;
    FieldWithSortOrder localFieldWithSortOrder = new com/google/android/gms/drive/query/internal/FieldWithSortOrder;
    String str = paramSortableMetadataField.getName();
    localFieldWithSortOrder.<init>(str, false);
    localList.add(localFieldWithSortOrder);
    return this;
  }
  
  public SortOrder build()
  {
    SortOrder localSortOrder = new com/google/android/gms/drive/query/SortOrder;
    List localList = this.zzaud;
    boolean bool = this.zzaue;
    localSortOrder.<init>(localList, bool, null);
    return localSortOrder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\SortOrder$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */