package com.sun.pdfview.action;

import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;

public class PDFAction
{
  private PDFObject next;
  private String type;
  
  public PDFAction(String paramString)
  {
    this.type = paramString;
  }
  
  public static PDFAction getAction(PDFObject paramPDFObject1, PDFObject paramPDFObject2)
  {
    Object localObject1 = paramPDFObject1.getDictRef("S");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("No action type in object: ");
      localObject2 = paramPDFObject1;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = ((PDFObject)localObject1).getStringValue();
    Object localObject2 = "GoTo";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = new com/sun/pdfview/action/GoToAction;
      ((GoToAction)localObject1).<init>(paramPDFObject1, paramPDFObject2);
      localObject2 = paramPDFObject1.getDictRef("Next");
      if (localObject2 != null) {
        ((PDFAction)localObject1).setNext((PDFObject)localObject2);
      }
      return (PDFAction)localObject1;
    }
    localObject2 = new com/sun/pdfview/PDFParseException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Unknown Action type: ");
    localObject1 = (String)localObject1;
    ((PDFParseException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public PDFObject getNext()
  {
    return this.next;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setNext(PDFObject paramPDFObject)
  {
    this.next = paramPDFObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\action\PDFAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */