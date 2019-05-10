package com.sun.pdfview.action;

import com.sun.pdfview.PDFDestination;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;

public class GoToAction
  extends PDFAction
{
  private PDFDestination dest;
  
  public GoToAction(PDFDestination paramPDFDestination)
  {
    super("GoTo");
    this.dest = paramPDFDestination;
  }
  
  public GoToAction(PDFObject paramPDFObject1, PDFObject paramPDFObject2)
  {
    super("GoTo");
    Object localObject1 = paramPDFObject1.getDictRef("D");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("No destination in GoTo action ");
      localObject2 = paramPDFObject1;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = PDFDestination.getDestination((PDFObject)localObject1, paramPDFObject2);
    this.dest = ((PDFDestination)localObject1);
  }
  
  public PDFDestination getDestination()
  {
    return this.dest;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\action\GoToAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */