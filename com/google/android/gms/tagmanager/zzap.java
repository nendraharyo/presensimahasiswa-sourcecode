package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class zzap
  extends zzak
{
  private static final String ID = zzad.zzcb.toString();
  private static final String zzbiQ = zzae.zzdV.toString();
  private static final String zzbiS = zzae.zzfQ.toString();
  private static final String zzbiW = zzae.zzdL.toString();
  
  public zzap()
  {
    super(str1, arrayOfString);
  }
  
  private byte[] zzg(String paramString, byte[] paramArrayOfByte)
  {
    MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
    localMessageDigest.update(paramArrayOfByte);
    return localMessageDigest.digest();
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
    }
    String str1;
    for (;;)
    {
      return (zzag.zza)localObject1;
      str1 = zzdf.zzg((zzag.zza)localObject1);
      localObject1 = zzbiW;
      localObject1 = (zzag.zza)paramMap.get(localObject1);
      label64:
      label86:
      String str2;
      boolean bool;
      if (localObject1 == null)
      {
        localObject1 = "MD5";
        localObject3 = localObject1;
        localObject1 = zzbiS;
        localObject1 = (zzag.zza)paramMap.get(localObject1);
        if (localObject1 != null) {
          break label139;
        }
        localObject1 = "text";
        str2 = "text";
        bool = str2.equals(localObject1);
        if (!bool) {
          break label147;
        }
      }
      for (localObject1 = str1.getBytes();; localObject1 = zzk.zzfO(str1))
      {
        try
        {
          localObject1 = zzg((String)localObject3, (byte[])localObject1);
          localObject1 = zzk.zzj((byte[])localObject1);
          localObject1 = zzdf.zzR(localObject1);
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
        {
          label139:
          label147:
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str1 = "Hash: unknown algorithm: ";
          zzbg.e(str1 + (String)localObject3);
          localObject2 = zzdf.zzHF();
        }
        localObject1 = zzdf.zzg((zzag.zza)localObject1);
        localObject3 = localObject1;
        break label64;
        localObject1 = zzdf.zzg((zzag.zza)localObject1);
        break label86;
        str2 = "base16";
        bool = str2.equals(localObject1);
        if (!bool) {
          break label173;
        }
      }
      label173:
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str1 = "Hash: unknown input format: ";
      localObject3 = ((StringBuilder)localObject3).append(str1);
      zzbg.e((String)localObject1);
      localObject1 = zzdf.zzHF();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */