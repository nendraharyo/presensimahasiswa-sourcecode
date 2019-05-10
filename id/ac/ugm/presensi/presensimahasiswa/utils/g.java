package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.nfc.tech.IsoDep;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class g
  extends c
{
  public static final byte[] e;
  byte[] f;
  private byte[] g;
  private byte[] h;
  
  static
  {
    byte[] arrayOfByte = new byte[13];
    arrayOfByte[0] = 0;
    arrayOfByte[1] = -92;
    arrayOfByte[2] = 4;
    arrayOfByte[3] = 0;
    arrayOfByte[4] = 8;
    arrayOfByte[5] = -96;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 66;
    arrayOfByte[8] = 78;
    arrayOfByte[9] = 73;
    arrayOfByte[10] = 16;
    arrayOfByte[11] = 0;
    arrayOfByte[12] = 1;
    e = arrayOfByte;
  }
  
  public g(IsoDep paramIsoDep)
  {
    byte[] arrayOfByte = new byte[13];
    byte[] tmp10_9 = arrayOfByte;
    byte[] tmp11_10 = tmp10_9;
    byte[] tmp11_10 = tmp10_9;
    tmp11_10[0] = 0;
    tmp11_10[1] = -92;
    byte[] tmp19_11 = tmp11_10;
    byte[] tmp19_11 = tmp11_10;
    tmp19_11[2] = 4;
    tmp19_11[3] = 0;
    byte[] tmp26_19 = tmp19_11;
    byte[] tmp26_19 = tmp19_11;
    tmp26_19[4] = 8;
    tmp26_19[5] = -96;
    byte[] tmp35_26 = tmp26_19;
    byte[] tmp35_26 = tmp26_19;
    tmp35_26[6] = 0;
    tmp35_26[7] = 66;
    byte[] tmp45_35 = tmp35_26;
    byte[] tmp45_35 = tmp35_26;
    tmp45_35[8] = 78;
    tmp45_35[9] = 73;
    tmp45_35[10] = -103;
    byte[] tmp61_45 = tmp45_35;
    tmp61_45[11] = -103;
    tmp61_45[12] = -103;
    this.g = arrayOfByte;
    arrayOfByte = new byte[5];
    byte[] tmp82_81 = arrayOfByte;
    byte[] tmp83_82 = tmp82_81;
    byte[] tmp83_82 = tmp82_81;
    tmp83_82[0] = 0;
    tmp83_82[1] = -80;
    tmp83_82[2] = -106;
    byte[] tmp95_83 = tmp83_82;
    tmp95_83[3] = 0;
    tmp95_83[4] = Byte.MIN_VALUE;
    this.h = arrayOfByte;
    this.d = paramIsoDep;
  }
  
  private byte[] a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte[] paramArrayOfByte)
  {
    try
    {
      localObject1 = this.d;
      byte[] arrayOfByte = b(paramByte1, paramByte2, paramByte3, paramByte4, paramArrayOfByte);
      localObject1 = ((IsoDep)localObject1).transceive(arrayOfByte);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (byte[])localObject1;
  }
  
  private byte[] b(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte[] paramArrayOfByte)
  {
    localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>();
    int i = -112;
    ((ByteArrayOutputStream)localObject).write(i);
    ((ByteArrayOutputStream)localObject).write(paramByte1);
    ((ByteArrayOutputStream)localObject).write(paramByte2);
    ((ByteArrayOutputStream)localObject).write(paramByte3);
    ((ByteArrayOutputStream)localObject).write(paramByte4);
    if (paramArrayOfByte != null) {}
    try
    {
      ((ByteArrayOutputStream)localObject).write(paramArrayOfByte);
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      }
    }
    return (byte[])localObject;
  }
  
  public boolean a()
  {
    try
    {
      Object localObject1 = this.d;
      Object localObject3 = this.g;
      localObject1 = ((IsoDep)localObject1).transceive((byte[])localObject3);
      localObject3 = this.d;
      byte[] arrayOfByte1 = this.h;
      byte[] arrayOfByte2 = ((IsoDep)localObject3).transceive(arrayOfByte1);
      int i = localObject1.length + -1;
      k = localObject1[i];
      i = 50;
      byte b = 3;
      int i5 = 0;
      localObject1 = this;
      localObject3 = a(i, b, (byte)0, (byte)0, null);
      k = 2;
      k = localObject3[k] << 16 & 0xFF0000;
      b = 3;
      int n = localObject3[b] << 8;
      i5 = 65280;
      n &= i5;
      k |= n;
      int i1 = 4;
      i1 = localObject3[i1] & 0xFF;
      k |= i1;
      int i2 = 2;
      i2 = localObject3[i2] & 0x80;
      if (i2 != 0)
      {
        i2 = -16777216;
        k |= i2;
      }
      long l = k;
      this.a = l;
      k = 8;
      localObject1 = new byte[k];
      this.f = ((byte[])localObject1);
      k = 0;
      localObject1 = null;
      for (;;)
      {
        arrayOfByte1 = this.f;
        int i3 = arrayOfByte1.length;
        if (k >= i3) {
          break;
        }
        arrayOfByte1 = this.f;
        i6 = k + 8;
        i6 = localObject3[i6];
        arrayOfByte1[k] = i6;
        k += 1;
      }
      localObject1 = this.f;
      localObject1 = h.b((byte[])localObject1);
      this.b = ((String)localObject1);
      k = 16;
      localObject1 = new byte[k];
      int j = 0;
      localObject3 = null;
      int i4 = 0;
      arrayOfByte1 = null;
      int i6 = localObject1.length;
      System.arraycopy(arrayOfByte2, 0, localObject1, 0, i6);
      localObject1 = h.c((byte[])localObject1);
      this.c = ((String)localObject1);
      k = 1;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int k;
        int m = 0;
        Object localObject2 = null;
      }
    }
    return k;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */