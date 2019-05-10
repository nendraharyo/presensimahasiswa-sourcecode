package c.a.a.a;

import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.params.KeyParameter;

public class c
  extends a
{
  private RC4Engine a;
  
  public void a(int paramInt, Key paramKey)
  {
    int i = 1;
    RC4Engine localRC4Engine = new org/bouncycastle/crypto/engines/RC4Engine;
    localRC4Engine.<init>();
    this.a = localRC4Engine;
    localRC4Engine = this.a;
    if (paramInt == i) {}
    for (;;)
    {
      KeyParameter localKeyParameter = new org/bouncycastle/crypto/params/KeyParameter;
      byte[] arrayOfByte = paramKey.getEncoded();
      localKeyParameter.<init>(arrayOfByte);
      localRC4Engine.init(i, localKeyParameter);
      return;
      i = 0;
    }
  }
  
  public void a(int paramInt, SecretKey paramSecretKey)
  {
    int i = 1;
    RC4Engine localRC4Engine = new org/bouncycastle/crypto/engines/RC4Engine;
    localRC4Engine.<init>();
    this.a = localRC4Engine;
    localRC4Engine = this.a;
    if (paramInt == i) {}
    for (;;)
    {
      KeyParameter localKeyParameter = new org/bouncycastle/crypto/params/KeyParameter;
      byte[] arrayOfByte = paramSecretKey.getEncoded();
      localKeyParameter.<init>(arrayOfByte);
      localRC4Engine.init(i, localKeyParameter);
      return;
      i = 0;
    }
  }
  
  public void a(int paramInt, SecretKeySpec paramSecretKeySpec)
  {
    int i = 1;
    RC4Engine localRC4Engine = new org/bouncycastle/crypto/engines/RC4Engine;
    localRC4Engine.<init>();
    this.a = localRC4Engine;
    localRC4Engine = this.a;
    if (paramInt == i) {}
    for (;;)
    {
      KeyParameter localKeyParameter = new org/bouncycastle/crypto/params/KeyParameter;
      byte[] arrayOfByte = paramSecretKeySpec.getEncoded();
      localKeyParameter.<init>(arrayOfByte);
      localRC4Engine.init(i, localKeyParameter);
      return;
      i = 0;
    }
  }
  
  public void a(int paramInt, SecretKeySpec paramSecretKeySpec, IvParameterSpec paramIvParameterSpec)
  {
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    localRuntimeException.<init>("not yet supported");
    throw localRuntimeException;
  }
  
  public void a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    for (;;)
    {
      boolean bool = paramByteBuffer1.hasRemaining();
      if (!bool) {
        return;
      }
      RC4Engine localRC4Engine = this.a;
      byte b2 = paramByteBuffer1.get();
      byte b1 = localRC4Engine.returnByte(b2);
      paramByteBuffer2.put(b1);
    }
  }
  
  public void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    this.a.processBytes(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, 0);
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    RC4Engine localRC4Engine = this.a;
    int i = paramArrayOfByte.length;
    localRC4Engine.processBytes(paramArrayOfByte, 0, i, arrayOfByte, 0);
    return arrayOfByte;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */