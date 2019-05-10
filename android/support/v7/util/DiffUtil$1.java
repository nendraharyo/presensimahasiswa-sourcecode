package android.support.v7.util;

import java.util.Comparator;

final class DiffUtil$1
  implements Comparator
{
  public int compare(DiffUtil.Snake paramSnake1, DiffUtil.Snake paramSnake2)
  {
    int i = paramSnake1.x;
    int j = paramSnake2.x;
    i -= j;
    if (i == 0)
    {
      i = paramSnake1.y;
      j = paramSnake2.y;
      i -= j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\DiffUtil$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */