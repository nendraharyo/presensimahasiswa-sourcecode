package com.sun.pdfview;

import android.graphics.Bitmap;
import c.a.a.d.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cache
{
  private Map pages;
  
  public Cache()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    this.pages = ((Map)localObject);
  }
  
  public void addImage(PDFPage paramPDFPage, ImageInfo paramImageInfo, Bitmap paramBitmap)
  {
    addImageRecord(paramPDFPage, paramImageInfo, paramBitmap, null);
  }
  
  public void addImage(PDFPage paramPDFPage, ImageInfo paramImageInfo, Bitmap paramBitmap, PDFRenderer paramPDFRenderer)
  {
    addImageRecord(paramPDFPage, paramImageInfo, paramBitmap, paramPDFRenderer);
  }
  
  Cache.Record addImageRecord(PDFPage paramPDFPage, ImageInfo paramImageInfo, Bitmap paramBitmap, PDFRenderer paramPDFRenderer)
  {
    Object localObject1 = new java/lang/Integer;
    int i = paramPDFPage.getPageNumber();
    ((Integer)localObject1).<init>(i);
    Object localObject2 = getPageRecord((Integer)localObject1);
    if (localObject2 == null)
    {
      i = 0;
      localObject2 = addPageRecord((Integer)localObject1, paramPDFPage, null);
    }
    localObject1 = new com/sun/pdfview/Cache$Record;
    ((Cache.Record)localObject1).<init>(this);
    ((Cache.Record)localObject1).value = paramBitmap;
    ((Cache.Record)localObject1).generator = paramPDFRenderer;
    localObject2 = ((Cache.PageRecord)localObject2).images;
    b localb = new c/a/a/d/b;
    localb.<init>(localObject1);
    ((Map)localObject2).put(paramImageInfo, localb);
    return (Cache.Record)localObject1;
  }
  
  public void addPage(Integer paramInteger, PDFPage paramPDFPage)
  {
    addPageRecord(paramInteger, paramPDFPage, null);
  }
  
  public void addPage(Integer paramInteger, PDFPage paramPDFPage, PDFParser paramPDFParser)
  {
    addPageRecord(paramInteger, paramPDFPage, paramPDFParser);
  }
  
  Cache.PageRecord addPageRecord(Integer paramInteger, PDFPage paramPDFPage, PDFParser paramPDFParser)
  {
    Cache.PageRecord localPageRecord = new com/sun/pdfview/Cache$PageRecord;
    localPageRecord.<init>(this);
    localPageRecord.value = paramPDFPage;
    localPageRecord.generator = paramPDFParser;
    Map localMap = this.pages;
    b localb = new c/a/a/d/b;
    localb.<init>(localPageRecord);
    localMap.put(paramInteger, localb);
    return localPageRecord;
  }
  
  public Bitmap getImage(PDFPage paramPDFPage, ImageInfo paramImageInfo)
  {
    Object localObject = getImageRecord(paramPDFPage, paramImageInfo);
    if (localObject != null) {}
    for (localObject = (Bitmap)((Cache.Record)localObject).value;; localObject = null) {
      return (Bitmap)localObject;
    }
  }
  
  Cache.Record getImageRecord(PDFPage paramPDFPage, ImageInfo paramImageInfo)
  {
    Object localObject1 = new java/lang/Integer;
    int i = paramPDFPage.getPageNumber();
    ((Integer)localObject1).<init>(i);
    localObject1 = getPageRecord((Integer)localObject1);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = (b)((Cache.PageRecord)localObject1).images.get(paramImageInfo);
      if (localObject1 != null)
      {
        localObject2 = ((b)localObject1).a();
        if (localObject2 == null) {
          localObject2 = " not in ";
        }
      }
    }
    for (localObject1 = (Cache.Record)((b)localObject1).a();; localObject1 = null)
    {
      return (Cache.Record)localObject1;
      localObject2 = " in ";
      break;
    }
  }
  
  public PDFRenderer getImageRenderer(PDFPage paramPDFPage, ImageInfo paramImageInfo)
  {
    Object localObject = getImageRecord(paramPDFPage, paramImageInfo);
    if (localObject != null) {}
    for (localObject = (PDFRenderer)((Cache.Record)localObject).generator;; localObject = null) {
      return (PDFRenderer)localObject;
    }
  }
  
  public PDFPage getPage(Integer paramInteger)
  {
    Object localObject = getPageRecord(paramInteger);
    if (localObject != null) {}
    for (localObject = (PDFPage)((Cache.PageRecord)localObject).value;; localObject = null) {
      return (PDFPage)localObject;
    }
  }
  
  public PDFParser getPageParser(Integer paramInteger)
  {
    Object localObject = getPageRecord(paramInteger);
    if (localObject != null) {}
    for (localObject = (PDFParser)((Cache.PageRecord)localObject).generator;; localObject = null) {
      return (PDFParser)localObject;
    }
  }
  
  Cache.PageRecord getPageRecord(Integer paramInteger)
  {
    Object localObject1 = (b)this.pages.get(paramInteger);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((b)localObject1).a();
      if (localObject2 == null) {
        localObject2 = " not in ";
      }
    }
    for (localObject1 = (Cache.PageRecord)((b)localObject1).a();; localObject1 = null)
    {
      return (Cache.PageRecord)localObject1;
      localObject2 = " in ";
      break;
    }
  }
  
  public void removeImage(PDFPage paramPDFPage, ImageInfo paramImageInfo)
  {
    removeImageRecord(paramPDFPage, paramImageInfo);
  }
  
  Cache.Record removeImageRecord(PDFPage paramPDFPage, ImageInfo paramImageInfo)
  {
    Object localObject = new java/lang/Integer;
    int i = paramPDFPage.getPageNumber();
    ((Integer)localObject).<init>(i);
    localObject = getPageRecord((Integer)localObject);
    if (localObject != null)
    {
      localObject = (b)((Cache.PageRecord)localObject).images.remove(paramImageInfo);
      if (localObject == null) {}
    }
    for (localObject = (Cache.Record)((b)localObject).a();; localObject = null) {
      return (Cache.Record)localObject;
    }
  }
  
  public void removePage(Integer paramInteger)
  {
    removePageRecord(paramInteger);
  }
  
  Cache.PageRecord removePageRecord(Integer paramInteger)
  {
    Object localObject = (b)this.pages.remove(paramInteger);
    if (localObject != null) {}
    for (localObject = (Cache.PageRecord)((b)localObject).a();; localObject = null) {
      return (Cache.PageRecord)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\Cache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */