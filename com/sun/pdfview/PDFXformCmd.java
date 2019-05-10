package com.sun.pdfview;

import android.graphics.Matrix;
import android.graphics.RectF;

class PDFXformCmd
  extends PDFCmd
{
  Matrix mat;
  
  public PDFXformCmd(Matrix paramMatrix)
  {
    if (paramMatrix == null)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Null transform in PDFXformCmd");
      throw localRuntimeException;
    }
    this.mat = paramMatrix;
  }
  
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    Matrix localMatrix = this.mat;
    paramPDFRenderer.transform(localMatrix);
    return null;
  }
  
  public String getDetails()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    localStringBuffer.append("PDFXformCommand: \n");
    String str = this.mat.toString();
    localStringBuffer.append(str);
    return localStringBuffer.toString();
  }
  
  public String toString(PDFRenderer paramPDFRenderer)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("PDFXformCmd: ");
    Matrix localMatrix = this.mat;
    return localMatrix;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFXformCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */