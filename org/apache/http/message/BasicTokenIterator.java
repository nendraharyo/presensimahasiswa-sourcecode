package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.util.Args;

public class BasicTokenIterator
  implements TokenIterator
{
  public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
  protected String currentHeader;
  protected String currentToken;
  protected final HeaderIterator headerIt;
  protected int searchPos;
  
  public BasicTokenIterator(HeaderIterator paramHeaderIterator)
  {
    HeaderIterator localHeaderIterator = (HeaderIterator)Args.notNull(paramHeaderIterator, "Header iterator");
    this.headerIt = localHeaderIterator;
    int i = findNext(-1);
    this.searchPos = i;
  }
  
  protected String createToken(String paramString, int paramInt1, int paramInt2)
  {
    return paramString.substring(paramInt1, paramInt2);
  }
  
  protected int findNext(int paramInt)
  {
    int i = -1;
    Object localObject;
    int j;
    if (paramInt < 0)
    {
      localObject = this.headerIt;
      j = ((HeaderIterator)localObject).hasNext();
      if (j == 0) {
        j = i;
      }
    }
    for (;;)
    {
      return j;
      localObject = this.headerIt.nextHeader().getValue();
      this.currentHeader = ((String)localObject);
      int k = 0;
      localObject = null;
      int m;
      for (;;)
      {
        m = findTokenStart(k);
        if (m >= 0) {
          break label91;
        }
        localObject = null;
        this.currentToken = null;
        k = i;
        break;
        k = findTokenSeparator(paramInt);
      }
      label91:
      k = findTokenEnd(m);
      String str = this.currentHeader;
      str = createToken(str, m, k);
      this.currentToken = str;
    }
  }
  
  protected int findTokenEnd(int paramInt)
  {
    Args.notNegative(paramInt, "Search position");
    String str1 = this.currentHeader;
    int i = str1.length();
    int j = paramInt + 1;
    while (j < i)
    {
      String str2 = this.currentHeader;
      char c = str2.charAt(j);
      boolean bool = isTokenChar(c);
      if (!bool) {
        break;
      }
      j += 1;
    }
    return j;
  }
  
  protected int findTokenSeparator(int paramInt)
  {
    int i = Args.notNegative(paramInt, "Search position");
    boolean bool1 = false;
    ParseException localParseException = null;
    Object localObject1 = this.currentHeader;
    int j = ((String)localObject1).length();
    while ((!bool1) && (i < j))
    {
      String str = this.currentHeader;
      char c = str.charAt(i);
      boolean bool2 = isTokenSeparator(c);
      if (bool2)
      {
        bool1 = true;
      }
      else
      {
        bool2 = isWhitespace(c);
        if (bool2)
        {
          i += 1;
        }
        else
        {
          bool1 = isTokenChar(c);
          if (bool1)
          {
            localParseException = new org/apache/http/ParseException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = ((StringBuilder)localObject1).append("Tokens without separator (pos ").append(i).append("): ");
            localObject1 = this.currentHeader;
            localObject2 = (String)localObject1;
            localParseException.<init>((String)localObject2);
            throw localParseException;
          }
          localParseException = new org/apache/http/ParseException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject2 = ((StringBuilder)localObject1).append("Invalid character after token (pos ").append(i).append("): ");
          localObject1 = this.currentHeader;
          localObject2 = (String)localObject1;
          localParseException.<init>((String)localObject2);
          throw localParseException;
        }
      }
    }
    return i;
  }
  
  protected int findTokenStart(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = "Search position";
    int i = Args.notNegative(paramInt, (String)localObject2);
    int m = 0;
    Object localObject3 = null;
    float f1 = 0.0F;
    float f2;
    int j;
    if (m == 0)
    {
      Object localObject4 = this.currentHeader;
      if (localObject4 != null)
      {
        localObject4 = this.currentHeader;
        int n = ((String)localObject4).length();
        int i1 = m;
        m = i;
        i = i1;
        f2 = f1;
        while ((i == 0) && (m < n))
        {
          String str = this.currentHeader;
          char c = str.charAt(m);
          boolean bool3 = isTokenSeparator(c);
          if (!bool3)
          {
            boolean bool2 = isWhitespace(c);
            if (!bool2) {}
          }
          else
          {
            m += 1;
            continue;
          }
          localObject2 = this.currentHeader;
          i = ((String)localObject2).charAt(m);
          j = isTokenChar(i);
          if (j != 0)
          {
            j = 1;
            f2 = Float.MIN_VALUE;
          }
          else
          {
            localObject2 = new org/apache/http/ParseException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject3 = ((StringBuilder)localObject1).append("Invalid character before token (pos ").append(m).append("): ");
            localObject1 = this.currentHeader;
            localObject3 = (String)localObject1;
            ((ParseException)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
        }
        boolean bool1;
        if (j == 0)
        {
          localObject4 = this.headerIt;
          bool1 = ((HeaderIterator)localObject4).hasNext();
          if (!bool1) {
            break label293;
          }
          localObject3 = this.headerIt.nextHeader().getValue();
          this.currentHeader = ((String)localObject3);
          m = 0;
          localObject3 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          i1 = j;
          j = m;
          m = i1;
          f1 = f2;
          break;
          label293:
          bool1 = false;
          localObject4 = null;
          this.currentHeader = null;
        }
      }
    }
    if (m != 0) {}
    for (;;)
    {
      return j;
      int k = -1;
      f2 = 0.0F / 0.0F;
    }
  }
  
  public boolean hasNext()
  {
    String str = this.currentToken;
    boolean bool;
    if (str != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  protected boolean isHttpSeparator(char paramChar)
  {
    String str = " ,;=()<>@:\\\"/[]?{}\t";
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
  
  protected boolean isTokenChar(char paramChar)
  {
    boolean bool1 = true;
    boolean bool2 = Character.isLetterOrDigit(paramChar);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = Character.isISOControl(paramChar);
      if (bool2)
      {
        bool1 = false;
      }
      else
      {
        bool2 = isHttpSeparator(paramChar);
        if (bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  protected boolean isTokenSeparator(char paramChar)
  {
    char c = ',';
    if (paramChar == c) {}
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  protected boolean isWhitespace(char paramChar)
  {
    char c = '\t';
    if (paramChar != c)
    {
      bool = Character.isSpaceChar(paramChar);
      if (!bool) {
        break label21;
      }
    }
    label21:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Object next()
  {
    return nextToken();
  }
  
  public String nextToken()
  {
    Object localObject = this.currentToken;
    if (localObject == null)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>("Iteration already finished.");
      throw ((Throwable)localObject);
    }
    localObject = this.currentToken;
    int i = this.searchPos;
    i = findNext(i);
    this.searchPos = i;
    return (String)localObject;
  }
  
  public final void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Removing tokens is not supported.");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicTokenIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */