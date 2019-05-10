package com.shockwave.pdfium;

import android.os.ParcelFileDescriptor;
import android.support.v4.h.a;
import java.util.Map;

public class PdfDocument
{
  long mNativeDocPtr;
  final Map mNativePagesPtr;
  ParcelFileDescriptor parcelFileDescriptor;
  
  PdfDocument()
  {
    a locala = new android/support/v4/h/a;
    locala.<init>();
    this.mNativePagesPtr = locala;
  }
  
  public boolean hasPage(int paramInt)
  {
    Map localMap = this.mNativePagesPtr;
    Integer localInteger = Integer.valueOf(paramInt);
    return localMap.containsKey(localInteger);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\shockwave\pdfium\PdfDocument.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */