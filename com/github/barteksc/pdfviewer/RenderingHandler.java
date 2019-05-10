package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.github.barteksc.pdfviewer.model.PagePart;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.util.HashSet;
import java.util.Set;

class RenderingHandler
  extends Handler
{
  static final int MSG_RENDER_TASK = 1;
  private final Set openedPages;
  private PdfDocument pdfDocument;
  private PDFView pdfView;
  private PdfiumCore pdfiumCore;
  private RectF renderBounds;
  private Matrix renderMatrix;
  private Rect roundedRenderBounds;
  private boolean running;
  
  RenderingHandler(Looper paramLooper, PDFView paramPDFView, PdfiumCore paramPdfiumCore, PdfDocument paramPdfDocument)
  {
    super(paramLooper);
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.renderBounds = ((RectF)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.roundedRenderBounds = ((Rect)localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.renderMatrix = ((Matrix)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.openedPages = ((Set)localObject);
    this.running = false;
    this.pdfView = paramPDFView;
    this.pdfiumCore = paramPdfiumCore;
    this.pdfDocument = paramPdfDocument;
  }
  
  private void calculateBounds(int paramInt1, int paramInt2, RectF paramRectF)
  {
    float f1 = 1.0F;
    this.renderMatrix.reset();
    Object localObject1 = this.renderMatrix;
    float f2 = -paramRectF.left;
    float f3 = paramInt1;
    f2 *= f3;
    f3 = -paramRectF.top;
    float f4 = paramInt2;
    f3 *= f4;
    ((Matrix)localObject1).postTranslate(f2, f3);
    localObject1 = this.renderMatrix;
    f2 = paramRectF.width();
    f2 = f1 / f2;
    f3 = paramRectF.height();
    f3 = f1 / f3;
    ((Matrix)localObject1).postScale(f2, f3);
    localObject1 = this.renderBounds;
    f2 = paramInt1;
    f3 = paramInt2;
    ((RectF)localObject1).set(0.0F, 0.0F, f2, f3);
    localObject1 = this.renderMatrix;
    Object localObject2 = this.renderBounds;
    ((Matrix)localObject1).mapRect((RectF)localObject2);
    localObject1 = this.renderBounds;
    localObject2 = this.roundedRenderBounds;
    ((RectF)localObject1).round((Rect)localObject2);
  }
  
  private PagePart proceed(RenderingHandler.RenderingTask paramRenderingTask)
  {
    Object localObject1 = this.openedPages;
    int i = paramRenderingTask.page;
    Object localObject2 = Integer.valueOf(i);
    boolean bool1 = ((Set)localObject1).contains(localObject2);
    if (!bool1)
    {
      localObject1 = this.openedPages;
      i = paramRenderingTask.page;
      localObject2 = Integer.valueOf(i);
      ((Set)localObject1).add(localObject2);
      localObject1 = this.pdfiumCore;
      localObject2 = this.pdfDocument;
      int j = paramRenderingTask.page;
      ((PdfiumCore)localObject1).openPage((PdfDocument)localObject2, j);
    }
    i = Math.round(paramRenderingTask.width);
    float f1 = paramRenderingTask.height;
    k = Math.round(f1);
    for (;;)
    {
      try
      {
        bool1 = paramRenderingTask.bestQuality;
        if (!bool1) {
          continue;
        }
        localObject1 = Bitmap.Config.ARGB_8888;
        Bitmap localBitmap = Bitmap.createBitmap(i, k, (Bitmap.Config)localObject1);
        localObject1 = paramRenderingTask.bounds;
        calculateBounds(i, k, (RectF)localObject1);
        localObject1 = this.pdfiumCore;
        localObject2 = this.pdfDocument;
        k = paramRenderingTask.page;
        Rect localRect1 = this.roundedRenderBounds;
        int m = localRect1.left;
        Rect localRect2 = this.roundedRenderBounds;
        int n = localRect2.top;
        int i1 = this.roundedRenderBounds.width();
        Rect localRect3 = this.roundedRenderBounds;
        int i2 = localRect3.height();
        boolean bool2 = paramRenderingTask.annotationRendering;
        ((PdfiumCore)localObject1).renderPageBitmap((PdfDocument)localObject2, localBitmap, k, m, n, i1, i2, bool2);
        localPagePart = new com/github/barteksc/pdfviewer/model/PagePart;
        m = paramRenderingTask.userPage;
        n = paramRenderingTask.page;
        float f2 = paramRenderingTask.width;
        float f3 = paramRenderingTask.height;
        RectF localRectF = paramRenderingTask.bounds;
        boolean bool3 = paramRenderingTask.thumbnail;
        int i3 = paramRenderingTask.cacheOrder;
        localPagePart.<init>(m, n, localBitmap, f2, f3, localRectF, bool3, i3);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localIllegalArgumentException.printStackTrace();
        k = 0;
        PagePart localPagePart = null;
        continue;
      }
      return localPagePart;
      localObject1 = Bitmap.Config.RGB_565;
    }
  }
  
  void addRenderingTask(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, RectF paramRectF, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject = new com/github/barteksc/pdfviewer/RenderingHandler$RenderingTask;
    ((RenderingHandler.RenderingTask)localObject).<init>(this, paramFloat1, paramFloat2, paramRectF, paramInt1, paramInt2, paramBoolean1, paramInt3, paramBoolean2, paramBoolean3);
    localObject = obtainMessage(1, localObject);
    sendMessage((Message)localObject);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject = (RenderingHandler.RenderingTask)paramMessage.obj;
    localObject = proceed((RenderingHandler.RenderingTask)localObject);
    if (localObject != null)
    {
      boolean bool = this.running;
      if (!bool) {
        break label54;
      }
      PDFView localPDFView = this.pdfView;
      RenderingHandler.1 local1 = new com/github/barteksc/pdfviewer/RenderingHandler$1;
      local1.<init>(this, (PagePart)localObject);
      localPDFView.post(local1);
    }
    for (;;)
    {
      return;
      label54:
      localObject = ((PagePart)localObject).getRenderedBitmap();
      ((Bitmap)localObject).recycle();
    }
  }
  
  void start()
  {
    this.running = true;
  }
  
  void stop()
  {
    this.running = false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\RenderingHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */