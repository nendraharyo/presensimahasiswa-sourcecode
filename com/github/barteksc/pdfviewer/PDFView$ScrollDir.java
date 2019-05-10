package com.github.barteksc.pdfviewer;

 enum PDFView$ScrollDir
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/github/barteksc/pdfviewer/PDFView$ScrollDir;
    ((ScrollDir)localObject).<init>("NONE", 0);
    NONE = (ScrollDir)localObject;
    localObject = new com/github/barteksc/pdfviewer/PDFView$ScrollDir;
    ((ScrollDir)localObject).<init>("START", j);
    START = (ScrollDir)localObject;
    localObject = new com/github/barteksc/pdfviewer/PDFView$ScrollDir;
    ((ScrollDir)localObject).<init>("END", i);
    END = (ScrollDir)localObject;
    localObject = new ScrollDir[3];
    ScrollDir localScrollDir = NONE;
    localObject[0] = localScrollDir;
    localScrollDir = START;
    localObject[j] = localScrollDir;
    localScrollDir = END;
    localObject[i] = localScrollDir;
    $VALUES = (ScrollDir[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\PDFView$ScrollDir.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */