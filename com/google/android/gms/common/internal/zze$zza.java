package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class zze$zza
  extends zze
{
  List zzala;
  
  zze$zza(List paramList)
  {
    this.zzala = paramList;
  }
  
  public zze zza(zze paramzze)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject = this.zzala;
    localArrayList.<init>((Collection)localObject);
    localObject = zzx.zzz(paramzze);
    localArrayList.add(localObject);
    localObject = new com/google/android/gms/common/internal/zze$zza;
    ((zza)localObject).<init>(localArrayList);
    return (zze)localObject;
  }
  
  public boolean zzd(char paramChar)
  {
    Object localObject = this.zzala;
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zze)localIterator.next();
      bool = ((zze)localObject).zzd(paramChar);
    } while (!bool);
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zze$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */