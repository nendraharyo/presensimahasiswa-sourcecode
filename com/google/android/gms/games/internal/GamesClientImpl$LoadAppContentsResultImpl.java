package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class GamesClientImpl$LoadAppContentsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements AppContents.LoadAppContentResult
{
  private final ArrayList zzaEz;
  
  GamesClientImpl$LoadAppContentsResultImpl(DataHolder[] paramArrayOfDataHolder)
  {
    super((DataHolder)localObject);
    localObject = new java/util/ArrayList;
    List localList = Arrays.asList(paramArrayOfDataHolder);
    ((ArrayList)localObject).<init>(localList);
    this.zzaEz = ((ArrayList)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadAppContentsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */