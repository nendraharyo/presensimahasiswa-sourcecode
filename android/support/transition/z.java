package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class z
{
  static Animator a(Animator paramAnimator1, Animator paramAnimator2)
  {
    if (paramAnimator1 == null) {}
    for (;;)
    {
      return paramAnimator2;
      if (paramAnimator2 == null)
      {
        paramAnimator2 = paramAnimator1;
      }
      else
      {
        AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
        localAnimatorSet.<init>();
        int i = 2;
        Animator[] arrayOfAnimator = new Animator[i];
        arrayOfAnimator[0] = paramAnimator1;
        int j = 1;
        arrayOfAnimator[j] = paramAnimator2;
        localAnimatorSet.playTogether(arrayOfAnimator);
        paramAnimator2 = localAnimatorSet;
      }
    }
  }
  
  private static Bitmap a(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    float f1 = 0.0F;
    Object localObject = null;
    float f2 = paramRectF.width();
    int i = Math.round(f2);
    float f3 = paramRectF.height();
    int j = Math.round(f3);
    if ((i > 0) && (j > 0))
    {
      int k = i * j;
      float f4 = k;
      float f5 = 8 / f4;
      f1 = Math.min(1.0F, f5);
      f2 = i * f1;
      i = (int)f2;
      f3 = j * f1;
      j = (int)f3;
      f5 = -paramRectF.left;
      f4 = -paramRectF.top;
      paramMatrix.postTranslate(f5, f4);
      paramMatrix.postScale(f1, f1);
      localObject = Bitmap.Config.ARGB_8888;
      localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
      Canvas localCanvas = new android/graphics/Canvas;
      localCanvas.<init>((Bitmap)localObject);
      localCanvas.concat(paramMatrix);
      paramView.draw(localCanvas);
    }
    return (Bitmap)localObject;
  }
  
  static View a(ViewGroup paramViewGroup, View paramView1, View paramView2)
  {
    int i = 1073741824;
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    int j = -paramView2.getScrollX();
    float f1 = j;
    float f2 = -paramView2.getScrollY();
    ((Matrix)localObject1).setTranslate(f1, f2);
    am.a(paramView1, (Matrix)localObject1);
    am.b(paramViewGroup, (Matrix)localObject1);
    RectF localRectF = new android/graphics/RectF;
    f2 = paramView1.getWidth();
    float f3 = paramView1.getHeight();
    localRectF.<init>(0.0F, 0.0F, f2, f3);
    ((Matrix)localObject1).mapRect(localRectF);
    f2 = localRectF.left;
    int k = Math.round(f2);
    f3 = localRectF.top;
    int m = Math.round(f3);
    float f4 = localRectF.right;
    int n = Math.round(f4);
    float f5 = localRectF.bottom;
    int i1 = Math.round(f5);
    ImageView localImageView = new android/widget/ImageView;
    Object localObject2 = paramView1.getContext();
    localImageView.<init>((Context)localObject2);
    localObject2 = ImageView.ScaleType.CENTER_CROP;
    localImageView.setScaleType((ImageView.ScaleType)localObject2);
    localObject1 = a(paramView1, (Matrix)localObject1, localRectF);
    if (localObject1 != null) {
      localImageView.setImageBitmap((Bitmap)localObject1);
    }
    int i2 = View.MeasureSpec.makeMeasureSpec(n - k, i);
    j = View.MeasureSpec.makeMeasureSpec(i1 - m, i);
    localImageView.measure(i2, j);
    localImageView.layout(k, m, n, i1);
    return localImageView;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */