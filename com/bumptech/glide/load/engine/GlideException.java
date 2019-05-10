package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GlideException
  extends Exception
{
  private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
  private static final long serialVersionUID = 1L;
  private final List causes;
  private Class dataClass;
  private DataSource dataSource;
  private String detailMessage;
  private Key key;
  
  public GlideException(String paramString)
  {
    this(paramString, localList);
  }
  
  public GlideException(String paramString, Throwable paramThrowable)
  {
    this(paramString, localList);
  }
  
  public GlideException(String paramString, List paramList)
  {
    this.detailMessage = paramString;
    StackTraceElement[] arrayOfStackTraceElement = EMPTY_ELEMENTS;
    setStackTrace(arrayOfStackTraceElement);
    this.causes = paramList;
  }
  
  private void addRootCauses(Throwable paramThrowable, List paramList)
  {
    boolean bool = paramThrowable instanceof GlideException;
    if (bool)
    {
      paramThrowable = (GlideException)paramThrowable;
      Object localObject = paramThrowable.getCauses();
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Throwable)localIterator.next();
        addRootCauses((Throwable)localObject, paramList);
      }
    }
    paramList.add(paramThrowable);
  }
  
  private static void appendCauses(List paramList, Appendable paramAppendable)
  {
    try
    {
      appendCausesWrapped(paramList, paramAppendable);
      return;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localIOException);
      throw localRuntimeException;
    }
  }
  
  private static void appendCausesWrapped(List paramList, Appendable paramAppendable)
  {
    int i = paramList.size();
    int j = 0;
    Object localObject = null;
    int k = 0;
    if (k < i)
    {
      localObject = paramAppendable.append("Cause (");
      String str = String.valueOf(k + 1);
      localObject = ((Appendable)localObject).append(str).append(" of ");
      str = String.valueOf(i);
      localObject = ((Appendable)localObject).append(str);
      str = "): ";
      ((Appendable)localObject).append(str);
      localObject = (Throwable)paramList.get(k);
      boolean bool = localObject instanceof GlideException;
      if (bool)
      {
        localObject = (GlideException)localObject;
        ((GlideException)localObject).printStackTrace(paramAppendable);
      }
      for (;;)
      {
        j = k + 1;
        k = j;
        break;
        appendExceptionMessage((Throwable)localObject, paramAppendable);
      }
    }
  }
  
  private static void appendExceptionMessage(Throwable paramThrowable, Appendable paramAppendable)
  {
    try
    {
      Object localObject = paramThrowable.getClass();
      localObject = ((Class)localObject).toString();
      localObject = paramAppendable.append((CharSequence)localObject);
      String str = ": ";
      localObject = ((Appendable)localObject).append(str);
      str = paramThrowable.getMessage();
      localObject = ((Appendable)localObject).append(str);
      char c = '\n';
      ((Appendable)localObject).append(c);
      return;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(paramThrowable);
      throw localRuntimeException;
    }
  }
  
  private void printStackTrace(Appendable paramAppendable)
  {
    appendExceptionMessage(this, paramAppendable);
    List localList = getCauses();
    GlideException.IndentedAppendable localIndentedAppendable = new com/bumptech/glide/load/engine/GlideException$IndentedAppendable;
    localIndentedAppendable.<init>(paramAppendable);
    appendCauses(localList, localIndentedAppendable);
  }
  
  public Throwable fillInStackTrace()
  {
    return this;
  }
  
  public List getCauses()
  {
    return this.causes;
  }
  
  public String getMessage()
  {
    Object localObject1 = new java/lang/StringBuilder;
    int i = 71;
    ((StringBuilder)localObject1).<init>(i);
    Object localObject2 = this.detailMessage;
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.dataClass;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", ");
      localObject3 = this.dataClass;
      localObject1 = localObject3;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = this.dataSource;
      if (localObject1 == null) {
        break label192;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", ");
      localObject3 = this.dataSource;
      localObject1 = localObject3;
      label109:
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = this.key;
      if (localObject1 == null) {
        break label198;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", ");
      localObject3 = this.key;
      localObject1 = localObject3;
      label155:
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = getRootCauses();
      boolean bool1 = ((List)localObject1).isEmpty();
      if (!bool1) {
        break label204;
      }
    }
    for (localObject1 = ((StringBuilder)localObject2).toString();; localObject1 = ((StringBuilder)localObject2).toString())
    {
      return (String)localObject1;
      localObject1 = "";
      break;
      label192:
      localObject1 = "";
      break label109;
      label198:
      localObject1 = "";
      break label155;
      label204:
      int j = ((List)localObject1).size();
      int k = 1;
      if (j == k)
      {
        localObject3 = "\nThere was 1 cause:";
        ((StringBuilder)localObject2).append((String)localObject3);
      }
      for (;;)
      {
        localObject3 = ((List)localObject1).iterator();
        for (;;)
        {
          boolean bool2 = ((Iterator)localObject3).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (Throwable)((Iterator)localObject3).next();
          localObject4 = ((StringBuilder)localObject2).append('\n');
          String str = localObject1.getClass().getName();
          localObject4 = ((StringBuilder)localObject4).append(str);
          char c = '(';
          localObject4 = ((StringBuilder)localObject4).append(c);
          localObject1 = ((Throwable)localObject1).getMessage();
          localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
          k = 41;
          ((StringBuilder)localObject1).append(k);
        }
        localObject3 = ((StringBuilder)localObject2).append("\nThere were ");
        int m = ((List)localObject1).size();
        localObject3 = ((StringBuilder)localObject3).append(m);
        Object localObject4 = " causes:";
        ((StringBuilder)localObject3).append((String)localObject4);
      }
      ((StringBuilder)localObject2).append("\n call GlideException#logRootCauses(String) for more detail");
    }
  }
  
  public List getRootCauses()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    addRootCauses(this, localArrayList);
    return localArrayList;
  }
  
  public void logRootCauses(String paramString)
  {
    List localList = getRootCauses();
    int i = 0;
    Object localObject = null;
    int j = localList.size();
    for (int k = 0; k < j; k = i)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Root cause (");
      int m = k + 1;
      String str = m + " of " + j + ")";
      localObject = (Throwable)localList.get(k);
      Log.i(paramString, str, (Throwable)localObject);
      i = k + 1;
    }
  }
  
  public void printStackTrace()
  {
    PrintStream localPrintStream = System.err;
    printStackTrace(localPrintStream);
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    printStackTrace(paramPrintStream);
  }
  
  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    printStackTrace(paramPrintWriter);
  }
  
  void setLoggingDetails(Key paramKey, DataSource paramDataSource)
  {
    setLoggingDetails(paramKey, paramDataSource, null);
  }
  
  void setLoggingDetails(Key paramKey, DataSource paramDataSource, Class paramClass)
  {
    this.key = paramKey;
    this.dataSource = paramDataSource;
    this.dataClass = paramClass;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\GlideException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */