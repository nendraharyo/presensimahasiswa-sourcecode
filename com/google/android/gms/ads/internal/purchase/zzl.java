package com.google.android.gms.ads.internal.purchase;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.zzin;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class zzl
{
  public static boolean zza(PublicKey paramPublicKey, String paramString1, String paramString2)
  {
    boolean bool1 = false;
    Object localObject = "SHA1withRSA";
    for (;;)
    {
      try
      {
        localObject = Signature.getInstance((String)localObject);
        ((Signature)localObject).initVerify(paramPublicKey);
        byte[] arrayOfByte = paramString1.getBytes();
        ((Signature)localObject).update(arrayOfByte);
        arrayOfByte = null;
        arrayOfByte = Base64.decode(paramString2, 0);
        boolean bool2 = ((Signature)localObject).verify(arrayOfByte);
        if (bool2) {
          continue;
        }
        localObject = "Signature verification failed.";
        zzin.e((String)localObject);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        String str1 = "NoSuchAlgorithmException.";
        zzin.e(str1);
        continue;
      }
      catch (InvalidKeyException localInvalidKeyException)
      {
        String str2 = "Invalid key specification.";
        zzin.e(str2);
        continue;
      }
      catch (SignatureException localSignatureException)
      {
        String str3 = "Signature exception.";
        zzin.e(str3);
        continue;
      }
      return bool1;
      bool1 = true;
    }
  }
  
  public static PublicKey zzas(String paramString)
  {
    byte[] arrayOfByte = null;
    try
    {
      arrayOfByte = Base64.decode(paramString, 0);
      localObject = "RSA";
      localObject = KeyFactory.getInstance((String)localObject);
      X509EncodedKeySpec localX509EncodedKeySpec = new java/security/spec/X509EncodedKeySpec;
      localX509EncodedKeySpec.<init>(arrayOfByte);
      return ((KeyFactory)localObject).generatePublic(localX509EncodedKeySpec);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject);
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      zzin.e("Invalid key specification.");
      Object localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>(localInvalidKeySpecException);
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean zzc(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = TextUtils.isEmpty(paramString2);
    if (!bool)
    {
      bool = TextUtils.isEmpty(paramString1);
      if (!bool)
      {
        bool = TextUtils.isEmpty(paramString3);
        if (!bool) {
          break label39;
        }
      }
    }
    zzin.e("Purchase verification failed: missing data.");
    bool = false;
    PublicKey localPublicKey = null;
    for (;;)
    {
      return bool;
      label39:
      localPublicKey = zzas(paramString1);
      bool = zza(localPublicKey, paramString2, paramString3);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */