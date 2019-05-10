package com.sun.pdfview;

import java.io.IOException;

public class PDFParseException
  extends IOException
{
  public PDFParseException(String paramString)
  {
    super(paramString);
  }
  
  public PDFParseException(String paramString, Throwable paramThrowable)
  {
    this(paramString);
    initCause(paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFParseException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */