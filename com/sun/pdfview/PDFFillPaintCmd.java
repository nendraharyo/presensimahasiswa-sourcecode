package com.sun.pdfview;

import android.graphics.RectF;

class PDFFillPaintCmd
  extends PDFCmd
{
  PDFPaint p;
  
  public PDFFillPaintCmd(PDFPaint paramPDFPaint)
  {
    this.p = paramPDFPaint;
  }
  
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    PDFPaint localPDFPaint = this.p;
    paramPDFRenderer.setFillPaint(localPDFPaint);
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFFillPaintCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */