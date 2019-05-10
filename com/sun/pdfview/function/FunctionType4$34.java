package com.sun.pdfview.function;

import java.util.LinkedList;

class FunctionType4$34
  extends FunctionType4.Operation
{
  FunctionType4$34(FunctionType4 paramFunctionType4, String paramString)
  {
    super(paramFunctionType4, paramString);
  }
  
  void eval()
  {
    Object localObject = this.this$0;
    boolean bool = FunctionType4.access$6((FunctionType4)localObject);
    if (bool)
    {
      localObject = FunctionType4.access$7(this.this$0);
      FunctionType4.Expression localExpression = FunctionType4.access$8(this.this$0);
      ((LinkedList)localObject).addFirst(localExpression);
    }
    for (;;)
    {
      return;
      localObject = this.this$0;
      FunctionType4.access$8((FunctionType4)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType4$34.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */