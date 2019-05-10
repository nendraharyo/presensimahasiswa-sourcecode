package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzbg
{
  private static MessageDigest zzto = null;
  protected Object zzpV;
  
  public zzbg()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
  }
  
  protected MessageDigest zzcL()
  {
    synchronized (this.zzpV)
    {
      MessageDigest localMessageDigest = zzto;
      if (localMessageDigest != null)
      {
        localMessageDigest = zzto;
        return localMessageDigest;
      }
      int i = 0;
      localMessageDigest = null;
      for (;;)
      {
        int j = 2;
        if (i >= j) {
          break;
        }
        Object localObject3 = "MD5";
        try
        {
          localObject3 = MessageDigest.getInstance((String)localObject3);
          zzto = (MessageDigest)localObject3;
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
        {
          for (;;) {}
        }
        i += 1;
      }
      localMessageDigest = zzto;
    }
  }
  
  abstract byte[] zzu(String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */