package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

final class AppContentUtils$4
  implements AppContentUtils.AppContentRunner
{
  AppContentUtils$4(DataHolder paramDataHolder, Bundle paramBundle) {}
  
  public void zzb(ArrayList paramArrayList, int paramInt)
  {
    Object localObject1 = new com/google/android/gms/games/appcontent/AppContentTupleRef;
    Object localObject2 = this.zzaDS;
    ((AppContentTupleRef)localObject1).<init>((DataHolder)localObject2, paramInt);
    localObject2 = this.zzaDT;
    String str = ((AppContentTuple)localObject1).getName();
    localObject1 = ((AppContentTuple)localObject1).getValue();
    ((Bundle)localObject2).putString(str, (String)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentUtils$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */