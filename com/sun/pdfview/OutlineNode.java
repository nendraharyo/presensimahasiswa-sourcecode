package com.sun.pdfview;

import a.a.a;
import com.sun.pdfview.action.PDFAction;

public class OutlineNode
  extends a
{
  private String title;
  
  public OutlineNode(String paramString)
  {
    this.title = paramString;
  }
  
  public PDFAction getAction()
  {
    return (PDFAction)getUserObject();
  }
  
  public void setAction(PDFAction paramPDFAction)
  {
    setUserObject(paramPDFAction);
  }
  
  public String toString()
  {
    return this.title;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\OutlineNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */