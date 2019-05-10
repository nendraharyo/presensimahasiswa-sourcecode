package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zzno;

public class SortableField
{
  public static final SortableMetadataField CREATED_DATE;
  public static final SortableMetadataField LAST_VIEWED_BY_ME;
  public static final SortableMetadataField MODIFIED_BY_ME_DATE;
  public static final SortableMetadataField MODIFIED_DATE;
  public static final SortableMetadataField QUOTA_USED = zznm.zzatx;
  public static final SortableMetadataField SHARED_WITH_ME_DATE;
  public static final SortableMetadataField TITLE = zznm.zzatA;
  public static final SortableMetadataField zzauf = zzno.zzatR;
  
  static
  {
    CREATED_DATE = zzno.zzatM;
    MODIFIED_DATE = zzno.zzatO;
    MODIFIED_BY_ME_DATE = zzno.zzatP;
    LAST_VIEWED_BY_ME = zzno.zzatN;
    SHARED_WITH_ME_DATE = zzno.zzatQ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\SortableField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */