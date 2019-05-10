package com.sun.pdfview.colorspace;

import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFPaint;
import com.sun.pdfview.PDFParseException;
import com.sun.pdfview.function.PDFFunction;
import java.util.Map;

public abstract class PDFColorSpace
{
  public static final int COLORSPACE_ALTERNATE = 5;
  public static final int COLORSPACE_CMYK = 2;
  public static final int COLORSPACE_GRAY = 0;
  public static final int COLORSPACE_INDEXED = 4;
  public static final int COLORSPACE_PATTERN = 3;
  public static final int COLORSPACE_RGB = 1;
  private static PDFColorSpace cmykSpace;
  private static PDFColorSpace graySpace;
  private static PDFColorSpace patternSpace;
  private static PDFColorSpace rgbSpace;
  
  static
  {
    Object localObject = new com/sun/pdfview/colorspace/RGBColorSpace;
    ((RGBColorSpace)localObject).<init>();
    rgbSpace = (PDFColorSpace)localObject;
    localObject = new com/sun/pdfview/colorspace/CMYKColorSpace;
    ((CMYKColorSpace)localObject).<init>();
    cmykSpace = (PDFColorSpace)localObject;
    localObject = new com/sun/pdfview/colorspace/RGBColorSpace;
    ((RGBColorSpace)localObject).<init>();
    patternSpace = (PDFColorSpace)localObject;
    localObject = new com/sun/pdfview/colorspace/GrayColorSpace;
    ((GrayColorSpace)localObject).<init>();
    graySpace = (PDFColorSpace)localObject;
  }
  
  public static PDFColorSpace getColorSpace(int paramInt)
  {
    Object localObject1;
    switch (paramInt)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unknown Color Space name: ");
      localObject2 = paramInt;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
      localObject1 = graySpace;
    }
    for (;;)
    {
      return (PDFColorSpace)localObject1;
      localObject1 = rgbSpace;
      continue;
      localObject1 = cmykSpace;
      continue;
      localObject1 = patternSpace;
    }
  }
  
  public static PDFColorSpace getColorSpace(PDFObject paramPDFObject, Map paramMap)
  {
    Object localObject1 = null;
    int i = 3;
    int j = 2;
    int k = 1;
    if (paramMap != null) {}
    for (Object localObject2 = (PDFObject)paramMap.get("ColorSpace");; localObject2 = null)
    {
      int m = paramPDFObject.getType();
      int n = 4;
      boolean bool2;
      if (m == n)
      {
        localObject3 = paramPDFObject.getStringValue();
        localObject4 = "DeviceGray";
        bool2 = ((String)localObject3).equals(localObject4);
        if (!bool2)
        {
          localObject4 = "G";
          bool2 = ((String)localObject3).equals(localObject4);
          if (!bool2) {}
        }
        else
        {
          localObject2 = getColorSpace(0);
        }
      }
      for (;;)
      {
        return (PDFColorSpace)localObject2;
        localObject4 = "DeviceRGB";
        bool2 = ((String)localObject3).equals(localObject4);
        if (!bool2)
        {
          localObject4 = "RGB";
          bool2 = ((String)localObject3).equals(localObject4);
          if (!bool2) {}
        }
        else
        {
          localObject2 = getColorSpace(k);
          continue;
        }
        localObject4 = "DeviceCMYK";
        bool2 = ((String)localObject3).equals(localObject4);
        if (!bool2)
        {
          localObject4 = "CMYK";
          bool2 = ((String)localObject3).equals(localObject4);
          if (!bool2) {}
        }
        else
        {
          localObject2 = getColorSpace(j);
          continue;
        }
        localObject4 = "Pattern";
        bool2 = ((String)localObject3).equals(localObject4);
        if (bool2)
        {
          localObject2 = getColorSpace(i);
        }
        else
        {
          if (localObject2 != null) {
            paramPDFObject = ((PDFObject)localObject2).getDictRef((String)localObject3);
          }
          if (paramPDFObject == null)
          {
            localObject2 = null;
          }
          else
          {
            localObject2 = paramPDFObject.getCache();
            if (localObject2 != null)
            {
              localObject2 = (PDFColorSpace)paramPDFObject.getCache();
            }
            else
            {
              localObject1 = paramPDFObject.getArray();
              localObject2 = localObject1[0].getStringValue();
              localObject3 = "CalGray";
              boolean bool1 = ((String)localObject2).equals(localObject3);
              if (bool1) {
                localObject2 = graySpace;
              }
              for (;;)
              {
                paramPDFObject.setCache(localObject2);
                break;
                localObject3 = "CalRGB";
                bool1 = ((String)localObject2).equals(localObject3);
                if (bool1)
                {
                  localObject2 = rgbSpace;
                }
                else
                {
                  localObject3 = "Lab";
                  bool1 = ((String)localObject2).equals(localObject3);
                  if (bool1)
                  {
                    localObject2 = rgbSpace;
                  }
                  else
                  {
                    localObject3 = "ICCBased";
                    bool1 = ((String)localObject2).equals(localObject3);
                    if (bool1)
                    {
                      localObject2 = rgbSpace;
                    }
                    else
                    {
                      localObject3 = "Separation";
                      bool1 = ((String)localObject2).equals(localObject3);
                      if (!bool1)
                      {
                        localObject3 = "DeviceN";
                        bool1 = ((String)localObject2).equals(localObject3);
                        if (!bool1) {}
                      }
                      else
                      {
                        localObject3 = getColorSpace(localObject1[j], paramMap);
                        localObject1 = PDFFunction.getFunction(localObject1[i]);
                        localObject2 = new com/sun/pdfview/colorspace/AlternateColorSpace;
                        ((AlternateColorSpace)localObject2).<init>((PDFColorSpace)localObject3, (PDFFunction)localObject1);
                        continue;
                      }
                      localObject3 = "Indexed";
                      bool1 = ((String)localObject2).equals(localObject3);
                      if (!bool1)
                      {
                        localObject3 = "I";
                        bool1 = ((String)localObject2).equals(localObject3);
                        if (!bool1) {
                          break label528;
                        }
                      }
                      localObject3 = getColorSpace(localObject1[k], paramMap);
                      int i1 = localObject1[j].getIntValue();
                      localObject2 = new com/sun/pdfview/colorspace/IndexedColor;
                      localObject1 = localObject1[i];
                      ((IndexedColor)localObject2).<init>((PDFColorSpace)localObject3, i1, (PDFObject)localObject1);
                    }
                  }
                }
              }
              label528:
              localObject3 = "Pattern";
              bool1 = ((String)localObject2).equals(localObject3);
              if (!bool1) {
                break;
              }
              localObject2 = rgbSpace;
            }
          }
        }
      }
      Object localObject3 = new com/sun/pdfview/PDFParseException;
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("Unknown color space: ");
      localObject2 = ((StringBuilder)localObject4).append((String)localObject2).append(" with ");
      localObject1 = localObject1[k];
      localObject2 = localObject1;
      ((PDFParseException)localObject3).<init>((String)localObject2);
      throw ((Throwable)localObject3);
    }
  }
  
  public PDFPaint getFillPaint(float[] paramArrayOfFloat)
  {
    return PDFPaint.getPaint(toColor(paramArrayOfFloat));
  }
  
  public abstract String getName();
  
  public abstract int getNumComponents();
  
  public PDFPaint getPaint(float[] paramArrayOfFloat)
  {
    return PDFPaint.getColorPaint(toColor(paramArrayOfFloat));
  }
  
  public abstract int getType();
  
  public abstract int toColor(float[] paramArrayOfFloat);
  
  public abstract int toColor(int[] paramArrayOfInt);
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("ColorSpace[");
    String str = getName();
    return str + "]";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\colorspace\PDFColorSpace.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */