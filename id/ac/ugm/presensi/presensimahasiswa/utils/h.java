package id.ac.ugm.presensi.presensimahasiswa.utils;

public class h
{
  private static final byte[] a;
  
  static
  {
    byte[] arrayOfByte = new byte[16];
    arrayOfByte[0] = 48;
    arrayOfByte[1] = 49;
    arrayOfByte[2] = 50;
    arrayOfByte[3] = 51;
    arrayOfByte[4] = 52;
    arrayOfByte[5] = 53;
    arrayOfByte[6] = 54;
    arrayOfByte[7] = 55;
    arrayOfByte[8] = 56;
    arrayOfByte[9] = 57;
    arrayOfByte[10] = 65;
    arrayOfByte[11] = 66;
    arrayOfByte[12] = 67;
    arrayOfByte[13] = 68;
    arrayOfByte[14] = 69;
    arrayOfByte[15] = 70;
    a = arrayOfByte;
  }
  
  public static String a(Object paramObject, int paramInt1, int paramInt2)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int i = paramObject instanceof Integer;
    String str1;
    label44:
    String str2;
    if (i != 0)
    {
      str1 = String.valueOf(paramObject);
      localStringBuffer.append(str1);
      int k = localStringBuffer.length();
      i = 0;
      str1 = null;
      int m = paramInt1 - k;
      if (i >= m) {
        break label153;
      }
      int n = 1;
      if (paramInt2 != n) {
        break label139;
      }
      str2 = "0";
      localStringBuffer.insert(0, str2);
    }
    for (;;)
    {
      int j;
      i += 1;
      break label44;
      boolean bool = paramObject instanceof String;
      if (bool)
      {
        paramObject = (String)paramObject;
        localStringBuffer.append((String)paramObject);
        break;
      }
      bool = paramObject instanceof Long;
      if (!bool) {
        break;
      }
      str1 = String.valueOf(paramObject);
      localStringBuffer.append(str1);
      break;
      label139:
      str2 = "0";
      localStringBuffer.append(str2);
    }
    label153:
    return localStringBuffer.toString();
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    String str = null;
    byte[] arrayOfByte1 = new byte[paramInt * 2];
    int j = paramArrayOfByte.length;
    int k = 0;
    int m = 0;
    for (;;)
    {
      if (i < j)
      {
        n = paramArrayOfByte[i];
        if (k < paramInt) {}
      }
      else
      {
        str = new java/lang/String;
        str.<init>(arrayOfByte1);
        return str;
      }
      k += 1;
      n &= 0xFF;
      int i1 = m + 1;
      byte[] arrayOfByte2 = a;
      int i2 = n >>> 4;
      int i3 = arrayOfByte2[i2];
      arrayOfByte1[m] = i3;
      m = i1 + 1;
      arrayOfByte2 = a;
      n &= 0xF;
      int n = arrayOfByte2[n];
      arrayOfByte1[i1] = n;
      i += 1;
    }
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    int i = 1;
    int j = paramArrayOfByte.length + -2;
    j = paramArrayOfByte[j];
    int m = paramArrayOfByte.length + -1;
    int i2 = paramArrayOfByte[m];
    m = -112;
    int n;
    if (j != m)
    {
      n = -111;
      if (j != n) {}
    }
    else
    {
      n = i;
      if (i2 != 0) {
        break label69;
      }
    }
    label69:
    int k;
    for (j = i;; k = 0)
    {
      if ((n == i) && (j == i)) {}
      for (;;)
      {
        return i;
        int i1 = 0;
        break;
        i = 0;
      }
    }
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return a(paramArrayOfByte, i);
  }
  
  public static String c(byte[] paramArrayOfByte)
  {
    int i = 3;
    int j = 0;
    int k = 2;
    int m = 1;
    int n = paramArrayOfByte.length;
    int i1 = 16;
    Object localObject1;
    if (n != i1) {
      localObject1 = "";
    }
    for (;;)
    {
      return (String)localObject1;
      i1 = paramArrayOfByte[0];
      a(Integer.valueOf(paramArrayOfByte[m]), k, m);
      localObject1 = new byte[i];
      System.arraycopy(paramArrayOfByte, k, localObject1, 0, i);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = a(Integer.valueOf(localObject1[0]), k, m);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject3 = a(Integer.valueOf(localObject1[m]), k, m);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      n = localObject1[k];
      localObject1 = a(Integer.valueOf(n), k, m);
      localObject1 = (String)localObject1;
      i1 = 15 - i1;
      localObject2 = new byte[4];
      int i2 = paramArrayOfByte.length - i1;
      int i3 = localObject2.length;
      i2 -= i3;
      i3 = localObject2.length;
      System.arraycopy(paramArrayOfByte, i2, localObject2, 0, i3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      Object localObject4 = a(Integer.valueOf(localObject2[0]), k, m);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = a(Integer.valueOf(localObject2[m]), k, m);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4).append("");
      i3 = localObject2[k];
      localObject3 = ((StringBuilder)localObject3).append(i3).append("");
      i3 = localObject2[i];
      ((StringBuilder)localObject3).append(i3).toString();
      localObject3 = new byte[i];
      i3 = paramArrayOfByte.length - i1;
      i = localObject2.length;
      i3 -= i;
      i = localObject3.length;
      i3 -= i;
      i = localObject3.length;
      System.arraycopy(paramArrayOfByte, i3, localObject3, 0, i);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      i = localObject3[0];
      localObject4 = ((StringBuilder)localObject4).append(i);
      Object localObject5 = a(Integer.valueOf(localObject3[m]), k, m);
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      i = localObject3[k];
      localObject5 = a(Integer.valueOf(i), k, m);
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      ((StringBuilder)localObject4).toString();
      i3 = paramArrayOfByte.length;
      i1 = i3 - i1;
      int i4 = localObject2.length;
      i1 -= i4;
      i4 = localObject3.length;
      localObject2 = new byte[i1 - i4 + -5];
      i1 = 5;
      i2 = localObject2.length;
      System.arraycopy(paramArrayOfByte, i1, localObject2, 0, i2);
      Object localObject6 = "";
      i2 = localObject2.length;
      while (j < i2)
      {
        i3 = (char)localObject2[j];
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject6 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject5 = "";
        localObject6 = (String)localObject5 + i3;
        j += 1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */