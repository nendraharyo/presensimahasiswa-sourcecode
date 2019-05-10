package android.support.v4.f;

import java.util.Comparator;

final class b$4
  implements Comparator
{
  public int a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int j = paramArrayOfByte1.length;
    int k = paramArrayOfByte2.length;
    if (j != k)
    {
      j = paramArrayOfByte1.length;
      i = paramArrayOfByte2.length;
      i = j - i;
      return i;
    }
    j = 0;
    for (;;)
    {
      k = paramArrayOfByte1.length;
      if (j >= k) {
        break;
      }
      k = paramArrayOfByte1[j];
      int m = paramArrayOfByte2[j];
      if (k != m)
      {
        i = paramArrayOfByte1[j];
        j = paramArrayOfByte2[j];
        i -= j;
        break;
      }
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\b$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */