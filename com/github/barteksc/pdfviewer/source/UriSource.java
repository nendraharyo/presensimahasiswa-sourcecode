package com.github.barteksc.pdfviewer.source;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

public class UriSource
  implements DocumentSource
{
  private Uri uri;
  
  public UriSource(Uri paramUri)
  {
    this.uri = paramUri;
  }
  
  public PdfDocument createDocument(Context paramContext, PdfiumCore paramPdfiumCore, String paramString)
  {
    Object localObject = paramContext.getContentResolver();
    Uri localUri = this.uri;
    localObject = ((ContentResolver)localObject).openFileDescriptor(localUri, "r");
    return paramPdfiumCore.newDocument((ParcelFileDescriptor)localObject, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\source\UriSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */