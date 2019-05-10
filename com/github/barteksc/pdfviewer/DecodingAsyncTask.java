package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.source.DocumentSource;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

class DecodingAsyncTask
  extends AsyncTask
{
  private boolean cancelled;
  private Context context;
  private DocumentSource docSource;
  private int firstPageIdx;
  private int pageHeight;
  private int pageWidth;
  private String password;
  private PdfDocument pdfDocument;
  private PDFView pdfView;
  private PdfiumCore pdfiumCore;
  
  DecodingAsyncTask(DocumentSource paramDocumentSource, String paramString, PDFView paramPDFView, PdfiumCore paramPdfiumCore, int paramInt)
  {
    this.docSource = paramDocumentSource;
    this.firstPageIdx = paramInt;
    this.cancelled = false;
    this.pdfView = paramPDFView;
    this.password = paramString;
    this.pdfiumCore = paramPdfiumCore;
    Context localContext = paramPDFView.getContext();
    this.context = localContext;
  }
  
  protected Throwable doInBackground(Void... paramVarArgs)
  {
    try
    {
      localObject1 = this.docSource;
      Object localObject3 = this.context;
      PdfiumCore localPdfiumCore = this.pdfiumCore;
      String str = this.password;
      localObject1 = ((DocumentSource)localObject1).createDocument((Context)localObject3, localPdfiumCore, str);
      this.pdfDocument = ((PdfDocument)localObject1);
      localObject1 = this.pdfiumCore;
      localObject3 = this.pdfDocument;
      int i = this.firstPageIdx;
      ((PdfiumCore)localObject1).openPage((PdfDocument)localObject3, i);
      localObject1 = this.pdfiumCore;
      localObject3 = this.pdfDocument;
      i = this.firstPageIdx;
      int j = ((PdfiumCore)localObject1).getPageWidth((PdfDocument)localObject3, i);
      this.pageWidth = j;
      localObject1 = this.pdfiumCore;
      localObject3 = this.pdfDocument;
      i = this.firstPageIdx;
      j = ((PdfiumCore)localObject1).getPageHeight((PdfDocument)localObject3, i);
      this.pageHeight = j;
      j = 0;
      localObject1 = null;
    }
    finally
    {
      Object localObject1;
      for (;;) {}
    }
    return (Throwable)localObject1;
  }
  
  protected void onCancelled()
  {
    this.cancelled = true;
  }
  
  protected void onPostExecute(Throwable paramThrowable)
  {
    PDFView localPDFView;
    if (paramThrowable != null)
    {
      localPDFView = this.pdfView;
      localPDFView.loadError(paramThrowable);
    }
    for (;;)
    {
      return;
      boolean bool = this.cancelled;
      if (!bool)
      {
        localPDFView = this.pdfView;
        PdfDocument localPdfDocument = this.pdfDocument;
        int i = this.pageWidth;
        int j = this.pageHeight;
        localPDFView.loadComplete(localPdfDocument, i, j);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\DecodingAsyncTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */