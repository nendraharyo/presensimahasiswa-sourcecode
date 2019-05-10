package c.a.a.a;

import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class a
{
  public static a a(String paramString)
  {
    Object localObject = "RC4";
    boolean bool = paramString.equals(localObject);
    if (bool)
    {
      localObject = new c/a/a/a/c;
      ((c)localObject).<init>();
    }
    for (;;)
    {
      return (a)localObject;
      localObject = new c/a/a/a/b;
      ((b)localObject).<init>(paramString);
    }
  }
  
  public abstract void a(int paramInt, Key paramKey);
  
  public abstract void a(int paramInt, SecretKey paramSecretKey);
  
  public abstract void a(int paramInt, SecretKeySpec paramSecretKeySpec);
  
  public abstract void a(int paramInt, SecretKeySpec paramSecretKeySpec, IvParameterSpec paramIvParameterSpec);
  
  public abstract void a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2);
  
  public abstract void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2);
  
  public abstract byte[] a(byte[] paramArrayOfByte);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */