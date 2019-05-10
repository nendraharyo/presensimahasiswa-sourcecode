package c.a.a.a;

import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class b
  extends a
{
  Cipher a;
  
  public b(String paramString)
  {
    Cipher localCipher = Cipher.getInstance(paramString);
    this.a = localCipher;
  }
  
  public void a(int paramInt, Key paramKey)
  {
    a(paramInt, paramKey);
  }
  
  public void a(int paramInt, SecretKey paramSecretKey)
  {
    a(paramInt, paramSecretKey);
  }
  
  public void a(int paramInt, SecretKeySpec paramSecretKeySpec)
  {
    a(paramInt, paramSecretKeySpec);
  }
  
  public void a(int paramInt, SecretKeySpec paramSecretKeySpec, IvParameterSpec paramIvParameterSpec)
  {
    a(paramInt, paramSecretKeySpec, paramIvParameterSpec);
  }
  
  public void a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    this.a.doFinal(paramByteBuffer1, paramByteBuffer2);
  }
  
  public void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    this.a.doFinal(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2);
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    return this.a.doFinal(paramArrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */