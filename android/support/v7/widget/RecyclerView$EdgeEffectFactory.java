package android.support.v7.widget;

import android.content.Context;
import android.widget.EdgeEffect;

public class RecyclerView$EdgeEffectFactory
{
  public static final int DIRECTION_BOTTOM = 3;
  public static final int DIRECTION_LEFT = 0;
  public static final int DIRECTION_RIGHT = 2;
  public static final int DIRECTION_TOP = 1;
  
  protected EdgeEffect createEdgeEffect(RecyclerView paramRecyclerView, int paramInt)
  {
    EdgeEffect localEdgeEffect = new android/widget/EdgeEffect;
    Context localContext = paramRecyclerView.getContext();
    localEdgeEffect.<init>(localContext);
    return localEdgeEffect;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$EdgeEffectFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */