package b.a.a.a.i.a;

import java.security.MessageDigest;

class j$b
{
  protected byte[] a;
  protected byte[] b;
  protected MessageDigest c;
  
  j$b(byte[] paramArrayOfByte)
  {
    Object localObject1 = "MD5";
    int j;
    int k;
    Object localObject2;
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      this.c = ((MessageDigest)localObject1);
      localObject1 = new byte[i];
      this.a = ((byte[])localObject1);
      localObject1 = new byte[i];
      this.b = ((byte[])localObject1);
      j = paramArrayOfByte.length;
      if (j > i)
      {
        this.c.update(paramArrayOfByte);
        localObject1 = this.c;
        paramArrayOfByte = ((MessageDigest)localObject1).digest();
        j = paramArrayOfByte.length;
      }
      k = 0;
      localObject2 = null;
      for (;;)
      {
        if (k < j)
        {
          Object localObject3 = this.a;
          int m = (byte)(paramArrayOfByte[k] ^ 0x36);
          localObject3[k] = m;
          localObject3 = this.b;
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
      localObject2 = new b/a/a/a/i/a/i;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Error getting md5 message digest implementation: ");
      str = localException.getMessage();
      localObject3 = str;
      ((i)localObject2).<init>((String)localObject3, localException);
      throw ((Throwable)localObject2);
    }
    for (;;)
    {
      this.a[j] = 54;
      localObject2 = this.b;
      int n = 92;
      localObject2[j] = n;
      j += 1;
      continue;
      this.c.reset();
      MessageDigest localMessageDigest = this.c;
      localObject2 = this.a;
      localMessageDigest.update((byte[])localObject2);
      return;
      j = k;
    }
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.c.update(paramArrayOfByte);
  }
  
  byte[] a()
  {
    byte[] arrayOfByte1 = this.c.digest();
    MessageDigest localMessageDigest = this.c;
    byte[] arrayOfByte2 = this.b;
    localMessageDigest.update(arrayOfByte2);
    return this.c.digest(arrayOfByte1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\j$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */