package com.sun.pdfview.function;

import java.util.LinkedList;

class FunctionType4$41
  extends FunctionType4.Operation
{
  FunctionType4$41(FunctionType4 paramFunctionType4, String paramString)
  {
    super(paramFunctionType4, paramString);
  }
  
  void eval()
  {
    Object localObject = FunctionType4.access$7(this.this$0).removeFirst();
    FunctionType4.access$7(this.this$0).addFirst(localObject);
    FunctionType4.access$7(this.this$0).addFirst(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType4$41.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */