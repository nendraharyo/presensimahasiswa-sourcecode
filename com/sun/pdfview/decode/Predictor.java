package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;

public abstract class Predictor
{
  public static final int PNG = 1;
  public static final int TIFF;
  private int algorithm;
  private int bpc;
  private int colors;
  private int columns;
  
  protected Predictor(int paramInt)
  {
    this.colors = i;
    this.bpc = 8;
    this.columns = i;
    this.algorithm = paramInt;
  }
  
  public static Predictor getPredictor(PDFObject paramPDFObject)
  {
    Object localObject1 = null;
    Object localObject2 = paramPDFObject.getDictRef("Predictor");
    if (localObject2 == null) {}
    for (;;)
    {
      return (Predictor)localObject1;
      int i = ((PDFObject)localObject2).getIntValue();
      switch (i)
      {
      case 1: 
      default: 
        localObject1 = new com/sun/pdfview/PDFParseException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Unknown predictor: ");
        localObject2 = i;
        ((PDFParseException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      case 2: 
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("Tiff Predictor not supported");
        throw ((Throwable)localObject1);
      }
      localObject1 = new com/sun/pdfview/decode/PNGPredictor;
      ((PNGPredictor)localObject1).<init>();
      localObject2 = paramPDFObject.getDictRef("Colors");
      if (localObject2 != null)
      {
        i = ((PDFObject)localObject2).getIntValue();
        ((Predictor)localObject1).setColors(i);
      }
      localObject2 = paramPDFObject.getDictRef("BitsPerComponent");
      if (localObject2 != null)
      {
        i = ((PDFObject)localObject2).getIntValue();
        ((Predictor)localObject1).setBitsPerComponent(i);
      }
      localObject2 = paramPDFObject.getDictRef("Columns");
      if (localObject2 != null)
      {
        i = ((PDFObject)localObject2).getIntValue();
        ((Predictor)localObject1).setColumns(i);
      }
    }
  }
  
  public int getAlgorithm()
  {
    return this.algorithm;
  }
  
  public int getBitsPerComponent()
  {
    return this.bpc;
  }
  
  public int getColors()
  {
    return this.colors;
  }
  
  public int getColumns()
  {
    return this.columns;
  }
  
  public void setBitsPerComponent(int paramInt)
  {
    this.bpc = paramInt;
  }
  
  protected void setColors(int paramInt)
  {
    this.colors = paramInt;
  }
  
  public void setColumns(int paramInt)
  {
    this.columns = paramInt;
  }
  
  public abstract b unpredict(b paramb);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\Predictor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */