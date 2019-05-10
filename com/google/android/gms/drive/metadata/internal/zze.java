package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zznn;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznq;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zze
{
  private static final Map zzasO;
  private static final Map zzasP;
  
  static
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzasO = (Map)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzasP = (Map)localObject;
    zzb(zznm.zzasU);
    zzb(zznm.zzatA);
    zzb(zznm.zzatr);
    zzb(zznm.zzaty);
    zzb(zznm.zzatB);
    zzb(zznm.zzath);
    zzb(zznm.zzatg);
    zzb(zznm.zzati);
    zzb(zznm.zzatj);
    zzb(zznm.zzatk);
    zzb(zznm.zzate);
    zzb(zznm.zzatm);
    zzb(zznm.zzatn);
    zzb(zznm.zzato);
    zzb(zznm.zzatw);
    zzb(zznm.zzasV);
    zzb(zznm.zzatt);
    zzb(zznm.zzasX);
    zzb(zznm.zzatf);
    zzb(zznm.zzasY);
    zzb(zznm.zzasZ);
    zzb(zznm.zzata);
    zzb(zznm.zzatb);
    zzb(zznm.zzatq);
    zzb(zznm.zzatl);
    zzb(zznm.zzats);
    zzb(zznm.zzatu);
    zzb(zznm.zzatv);
    zzb(zznm.zzatx);
    zzb(zznm.zzatC);
    zzb(zznm.zzatD);
    zzb(zznm.zzatd);
    zzb(zznm.zzatc);
    zzb(zznm.zzatz);
    zzb(zznm.zzatp);
    zzb(zznm.zzasW);
    zzb(zznm.zzatE);
    zzb(zznm.zzatF);
    zzb(zznm.zzatG);
    zzb(zznm.zzatH);
    zzb(zznm.zzatI);
    zzb(zznm.zzatJ);
    zzb(zznm.zzatK);
    zzb(zzno.zzatM);
    zzb(zzno.zzatO);
    zzb(zzno.zzatP);
    zzb(zzno.zzatQ);
    zzb(zzno.zzatN);
    zzb(zzno.zzatR);
    zzb(zznq.zzatT);
    zzb(zznq.zzatU);
    localObject = zznm.zzatw;
    zza(zzm.zzasT);
    zza(zznn.zzatL);
  }
  
  public static void zza(DataHolder paramDataHolder)
  {
    Object localObject = zzasP.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zze.zza)localIterator.next();
      ((zze.zza)localObject).zzb(paramDataHolder);
    }
  }
  
  private static void zza(zze.zza paramzza)
  {
    Object localObject1 = zzasP;
    Object localObject2 = paramzza.zztD();
    localObject1 = ((Map)localObject1).put(localObject2, paramzza);
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("A cleaner for key ");
      String str = paramzza.zztD();
      localObject2 = str + " has already been registered";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  private static void zzb(MetadataField paramMetadataField)
  {
    Object localObject1 = zzasO;
    Object localObject2 = paramMetadataField.getName();
    boolean bool = ((Map)localObject1).containsKey(localObject2);
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Duplicate field name registered: ");
      String str = paramMetadataField.getName();
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = zzasO;
    localObject2 = paramMetadataField.getName();
    ((Map)localObject1).put(localObject2, paramMetadataField);
  }
  
  public static MetadataField zzdc(String paramString)
  {
    return (MetadataField)zzasO.get(paramString);
  }
  
  public static Collection zztC()
  {
    return Collections.unmodifiableCollection(zzasO.values());
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */