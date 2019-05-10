package com.google.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class JsonReader
  implements Closeable
{
  private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
  private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
  private static final int NUMBER_CHAR_DECIMAL = 3;
  private static final int NUMBER_CHAR_DIGIT = 2;
  private static final int NUMBER_CHAR_EXP_DIGIT = 7;
  private static final int NUMBER_CHAR_EXP_E = 5;
  private static final int NUMBER_CHAR_EXP_SIGN = 6;
  private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
  private static final int NUMBER_CHAR_NONE = 0;
  private static final int NUMBER_CHAR_SIGN = 1;
  private static final int PEEKED_BEGIN_ARRAY = 3;
  private static final int PEEKED_BEGIN_OBJECT = 1;
  private static final int PEEKED_BUFFERED = 11;
  private static final int PEEKED_DOUBLE_QUOTED = 9;
  private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
  private static final int PEEKED_END_ARRAY = 4;
  private static final int PEEKED_END_OBJECT = 2;
  private static final int PEEKED_EOF = 17;
  private static final int PEEKED_FALSE = 6;
  private static final int PEEKED_LONG = 15;
  private static final int PEEKED_NONE = 0;
  private static final int PEEKED_NULL = 7;
  private static final int PEEKED_NUMBER = 16;
  private static final int PEEKED_SINGLE_QUOTED = 8;
  private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
  private static final int PEEKED_TRUE = 5;
  private static final int PEEKED_UNQUOTED = 10;
  private static final int PEEKED_UNQUOTED_NAME = 14;
  private final char[] buffer;
  private final Reader in;
  private boolean lenient = false;
  private int limit;
  private int lineNumber;
  private int lineStart;
  private int[] pathIndices;
  private String[] pathNames;
  int peeked;
  private long peekedLong;
  private int peekedNumberLength;
  private String peekedString;
  private int pos;
  private int[] stack;
  private int stackSize;
  
  static
  {
    JsonReader.1 local1 = new com/google/gson/stream/JsonReader$1;
    local1.<init>();
    com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = local1;
  }
  
  public JsonReader(Reader paramReader)
  {
    int j = 1024;
    Object localObject = new char[j];
    this.buffer = ((char[])localObject);
    this.pos = 0;
    this.limit = 0;
    this.lineNumber = 0;
    this.lineStart = 0;
    this.peeked = 0;
    localObject = new int[i];
    this.stack = ((int[])localObject);
    this.stackSize = 0;
    localObject = this.stack;
    int k = this.stackSize;
    int m = k + 1;
    this.stackSize = m;
    m = 6;
    localObject[k] = m;
    localObject = new String[i];
    this.pathNames = ((String[])localObject);
    localObject = new int[i];
    this.pathIndices = ((int[])localObject);
    if (paramReader == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("in == null");
      throw ((Throwable)localObject);
    }
    this.in = paramReader;
  }
  
  private void checkLenient()
  {
    boolean bool = this.lenient;
    if (!bool) {
      throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
  }
  
  private void consumeNonExecutePrefix()
  {
    nextNonWhitespace(true);
    int i = this.pos + -1;
    this.pos = i;
    i = this.pos;
    char[] arrayOfChar1 = NON_EXECUTE_PREFIX;
    int m = arrayOfChar1.length;
    i += m;
    m = this.limit;
    char[] arrayOfChar2;
    int j;
    if (i > m)
    {
      arrayOfChar2 = NON_EXECUTE_PREFIX;
      i = arrayOfChar2.length;
      j = fillBuffer(i);
      if (j != 0) {}
    }
    for (;;)
    {
      return;
      j = 0;
      arrayOfChar2 = null;
      for (;;)
      {
        arrayOfChar1 = NON_EXECUTE_PREFIX;
        m = arrayOfChar1.length;
        if (j >= m) {
          break label123;
        }
        arrayOfChar1 = this.buffer;
        int i1 = this.pos + j;
        n = arrayOfChar1[i1];
        char[] arrayOfChar3 = NON_EXECUTE_PREFIX;
        i1 = arrayOfChar3[j];
        if (n != i1) {
          break;
        }
        j += 1;
      }
      label123:
      int k = this.pos;
      arrayOfChar1 = NON_EXECUTE_PREFIX;
      int n = arrayOfChar1.length;
      k += n;
      this.pos = k;
    }
  }
  
  private boolean fillBuffer(int paramInt)
  {
    boolean bool = false;
    char[] arrayOfChar = this.buffer;
    int i = this.lineStart;
    int j = this.pos;
    i -= j;
    this.lineStart = i;
    i = this.limit;
    j = this.pos;
    if (i != j)
    {
      i = this.limit;
      j = this.pos;
      i -= j;
      this.limit = i;
      i = this.pos;
      j = this.limit;
      System.arraycopy(arrayOfChar, i, arrayOfChar, 0, j);
    }
    for (;;)
    {
      this.pos = 0;
      do
      {
        Reader localReader = this.in;
        j = this.limit;
        int k = arrayOfChar.length;
        int m = this.limit;
        k -= m;
        i = localReader.read(arrayOfChar, j, k);
        j = -1;
        if (i == j) {
          break;
        }
        j = this.limit;
        i += j;
        this.limit = i;
        i = this.lineNumber;
        if (i == 0)
        {
          i = this.lineStart;
          if (i == 0)
          {
            i = this.limit;
            if (i > 0)
            {
              i = arrayOfChar[0];
              j = 65279;
              if (i == j)
              {
                i = this.pos + 1;
                this.pos = i;
                i = this.lineStart + 1;
                this.lineStart = i;
                paramInt += 1;
              }
            }
          }
        }
        i = this.limit;
      } while (i < paramInt);
      bool = true;
      return bool;
      this.limit = 0;
    }
  }
  
  private boolean isLiteral(char paramChar)
  {
    switch (paramChar)
    {
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      checkLenient();
    }
  }
  
  private int nextNonWhitespace(boolean paramBoolean)
  {
    char[] arrayOfChar = this.buffer;
    int i = this.pos;
    int j = this.limit;
    for (;;)
    {
      Object localObject1;
      int i2;
      int k;
      int m;
      if (i == j)
      {
        this.pos = i;
        boolean bool1 = fillBuffer(1);
        if (!bool1)
        {
          if (paramBoolean)
          {
            localObject1 = new java/io/EOFException;
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("End of input at line ");
            i2 = getLineNumber();
            localObject2 = ((StringBuilder)localObject2).append(i2).append(" column ");
            i2 = getColumnNumber();
            localObject2 = i2;
            ((EOFException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        else
        {
          i = this.pos;
          k = this.limit;
        }
      }
      else
      {
        i2 = i + 1;
        i = arrayOfChar[i];
        int i3 = 10;
        if (i == i3)
        {
          i = this.lineNumber + 1;
          this.lineNumber = i;
          this.lineStart = i2;
          i = i2;
          continue;
        }
        i3 = 32;
        if (i == i3) {
          break label468;
        }
        i3 = 13;
        if (i == i3) {
          break label468;
        }
        i3 = 9;
        if (i == i3)
        {
          i = i2;
          continue;
        }
        i3 = 47;
        if (i == i3)
        {
          this.pos = i2;
          if (i2 == k)
          {
            k = this.pos + -1;
            this.pos = k;
            m = fillBuffer(2);
            i2 = this.pos + 1;
            this.pos = i2;
            if (m == 0) {
              m = i;
            }
          }
        }
      }
      for (;;)
      {
        return m;
        checkLenient();
        int n = this.pos;
        n = arrayOfChar[n];
        int i1;
        switch (n)
        {
        default: 
          n = i;
          break;
        case 42: 
          n = this.pos + 1;
          this.pos = n;
          localObject1 = "*/";
          boolean bool2 = skipTo((String)localObject1);
          if (!bool2) {
            throw syntaxError("Unterminated comment");
          }
          i = this.pos + 2;
          i1 = this.limit;
          break;
        case 47: 
          i1 = this.pos + 1;
          this.pos = i1;
          skipToEndOfLine();
          i = this.pos;
          i1 = this.limit;
          break;
          i1 = 35;
          if (i == i1)
          {
            this.pos = i2;
            checkLenient();
            skipToEndOfLine();
            i = this.pos;
            i1 = this.limit;
            break;
          }
          this.pos = i2;
          i1 = i;
          continue;
          i1 = -1;
        }
      }
      label468:
      i = i2;
    }
  }
  
  private String nextQuotedValue(char paramChar)
  {
    char[] arrayOfChar = this.buffer;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    boolean bool;
    do
    {
      int i = this.pos;
      int j = this.limit;
      int k = i;
      char c2;
      char c1;
      if (k < j)
      {
        int m = k + 1;
        c2 = arrayOfChar[k];
        if (c2 == paramChar)
        {
          this.pos = m;
          j = m - i + -1;
          localStringBuilder.append(arrayOfChar, i, j);
          return localStringBuilder.toString();
        }
        char c4 = '\\';
        char c3;
        if (c2 == c4)
        {
          this.pos = m;
          j = m - i + -1;
          localStringBuilder.append(arrayOfChar, i, j);
          i = readEscapeCharacter();
          localStringBuilder.append(i);
          c1 = this.pos;
          j = this.limit;
          c3 = c1;
        }
        for (;;)
        {
          c2 = c3;
          break;
          c4 = '\n';
          if (c2 == c4)
          {
            c2 = this.lineNumber + 1;
            this.lineNumber = c2;
            this.lineStart = c3;
          }
        }
      }
      j = c2 - c1;
      localStringBuilder.append(arrayOfChar, c1, j);
      this.pos = c2;
      bool = fillBuffer(1);
    } while (bool);
    throw syntaxError("Unterminated string");
  }
  
  private String nextUnquotedValue()
  {
    int i = 0;
    char[] arrayOfChar1 = null;
    Object localObject = null;
    int j = 0;
    for (;;)
    {
      int n = this.pos + j;
      int i2 = this.limit;
      char[] arrayOfChar2;
      if (n < i2)
      {
        arrayOfChar2 = this.buffer;
        i2 = this.pos + j;
        n = arrayOfChar2[i2];
        switch (n)
        {
        default: 
          j += 1;
          break;
        case 35: 
        case 47: 
        case 59: 
        case 61: 
        case 92: 
          checkLenient();
        case 9: 
        case 10: 
        case 12: 
        case 13: 
        case 32: 
        case 44: 
        case 58: 
        case 91: 
        case 93: 
        case 123: 
        case 125: 
          label205:
          if (localObject == null)
          {
            localObject = new java/lang/String;
            arrayOfChar1 = this.buffer;
            n = this.pos;
            ((String)localObject).<init>(arrayOfChar1, n, j);
          }
          break;
        }
      }
      else
      {
        for (;;)
        {
          i = this.pos;
          j += i;
          this.pos = j;
          return (String)localObject;
          arrayOfChar2 = this.buffer;
          n = arrayOfChar2.length;
          if (j < n)
          {
            n = j + 1;
            boolean bool = fillBuffer(n);
            if (!bool) {
              break label205;
            }
            break;
          }
          if (localObject == null)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
          }
          arrayOfChar2 = this.buffer;
          i2 = this.pos;
          ((StringBuilder)localObject).append(arrayOfChar2, i2, j);
          int i1 = this.pos;
          j += i1;
          this.pos = j;
          int k = fillBuffer(1);
          if (k != 0) {
            break label393;
          }
          k = 0;
          break label205;
          arrayOfChar1 = this.buffer;
          i1 = this.pos;
          ((StringBuilder)localObject).append(arrayOfChar1, i1, k);
          localObject = ((StringBuilder)localObject).toString();
        }
        label393:
        int m = 0;
      }
    }
  }
  
  private int peekKeyword()
  {
    char[] arrayOfChar1 = this.buffer;
    int i = this.pos;
    int k = arrayOfChar1[i];
    i = 116;
    String str;
    Object localObject;
    int m;
    int n;
    label50:
    int i3;
    if (k != i)
    {
      i = 84;
      if (k != i) {}
    }
    else
    {
      str = "true";
      localObject = "TRUE";
      k = 5;
      m = str.length();
      n = 1;
      if (n >= m) {
        break label241;
      }
      int i1 = this.pos + n;
      i3 = this.limit;
      if (i1 < i3) {
        break label171;
      }
      i1 = n + 1;
      boolean bool3 = fillBuffer(i1);
      if (bool3) {
        break label171;
      }
      k = 0;
      arrayOfChar1 = null;
    }
    for (;;)
    {
      return k;
      i = 102;
      if (k != i)
      {
        i = 70;
        if (k != i) {}
      }
      else
      {
        str = "false";
        localObject = "FALSE";
        k = 6;
        break;
      }
      i = 110;
      if (k != i)
      {
        i = 78;
        if (k != i) {}
      }
      else
      {
        str = "null";
        localObject = "NULL";
        k = 7;
        break;
      }
      k = 0;
      arrayOfChar1 = null;
      continue;
      label171:
      char[] arrayOfChar2 = this.buffer;
      i3 = this.pos + n;
      int i2 = arrayOfChar2[i3];
      i3 = str.charAt(n);
      if (i2 != i3)
      {
        i3 = ((String)localObject).charAt(n);
        if (i2 != i3)
        {
          k = 0;
          arrayOfChar1 = null;
          continue;
        }
      }
      n += 1;
      break label50;
      label241:
      i = this.pos + m;
      int i4 = this.limit;
      if (i >= i4)
      {
        i = m + 1;
        boolean bool1 = fillBuffer(i);
        if (!bool1) {}
      }
      else
      {
        localObject = this.buffer;
        i4 = this.pos + m;
        char c = localObject[i4];
        boolean bool2 = isLiteral(c);
        if (bool2)
        {
          k = 0;
          arrayOfChar1 = null;
          continue;
        }
      }
      int j = this.pos + m;
      this.pos = j;
      this.peeked = k;
    }
  }
  
  private int peekNumber()
  {
    char[] arrayOfChar = this.buffer;
    int i = this.pos;
    int n = this.limit;
    long l1 = 0L;
    int i1 = 0;
    float f1 = 0.0F;
    int i2 = 1;
    float f2 = Float.MIN_VALUE;
    int i3 = 0;
    float f3 = 0.0F;
    int i4 = 0;
    int i5 = n;
    n = i;
    i = n + i4;
    int i6;
    if (i == i5)
    {
      i6 = arrayOfChar.length;
      if (i4 == i6) {
        i6 = 0;
      }
    }
    label70:
    label134:
    boolean bool3;
    for (;;)
    {
      return i6;
      i6 = i4 + 1;
      boolean bool1 = fillBuffer(i6);
      if (!bool1) {}
      do
      {
        int i7 = 2;
        if ((i3 != i7) || (i2 == 0)) {
          break label783;
        }
        long l2 = Long.MIN_VALUE;
        boolean bool2 = l1 < l2;
        if ((!bool2) && (i1 == 0)) {
          break label783;
        }
        if (i1 == 0) {
          break label775;
        }
        this.peekedLong = l1;
        int i8 = this.pos + i4;
        this.pos = i8;
        i8 = 15;
        this.peeked = i8;
        break;
        n = this.pos;
        i8 = this.limit;
        i = n + i4;
        i = arrayOfChar[i];
        switch (i)
        {
        default: 
          int i10 = 48;
          if (i >= i10)
          {
            int i11 = 57;
            if (i <= i11) {
              break label508;
            }
          }
          bool3 = isLiteral(i);
        }
      } while (!bool3);
      bool3 = false;
    }
    int j;
    float f4;
    int i13;
    if (i3 == 0)
    {
      f3 = Float.MIN_VALUE;
      j = 1;
      f4 = Float.MIN_VALUE;
      i13 = i2;
      i2 = 1;
      f2 = f3;
      i3 = i13;
    }
    for (;;)
    {
      i4 += 1;
      i1 = i2;
      f1 = f2;
      i2 = i3;
      i3 = j;
      f3 = f4;
      break;
      j = 5;
      f4 = 7.0E-45F;
      if (i3 == j)
      {
        j = 6;
        f4 = 8.4E-45F;
        i3 = i2;
        i2 = i1;
        f2 = f1;
      }
      else
      {
        bool3 = false;
        break label70;
        j = 5;
        f4 = 7.0E-45F;
        if (i3 == j)
        {
          j = 6;
          f4 = 8.4E-45F;
          i3 = i2;
          i2 = i1;
          f2 = f1;
        }
        else
        {
          bool3 = false;
          break label70;
          j = 2;
          f4 = 2.8E-45F;
          if (i3 != j)
          {
            j = 4;
            f4 = 5.6E-45F;
            if (i3 != j) {}
          }
          else
          {
            j = 5;
            f4 = 7.0E-45F;
            i3 = i2;
            i2 = i1;
            f2 = f1;
            continue;
          }
          bool3 = false;
          break label70;
          j = 2;
          f4 = 2.8E-45F;
          if (i3 == j)
          {
            j = 3;
            f4 = 4.2E-45F;
            i3 = i2;
            i2 = i1;
            f2 = f1;
          }
          else
          {
            bool3 = false;
            break label70;
            label508:
            int i12 = 1;
            if ((i3 == i12) || (i3 == 0))
            {
              l1 = -(j + -48);
              j = 2;
              f4 = 2.8E-45F;
              i3 = i2;
              i2 = i1;
              f2 = f1;
            }
            else
            {
              i12 = 2;
              if (i3 == i12)
              {
                long l3 = 0L;
                boolean bool4 = l1 < l3;
                if (!bool4)
                {
                  bool3 = false;
                  break label70;
                }
                l3 = 10 * l1;
                long l4 = j + -48;
                l3 -= l4;
                l4 = -922337203685477580L;
                int k = l1 < l4;
                if (k <= 0)
                {
                  l4 = -922337203685477580L;
                  k = l1 < l4;
                  if (k == 0)
                  {
                    k = l3 < l1;
                    if (k >= 0) {}
                  }
                }
                else
                {
                  k = 1;
                }
                for (f4 = Float.MIN_VALUE;; f4 = 0.0F)
                {
                  k &= i2;
                  i2 = i1;
                  f2 = f1;
                  l1 = l3;
                  i13 = i3;
                  i3 = k;
                  k = i13;
                  f4 = f3;
                  break;
                  k = 0;
                }
              }
              int m = 3;
              f4 = 4.2E-45F;
              if (i3 == m)
              {
                m = 4;
                f4 = 5.6E-45F;
                i3 = i2;
                i2 = i1;
                f2 = f1;
              }
              else
              {
                m = 5;
                f4 = 7.0E-45F;
                if (i3 != m)
                {
                  m = 6;
                  f4 = 8.4E-45F;
                  if (i3 != m) {}
                }
                else
                {
                  m = 7;
                  f4 = 9.8E-45F;
                  i3 = i2;
                  i2 = i1;
                  f2 = f1;
                  continue;
                  label775:
                  l1 = -l1;
                  break label134;
                  label783:
                  int i9 = 2;
                  if (i3 != i9)
                  {
                    i9 = 4;
                    if (i3 != i9)
                    {
                      i9 = 7;
                      if (i3 != i9) {
                        break label833;
                      }
                    }
                  }
                  this.peekedNumberLength = i4;
                  i9 = 16;
                  this.peeked = i9;
                  break label70;
                  label833:
                  i9 = 0;
                  break label70;
                }
                m = i3;
                f4 = f3;
                i3 = i2;
                i2 = i1;
                f2 = f1;
              }
            }
          }
        }
      }
    }
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
      j = this.stackSize * 2;
      arrayOfInt1 = new int[j];
      k = this.stackSize * 2;
      String[] arrayOfString = new String[k];
      Object localObject = this.stack;
      int m = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfInt2, 0, m);
      localObject = this.pathIndices;
      m = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfInt1, 0, m);
      localObject = this.pathNames;
      m = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfString, 0, m);
      this.stack = arrayOfInt2;
      this.pathIndices = arrayOfInt1;
      this.pathNames = arrayOfString;
    }
    int[] arrayOfInt2 = this.stack;
    j = this.stackSize;
    int k = j + 1;
    this.stackSize = k;
    arrayOfInt2[j] = paramInt;
  }
  
  private char readEscapeCharacter()
  {
    int i = 4;
    int j = this.pos;
    int n = this.limit;
    if (j == n)
    {
      boolean bool1 = fillBuffer(1);
      if (!bool1) {
        throw syntaxError("Unterminated escape sequence");
      }
    }
    Object localObject1 = this.buffer;
    n = this.pos;
    int i1 = n + 1;
    this.pos = i1;
    char c = localObject1[n];
    switch (c)
    {
    }
    for (;;)
    {
      return c;
      int k = this.pos + 4;
      n = this.limit;
      if (k > n)
      {
        boolean bool2 = fillBuffer(i);
        if (!bool2) {
          throw syntaxError("Unterminated escape sequence");
        }
      }
      Object localObject2 = null;
      int m = this.pos;
      i1 = m + 4;
      int i2 = m;
      m = 0;
      localObject1 = null;
      n = i2;
      if (n < i1)
      {
        char[] arrayOfChar = this.buffer;
        int i3 = arrayOfChar[n];
        m = (char)(m << 4);
        int i4 = 48;
        if (i3 >= i4)
        {
          i4 = 57;
          if (i3 <= i4)
          {
            i3 += -48;
            m = (char)(m + i3);
          }
        }
        for (;;)
        {
          n += 1;
          break;
          i4 = 97;
          if (i3 >= i4)
          {
            i4 = 102;
            if (i3 <= i4)
            {
              i3 = i3 + -97 + 10;
              m = (char)(m + i3);
              continue;
            }
          }
          i4 = 65;
          if (i3 < i4) {
            break label336;
          }
          i4 = 70;
          if (i3 > i4) {
            break label336;
          }
          i3 = i3 + -65 + 10;
          m = (char)(m + i3);
        }
        label336:
        localObject1 = new java/lang/NumberFormatException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("\\u");
        String str = new java/lang/String;
        arrayOfChar = this.buffer;
        i4 = this.pos;
        str.<init>(arrayOfChar, i4, i);
        localObject2 = str;
        ((NumberFormatException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      n = this.pos + 4;
      this.pos = n;
      continue;
      m = 9;
      continue;
      m = 8;
      continue;
      m = 10;
      continue;
      m = 13;
      continue;
      m = 12;
      continue;
      n = this.lineNumber + 1;
      this.lineNumber = n;
      n = this.pos;
      this.lineStart = n;
    }
  }
  
  private void skipQuotedValue(char paramChar)
  {
    char[] arrayOfChar = this.buffer;
    boolean bool;
    do
    {
      char c1 = this.pos;
      int i = this.limit;
      char c2 = c1;
      if (c2 < i)
      {
        c1 = c2 + '\001';
        c2 = arrayOfChar[c2];
        if (c2 == paramChar)
        {
          this.pos = c1;
          return;
        }
        char c3 = '\\';
        if (c2 == c3)
        {
          this.pos = c1;
          readEscapeCharacter();
          c1 = this.pos;
          i = this.limit;
        }
        for (;;)
        {
          c2 = c1;
          break;
          c3 = '\n';
          if (c2 == c3)
          {
            c2 = this.lineNumber + 1;
            this.lineNumber = c2;
            this.lineStart = c1;
          }
        }
      }
      this.pos = c2;
      bool = fillBuffer(1);
    } while (bool);
    throw syntaxError("Unterminated string");
  }
  
  private boolean skipTo(String paramString)
  {
    boolean bool1 = false;
    int k;
    for (;;)
    {
      int i = this.pos;
      k = paramString.length();
      i += k;
      k = this.limit;
      if (i > k)
      {
        i = paramString.length();
        boolean bool2 = fillBuffer(i);
        if (!bool2) {
          return bool1;
        }
      }
      arrayOfChar1 = this.buffer;
      k = this.pos;
      j = arrayOfChar1[k];
      k = 10;
      if (j != k) {
        break;
      }
      j = this.lineNumber + 1;
      this.lineNumber = j;
      j = this.pos + 1;
      this.lineStart = j;
      j = this.pos + 1;
      this.pos = j;
    }
    int j = 0;
    char[] arrayOfChar1 = null;
    for (;;)
    {
      k = paramString.length();
      if (j >= k) {
        break label171;
      }
      char[] arrayOfChar2 = this.buffer;
      int m = this.pos + j;
      k = arrayOfChar2[m];
      m = paramString.charAt(j);
      if (k != m) {
        break;
      }
      j += 1;
    }
    label171:
    bool1 = true;
    return bool1;
  }
  
  private void skipToEndOfLine()
  {
    int i = this.pos;
    int k = this.limit;
    int j;
    if (i >= k)
    {
      boolean bool = fillBuffer(1);
      if (!bool) {}
    }
    else
    {
      char[] arrayOfChar = this.buffer;
      k = this.pos;
      int m = k + 1;
      this.pos = m;
      j = arrayOfChar[k];
      k = 10;
      if (j != k) {
        break label81;
      }
      j = this.lineNumber + 1;
      this.lineNumber = j;
      j = this.pos;
      this.lineStart = j;
    }
    for (;;)
    {
      return;
      label81:
      k = 13;
      if (j != k) {
        break;
      }
    }
  }
  
  private void skipUnquotedValue()
  {
    int i = 0;
    for (;;)
    {
      j = this.pos + i;
      int k = this.limit;
      if (j >= k) {
        break;
      }
      char[] arrayOfChar = this.buffer;
      k = this.pos + i;
      j = arrayOfChar[k];
      switch (j)
      {
      default: 
        i += 1;
      }
    }
    checkLenient();
    int j = this.pos;
    i += j;
    this.pos = i;
    for (;;)
    {
      return;
      j = this.pos;
      i += j;
      this.pos = i;
      boolean bool = fillBuffer(1);
      if (bool) {
        break;
      }
    }
  }
  
  private IOException syntaxError(String paramString)
  {
    MalformedJsonException localMalformedJsonException = new com/google/gson/stream/MalformedJsonException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString).append(" at line ");
    int i = getLineNumber();
    localObject = ((StringBuilder)localObject).append(i).append(" column ");
    i = getColumnNumber();
    localObject = ((StringBuilder)localObject).append(i).append(" path ");
    String str = getPath();
    localObject = str;
    localMalformedJsonException.<init>((String)localObject);
    throw localMalformedJsonException;
  }
  
  public void beginArray()
  {
    int i = 0;
    Object localObject1 = null;
    int j = this.peeked;
    if (j == 0) {
      j = doPeek();
    }
    int k = 3;
    if (j == k)
    {
      push(1);
      localObject2 = this.pathIndices;
      k = this.stackSize + -1;
      localObject2[k] = 0;
      this.peeked = 0;
      return;
    }
    Object localObject2 = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Expected BEGIN_ARRAY but was ");
    localObject1 = peek();
    localObject3 = ((StringBuilder)localObject3).append(localObject1).append(" at line ");
    i = getLineNumber();
    localObject3 = ((StringBuilder)localObject3).append(i).append(" column ");
    i = getColumnNumber();
    localObject3 = ((StringBuilder)localObject3).append(i).append(" path ");
    localObject1 = getPath();
    localObject3 = (String)localObject1;
    ((IllegalStateException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  public void beginObject()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 1;
    if (i == j)
    {
      push(3);
      this.peeked = 0;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Expected BEGIN_OBJECT but was ");
    Object localObject2 = peek();
    localObject1 = ((StringBuilder)localObject1).append(localObject2).append(" at line ");
    int k = getLineNumber();
    localObject1 = ((StringBuilder)localObject1).append(k).append(" column ");
    k = getColumnNumber();
    localObject1 = ((StringBuilder)localObject1).append(k).append(" path ");
    localObject2 = getPath();
    localObject1 = (String)localObject2;
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
  
  public void close()
  {
    this.peeked = 0;
    this.stack[0] = 8;
    this.stackSize = 1;
    this.in.close();
  }
  
  int doPeek()
  {
    int i = 7;
    int j = 5;
    int k = 4;
    int i1 = 2;
    int i2 = 1;
    int[] arrayOfInt1 = this.stack;
    int i3 = this.stackSize + -1;
    int i6 = arrayOfInt1[i3];
    Object localObject1;
    int i7;
    if (i6 == i2)
    {
      localObject1 = this.stack;
      i7 = this.stackSize + -1;
      localObject1[i7] = i1;
      label62:
      i3 = nextNonWhitespace(i2);
      switch (i3)
      {
      default: 
        k = this.pos + -1;
        this.pos = k;
        k = peekKeyword();
        if (k == 0) {
          break;
        }
      }
    }
    for (;;)
    {
      return k;
      if (i6 == i1)
      {
        i3 = nextNonWhitespace(i2);
        switch (i3)
        {
        case 44: 
        default: 
          throw syntaxError("Unterminated array");
        case 93: 
          this.peeked = k;
          break;
        case 59: 
          checkLenient();
          break;
        }
      }
      else
      {
        i3 = 3;
        if ((i6 == i3) || (i6 == j))
        {
          int[] arrayOfInt2 = this.stack;
          i3 = this.stackSize + -1;
          arrayOfInt2[i3] = k;
          if (i6 == j)
          {
            k = nextNonWhitespace(i2);
            switch (k)
            {
            default: 
              throw syntaxError("Unterminated object");
            case 125: 
              this.peeked = i1;
              k = i1;
              break;
            case 59: 
              checkLenient();
            }
          }
          else
          {
            k = nextNonWhitespace(i2);
          }
        }
        else
        {
          int m;
          switch (k)
          {
          default: 
            checkLenient();
            i1 = this.pos + -1;
            this.pos = i1;
            k = (char)k;
            boolean bool1 = isLiteral(k);
            if (bool1)
            {
              m = 14;
              this.peeked = m;
            }
            break;
          case 34: 
            m = 13;
            this.peeked = m;
            break;
          case 39: 
            checkLenient();
            m = 12;
            this.peeked = m;
            break;
          case 125: 
            if (i6 != j)
            {
              this.peeked = i1;
              m = i1;
            }
            else
            {
              throw syntaxError("Expected name");
              throw syntaxError("Expected name");
              if (i6 == m)
              {
                localObject1 = this.stack;
                i7 = this.stackSize + -1;
                localObject1[i7] = j;
                i3 = nextNonWhitespace(i2);
                switch (i3)
                {
                case 58: 
                default: 
                  throw syntaxError("Expected ':'");
                }
                checkLenient();
                i3 = this.pos;
                i7 = this.limit;
                if (i3 >= i7)
                {
                  boolean bool3 = fillBuffer(i2);
                  if (!bool3) {
                    break label62;
                  }
                }
                localObject1 = this.buffer;
                int i8 = this.pos;
                i4 = localObject1[i8];
                i8 = 62;
                if (i4 != i8) {
                  break label62;
                }
                i4 = this.pos + 1;
                this.pos = i4;
                break label62;
              }
              int i4 = 6;
              int i9;
              if (i6 == i4)
              {
                boolean bool4 = this.lenient;
                if (bool4) {
                  consumeNonExecutePrefix();
                }
                localObject1 = this.stack;
                i9 = this.stackSize + -1;
                localObject1[i9] = i;
                break label62;
              }
              if (i6 == i)
              {
                localObject1 = null;
                i5 = nextNonWhitespace(false);
                i9 = -1;
                if (i5 == i9)
                {
                  m = 17;
                  this.peeked = m;
                  continue;
                }
                checkLenient();
                i5 = this.pos + -1;
                this.pos = i5;
                break label62;
              }
              int i5 = 8;
              if (i6 != i5) {
                break label62;
              }
              Object localObject2 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject2).<init>("JsonReader is closed");
              throw ((Throwable)localObject2);
              if (i6 == i2)
              {
                this.peeked = m;
              }
              else if ((i6 == i2) || (i6 == i1))
              {
                checkLenient();
                m = this.pos + -1;
                this.pos = m;
                this.peeked = i;
                m = i;
              }
              else
              {
                throw syntaxError("Unexpected value");
                checkLenient();
                m = 8;
                this.peeked = m;
                continue;
                m = 9;
                this.peeked = m;
                continue;
                m = 3;
                this.peeked = m;
                continue;
                this.peeked = i2;
                m = i2;
                continue;
                m = peekNumber();
                if (m == 0)
                {
                  localObject2 = this.buffer;
                  i1 = this.pos;
                  m = localObject2[i1];
                  boolean bool2 = isLiteral(m);
                  if (!bool2) {
                    throw syntaxError("Expected value");
                  }
                  checkLenient();
                  int n = 10;
                  this.peeked = n;
                }
              }
            }
            break;
          }
        }
      }
    }
  }
  
  public void endArray()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 4;
    if (i == j)
    {
      i = this.stackSize + -1;
      this.stackSize = i;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      k = localObject1[j] + 1;
      localObject1[j] = k;
      this.peeked = 0;
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected END_ARRAY but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
    int k = getLineNumber();
    localObject2 = ((StringBuilder)localObject2).append(k).append(" column ");
    k = getColumnNumber();
    localObject2 = ((StringBuilder)localObject2).append(k).append(" path ");
    localObject3 = getPath();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void endObject()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 2;
    if (i == j)
    {
      i = this.stackSize + -1;
      this.stackSize = i;
      localObject1 = this.pathNames;
      j = this.stackSize;
      localObject1[j] = null;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      k = localObject1[j] + 1;
      localObject1[j] = k;
      this.peeked = 0;
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected END_OBJECT but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
    int k = getLineNumber();
    localObject2 = ((StringBuilder)localObject2).append(k).append(" column ");
    k = getColumnNumber();
    localObject2 = ((StringBuilder)localObject2).append(k).append(" path ");
    localObject3 = getPath();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  int getColumnNumber()
  {
    int i = this.pos;
    int j = this.lineStart;
    return i - j + 1;
  }
  
  int getLineNumber()
  {
    return this.lineNumber + 1;
  }
  
  public String getPath()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    char c1 = '$';
    StringBuilder localStringBuilder2 = localStringBuilder1.append(c1);
    int i = 0;
    localStringBuilder1 = null;
    int j = this.stackSize;
    if (i < j)
    {
      Object localObject = this.stack;
      int k = localObject[i];
      switch (k)
      {
      }
      for (;;)
      {
        i += 1;
        break;
        k = 91;
        localObject = localStringBuilder2.append(k);
        int[] arrayOfInt = this.pathIndices;
        int m = arrayOfInt[i];
        localObject = ((StringBuilder)localObject).append(m);
        m = 93;
        ((StringBuilder)localObject).append(m);
        continue;
        char c2 = '.';
        localStringBuilder2.append(c2);
        localObject = this.pathNames[i];
        if (localObject != null)
        {
          localObject = this.pathNames[i];
          localStringBuilder2.append((String)localObject);
        }
      }
    }
    return localStringBuilder2.toString();
  }
  
  public boolean hasNext()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int k = 2;
    if (i != k)
    {
      int m = 4;
      if (i == m) {}
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final boolean isLenient()
  {
    return this.lenient;
  }
  
  public boolean nextBoolean()
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 5;
    if (i == j)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      i = this.stackSize + -1;
      j = localObject1[i] + 1;
      localObject1[i] = j;
      bool = true;
    }
    for (;;)
    {
      return bool;
      j = 6;
      if (i != j) {
        break;
      }
      this.peeked = 0;
      localObject2 = this.pathIndices;
      j = this.stackSize + -1;
      int k = localObject2[j] + 1;
      localObject2[j] = k;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected a boolean but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
    j = getLineNumber();
    localObject2 = ((StringBuilder)localObject2).append(j).append(" column ");
    j = getColumnNumber();
    localObject2 = ((StringBuilder)localObject2).append(j).append(" path ");
    localObject3 = getPath();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public double nextDouble()
  {
    char c1 = '\013';
    int i = 8;
    int m = 0;
    int n = this.peeked;
    if (n == 0) {
      n = doPeek();
    }
    int i1 = 15;
    Object localObject1;
    int i2;
    double d;
    if (n == i1)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      i2 = this.stackSize + -1;
      i = localObject1[i2] + 1;
      localObject1[i2] = i;
      long l = this.peekedLong;
      d = l;
    }
    for (;;)
    {
      return d;
      i2 = 16;
      if (n == i2)
      {
        localObject1 = new java/lang/String;
        localObject2 = this.buffer;
        i = this.pos;
        i5 = this.peekedNumberLength;
        ((String)localObject1).<init>((char[])localObject2, i, i5);
        this.peekedString = ((String)localObject1);
        n = this.pos;
        int i3 = this.peekedNumberLength;
        n += i3;
        this.pos = n;
      }
      char c2;
      do
      {
        for (;;)
        {
          this.peeked = c1;
          localObject1 = this.peekedString;
          d = Double.parseDouble((String)localObject1);
          int j = this.lenient;
          if (j != 0) {
            break label503;
          }
          j = Double.isNaN(d);
          if (j == 0)
          {
            j = Double.isInfinite(d);
            if (j == 0) {
              break label503;
            }
          }
          localObject3 = new com/google/gson/stream/MalformedJsonException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject1 = localStringBuilder.append("JSON forbids NaN and infinities: ").append(d).append(" at line ");
          int i4 = getLineNumber();
          localObject1 = ((StringBuilder)localObject1).append(i4).append(" column ");
          i4 = getColumnNumber();
          localObject1 = ((StringBuilder)localObject1).append(i4).append(" path ");
          localObject2 = getPath();
          localObject1 = (String)localObject2;
          ((MalformedJsonException)localObject3).<init>((String)localObject1);
          throw ((Throwable)localObject3);
          if (n != j)
          {
            i4 = 9;
            if (n != i4) {}
          }
          else
          {
            if (n == j) {}
            for (c2 = '\'';; c2 = '"')
            {
              localObject1 = nextQuotedValue(c2);
              this.peekedString = ((String)localObject1);
              break;
            }
          }
          char c3 = '\n';
          if (c2 != c3) {
            break;
          }
          localObject1 = nextUnquotedValue();
          this.peekedString = ((String)localObject1);
        }
      } while (c2 == c1);
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Expected a double but was ");
      Object localObject3 = peek();
      localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
      int k = getLineNumber();
      localObject2 = ((StringBuilder)localObject2).append(k).append(" column ");
      k = getColumnNumber();
      localObject2 = ((StringBuilder)localObject2).append(k).append(" path ");
      localObject3 = getPath();
      localObject2 = (String)localObject3;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
      label503:
      k = 0;
      this.peekedString = null;
      this.peeked = 0;
      localObject3 = this.pathIndices;
      int i5 = this.stackSize + -1;
      m = localObject3[i5] + 1;
      localObject3[i5] = m;
    }
  }
  
  public int nextInt()
  {
    int i = 8;
    int j = this.peeked;
    if (j == 0) {
      j = doPeek();
    }
    int m = 15;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i4;
    if (j == m)
    {
      long l1 = this.peekedLong;
      j = (int)l1;
      long l2 = this.peekedLong;
      long l3 = j;
      boolean bool1 = l2 < l3;
      if (bool1)
      {
        localObject1 = new java/lang/NumberFormatException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected an int but was ");
        l2 = this.peekedLong;
        localObject2 = ((StringBuilder)localObject2).append(l2).append(" at line ");
        i = getLineNumber();
        localObject2 = ((StringBuilder)localObject2).append(i).append(" column ");
        i = getColumnNumber();
        localObject2 = ((StringBuilder)localObject2).append(i).append(" path ");
        localObject3 = getPath();
        localObject2 = (String)localObject3;
        ((NumberFormatException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      this.peeked = 0;
      localObject2 = this.pathIndices;
      i = this.stackSize + -1;
      i4 = localObject2[i] + 1;
      localObject2[i] = i4;
    }
    for (;;)
    {
      return j;
      int n = 16;
      if (j == n)
      {
        localObject1 = new java/lang/String;
        localObject2 = this.buffer;
        i = this.pos;
        i4 = this.peekedNumberLength;
        ((String)localObject1).<init>((char[])localObject2, i, i4);
        this.peekedString = ((String)localObject1);
        j = this.pos;
        int i1 = this.peekedNumberLength;
        j += i1;
        this.pos = j;
        label265:
        this.peeked = 11;
        localObject1 = this.peekedString;
        double d1 = Double.parseDouble((String)localObject1);
        j = (int)d1;
        double d2 = j;
        boolean bool2 = d2 < d1;
        if (bool2)
        {
          localObject1 = new java/lang/NumberFormatException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Expected an int but was ");
          localObject3 = this.peekedString;
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(" at line ");
          i = getLineNumber();
          localObject2 = ((StringBuilder)localObject2).append(i).append(" column ");
          i = getColumnNumber();
          localObject2 = ((StringBuilder)localObject2).append(i).append(" path ");
          localObject3 = getPath();
          localObject2 = (String)localObject3;
          ((NumberFormatException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        if (j != i)
        {
          int i2 = 9;
          if (j != i2) {}
        }
        else
        {
          if (j == i) {}
          int k;
          for (j = 39;; k = 34)
          {
            localObject1 = nextQuotedValue(j);
            this.peekedString = ((String)localObject1);
            try
            {
              localObject1 = this.peekedString;
              k = Integer.parseInt((String)localObject1);
              i3 = 0;
              localObject2 = null;
              this.peeked = 0;
              localObject2 = this.pathIndices;
              i = this.stackSize + -1;
              i4 = localObject2[i] + 1;
              localObject2[i] = i4;
            }
            catch (NumberFormatException localNumberFormatException) {}
            break label265;
          }
        }
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected an int but was ");
        localObject3 = peek();
        localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
        i = getLineNumber();
        localObject2 = ((StringBuilder)localObject2).append(i).append(" column ");
        i = getColumnNumber();
        localObject2 = ((StringBuilder)localObject2).append(i).append(" path ");
        localObject3 = getPath();
        localObject2 = (String)localObject3;
        localIllegalStateException.<init>((String)localObject2);
        throw localIllegalStateException;
      }
      int i3 = 0;
      this.peekedString = null;
      this.peeked = 0;
      localObject2 = this.pathIndices;
      i = this.stackSize + -1;
      i4 = localObject2[i] + 1;
      localObject2[i] = i4;
    }
  }
  
  public long nextLong()
  {
    int i = 8;
    int k = this.peeked;
    if (k == 0) {
      k = doPeek();
    }
    int n = 15;
    Object localObject1;
    int i1;
    long l;
    if (k == n)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      i1 = this.stackSize + -1;
      i = localObject1[i1] + 1;
      localObject1[i1] = i;
      l = this.peekedLong;
    }
    for (;;)
    {
      return l;
      i1 = 16;
      Object localObject2;
      if (k == i1)
      {
        localObject1 = new java/lang/String;
        localObject2 = this.buffer;
        i = this.pos;
        i4 = this.peekedNumberLength;
        ((String)localObject1).<init>((char[])localObject2, i, i4);
        this.peekedString = ((String)localObject1);
        k = this.pos;
        int i2 = this.peekedNumberLength;
        k += i2;
        this.pos = k;
        label129:
        k = 11;
        this.peeked = k;
        localObject1 = this.peekedString;
        double d1 = Double.parseDouble((String)localObject1);
        l = d1;
        double d2 = l;
        boolean bool = d2 < d1;
        if (bool)
        {
          localObject1 = new java/lang/NumberFormatException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Expected a long but was ");
          localObject3 = this.peekedString;
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(" at line ");
          j = getLineNumber();
          localObject2 = ((StringBuilder)localObject2).append(j).append(" column ");
          j = getColumnNumber();
          localObject2 = ((StringBuilder)localObject2).append(j).append(" path ");
          localObject3 = getPath();
          localObject2 = (String)localObject3;
          ((NumberFormatException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        if (k != j)
        {
          int i3 = 9;
          if (k != i3) {}
        }
        else
        {
          if (k == j) {}
          int m;
          for (k = 39;; m = 34)
          {
            localObject1 = nextQuotedValue(k);
            this.peekedString = ((String)localObject1);
            try
            {
              localObject1 = this.peekedString;
              l = Long.parseLong((String)localObject1);
              j = 0;
              localObject3 = null;
              this.peeked = 0;
              localObject3 = this.pathIndices;
              i4 = this.stackSize + -1;
              i5 = localObject3[i4] + 1;
              localObject3[i4] = i5;
            }
            catch (NumberFormatException localNumberFormatException) {}
            break label129;
          }
        }
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Expected a long but was ");
        localObject3 = peek();
        localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
        j = getLineNumber();
        localObject2 = ((StringBuilder)localObject2).append(j).append(" column ");
        j = getColumnNumber();
        localObject2 = ((StringBuilder)localObject2).append(j).append(" path ");
        localObject3 = getPath();
        localObject2 = (String)localObject3;
        localIllegalStateException.<init>((String)localObject2);
        throw localIllegalStateException;
      }
      int j = 0;
      this.peekedString = null;
      this.peeked = 0;
      Object localObject3 = this.pathIndices;
      int i4 = this.stackSize + -1;
      int i5 = localObject3[i4] + 1;
      localObject3[i4] = i5;
    }
  }
  
  public String nextName()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 14;
    if (i == j) {
      localObject1 = nextUnquotedValue();
    }
    for (;;)
    {
      this.peeked = 0;
      localObject2 = this.pathNames;
      n = this.stackSize + -1;
      localObject2[n] = localObject1;
      return (String)localObject1;
      int k = 12;
      if (i == k)
      {
        i = 39;
        localObject1 = nextQuotedValue(i);
      }
      else
      {
        int m = 13;
        if (i != m) {
          break;
        }
        char c = '"';
        localObject1 = nextQuotedValue(c);
      }
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected a name but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
    int n = getLineNumber();
    localObject2 = ((StringBuilder)localObject2).append(n).append(" column ");
    n = getColumnNumber();
    localObject2 = ((StringBuilder)localObject2).append(n).append(" path ");
    localObject3 = getPath();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void nextNull()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 7;
    if (i == j)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      k = localObject1[j] + 1;
      localObject1[j] = k;
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected null but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
    int k = getLineNumber();
    localObject2 = ((StringBuilder)localObject2).append(k).append(" column ");
    k = getColumnNumber();
    localObject2 = ((StringBuilder)localObject2).append(k).append(" path ");
    localObject3 = getPath();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public String nextString()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 10;
    if (i == j) {
      localObject1 = nextUnquotedValue();
    }
    for (;;)
    {
      this.peeked = 0;
      localObject2 = this.pathIndices;
      i1 = this.stackSize + -1;
      int i2 = localObject2[i1] + 1;
      localObject2[i1] = i2;
      return (String)localObject1;
      int k = 8;
      if (i == k)
      {
        i = 39;
        localObject1 = nextQuotedValue(i);
      }
      else
      {
        int m = 9;
        char c1;
        if (i == m)
        {
          c1 = '"';
          localObject1 = nextQuotedValue(c1);
        }
        else
        {
          char c2 = '\013';
          if (c1 == c2)
          {
            localObject1 = this.peekedString;
            c2 = '\000';
            localObject2 = null;
            this.peekedString = null;
          }
          else
          {
            c2 = '\017';
            if (c1 == c2)
            {
              long l = this.peekedLong;
              localObject1 = Long.toString(l);
            }
            else
            {
              c2 = '\020';
              if (c1 != c2) {
                break;
              }
              localObject1 = new java/lang/String;
              localObject2 = this.buffer;
              i1 = this.pos;
              i2 = this.peekedNumberLength;
              ((String)localObject1).<init>((char[])localObject2, i1, i2);
              int n = this.pos;
              i1 = this.peekedNumberLength;
              n += i1;
              this.pos = n;
            }
          }
        }
      }
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Expected a string but was ");
    Object localObject3 = peek();
    localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" at line ");
    int i1 = getLineNumber();
    localObject2 = ((StringBuilder)localObject2).append(i1).append(" column ");
    i1 = getColumnNumber();
    localObject2 = ((StringBuilder)localObject2).append(i1).append(" path ");
    localObject3 = getPath();
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonToken peek()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    Object localObject;
    switch (i)
    {
    default: 
      localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>();
      throw ((Throwable)localObject);
    case 1: 
      localObject = JsonToken.BEGIN_OBJECT;
    }
    for (;;)
    {
      return (JsonToken)localObject;
      localObject = JsonToken.END_OBJECT;
      continue;
      localObject = JsonToken.BEGIN_ARRAY;
      continue;
      localObject = JsonToken.END_ARRAY;
      continue;
      localObject = JsonToken.NAME;
      continue;
      localObject = JsonToken.BOOLEAN;
      continue;
      localObject = JsonToken.NULL;
      continue;
      localObject = JsonToken.STRING;
      continue;
      localObject = JsonToken.NUMBER;
      continue;
      localObject = JsonToken.END_DOCUMENT;
    }
  }
  
  public final void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }
  
  public void skipValue()
  {
    int i = 3;
    int j = 1;
    int k = 0;
    int m = 0;
    Object localObject = null;
    int n = this.peeked;
    if (n == 0) {
      n = doPeek();
    }
    if (n == i)
    {
      push(j);
      m += 1;
    }
    for (;;)
    {
      this.peeked = 0;
      if (m != 0) {
        break;
      }
      localObject = this.pathIndices;
      k = this.stackSize + -1;
      n = localObject[k] + 1;
      localObject[k] = n;
      localObject = this.pathNames;
      k = this.stackSize + -1;
      localObject[k] = "null";
      return;
      if (n == j)
      {
        push(i);
        m += 1;
      }
      else
      {
        int i2 = 4;
        if (n == i2)
        {
          n = this.stackSize + -1;
          this.stackSize = n;
          m += -1;
        }
        else
        {
          int i3 = 2;
          if (n == i3)
          {
            n = this.stackSize + -1;
            this.stackSize = n;
            m += -1;
          }
          else
          {
            int i4 = 14;
            if (n != i4)
            {
              int i5 = 10;
              if (n != i5) {}
            }
            else
            {
              skipUnquotedValue();
              continue;
            }
            int i6 = 8;
            if (n != i6)
            {
              int i7 = 12;
              if (n != i7) {}
            }
            else
            {
              n = 39;
              skipQuotedValue(n);
              continue;
            }
            int i8 = 9;
            char c1;
            if (n != i8)
            {
              int i9 = 13;
              if (n != i9) {}
            }
            else
            {
              c1 = '"';
              skipQuotedValue(c1);
              continue;
            }
            char c2 = '\020';
            if (c1 == c2)
            {
              int i1 = this.pos;
              int i10 = this.peekedNumberLength;
              i1 += i10;
              this.pos = i1;
            }
          }
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = getClass().getSimpleName();
    localStringBuilder = localStringBuilder.append(str).append(" at line ");
    int i = getLineNumber();
    localStringBuilder = localStringBuilder.append(i).append(" column ");
    i = getColumnNumber();
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\stream\JsonReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */