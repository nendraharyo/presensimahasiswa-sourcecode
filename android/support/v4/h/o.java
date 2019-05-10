package android.support.v4.h;

import java.io.PrintWriter;

public final class o
{
  private static final Object a;
  private static char[] b = new char[24];
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private static int a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i = 99;
    if (paramInt1 <= i)
    {
      if (paramBoolean)
      {
        i = 3;
        if (paramInt3 < i) {}
      }
    }
    else {
      i = paramInt2 + 3;
    }
    for (;;)
    {
      return i;
      i = 9;
      if (paramInt1 <= i)
      {
        if (paramBoolean)
        {
          i = 2;
          if (paramInt3 < i) {}
        }
      }
      else
      {
        i = paramInt2 + 2;
        continue;
      }
      if ((paramBoolean) || (paramInt1 > 0)) {
        i = paramInt2 + 1;
      } else {
        i = 0;
      }
    }
  }
  
  private static int a(long paramLong, int paramInt)
  {
    char[] arrayOfChar = b;
    int i = arrayOfChar.length;
    int j = paramInt;
    if (i < paramInt)
    {
      arrayOfChar = new char[paramInt];
      b = arrayOfChar;
    }
    arrayOfChar = b;
    long l1 = 0L;
    boolean bool1 = paramLong < l1;
    float f;
    int m;
    int n;
    if (!bool1)
    {
      bool1 = false;
      f = 0.0F;
      m = paramInt + -1;
      while (0 < m)
      {
        n = 32;
        arrayOfChar[0] = n;
      }
      m = 48;
      arrayOfChar[0] = m;
      i = 1;
      return i;
    }
    l1 = 0L;
    bool1 = paramLong < l1;
    int k;
    int i4;
    int i5;
    int i15;
    if (bool1)
    {
      k = 43;
      f = 6.0E-44F;
      m = k;
      j = (int)(paramLong % 1000L);
      i4 = j;
      long l2 = paramLong / 1000L;
      double d = Math.floor(l2);
      i5 = (int)d;
      k = 0;
      f = 0.0F;
      i8 = 0;
      n = 0;
      int i10 = 86400;
      if (i5 > i10)
      {
        f = 1.21072E-40F;
        k = i5 / 86400;
        int i11 = 86400 * k;
        i5 -= i11;
      }
      int i12 = 3600;
      if (i5 <= i12) {
        break label823;
      }
      i8 = i5 / 3600;
      int i13 = i8 * 3600;
      i5 -= i13;
      i15 = i8;
    }
    int i9;
    label308:
    label342:
    int i7;
    for (int i8 = i5;; i9 = i7)
    {
      i5 = 60;
      int i17;
      if (i8 > i5)
      {
        n = i8 / 60;
        i5 = n * 60;
        i8 -= i5;
        i17 = n;
      }
      for (int i19 = i9;; i19 = i9)
      {
        i9 = 0;
        char c2;
        if (paramInt != 0)
        {
          n = 1;
          i5 = a(k, n, false, 0);
          c2 = '\001';
          int i20;
          if (i5 > 0)
          {
            n = 1;
            i20 = 2;
            int i1 = a(i15, c2, n, i20);
            int i6;
            i5 += i1;
            c2 = '\001';
            if (i6 <= 0) {
              break label503;
            }
            i1 = 1;
            i20 = 2;
            int i2 = a(i17, c2, i1, i20);
            i6 += i2;
            c2 = '\001';
            if (i7 <= 0) {
              break label509;
            }
            i2 = 1;
            label376:
            i3 = a(i19, c2, i2, 2);
            i7 += i3;
            c2 = '\002';
            i20 = 1;
            if (i7 <= 0) {
              break label515;
            }
          }
          label503:
          label509:
          label515:
          for (i3 = 3;; i3 = 0)
          {
            j = i4;
            int i22 = a(i4, c2, i20, i3) + 1 + i7;
            i3 = 0;
            i9 = i22;
            for (;;)
            {
              j = paramInt;
              if (i9 >= paramInt) {
                break;
              }
              arrayOfChar[i3] = ' ';
              i7 = i3 + 1;
              i9 += 1;
              i3 = i7;
            }
            k = 45;
            f = 6.3E-44F;
            long l3 = paramLong;
            l3 = -paramLong;
            paramLong = l3;
            m = k;
            break;
            i3 = 0;
            break label308;
            i3 = 0;
            break label342;
            i3 = 0;
            break label376;
          }
        }
        int i3 = 0;
        arrayOfChar[i3] = m;
        i3 += 1;
        label547:
        boolean bool2;
        label585:
        int i25;
        label593:
        label627:
        label635:
        label669:
        label677:
        int i14;
        char c1;
        if (paramInt != 0)
        {
          m = 1;
          int i23 = m;
          m = 100;
          i9 = 0;
          i7 = 0;
          int i21 = a(arrayOfChar, k, m, i3, false, 0);
          c2 = 'h';
          if (i21 == i3) {
            break label771;
          }
          bool2 = true;
          if (i23 == 0) {
            break label777;
          }
          i25 = 2;
          i7 = i15;
          i21 = a(arrayOfChar, i15, c2, i21, bool2, i25);
          c2 = 'm';
          if (i21 == i3) {
            break label783;
          }
          bool2 = true;
          if (i23 == 0) {
            break label789;
          }
          i25 = 2;
          i7 = i17;
          i21 = a(arrayOfChar, i17, c2, i21, bool2, i25);
          c2 = 's';
          if (i21 == i3) {
            break label795;
          }
          bool2 = true;
          if (i23 == 0) {
            break label801;
          }
          i25 = 2;
          i7 = i19;
          i14 = a(arrayOfChar, i19, c2, i21, bool2, i25);
          c1 = 'm';
          i9 = 1;
          if ((i23 == 0) || (i14 == i3)) {
            break label807;
          }
        }
        label771:
        label777:
        label783:
        label789:
        label795:
        label801:
        label807:
        for (i7 = 3;; i7 = 0)
        {
          k = i4;
          i3 = i14;
          k = a(arrayOfChar, i4, c1, i14, i9, i7);
          c1 = 's';
          arrayOfChar[k] = c1;
          i = k + 1;
          break;
          c1 = '\000';
          int i24 = 0;
          break label547;
          bool2 = false;
          break label585;
          i25 = 0;
          break label593;
          bool2 = false;
          break label627;
          i25 = 0;
          break label635;
          bool2 = false;
          break label669;
          i25 = 0;
          break label677;
        }
        int i18 = 0;
      }
      label823:
      int i16 = 0;
    }
  }
  
  private static int a(char[] paramArrayOfChar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i;
    if ((paramBoolean) || (paramInt1 > 0))
    {
      if (paramBoolean)
      {
        i = 3;
        if (paramInt3 >= i) {}
      }
      else
      {
        i = 99;
        if (paramInt1 <= i) {
          break label176;
        }
      }
      j = paramInt1 / 100;
      i = (char)(j + 48);
      paramArrayOfChar[paramInt2] = i;
      i = paramInt2 + 1;
      j *= 100;
    }
    for (int j = paramInt1 - j;; j = paramInt1)
    {
      if (paramBoolean)
      {
        k = 2;
        if (paramInt3 >= k) {}
      }
      else
      {
        k = 9;
        if ((j <= k) && (paramInt2 == i)) {
          break label144;
        }
      }
      int k = j / 10;
      int m = (char)(k + 48);
      paramArrayOfChar[i] = m;
      i += 1;
      k *= 10;
      j -= k;
      label144:
      j = (char)(j + 48);
      paramArrayOfChar[i] = j;
      i += 1;
      paramArrayOfChar[i] = paramChar;
      paramInt2 = i + 1;
      return paramInt2;
      label176:
      i = paramInt2;
    }
  }
  
  public static void a(long paramLong1, long paramLong2, PrintWriter paramPrintWriter)
  {
    long l = 0L;
    boolean bool = paramLong1 < l;
    if (!bool)
    {
      String str = "--";
      paramPrintWriter.print(str);
    }
    for (;;)
    {
      return;
      l = paramLong1 - paramLong2;
      a(l, paramPrintWriter, 0);
    }
  }
  
  public static void a(long paramLong, PrintWriter paramPrintWriter)
  {
    a(paramLong, paramPrintWriter, 0);
  }
  
  public static void a(long paramLong, PrintWriter paramPrintWriter, int paramInt)
  {
    synchronized (a)
    {
      int i = a(paramLong, paramInt);
      String str = new java/lang/String;
      char[] arrayOfChar = b;
      str.<init>(arrayOfChar, 0, i);
      paramPrintWriter.print(str);
      return;
    }
  }
  
  public static void a(long paramLong, StringBuilder paramStringBuilder)
  {
    Object localObject1 = a;
    int i = 0;
    Object localObject2 = null;
    try
    {
      i = a(paramLong, 0);
      char[] arrayOfChar = b;
      paramStringBuilder.append(arrayOfChar, 0, i);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */