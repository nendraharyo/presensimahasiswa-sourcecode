package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;

public class CCITTFaxDecode
{
  protected static b decode(PDFObject paramPDFObject1, b paramb, PDFObject paramPDFObject2)
  {
    byte[] arrayOfByte = new byte[paramb.c()];
    int i = arrayOfByte.length;
    paramb.a(arrayOfByte, 0, i);
    return b.d(decode(paramPDFObject1, arrayOfByte));
  }
  
  protected static byte[] decode(PDFObject paramPDFObject, byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 1728;
    PDFObject localPDFObject = paramPDFObject.getDictRef("Width");
    if (localPDFObject == null) {
      localPDFObject = paramPDFObject.getDictRef("W");
    }
    if (localPDFObject != null) {
      j = localPDFObject.getIntValue();
    }
    localPDFObject = paramPDFObject.getDictRef("Height");
    if (localPDFObject == null) {
      localPDFObject = paramPDFObject.getDictRef("H");
    }
    int m;
    if (localPDFObject != null) {
      m = localPDFObject.getIntValue();
    }
    for (;;)
    {
      j = getOptionFieldInt(paramPDFObject, "Columns", j);
      m = getOptionFieldInt(paramPDFObject, "Rows", m);
      String str1 = "K";
      int n = getOptionFieldInt(paramPDFObject, str1, 0);
      int i1 = (j + 7 >> 3) * m;
      byte[] arrayOfByte = new byte[i1];
      String str2 = "EncodedByteAlign";
      boolean bool2 = getOptionFieldBoolean(paramPDFObject, str2, false);
      CCITTFaxDecoder localCCITTFaxDecoder = new com/sun/pdfview/decode/CCITTFaxDecoder;
      int i2 = 1;
      localCCITTFaxDecoder.<init>(i2, j, m);
      localCCITTFaxDecoder.setAlign(bool2);
      if (n == 0)
      {
        localCCITTFaxDecoder.decodeT41D(arrayOfByte, paramArrayOfByte, 0, m);
        String str3 = "BlackIs1";
        boolean bool1 = getOptionFieldBoolean(paramPDFObject, str3, false);
        if (bool1) {}
      }
      for (;;)
      {
        int k = arrayOfByte.length;
        if (i >= k)
        {
          return arrayOfByte;
          if (n > 0)
          {
            localCCITTFaxDecoder.decodeT42D(arrayOfByte, paramArrayOfByte, 0, m);
            break;
          }
          if (n >= 0) {
            break;
          }
          localCCITTFaxDecoder.decodeT6(arrayOfByte, paramArrayOfByte, 0, m);
          break;
        }
        k = (byte)(arrayOfByte[i] ^ 0xFFFFFFFF);
        arrayOfByte[i] = k;
        i += 1;
      }
      m = 0;
      localPDFObject = null;
    }
  }
  
  public static boolean getOptionFieldBoolean(PDFObject paramPDFObject, String paramString, boolean paramBoolean)
  {
    PDFObject localPDFObject = paramPDFObject.getDictRef("DecodeParms");
    if (localPDFObject == null) {}
    for (;;)
    {
      return paramBoolean;
      localPDFObject = localPDFObject.getDictRef(paramString);
      if (localPDFObject != null) {
        paramBoolean = localPDFObject.getBooleanValue();
      }
    }
  }
  
  public static int getOptionFieldInt(PDFObject paramPDFObject, String paramString, int paramInt)
  {
    PDFObject localPDFObject = paramPDFObject.getDictRef("DecodeParms");
    if (localPDFObject == null) {}
    for (;;)
    {
      return paramInt;
      localPDFObject = localPDFObject.getDictRef(paramString);
      if (localPDFObject != null) {
        paramInt = localPDFObject.getIntValue();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\CCITTFaxDecode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */