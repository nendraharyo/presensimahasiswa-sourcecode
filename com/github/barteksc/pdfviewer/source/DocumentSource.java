package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

public abstract interface DocumentSource
{
  public abstract PdfDocument createDocument(Context paramContext, PdfiumCore paramPdfiumCore, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\source\DocumentSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */