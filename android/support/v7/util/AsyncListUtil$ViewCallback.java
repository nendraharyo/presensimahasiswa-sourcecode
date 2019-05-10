package android.support.v7.util;

public abstract class AsyncListUtil$ViewCallback
{
  public static final int HINT_SCROLL_ASC = 2;
  public static final int HINT_SCROLL_DESC = 1;
  public static final int HINT_SCROLL_NONE;
  
  public void extendRangeInto(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    int i = 1;
    int j = paramArrayOfInt1[i];
    int k = paramArrayOfInt1[0];
    j -= k;
    k = j + 1;
    int m = k / 2;
    int n = paramArrayOfInt1[0];
    if (paramInt == i)
    {
      j = k;
      j = n - j;
      paramArrayOfInt2[0] = j;
      j = paramArrayOfInt1[i];
      n = 2;
      if (paramInt != n) {
        break label96;
      }
    }
    for (;;)
    {
      j += k;
      paramArrayOfInt2[i] = j;
      return;
      j = m;
      break;
      label96:
      k = m;
    }
  }
  
  public abstract void getItemRangeInto(int[] paramArrayOfInt);
  
  public abstract void onDataRefresh();
  
  public abstract void onItemLoaded(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\AsyncListUtil$ViewCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */