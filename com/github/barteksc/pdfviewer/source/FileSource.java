package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;

public class FileSource
  implements DocumentSource
{
  private File file;
  
  public FileSource(File paramFile)
  {
    this.file = paramFile;
  }
  
  public PdfDocument createDocument(Context paramContext, PdfiumCore paramPdfiumCore, String paramString)
  {
    ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(this.file, 268435456);
    return paramPdfiumCore.newDocument(localParcelFileDescriptor, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\source\FileSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */