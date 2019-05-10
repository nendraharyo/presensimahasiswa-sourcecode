package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.github.barteksc.pdfviewer.util.FileUtils;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

public class AssetSource
  implements DocumentSource
{
  private final String assetName;
  
  public AssetSource(String paramString)
  {
    this.assetName = paramString;
  }
  
  public PdfDocument createDocument(Context paramContext, PdfiumCore paramPdfiumCore, String paramString)
  {
    Object localObject = this.assetName;
    localObject = ParcelFileDescriptor.open(FileUtils.fileFromAsset(paramContext, (String)localObject), 268435456);
    return paramPdfiumCore.newDocument((ParcelFileDescriptor)localObject, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\source\AssetSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */