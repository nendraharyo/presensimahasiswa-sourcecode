package android.support.transition;

import android.graphics.Matrix;
import android.os.IBinder;
import android.view.View;

class an
  implements as
{
  public al a(View paramView)
  {
    return aj.d(paramView);
  }
  
  public void a(View paramView, float paramFloat)
  {
    int i = r.a.save_non_transition_alpha;
    Float localFloat = (Float)paramView.getTag(i);
    if (localFloat != null)
    {
      float f = localFloat.floatValue() * paramFloat;
      paramView.setAlpha(f);
    }
    for (;;)
    {
      return;
      paramView.setAlpha(paramFloat);
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setLeft(paramInt1);
    paramView.setTop(paramInt2);
    paramView.setRight(paramInt3);
    paramView.setBottom(paramInt4);
  }
  
  public void a(View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    boolean bool1 = localObject instanceof View;
    if (bool1)
    {
      localObject = (View)localObject;
      a((View)localObject, paramMatrix);
      int i = -((View)localObject).getScrollX();
      f1 = i;
      j = -((View)localObject).getScrollY();
      f2 = j;
      paramMatrix.preTranslate(f1, f2);
    }
    int j = paramView.getLeft();
    float f2 = j;
    float f1 = paramView.getTop();
    paramMatrix.preTranslate(f2, f1);
    localObject = paramView.getMatrix();
    boolean bool2 = ((Matrix)localObject).isIdentity();
    if (!bool2) {
      paramMatrix.preConcat((Matrix)localObject);
    }
  }
  
  public aw b(View paramView)
  {
    au localau = new android/support/transition/au;
    IBinder localIBinder = paramView.getWindowToken();
    localau.<init>(localIBinder);
    return localau;
  }
  
  public void b(View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    boolean bool1 = localObject instanceof View;
    if (bool1)
    {
      localObject = (View)localObject;
      b((View)localObject, paramMatrix);
      int i = ((View)localObject).getScrollX();
      f1 = i;
      j = ((View)localObject).getScrollY();
      f2 = j;
      paramMatrix.postTranslate(f1, f2);
    }
    int j = paramView.getLeft();
    float f2 = j;
    float f1 = paramView.getTop();
    paramMatrix.postTranslate(f2, f1);
    localObject = paramView.getMatrix();
    boolean bool2 = ((Matrix)localObject).isIdentity();
    if (!bool2)
    {
      Matrix localMatrix = new android/graphics/Matrix;
      localMatrix.<init>();
      boolean bool3 = ((Matrix)localObject).invert(localMatrix);
      if (bool3) {
        paramMatrix.postConcat(localMatrix);
      }
    }
  }
  
  public float c(View paramView)
  {
    int i = r.a.save_non_transition_alpha;
    Float localFloat = (Float)paramView.getTag(i);
    float f1;
    if (localFloat != null)
    {
      f1 = paramView.getAlpha();
      f2 = localFloat.floatValue();
    }
    for (float f2 = f1 / f2;; f2 = paramView.getAlpha()) {
      return f2;
    }
  }
  
  public void d(View paramView)
  {
    int i = r.a.save_non_transition_alpha;
    Object localObject = paramView.getTag(i);
    if (localObject == null)
    {
      i = r.a.save_non_transition_alpha;
      float f = paramView.getAlpha();
      Float localFloat = Float.valueOf(f);
      paramView.setTag(i, localFloat);
    }
  }
  
  public void e(View paramView)
  {
    int i = paramView.getVisibility();
    if (i == 0)
    {
      i = r.a.save_non_transition_alpha;
      paramView.setTag(i, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\an.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */