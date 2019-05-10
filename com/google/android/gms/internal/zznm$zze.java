package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class zznm$zze
  extends zzj
{
  public zznm$zze(int paramInt)
  {
    super("spaces", (Collection)localObject, localSet, paramInt);
  }
  
  protected Collection zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = "inDriveSpace";
    boolean bool = paramDataHolder.zze((String)localObject, paramInt1, paramInt2);
    if (bool)
    {
      localObject = DriveSpace.zzaoP;
      localArrayList.add(localObject);
    }
    localObject = "isAppData";
    bool = paramDataHolder.zze((String)localObject, paramInt1, paramInt2);
    if (bool)
    {
      localObject = DriveSpace.zzaoQ;
      localArrayList.add(localObject);
    }
    localObject = "inGooglePhotosSpace";
    bool = paramDataHolder.zze((String)localObject, paramInt1, paramInt2);
    if (bool)
    {
      localObject = DriveSpace.zzaoR;
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznm$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */