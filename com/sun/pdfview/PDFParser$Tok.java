package com.sun.pdfview;

class PDFParser$Tok
{
  public static final int ARYB = 9;
  public static final int ARYE = 8;
  public static final int BRCB = 5;
  public static final int BRCE = 4;
  public static final int BRKB = 11;
  public static final int BRKE = 10;
  public static final int CMD = 2;
  public static final int EOF = 255;
  public static final int NAME = 1;
  public static final int NUM = 3;
  public static final int STR = 7;
  public static final int UNK;
  public String name;
  public int type;
  public double value;
  
  public String toString()
  {
    int i = 2;
    int j = this.type;
    int k = 3;
    Object localObject;
    String str;
    if (j == k)
    {
      localObject = new java/lang/StringBuilder;
      str = "NUM: ";
      ((StringBuilder)localObject).<init>(str);
      double d = this.value;
      localObject = d;
    }
    for (;;)
    {
      return (String)localObject;
      j = this.type;
      if (j == i)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("CMD: ");
        str = this.name;
        localObject = str;
      }
      else
      {
        j = this.type;
        if (j == 0)
        {
          localObject = "UNK";
        }
        else
        {
          j = this.type;
          k = -1;
          if (j == k)
          {
            localObject = "EOF";
          }
          else
          {
            j = this.type;
            k = 1;
            if (j == k)
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("NAME: ");
              str = this.name;
              localObject = str;
            }
            else
            {
              j = this.type;
              if (j == i)
              {
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>("CMD: ");
                str = this.name;
                localObject = str;
              }
              else
              {
                j = this.type;
                k = 7;
                if (j == k)
                {
                  localObject = new java/lang/StringBuilder;
                  ((StringBuilder)localObject).<init>("STR: (");
                  str = this.name;
                  localObject = str;
                }
                else
                {
                  j = this.type;
                  k = 9;
                  if (j == k)
                  {
                    localObject = "ARY [";
                  }
                  else
                  {
                    j = this.type;
                    k = 8;
                    if (j == k)
                    {
                      localObject = "ARY ]";
                    }
                    else
                    {
                      localObject = new java/lang/StringBuilder;
                      ((StringBuilder)localObject).<init>("some kind of brace (");
                      k = this.type;
                      localObject = ((StringBuilder)localObject).append(k);
                      str = ")";
                      localObject = str;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFParser$Tok.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */