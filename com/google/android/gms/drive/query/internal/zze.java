package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import java.util.Set;

class zze
{
  static MetadataField zza(MetadataBundle paramMetadataBundle)
  {
    Object localObject = paramMetadataBundle.zztG();
    int i = ((Set)localObject).size();
    int j = 1;
    if (i != j)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("bundle should have exactly 1 populated field");
      throw ((Throwable)localObject);
    }
    return (MetadataField)((Set)localObject).iterator().next();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */