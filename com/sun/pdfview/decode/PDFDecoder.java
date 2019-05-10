package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import com.sun.pdfview.decrypt.PDFDecrypter;

public class PDFDecoder
{
  public static b decodeStream(PDFObject paramPDFObject, b paramb)
  {
    int i = 4;
    int j = 1;
    int k = 0;
    Object localObject1 = paramPDFObject.getDictRef("Filter");
    if (localObject1 == null)
    {
      localObject1 = paramPDFObject.getDecrypter();
      paramb = ((PDFDecrypter)localObject1).decryptBuffer(null, paramPDFObject, paramb);
    }
    Object localObject3;
    String str;
    boolean bool2;
    label121:
    label142:
    do
    {
      return paramb;
      int m = ((PDFObject)localObject1).getType();
      if (m != i) {
        break;
      }
      localObject2 = new PDFObject[j];
      localObject2[0] = localObject1;
      localObject1 = new PDFObject[j];
      localObject3 = paramPDFObject.getDictRef("DecodeParms");
      localObject1[0] = localObject3;
      int n = localObject2.length;
      if (n == 0) {
        break label272;
      }
      localObject3 = localObject2[0].getStringValue();
      str = "Crypt";
      bool2 = ((String)localObject3).equals(str);
      if (!bool2) {
        break label272;
      }
      if (j == 0)
      {
        localObject4 = paramPDFObject.getDecrypter();
        paramb = ((PDFDecrypter)localObject4).decryptBuffer(null, paramPDFObject, paramb);
      }
      j = localObject2.length;
    } while (k >= j);
    Object localObject4 = localObject2[k].getStringValue();
    if (localObject4 != null)
    {
      localObject3 = "FlateDecode";
      bool2 = ((String)localObject4).equals(localObject3);
      if (!bool2)
      {
        localObject3 = "Fl";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {
          break label280;
        }
      }
      localObject4 = localObject1[k];
      paramb = FlateDecode.decode(paramPDFObject, paramb, (PDFObject)localObject4);
    }
    for (;;)
    {
      k += 1;
      break label142;
      localObject2 = ((PDFObject)localObject1).getArray();
      localObject1 = paramPDFObject.getDictRef("DecodeParms");
      if (localObject1 != null)
      {
        localObject1 = ((PDFObject)localObject1).getArray();
        break;
      }
      int i1 = localObject2.length;
      localObject1 = new PDFObject[i1];
      break;
      label272:
      j = 0;
      localObject4 = null;
      break label121;
      label280:
      localObject3 = "LZWDecode";
      bool2 = ((String)localObject4).equals(localObject3);
      if (!bool2)
      {
        localObject3 = "LZW";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {}
      }
      else
      {
        localObject4 = localObject1[k];
        paramb = LZWDecode.decode(paramb, (PDFObject)localObject4);
        continue;
      }
      localObject3 = "ASCII85Decode";
      bool2 = ((String)localObject4).equals(localObject3);
      if (!bool2)
      {
        localObject3 = "A85";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {}
      }
      else
      {
        localObject4 = localObject1[k];
        paramb = ASCII85Decode.decode(paramb, (PDFObject)localObject4);
        continue;
      }
      localObject3 = "ASCIIHexDecode";
      bool2 = ((String)localObject4).equals(localObject3);
      if (!bool2)
      {
        localObject3 = "AHx";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {}
      }
      else
      {
        localObject4 = localObject1[k];
        paramb = ASCIIHexDecode.decode(paramb, (PDFObject)localObject4);
        continue;
      }
      localObject3 = "RunLengthDecode";
      bool2 = ((String)localObject4).equals(localObject3);
      if (!bool2)
      {
        localObject3 = "RL";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {}
      }
      else
      {
        localObject4 = localObject1[k];
        paramb = RunLengthDecode.decode(paramb, (PDFObject)localObject4);
        continue;
      }
      localObject3 = "DCTDecode";
      bool2 = ((String)localObject4).equals(localObject3);
      if (!bool2)
      {
        localObject3 = "DCT";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {}
      }
      else
      {
        localObject4 = localObject1[k];
        paramb = DCTDecode.decode(paramPDFObject, paramb, (PDFObject)localObject4);
        continue;
      }
      localObject3 = "CCITTFaxDecode";
      bool2 = ((String)localObject4).equals(localObject3);
      if (!bool2)
      {
        localObject3 = "CCF";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {}
      }
      else
      {
        localObject4 = localObject1[k];
        paramb = CCITTFaxDecode.decode(paramPDFObject, paramb, (PDFObject)localObject4);
        continue;
      }
      localObject3 = "Crypt";
      boolean bool1 = ((String)localObject4).equals(localObject3);
      if (!bool1) {
        break label698;
      }
      localObject4 = "Identity";
      localObject3 = localObject1[k];
      if (localObject3 != null)
      {
        localObject3 = localObject1[k];
        str = "Name";
        localObject3 = ((PDFObject)localObject3).getDictRef(str);
        if (localObject3 != null)
        {
          int i2 = ((PDFObject)localObject3).getType();
          if (i2 == i) {
            localObject4 = ((PDFObject)localObject3).getStringValue();
          }
        }
      }
      localObject3 = paramPDFObject.getDecrypter();
      paramb = ((PDFDecrypter)localObject3).decryptBuffer((String)localObject4, null, paramb);
    }
    label698:
    localObject1 = new com/sun/pdfview/PDFParseException;
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>("Unknown coding method:");
    Object localObject2 = localObject2[k].getStringValue();
    localObject2 = (String)localObject2;
    ((PDFParseException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\PDFDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */