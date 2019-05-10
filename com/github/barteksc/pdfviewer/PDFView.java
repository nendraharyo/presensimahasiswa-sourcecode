package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.model.PagePart;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;
import com.github.barteksc.pdfviewer.source.AssetSource;
import com.github.barteksc.pdfviewer.source.ByteArraySource;
import com.github.barteksc.pdfviewer.source.DocumentSource;
import com.github.barteksc.pdfviewer.source.FileSource;
import com.github.barteksc.pdfviewer.source.InputStreamSource;
import com.github.barteksc.pdfviewer.source.UriSource;
import com.github.barteksc.pdfviewer.util.ArrayUtils;
import com.github.barteksc.pdfviewer.util.Constants;
import com.github.barteksc.pdfviewer.util.MathUtils;
import com.github.barteksc.pdfviewer.util.Util;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfDocument.Meta;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class PDFView
  extends RelativeLayout
{
  public static final float DEFAULT_MAX_SCALE = 3.0F;
  public static final float DEFAULT_MID_SCALE = 1.75F;
  public static final float DEFAULT_MIN_SCALE = 1.0F;
  private static final String TAG = PDFView.class.getSimpleName();
  private AnimationManager animationManager;
  private boolean annotationRendering;
  private PaintFlagsDrawFilter antialiasFilter;
  private boolean bestQuality;
  CacheManager cacheManager;
  private int currentFilteredPage;
  private int currentPage;
  private float currentXOffset;
  private float currentYOffset;
  private Paint debugPaint;
  private DecodingAsyncTask decodingAsyncTask;
  private int defaultPage;
  private int documentPageCount;
  private DragPinchManager dragPinchManager;
  private boolean enableAntialiasing;
  private int[] filteredUserPageIndexes;
  private int[] filteredUserPages;
  private boolean isScrollHandleInit;
  private float maxZoom;
  private float midZoom;
  private float minZoom;
  private OnDrawListener onDrawAllListener;
  private OnDrawListener onDrawListener;
  private List onDrawPagesNums;
  private OnErrorListener onErrorListener;
  private OnLoadCompleteListener onLoadCompleteListener;
  private OnPageChangeListener onPageChangeListener;
  private OnPageScrollListener onPageScrollListener;
  private OnRenderListener onRenderListener;
  private OnTapListener onTapListener;
  private float optimalPageHeight;
  private float optimalPageWidth;
  private int[] originalUserPages;
  private int pageHeight;
  private int pageWidth;
  private PagesLoader pagesLoader;
  private Paint paint;
  private PdfDocument pdfDocument;
  private PdfiumCore pdfiumCore;
  private boolean recycled;
  private boolean renderDuringScale;
  RenderingHandler renderingHandler;
  private final HandlerThread renderingHandlerThread;
  private PDFView.ScrollDir scrollDir;
  private ScrollHandle scrollHandle;
  private int spacingPx;
  private PDFView.State state;
  private boolean swipeVertical;
  private float zoom;
  
  public PDFView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.minZoom = f1;
    this.midZoom = 1.75F;
    float f2 = 3.0F;
    this.maxZoom = f2;
    Object localObject1 = PDFView.ScrollDir.NONE;
    this.scrollDir = ((PDFView.ScrollDir)localObject1);
    this.currentXOffset = 0.0F;
    this.currentYOffset = 0.0F;
    this.zoom = f1;
    this.recycled = i;
    localObject1 = PDFView.State.DEFAULT;
    this.state = ((PDFView.State)localObject1);
    this.defaultPage = 0;
    this.swipeVertical = i;
    this.isScrollHandleInit = false;
    this.bestQuality = false;
    this.annotationRendering = false;
    this.renderDuringScale = false;
    this.enableAntialiasing = i;
    localObject1 = new android/graphics/PaintFlagsDrawFilter;
    ((PaintFlagsDrawFilter)localObject1).<init>(0, 3);
    this.antialiasFilter = ((PaintFlagsDrawFilter)localObject1);
    this.spacingPx = 0;
    localObject1 = new java/util/ArrayList;
    i = 10;
    ((ArrayList)localObject1).<init>(i);
    this.onDrawPagesNums = ((List)localObject1);
    localObject1 = new android/os/HandlerThread;
    Object localObject2 = "PDF renderer";
    ((HandlerThread)localObject1).<init>((String)localObject2);
    this.renderingHandlerThread = ((HandlerThread)localObject1);
    boolean bool = isInEditMode();
    if (bool) {}
    for (;;)
    {
      return;
      localObject1 = new com/github/barteksc/pdfviewer/CacheManager;
      ((CacheManager)localObject1).<init>();
      this.cacheManager = ((CacheManager)localObject1);
      localObject1 = new com/github/barteksc/pdfviewer/AnimationManager;
      ((AnimationManager)localObject1).<init>(this);
      this.animationManager = ((AnimationManager)localObject1);
      localObject1 = new com/github/barteksc/pdfviewer/DragPinchManager;
      localObject2 = this.animationManager;
      ((DragPinchManager)localObject1).<init>(this, (AnimationManager)localObject2);
      this.dragPinchManager = ((DragPinchManager)localObject1);
      localObject1 = new android/graphics/Paint;
      ((Paint)localObject1).<init>();
      this.paint = ((Paint)localObject1);
      localObject1 = new android/graphics/Paint;
      ((Paint)localObject1).<init>();
      this.debugPaint = ((Paint)localObject1);
      localObject1 = this.debugPaint;
      localObject2 = Paint.Style.STROKE;
      ((Paint)localObject1).setStyle((Paint.Style)localObject2);
      localObject1 = new com/shockwave/pdfium/PdfiumCore;
      ((PdfiumCore)localObject1).<init>(paramContext);
      this.pdfiumCore = ((PdfiumCore)localObject1);
      setWillNotDraw(false);
    }
  }
  
  private float calculateCenterOffsetForPage(int paramInt)
  {
    float f1 = 2.0F;
    boolean bool = this.swipeVertical;
    float f2;
    float f3;
    int i;
    float f4;
    if (bool)
    {
      f2 = paramInt;
      f3 = this.optimalPageHeight;
      f2 *= f3;
      f3 = this.spacingPx * paramInt;
      f2 = -(f2 + f3);
      i = getHeight() / 2;
      f3 = i;
      f4 = this.optimalPageHeight / f1;
      f3 -= f4;
    }
    for (f2 += f3;; f2 += f3)
    {
      return f2;
      f2 = paramInt;
      f3 = this.optimalPageWidth;
      f2 *= f3;
      f3 = this.spacingPx * paramInt;
      f2 = -(f2 + f3);
      i = getWidth() / 2;
      f3 = i;
      f4 = this.optimalPageWidth / f1;
      f3 -= f4;
    }
  }
  
  private void calculateOptimalWidthAndHeight()
  {
    PDFView.State localState1 = this.state;
    PDFView.State localState2 = PDFView.State.DEFAULT;
    if (localState1 != localState2)
    {
      i = getWidth();
      if (i != 0) {}
    }
    else
    {
      return;
    }
    float f1 = getWidth();
    int i = getHeight();
    float f2 = i;
    int j = this.pageWidth;
    float f3 = j;
    int k = this.pageHeight;
    float f4 = k;
    f4 = f3 / f4;
    double d1 = Math.floor(f1 / f4);
    f3 = (float)d1;
    boolean bool = f3 < f2;
    double d2;
    if (bool) {
      d2 = Math.floor(f2 * f4);
    }
    for (f3 = (float)d2;; f3 = f1)
    {
      this.optimalPageWidth = f3;
      this.optimalPageHeight = f2;
      break;
      f2 = f3;
    }
  }
  
  private float calculatePageOffset(int paramInt)
  {
    boolean bool = this.swipeVertical;
    float f2;
    int i;
    if (bool)
    {
      f1 = paramInt;
      f2 = this.optimalPageHeight;
      f1 *= f2;
      i = this.spacingPx * paramInt;
      f2 = i;
      f1 += f2;
    }
    for (float f1 = toCurrentScale(f1);; f1 = toCurrentScale(f1))
    {
      return f1;
      f1 = paramInt;
      f2 = this.optimalPageWidth;
      f1 *= f2;
      i = this.spacingPx * paramInt;
      f2 = i;
      f1 += f2;
    }
  }
  
  private int determineValidPageNumberFrom(int paramInt)
  {
    if (paramInt <= 0) {
      paramInt = 0;
    }
    for (;;)
    {
      return paramInt;
      int[] arrayOfInt = this.originalUserPages;
      int i;
      if (arrayOfInt != null)
      {
        arrayOfInt = this.originalUserPages;
        i = arrayOfInt.length;
        if (paramInt >= i)
        {
          arrayOfInt = this.originalUserPages;
          i = arrayOfInt.length;
          paramInt = i + -1;
        }
      }
      else
      {
        i = this.documentPageCount;
        if (paramInt >= i)
        {
          i = this.documentPageCount;
          paramInt = i + -1;
        }
      }
    }
  }
  
  private void drawPart(Canvas paramCanvas, PagePart paramPagePart)
  {
    int i = 0;
    float f1 = 0.0F;
    boolean bool1 = false;
    float f2 = 0.0F;
    Paint localPaint = null;
    Object localObject = paramPagePart.getPageRelativeBounds();
    Bitmap localBitmap = paramPagePart.getRenderedBitmap();
    boolean bool2 = localBitmap.isRecycled();
    if (bool2) {
      return;
    }
    bool2 = this.swipeVertical;
    int k;
    float f3;
    float f4;
    if (bool2)
    {
      k = paramPagePart.getUserPage();
      f3 = calculatePageOffset(k);
      f4 = 0.0F;
    }
    Rect localRect;
    RectF localRectF;
    for (;;)
    {
      paramCanvas.translate(f4, f3);
      localRect = new android/graphics/Rect;
      int m = localBitmap.getWidth();
      int n = localBitmap.getHeight();
      localRect.<init>(0, 0, m, n);
      float f5 = ((RectF)localObject).left;
      float f6 = this.optimalPageWidth;
      f5 *= f6;
      f5 = toCurrentScale(f5);
      f6 = ((RectF)localObject).top;
      f1 = this.optimalPageHeight;
      f6 *= f1;
      f6 = toCurrentScale(f6);
      f1 = ((RectF)localObject).width();
      float f7 = this.optimalPageWidth;
      f1 *= f7;
      f1 = toCurrentScale(f1);
      float f8 = ((RectF)localObject).height();
      f7 = this.optimalPageHeight;
      f8 *= f7;
      f8 = toCurrentScale(f8);
      localRectF = new android/graphics/RectF;
      int i2 = (int)f5;
      float f9 = i2;
      int i3 = (int)f6;
      float f10 = i3;
      m = (int)(f5 + f1);
      f5 = m;
      int i4 = (int)(f8 + f6);
      f8 = i4;
      localRectF.<init>(f9, f10, f5, f8);
      f8 = this.currentXOffset + f4;
      f5 = this.currentYOffset + f3;
      f6 = localRectF.left + f8;
      i = getWidth();
      f1 = i;
      boolean bool3 = f6 < f1;
      if (bool3)
      {
        f6 = localRectF.right;
        f8 += f6;
        boolean bool4 = f8 < 0.0F;
        if (bool4)
        {
          f8 = localRectF.top + f5;
          int i1 = getHeight();
          f6 = i1;
          bool4 = f8 < f6;
          if (bool4)
          {
            f8 = localRectF.bottom + f5;
            bool1 = f8 < 0.0F;
            if (bool1) {
              break label453;
            }
          }
        }
      }
      f2 = -f4;
      f3 = -f3;
      paramCanvas.translate(f2, f3);
      break;
      k = paramPagePart.getUserPage();
      f4 = calculatePageOffset(k);
      k = 0;
      f3 = 0.0F;
    }
    label453:
    localPaint = this.paint;
    paramCanvas.drawBitmap(localBitmap, localRect, localRectF, localPaint);
    bool1 = Constants.DEBUG_MODE;
    int j;
    if (bool1)
    {
      localObject = this.debugPaint;
      j = paramPagePart.getUserPage() % 2;
      if (j != 0) {
        break label552;
      }
      j = -65536;
    }
    for (f2 = 0.0F / 0.0F;; f2 = -1.7014636E38F)
    {
      ((Paint)localObject).setColor(j);
      localPaint = this.debugPaint;
      paramCanvas.drawRect(localRectF, localPaint);
      f2 = -f4;
      f3 = -f3;
      paramCanvas.translate(f2, f3);
      break;
      label552:
      j = -16776961;
    }
  }
  
  private void drawWithListener(Canvas paramCanvas, int paramInt, OnDrawListener paramOnDrawListener)
  {
    float f1 = 0.0F;
    boolean bool;
    if (paramOnDrawListener != null)
    {
      bool = this.swipeVertical;
      if (!bool) {
        break label92;
      }
    }
    for (float f2 = calculatePageOffset(paramInt);; f2 = 0.0F)
    {
      paramCanvas.translate(f1, f2);
      float f3 = this.optimalPageWidth;
      f3 = toCurrentScale(f3);
      float f4 = this.optimalPageHeight;
      f4 = toCurrentScale(f4);
      paramOnDrawListener.onLayerDrawn(paramCanvas, f3, f4, paramInt);
      f1 = -f1;
      f2 = -f2;
      paramCanvas.translate(f1, f2);
      return;
      label92:
      f1 = calculatePageOffset(paramInt);
      bool = false;
    }
  }
  
  private void load(DocumentSource paramDocumentSource, String paramString, OnLoadCompleteListener paramOnLoadCompleteListener, OnErrorListener paramOnErrorListener)
  {
    load(paramDocumentSource, paramString, paramOnLoadCompleteListener, paramOnErrorListener, null);
  }
  
  private void load(DocumentSource paramDocumentSource, String paramString, OnLoadCompleteListener paramOnLoadCompleteListener, OnErrorListener paramOnErrorListener, int[] paramArrayOfInt)
  {
    boolean bool = this.recycled;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Don't call load on a PDF View without recycling it first.");
      throw ((Throwable)localObject1);
    }
    if (paramArrayOfInt != null)
    {
      this.originalUserPages = paramArrayOfInt;
      localObject1 = ArrayUtils.deleteDuplicatedPages(this.originalUserPages);
      this.filteredUserPages = ((int[])localObject1);
      localObject1 = ArrayUtils.calculateIndexesInDuplicateArray(this.originalUserPages);
      this.filteredUserPageIndexes = ((int[])localObject1);
    }
    this.onLoadCompleteListener = paramOnLoadCompleteListener;
    this.onErrorListener = paramOnErrorListener;
    Object localObject1 = this.originalUserPages;
    if (localObject1 != null) {
      localObject1 = this.originalUserPages;
    }
    for (int i = localObject1[0];; i = 0)
    {
      this.recycled = false;
      localObject1 = new com/github/barteksc/pdfviewer/DecodingAsyncTask;
      PdfiumCore localPdfiumCore = this.pdfiumCore;
      Object localObject2 = paramDocumentSource;
      Object localObject3 = paramString;
      ((DecodingAsyncTask)localObject1).<init>(paramDocumentSource, paramString, this, localPdfiumCore, i);
      this.decodingAsyncTask = ((DecodingAsyncTask)localObject1);
      localObject1 = this.decodingAsyncTask;
      localObject2 = AsyncTask.THREAD_POOL_EXECUTOR;
      localObject3 = new Void[0];
      ((DecodingAsyncTask)localObject1).executeOnExecutor((Executor)localObject2, (Object[])localObject3);
      return;
    }
  }
  
  private void setDefaultPage(int paramInt)
  {
    this.defaultPage = paramInt;
  }
  
  private void setOnDrawAllListener(OnDrawListener paramOnDrawListener)
  {
    this.onDrawAllListener = paramOnDrawListener;
  }
  
  private void setOnDrawListener(OnDrawListener paramOnDrawListener)
  {
    this.onDrawListener = paramOnDrawListener;
  }
  
  private void setOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    this.onPageChangeListener = paramOnPageChangeListener;
  }
  
  private void setOnPageScrollListener(OnPageScrollListener paramOnPageScrollListener)
  {
    this.onPageScrollListener = paramOnPageScrollListener;
  }
  
  private void setOnRenderListener(OnRenderListener paramOnRenderListener)
  {
    this.onRenderListener = paramOnRenderListener;
  }
  
  private void setOnTapListener(OnTapListener paramOnTapListener)
  {
    this.onTapListener = paramOnTapListener;
  }
  
  private void setScrollHandle(ScrollHandle paramScrollHandle)
  {
    this.scrollHandle = paramScrollHandle;
  }
  
  private void setSpacing(int paramInt)
  {
    int i = Util.getDP(getContext(), paramInt);
    this.spacingPx = i;
  }
  
  float calculateDocLength()
  {
    int i = getPageCount();
    boolean bool = this.swipeVertical;
    float f1;
    float f2;
    int j;
    if (bool)
    {
      f1 = i;
      f2 = this.optimalPageHeight;
      f1 *= f2;
      i += -1;
      j = this.spacingPx;
      i *= j;
      f3 = i + f1;
    }
    for (float f3 = toCurrentScale(f3);; f3 = toCurrentScale(f3))
    {
      return f3;
      f1 = i;
      f2 = this.optimalPageWidth;
      f1 *= f2;
      i += -1;
      j = this.spacingPx;
      i *= j;
      f3 = i + f1;
    }
  }
  
  public void computeScroll()
  {
    super.computeScroll();
    this.animationManager.computeFling();
  }
  
  public boolean doRenderDuringScale()
  {
    return this.renderDuringScale;
  }
  
  public boolean documentFitsView()
  {
    boolean bool1 = true;
    int i = getPageCount();
    int j = i + -1;
    int k = this.spacingPx;
    j *= k;
    boolean bool3 = this.swipeVertical;
    float f1;
    float f2;
    float f3;
    boolean bool2;
    if (bool3)
    {
      f1 = i;
      f2 = this.optimalPageHeight;
      f1 *= f2;
      f3 = j;
      f1 += f3;
      j = getHeight();
      f3 = j;
      bool2 = f1 < f3;
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      f1 = bool2;
      f2 = this.optimalPageWidth;
      f1 *= f2;
      f3 = j;
      f1 += f3;
      j = getWidth();
      f3 = j;
      bool2 = f1 < f3;
      if (!bool2) {
        bool1 = false;
      }
    }
  }
  
  public void enableAnnotationRendering(boolean paramBoolean)
  {
    this.annotationRendering = paramBoolean;
  }
  
  public void enableAntialiasing(boolean paramBoolean)
  {
    this.enableAntialiasing = paramBoolean;
  }
  
  public void enableDoubletap(boolean paramBoolean)
  {
    this.dragPinchManager.enableDoubletap(paramBoolean);
  }
  
  public void enableRenderDuringScale(boolean paramBoolean)
  {
    this.renderDuringScale = paramBoolean;
  }
  
  public void enableSwipe(boolean paramBoolean)
  {
    this.dragPinchManager.setSwipeEnabled(paramBoolean);
  }
  
  public void fitToWidth()
  {
    Object localObject1 = this.state;
    Object localObject2 = PDFView.State.SHOWN;
    if (localObject1 != localObject2)
    {
      localObject1 = TAG;
      localObject2 = "Cannot fit, document not rendered yet";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      float f1 = getWidth();
      float f2 = this.optimalPageWidth;
      f1 /= f2;
      zoomTo(f1);
      f1 = 0.0F;
      localObject1 = null;
      setPositionOffset(0.0F);
    }
  }
  
  public void fitToWidth(int paramInt)
  {
    Object localObject1 = this.state;
    Object localObject2 = PDFView.State.SHOWN;
    if (localObject1 != localObject2)
    {
      localObject1 = TAG;
      localObject2 = "Cannot fit, document not rendered yet";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      fitToWidth();
      jumpTo(paramInt);
    }
  }
  
  public PDFView.Configurator fromAsset(String paramString)
  {
    PDFView.Configurator localConfigurator = new com/github/barteksc/pdfviewer/PDFView$Configurator;
    AssetSource localAssetSource = new com/github/barteksc/pdfviewer/source/AssetSource;
    localAssetSource.<init>(paramString);
    localConfigurator.<init>(this, localAssetSource, null);
    return localConfigurator;
  }
  
  public PDFView.Configurator fromBytes(byte[] paramArrayOfByte)
  {
    PDFView.Configurator localConfigurator = new com/github/barteksc/pdfviewer/PDFView$Configurator;
    ByteArraySource localByteArraySource = new com/github/barteksc/pdfviewer/source/ByteArraySource;
    localByteArraySource.<init>(paramArrayOfByte);
    localConfigurator.<init>(this, localByteArraySource, null);
    return localConfigurator;
  }
  
  public PDFView.Configurator fromFile(File paramFile)
  {
    PDFView.Configurator localConfigurator = new com/github/barteksc/pdfviewer/PDFView$Configurator;
    FileSource localFileSource = new com/github/barteksc/pdfviewer/source/FileSource;
    localFileSource.<init>(paramFile);
    localConfigurator.<init>(this, localFileSource, null);
    return localConfigurator;
  }
  
  public PDFView.Configurator fromSource(DocumentSource paramDocumentSource)
  {
    PDFView.Configurator localConfigurator = new com/github/barteksc/pdfviewer/PDFView$Configurator;
    localConfigurator.<init>(this, paramDocumentSource, null);
    return localConfigurator;
  }
  
  public PDFView.Configurator fromStream(InputStream paramInputStream)
  {
    PDFView.Configurator localConfigurator = new com/github/barteksc/pdfviewer/PDFView$Configurator;
    InputStreamSource localInputStreamSource = new com/github/barteksc/pdfviewer/source/InputStreamSource;
    localInputStreamSource.<init>(paramInputStream);
    localConfigurator.<init>(this, localInputStreamSource, null);
    return localConfigurator;
  }
  
  public PDFView.Configurator fromUri(Uri paramUri)
  {
    PDFView.Configurator localConfigurator = new com/github/barteksc/pdfviewer/PDFView$Configurator;
    UriSource localUriSource = new com/github/barteksc/pdfviewer/source/UriSource;
    localUriSource.<init>(paramUri);
    localConfigurator.<init>(this, localUriSource, null);
    return localConfigurator;
  }
  
  public int getCurrentPage()
  {
    return this.currentPage;
  }
  
  public float getCurrentXOffset()
  {
    return this.currentXOffset;
  }
  
  public float getCurrentYOffset()
  {
    return this.currentYOffset;
  }
  
  public PdfDocument.Meta getDocumentMeta()
  {
    Object localObject = this.pdfDocument;
    if (localObject == null) {}
    PdfDocument localPdfDocument;
    for (localObject = null;; localObject = ((PdfiumCore)localObject).getDocumentMeta(localPdfDocument))
    {
      return (PdfDocument.Meta)localObject;
      localObject = this.pdfiumCore;
      localPdfDocument = this.pdfDocument;
    }
  }
  
  int getDocumentPageCount()
  {
    return this.documentPageCount;
  }
  
  int[] getFilteredUserPageIndexes()
  {
    return this.filteredUserPageIndexes;
  }
  
  int[] getFilteredUserPages()
  {
    return this.filteredUserPages;
  }
  
  public float getMaxZoom()
  {
    return this.maxZoom;
  }
  
  public float getMidZoom()
  {
    return this.midZoom;
  }
  
  public float getMinZoom()
  {
    return this.minZoom;
  }
  
  OnPageChangeListener getOnPageChangeListener()
  {
    return this.onPageChangeListener;
  }
  
  OnPageScrollListener getOnPageScrollListener()
  {
    return this.onPageScrollListener;
  }
  
  OnRenderListener getOnRenderListener()
  {
    return this.onRenderListener;
  }
  
  OnTapListener getOnTapListener()
  {
    return this.onTapListener;
  }
  
  public float getOptimalPageHeight()
  {
    return this.optimalPageHeight;
  }
  
  public float getOptimalPageWidth()
  {
    return this.optimalPageWidth;
  }
  
  int[] getOriginalUserPages()
  {
    return this.originalUserPages;
  }
  
  public int getPageAtPositionOffset(float paramFloat)
  {
    float f = getPageCount() * paramFloat;
    double d = Math.floor(f);
    int i = (int)d;
    int j = getPageCount();
    if (i == j) {
      i += -1;
    }
    return i;
  }
  
  public int getPageCount()
  {
    int[] arrayOfInt = this.originalUserPages;
    if (arrayOfInt != null) {
      arrayOfInt = this.originalUserPages;
    }
    for (int i = arrayOfInt.length;; i = this.documentPageCount) {
      return i;
    }
  }
  
  public float getPositionOffset()
  {
    boolean bool = this.swipeVertical;
    float f1;
    float f2;
    int i;
    float f3;
    if (bool)
    {
      f1 = -this.currentYOffset;
      f2 = calculateDocLength();
      i = getHeight();
      f3 = i;
      f2 -= f3;
    }
    for (f1 /= f2;; f1 /= f2)
    {
      return MathUtils.limit(f1, 0.0F, 1.0F);
      f1 = -this.currentXOffset;
      f2 = calculateDocLength();
      i = getWidth();
      f3 = i;
      f2 -= f3;
    }
  }
  
  PDFView.ScrollDir getScrollDir()
  {
    return this.scrollDir;
  }
  
  ScrollHandle getScrollHandle()
  {
    return this.scrollHandle;
  }
  
  int getSpacingPx()
  {
    return this.spacingPx;
  }
  
  public List getTableOfContents()
  {
    Object localObject = this.pdfDocument;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
    }
    for (;;)
    {
      return (List)localObject;
      localObject = this.pdfiumCore;
      PdfDocument localPdfDocument = this.pdfDocument;
      localObject = ((PdfiumCore)localObject).getTableOfContents(localPdfDocument);
    }
  }
  
  public float getZoom()
  {
    return this.zoom;
  }
  
  public boolean isAnnotationRendering()
  {
    return this.annotationRendering;
  }
  
  public boolean isAntialiasing()
  {
    return this.enableAntialiasing;
  }
  
  public boolean isBestQuality()
  {
    return this.bestQuality;
  }
  
  public boolean isRecycled()
  {
    return this.recycled;
  }
  
  public boolean isSwipeVertical()
  {
    return this.swipeVertical;
  }
  
  public boolean isZooming()
  {
    float f1 = this.zoom;
    float f2 = this.minZoom;
    boolean bool = f1 < f2;
    if (bool) {
      bool = true;
    }
    for (f1 = Float.MIN_VALUE;; f1 = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  public void jumpTo(int paramInt)
  {
    jumpTo(paramInt, false);
  }
  
  public void jumpTo(int paramInt, boolean paramBoolean)
  {
    float f1 = -calculatePageOffset(paramInt);
    boolean bool = this.swipeVertical;
    AnimationManager localAnimationManager;
    float f2;
    if (bool) {
      if (paramBoolean)
      {
        localAnimationManager = this.animationManager;
        f2 = this.currentYOffset;
        localAnimationManager.startYAnimation(f2, f1);
      }
    }
    for (;;)
    {
      showPage(paramInt);
      return;
      float f3 = this.currentXOffset;
      moveTo(f3, f1);
      continue;
      if (paramBoolean)
      {
        localAnimationManager = this.animationManager;
        f2 = this.currentXOffset;
        localAnimationManager.startXAnimation(f2, f1);
      }
      else
      {
        f3 = this.currentYOffset;
        moveTo(f1, f3);
      }
    }
  }
  
  void loadComplete(PdfDocument paramPdfDocument, int paramInt1, int paramInt2)
  {
    Object localObject = PDFView.State.LOADED;
    this.state = ((PDFView.State)localObject);
    int i = this.pdfiumCore.getPageCount(paramPdfDocument);
    this.documentPageCount = i;
    this.pdfDocument = paramPdfDocument;
    this.pageWidth = paramInt1;
    this.pageHeight = paramInt2;
    calculateOptimalWidthAndHeight();
    localObject = new com/github/barteksc/pdfviewer/PagesLoader;
    ((PagesLoader)localObject).<init>(this);
    this.pagesLoader = ((PagesLoader)localObject);
    localObject = this.renderingHandlerThread;
    boolean bool = ((HandlerThread)localObject).isAlive();
    if (!bool)
    {
      localObject = this.renderingHandlerThread;
      ((HandlerThread)localObject).start();
    }
    localObject = new com/github/barteksc/pdfviewer/RenderingHandler;
    Looper localLooper = this.renderingHandlerThread.getLooper();
    PdfiumCore localPdfiumCore = this.pdfiumCore;
    ((RenderingHandler)localObject).<init>(localLooper, this, localPdfiumCore, paramPdfDocument);
    this.renderingHandler = ((RenderingHandler)localObject);
    this.renderingHandler.start();
    localObject = this.scrollHandle;
    if (localObject != null)
    {
      localObject = this.scrollHandle;
      ((ScrollHandle)localObject).setupLayout(this);
      bool = true;
      this.isScrollHandleInit = bool;
    }
    localObject = this.onLoadCompleteListener;
    if (localObject != null)
    {
      localObject = this.onLoadCompleteListener;
      int k = this.documentPageCount;
      ((OnLoadCompleteListener)localObject).loadComplete(k);
    }
    int j = this.defaultPage;
    jumpTo(j, false);
  }
  
  void loadError(Throwable paramThrowable)
  {
    Object localObject = PDFView.State.ERROR;
    this.state = ((PDFView.State)localObject);
    recycle();
    invalidate();
    localObject = this.onErrorListener;
    if (localObject != null)
    {
      localObject = this.onErrorListener;
      ((OnErrorListener)localObject).onError(paramThrowable);
    }
    for (;;)
    {
      return;
      localObject = "PDFView";
      String str = "load pdf error";
      Log.e((String)localObject, str, paramThrowable);
    }
  }
  
  void loadPageByOffset()
  {
    float f1 = 2.0F;
    int i = getPageCount();
    if (i == 0) {}
    for (;;)
    {
      return;
      i = this.spacingPx;
      int j = this.spacingPx;
      int m = getPageCount();
      j /= m;
      i -= j;
      float f2 = i;
      boolean bool = this.swipeVertical;
      float f3;
      float f4;
      if (bool)
      {
        f3 = this.currentYOffset;
        f4 = this.optimalPageHeight + f2;
        i = getHeight();
      }
      for (f2 = i / f1;; f2 = i / f1)
      {
        f3 = Math.abs(f3);
        f2 += f3;
        f4 = toCurrentScale(f4);
        f2 /= f4;
        double d = Math.floor(f2);
        i = (int)d;
        if (i < 0) {
          break label182;
        }
        int k = getPageCount() + -1;
        if (i > k) {
          break label182;
        }
        k = getCurrentPage();
        if (i == k) {
          break label182;
        }
        showPage(i);
        break;
        f3 = this.currentXOffset;
        f4 = this.optimalPageWidth + f2;
        i = getWidth();
      }
      label182:
      loadPages();
    }
  }
  
  public void loadPages()
  {
    int i = 0;
    float f = this.optimalPageWidth;
    boolean bool = f < 0.0F;
    Object localObject;
    if (bool)
    {
      f = this.optimalPageHeight;
      bool = f < 0.0F;
      if (bool)
      {
        localObject = this.renderingHandler;
        if (localObject != null) {
          break label40;
        }
      }
    }
    for (;;)
    {
      return;
      label40:
      localObject = this.renderingHandler;
      i = 1;
      ((RenderingHandler)localObject).removeMessages(i);
      this.cacheManager.makeANewSet();
      localObject = this.pagesLoader;
      ((PagesLoader)localObject).loadPages();
      redraw();
    }
  }
  
  public void moveRelativeTo(float paramFloat1, float paramFloat2)
  {
    float f1 = this.currentXOffset + paramFloat1;
    float f2 = this.currentYOffset + paramFloat2;
    moveTo(f1, f2);
  }
  
  public void moveTo(float paramFloat1, float paramFloat2)
  {
    moveTo(paramFloat1, paramFloat2, true);
  }
  
  public void moveTo(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f1 = 2.0F;
    int i = 0;
    float f2 = 0.0F;
    boolean bool3 = this.swipeVertical;
    float f3;
    float f4;
    if (bool3)
    {
      f3 = this.optimalPageWidth;
      f3 = toCurrentScale(f3);
      f4 = getWidth();
      boolean bool6 = f3 < f4;
      if (bool6)
      {
        int n = getWidth() / 2;
        f4 = n;
        f3 /= f1;
        paramFloat1 = f4 - f3;
        f3 = calculateDocLength();
        f4 = getHeight();
        boolean bool7 = f3 < f4;
        if (!bool7) {
          break label319;
        }
        i = getHeight();
        f2 = (i - f3) / f1;
      }
    }
    for (;;)
    {
      label123:
      f3 = this.currentYOffset;
      bool3 = f2 < f3;
      Object localObject;
      if (bool3)
      {
        localObject = PDFView.ScrollDir.END;
        this.scrollDir = ((PDFView.ScrollDir)localObject);
      }
      int i7;
      float f5;
      label319:
      boolean bool4;
      for (;;)
      {
        paramFloat2 = f2;
        f2 = paramFloat1;
        this.currentXOffset = f2;
        this.currentYOffset = paramFloat2;
        f2 = getPositionOffset();
        if (paramBoolean)
        {
          localObject = this.scrollHandle;
          if (localObject != null)
          {
            bool3 = documentFitsView();
            if (!bool3)
            {
              localObject = this.scrollHandle;
              ((ScrollHandle)localObject).setScroll(f2);
            }
          }
        }
        localObject = this.onPageScrollListener;
        if (localObject != null)
        {
          localObject = this.onPageScrollListener;
          int i1 = getCurrentPage();
          ((OnPageScrollListener)localObject).onPageScrolled(i1, f2);
        }
        redraw();
        return;
        boolean bool8 = paramFloat1 < 0.0F;
        if (bool8)
        {
          paramFloat1 = 0.0F;
          break;
        }
        f4 = paramFloat1 + f3;
        i7 = getWidth();
        f5 = i7;
        bool8 = f4 < f5;
        if (!bool8) {
          break;
        }
        int i2 = getWidth();
        f4 = i2;
        paramFloat1 = f4 - f3;
        break;
        boolean bool9 = paramFloat2 < 0.0F;
        if (bool9) {
          break label123;
        }
        f2 = paramFloat2 + f3;
        int i3 = getHeight();
        f4 = i3;
        boolean bool1 = f2 < f4;
        if (!bool1) {
          break label744;
        }
        f2 = -f3;
        int k = getHeight();
        f3 = k;
        f2 += f3;
        break label123;
        f3 = this.currentYOffset;
        bool4 = f2 < f3;
        if (bool4)
        {
          localObject = PDFView.ScrollDir.START;
          this.scrollDir = ((PDFView.ScrollDir)localObject);
        }
        else
        {
          localObject = PDFView.ScrollDir.NONE;
          this.scrollDir = ((PDFView.ScrollDir)localObject);
        }
      }
      f3 = this.optimalPageHeight;
      f3 = toCurrentScale(f3);
      f4 = getHeight();
      boolean bool10 = f3 < f4;
      label489:
      boolean bool11;
      if (bool10)
      {
        int i4 = getHeight() / 2;
        f4 = i4;
        f3 /= f1;
        paramFloat2 = f4 - f3;
        f3 = calculateDocLength();
        f4 = getWidth();
        bool11 = f3 < f4;
        if (!bool11) {
          break label627;
        }
        int j = getWidth();
        f2 = (j - f3) / f1;
      }
      for (;;)
      {
        f3 = this.currentXOffset;
        bool4 = f2 < f3;
        if (bool4)
        {
          localObject = PDFView.ScrollDir.END;
          this.scrollDir = ((PDFView.ScrollDir)localObject);
          break;
          bool11 = paramFloat2 < 0.0F;
          if (bool11)
          {
            paramFloat2 = 0.0F;
            break label489;
          }
          f4 = paramFloat2 + f3;
          i7 = getHeight();
          f5 = i7;
          bool11 = f4 < f5;
          if (!bool11) {
            break label489;
          }
          int i5 = getHeight();
          f4 = i5;
          paramFloat2 = f4 - f3;
          break label489;
          label627:
          boolean bool12 = paramFloat1 < 0.0F;
          if (bool12) {
            continue;
          }
          f2 = paramFloat1 + f3;
          int i6 = getWidth();
          f4 = i6;
          boolean bool2 = f2 < f4;
          if (!bool2) {
            break label738;
          }
          f2 = -f3;
          int m = getWidth();
          f3 = m;
          f2 += f3;
          continue;
        }
        f3 = this.currentXOffset;
        boolean bool5 = f2 < f3;
        if (bool5)
        {
          localObject = PDFView.ScrollDir.START;
          this.scrollDir = ((PDFView.ScrollDir)localObject);
          break;
        }
        localObject = PDFView.ScrollDir.NONE;
        this.scrollDir = ((PDFView.ScrollDir)localObject);
        break;
        label738:
        f2 = paramFloat1;
      }
      label744:
      f2 = paramFloat2;
    }
  }
  
  public void onBitmapRendered(PagePart paramPagePart)
  {
    Object localObject = this.state;
    PDFView.State localState = PDFView.State.LOADED;
    if (localObject == localState)
    {
      localObject = PDFView.State.SHOWN;
      this.state = ((PDFView.State)localObject);
      localObject = this.onRenderListener;
      if (localObject != null)
      {
        localObject = this.onRenderListener;
        int i = getPageCount();
        float f1 = this.optimalPageWidth;
        float f2 = this.optimalPageHeight;
        ((OnRenderListener)localObject).onInitiallyRendered(i, f1, f2);
      }
    }
    boolean bool = paramPagePart.isThumbnail();
    if (bool)
    {
      localObject = this.cacheManager;
      ((CacheManager)localObject).cacheThumbnail(paramPagePart);
    }
    for (;;)
    {
      redraw();
      return;
      localObject = this.cacheManager;
      ((CacheManager)localObject).cachePart(paramPagePart);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    recycle();
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    boolean bool1 = isInEditMode();
    if (bool1) {}
    for (;;)
    {
      return;
      bool1 = this.enableAntialiasing;
      if (bool1)
      {
        localObject1 = this.antialiasFilter;
        paramCanvas.setDrawFilter((DrawFilter)localObject1);
      }
      Object localObject1 = getBackground();
      if (localObject1 == null)
      {
        int i = -1;
        f1 = 0.0F / 0.0F;
        paramCanvas.drawColor(i);
      }
      boolean bool2;
      float f3;
      for (;;)
      {
        bool2 = this.recycled;
        if (bool2) {
          break;
        }
        localObject1 = this.state;
        PDFView.State localState = PDFView.State.SHOWN;
        if (localObject1 != localState) {
          break;
        }
        f2 = this.currentXOffset;
        f3 = this.currentYOffset;
        paramCanvas.translate(f2, f3);
        localObject1 = this.cacheManager.getThumbnails();
        localObject2 = ((List)localObject1).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject2).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (PagePart)((Iterator)localObject2).next();
          drawPart(paramCanvas, (PagePart)localObject1);
        }
        ((Drawable)localObject1).draw(paramCanvas);
      }
      localObject1 = this.cacheManager.getPageParts();
      Object localObject2 = ((List)localObject1).iterator();
      Object localObject3;
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (PagePart)((Iterator)localObject2).next();
        drawPart(paramCanvas, (PagePart)localObject1);
        localObject3 = this.onDrawAllListener;
        if (localObject3 != null)
        {
          localObject3 = this.onDrawPagesNums;
          int m = ((PagePart)localObject1).getUserPage();
          Integer localInteger = Integer.valueOf(m);
          boolean bool4 = ((List)localObject3).contains(localInteger);
          if (!bool4)
          {
            localObject3 = this.onDrawPagesNums;
            int j = ((PagePart)localObject1).getUserPage();
            localObject1 = Integer.valueOf(j);
            ((List)localObject3).add(localObject1);
          }
        }
      }
      localObject1 = this.onDrawPagesNums;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (Integer)((Iterator)localObject2).next();
        k = ((Integer)localObject1).intValue();
        localObject3 = this.onDrawAllListener;
        drawWithListener(paramCanvas, k, (OnDrawListener)localObject3);
      }
      localObject1 = this.onDrawPagesNums;
      ((List)localObject1).clear();
      int k = this.currentPage;
      localObject2 = this.onDrawListener;
      drawWithListener(paramCanvas, k, (OnDrawListener)localObject2);
      float f1 = -f2;
      float f2 = -f3;
      paramCanvas.translate(f1, f2);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = isInEditMode();
    if (!bool)
    {
      localObject = this.state;
      PDFView.State localState = PDFView.State.SHOWN;
      if (localObject == localState) {}
    }
    else
    {
      return;
    }
    Object localObject = this.animationManager;
    ((AnimationManager)localObject).stopAll();
    calculateOptimalWidthAndHeight();
    bool = this.swipeVertical;
    float f1;
    float f2;
    if (bool)
    {
      f1 = this.currentXOffset;
      int j = this.currentPage;
      f2 = -calculatePageOffset(j);
      moveTo(f1, f2);
    }
    for (;;)
    {
      loadPageByOffset();
      break;
      int i = this.currentPage;
      f1 = -calculatePageOffset(i);
      f2 = this.currentYOffset;
      moveTo(f1, f2);
    }
  }
  
  public void recycle()
  {
    int i = 1;
    this.animationManager.stopAll();
    Object localObject = this.renderingHandler;
    if (localObject != null)
    {
      this.renderingHandler.stop();
      localObject = this.renderingHandler;
      ((RenderingHandler)localObject).removeMessages(i);
    }
    localObject = this.decodingAsyncTask;
    if (localObject != null)
    {
      localObject = this.decodingAsyncTask;
      ((DecodingAsyncTask)localObject).cancel(i);
    }
    this.cacheManager.recycle();
    localObject = this.scrollHandle;
    if (localObject != null)
    {
      boolean bool = this.isScrollHandleInit;
      if (bool)
      {
        localObject = this.scrollHandle;
        ((ScrollHandle)localObject).destroyLayout();
      }
    }
    localObject = this.pdfiumCore;
    if (localObject != null)
    {
      localObject = this.pdfDocument;
      if (localObject != null)
      {
        localObject = this.pdfiumCore;
        PdfDocument localPdfDocument = this.pdfDocument;
        ((PdfiumCore)localObject).closeDocument(localPdfDocument);
      }
    }
    this.renderingHandler = null;
    this.originalUserPages = null;
    this.filteredUserPages = null;
    this.filteredUserPageIndexes = null;
    this.pdfDocument = null;
    this.scrollHandle = null;
    this.isScrollHandleInit = false;
    this.currentYOffset = 0.0F;
    this.currentXOffset = 0.0F;
    this.zoom = 1.0F;
    this.recycled = i;
    localObject = PDFView.State.DEFAULT;
    this.state = ((PDFView.State)localObject);
  }
  
  void redraw()
  {
    invalidate();
  }
  
  public void resetZoom()
  {
    float f = this.minZoom;
    zoomTo(f);
  }
  
  public void resetZoomWithAnimation()
  {
    float f = this.minZoom;
    zoomWithAnimation(f);
  }
  
  public void setMaxZoom(float paramFloat)
  {
    this.maxZoom = paramFloat;
  }
  
  public void setMidZoom(float paramFloat)
  {
    this.midZoom = paramFloat;
  }
  
  public void setMinZoom(float paramFloat)
  {
    this.minZoom = paramFloat;
  }
  
  public void setPositionOffset(float paramFloat)
  {
    setPositionOffset(paramFloat, true);
  }
  
  public void setPositionOffset(float paramFloat, boolean paramBoolean)
  {
    boolean bool = this.swipeVertical;
    float f1;
    float f2;
    if (bool)
    {
      f1 = this.currentXOffset;
      f2 = -calculateDocLength();
      int i = getHeight();
      float f3 = i;
      f2 = (f2 + f3) * paramFloat;
      moveTo(f1, f2, paramBoolean);
    }
    for (;;)
    {
      loadPageByOffset();
      return;
      f1 = -calculateDocLength();
      int j = getWidth();
      f2 = j;
      f1 = (f1 + f2) * paramFloat;
      f2 = this.currentYOffset;
      moveTo(f1, f2, paramBoolean);
    }
  }
  
  public void setSwipeVertical(boolean paramBoolean)
  {
    this.swipeVertical = paramBoolean;
  }
  
  void showPage(int paramInt)
  {
    boolean bool1 = this.recycled;
    if (bool1) {}
    for (;;)
    {
      return;
      int i = determineValidPageNumberFrom(paramInt);
      this.currentPage = i;
      this.currentFilteredPage = i;
      int[] arrayOfInt = this.filteredUserPageIndexes;
      int j;
      if ((arrayOfInt != null) && (i >= 0))
      {
        arrayOfInt = this.filteredUserPageIndexes;
        j = arrayOfInt.length;
        if (i < j)
        {
          arrayOfInt = this.filteredUserPageIndexes;
          i = arrayOfInt[i];
          this.currentFilteredPage = i;
        }
      }
      loadPages();
      Object localObject = this.scrollHandle;
      if (localObject != null)
      {
        boolean bool2 = documentFitsView();
        if (!bool2)
        {
          localObject = this.scrollHandle;
          j = this.currentPage + 1;
          ((ScrollHandle)localObject).setPageNum(j);
        }
      }
      localObject = this.onPageChangeListener;
      if (localObject != null)
      {
        localObject = this.onPageChangeListener;
        j = this.currentPage;
        int k = getPageCount();
        ((OnPageChangeListener)localObject).onPageChanged(j, k);
      }
    }
  }
  
  public void stopFling()
  {
    this.animationManager.stopFling();
  }
  
  public float toCurrentScale(float paramFloat)
  {
    return this.zoom * paramFloat;
  }
  
  public float toRealScale(float paramFloat)
  {
    float f = this.zoom;
    return paramFloat / f;
  }
  
  public void useBestQuality(boolean paramBoolean)
  {
    this.bestQuality = paramBoolean;
  }
  
  public void zoomCenteredRelativeTo(float paramFloat, PointF paramPointF)
  {
    float f = this.zoom * paramFloat;
    zoomCenteredTo(f, paramPointF);
  }
  
  public void zoomCenteredTo(float paramFloat, PointF paramPointF)
  {
    float f1 = this.zoom;
    f1 = paramFloat / f1;
    zoomTo(paramFloat);
    float f2 = this.currentXOffset * f1;
    float f3 = this.currentYOffset * f1;
    float f4 = paramPointF.x;
    float f5 = paramPointF.x * f1;
    f4 -= f5;
    f2 += f4;
    f4 = paramPointF.y;
    f5 = paramPointF.y;
    f1 *= f5;
    f1 = f4 - f1 + f3;
    moveTo(f2, f1);
  }
  
  public void zoomTo(float paramFloat)
  {
    this.zoom = paramFloat;
  }
  
  public void zoomWithAnimation(float paramFloat)
  {
    AnimationManager localAnimationManager = this.animationManager;
    float f1 = getWidth() / 2;
    float f2 = getHeight() / 2;
    float f3 = this.zoom;
    localAnimationManager.startZoomAnimation(f1, f2, f3, paramFloat);
  }
  
  public void zoomWithAnimation(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AnimationManager localAnimationManager = this.animationManager;
    float f = this.zoom;
    localAnimationManager.startZoomAnimation(paramFloat1, paramFloat2, f, paramFloat3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\PDFView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */