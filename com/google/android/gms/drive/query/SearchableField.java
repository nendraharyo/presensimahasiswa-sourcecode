package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zzno;

public class SearchableField
{
  public static final SearchableMetadataField IS_PINNED = zznm.zzatj;
  public static final SearchableOrderedMetadataField LAST_VIEWED_BY_ME;
  public static final SearchableMetadataField MIME_TYPE;
  public static final SearchableOrderedMetadataField MODIFIED_DATE;
  public static final SearchableCollectionMetadataField PARENTS;
  public static final SearchableMetadataField STARRED;
  public static final SearchableMetadataField TITLE = zznm.zzatA;
  public static final SearchableMetadataField TRASHED;
  public static final SearchableOrderedMetadataField zzaub;
  public static final SearchableMetadataField zzauc = zznm.zzasW;
  
  static
  {
    MIME_TYPE = zznm.zzatr;
    TRASHED = zznm.zzatB;
    PARENTS = zznm.zzatw;
    zzaub = zzno.zzatQ;
    STARRED = zznm.zzaty;
    MODIFIED_DATE = zzno.zzatO;
    LAST_VIEWED_BY_ME = zzno.zzatN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\SearchableField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */