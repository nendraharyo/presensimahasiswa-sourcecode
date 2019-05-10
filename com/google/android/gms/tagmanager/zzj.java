package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzj
  extends zzdd
{
  private static final String ID = zzad.zzcJ.toString();
  private static final String URL = zzae.zzhZ.toString();
  private static final String zzbhF = zzae.zzdI.toString();
  private static final String zzbhG = zzae.zzhY.toString();
  static final String zzbhH;
  private static final Set zzbhI;
  private final Context mContext;
  private final zzj.zza zzbhJ;
  
  static
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("gtm_");
    String str = ID;
    zzbhH = str + "_unrepeatable";
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    zzbhI = (Set)localObject;
  }
  
  public zzj(Context paramContext)
  {
    this(paramContext, local1);
  }
  
  zzj(Context paramContext, zzj.zza paramzza)
  {
    super(str1, arrayOfString);
    this.zzbhJ = paramzza;
    this.mContext = paramContext;
  }
  
  private boolean zzfL(String paramString)
  {
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        boolean bool2 = zzfN(paramString);
        if (bool2) {
          return bool1;
        }
        bool2 = zzfM(paramString);
        if (bool2)
        {
          Set localSet = zzbhI;
          localSet.add(paramString);
          continue;
        }
        bool1 = false;
      }
      finally {}
      Object localObject2 = null;
    }
  }
  
  public void zzR(Map paramMap)
  {
    Object localObject1 = zzbhG;
    localObject1 = paramMap.get(localObject1);
    Object localObject3;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = zzbhG;
      localObject1 = zzdf.zzg((zzag.zza)paramMap.get(localObject1));
      localObject3 = localObject1;
      if (localObject3 == null) {
        break label63;
      }
      bool1 = zzfL((String)localObject3);
      if (!bool1) {
        break label63;
      }
    }
    for (;;)
    {
      return;
      bool1 = false;
      localObject1 = null;
      localObject3 = null;
      break;
      label63:
      localObject1 = URL;
      ??? = Uri.parse(zzdf.zzg((zzag.zza)paramMap.get(localObject1))).buildUpon();
      localObject1 = zzbhF;
      localObject1 = (zzag.zza)paramMap.get(localObject1);
      Object localObject6;
      if (localObject1 != null)
      {
        localObject1 = zzdf.zzl((zzag.zza)localObject1);
        boolean bool2 = localObject1 instanceof List;
        if (!bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("ArbitraryPixel: additional params not a list: not sending partial hit: ");
          localObject3 = ((Uri.Builder)???).build().toString();
          localObject1 = (String)localObject3;
          zzbg.e((String)localObject1);
          continue;
        }
        localObject1 = (List)localObject1;
        localObject5 = ((List)localObject1).iterator();
        bool1 = ((Iterator)localObject5).hasNext();
        if (bool1)
        {
          localObject1 = ((Iterator)localObject5).next();
          boolean bool3 = localObject1 instanceof Map;
          if (!bool3)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = ((StringBuilder)localObject1).append("ArbitraryPixel: additional params contains non-map: not sending partial hit: ");
            localObject3 = ((Uri.Builder)???).build().toString();
            localObject1 = (String)localObject3;
            zzbg.e((String)localObject1);
            continue;
          }
          localObject1 = ((Map)localObject1).entrySet();
          localObject6 = ((Set)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject6).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (Map.Entry)((Iterator)localObject6).next();
            String str = ((Map.Entry)localObject1).getKey().toString();
            localObject1 = ((Map.Entry)localObject1).getValue().toString();
            ((Uri.Builder)???).appendQueryParameter(str, (String)localObject1);
          }
        }
      }
      localObject1 = ((Uri.Builder)???).build().toString();
      this.zzbhJ.zzFX().zzgc((String)localObject1);
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>();
      Object localObject5 = "ArbitraryPixel: url = ";
      ??? = ((StringBuilder)???).append((String)localObject5);
      localObject1 = (String)localObject1;
      zzbg.v((String)localObject1);
      if (localObject3 == null) {
        continue;
      }
      synchronized (zzj.class)
      {
        localObject1 = zzbhI;
        ((Set)localObject1).add(localObject3);
        localObject1 = this.mContext;
        localObject5 = zzbhH;
        localObject6 = "true";
        zzcv.zzb((Context)localObject1, (String)localObject5, (String)localObject3, (String)localObject6);
      }
    }
  }
  
  boolean zzfM(String paramString)
  {
    Context localContext = this.mContext;
    String str = zzbhH;
    return localContext.getSharedPreferences(str, 0).contains(paramString);
  }
  
  boolean zzfN(String paramString)
  {
    return zzbhI.contains(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */