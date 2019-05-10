package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzay
  extends zzak
{
  private static final String ID = zzad.zzcd.toString();
  private static final String zzbiQ = zzae.zzdV.toString();
  private static final String zzbji = zzae.zzfU.toString();
  private static final String zzbjj = zzae.zzfY.toString();
  private static final String zzbjk = zzae.zzfr.toString();
  
  public zzay()
  {
    super(str1, arrayOfString);
  }
  
  private String zza(String paramString, zzay.zza paramzza, Set paramSet)
  {
    int[] arrayOfInt = zzay.1.zzbjl;
    int i = paramzza.ordinal();
    int j = arrayOfInt[i];
    switch (j)
    {
    }
    for (;;)
    {
      return paramString;
      try
      {
        paramString = zzdj.zzgA(paramString);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        str2 = "Joiner: unsupported encoding";
        zzbg.zzb(str2, localUnsupportedEncodingException);
      }
      continue;
      String str1 = paramString.replace("\\", "\\\\");
      Iterator localIterator = paramSet.iterator();
      for (String str2 = str1;; str2 = str1)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        str1 = ((Character)localIterator.next()).toString();
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str3 = "\\";
        localObject = str3 + str1;
        str1 = str2.replace(str1, (CharSequence)localObject);
      }
      paramString = str2;
    }
  }
  
  private void zza(StringBuilder paramStringBuilder, String paramString, zzay.zza paramzza, Set paramSet)
  {
    String str = zza(paramString, paramzza, paramSet);
    paramStringBuilder.append(str);
  }
  
  private void zza(Set paramSet, String paramString)
  {
    int i = 0;
    for (;;)
    {
      int j = paramString.length();
      if (i >= j) {
        break;
      }
      j = paramString.charAt(i);
      Character localCharacter = Character.valueOf(j);
      paramSet.add(localCharacter);
      i += 1;
    }
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = zzbiQ;
    localObject2 = (zzag.zza)paramMap.get(localObject2);
    if (localObject2 == null)
    {
      localObject2 = zzdf.zzHF();
      return (zzag.zza)localObject2;
    }
    Object localObject3 = zzbji;
    localObject3 = (zzag.zza)paramMap.get(localObject3);
    Object localObject4;
    label69:
    Object localObject5;
    label103:
    Object localObject6;
    boolean bool1;
    Object localObject7;
    if (localObject3 != null)
    {
      localObject3 = zzdf.zzg((zzag.zza)localObject3);
      localObject4 = localObject3;
      localObject3 = zzbjj;
      localObject3 = (zzag.zza)paramMap.get(localObject3);
      if (localObject3 == null) {
        break label255;
      }
      localObject3 = zzdf.zzg((zzag.zza)localObject3);
      localObject5 = localObject3;
      localObject6 = zzay.zza.zzbjm;
      localObject3 = zzbjk;
      localObject3 = (zzag.zza)paramMap.get(localObject3);
      bool1 = false;
      localObject7 = null;
      if (localObject3 == null) {
        break label560;
      }
      localObject3 = zzdf.zzg((zzag.zza)localObject3);
      localObject6 = "url";
      boolean bool2 = ((String)localObject6).equals(localObject3);
      if (!bool2) {
        break label266;
      }
      localObject7 = zzay.zza.zzbjn;
      localObject3 = null;
    }
    for (;;)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int j = ((zzag.zza)localObject2).type;
      switch (j)
      {
      default: 
        localObject2 = zzdf.zzg((zzag.zza)localObject2);
        zza(localStringBuilder, (String)localObject2, (zzay.zza)localObject7, (Set)localObject3);
        localObject2 = zzdf.zzR(localStringBuilder.toString());
        break;
        localObject3 = "";
        localObject4 = localObject3;
        break label69;
        localObject3 = "=";
        localObject5 = localObject3;
        break label103;
        localObject7 = "backslash";
        bool1 = ((String)localObject7).equals(localObject3);
        if (bool1)
        {
          localObject7 = zzay.zza.zzbjo;
          localObject3 = new java/util/HashSet;
          ((HashSet)localObject3).<init>();
          zza((Set)localObject3, (String)localObject4);
          zza((Set)localObject3, (String)localObject5);
          j = 92;
          localObject6 = Character.valueOf(j);
          ((Set)localObject3).remove(localObject6);
        }
        else
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject4 = "Joiner: unsupported escape type: ";
          zzbg.e((String)localObject4 + (String)localObject3);
          localObject2 = zzdf.zzHF();
        }
        break;
      case 2: 
        int m = 1;
        localObject6 = ((zzag.zza)localObject2).zzjy;
        int n = localObject6.length;
        int i1 = 0;
        localObject2 = null;
        while (i1 < n)
        {
          zzag.zza localzza = localObject6[i1];
          if (m == 0) {
            localStringBuilder.append((String)localObject4);
          }
          localObject5 = zzdf.zzg(localzza);
          zza(localStringBuilder, (String)localObject5, (zzay.zza)localObject7, (Set)localObject3);
          i1 += 1;
          m = 0;
          localObject5 = null;
        }
      case 3: 
        label255:
        label266:
        int k = 0;
        localObject6 = null;
        for (;;)
        {
          localObject1 = ((zzag.zza)localObject2).zzjz;
          i = localObject1.length;
          if (k >= i) {
            break;
          }
          if (k > 0) {
            localStringBuilder.append((String)localObject4);
          }
          localObject1 = zzdf.zzg(localObject2.zzjz[k]);
          String str = zzdf.zzg(localObject2.zzjA[k]);
          zza(localStringBuilder, (String)localObject1, (zzay.zza)localObject7, (Set)localObject3);
          localStringBuilder.append((String)localObject5);
          zza(localStringBuilder, str, (zzay.zza)localObject7, (Set)localObject3);
          k += 1;
        }
        label560:
        localObject3 = null;
        localObject7 = localObject6;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzay.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */