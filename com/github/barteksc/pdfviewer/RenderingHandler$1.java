package com.github.barteksc.pdfviewer;

import com.github.barteksc.pdfviewer.model.PagePart;

class RenderingHandler$1
  implements Runnable
{
  RenderingHandler$1(RenderingHandler paramRenderingHandler, PagePart paramPagePart) {}
  
  public void run()
  {
    PDFView localPDFView = RenderingHandler.access$000(this.this$0);
    PagePart localPagePart = this.val$part;
    localPDFView.onBitmapRendered(localPagePart);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\RenderingHandler$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */