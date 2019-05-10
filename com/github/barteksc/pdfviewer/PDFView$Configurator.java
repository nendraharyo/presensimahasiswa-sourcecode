package com.github.barteksc.pdfviewer;

import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;
import com.github.barteksc.pdfviewer.source.DocumentSource;

public class PDFView$Configurator
{
  private boolean annotationRendering;
  private boolean antialiasing;
  private int defaultPage;
  private final DocumentSource documentSource;
  private boolean enableDoubletap;
  private boolean enableSwipe;
  private OnDrawListener onDrawAllListener;
  private OnDrawListener onDrawListener;
  private OnErrorListener onErrorListener;
  private OnLoadCompleteListener onLoadCompleteListener;
  private OnPageChangeListener onPageChangeListener;
  private OnPageScrollListener onPageScrollListener;
  private OnRenderListener onRenderListener;
  private OnTapListener onTapListener;
  private int[] pageNumbers = null;
  private String password;
  private ScrollHandle scrollHandle;
  private int spacing;
  private boolean swipeHorizontal;
  
  private PDFView$Configurator(PDFView paramPDFView, DocumentSource paramDocumentSource)
  {
    this.enableSwipe = bool;
    this.enableDoubletap = bool;
    this.defaultPage = 0;
    this.swipeHorizontal = false;
    this.annotationRendering = false;
    this.password = null;
    this.scrollHandle = null;
    this.antialiasing = bool;
    this.spacing = 0;
    this.documentSource = paramDocumentSource;
  }
  
  public Configurator defaultPage(int paramInt)
  {
    this.defaultPage = paramInt;
    return this;
  }
  
  public Configurator enableAnnotationRendering(boolean paramBoolean)
  {
    this.annotationRendering = paramBoolean;
    return this;
  }
  
  public Configurator enableAntialiasing(boolean paramBoolean)
  {
    this.antialiasing = paramBoolean;
    return this;
  }
  
  public Configurator enableDoubletap(boolean paramBoolean)
  {
    this.enableDoubletap = paramBoolean;
    return this;
  }
  
  public Configurator enableSwipe(boolean paramBoolean)
  {
    this.enableSwipe = paramBoolean;
    return this;
  }
  
  public void load()
  {
    this.this$0.recycle();
    Object localObject1 = this.this$0;
    Object localObject2 = this.onDrawListener;
    PDFView.access$100((PDFView)localObject1, (OnDrawListener)localObject2);
    localObject1 = this.this$0;
    localObject2 = this.onDrawAllListener;
    PDFView.access$200((PDFView)localObject1, (OnDrawListener)localObject2);
    localObject1 = this.this$0;
    localObject2 = this.onPageChangeListener;
    PDFView.access$300((PDFView)localObject1, (OnPageChangeListener)localObject2);
    localObject1 = this.this$0;
    localObject2 = this.onPageScrollListener;
    PDFView.access$400((PDFView)localObject1, (OnPageScrollListener)localObject2);
    localObject1 = this.this$0;
    localObject2 = this.onRenderListener;
    PDFView.access$500((PDFView)localObject1, (OnRenderListener)localObject2);
    localObject1 = this.this$0;
    localObject2 = this.onTapListener;
    PDFView.access$600((PDFView)localObject1, (OnTapListener)localObject2);
    localObject1 = this.this$0;
    boolean bool1 = this.enableSwipe;
    ((PDFView)localObject1).enableSwipe(bool1);
    localObject1 = this.this$0;
    bool1 = this.enableDoubletap;
    ((PDFView)localObject1).enableDoubletap(bool1);
    localObject1 = this.this$0;
    int i = this.defaultPage;
    PDFView.access$700((PDFView)localObject1, i);
    localObject2 = this.this$0;
    boolean bool4 = this.swipeHorizontal;
    String str;
    OnLoadCompleteListener localOnLoadCompleteListener;
    OnErrorListener localOnErrorListener;
    if (!bool4)
    {
      bool4 = true;
      ((PDFView)localObject2).setSwipeVertical(bool4);
      localObject1 = this.this$0;
      boolean bool2 = this.annotationRendering;
      ((PDFView)localObject1).enableAnnotationRendering(bool2);
      localObject1 = this.this$0;
      localObject2 = this.scrollHandle;
      PDFView.access$800((PDFView)localObject1, (ScrollHandle)localObject2);
      localObject1 = this.this$0;
      bool2 = this.antialiasing;
      ((PDFView)localObject1).enableAntialiasing(bool2);
      localObject1 = this.this$0;
      int j = this.spacing;
      PDFView.access$900((PDFView)localObject1, j);
      localObject1 = PDFView.access$1100(this.this$0);
      localObject2 = this.this$0;
      boolean bool3 = PDFView.access$1000((PDFView)localObject2);
      ((DragPinchManager)localObject1).setSwipeVertical(bool3);
      localObject1 = this.pageNumbers;
      if (localObject1 == null) {
        break label315;
      }
      localObject1 = this.this$0;
      localObject2 = this.documentSource;
      str = this.password;
      localOnLoadCompleteListener = this.onLoadCompleteListener;
      localOnErrorListener = this.onErrorListener;
      int[] arrayOfInt = this.pageNumbers;
      PDFView.access$1200((PDFView)localObject1, (DocumentSource)localObject2, str, localOnLoadCompleteListener, localOnErrorListener, arrayOfInt);
    }
    for (;;)
    {
      return;
      bool4 = false;
      localObject1 = null;
      break;
      label315:
      localObject1 = this.this$0;
      localObject2 = this.documentSource;
      str = this.password;
      localOnLoadCompleteListener = this.onLoadCompleteListener;
      localOnErrorListener = this.onErrorListener;
      PDFView.access$1300((PDFView)localObject1, (DocumentSource)localObject2, str, localOnLoadCompleteListener, localOnErrorListener);
    }
  }
  
  public Configurator onDraw(OnDrawListener paramOnDrawListener)
  {
    this.onDrawListener = paramOnDrawListener;
    return this;
  }
  
  public Configurator onDrawAll(OnDrawListener paramOnDrawListener)
  {
    this.onDrawAllListener = paramOnDrawListener;
    return this;
  }
  
  public Configurator onError(OnErrorListener paramOnErrorListener)
  {
    this.onErrorListener = paramOnErrorListener;
    return this;
  }
  
  public Configurator onLoad(OnLoadCompleteListener paramOnLoadCompleteListener)
  {
    this.onLoadCompleteListener = paramOnLoadCompleteListener;
    return this;
  }
  
  public Configurator onPageChange(OnPageChangeListener paramOnPageChangeListener)
  {
    this.onPageChangeListener = paramOnPageChangeListener;
    return this;
  }
  
  public Configurator onPageScroll(OnPageScrollListener paramOnPageScrollListener)
  {
    this.onPageScrollListener = paramOnPageScrollListener;
    return this;
  }
  
  public Configurator onRender(OnRenderListener paramOnRenderListener)
  {
    this.onRenderListener = paramOnRenderListener;
    return this;
  }
  
  public Configurator onTap(OnTapListener paramOnTapListener)
  {
    this.onTapListener = paramOnTapListener;
    return this;
  }
  
  public Configurator pages(int... paramVarArgs)
  {
    this.pageNumbers = paramVarArgs;
    return this;
  }
  
  public Configurator password(String paramString)
  {
    this.password = paramString;
    return this;
  }
  
  public Configurator scrollHandle(ScrollHandle paramScrollHandle)
  {
    this.scrollHandle = paramScrollHandle;
    return this;
  }
  
  public Configurator spacing(int paramInt)
  {
    this.spacing = paramInt;
    return this;
  }
  
  public Configurator swipeHorizontal(boolean paramBoolean)
  {
    this.swipeHorizontal = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\PDFView$Configurator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */