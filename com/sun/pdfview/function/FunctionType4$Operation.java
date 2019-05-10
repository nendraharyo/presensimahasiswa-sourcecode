package com.sun.pdfview.function;

abstract class FunctionType4$Operation
{
  private String operatorName;
  
  public FunctionType4$Operation(FunctionType4 paramFunctionType4, String paramString)
  {
    if (paramString == null)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Cannot have a null operator name");
      throw localRuntimeException;
    }
    this.operatorName = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof Operation;
    String str1;
    if (bool)
    {
      paramObject = (Operation)paramObject;
      str1 = ((Operation)paramObject).operatorName;
      String str2 = this.operatorName;
      bool = str1.equals(str2);
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof String;
      if (bool)
      {
        str1 = this.operatorName;
        bool = str1.equals(paramObject);
      }
      else
      {
        bool = false;
        str1 = null;
      }
    }
  }
  
  abstract void eval();
  
  public String getOperatorName()
  {
    return this.operatorName;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType4$Operation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */