package com.sun.pdfview;

import android.graphics.RectF;

class PDFImageCmd
  extends PDFCmd
{
  PDFImage image;
  
  public PDFImageCmd(PDFImage paramPDFImage)
  {
    this.image = paramPDFImage;
  }
  
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    PDFImage localPDFImage = this.image;
    return paramPDFRenderer.drawImage(localPDFImage);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFImageCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */