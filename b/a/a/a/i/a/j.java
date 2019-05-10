package b.a.a.a.i.a;

import b.a.a.a.o.e;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class j
  implements h
{
  private static final SecureRandom a;
  private static final byte[] c;
  private String b = "ASCII";
  
  static
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = "SHA1PRNG";
    try
    {
      localObject1 = SecureRandom.getInstance((String)localObject2);
    }
    catch (Exception localException)
    {
      int j;
      for (;;) {}
    }
    a = (SecureRandom)localObject1;
    localObject1 = e.a("NTLMSSP", "ASCII");
    c = new byte[localObject1.length + 1];
    localObject2 = c;
    j = localObject1.length;
    System.arraycopy(localObject1, 0, localObject2, 0, j);
    localObject2 = c;
    i = localObject1.length;
    localObject2[i] = 0;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 << paramInt2;
    int j = 32 - paramInt2;
    j = paramInt1 >>> j;
    return i | j;
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 & paramInt2;
    int j = (paramInt1 ^ 0xFFFFFFFF) & paramInt3;
    return i | j;
  }
  
  private static void a(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    if (i < j)
    {
      j = paramArrayOfByte[i];
      int k = j >>> 7;
      int m = j >>> 6;
      k ^= m;
      m = j >>> 5;
      k ^= m;
      m = j >>> 4;
      k ^= m;
      m = j >>> 3;
      k ^= m;
      m = j >>> 2;
      k ^= m;
      j = (j >>> 1 ^ k) & 0x1;
      if (j == 0)
      {
        j = 1;
        label84:
        if (j == 0) {
          break label111;
        }
        j = (byte)(paramArrayOfByte[i] | 0x1);
        paramArrayOfByte[i] = j;
      }
      for (;;)
      {
        i += 1;
        break;
        j = 0;
        break label84;
        label111:
        j = (byte)(paramArrayOfByte[i] & 0xFFFFFFFE);
        paramArrayOfByte[i] = j;
      }
    }
  }
  
  static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = (byte)(paramInt1 & 0xFF);
    paramArrayOfByte[paramInt2] = i;
    i = paramInt2 + 1;
    int j = (byte)(paramInt1 >> 8 & 0xFF);
    paramArrayOfByte[i] = j;
    i = paramInt2 + 2;
    j = (byte)(paramInt1 >> 16 & 0xFF);
    paramArrayOfByte[i] = j;
    i = paramInt2 + 3;
    j = (byte)(paramInt1 >> 24 & 0xFF);
    paramArrayOfByte[i] = j;
  }
  
  static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    j.b localb = new b/a/a/a/i/a/j$b;
    localb.<init>(paramArrayOfByte2);
    localb.a(paramArrayOfByte1);
    return localb.a();
  }
  
  static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    Object localObject1 = "MD5";
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      ((MessageDigest)localObject1).update(paramArrayOfByte2);
      ((MessageDigest)localObject1).update(paramArrayOfByte3);
      localObject1 = ((MessageDigest)localObject1).digest();
      int i = 8;
      localObject2 = new byte[i];
      str = null;
      int j = 8;
      System.arraycopy(localObject1, 0, localObject2, 0, j);
      return d(paramArrayOfByte1, (byte[])localObject2);
    }
    catch (Exception localException)
    {
      boolean bool = localException instanceof i;
      if (bool) {
        throw ((i)localException);
      }
      Object localObject2 = new b/a/a/a/i/a/i;
      String str = localException.getMessage();
      ((i)localObject2).<init>(str, localException);
      throw ((Throwable)localObject2);
    }
  }
  
  static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 & paramInt2;
    int j = paramInt1 & paramInt3;
    i |= j;
    j = paramInt2 & paramInt3;
    return i | j;
  }
  
  static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Object localObject1 = "RC4";
    try
    {
      localObject1 = Cipher.getInstance((String)localObject1);
      int i = 1;
      localObject2 = new javax/crypto/spec/SecretKeySpec;
      String str = "RC4";
      ((SecretKeySpec)localObject2).<init>(paramArrayOfByte2, str);
      ((Cipher)localObject1).init(i, (Key)localObject2);
      return ((Cipher)localObject1).doFinal(paramArrayOfByte1);
    }
    catch (Exception localException)
    {
      i locali = new b/a/a/a/i/a/i;
      Object localObject2 = localException.getMessage();
      locali.<init>((String)localObject2, localException);
      throw locali;
    }
  }
  
  static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 ^ paramInt2 ^ paramInt3;
  }
  
  private static byte[] c(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    try
    {
      j.b localb = new b/a/a/a/i/a/j$b;
      localb.<init>(paramArrayOfByte);
      localObject1 = Locale.ENGLISH;
      localObject1 = paramString2.toUpperCase((Locale)localObject1);
      localObject2 = "UnicodeLittleUnmarked";
      localObject1 = ((String)localObject1).getBytes((String)localObject2);
      localb.a((byte[])localObject1);
      if (paramString1 != null)
      {
        localObject1 = Locale.ENGLISH;
        localObject1 = paramString1.toUpperCase((Locale)localObject1);
        localObject2 = "UnicodeLittleUnmarked";
        localObject1 = ((String)localObject1).getBytes((String)localObject2);
        localb.a((byte[])localObject1);
      }
      return localb.a();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject1 = new b/a/a/a/i/a/i;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unicode not supported! ");
      String str = localUnsupportedEncodingException.getMessage();
      localObject2 = str;
      ((i)localObject1).<init>((String)localObject2, localUnsupportedEncodingException);
      throw ((Throwable)localObject1);
    }
  }
  
  private static int d(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = paramInt + 4;
    if (i < j)
    {
      i locali = new b/a/a/a/i/a/i;
      locali.<init>("NTLM authentication - buffer too small for DWORD");
      throw locali;
    }
    i = paramArrayOfByte[paramInt] & 0xFF;
    j = paramInt + 1;
    j = (paramArrayOfByte[j] & 0xFF) << 8;
    i |= j;
    j = paramInt + 2;
    j = (paramArrayOfByte[j] & 0xFF) << 16;
    i |= j;
    j = paramInt + 3;
    j = (paramArrayOfByte[j] & 0xFF) << 24;
    return i | j;
  }
  
  private static byte[] d()
  {
    Object localObject1 = a;
    if (localObject1 == null)
    {
      localObject1 = new b/a/a/a/i/a/i;
      ((i)localObject1).<init>("Random generator not available");
      throw ((Throwable)localObject1);
    }
    int i = 8;
    localObject1 = new byte[i];
    synchronized (a)
    {
      SecureRandom localSecureRandom2 = a;
      localSecureRandom2.nextBytes((byte[])localObject1);
      return (byte[])localObject1;
    }
  }
  
  private static byte[] d(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    try
    {
      j.b localb = new b/a/a/a/i/a/j$b;
      localb.<init>(paramArrayOfByte);
      localObject1 = Locale.ENGLISH;
      localObject1 = paramString2.toUpperCase((Locale)localObject1);
      localObject2 = "UnicodeLittleUnmarked";
      localObject1 = ((String)localObject1).getBytes((String)localObject2);
      localb.a((byte[])localObject1);
      if (paramString1 != null)
      {
        localObject1 = "UnicodeLittleUnmarked";
        localObject1 = paramString1.getBytes((String)localObject1);
        localb.a((byte[])localObject1);
      }
      return localb.a();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject1 = new b/a/a/a/i/a/i;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unicode not supported! ");
      String str = localUnsupportedEncodingException.getMessage();
      localObject2 = str;
      ((i)localObject1).<init>((String)localObject2, localUnsupportedEncodingException);
      throw ((Throwable)localObject1);
    }
  }
  
  private static byte[] d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 21;
    try
    {
      Object localObject1 = new byte[i];
      localObject2 = null;
      int j = 0;
      localObject3 = null;
      int k = 16;
      System.arraycopy(paramArrayOfByte1, 0, localObject1, 0, k);
      localObject2 = null;
      localObject2 = g((byte[])localObject1, 0);
      j = 7;
      localObject3 = g((byte[])localObject1, j);
      k = 14;
      localObject1 = g((byte[])localObject1, k);
      Object localObject4 = "DES/ECB/NoPadding";
      localObject4 = Cipher.getInstance((String)localObject4);
      int m = 1;
      ((Cipher)localObject4).init(m, (Key)localObject2);
      localObject2 = ((Cipher)localObject4).doFinal(paramArrayOfByte2);
      m = 1;
      ((Cipher)localObject4).init(m, (Key)localObject3);
      localObject3 = ((Cipher)localObject4).doFinal(paramArrayOfByte2);
      m = 1;
      ((Cipher)localObject4).init(m, (Key)localObject1);
      localObject1 = ((Cipher)localObject4).doFinal(paramArrayOfByte2);
      k = 24;
      localObject4 = new byte[k];
      m = 0;
      int n = 0;
      int i1 = 8;
      System.arraycopy(localObject2, 0, localObject4, 0, i1);
      localObject2 = null;
      m = 8;
      n = 8;
      System.arraycopy(localObject3, 0, localObject4, m, n);
      localObject2 = null;
      j = 16;
      m = 8;
      System.arraycopy(localObject1, 0, localObject4, j, m);
      return (byte[])localObject4;
    }
    catch (Exception localException)
    {
      Object localObject2 = new b/a/a/a/i/a/i;
      Object localObject3 = localException.getMessage();
      ((i)localObject2).<init>((String)localObject3, localException);
      throw ((Throwable)localObject2);
    }
  }
  
  private static byte[] d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    Object localObject = new b/a/a/a/i/a/j$b;
    ((j.b)localObject).<init>(paramArrayOfByte1);
    ((j.b)localObject).a(paramArrayOfByte2);
    ((j.b)localObject).a(paramArrayOfByte3);
    localObject = ((j.b)localObject).a();
    int i = localObject.length;
    int j = paramArrayOfByte3.length;
    byte[] arrayOfByte = new byte[i + j];
    j = localObject.length;
    System.arraycopy(localObject, 0, arrayOfByte, 0, j);
    int k = localObject.length;
    j = paramArrayOfByte3.length;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, k, j);
    return arrayOfByte;
  }
  
  private static int e(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = paramInt + 2;
    if (i < j)
    {
      i locali = new b/a/a/a/i/a/i;
      locali.<init>("NTLM authentication - buffer too small for WORD");
      throw locali;
    }
    i = paramArrayOfByte[paramInt] & 0xFF;
    j = paramInt + 1;
    j = (paramArrayOfByte[j] & 0xFF) << 8;
    return i | j;
  }
  
  private static String e(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      String str = ".";
      int i = paramString.indexOf(str);
      int j = -1;
      if (i != j)
      {
        j = 0;
        paramString = paramString.substring(0, i);
      }
    }
  }
  
  private static byte[] e()
  {
    Object localObject1 = a;
    if (localObject1 == null)
    {
      localObject1 = new b/a/a/a/i/a/i;
      ((i)localObject1).<init>("Random generator not available");
      throw ((Throwable)localObject1);
    }
    int i = 16;
    localObject1 = new byte[i];
    synchronized (a)
    {
      SecureRandom localSecureRandom2 = a;
      localSecureRandom2.nextBytes((byte[])localObject1);
      return (byte[])localObject1;
    }
  }
  
  private static byte[] e(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    int i = 4;
    byte[] arrayOfByte1 = new byte[i];
    byte[] tmp9_7 = arrayOfByte1;
    byte[] tmp10_9 = tmp9_7;
    byte[] tmp10_9 = tmp9_7;
    tmp10_9[0] = 1;
    tmp10_9[1] = 1;
    tmp10_9[2] = 0;
    tmp10_9[3] = 0;
    byte[] arrayOfByte2 = new byte[i];
    byte[] tmp30_28 = arrayOfByte2;
    byte[] tmp31_30 = tmp30_28;
    byte[] tmp31_30 = tmp30_28;
    tmp31_30[0] = 0;
    tmp31_30[1] = 0;
    tmp31_30[2] = 0;
    tmp31_30[3] = 0;
    byte[] arrayOfByte3 = new byte[i];
    byte[] tmp51_49 = arrayOfByte3;
    byte[] tmp52_51 = tmp51_49;
    byte[] tmp52_51 = tmp51_49;
    tmp52_51[0] = 0;
    tmp52_51[1] = 0;
    tmp52_51[2] = 0;
    tmp52_51[3] = 0;
    byte[] arrayOfByte4 = new byte[i];
    byte[] tmp72_70 = arrayOfByte4;
    byte[] tmp73_72 = tmp72_70;
    byte[] tmp73_72 = tmp72_70;
    tmp73_72[0] = 0;
    tmp73_72[1] = 0;
    tmp73_72[2] = 0;
    tmp73_72[3] = 0;
    int j = arrayOfByte1.length;
    int k = arrayOfByte2.length;
    j += k;
    k = paramArrayOfByte3.length;
    j = j + k + 8;
    k = arrayOfByte3.length;
    j += k;
    k = paramArrayOfByte2.length;
    j += k;
    k = arrayOfByte4.length;
    byte[] arrayOfByte5 = new byte[j + k];
    k = arrayOfByte1.length;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte5, 0, k);
    int m = arrayOfByte1.length + 0;
    k = arrayOfByte2.length;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte5, m, k);
    int n = arrayOfByte2.length;
    m += n;
    n = paramArrayOfByte3.length;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte5, m, n);
    n = paramArrayOfByte3.length;
    m += n;
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte5, m, 8);
    m += 8;
    n = arrayOfByte3.length;
    System.arraycopy(arrayOfByte3, 0, arrayOfByte5, m, n);
    n = arrayOfByte3.length;
    m += n;
    n = paramArrayOfByte2.length;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte5, m, n);
    n = paramArrayOfByte2.length;
    m += n;
    n = arrayOfByte4.length;
    System.arraycopy(arrayOfByte4, 0, arrayOfByte5, m, n);
    n = arrayOfByte4.length;
    m += n;
    return arrayOfByte5;
  }
  
  private static String f(String paramString)
  {
    return e(paramString);
  }
  
  private static byte[] f(byte[] paramArrayOfByte, int paramInt)
  {
    int i = e(paramArrayOfByte, paramInt);
    int j = paramInt + 4;
    j = d(paramArrayOfByte, j);
    int k = paramArrayOfByte.length;
    int m = j + i;
    if (k < m)
    {
      i locali = new b/a/a/a/i/a/i;
      locali.<init>("NTLM authentication - buffer too small for data item");
      throw locali;
    }
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfByte, j, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  private static String g(String paramString)
  {
    return e(paramString);
  }
  
  private static Key g(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new byte[7];
    System.arraycopy(paramArrayOfByte, paramInt, localObject, 0, 7);
    byte[] arrayOfByte = new byte[8];
    int n = localObject[0];
    arrayOfByte[0] = n;
    n = localObject[0] << 7;
    int i1 = (localObject[m] & 0xFF) >>> 1;
    n = (byte)(n | i1);
    arrayOfByte[m] = n;
    n = localObject[m] << 6;
    i1 = (localObject[k] & 0xFF) >>> 2;
    n = (byte)(n | i1);
    arrayOfByte[k] = n;
    n = localObject[k] << 5;
    i1 = (localObject[j] & 0xFF) >>> 3;
    n = (byte)(n | i1);
    arrayOfByte[j] = n;
    n = localObject[j] << 4;
    i1 = (localObject[i] & 0xFF) >>> 4;
    n = (byte)(n | i1);
    arrayOfByte[i] = n;
    i1 = localObject[i] << 3;
    m = (localObject[5] & 0xFF) >>> 5;
    i1 = (byte)(i1 | m);
    arrayOfByte[5] = i1;
    i1 = localObject[5] << 2;
    m = (localObject[6] & 0xFF) >>> 6;
    i1 = (byte)(i1 | m);
    arrayOfByte[6] = i1;
    int i2 = (byte)(localObject[6] << 1);
    arrayOfByte[7] = i2;
    a(arrayOfByte);
    localObject = new javax/crypto/spec/SecretKeySpec;
    ((SecretKeySpec)localObject).<init>(arrayOfByte, "DES");
    return (Key)localObject;
  }
  
  private static byte[] h(String paramString)
  {
    try
    {
      Object localObject1 = Locale.ENGLISH;
      localObject1 = paramString.toUpperCase((Locale)localObject1);
      localObject2 = "US-ASCII";
      localObject1 = ((String)localObject1).getBytes((String)localObject2);
      int i = localObject1.length;
      int j = 14;
      i = Math.min(i, j);
      j = 14;
      localObject3 = new byte[j];
      int k = 0;
      Object localObject4 = null;
      int m = 0;
      System.arraycopy(localObject1, 0, localObject3, 0, i);
      localObject1 = null;
      localObject1 = g((byte[])localObject3, 0);
      i = 7;
      localObject2 = g((byte[])localObject3, i);
      localObject3 = "KGS!@#$%";
      localObject4 = "US-ASCII";
      localObject3 = ((String)localObject3).getBytes((String)localObject4);
      localObject4 = "DES/ECB/NoPadding";
      localObject4 = Cipher.getInstance((String)localObject4);
      m = 1;
      ((Cipher)localObject4).init(m, (Key)localObject1);
      localObject1 = ((Cipher)localObject4).doFinal((byte[])localObject3);
      m = 1;
      ((Cipher)localObject4).init(m, (Key)localObject2);
      localObject2 = ((Cipher)localObject4).doFinal((byte[])localObject3);
      j = 16;
      localObject3 = new byte[j];
      k = 0;
      localObject4 = null;
      m = 0;
      int n = 8;
      System.arraycopy(localObject1, 0, localObject3, 0, n);
      localObject1 = null;
      k = 8;
      m = 8;
      System.arraycopy(localObject2, 0, localObject3, k, m);
      return (byte[])localObject3;
    }
    catch (Exception localException)
    {
      Object localObject2 = new b/a/a/a/i/a/i;
      Object localObject3 = localException.getMessage();
      ((i)localObject2).<init>((String)localObject3, localException);
      throw ((Throwable)localObject2);
    }
  }
  
  private static byte[] i(String paramString)
  {
    Object localObject1 = "UnicodeLittleUnmarked";
    try
    {
      localObject1 = paramString.getBytes((String)localObject1);
      localObject2 = new b/a/a/a/i/a/j$c;
      ((j.c)localObject2).<init>();
      ((j.c)localObject2).a((byte[])localObject1);
      return ((j.c)localObject2).a();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject2 = new b/a/a/a/i/a/i;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Unicode not supported: ");
      String str = localUnsupportedEncodingException.getMessage();
      localObject3 = str;
      ((i)localObject2).<init>((String)localObject3, localUnsupportedEncodingException);
      throw ((Throwable)localObject2);
    }
  }
  
  public String a(String paramString1, String paramString2)
  {
    return b(paramString2, paramString1);
  }
  
  public String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Object localObject = new b/a/a/a/i/a/j$f;
    ((j.f)localObject).<init>(paramString5);
    byte[] arrayOfByte1 = ((j.f)localObject).c();
    int i = ((j.f)localObject).f();
    String str = ((j.f)localObject).d();
    byte[] arrayOfByte2 = ((j.f)localObject).e();
    localObject = this;
    return a(paramString1, paramString2, paramString4, paramString3, arrayOfByte1, i, str, arrayOfByte2);
  }
  
  String a(String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte1, int paramInt, String paramString5, byte[] paramArrayOfByte2)
  {
    j.g localg = new b/a/a/a/i/a/j$g;
    localg.<init>(paramString4, paramString3, paramString1, paramString2, paramArrayOfByte1, paramInt, paramString5, paramArrayOfByte2);
    return localg.b();
  }
  
  String b(String paramString1, String paramString2)
  {
    j.e locale = new b/a/a/a/i/a/j$e;
    locale.<init>(paramString2, paramString1);
    return locale.b();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */