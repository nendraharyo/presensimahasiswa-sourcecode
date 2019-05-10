package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import com.github.barteksc.pdfviewer.util.Util;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.InputStream;

public class InputStreamSource
  implements DocumentSource
{
  private InputStream inputStream;
  
  public InputStreamSource(InputStream paramInputStream)
  {
    this.inputStream = paramInputStream;
  }
  
  public PdfDocument createDocument(Context paramContext, PdfiumCore paramPdfiumCore, String paramString)
  {
    byte[] arrayOfByte = Util.toByteArray(this.inputStream);
    return paramPdfiumCore.newDocument(arrayOfByte, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\source\InputStreamSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */