package com.github.barteksc.pdfviewer;

 enum PDFView$State
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/github/barteksc/pdfviewer/PDFView$State;
    ((State)localObject).<init>("DEFAULT", 0);
    DEFAULT = (State)localObject;
    localObject = new com/github/barteksc/pdfviewer/PDFView$State;
    ((State)localObject).<init>("LOADED", k);
    LOADED = (State)localObject;
    localObject = new com/github/barteksc/pdfviewer/PDFView$State;
    ((State)localObject).<init>("SHOWN", j);
    SHOWN = (State)localObject;
    localObject = new com/github/barteksc/pdfviewer/PDFView$State;
    ((State)localObject).<init>("ERROR", i);
    ERROR = (State)localObject;
    localObject = new State[4];
    State localState = DEFAULT;
    localObject[0] = localState;
    localState = LOADED;
    localObject[k] = localState;
    localState = SHOWN;
    localObject[j] = localState;
    localState = ERROR;
    localObject[i] = localState;
    $VALUES = (State[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\PDFView$State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */