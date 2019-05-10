package com.sun.pdfview;

import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public class HexDump
{
  public static void main(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    int j = 1;
    Object localObject1;
    Object localObject2;
    if (i != j)
    {
      System.out.println("Usage: ");
      localObject1 = System.out;
      localObject2 = "    HexDump <filename>";
      ((PrintStream)localObject1).println((String)localObject2);
      i = -1;
      System.exit(i);
    }
    try
    {
      localObject1 = new java/io/RandomAccessFile;
      j = 0;
      localObject2 = null;
      localObject2 = paramArrayOfString[0];
      String str = "r";
      ((RandomAccessFile)localObject1).<init>((String)localObject2, str);
      long l = ((RandomAccessFile)localObject1).length();
      j = (int)l;
      localObject2 = new byte[j];
      ((RandomAccessFile)localObject1).readFully((byte[])localObject2);
      printData((byte[])localObject2);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public static void printData(byte[] paramArrayOfByte)
  {
    int i = 32;
    char[] arrayOfChar = new char[17];
    int j = 0;
    int k = 0;
    PrintStream localPrintStream = null;
    int m = paramArrayOfByte.length;
    if (j >= m)
    {
      System.out.println();
      return;
    }
    m = paramArrayOfByte[j];
    int n = m & 0xFF;
    int i1;
    label71:
    Object localObject1;
    label109:
    Object localObject3;
    String str1;
    if (n == 0)
    {
      m = k + 1;
      i1 = 46;
      arrayOfChar[k] = i1;
      k = m;
      m = j % 16;
      if (m == 0)
      {
        localObject1 = Integer.toHexString(paramArrayOfByte.length);
        m = ((String)localObject1).length();
        localObject2 = Integer.toHexString(j);
        i1 = ((String)localObject2).length();
        if (m > i1) {
          break label376;
        }
        localObject1 = System.out;
        localObject2 = new java/lang/StringBuilder;
        localObject3 = String.valueOf(Integer.toHexString(j));
        ((StringBuilder)localObject2).<init>((String)localObject3);
        localObject3 = ": ";
        localObject2 = (String)localObject3;
        ((PrintStream)localObject1).print((String)localObject2);
      }
      m = 16;
      if (n >= m) {
        break label401;
      }
      localObject1 = System.out;
      Object localObject2 = new java/lang/StringBuilder;
      localObject3 = "0";
      ((StringBuilder)localObject2).<init>((String)localObject3);
      str1 = Integer.toHexString(n);
      str1 = str1;
      ((PrintStream)localObject1).print(str1);
      label223:
      m = j & 0xF;
      n = 15;
      if (m != n)
      {
        m = paramArrayOfByte.length + -1;
        if (j != m) {
          break label423;
        }
      }
      localPrintStream = System.out;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("      ");
      str1 = new java/lang/String;
      str1.<init>(arrayOfChar);
      localObject1 = str1;
      localPrintStream.println((String)localObject1);
      k = 0;
      localPrintStream = null;
    }
    for (;;)
    {
      j += 1;
      break;
      if (n >= i)
      {
        m = 127;
        if (n < m) {}
      }
      else
      {
        m = k + 1;
        i1 = 63;
        arrayOfChar[k] = i1;
        k = m;
        break label71;
      }
      m = k + 1;
      i1 = (char)n;
      arrayOfChar[k] = i1;
      k = m;
      break label71;
      label376:
      localObject3 = System.out;
      String str2 = "0";
      ((PrintStream)localObject3).print(str2);
      m += -1;
      break label109;
      label401:
      localObject1 = System.out;
      str1 = Integer.toHexString(n);
      ((PrintStream)localObject1).print(str1);
      break label223;
      label423:
      m = j & 0x7;
      n = 7;
      if (m == n)
      {
        localObject1 = System.out;
        str1 = "  ";
        ((PrintStream)localObject1).print(str1);
        m = k + 1;
        arrayOfChar[k] = i;
        k = m;
      }
      else
      {
        m = j & 0x1;
        n = 1;
        if (m == n)
        {
          localObject1 = System.out;
          str1 = " ";
          ((PrintStream)localObject1).print(str1);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\HexDump.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */