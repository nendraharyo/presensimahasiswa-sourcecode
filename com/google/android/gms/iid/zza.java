package com.google.android.gms.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class zza
{
  public static KeyPair zzyy()
  {
    Object localObject = "RSA";
    try
    {
      localObject = KeyPairGenerator.getInstance((String)localObject);
      int i = 2048;
      ((KeyPairGenerator)localObject).initialize(i);
      return ((KeyPairGenerator)localObject).generateKeyPair();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localNoSuchAlgorithmException);
      throw localAssertionError;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */