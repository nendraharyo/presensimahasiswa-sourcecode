package com.sun.pdfview.function;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.util.HashSet;
import java.util.LinkedList;

public class FunctionType4
  extends PDFFunction
{
  private static HashSet operationSet = null;
  private LinkedList stack;
  private LinkedList tokens;
  
  protected FunctionType4()
  {
    super(i);
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.tokens = ((LinkedList)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.stack = ((LinkedList)localObject);
    localObject = operationSet;
    if (localObject == null) {
      initOperations();
    }
  }
  
  private void initOperations()
  {
    HashSet localHashSet = operationSet;
    if (localHashSet == null)
    {
      localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      operationSet = localHashSet;
      localHashSet = operationSet;
      Object localObject = new com/sun/pdfview/function/FunctionType4$1;
      ((FunctionType4.1)localObject).<init>(this, "abs");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$2;
      ((FunctionType4.2)localObject).<init>(this, "add");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$3;
      ((FunctionType4.3)localObject).<init>(this, "atan");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$4;
      ((FunctionType4.4)localObject).<init>(this, "ceiling");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$5;
      ((FunctionType4.5)localObject).<init>(this, "cvi");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$6;
      ((FunctionType4.6)localObject).<init>(this, "cvr");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$7;
      ((FunctionType4.7)localObject).<init>(this, "div");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$8;
      ((FunctionType4.8)localObject).<init>(this, "exp");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$9;
      ((FunctionType4.9)localObject).<init>(this, "floor");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$10;
      ((FunctionType4.10)localObject).<init>(this, "idiv");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$11;
      ((FunctionType4.11)localObject).<init>(this, "ln");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$12;
      ((FunctionType4.12)localObject).<init>(this, "log");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$13;
      ((FunctionType4.13)localObject).<init>(this, "mod");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$14;
      ((FunctionType4.14)localObject).<init>(this, "mul");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$15;
      ((FunctionType4.15)localObject).<init>(this, "neg");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$16;
      ((FunctionType4.16)localObject).<init>(this, "round");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$17;
      ((FunctionType4.17)localObject).<init>(this, "sin");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$18;
      ((FunctionType4.18)localObject).<init>(this, "sqrt");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$19;
      ((FunctionType4.19)localObject).<init>(this, "sub");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$20;
      ((FunctionType4.20)localObject).<init>(this, "truncate");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$21;
      ((FunctionType4.21)localObject).<init>(this, "and");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$22;
      ((FunctionType4.22)localObject).<init>(this, "bitshift");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$23;
      ((FunctionType4.23)localObject).<init>(this, "eq");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$24;
      ((FunctionType4.24)localObject).<init>(this, "false");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$25;
      ((FunctionType4.25)localObject).<init>(this, "ge");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$26;
      ((FunctionType4.26)localObject).<init>(this, "gt");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$27;
      ((FunctionType4.27)localObject).<init>(this, "le");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$28;
      ((FunctionType4.28)localObject).<init>(this, "lt");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$29;
      ((FunctionType4.29)localObject).<init>(this, "ne");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$30;
      ((FunctionType4.30)localObject).<init>(this, "not");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$31;
      ((FunctionType4.31)localObject).<init>(this, "or");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$32;
      ((FunctionType4.32)localObject).<init>(this, "true");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$33;
      ((FunctionType4.33)localObject).<init>(this, "xor");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$34;
      ((FunctionType4.34)localObject).<init>(this, "if");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$35;
      ((FunctionType4.35)localObject).<init>(this, "ifelse");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$36;
      ((FunctionType4.36)localObject).<init>(this, "copy");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$37;
      ((FunctionType4.37)localObject).<init>(this, "dup");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$38;
      ((FunctionType4.38)localObject).<init>(this, "exch");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$39;
      ((FunctionType4.39)localObject).<init>(this, "index");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$40;
      ((FunctionType4.40)localObject).<init>(this, "pop");
      localHashSet.add(localObject);
      localHashSet = operationSet;
      localObject = new com/sun/pdfview/function/FunctionType4$41;
      String str = "roll";
      ((FunctionType4.41)localObject).<init>(this, str);
      localHashSet.add(localObject);
    }
  }
  
  private boolean popBoolean()
  {
    return false;
  }
  
  private double popDouble()
  {
    return 0.0D;
  }
  
  private FunctionType4.Expression popExpression()
  {
    return null;
  }
  
  private long popLong()
  {
    return 0L;
  }
  
  private Object popObject()
  {
    return this.stack.removeFirst();
  }
  
  private void pushBoolean(boolean paramBoolean) {}
  
  private void pushDouble(double paramDouble) {}
  
  private void pushExpression(FunctionType4.Expression paramExpression) {}
  
  private void pushLong(long paramLong) {}
  
  private void pushObject(Object paramObject)
  {
    this.stack.addFirst(paramObject);
  }
  
  private void readPS(b paramb) {}
  
  protected void doFunction(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2) {}
  
  protected void parse(PDFObject paramPDFObject)
  {
    Object localObject = paramPDFObject.getStreamBuffer();
    readPS((b)localObject);
    localObject = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject).<init>("Unsupported function type 4.");
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */