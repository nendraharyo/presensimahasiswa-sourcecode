package com.sun.pdfview;

public class PDFDestination
{
  public static final int FIT = 1;
  public static final int FITB = 5;
  public static final int FITBH = 6;
  public static final int FITBV = 7;
  public static final int FITH = 2;
  public static final int FITR = 4;
  public static final int FITV = 3;
  public static final int XYZ;
  private float bottom;
  private float left;
  private PDFObject pageObj;
  private float right;
  private float top;
  private int type;
  private float zoom;
  
  protected PDFDestination(PDFObject paramPDFObject, int paramInt)
  {
    this.pageObj = paramPDFObject;
    this.type = paramInt;
  }
  
  private static PDFObject getDestFromName(PDFObject paramPDFObject1, PDFObject paramPDFObject2)
  {
    PDFObject localPDFObject = paramPDFObject2.getDictRef("Dests");
    String str;
    if (localPDFObject != null) {
      str = paramPDFObject1.getStringValue();
    }
    for (localPDFObject = localPDFObject.getDictRef(str);; localPDFObject = null) {
      return localPDFObject;
    }
  }
  
  private static PDFObject getDestFromString(PDFObject paramPDFObject1, PDFObject paramPDFObject2)
  {
    Object localObject1 = paramPDFObject2.getDictRef("Names");
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = "Dests";
      localObject1 = ((PDFObject)localObject1).getDictRef((String)localObject2);
      if (localObject1 != null)
      {
        localObject2 = new com/sun/pdfview/NameTree;
        ((NameTree)localObject2).<init>((PDFObject)localObject1);
        localObject1 = paramPDFObject1.getStringValue();
        localObject1 = ((NameTree)localObject2).find((String)localObject1);
        if (localObject1 != null)
        {
          int i = ((PDFObject)localObject1).getType();
          int j = 6;
          if (i == j) {
            localObject2 = "D";
          }
        }
      }
    }
    for (localObject1 = ((PDFObject)localObject1).getDictRef((String)localObject2);; localObject1 = null) {
      return (PDFObject)localObject1;
    }
  }
  
  public static PDFDestination getDestination(PDFObject paramPDFObject1, PDFObject paramPDFObject2)
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 0;
    int i1 = paramPDFObject1.getType();
    if (i1 == j) {
      paramPDFObject1 = getDestFromName(paramPDFObject1, paramPDFObject2);
    }
    for (;;)
    {
      if (paramPDFObject1 != null)
      {
        i1 = paramPDFObject1.getType();
        if (i1 == i) {
          break;
        }
      }
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Can't create destination from: ");
      localObject2 = paramPDFObject1;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
      i1 = paramPDFObject1.getType();
      if (i1 == k) {
        paramPDFObject1 = getDestFromString(paramPDFObject1, paramPDFObject2);
      }
    }
    Object localObject2 = paramPDFObject1.getArray();
    i1 = 1;
    Object localObject1 = localObject2[i1].getStringValue();
    Object localObject3 = "XYZ";
    boolean bool1 = ((String)localObject1).equals(localObject3);
    if (bool1)
    {
      localObject1 = new com/sun/pdfview/PDFDestination;
      localObject3 = localObject2[0];
      ((PDFDestination)localObject1).<init>((PDFObject)localObject3, 0);
      int i2 = ((PDFDestination)localObject1).getType();
      switch (i2)
      {
      }
    }
    for (;;)
    {
      return (PDFDestination)localObject1;
      localObject3 = "Fit";
      boolean bool2 = ((String)localObject1).equals(localObject3);
      if (bool2)
      {
        localObject1 = new com/sun/pdfview/PDFDestination;
        localObject3 = localObject2[0];
        n = 1;
        ((PDFDestination)localObject1).<init>((PDFObject)localObject3, n);
        break;
      }
      localObject3 = "FitH";
      bool2 = ((String)localObject1).equals(localObject3);
      if (bool2)
      {
        localObject1 = new com/sun/pdfview/PDFDestination;
        localObject3 = localObject2[0];
        ((PDFDestination)localObject1).<init>((PDFObject)localObject3, m);
        break;
      }
      localObject3 = "FitV";
      bool2 = ((String)localObject1).equals(localObject3);
      if (bool2)
      {
        localObject1 = new com/sun/pdfview/PDFDestination;
        localObject3 = localObject2[0];
        ((PDFDestination)localObject1).<init>((PDFObject)localObject3, k);
        break;
      }
      localObject3 = "FitR";
      bool2 = ((String)localObject1).equals(localObject3);
      if (bool2)
      {
        localObject1 = new com/sun/pdfview/PDFDestination;
        localObject3 = localObject2[0];
        ((PDFDestination)localObject1).<init>((PDFObject)localObject3, j);
        break;
      }
      localObject3 = "FitB";
      bool2 = ((String)localObject1).equals(localObject3);
      if (bool2)
      {
        localObject1 = new com/sun/pdfview/PDFDestination;
        localObject3 = localObject2[0];
        ((PDFDestination)localObject1).<init>((PDFObject)localObject3, i);
        break;
      }
      localObject3 = "FitBH";
      bool2 = ((String)localObject1).equals(localObject3);
      if (bool2)
      {
        localObject1 = new com/sun/pdfview/PDFDestination;
        localObject3 = localObject2[0];
        n = 6;
        ((PDFDestination)localObject1).<init>((PDFObject)localObject3, n);
        break;
      }
      localObject3 = "FitBV";
      bool2 = ((String)localObject1).equals(localObject3);
      if (bool2)
      {
        localObject1 = new com/sun/pdfview/PDFDestination;
        localObject3 = localObject2[0];
        n = 7;
        ((PDFDestination)localObject1).<init>((PDFObject)localObject3, n);
        break;
      }
      localObject2 = new com/sun/pdfview/PDFParseException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Unknown destination type: ");
      localObject1 = (String)localObject1;
      ((PDFParseException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      float f1 = localObject2[m].getFloatValue();
      ((PDFDestination)localObject1).setLeft(f1);
      localObject3 = localObject2[k];
      f1 = ((PDFObject)localObject3).getFloatValue();
      ((PDFDestination)localObject1).setTop(f1);
      localObject2 = localObject2[j];
      float f2 = ((PDFObject)localObject2).getFloatValue();
      ((PDFDestination)localObject1).setZoom(f2);
      continue;
      localObject2 = localObject2[m];
      f2 = ((PDFObject)localObject2).getFloatValue();
      ((PDFDestination)localObject1).setTop(f2);
      continue;
      localObject2 = localObject2[m];
      f2 = ((PDFObject)localObject2).getFloatValue();
      ((PDFDestination)localObject1).setLeft(f2);
      continue;
      f1 = localObject2[m].getFloatValue();
      ((PDFDestination)localObject1).setLeft(f1);
      f1 = localObject2[k].getFloatValue();
      ((PDFDestination)localObject1).setBottom(f1);
      localObject3 = localObject2[j];
      f1 = ((PDFObject)localObject3).getFloatValue();
      ((PDFDestination)localObject1).setRight(f1);
      localObject2 = localObject2[i];
      f2 = ((PDFObject)localObject2).getFloatValue();
      ((PDFDestination)localObject1).setTop(f2);
      continue;
      localObject2 = localObject2[m];
      f2 = ((PDFObject)localObject2).getFloatValue();
      ((PDFDestination)localObject1).setTop(f2);
      continue;
      localObject2 = localObject2[m];
      f2 = ((PDFObject)localObject2).getFloatValue();
      ((PDFDestination)localObject1).setLeft(f2);
    }
  }
  
  public float getBottom()
  {
    return this.bottom;
  }
  
  public float getLeft()
  {
    return this.left;
  }
  
  public PDFObject getPage()
  {
    return this.pageObj;
  }
  
  public float getRight()
  {
    return this.right;
  }
  
  public float getTop()
  {
    return this.top;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public float getZoom()
  {
    return this.zoom;
  }
  
  public void setBottom(float paramFloat)
  {
    this.bottom = paramFloat;
  }
  
  public void setLeft(float paramFloat)
  {
    this.left = paramFloat;
  }
  
  public void setRight(float paramFloat)
  {
    this.right = paramFloat;
  }
  
  public void setTop(float paramFloat)
  {
    this.top = paramFloat;
  }
  
  public void setZoom(float paramFloat)
  {
    this.zoom = paramFloat;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFDestination.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */