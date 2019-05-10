package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

class CardViewBaseImpl$1
  implements RoundRectDrawableWithShadow.RoundRectHelper
{
  CardViewBaseImpl$1(CardViewBaseImpl paramCardViewBaseImpl) {}
  
  public void drawRoundRect(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint)
  {
    float f1 = 2.0F * paramFloat;
    float f2 = paramRectF.width() - f1;
    float f3 = 1.0F;
    float f4 = f2 - f3;
    f1 = paramRectF.height() - f1;
    f2 = 1.0F;
    float f5 = f1 - f2;
    f1 = 1.0F;
    boolean bool1 = paramFloat < f1;
    if (!bool1)
    {
      float f6 = paramFloat + 0.5F;
      localObject = CardViewBaseImpl.access$000(this.this$0);
      f2 = -f6;
      f3 = -f6;
      ((RectF)localObject).set(f2, f3, f6, f6);
      int j = paramCanvas.save();
      f1 = paramRectF.left + f6;
      f2 = paramRectF.top + f6;
      paramCanvas.translate(f1, f2);
      RectF localRectF = CardViewBaseImpl.access$000(this.this$0);
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f4, 0.0F);
      paramCanvas.rotate(90.0F);
      localRectF = CardViewBaseImpl.access$000(this.this$0);
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f5, 0.0F);
      paramCanvas.rotate(90.0F);
      localRectF = CardViewBaseImpl.access$000(this.this$0);
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f4, 0.0F);
      int i = 1119092736;
      paramCanvas.rotate(90.0F);
      localRectF = CardViewBaseImpl.access$000(this.this$0);
      boolean bool2 = true;
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF, 180.0F, 90.0F, bool2, paramPaint);
      paramCanvas.restoreToCount(j);
      f2 = paramRectF.left + f6 - 1.0F;
      f3 = paramRectF.top;
      f1 = paramRectF.right - f6;
      f7 = 1.0F + f1;
      f8 = paramRectF.top + f6;
      paramCanvas.drawRect(f2, f3, f7, f8, paramPaint);
      f2 = paramRectF.left + f6 - 1.0F;
      f3 = paramRectF.bottom - f6;
      f1 = paramRectF.right - f6;
      f7 = 1.0F + f1;
      f8 = paramRectF.bottom;
      paramCanvas.drawRect(f2, f3, f7, f8, paramPaint);
    }
    f2 = paramRectF.left;
    f3 = paramRectF.top + paramFloat;
    float f7 = paramRectF.right;
    float f8 = paramRectF.bottom - paramFloat;
    Object localObject = paramCanvas;
    paramCanvas.drawRect(f2, f3, f7, f8, paramPaint);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\CardViewBaseImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */