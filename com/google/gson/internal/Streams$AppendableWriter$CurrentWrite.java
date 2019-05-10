package com.google.gson.internal;

class Streams$AppendableWriter$CurrentWrite
  implements CharSequence
{
  char[] chars;
  
  public char charAt(int paramInt)
  {
    return this.chars[paramInt];
  }
  
  public int length()
  {
    return this.chars.length;
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.chars;
    int i = paramInt2 - paramInt1;
    str.<init>(arrayOfChar, paramInt1, i);
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\Streams$AppendableWriter$CurrentWrite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */