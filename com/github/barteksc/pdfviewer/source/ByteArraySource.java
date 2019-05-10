package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

public class ByteArraySource
  implements DocumentSource
{
  private byte[] data;
  
  public ByteArraySource(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }
  
  public PdfDocument createDocument(Context paramContext, PdfiumCore paramPdfiumCore, String paramString)
  {
    byte[] arrayOfByte = this.data;
    return paramPdfiumCore.newDocument(arrayOfByte, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\source\ByteArraySource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */