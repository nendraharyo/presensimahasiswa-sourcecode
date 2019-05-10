package com.google.android.gms.internal;

public final class zzmy
{
  public static String zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 16;
    int j = 8;
    int k = 1;
    if (paramArrayOfByte != null)
    {
      m = paramArrayOfByte.length;
      if ((m != 0) && (paramInt1 >= 0) && (paramInt2 > 0))
      {
        m = paramInt1 + paramInt2;
        n = paramArrayOfByte.length;
        if (m <= n) {
          break label57;
        }
      }
    }
    int m = 0;
    String str1 = null;
    return str1;
    label57:
    m = 57;
    if (paramBoolean) {
      m = 75;
    }
    int n = (paramInt2 + 16 + -1) / 16;
    m *= n;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(m);
    n = paramInt1;
    int i1 = paramInt2;
    m = 0;
    str1 = null;
    int i3 = 0;
    label114:
    int i6;
    int i2;
    if (i1 > 0)
    {
      Object localObject2;
      if (i3 == 0)
      {
        m = 65536;
        if (paramInt2 < m)
        {
          localObject1 = new Object[k];
          localObject2 = Integer.valueOf(n);
          localObject1[0] = localObject2;
          str1 = String.format("%04X:", (Object[])localObject1);
          localStringBuilder.append(str1);
          m = n;
        }
      }
      int i4;
      int i7;
      for (;;)
      {
        localObject2 = new Object[k];
        i4 = paramArrayOfByte[n] & 0xFF;
        Object localObject3 = Integer.valueOf(i4);
        localObject2[0] = localObject3;
        localObject1 = String.format(" %02X", (Object[])localObject2);
        localStringBuilder.append((String)localObject1);
        i6 = i1 + -1;
        i3 += 1;
        if ((!paramBoolean) || ((i3 != i) && (i6 != 0))) {
          break label470;
        }
        i7 = 16 - i3;
        if (i7 <= 0) {
          break;
        }
        i1 = 0;
        str2 = null;
        while (i1 < i7)
        {
          localObject3 = "   ";
          localStringBuilder.append((String)localObject3);
          i1 += 1;
        }
        localObject1 = new Object[k];
        localObject2 = Integer.valueOf(n);
        localObject1[0] = localObject2;
        str1 = String.format("%08X:", (Object[])localObject1);
        localStringBuilder.append(str1);
        m = n;
        continue;
        if (i3 == j)
        {
          localObject1 = " -";
          localStringBuilder.append((String)localObject1);
        }
      }
      if (i7 >= j)
      {
        str2 = "  ";
        localStringBuilder.append(str2);
      }
      String str2 = "  ";
      localStringBuilder.append(str2);
      int i8 = 0;
      Object localObject1 = null;
      if (i8 < i3)
      {
        i1 = m + i8;
        i1 = (char)paramArrayOfByte[i1];
        i4 = 32;
        if (i1 >= i4)
        {
          int i5 = 126;
          if (i1 > i5) {}
        }
        for (;;)
        {
          localStringBuilder.append(i1);
          i2 = i8 + 1;
          i8 = i2;
          break;
          i2 = 46;
        }
      }
      label470:
      if ((i3 != i) && (i6 != 0)) {
        break label523;
      }
      localStringBuilder.append('\n');
      i2 = 0;
      str2 = null;
    }
    for (;;)
    {
      n += 1;
      i3 = i2;
      i2 = i6;
      break label114;
      str1 = localStringBuilder.toString();
      break;
      label523:
      i2 = i3;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */