package com.sun.pdfview.font;

import android.content.res.Resources;
import com.sun.pdfview.PDFObject;
import java.io.InputStream;
import java.util.Properties;

public class BuiltinFont
  extends Type1Font
{
  private static final String[] baseFonts;
  private static final String[] mappedFonts;
  private static String pkg;
  private static Properties props;
  private static Resources resources;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String[] arrayOfString = new String[14];
    arrayOfString[0] = "Courier";
    arrayOfString[m] = "Courier-Bold";
    arrayOfString[k] = "Courier-BoldOblique";
    arrayOfString[j] = "Courier-Oblique";
    arrayOfString[i] = "Helvetica";
    arrayOfString[5] = "Helvetica-Bold";
    arrayOfString[6] = "Helvetica-BoldOblique";
    arrayOfString[7] = "Helvetica-Oblique";
    arrayOfString[8] = "Times-Roman";
    arrayOfString[9] = "Times-Bold";
    arrayOfString[10] = "Times-BoldItalic";
    arrayOfString[11] = "Times-Italic";
    arrayOfString[12] = "Symbol";
    arrayOfString[13] = "ZapfDingbats";
    baseFonts = arrayOfString;
    arrayOfString = new String[16];
    arrayOfString[0] = "Arial";
    arrayOfString[m] = "Helvetica";
    arrayOfString[k] = "Arial,Bold";
    arrayOfString[j] = "Helvetica-Bold";
    arrayOfString[i] = "Arial,BoldItalic";
    arrayOfString[5] = "Helvetica-BoldOblique";
    arrayOfString[6] = "Arial,Italic";
    arrayOfString[7] = "Helvetica-Oblique";
    arrayOfString[8] = "TimesNewRoman";
    arrayOfString[9] = "Times-Roman";
    arrayOfString[10] = "TimesNewRoman,Bold";
    arrayOfString[11] = "Times-Bold";
    arrayOfString[12] = "TimesNewRoman,BoldItalic";
    arrayOfString[13] = "Times-BoldItalic";
    arrayOfString[14] = "TimesNewRoman,Italic";
    arrayOfString[15] = "Times-Italic";
    mappedFonts = arrayOfString;
  }
  
  public BuiltinFont(String paramString, PDFObject paramPDFObject)
  {
    super(paramString, paramPDFObject, null);
    parseFont(paramString);
  }
  
  public BuiltinFont(String paramString, PDFObject paramPDFObject, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFObject, paramPDFFontDescriptor);
    String str1 = paramPDFFontDescriptor.getFontName();
    int j = 0;
    String str2 = null;
    Object localObject = baseFonts;
    int k = localObject.length;
    if (j >= k)
    {
      j = 0;
      str2 = null;
      label48:
      localObject = mappedFonts;
      k = localObject.length;
      if (j < k) {
        break label223;
      }
      j = paramPDFFontDescriptor.getFlags();
      k = 0x40000 & j;
      if (k != 0) {
        i = 1;
      }
      localObject = "Bold";
      int m = str1.indexOf((String)localObject);
      if (m > 0) {
        i |= 0x1;
      }
      m = paramPDFFontDescriptor.getItalicAngle();
      if (m == 0)
      {
        m = j & 0x20;
        if (m == 0) {}
      }
      else
      {
        i |= 0x2;
      }
      m = j & 0x1;
      if (m == 0) {
        break label324;
      }
      j = i & 0x1;
      if (j <= 0) {
        break label281;
      }
      j = i & 0x2;
      if (j <= 0) {
        break label281;
      }
      str2 = "Courier-BoldOblique";
    }
    for (;;)
    {
      parseFont(str2);
      for (;;)
      {
        return;
        localObject = baseFonts[j];
        boolean bool = str1.equalsIgnoreCase((String)localObject);
        if (bool)
        {
          parseFont(str1);
        }
        else
        {
          j += 1;
          break;
          label223:
          localObject = mappedFonts[j];
          bool = str1.equalsIgnoreCase((String)localObject);
          if (!bool) {
            break label272;
          }
          arrayOfString = mappedFonts;
          j += 1;
          str2 = arrayOfString[j];
          parseFont(str2);
        }
      }
      label272:
      j += 2;
      break label48;
      label281:
      j = i & 0x1;
      if (j > 0)
      {
        str2 = "Courier-Bold";
      }
      else
      {
        j = i & 0x2;
        if (j > 0)
        {
          str2 = "Courier-Oblique";
        }
        else
        {
          str2 = "Courier";
          continue;
          label324:
          j &= 0x2;
          if (j != 0)
          {
            j = i & 0x1;
            if (j > 0)
            {
              j = i & 0x2;
              if (j > 0)
              {
                str2 = "Times-BoldItalic";
                continue;
              }
            }
            j = i & 0x1;
            if (j > 0)
            {
              str2 = "Times-Bold";
            }
            else
            {
              j = i & 0x2;
              if (j > 0) {
                str2 = "Times-Italic";
              } else {
                str2 = "Times-Roman";
              }
            }
          }
          else
          {
            j = i & 0x1;
            if (j > 0)
            {
              j = i & 0x2;
              if (j > 0)
              {
                str2 = "Helvetica-BoldOblique";
                continue;
              }
            }
            j = i & 0x1;
            if (j > 0)
            {
              str2 = "Helvetica-Bold";
            }
            else
            {
              j = i & 0x2;
              if (j > 0) {
                str2 = "Helvetica-Oblique";
              } else {
                str2 = "Helvetica";
              }
            }
          }
        }
      }
    }
  }
  
  private void parseFont(String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = props;
    if (localObject2 == null)
    {
      localObject2 = new java/util/Properties;
      ((Properties)localObject2).<init>();
      props = (Properties)localObject2;
    }
    try
    {
      localObject2 = props;
      localObject4 = BuiltinFont.class;
      localObject5 = "res/BaseFonts.properties";
      localObject4 = ((Class)localObject4).getResourceAsStream((String)localObject5);
      ((Properties)localObject2).load((InputStream)localObject4);
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        boolean bool1;
        localObject3 = props;
        localObject4 = resources;
        localObject5 = resources;
        localObject6 = "basefonts";
        localObject7 = "raw";
        str1 = pkg;
        m = ((Resources)localObject5).getIdentifier((String)localObject6, (String)localObject7, str1);
        localObject4 = ((Resources)localObject4).openRawResource(m);
        ((Properties)localObject3).load((InputStream)localObject4);
      }
      localObject3 = props;
      localObject4 = new java/lang/StringBuilder;
      localObject5 = String.valueOf(paramString);
      ((StringBuilder)localObject4).<init>((String)localObject5);
      localObject4 = ".file";
      localObject4 = ((Properties)localObject3).getProperty((String)localObject4);
      localObject3 = props;
      localObject5 = new java/lang/StringBuilder;
      localObject6 = String.valueOf(paramString);
      ((StringBuilder)localObject5).<init>((String)localObject6);
      localObject5 = ".length";
      m = Integer.parseInt(((Properties)localObject3).getProperty((String)localObject5));
      localObject6 = new byte[m];
      localObject7 = new java/lang/StringBuilder;
      String str1 = "res/";
      ((StringBuilder)localObject7).<init>(str1);
      localObject7 = (String)localObject4;
      localObject3 = BuiltinFont.class.getResourceAsStream((String)localObject7);
      if (localObject3 != null) {
        break label410;
      }
      localObject3 = resources;
      localObject7 = resources;
      int n = ((String)localObject4).indexOf('.');
      localObject4 = ((String)localObject4).substring(0, n);
      str1 = "raw";
      String str2 = pkg;
      i1 = ((Resources)localObject7).getIdentifier((String)localObject4, str1, str2);
      localObject3 = ((Resources)localObject3).openRawResource(i1);
      i1 = 0;
      localObject4 = null;
    }
    localObject2 = props;
    Object localObject4 = new java/lang/StringBuilder;
    Object localObject5 = String.valueOf(paramString);
    ((StringBuilder)localObject4).<init>((String)localObject5);
    localObject5 = ".file";
    localObject4 = (String)localObject5;
    bool1 = ((Properties)localObject2).containsKey(localObject4);
    if (!bool1)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("Unknown Base Font: ");
      localObject4 = paramString;
      ((IllegalArgumentException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
    }
    Object localObject3;
    Object localObject6;
    Object localObject7;
    int m;
    int i1;
    label410:
    int j;
    if (i1 >= m)
    {
      ((InputStream)localObject3).close();
      j = localObject6[0] & 0xFF;
      i1 = 128;
      if (j != i1) {
        break label657;
      }
      j = localObject6[2] & 0xFF;
      i1 = (localObject6[3] & 0xFF) << 8;
      j |= i1;
      i1 = (localObject6[4] & 0xFF) << 16;
      j |= i1;
      i1 = (localObject6[5] & 0xFF) << 24;
      i1 = (j | i1) + 6;
      j = i1 + 2;
      j = localObject6[j] & 0xFF;
      i = i1 + 3;
      i = (localObject6[i] & 0xFF) << 8;
      j |= i;
      i = i1 + 4;
      i = (localObject6[i] & 0xFF) << 16;
      j |= i;
      i = i1 + 5;
      i = (localObject6[i] & 0xFF) << 24;
      j |= i;
      i1 += 6;
    }
    for (;;)
    {
      parseFont((byte[])localObject6, i1, j);
      return;
      int i2 = m - i1;
      i2 = ((InputStream)localObject3).read((byte[])localObject6, i1, i2);
      i1 += i2;
      break;
      label657:
      localObject3 = props;
      localObject4 = new java/lang/StringBuilder;
      localObject1 = String.valueOf(paramString);
      ((StringBuilder)localObject4).<init>((String)localObject1);
      localObject4 = ".length1";
      i1 = Integer.parseInt(((Properties)localObject3).getProperty((String)localObject4));
      localObject3 = props;
      localObject1 = new java/lang/StringBuilder;
      localObject7 = String.valueOf(paramString);
      ((StringBuilder)localObject1).<init>((String)localObject7);
      localObject7 = ".length2";
      localObject1 = (String)localObject7;
      boolean bool2 = ((Properties)localObject3).containsKey(localObject1);
      int k;
      if (bool2)
      {
        localObject3 = props;
        localObject1 = new java/lang/StringBuilder;
        localObject5 = String.valueOf(paramString);
        ((StringBuilder)localObject1).<init>((String)localObject5);
        localObject5 = ".lenth2";
        localObject1 = (String)localObject5;
        localObject3 = ((Properties)localObject3).getProperty((String)localObject1);
        k = Integer.parseInt((String)localObject3);
      }
      else
      {
        k = m - i1;
      }
    }
  }
  
  public static void setResources(Resources paramResources, String paramString)
  {
    resources = paramResources;
    pkg = paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\BuiltinFont.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */