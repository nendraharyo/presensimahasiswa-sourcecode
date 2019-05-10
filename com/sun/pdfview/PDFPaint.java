package com.sun.pdfview;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;

public class PDFPaint
{
  public static boolean s_doAntiAlias = false;
  private Paint mainPaint;
  
  protected PDFPaint(int paramInt)
  {
    Paint localPaint = new android/graphics/Paint;
    localPaint.<init>();
    this.mainPaint = localPaint;
    this.mainPaint.setColor(paramInt);
    localPaint = this.mainPaint;
    boolean bool = s_doAntiAlias;
    localPaint.setAntiAlias(bool);
  }
  
  public static PDFPaint getColorPaint(int paramInt)
  {
    PDFPaint localPDFPaint = new com/sun/pdfview/PDFPaint;
    localPDFPaint.<init>(paramInt);
    Paint localPaint = localPDFPaint.getPaint();
    Paint.Style localStyle = Paint.Style.STROKE;
    localPaint.setStyle(localStyle);
    return localPDFPaint;
  }
  
  public static PDFPaint getPaint(int paramInt)
  {
    PDFPaint localPDFPaint = new com/sun/pdfview/PDFPaint;
    localPDFPaint.<init>(paramInt);
    Paint localPaint = localPDFPaint.getPaint();
    Paint.Style localStyle = Paint.Style.FILL;
    localPaint.setStyle(localStyle);
    return localPDFPaint;
  }
  
  public RectF fill(PDFRenderer paramPDFRenderer, Canvas paramCanvas, Path paramPath)
  {
    Object localObject = this.mainPaint;
    paramCanvas.drawPath(paramPath, (Paint)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>();
    paramPath.computeBounds((RectF)localObject, false);
    paramCanvas.getMatrix().mapRect(localRectF, (RectF)localObject);
    return (RectF)localObject;
  }
  
  public Paint getPaint()
  {
    return this.mainPaint;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFPaint.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */