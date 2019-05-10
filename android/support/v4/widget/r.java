package android.support.v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class r
{
  private static final ThreadLocal a;
  private static final ThreadLocal b;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    a = localThreadLocal;
    localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    b = localThreadLocal;
  }
  
  static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    float f = 0.5F;
    Object localObject1 = (Matrix)a.get();
    if (localObject1 == null)
    {
      localObject1 = new android/graphics/Matrix;
      ((Matrix)localObject1).<init>();
      a.set(localObject1);
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      a(paramViewGroup, paramView, (Matrix)localObject2);
      localObject1 = (RectF)b.get();
      if (localObject1 == null)
      {
        localObject1 = new android/graphics/RectF;
        ((RectF)localObject1).<init>();
        ThreadLocal localThreadLocal = b;
        localThreadLocal.set(localObject1);
      }
      ((RectF)localObject1).set(paramRect);
      ((Matrix)localObject2).mapRect((RectF)localObject1);
      int i = (int)(((RectF)localObject1).left + f);
      int j = (int)(((RectF)localObject1).top + f);
      int k = (int)(((RectF)localObject1).right + f);
      int m = (int)(((RectF)localObject1).bottom + f);
      paramRect.set(i, j, k, m);
      return;
      ((Matrix)localObject1).reset();
    }
  }
  
  private static void a(ViewParent paramViewParent, View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    boolean bool1 = localObject instanceof View;
    if ((bool1) && (localObject != paramViewParent))
    {
      localObject = (View)localObject;
      a(paramViewParent, (View)localObject, paramMatrix);
      i = -((View)localObject).getScrollX();
      f1 = i;
      int j = -((View)localObject).getScrollY();
      f2 = j;
      paramMatrix.preTranslate(f1, f2);
    }
    float f2 = paramView.getLeft();
    int i = paramView.getTop();
    float f1 = i;
    paramMatrix.preTranslate(f2, f1);
    localObject = paramView.getMatrix();
    boolean bool2 = ((Matrix)localObject).isIdentity();
    if (!bool2)
    {
      localObject = paramView.getMatrix();
      paramMatrix.preConcat((Matrix)localObject);
    }
  }
  
  public static void b(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    paramRect.set(0, 0, i, j);
    a(paramViewGroup, paramView, paramRect);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */