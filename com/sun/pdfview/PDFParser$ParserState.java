package com.sun.pdfview;

import com.sun.pdfview.colorspace.PDFColorSpace;

class PDFParser$ParserState
  implements Cloneable
{
  PDFColorSpace fillCS;
  PDFColorSpace strokeCS;
  PDFTextFormat textFormat;
  
  PDFParser$ParserState(PDFParser paramPDFParser) {}
  
  public Object clone()
  {
    ParserState localParserState = new com/sun/pdfview/PDFParser$ParserState;
    Object localObject = this.this$0;
    localParserState.<init>((PDFParser)localObject);
    localObject = this.fillCS;
    localParserState.fillCS = ((PDFColorSpace)localObject);
    localObject = this.strokeCS;
    localParserState.strokeCS = ((PDFColorSpace)localObject);
    localObject = (PDFTextFormat)this.textFormat.clone();
    localParserState.textFormat = ((PDFTextFormat)localObject);
    return localParserState;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFParser$ParserState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */