package com.sun.pdfview;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import com.sun.pdfview.colorspace.PDFColorSpace;
import com.sun.pdfview.function.FunctionType0;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PDFImage
{
  private static final String TAG = "AWTPDF.pdfimage";
  public static boolean sShowImages;
  private int bpc;
  private int[] colorKeyMask = null;
  private PDFColorSpace colorSpace;
  private float[] decode;
  private int height;
  private boolean imageMask = false;
  private PDFObject imageObj;
  private PDFImage sMask;
  private int width;
  
  protected PDFImage(PDFObject paramPDFObject)
  {
    this.imageObj = paramPDFObject;
  }
  
  public static PDFImage createImage(PDFObject paramPDFObject, Map paramMap)
  {
    int i = 2;
    float f1 = 2.8E-45F;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = new com/sun/pdfview/PDFImage;
    ((PDFImage)localObject2).<init>(paramPDFObject);
    Object localObject3 = paramPDFObject.getDictRef("Width");
    if (localObject3 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unable to read image width: ");
      localObject2 = paramPDFObject;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int k = ((PDFObject)localObject3).getIntValue();
    ((PDFImage)localObject2).setWidth(k);
    localObject3 = paramPDFObject.getDictRef("Height");
    if (localObject3 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unable to get image height: ");
      localObject2 = paramPDFObject;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    k = ((PDFObject)localObject3).getIntValue();
    ((PDFImage)localObject2).setHeight(k);
    localObject3 = paramPDFObject.getDictRef("ImageMask");
    if (localObject3 != null)
    {
      m = ((PDFObject)localObject3).getBooleanValue();
      ((PDFImage)localObject2).setImageMask(m);
    }
    int m = ((PDFImage)localObject2).isImageMask();
    float f2;
    Object localObject4;
    float[] arrayOfFloat;
    label324:
    int n;
    if (m != 0)
    {
      m = 1;
      f2 = Float.MIN_VALUE;
      ((PDFImage)localObject2).setBitsPerComponent(m);
      new int[] { -16777216 }[1] = -1;
      localObject4 = paramPDFObject.getDictRef("Decode");
      int i1;
      if (localObject4 != null)
      {
        localObject4 = localObject4.getArray()[0];
        f2 = ((PDFObject)localObject4).getFloatValue();
        i1 = 1065353216;
        float f3 = 1.0F;
        boolean bool = f2 < f3;
        if (!bool)
        {
          localObject4 = new int[i];
          Object tmp272_270 = localObject4;
          tmp272_270[0] = -1;
          tmp272_270[1] = -16777216;
        }
      }
      localObject4 = PDFColorSpace.getColorSpace(0);
      ((PDFImage)localObject2).setColorSpace((PDFColorSpace)localObject4);
      localObject4 = paramPDFObject.getDictRef("Decode");
      if (localObject4 != null)
      {
        localObject4 = ((PDFObject)localObject4).getArray();
        i1 = localObject4.length;
        arrayOfFloat = new float[i1];
        i = localObject4.length;
        if (j < i) {
          break label546;
        }
        ((PDFImage)localObject2).setDecode(arrayOfFloat);
      }
      if (localObject3 == null)
      {
        localObject1 = paramPDFObject.getDictRef("SMask");
        if (localObject1 == null) {
          localObject1 = paramPDFObject.getDictRef("Mask");
        }
        if (localObject1 != null)
        {
          k = ((PDFObject)localObject1).getType();
          n = 7;
          f2 = 9.8E-45F;
          if (k != n) {
            break label600;
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = createImage((PDFObject)localObject1, paramMap);
        ((PDFImage)localObject2).setSMask((PDFImage)localObject1);
      }
      catch (IOException localIOException1)
      {
        label546:
        Object localObject5;
        p("ERROR: there was a problem parsing the mask for this object");
        dump(paramPDFObject);
        localObject3 = System.out;
        localIOException1.printStackTrace((PrintStream)localObject3);
        continue;
      }
      return (PDFImage)localObject2;
      localObject4 = paramPDFObject.getDictRef("BitsPerComponent");
      if (localObject4 == null)
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Unable to get bits per component: ");
        localObject2 = paramPDFObject;
        ((PDFParseException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      n = ((PDFObject)localObject4).getIntValue();
      ((PDFImage)localObject2).setBitsPerComponent(n);
      localObject4 = paramPDFObject.getDictRef("ColorSpace");
      if (localObject4 == null)
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("No ColorSpace for image: ");
        localObject2 = paramPDFObject;
        ((PDFParseException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject4 = PDFColorSpace.getColorSpace((PDFObject)localObject4, paramMap);
      ((PDFImage)localObject2).setColorSpace((PDFColorSpace)localObject4);
      break;
      localObject5 = localObject4[j];
      f1 = ((PDFObject)localObject5).getFloatValue();
      arrayOfFloat[j] = f1;
      j += 1;
      break label324;
      label600:
      k = localIOException1.getType();
      n = 5;
      f2 = 7.0E-45F;
      if (k == n) {
        try
        {
          ((PDFImage)localObject2).setColorKeyMask(localIOException1);
        }
        catch (IOException localIOException2)
        {
          p("ERROR: there was a problem parsing the color mask for this object");
          dump(paramPDFObject);
          localObject3 = System.out;
          localIOException2.printStackTrace((PrintStream)localObject3);
        }
      }
    }
  }
  
  public static void dump(PDFObject paramPDFObject)
  {
    Object localObject1 = new java/lang/StringBuilder;
    Object localObject2 = "dumping PDF object: ";
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = paramPDFObject;
    p((String)localObject1);
    if (paramPDFObject == null) {
      return;
    }
    localObject1 = paramPDFObject.getDictionary();
    localObject2 = new java/lang/StringBuilder;
    Object localObject3 = "   dict = ";
    ((StringBuilder)localObject2).<init>((String)localObject3);
    p(localObject1);
    localObject2 = ((HashMap)localObject1).keySet().iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject3 = ((Iterator)localObject2).next();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("key = ");
      localStringBuilder = localStringBuilder.append(localObject3);
      String str = " value = ";
      localStringBuilder = localStringBuilder.append(str);
      localObject3 = ((HashMap)localObject1).get(localObject3);
      localObject3 = localObject3;
      p((String)localObject3);
    }
  }
  
  private float[] normalize(byte[] paramArrayOfByte, float[] paramArrayOfFloat, int paramInt)
  {
    if (paramArrayOfFloat == null)
    {
      i = paramArrayOfByte.length + paramInt;
      paramArrayOfFloat = new float[i];
    }
    float[] arrayOfFloat = getDecode();
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfByte.length;
      if (i >= j) {
        return paramArrayOfFloat;
      }
      j = paramArrayOfByte[i] & 0xFF;
      double d1 = getBitsPerComponent();
      double d2 = Math.pow(2.0D, d1);
      int k = (int)d2 + -1;
      int m = i * 2;
      float f1 = arrayOfFloat[m];
      int n = i * 2 + 1;
      float f2 = arrayOfFloat[n];
      int i1 = paramInt + i;
      float f3 = j;
      float f4 = k;
      f3 = FunctionType0.interpolate(f3, 0.0F, f4, f1, f2);
      paramArrayOfFloat[i1] = f3;
      i += 1;
    }
  }
  
  public static void p(String paramString)
  {
    System.out.println(paramString);
  }
  
  private Bitmap parseData(byte[] paramArrayOfByte)
  {
    int i = -16777216;
    int j = 1;
    Object localObject1 = null;
    long l1 = System.currentTimeMillis();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Creating Image width=");
    int k = getWidth();
    localObject2 = ((StringBuilder)localObject2).append(k).append(", Height=");
    k = getHeight();
    localObject2 = ((StringBuilder)localObject2).append(k).append(", bpc=");
    k = getBitsPerComponent();
    localObject2 = ((StringBuilder)localObject2).append(k).append(",cs=");
    Object localObject3 = this.colorSpace;
    localObject2 = localObject3;
    Log.i("AWTPDF.pdfimage", (String)localObject2);
    Object localObject4 = this.colorSpace;
    if (localObject4 == null)
    {
      localObject4 = new java/lang/UnsupportedOperationException;
      ((UnsupportedOperationException)localObject4).<init>("image without colorspace");
      throw ((Throwable)localObject4);
    }
    localObject4 = this.colorSpace;
    int m = ((PDFColorSpace)localObject4).getType();
    int n;
    Object localObject5;
    int i2;
    int i3;
    label312:
    int i4;
    int i5;
    int i6;
    if (m == j)
    {
      n = getHeight();
      k = getWidth();
      m = paramArrayOfByte.length;
      i1 = k * 2 * n;
      if (m == i1)
      {
        localObject4 = Bitmap.Config.RGB_565;
        localObject4 = Bitmap.createBitmap(k, n, (Bitmap.Config)localObject4);
        localObject2 = ByteBuffer.wrap(paramArrayOfByte);
        ((Bitmap)localObject4).copyPixelsFromBuffer((Buffer)localObject2);
        long l2 = System.currentTimeMillis();
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>("millis for converting image=");
        l2 -= l1;
        localObject1 = l2;
        Log.i("AWTPDF.pdfimage", (String)localObject1);
        return (Bitmap)localObject4;
      }
      m = getWidth();
      i1 = getHeight();
      localObject5 = Bitmap.Config.ARGB_8888;
      localObject4 = Bitmap.createBitmap(m, i1, (Bitmap.Config)localObject5);
      localObject2 = new int[k];
      i2 = 0;
      i3 = 0;
      localObject5 = null;
      if (i2 < n)
      {
        i4 = i3;
        i3 = 0;
        localObject5 = null;
      }
      for (;;)
      {
        i5 = getWidth();
        if (i3 >= i5)
        {
          localObject5 = null;
          i5 = k;
          ((Bitmap)localObject4).setPixels((int[])localObject2, 0, k, 0, i2, k, j);
          i2 += 1;
          i3 = i4;
          break label312;
          break;
        }
        i5 = (paramArrayOfByte[i4] & 0xFF) << 8;
        i6 = i4 + 1;
        i6 = paramArrayOfByte[i6] & 0xFF;
        i5 = (i5 | i6) << 8;
        i6 = i4 + 2;
        i6 = paramArrayOfByte[i6] & 0xFF;
        i5 = i5 | i6 | i;
        localObject2[i3] = i5;
        i5 = i4 + 3;
        i3 += 1;
        i4 = i5;
      }
    }
    localObject4 = this.colorSpace;
    m = ((PDFColorSpace)localObject4).getType();
    if (m == 0)
    {
      m = getWidth();
      i1 = getHeight();
      localObject3 = Bitmap.Config.ARGB_8888;
      localObject4 = Bitmap.createBitmap(m, i1, (Bitmap.Config)localObject3);
      n = getHeight();
      k = getWidth();
      localObject2 = new int[k];
      i2 = 0;
      i3 = 0;
      localObject5 = null;
      label541:
      if (i2 < n)
      {
        i4 = i3;
        i3 = 0;
        localObject5 = null;
      }
      for (;;)
      {
        i5 = getWidth();
        if (i3 >= i5)
        {
          localObject5 = null;
          i5 = k;
          ((Bitmap)localObject4).setPixels((int[])localObject2, 0, k, 0, i2, k, j);
          i2 += 1;
          i3 = i4;
          break label541;
          break;
        }
        i5 = paramArrayOfByte[i4] & 0xFF;
        i6 = (i5 << 8 | i5) << 8;
        i5 = i5 | i6 | i;
        localObject2[i3] = i5;
        i5 = i4 + 1;
        i3 += 1;
        i4 = i5;
      }
    }
    localObject4 = this.colorSpace;
    m = ((PDFColorSpace)localObject4).getType();
    int i1 = 4;
    if (m == i1)
    {
      m = getWidth();
      i1 = getHeight();
      localObject3 = Bitmap.Config.ARGB_8888;
      localObject4 = Bitmap.createBitmap(m, i1, (Bitmap.Config)localObject3);
      n = getHeight();
      k = getWidth();
      localObject2 = new int[k];
      int[] arrayOfInt = new int[j];
      i2 = 0;
      i3 = 0;
      localObject5 = null;
      label748:
      if (i2 < n)
      {
        i4 = i3;
        i3 = 0;
        localObject5 = null;
      }
      for (;;)
      {
        i5 = getWidth();
        if (i3 >= i5)
        {
          localObject5 = null;
          i5 = k;
          ((Bitmap)localObject4).setPixels((int[])localObject2, 0, k, 0, i2, k, j);
          i2 += 1;
          i3 = i4;
          break label748;
          break;
        }
        i5 = paramArrayOfByte[i4] & 0xFF;
        arrayOfInt[0] = i5;
        PDFColorSpace localPDFColorSpace = this.colorSpace;
        i5 = localPDFColorSpace.toColor(arrayOfInt);
        localObject2[i3] = i5;
        i5 = i4 + 1;
        i3 += 1;
        i4 = i5;
      }
    }
    localObject4 = new java/lang/UnsupportedOperationException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("image with unsupported colorspace ");
    localObject1 = this.colorSpace;
    localObject2 = localObject1;
    ((UnsupportedOperationException)localObject4).<init>((String)localObject2);
    throw ((Throwable)localObject4);
  }
  
  private void setColorKeyMask(PDFObject paramPDFObject)
  {
    PDFObject[] arrayOfPDFObject = paramPDFObject.getArray();
    this.colorKeyMask = null;
    int[] arrayOfInt = new int[arrayOfPDFObject.length];
    int i = 0;
    for (;;)
    {
      int j = arrayOfInt.length;
      if (i >= j)
      {
        this.colorKeyMask = arrayOfInt;
        return;
      }
      PDFObject localPDFObject = arrayOfPDFObject[i];
      j = localPDFObject.getIntValue();
      arrayOfInt[i] = j;
      i += 1;
    }
  }
  
  protected int getBitsPerComponent()
  {
    return this.bpc;
  }
  
  protected PDFColorSpace getColorSpace()
  {
    return this.colorSpace;
  }
  
  protected float[] getDecode()
  {
    return this.decode;
  }
  
  public int getHeight()
  {
    return this.height;
  }
  
  public Bitmap getImage()
  {
    PrintStream localPrintStream = null;
    try
    {
      Object localObject1 = this.imageObj;
      localObject1 = ((PDFObject)localObject1).getCache();
      localObject1 = (Bitmap)localObject1;
      if (localObject1 == null)
      {
        bool = sShowImages;
        if (bool) {
          break label72;
        }
        localObject1 = new java/lang/UnsupportedOperationException;
        localObject4 = "do not show images";
        ((UnsupportedOperationException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    catch (IOException localIOException)
    {
      localPrintStream = System.out;
      localObject4 = "Error reading image";
      localPrintStream.println((String)localObject4);
      localIOException.printStackTrace();
      boolean bool = false;
      Object localObject2 = null;
      for (;;)
      {
        return (Bitmap)localObject2;
        localObject2 = this.imageObj;
        localObject2 = ((PDFObject)localObject2).getStream();
        localObject2 = parseData((byte[])localObject2);
        localObject4 = this.imageObj;
        ((PDFObject)localObject4).setCache(localObject2);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        label72:
        Log.e("AWTPDF.pdfimage", "image too large (OutOfMemoryError)");
        int i = 15;
        int j = 14;
        int k = 6;
        Object localObject4 = Bitmap.Config.RGB_565;
        Bitmap localBitmap = Bitmap.createBitmap(i, i, (Bitmap.Config)localObject4);
        Object localObject3 = new android/graphics/Canvas;
        ((Canvas)localObject3).<init>(localBitmap);
        ((Canvas)localObject3).drawColor(-65536);
        Paint localPaint = new android/graphics/Paint;
        localPaint.<init>();
        localPaint.setColor(-1);
        float f1 = j;
        float f2 = j;
        localObject4 = null;
        ((Canvas)localObject3).drawLine(0.0F, 0.0F, f1, f2, localPaint);
        float f3 = j;
        f1 = j;
        ((Canvas)localObject3).drawLine(0.0F, f3, f1, 0.0F, localPaint);
        float f4 = k;
        float f5 = k;
        float f6 = j;
        ((Canvas)localObject3).drawLine(f4, 0.0F, f5, f6, localPaint);
        f3 = k;
        f1 = j;
        f2 = k;
        ((Canvas)localObject3).drawLine(0.0F, f3, f1, f2, localPaint);
        localObject3 = localBitmap;
      }
    }
  }
  
  public PDFImage getSMask()
  {
    return this.sMask;
  }
  
  public int getWidth()
  {
    return this.width;
  }
  
  public boolean isImageMask()
  {
    return this.imageMask;
  }
  
  protected void setBitsPerComponent(int paramInt)
  {
    this.bpc = paramInt;
  }
  
  protected void setColorSpace(PDFColorSpace paramPDFColorSpace)
  {
    this.colorSpace = paramPDFColorSpace;
  }
  
  protected void setDecode(float[] paramArrayOfFloat)
  {
    this.decode = paramArrayOfFloat;
  }
  
  protected void setHeight(int paramInt)
  {
    this.height = paramInt;
  }
  
  public void setImageMask(boolean paramBoolean)
  {
    this.imageMask = paramBoolean;
  }
  
  protected void setSMask(PDFImage paramPDFImage)
  {
    this.sMask = paramPDFImage;
  }
  
  protected void setWidth(int paramInt)
  {
    this.width = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFImage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */