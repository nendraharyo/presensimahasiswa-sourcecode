package com.google.gson.internal;

import java.io.Writer;

final class Streams$AppendableWriter
  extends Writer
{
  private final Appendable appendable;
  private final Streams.AppendableWriter.CurrentWrite currentWrite;
  
  Streams$AppendableWriter(Appendable paramAppendable)
  {
    Streams.AppendableWriter.CurrentWrite localCurrentWrite = new com/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
    localCurrentWrite.<init>();
    this.currentWrite = localCurrentWrite;
    this.appendable = paramAppendable;
  }
  
  public void close() {}
  
  public void flush() {}
  
  public void write(int paramInt)
  {
    Appendable localAppendable = this.appendable;
    char c = (char)paramInt;
    localAppendable.append(c);
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.currentWrite.chars = paramArrayOfChar;
    Appendable localAppendable = this.appendable;
    Streams.AppendableWriter.CurrentWrite localCurrentWrite = this.currentWrite;
    int i = paramInt1 + paramInt2;
    localAppendable.append(localCurrentWrite, paramInt1, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\Streams$AppendableWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */