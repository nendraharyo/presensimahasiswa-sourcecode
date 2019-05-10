package com.sun.pdfview.function;

class FunctionType4$3
  extends FunctionType4.Operation
{
  FunctionType4$3(FunctionType4 paramFunctionType4, String paramString)
  {
    super(paramFunctionType4, paramString);
  }
  
  void eval()
  {
    FunctionType4 localFunctionType41 = this.this$0;
    double d1 = FunctionType4.access$0(localFunctionType41);
    FunctionType4 localFunctionType42 = this.this$0;
    double d2 = FunctionType4.access$0(localFunctionType42);
    double d3 = 0.0D;
    boolean bool = d1 < d3;
    if (!bool)
    {
      localFunctionType41 = this.this$0;
      d2 = 90.0D;
      FunctionType4.access$1(localFunctionType41, d2);
    }
    for (;;)
    {
      return;
      FunctionType4 localFunctionType43 = this.this$0;
      d1 = Math.toDegrees(Math.atan(d2 / d1));
      FunctionType4.access$1(localFunctionType43, d1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType4$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */