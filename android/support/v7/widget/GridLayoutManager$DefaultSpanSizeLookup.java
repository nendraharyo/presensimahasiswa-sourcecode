package android.support.v7.widget;

public final class GridLayoutManager$DefaultSpanSizeLookup
  extends GridLayoutManager.SpanSizeLookup
{
  public int getSpanIndex(int paramInt1, int paramInt2)
  {
    return paramInt1 % paramInt2;
  }
  
  public int getSpanSize(int paramInt)
  {
    return 1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\GridLayoutManager$DefaultSpanSizeLookup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */