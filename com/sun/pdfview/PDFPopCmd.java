package com.sun.pdfview;

import android.graphics.RectF;

class PDFPopCmd
  extends PDFCmd
{
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    paramPDFRenderer.pop();
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFPopCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */