package com.shockwave.pdfium;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PdfiumCore
{
  private static final Class FD_CLASS;
  private static final String FD_FIELD_NAME = "descriptor";
  private static final String TAG = PdfiumCore.class.getName();
  private static final Object lock;
  private static Field mFdField;
  private int mCurrentDpi;
  
  static
  {
    System.loadLibrary("modpng");
    System.loadLibrary("modft2");
    System.loadLibrary("modpdfium");
    System.loadLibrary("jniPdfium");
    FD_CLASS = FileDescriptor.class;
    mFdField = null;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    lock = localObject;
  }
  
  public PdfiumCore(Context paramContext)
  {
    int i = paramContext.getResources().getDisplayMetrics().densityDpi;
    this.mCurrentDpi = i;
  }
  
  public static int getNumFd(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    int i = -1;
    try
    {
      Object localObject1 = mFdField;
      if (localObject1 == null)
      {
        localObject1 = FD_CLASS;
        localObject2 = "descriptor";
        localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
        mFdField = (Field)localObject1;
        localObject1 = mFdField;
        boolean bool = true;
        ((Field)localObject1).setAccessible(bool);
      }
      localObject1 = mFdField;
      Object localObject2 = paramParcelFileDescriptor.getFileDescriptor();
      i = ((Field)localObject1).getInt(localObject2);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        localNoSuchFieldException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localIllegalAccessException.printStackTrace();
      }
    }
    return i;
  }
  
  private native void nativeCloseDocument(long paramLong);
  
  private native void nativeClosePage(long paramLong);
  
  private native void nativeClosePages(long[] paramArrayOfLong);
  
  private native long nativeGetBookmarkDestIndex(long paramLong1, long paramLong2);
  
  private native String nativeGetBookmarkTitle(long paramLong);
  
  private native String nativeGetDocumentMetaText(long paramLong, String paramString);
  
  private native Long nativeGetFirstChildBookmark(long paramLong, Long paramLong1);
  
  private native int nativeGetPageCount(long paramLong);
  
  private native int nativeGetPageHeightPixel(long paramLong, int paramInt);
  
  private native int nativeGetPageHeightPoint(long paramLong);
  
  private native int nativeGetPageWidthPixel(long paramLong, int paramInt);
  
  private native int nativeGetPageWidthPoint(long paramLong);
  
  private native Long nativeGetSiblingBookmark(long paramLong1, long paramLong2);
  
  private native long nativeLoadPage(long paramLong, int paramInt);
  
  private native long[] nativeLoadPages(long paramLong, int paramInt1, int paramInt2);
  
  private native long nativeOpenDocument(int paramInt, String paramString);
  
  private native long nativeOpenMemDocument(byte[] paramArrayOfByte, String paramString);
  
  private native void nativeRenderPage(long paramLong, Surface paramSurface, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean);
  
  private native void nativeRenderPageBitmap(long paramLong, Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean);
  
  private void recursiveGetBookmark(List paramList, PdfDocument paramPdfDocument, long paramLong)
  {
    Object localObject1 = new com/shockwave/pdfium/PdfDocument$Bookmark;
    ((PdfDocument.Bookmark)localObject1).<init>();
    ((PdfDocument.Bookmark)localObject1).mNativePtr = paramLong;
    Object localObject2 = nativeGetBookmarkTitle(paramLong);
    ((PdfDocument.Bookmark)localObject1).title = ((String)localObject2);
    long l1 = paramPdfDocument.mNativeDocPtr;
    l1 = nativeGetBookmarkDestIndex(l1, paramLong);
    ((PdfDocument.Bookmark)localObject1).pageIdx = l1;
    paramList.add(localObject1);
    l1 = paramPdfDocument.mNativeDocPtr;
    localObject2 = Long.valueOf(paramLong);
    localObject2 = nativeGetFirstChildBookmark(l1, (Long)localObject2);
    if (localObject2 != null)
    {
      localObject1 = ((PdfDocument.Bookmark)localObject1).getChildren();
      l1 = ((Long)localObject2).longValue();
      recursiveGetBookmark((List)localObject1, paramPdfDocument, l1);
    }
    long l2 = paramPdfDocument.mNativeDocPtr;
    localObject1 = nativeGetSiblingBookmark(l2, paramLong);
    if (localObject1 != null)
    {
      l2 = ((Long)localObject1).longValue();
      recursiveGetBookmark(paramList, paramPdfDocument, l2);
    }
  }
  
  public void closeDocument(PdfDocument paramPdfDocument)
  {
    synchronized (lock)
    {
      Object localObject2 = paramPdfDocument.mNativePagesPtr;
      localObject2 = ((Map)localObject2).keySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = localIterator.next();
        localObject2 = (Integer)localObject2;
        Map localMap = paramPdfDocument.mNativePagesPtr;
        localObject2 = localMap.get(localObject2);
        localObject2 = (Long)localObject2;
        long l1 = ((Long)localObject2).longValue();
        nativeClosePage(l1);
      }
    }
    Object localObject4 = paramPdfDocument.mNativePagesPtr;
    ((Map)localObject4).clear();
    long l2 = paramPdfDocument.mNativeDocPtr;
    nativeCloseDocument(l2);
    localObject4 = paramPdfDocument.parcelFileDescriptor;
    if (localObject4 != null) {}
    try
    {
      localObject4 = paramPdfDocument.parcelFileDescriptor;
      ((ParcelFileDescriptor)localObject4).close();
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    boolean bool = false;
    localObject4 = null;
    paramPdfDocument.parcelFileDescriptor = null;
  }
  
  public PdfDocument.Meta getDocumentMeta(PdfDocument paramPdfDocument)
  {
    synchronized (lock)
    {
      PdfDocument.Meta localMeta = new com/shockwave/pdfium/PdfDocument$Meta;
      localMeta.<init>();
      long l = paramPdfDocument.mNativeDocPtr;
      String str1 = "Title";
      String str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.title = str2;
      l = paramPdfDocument.mNativeDocPtr;
      str1 = "Author";
      str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.author = str2;
      l = paramPdfDocument.mNativeDocPtr;
      str1 = "Subject";
      str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.subject = str2;
      l = paramPdfDocument.mNativeDocPtr;
      str1 = "Keywords";
      str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.keywords = str2;
      l = paramPdfDocument.mNativeDocPtr;
      str1 = "Creator";
      str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.creator = str2;
      l = paramPdfDocument.mNativeDocPtr;
      str1 = "Producer";
      str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.producer = str2;
      l = paramPdfDocument.mNativeDocPtr;
      str1 = "CreationDate";
      str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.creationDate = str2;
      l = paramPdfDocument.mNativeDocPtr;
      str1 = "ModDate";
      str2 = nativeGetDocumentMetaText(l, str1);
      localMeta.modDate = str2;
      return localMeta;
    }
  }
  
  public int getPageCount(PdfDocument paramPdfDocument)
  {
    synchronized (lock)
    {
      long l = paramPdfDocument.mNativeDocPtr;
      int i = nativeGetPageCount(l);
      return i;
    }
  }
  
  public int getPageHeight(PdfDocument paramPdfDocument, int paramInt)
  {
    synchronized (lock)
    {
      Object localObject2 = paramPdfDocument.mNativePagesPtr;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject2 = ((Map)localObject2).get(localInteger);
      localObject2 = (Long)localObject2;
      if (localObject2 != null)
      {
        long l = ((Long)localObject2).longValue();
        i = this.mCurrentDpi;
        i = nativeGetPageHeightPixel(l, i);
        return i;
      }
      int i = 0;
      localObject2 = null;
    }
  }
  
  public int getPageHeightPoint(PdfDocument paramPdfDocument, int paramInt)
  {
    synchronized (lock)
    {
      Object localObject2 = paramPdfDocument.mNativePagesPtr;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject2 = ((Map)localObject2).get(localInteger);
      localObject2 = (Long)localObject2;
      if (localObject2 != null)
      {
        long l = ((Long)localObject2).longValue();
        i = nativeGetPageHeightPoint(l);
        return i;
      }
      int i = 0;
      localObject2 = null;
    }
  }
  
  public int getPageWidth(PdfDocument paramPdfDocument, int paramInt)
  {
    synchronized (lock)
    {
      Object localObject2 = paramPdfDocument.mNativePagesPtr;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject2 = ((Map)localObject2).get(localInteger);
      localObject2 = (Long)localObject2;
      if (localObject2 != null)
      {
        long l = ((Long)localObject2).longValue();
        i = this.mCurrentDpi;
        i = nativeGetPageWidthPixel(l, i);
        return i;
      }
      int i = 0;
      localObject2 = null;
    }
  }
  
  public int getPageWidthPoint(PdfDocument paramPdfDocument, int paramInt)
  {
    synchronized (lock)
    {
      Object localObject2 = paramPdfDocument.mNativePagesPtr;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject2 = ((Map)localObject2).get(localInteger);
      localObject2 = (Long)localObject2;
      if (localObject2 != null)
      {
        long l = ((Long)localObject2).longValue();
        i = nativeGetPageWidthPoint(l);
        return i;
      }
      int i = 0;
      localObject2 = null;
    }
  }
  
  public List getTableOfContents(PdfDocument paramPdfDocument)
  {
    synchronized (lock)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      long l = paramPdfDocument.mNativeDocPtr;
      Long localLong = nativeGetFirstChildBookmark(l, null);
      if (localLong != null)
      {
        l = localLong.longValue();
        recursiveGetBookmark(localArrayList, paramPdfDocument, l);
      }
      return localArrayList;
    }
  }
  
  public PdfDocument newDocument(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    return newDocument(paramParcelFileDescriptor, null);
  }
  
  public PdfDocument newDocument(ParcelFileDescriptor paramParcelFileDescriptor, String paramString)
  {
    PdfDocument localPdfDocument = new com/shockwave/pdfium/PdfDocument;
    localPdfDocument.<init>();
    localPdfDocument.parcelFileDescriptor = paramParcelFileDescriptor;
    synchronized (lock)
    {
      int i = getNumFd(paramParcelFileDescriptor);
      long l = nativeOpenDocument(i, paramString);
      localPdfDocument.mNativeDocPtr = l;
      return localPdfDocument;
    }
  }
  
  public PdfDocument newDocument(byte[] paramArrayOfByte)
  {
    return newDocument(paramArrayOfByte, null);
  }
  
  public PdfDocument newDocument(byte[] paramArrayOfByte, String paramString)
  {
    PdfDocument localPdfDocument = new com/shockwave/pdfium/PdfDocument;
    localPdfDocument.<init>();
    synchronized (lock)
    {
      long l = nativeOpenMemDocument(paramArrayOfByte, paramString);
      localPdfDocument.mNativeDocPtr = l;
      return localPdfDocument;
    }
  }
  
  public long openPage(PdfDocument paramPdfDocument, int paramInt)
  {
    synchronized (lock)
    {
      long l = paramPdfDocument.mNativeDocPtr;
      l = nativeLoadPage(l, paramInt);
      Map localMap = paramPdfDocument.mNativePagesPtr;
      Integer localInteger = Integer.valueOf(paramInt);
      Long localLong = Long.valueOf(l);
      localMap.put(localInteger, localLong);
      return l;
    }
  }
  
  public long[] openPage(PdfDocument paramPdfDocument, int paramInt1, int paramInt2)
  {
    synchronized (lock)
    {
      long l1 = paramPdfDocument.mNativeDocPtr;
      long[] arrayOfLong = nativeLoadPages(l1, paramInt1, paramInt2);
      int i = arrayOfLong.length;
      int j = 0;
      Object localObject2 = null;
      long l2;
      if (j < i)
      {
        l2 = arrayOfLong[j];
        if (paramInt1 <= paramInt2) {}
      }
      else
      {
        return arrayOfLong;
      }
      Map localMap = paramPdfDocument.mNativePagesPtr;
      Integer localInteger = Integer.valueOf(paramInt1);
      Long localLong = Long.valueOf(l2);
      localMap.put(localInteger, localLong);
      paramInt1 += 1;
      j += 1;
    }
  }
  
  public void renderPage(PdfDocument paramPdfDocument, Surface paramSurface, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    renderPage(paramPdfDocument, paramSurface, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, false);
  }
  
  /* Error */
  public void renderPage(PdfDocument paramPdfDocument, Surface paramSurface, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 52	com/shockwave/pdfium/PdfiumCore:lock	Ljava/lang/Object;
    //   3: astore 9
    //   5: aload 9
    //   7: monitorenter
    //   8: aload_1
    //   9: getfield 162	com/shockwave/pdfium/PdfDocument:mNativePagesPtr	Ljava/util/Map;
    //   12: astore 10
    //   14: iload_3
    //   15: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: astore 11
    //   20: aload 10
    //   22: aload 11
    //   24: invokeinterface 190 2 0
    //   29: astore 10
    //   31: aload 10
    //   33: checkcast 134	java/lang/Long
    //   36: astore 10
    //   38: aload 10
    //   40: invokevirtual 150	java/lang/Long:longValue	()J
    //   43: lstore 12
    //   45: aload_0
    //   46: getfield 71	com/shockwave/pdfium/PdfiumCore:mCurrentDpi	I
    //   49: istore 14
    //   51: aload_0
    //   52: astore 11
    //   54: aload_0
    //   55: lload 12
    //   57: aload_2
    //   58: iload 14
    //   60: iload 4
    //   62: iload 5
    //   64: iload 6
    //   66: iload 7
    //   68: iload 8
    //   70: invokespecial 317	com/shockwave/pdfium/PdfiumCore:nativeRenderPage	(JLandroid/view/Surface;IIIIIZ)V
    //   73: aload 9
    //   75: monitorexit
    //   76: return
    //   77: astore 10
    //   79: getstatic 26	com/shockwave/pdfium/PdfiumCore:TAG	Ljava/lang/String;
    //   82: astore 11
    //   84: ldc_w 319
    //   87: astore 15
    //   89: aload 11
    //   91: aload 15
    //   93: invokestatic 325	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   96: pop
    //   97: aload 10
    //   99: invokevirtual 328	java/lang/NullPointerException:printStackTrace	()V
    //   102: goto -29 -> 73
    //   105: astore 10
    //   107: aload 9
    //   109: monitorexit
    //   110: aload 10
    //   112: athrow
    //   113: astore 10
    //   115: getstatic 26	com/shockwave/pdfium/PdfiumCore:TAG	Ljava/lang/String;
    //   118: astore 11
    //   120: ldc_w 330
    //   123: astore 15
    //   125: aload 11
    //   127: aload 15
    //   129: invokestatic 325	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   132: pop
    //   133: aload 10
    //   135: invokevirtual 333	java/lang/Exception:printStackTrace	()V
    //   138: goto -65 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	PdfiumCore
    //   0	141	1	paramPdfDocument	PdfDocument
    //   0	141	2	paramSurface	Surface
    //   0	141	3	paramInt1	int
    //   0	141	4	paramInt2	int
    //   0	141	5	paramInt3	int
    //   0	141	6	paramInt4	int
    //   0	141	7	paramInt5	int
    //   0	141	8	paramBoolean	boolean
    //   12	27	10	localObject2	Object
    //   77	21	10	localNullPointerException	NullPointerException
    //   105	6	10	localObject3	Object
    //   113	21	10	localException	Exception
    //   18	108	11	localObject4	Object
    //   43	13	12	l	long
    //   49	10	14	i	int
    //   87	41	15	str	String
    // Exception table:
    //   from	to	target	type
    //   8	12	77	java/lang/NullPointerException
    //   14	18	77	java/lang/NullPointerException
    //   22	29	77	java/lang/NullPointerException
    //   31	36	77	java/lang/NullPointerException
    //   38	43	77	java/lang/NullPointerException
    //   45	49	77	java/lang/NullPointerException
    //   68	73	77	java/lang/NullPointerException
    //   8	12	105	finally
    //   14	18	105	finally
    //   22	29	105	finally
    //   31	36	105	finally
    //   38	43	105	finally
    //   45	49	105	finally
    //   68	73	105	finally
    //   73	76	105	finally
    //   79	82	105	finally
    //   91	97	105	finally
    //   97	102	105	finally
    //   107	110	105	finally
    //   115	118	105	finally
    //   127	133	105	finally
    //   133	138	105	finally
    //   8	12	113	java/lang/Exception
    //   14	18	113	java/lang/Exception
    //   22	29	113	java/lang/Exception
    //   31	36	113	java/lang/Exception
    //   38	43	113	java/lang/Exception
    //   45	49	113	java/lang/Exception
    //   68	73	113	java/lang/Exception
  }
  
  public void renderPageBitmap(PdfDocument paramPdfDocument, Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    renderPageBitmap(paramPdfDocument, paramBitmap, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, false);
  }
  
  /* Error */
  public void renderPageBitmap(PdfDocument paramPdfDocument, Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 52	com/shockwave/pdfium/PdfiumCore:lock	Ljava/lang/Object;
    //   3: astore 9
    //   5: aload 9
    //   7: monitorenter
    //   8: aload_1
    //   9: getfield 162	com/shockwave/pdfium/PdfDocument:mNativePagesPtr	Ljava/util/Map;
    //   12: astore 10
    //   14: iload_3
    //   15: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: astore 11
    //   20: aload 10
    //   22: aload 11
    //   24: invokeinterface 190 2 0
    //   29: astore 10
    //   31: aload 10
    //   33: checkcast 134	java/lang/Long
    //   36: astore 10
    //   38: aload 10
    //   40: invokevirtual 150	java/lang/Long:longValue	()J
    //   43: lstore 12
    //   45: aload_0
    //   46: getfield 71	com/shockwave/pdfium/PdfiumCore:mCurrentDpi	I
    //   49: istore 14
    //   51: aload_0
    //   52: astore 11
    //   54: aload_0
    //   55: lload 12
    //   57: aload_2
    //   58: iload 14
    //   60: iload 4
    //   62: iload 5
    //   64: iload 6
    //   66: iload 7
    //   68: iload 8
    //   70: invokespecial 341	com/shockwave/pdfium/PdfiumCore:nativeRenderPageBitmap	(JLandroid/graphics/Bitmap;IIIIIZ)V
    //   73: aload 9
    //   75: monitorexit
    //   76: return
    //   77: astore 10
    //   79: getstatic 26	com/shockwave/pdfium/PdfiumCore:TAG	Ljava/lang/String;
    //   82: astore 11
    //   84: ldc_w 319
    //   87: astore 15
    //   89: aload 11
    //   91: aload 15
    //   93: invokestatic 325	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   96: pop
    //   97: aload 10
    //   99: invokevirtual 328	java/lang/NullPointerException:printStackTrace	()V
    //   102: goto -29 -> 73
    //   105: astore 10
    //   107: aload 9
    //   109: monitorexit
    //   110: aload 10
    //   112: athrow
    //   113: astore 10
    //   115: getstatic 26	com/shockwave/pdfium/PdfiumCore:TAG	Ljava/lang/String;
    //   118: astore 11
    //   120: ldc_w 330
    //   123: astore 15
    //   125: aload 11
    //   127: aload 15
    //   129: invokestatic 325	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   132: pop
    //   133: aload 10
    //   135: invokevirtual 333	java/lang/Exception:printStackTrace	()V
    //   138: goto -65 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	PdfiumCore
    //   0	141	1	paramPdfDocument	PdfDocument
    //   0	141	2	paramBitmap	Bitmap
    //   0	141	3	paramInt1	int
    //   0	141	4	paramInt2	int
    //   0	141	5	paramInt3	int
    //   0	141	6	paramInt4	int
    //   0	141	7	paramInt5	int
    //   0	141	8	paramBoolean	boolean
    //   12	27	10	localObject2	Object
    //   77	21	10	localNullPointerException	NullPointerException
    //   105	6	10	localObject3	Object
    //   113	21	10	localException	Exception
    //   18	108	11	localObject4	Object
    //   43	13	12	l	long
    //   49	10	14	i	int
    //   87	41	15	str	String
    // Exception table:
    //   from	to	target	type
    //   8	12	77	java/lang/NullPointerException
    //   14	18	77	java/lang/NullPointerException
    //   22	29	77	java/lang/NullPointerException
    //   31	36	77	java/lang/NullPointerException
    //   38	43	77	java/lang/NullPointerException
    //   45	49	77	java/lang/NullPointerException
    //   68	73	77	java/lang/NullPointerException
    //   8	12	105	finally
    //   14	18	105	finally
    //   22	29	105	finally
    //   31	36	105	finally
    //   38	43	105	finally
    //   45	49	105	finally
    //   68	73	105	finally
    //   73	76	105	finally
    //   79	82	105	finally
    //   91	97	105	finally
    //   97	102	105	finally
    //   107	110	105	finally
    //   115	118	105	finally
    //   127	133	105	finally
    //   133	138	105	finally
    //   8	12	113	java/lang/Exception
    //   14	18	113	java/lang/Exception
    //   22	29	113	java/lang/Exception
    //   31	36	113	java/lang/Exception
    //   38	43	113	java/lang/Exception
    //   45	49	113	java/lang/Exception
    //   68	73	113	java/lang/Exception
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\shockwave\pdfium\PdfiumCore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */