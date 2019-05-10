package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class zza
  implements MetadataField
{
  private final String zzasF;
  private final Set zzasG;
  private final Set zzasH;
  private final int zzasI;
  
  protected zza(String paramString, int paramInt)
  {
    Object localObject = (String)zzx.zzb(paramString, "fieldName");
    this.zzasF = ((String)localObject);
    localObject = Collections.singleton(paramString);
    this.zzasG = ((Set)localObject);
    localObject = Collections.emptySet();
    this.zzasH = ((Set)localObject);
    this.zzasI = paramInt;
  }
  
  protected zza(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    Object localObject = (String)zzx.zzb(paramString, "fieldName");
    this.zzasF = ((String)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>(paramCollection1);
    localObject = Collections.unmodifiableSet((Set)localObject);
    this.zzasG = ((Set)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>(paramCollection2);
    localObject = Collections.unmodifiableSet((Set)localObject);
    this.zzasH = ((Set)localObject);
    this.zzasI = paramInt;
  }
  
  public final String getName()
  {
    return this.zzasF;
  }
  
  public String toString()
  {
    return this.zzasF;
  }
  
  public final Object zza(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    boolean bool = zzb(paramDataHolder, paramInt1, paramInt2);
    if (bool) {}
    for (Object localObject = zzc(paramDataHolder, paramInt1, paramInt2);; localObject = null)
    {
      return localObject;
      bool = false;
    }
  }
  
  protected abstract void zza(Bundle paramBundle, Object paramObject);
  
  public final void zza(DataHolder paramDataHolder, MetadataBundle paramMetadataBundle, int paramInt1, int paramInt2)
  {
    zzx.zzb(paramDataHolder, "dataHolder");
    Object localObject = "bundle";
    zzx.zzb(paramMetadataBundle, localObject);
    boolean bool = zzb(paramDataHolder, paramInt1, paramInt2);
    if (bool)
    {
      localObject = zzc(paramDataHolder, paramInt1, paramInt2);
      paramMetadataBundle.zzc(this, localObject);
    }
  }
  
  public final void zza(Object paramObject, Bundle paramBundle)
  {
    String str = "bundle";
    zzx.zzb(paramBundle, str);
    if (paramObject == null)
    {
      str = getName();
      paramBundle.putString(str, null);
    }
    for (;;)
    {
      return;
      zza(paramBundle, paramObject);
    }
  }
  
  protected boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Object localObject = this.zzasG;
    Iterator localIterator = ((Set)localObject).iterator();
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break label78;
      }
      localObject = (String)localIterator.next();
      boolean bool2 = paramDataHolder.zzcz((String)localObject);
      if (!bool2) {
        break;
      }
      bool1 = paramDataHolder.zzi((String)localObject, paramInt1, paramInt2);
    } while (!bool1);
    boolean bool1 = false;
    localObject = null;
    for (;;)
    {
      return bool1;
      label78:
      bool1 = true;
    }
  }
  
  protected abstract Object zzc(DataHolder paramDataHolder, int paramInt1, int paramInt2);
  
  public final Object zzm(Bundle paramBundle)
  {
    zzx.zzb(paramBundle, "bundle");
    Object localObject = getName();
    localObject = paramBundle.get((String)localObject);
    if (localObject != null) {}
    for (localObject = zzn(paramBundle);; localObject = null) {
      return localObject;
    }
  }
  
  protected abstract Object zzn(Bundle paramBundle);
  
  public final Collection zzty()
  {
    return this.zzasG;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */