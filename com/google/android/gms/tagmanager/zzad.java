package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzad
  extends zzak
{
  private static final String ID = com.google.android.gms.internal.zzad.zzbZ.toString();
  private static final String zzbiQ = zzae.zzdV.toString();
  private static final String zzbiR = zzae.zzgu.toString();
  private static final String zzbiS = zzae.zzfQ.toString();
  private static final String zzbiT = zzae.zzgE.toString();
  
  public zzad()
  {
    super(str1, arrayOfString);
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject1 = zzbiQ;
    localObject1 = (zzag.zza)paramMap.get(localObject1);
    Object localObject3;
    if (localObject1 != null)
    {
      localObject3 = zzdf.zzHF();
      if (localObject1 != localObject3) {}
    }
    else
    {
      localObject1 = zzdf.zzHF();
      return (zzag.zza)localObject1;
    }
    String str1 = zzdf.zzg((zzag.zza)localObject1);
    localObject1 = zzbiS;
    localObject1 = (zzag.zza)paramMap.get(localObject1);
    label64:
    Object localObject4;
    if (localObject1 == null)
    {
      localObject1 = "text";
      localObject3 = localObject1;
      localObject1 = zzbiT;
      localObject1 = (zzag.zza)paramMap.get(localObject1);
      if (localObject1 != null) {
        break label194;
      }
      localObject1 = "base16";
      localObject4 = localObject1;
      label89:
      int i = 2;
      localObject1 = zzbiR;
      localObject1 = (zzag.zza)paramMap.get(localObject1);
      if (localObject1 == null) {
        break label445;
      }
      localObject1 = zzdf.zzk((zzag.zza)localObject1);
      boolean bool = ((Boolean)localObject1).booleanValue();
      if (!bool) {
        break label445;
      }
    }
    int j;
    label194:
    label348:
    label411:
    label445:
    for (int k = 3;; k = j)
    {
      String str2 = "text";
      for (;;)
      {
        try
        {
          j = str2.equals(localObject3);
          if (j != 0)
          {
            localObject3 = str1.getBytes();
            str2 = "base16";
            j = str2.equals(localObject4);
            if (j == 0) {
              break label348;
            }
            localObject1 = zzk.zzj((byte[])localObject3);
            localObject1 = zzdf.zzR(localObject1);
            break;
            localObject1 = zzdf.zzg((zzag.zza)localObject1);
            localObject3 = localObject1;
            break label64;
            localObject1 = zzdf.zzg((zzag.zza)localObject1);
            localObject4 = localObject1;
            break label89;
          }
          str2 = "base16";
          j = str2.equals(localObject3);
          if (j != 0)
          {
            localObject3 = zzk.zzfO(str1);
            continue;
          }
          str2 = "base64";
          j = str2.equals(localObject3);
          if (j != 0)
          {
            localObject3 = Base64.decode(str1, k);
            continue;
          }
          str2 = "base64url";
          j = str2.equals(localObject3);
          if (j != 0)
          {
            int m = k | 0x8;
            localObject3 = Base64.decode(str1, m);
            continue;
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject4 = "Encode: unknown input format: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject1).toString();
          zzbg.e((String)localObject1);
          localObject1 = zzdf.zzHF();
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          zzbg.e("Encode: invalid input:");
          localObject2 = zzdf.zzHF();
        }
        break;
        str2 = "base64";
        j = str2.equals(localObject4);
        if (j != 0)
        {
          localObject2 = Base64.encodeToString((byte[])localObject3, k);
        }
        else
        {
          str2 = "base64url";
          j = str2.equals(localObject4);
          if (j == 0) {
            break label411;
          }
          k |= 0x8;
          localObject2 = Base64.encodeToString((byte[])localObject3, k);
        }
      }
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Encode: unknown output format: ";
      zzbg.e((String)localObject3 + (String)localObject4);
      localObject2 = zzdf.zzHF();
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */