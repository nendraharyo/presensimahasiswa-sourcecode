package org.apache.http.impl.auth;

import java.security.MessageDigest;

class NTLMEngineImpl$HMACMD5
{
  protected byte[] ipad;
  protected MessageDigest md5;
  protected byte[] opad;
  
  NTLMEngineImpl$HMACMD5(byte[] paramArrayOfByte)
  {
    Object localObject1 = "MD5";
    int j;
    int k;
    Object localObject2;
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      this.md5 = ((MessageDigest)localObject1);
      localObject1 = new byte[i];
      this.ipad = ((byte[])localObject1);
      localObject1 = new byte[i];
      this.opad = ((byte[])localObject1);
      j = paramArrayOfByte.length;
      if (j > i)
      {
        this.md5.update(paramArrayOfByte);
        localObject1 = this.md5;
        paramArrayOfByte = ((MessageDigest)localObject1).digest();
        j = paramArrayOfByte.length;
      }
      k = 0;
      localObject2 = null;
      for (;;)
      {
        if (k < j)
        {
          Object localObject3 = this.ipad;
          int m = (byte)(paramArrayOfByte[k] ^ 0x36);
          localObject3[k] = m;
          localObject3 = this.opad;
          m = (byte)(paramArrayOfByte[k] ^ 0x5C);
          localObject3[k] = m;
          k += 1;
          continue;
          String str;
          if (j >= i) {
            break;
          }
        }
      }
    }
    catch (Exception localException)
    {
      localObject2 = new org/apache/http/impl/auth/NTLMEngineException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Error getting md5 message digest implementation: ");
      str = localException.getMessage();
      localObject3 = str;
      ((NTLMEngineException)localObject2).<init>((String)localObject3, localException);
      throw ((Throwable)localObject2);
    }
    for (;;)
    {
      this.ipad[j] = 54;
      localObject2 = this.opad;
      int n = 92;
      localObject2[j] = n;
      j += 1;
      continue;
      this.md5.reset();
      MessageDigest localMessageDigest = this.md5;
      localObject2 = this.ipad;
      localMessageDigest.update((byte[])localObject2);
      return;
      j = k;
    }
  }
  
  byte[] getOutput()
  {
    byte[] arrayOfByte1 = this.md5.digest();
    MessageDigest localMessageDigest = this.md5;
    byte[] arrayOfByte2 = this.opad;
    localMessageDigest.update(arrayOfByte2);
    return this.md5.digest(arrayOfByte1);
  }
  
  void update(byte[] paramArrayOfByte)
  {
    this.md5.update(paramArrayOfByte);
  }
  
  void update(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.md5.update(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMEngineImpl$HMACMD5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */