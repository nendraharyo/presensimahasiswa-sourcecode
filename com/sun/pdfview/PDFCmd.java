package com.sun.pdfview;

import android.graphics.RectF;

public abstract class PDFCmd
{
  public abstract RectF execute(PDFRenderer paramPDFRenderer);
  
  public String getDetails()
  {
    return super.toString();
  }
  
  public String toString()
  {
    String str = getClass().getName();
    int i = str.lastIndexOf('.');
    if (i >= 0)
    {
      i += 1;
      str = str.substring(i);
    }
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */