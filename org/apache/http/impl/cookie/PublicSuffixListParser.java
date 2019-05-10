package org.apache.http.impl.cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

public class PublicSuffixListParser
{
  private static final int MAX_LINE_LEN = 256;
  private final PublicSuffixFilter filter;
  
  PublicSuffixListParser(PublicSuffixFilter paramPublicSuffixFilter)
  {
    this.filter = paramPublicSuffixFilter;
  }
  
  private boolean readLine(Reader paramReader, StringBuilder paramStringBuilder)
  {
    boolean bool1 = true;
    int i = -1;
    boolean bool2 = false;
    paramStringBuilder.setLength(0);
    int j = 0;
    IOException localIOException = null;
    int n;
    int m;
    do
    {
      int k = paramReader.read();
      if (k != i)
      {
        n = (char)k;
        int i1 = 10;
        if (n != i1) {}
      }
      else
      {
        if (k != i) {
          bool2 = bool1;
        }
        return bool2;
      }
      boolean bool3 = Character.isWhitespace(n);
      if (bool3) {
        j = bool1;
      }
      if (j == 0) {
        paramStringBuilder.append(n);
      }
      m = paramStringBuilder.length();
      n = 256;
    } while (m <= n);
    localIOException = new java/io/IOException;
    localIOException.<init>("Line too long");
    throw localIOException;
  }
  
  public void parse(Reader paramReader)
  {
    int i = 1;
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    BufferedReader localBufferedReader = new java/io/BufferedReader;
    localBufferedReader.<init>(paramReader);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(256);
    int j = i;
    while (j != 0)
    {
      int k = readLine(localBufferedReader, localStringBuilder);
      String str1 = localStringBuilder.toString();
      int m = str1.length();
      if (m == 0)
      {
        j = k;
      }
      else
      {
        String str2 = "//";
        boolean bool = str1.startsWith(str2);
        if (bool)
        {
          j = k;
        }
        else
        {
          str2 = ".";
          bool = str1.startsWith(str2);
          if (bool) {
            str1 = str1.substring(i);
          }
          str2 = "!";
          bool = str1.startsWith(str2);
          if (bool) {
            str1 = str1.substring(i);
          }
          if (bool) {
            localArrayList2.add(str1);
          }
          for (;;)
          {
            j = k;
            break;
            localArrayList1.add(str1);
          }
        }
      }
    }
    this.filter.setPublicSuffixes(localArrayList1);
    this.filter.setExceptions(localArrayList2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\PublicSuffixListParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */