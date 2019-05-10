package com.bumptech.glide.load.engine;

final class GlideException$IndentedAppendable
  implements Appendable
{
  private static final String EMPTY_SEQUENCE = "";
  private static final String INDENT = "  ";
  private final Appendable appendable;
  private boolean printedNewLine = true;
  
  GlideException$IndentedAppendable(Appendable paramAppendable)
  {
    this.appendable = paramAppendable;
  }
  
  private CharSequence safeSequence(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    }
    return paramCharSequence;
  }
  
  public Appendable append(char paramChar)
  {
    boolean bool1 = false;
    boolean bool2 = this.printedNewLine;
    if (bool2)
    {
      this.printedNewLine = false;
      Appendable localAppendable = this.appendable;
      String str = "  ";
      localAppendable.append(str);
    }
    char c = '\n';
    if (paramChar == c) {
      bool1 = true;
    }
    this.printedNewLine = bool1;
    this.appendable.append(paramChar);
    return this;
  }
  
  public Appendable append(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = safeSequence(paramCharSequence);
    int i = localCharSequence.length();
    return append(localCharSequence, 0, i);
  }
  
  public Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    CharSequence localCharSequence = safeSequence(paramCharSequence);
    boolean bool2 = this.printedNewLine;
    if (bool2)
    {
      this.printedNewLine = false;
      Appendable localAppendable = this.appendable;
      String str = "  ";
      localAppendable.append(str);
    }
    int i = localCharSequence.length();
    if (i > 0)
    {
      i = paramInt2 + -1;
      i = localCharSequence.charAt(i);
      int j = 10;
      if (i == j) {
        bool1 = true;
      }
    }
    this.printedNewLine = bool1;
    this.appendable.append(localCharSequence, paramInt1, paramInt2);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\GlideException$IndentedAppendable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */