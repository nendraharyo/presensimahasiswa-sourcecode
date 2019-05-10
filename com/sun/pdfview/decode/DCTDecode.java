package com.sun.pdfview.decode;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.util.Log;
import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class DCTDecode
{
  protected static b decode(PDFObject paramPDFObject1, b paramb, PDFObject paramPDFObject2)
  {
    paramb.e();
    int i = paramb.c();
    Object localObject1 = new byte[i];
    paramb.a((byte[])localObject1);
    int j = localObject1.length;
    Object localObject2 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, j);
    if (localObject2 == null)
    {
      localObject2 = new com/sun/pdfview/PDFParseException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("could not decode image of compressed size ");
      i = localObject1.length;
      localObject1 = i;
      ((PDFParseException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    Object localObject3 = ((Bitmap)localObject2).getConfig();
    localObject1 = "ANDPDF.dctdecode";
    Object localObject4 = new java/lang/StringBuilder;
    String str = "decoded image type";
    ((StringBuilder)localObject4).<init>(str);
    localObject4 = localObject3;
    Log.e((String)localObject1, (String)localObject4);
    i = ((Bitmap)localObject2).getWidth() * 4;
    int k = ((Bitmap)localObject2).getHeight();
    i *= k;
    localObject4 = Bitmap.Config.RGB_565;
    if (localObject3 == localObject4)
    {
      i = ((Bitmap)localObject2).getWidth() * 2;
      j = ((Bitmap)localObject2).getHeight();
      i *= j;
    }
    localObject1 = ByteBuffer.allocate(i);
    ((Bitmap)localObject2).copyPixelsToBuffer((Buffer)localObject1);
    localObject1 = b.a((ByteBuffer)localObject1);
    ((b)localObject1).e();
    return (b)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\DCTDecode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */