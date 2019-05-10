package com.sun.pdfview;

import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Rect;

class PDFRenderer$GraphicsState
  implements Cloneable
{
  Paint.Cap cap;
  Rect cliprgn;
  PDFPaint fillPaint;
  Paint.Join join;
  float lineWidth;
  float miterLimit;
  PDFPaint strokePaint;
  Matrix xform;
  
  PDFRenderer$GraphicsState(PDFRenderer paramPDFRenderer) {}
  
  public Object clone()
  {
    GraphicsState localGraphicsState = new com/sun/pdfview/PDFRenderer$GraphicsState;
    Object localObject = this.this$0;
    localGraphicsState.<init>((PDFRenderer)localObject);
    localGraphicsState.cliprgn = null;
    localObject = this.cap;
    localGraphicsState.cap = ((Paint.Cap)localObject);
    localObject = this.join;
    localGraphicsState.join = ((Paint.Join)localObject);
    localObject = this.strokePaint;
    localGraphicsState.strokePaint = ((PDFPaint)localObject);
    localObject = this.fillPaint;
    localGraphicsState.fillPaint = ((PDFPaint)localObject);
    localObject = new android/graphics/Matrix;
    Matrix localMatrix = this.xform;
    ((Matrix)localObject).<init>(localMatrix);
    localGraphicsState.xform = ((Matrix)localObject);
    float f = this.lineWidth;
    localGraphicsState.lineWidth = f;
    f = this.miterLimit;
    localGraphicsState.miterLimit = f;
    return localGraphicsState;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFRenderer$GraphicsState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */