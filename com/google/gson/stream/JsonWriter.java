package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class JsonWriter
  implements Closeable, Flushable
{
  private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
  private static final String[] REPLACEMENT_CHARS = new String[''];
  private String deferredName;
  private boolean htmlSafe;
  private String indent;
  private boolean lenient;
  private final Writer out;
  private String separator;
  private boolean serializeNulls;
  private int[] stack;
  private int stackSize;
  
  static
  {
    int i = 0;
    for (;;)
    {
      int j = 31;
      if (i > j) {
        break;
      }
      String[] arrayOfString = REPLACEMENT_CHARS;
      int k = 1;
      Object[] arrayOfObject = new Object[k];
      Integer localInteger = Integer.valueOf(i);
      arrayOfObject[0] = localInteger;
      String str = String.format("\\u%04x", arrayOfObject);
      arrayOfString[i] = str;
      i += 1;
    }
    REPLACEMENT_CHARS[34] = "\\\"";
    REPLACEMENT_CHARS[92] = "\\\\";
    REPLACEMENT_CHARS[9] = "\\t";
    REPLACEMENT_CHARS[8] = "\\b";
    REPLACEMENT_CHARS[10] = "\\n";
    REPLACEMENT_CHARS[13] = "\\r";
    REPLACEMENT_CHARS[12] = "\\f";
    HTML_SAFE_REPLACEMENT_CHARS = (String[])REPLACEMENT_CHARS.clone();
    HTML_SAFE_REPLACEMENT_CHARS[60] = "\\u003c";
    HTML_SAFE_REPLACEMENT_CHARS[62] = "\\u003e";
    HTML_SAFE_REPLACEMENT_CHARS[38] = "\\u0026";
    HTML_SAFE_REPLACEMENT_CHARS[61] = "\\u003d";
    HTML_SAFE_REPLACEMENT_CHARS[39] = "\\u0027";
  }
  
  public JsonWriter(Writer paramWriter)
  {
    Object localObject = new int[32];
    this.stack = ((int[])localObject);
    this.stackSize = 0;
    push(6);
    localObject = ":";
    this.separator = ((String)localObject);
    boolean bool = true;
    this.serializeNulls = bool;
    if (paramWriter == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("out == null");
      throw ((Throwable)localObject);
    }
    this.out = paramWriter;
  }
  
  private void beforeName()
  {
    int i = peek();
    int j = 5;
    if (i == j)
    {
      localObject = this.out;
      j = 44;
      ((Writer)localObject).write(j);
    }
    do
    {
      newline();
      replaceTop(4);
      return;
      j = 3;
    } while (i == j);
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Nesting problem.");
    throw ((Throwable)localObject);
  }
  
  private void beforeValue()
  {
    int i = peek();
    Object localObject;
    int j;
    switch (i)
    {
    case 3: 
    case 5: 
    default: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Nesting problem.");
      throw ((Throwable)localObject);
    case 7: 
      boolean bool = this.lenient;
      if (!bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("JSON must have only one top-level value.");
        throw ((Throwable)localObject);
      }
    case 6: 
      j = 7;
      replaceTop(j);
    }
    for (;;)
    {
      return;
      j = 2;
      replaceTop(j);
      newline();
      continue;
      localObject = this.out;
      char c = ',';
      ((Writer)localObject).append(c);
      newline();
      continue;
      localObject = this.out;
      String str = this.separator;
      ((Writer)localObject).append(str);
      j = 5;
      replaceTop(j);
    }
  }
  
  private JsonWriter close(int paramInt1, int paramInt2, String paramString)
  {
    int i = peek();
    IllegalStateException localIllegalStateException;
    if ((i != paramInt2) && (i != paramInt1))
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Nesting problem.");
      throw localIllegalStateException;
    }
    Object localObject = this.deferredName;
    if (localObject != null)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Dangling name: ");
      String str = this.deferredName;
      localObject = str;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    int j = this.stackSize + -1;
    this.stackSize = j;
    if (i == paramInt2) {
      newline();
    }
    this.out.write(paramString);
    return this;
  }
  
  private void newline()
  {
    Object localObject = this.indent;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.out;
      String str1 = "\n";
      ((Writer)localObject).write(str1);
      int i = 1;
      int j = this.stackSize;
      while (i < j)
      {
        Writer localWriter = this.out;
        String str2 = this.indent;
        localWriter.write(str2);
        i += 1;
      }
    }
  }
  
  private JsonWriter open(int paramInt, String paramString)
  {
    beforeValue();
    push(paramInt);
    this.out.write(paramString);
    return this;
  }
  
  private int peek()
  {
    int i = this.stackSize;
    if (i == 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("JsonWriter is closed.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.stack;
    int j = this.stackSize + -1;
    return localObject[j];
  }
  
  private void push(int paramInt)
  {
    int i = this.stackSize;
    int[] arrayOfInt1 = this.stack;
    int j = arrayOfInt1.length;
    if (i == j)
    {
      i = this.stackSize * 2;
      arrayOfInt2 = new int[i];
      arrayOfInt1 = this.stack;
      k = this.stackSize;
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, k);
      this.stack = arrayOfInt2;
    }
    int[] arrayOfInt2 = this.stack;
    j = this.stackSize;
    int k = j + 1;
    this.stackSize = k;
    arrayOfInt2[j] = paramInt;
  }
  
  private void replaceTop(int paramInt)
  {
    int[] arrayOfInt = this.stack;
    int i = this.stackSize + -1;
    arrayOfInt[i] = paramInt;
  }
  
  private void string(String paramString)
  {
    int i = 0;
    Writer localWriter1 = null;
    boolean bool = this.htmlSafe;
    if (bool) {}
    int j;
    int k;
    int m;
    for (Object localObject1 = HTML_SAFE_REPLACEMENT_CHARS;; localObject1 = REPLACEMENT_CHARS)
    {
      localObject2 = this.out;
      ((Writer)localObject2).write("\"");
      j = paramString.length();
      for (k = 0;; k = m)
      {
        if (k >= j) {
          break label183;
        }
        m = paramString.charAt(k);
        n = 128;
        if (m >= n) {
          break;
        }
        localObject2 = localObject1[m];
        if (localObject2 != null) {
          break label118;
        }
        m = k + 1;
      }
    }
    int n = 8232;
    if (m == n) {}
    for (Object localObject2 = "\\u2028";; localObject2 = "\\u2029")
    {
      label118:
      if (i < k)
      {
        Writer localWriter2 = this.out;
        int i1 = k - i;
        localWriter2.write(paramString, i, i1);
      }
      localWriter1 = this.out;
      localWriter1.write((String)localObject2);
      i = k + 1;
      break;
      n = 8233;
      if (m != n) {
        break;
      }
    }
    label183:
    if (i < j)
    {
      localObject1 = this.out;
      m = j - i;
      ((Writer)localObject1).write(paramString, i, m);
    }
    this.out.write("\"");
  }
  
  private void writeDeferredName()
  {
    String str = this.deferredName;
    if (str != null)
    {
      beforeName();
      str = this.deferredName;
      string(str);
      str = null;
      this.deferredName = null;
    }
  }
  
  public JsonWriter beginArray()
  {
    writeDeferredName();
    return open(1, "[");
  }
  
  public JsonWriter beginObject()
  {
    writeDeferredName();
    return open(3, "{");
  }
  
  public void close()
  {
    int i = 1;
    Object localObject = this.out;
    ((Writer)localObject).close();
    int j = this.stackSize;
    if (j <= i)
    {
      if (j == i)
      {
        int[] arrayOfInt = this.stack;
        j += -1;
        j = arrayOfInt[j];
        i = 7;
        if (j == i) {}
      }
    }
    else
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Incomplete document");
      throw ((Throwable)localObject);
    }
    this.stackSize = 0;
  }
  
  public JsonWriter endArray()
  {
    return close(1, 2, "]");
  }
  
  public JsonWriter endObject()
  {
    return close(3, 5, "}");
  }
  
  public void flush()
  {
    int i = this.stackSize;
    if (i == 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("JsonWriter is closed.");
      throw localIllegalStateException;
    }
    this.out.flush();
  }
  
  public final boolean getSerializeNulls()
  {
    return this.serializeNulls;
  }
  
  public final boolean isHtmlSafe()
  {
    return this.htmlSafe;
  }
  
  public boolean isLenient()
  {
    return this.lenient;
  }
  
  public JsonWriter jsonValue(String paramString)
  {
    if (paramString == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      writeDeferredName();
      beforeValue();
      Writer localWriter = this.out;
      localWriter.append(paramString);
    }
  }
  
  public JsonWriter name(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("name == null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.deferredName;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = this.stackSize;
    if (i == 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("JsonWriter is closed.");
      throw ((Throwable)localObject);
    }
    this.deferredName = paramString;
    return this;
  }
  
  public JsonWriter nullValue()
  {
    Object localObject = this.deferredName;
    boolean bool;
    if (localObject != null)
    {
      bool = this.serializeNulls;
      if (bool) {
        writeDeferredName();
      }
    }
    else
    {
      beforeValue();
      localObject = this.out;
      String str = "null";
      ((Writer)localObject).write(str);
    }
    for (;;)
    {
      return this;
      bool = false;
      localObject = null;
      this.deferredName = null;
    }
  }
  
  public final void setHtmlSafe(boolean paramBoolean)
  {
    this.htmlSafe = paramBoolean;
  }
  
  public final void setIndent(String paramString)
  {
    int i = paramString.length();
    String str;
    if (i == 0)
    {
      i = 0;
      this.indent = null;
      str = ":";
    }
    for (this.separator = str;; this.separator = str)
    {
      return;
      this.indent = paramString;
      str = ": ";
    }
  }
  
  public final void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }
  
  public final void setSerializeNulls(boolean paramBoolean)
  {
    this.serializeNulls = paramBoolean;
  }
  
  public JsonWriter value(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      bool = Double.isInfinite(paramDouble);
      if (!bool) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Numeric values must be finite, but was " + paramDouble;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    writeDeferredName();
    beforeValue();
    Object localObject1 = this.out;
    Object localObject2 = Double.toString(paramDouble);
    ((Writer)localObject1).append((CharSequence)localObject2);
    return this;
  }
  
  public JsonWriter value(long paramLong)
  {
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    String str = Long.toString(paramLong);
    localWriter.write(str);
    return this;
  }
  
  public JsonWriter value(Number paramNumber)
  {
    if (paramNumber == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      writeDeferredName();
      Object localObject1 = paramNumber.toString();
      boolean bool = this.lenient;
      if (!bool)
      {
        localObject2 = "-Infinity";
        bool = ((String)localObject1).equals(localObject2);
        if (!bool)
        {
          localObject2 = "Infinity";
          bool = ((String)localObject1).equals(localObject2);
          if (!bool)
          {
            localObject2 = "NaN";
            bool = ((String)localObject1).equals(localObject2);
            if (!bool) {
              break label116;
            }
          }
        }
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Numeric values must be finite, but was " + paramNumber;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      label116:
      beforeValue();
      Object localObject2 = this.out;
      ((Writer)localObject2).append((CharSequence)localObject1);
    }
  }
  
  public JsonWriter value(String paramString)
  {
    if (paramString == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      writeDeferredName();
      beforeValue();
      string(paramString);
    }
  }
  
  public JsonWriter value(boolean paramBoolean)
  {
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    if (paramBoolean) {}
    for (String str = "true";; str = "false")
    {
      localWriter.write(str);
      return this;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\stream\JsonWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */