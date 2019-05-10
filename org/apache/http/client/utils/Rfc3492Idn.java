package org.apache.http.client.utils;

import java.util.StringTokenizer;

public class Rfc3492Idn
  implements Idn
{
  private static final String ACE_PREFIX = "xn--";
  private static final int base = 36;
  private static final int damp = 700;
  private static final char delimiter = '-';
  private static final int initial_bias = 72;
  private static final int initial_n = 128;
  private static final int skew = 38;
  private static final int tmax = 26;
  private static final int tmin = 1;
  
  private int adapt(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = paramInt1 / 700;; i = paramInt1 / 2)
    {
      j = i / paramInt2 + i;
      i = 0;
      for (;;)
      {
        k = 455;
        if (j <= k) {
          break;
        }
        j /= 35;
        i += 36;
      }
    }
    int k = j * 36;
    j += 38;
    int j = k / j;
    return i + j;
  }
  
  private int digit(char paramChar)
  {
    char c = 'A';
    if (paramChar >= c)
    {
      c = 'Z';
      if (paramChar <= c) {
        c = paramChar + '﾿';
      }
    }
    for (;;)
    {
      return c;
      c = 'a';
      if (paramChar >= c)
      {
        c = 'z';
        if (paramChar <= c)
        {
          c = paramChar + 'ﾟ';
          continue;
        }
      }
      c = '0';
      if (paramChar < c) {
        break;
      }
      c = '9';
      if (paramChar > c) {
        break;
      }
      c = paramChar + '￐' + 26;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "illegal digit: " + paramChar;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  protected String decode(String paramString)
  {
    int i = 1;
    int j = 128;
    int k = 72;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int n = paramString.length();
    localStringBuilder.<init>(n);
    n = paramString.lastIndexOf('-');
    int i1 = -1;
    if (n != i1)
    {
      CharSequence localCharSequence = paramString.subSequence(0, n);
      localStringBuilder.append(localCharSequence);
      n += 1;
      paramString = paramString.substring(n);
      n = j;
      j = 0;
    }
    for (;;)
    {
      i1 = paramString.length();
      if (i1 > 0)
      {
        i1 = 36;
        int i3 = i;
        int i4 = j;
        int i5 = paramString.length();
        if (i5 == 0)
        {
          label113:
          i1 = i4 - j;
          k = localStringBuilder.length();
          i3 = k + 1;
          if (j != 0) {
            break label317;
          }
        }
        int m;
        label315:
        label317:
        for (k = i;; m = 0)
        {
          m = adapt(i1, i3, k);
          j = localStringBuilder.length() + 1;
          j = i4 / j;
          n += j;
          j = localStringBuilder.length() + 1;
          j = i4 % j;
          i1 = (char)n;
          localStringBuilder.insert(j, i1);
          j += 1;
          break;
          i5 = paramString.charAt(0);
          paramString = paramString.substring(i);
          int i8 = digit(i5);
          int i6 = i8 * i3;
          i4 += i6;
          i6 = m + 1;
          if (i1 <= i6) {
            i6 = i;
          }
          for (;;)
          {
            if (i8 < i6) {
              break label315;
            }
            int i7 = 36 - i6;
            i3 *= i7;
            int i2;
            i1 += 36;
            break;
            i7 = m + 26;
            if (i2 >= i7) {
              i7 = 26;
            } else {
              i7 = i2 - m;
            }
          }
          break label113;
        }
      }
      return localStringBuilder.toString();
      n = j;
      j = 0;
    }
  }
  
  public String toUnicode(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = paramString.length();
    localStringBuilder.<init>(i);
    StringTokenizer localStringTokenizer = new java/util/StringTokenizer;
    String str1 = ".";
    localStringTokenizer.<init>(paramString, str1);
    for (;;)
    {
      boolean bool1 = localStringTokenizer.hasMoreTokens();
      if (!bool1) {
        break;
      }
      str1 = localStringTokenizer.nextToken();
      int j = localStringBuilder.length();
      if (j > 0)
      {
        j = 46;
        localStringBuilder.append(j);
      }
      String str2 = "xn--";
      boolean bool2 = str1.startsWith(str2);
      if (bool2)
      {
        int k = 4;
        str1 = str1.substring(k);
        str1 = decode(str1);
      }
      localStringBuilder.append(str1);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\Rfc3492Idn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */