package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class FlateDecode
{
  public static b decode(PDFObject paramPDFObject1, b paramb, PDFObject paramPDFObject2)
  {
    Object localObject1 = new java/util/zip/Inflater;
    ((Inflater)localObject1).<init>(false);
    int i = paramb.c();
    Object localObject2 = (byte[])null;
    boolean bool1 = paramb.g();
    int n;
    Object localObject4;
    if (bool1)
    {
      localObject2 = paramb.i();
      int k = paramb.h();
      n = paramb.a();
      k += n;
      ((Inflater)localObject1).setInput((byte[])localObject2, k, i);
      int j = paramb.a() + i;
      paramb.a(j);
      localObject2 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject2).<init>();
      localObject4 = new byte[i];
    }
    for (;;)
    {
      int m;
      try
      {
        boolean bool3 = ((Inflater)localObject1).finished();
        if (bool3)
        {
          localObject2 = b.d(((ByteArrayOutputStream)localObject2).toByteArray());
          if (paramPDFObject2 != null)
          {
            localObject1 = paramPDFObject2.getDictionary();
            localObject4 = "Predictor";
            boolean bool4 = ((HashMap)localObject1).containsKey(localObject4);
            if (bool4)
            {
              localObject1 = Predictor.getPredictor(paramPDFObject2);
              if (localObject1 != null) {
                localObject2 = ((Predictor)localObject1).unpredict((b)localObject2);
              }
            }
          }
          return (b)localObject2;
          localObject2 = new byte[i];
          paramb.a((byte[])localObject2);
          ((Inflater)localObject1).setInput((byte[])localObject2);
          break;
        }
        m = ((Inflater)localObject1).inflate((byte[])localObject4);
        if (m > 0) {
          break label287;
        }
        bool2 = ((Inflater)localObject1).needsDictionary();
        if (bool2)
        {
          localObject2 = new com/sun/pdfview/PDFParseException;
          localObject1 = "Don't know how to ask for a dictionary in FlateDecode";
          ((PDFParseException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
      }
      catch (DataFormatException localDataFormatException)
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("Data format exception:");
        localObject3 = localDataFormatException.getMessage();
        localObject3 = (String)localObject3;
        ((PDFParseException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      boolean bool2 = false;
      Object localObject3 = null;
      localObject3 = b.g(0);
      continue;
      label287:
      n = 0;
      ((ByteArrayOutputStream)localObject3).write((byte[])localObject4, 0, m);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\FlateDecode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */