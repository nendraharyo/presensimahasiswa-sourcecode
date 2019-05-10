package com.sun.pdfview;

import android.graphics.RectF;

class PDFStrokePaintCmd
  extends PDFCmd
{
  PDFPaint p;
  
  public PDFStrokePaintCmd(PDFPaint paramPDFPaint)
  {
    this.p = paramPDFPaint;
  }
  
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    PDFPaint localPDFPaint = this.p;
    paramPDFRenderer.setStrokePaint(localPDFPaint);
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFStrokePaintCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */