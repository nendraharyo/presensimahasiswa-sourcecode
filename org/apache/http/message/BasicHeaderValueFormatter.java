package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicHeaderValueFormatter
  implements HeaderValueFormatter
{
  public static final BasicHeaderValueFormatter DEFAULT;
  public static final BasicHeaderValueFormatter INSTANCE;
  public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
  public static final String UNSAFE_CHARS = "\"\\";
  
  static
  {
    BasicHeaderValueFormatter localBasicHeaderValueFormatter = new org/apache/http/message/BasicHeaderValueFormatter;
    localBasicHeaderValueFormatter.<init>();
    DEFAULT = localBasicHeaderValueFormatter;
    localBasicHeaderValueFormatter = new org/apache/http/message/BasicHeaderValueFormatter;
    localBasicHeaderValueFormatter.<init>();
    INSTANCE = localBasicHeaderValueFormatter;
  }
  
  public static String formatElements(HeaderElement[] paramArrayOfHeaderElement, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatElements(null, paramArrayOfHeaderElement, paramBoolean).toString();
      paramHeaderValueFormatter = INSTANCE;
    }
  }
  
  public static String formatHeaderElement(HeaderElement paramHeaderElement, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatHeaderElement(null, paramHeaderElement, paramBoolean).toString();
      paramHeaderValueFormatter = INSTANCE;
    }
  }
  
  public static String formatNameValuePair(NameValuePair paramNameValuePair, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatNameValuePair(null, paramNameValuePair, paramBoolean).toString();
      paramHeaderValueFormatter = INSTANCE;
    }
  }
  
  public static String formatParameters(NameValuePair[] paramArrayOfNameValuePair, boolean paramBoolean, HeaderValueFormatter paramHeaderValueFormatter)
  {
    if (paramHeaderValueFormatter != null) {}
    for (;;)
    {
      return paramHeaderValueFormatter.formatParameters(null, paramArrayOfNameValuePair, paramBoolean).toString();
      paramHeaderValueFormatter = INSTANCE;
    }
  }
  
  protected void doFormatValue(CharArrayBuffer paramCharArrayBuffer, String paramString, boolean paramBoolean)
  {
    char c1 = '"';
    int i = 0;
    int j;
    if (!paramBoolean)
    {
      j = 0;
      for (;;)
      {
        int k = paramString.length();
        if ((j >= k) || (paramBoolean)) {
          break;
        }
        char c2 = paramString.charAt(j);
        paramBoolean = isSeparator(c2);
        j += 1;
      }
    }
    if (paramBoolean) {
      paramCharArrayBuffer.append(c1);
    }
    for (;;)
    {
      j = paramString.length();
      if (i >= j) {
        break;
      }
      j = paramString.charAt(i);
      boolean bool = isUnsafe(j);
      if (bool)
      {
        char c3 = '\\';
        paramCharArrayBuffer.append(c3);
      }
      paramCharArrayBuffer.append(j);
      i += 1;
    }
    if (paramBoolean) {
      paramCharArrayBuffer.append(c1);
    }
  }
  
  protected int estimateElementsLen(HeaderElement[] paramArrayOfHeaderElement)
  {
    int i = 0;
    int j;
    int k;
    if (paramArrayOfHeaderElement != null)
    {
      j = paramArrayOfHeaderElement.length;
      k = 1;
      if (j >= k) {
        break label20;
      }
    }
    for (;;)
    {
      return i;
      label20:
      j = (paramArrayOfHeaderElement.length + -1) * 2;
      int m = paramArrayOfHeaderElement.length;
      i = j;
      j = 0;
      while (j < m)
      {
        HeaderElement localHeaderElement = paramArrayOfHeaderElement[j];
        k = estimateHeaderElementLen(localHeaderElement) + i;
        j += 1;
        i = k;
      }
    }
  }
  
  protected int estimateHeaderElementLen(HeaderElement paramHeaderElement)
  {
    int i = 0;
    int j;
    String str1;
    if (paramHeaderElement == null)
    {
      j = 0;
      str1 = null;
    }
    for (;;)
    {
      return j;
      str1 = paramHeaderElement.getName();
      j = str1.length();
      String str2 = paramHeaderElement.getValue();
      if (str2 != null)
      {
        k = str2.length() + 3;
        j += k;
      }
      int k = paramHeaderElement.getParameterCount();
      if (k > 0) {
        while (i < k)
        {
          NameValuePair localNameValuePair = paramHeaderElement.getParameter(i);
          int m = estimateNameValuePairLen(localNameValuePair) + 2;
          j += m;
          i += 1;
        }
      }
    }
  }
  
  protected int estimateNameValuePairLen(NameValuePair paramNameValuePair)
  {
    int i;
    String str1;
    if (paramNameValuePair == null)
    {
      i = 0;
      str1 = null;
    }
    for (;;)
    {
      return i;
      str1 = paramNameValuePair.getName();
      i = str1.length();
      String str2 = paramNameValuePair.getValue();
      if (str2 != null)
      {
        int j = str2.length() + 3;
        i += j;
      }
    }
  }
  
  protected int estimateParametersLen(NameValuePair[] paramArrayOfNameValuePair)
  {
    int i = 0;
    int j;
    int k;
    if (paramArrayOfNameValuePair != null)
    {
      j = paramArrayOfNameValuePair.length;
      k = 1;
      if (j >= k) {
        break label20;
      }
    }
    for (;;)
    {
      return i;
      label20:
      j = (paramArrayOfNameValuePair.length + -1) * 2;
      int m = paramArrayOfNameValuePair.length;
      i = j;
      j = 0;
      while (j < m)
      {
        NameValuePair localNameValuePair = paramArrayOfNameValuePair[j];
        k = estimateNameValuePairLen(localNameValuePair) + i;
        j += 1;
        i = k;
      }
    }
  }
  
  public CharArrayBuffer formatElements(CharArrayBuffer paramCharArrayBuffer, HeaderElement[] paramArrayOfHeaderElement, boolean paramBoolean)
  {
    String str = "Header element array";
    Args.notNull(paramArrayOfHeaderElement, str);
    int i = estimateElementsLen(paramArrayOfHeaderElement);
    if (paramCharArrayBuffer == null)
    {
      paramCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      paramCharArrayBuffer.<init>(i);
    }
    for (;;)
    {
      i = 0;
      str = null;
      for (;;)
      {
        int j = paramArrayOfHeaderElement.length;
        if (i >= j) {
          break;
        }
        if (i > 0)
        {
          localObject = ", ";
          paramCharArrayBuffer.append((String)localObject);
        }
        Object localObject = paramArrayOfHeaderElement[i];
        formatHeaderElement(paramCharArrayBuffer, (HeaderElement)localObject, paramBoolean);
        i += 1;
      }
      paramCharArrayBuffer.ensureCapacity(i);
    }
    return paramCharArrayBuffer;
  }
  
  public CharArrayBuffer formatHeaderElement(CharArrayBuffer paramCharArrayBuffer, HeaderElement paramHeaderElement, boolean paramBoolean)
  {
    String str = "Header element";
    Args.notNull(paramHeaderElement, str);
    int i = estimateHeaderElementLen(paramHeaderElement);
    if (paramCharArrayBuffer == null)
    {
      paramCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      paramCharArrayBuffer.<init>(i);
    }
    for (;;)
    {
      str = paramHeaderElement.getName();
      paramCharArrayBuffer.append(str);
      str = paramHeaderElement.getValue();
      if (str != null)
      {
        char c = '=';
        paramCharArrayBuffer.append(c);
        doFormatValue(paramCharArrayBuffer, str, paramBoolean);
      }
      int j = paramHeaderElement.getParameterCount();
      if (j <= 0) {
        break;
      }
      i = 0;
      str = null;
      while (i < j)
      {
        paramCharArrayBuffer.append("; ");
        NameValuePair localNameValuePair = paramHeaderElement.getParameter(i);
        formatNameValuePair(paramCharArrayBuffer, localNameValuePair, paramBoolean);
        i += 1;
      }
      paramCharArrayBuffer.ensureCapacity(i);
    }
    return paramCharArrayBuffer;
  }
  
  public CharArrayBuffer formatNameValuePair(CharArrayBuffer paramCharArrayBuffer, NameValuePair paramNameValuePair, boolean paramBoolean)
  {
    String str = "Name / value pair";
    Args.notNull(paramNameValuePair, str);
    int i = estimateNameValuePairLen(paramNameValuePair);
    if (paramCharArrayBuffer == null)
    {
      paramCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      paramCharArrayBuffer.<init>(i);
    }
    for (;;)
    {
      str = paramNameValuePair.getName();
      paramCharArrayBuffer.append(str);
      str = paramNameValuePair.getValue();
      if (str != null)
      {
        char c = '=';
        paramCharArrayBuffer.append(c);
        doFormatValue(paramCharArrayBuffer, str, paramBoolean);
      }
      return paramCharArrayBuffer;
      paramCharArrayBuffer.ensureCapacity(i);
    }
  }
  
  public CharArrayBuffer formatParameters(CharArrayBuffer paramCharArrayBuffer, NameValuePair[] paramArrayOfNameValuePair, boolean paramBoolean)
  {
    String str = "Header parameter array";
    Args.notNull(paramArrayOfNameValuePair, str);
    int i = estimateParametersLen(paramArrayOfNameValuePair);
    if (paramCharArrayBuffer == null)
    {
      paramCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      paramCharArrayBuffer.<init>(i);
    }
    for (;;)
    {
      i = 0;
      str = null;
      for (;;)
      {
        int j = paramArrayOfNameValuePair.length;
        if (i >= j) {
          break;
        }
        if (i > 0)
        {
          localObject = "; ";
          paramCharArrayBuffer.append((String)localObject);
        }
        Object localObject = paramArrayOfNameValuePair[i];
        formatNameValuePair(paramCharArrayBuffer, (NameValuePair)localObject, paramBoolean);
        i += 1;
      }
      paramCharArrayBuffer.ensureCapacity(i);
    }
    return paramCharArrayBuffer;
  }
  
  protected boolean isSeparator(char paramChar)
  {
    String str = " ;,:@()<>\\\"/[]?={}\t";
    int i = str.indexOf(paramChar);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  protected boolean isUnsafe(char paramChar)
  {
    String str = "\"\\";
    int i = str.indexOf(paramChar);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHeaderValueFormatter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */