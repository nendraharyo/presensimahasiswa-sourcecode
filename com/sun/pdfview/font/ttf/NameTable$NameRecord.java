package com.sun.pdfview.font.ttf;

class NameTable$NameRecord
  implements Comparable
{
  short languageID;
  short nameID;
  short platformID;
  short platformSpecificID;
  
  NameTable$NameRecord(NameTable paramNameTable, short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    this.platformID = paramShort1;
    this.platformSpecificID = paramShort2;
    this.languageID = paramShort3;
    this.nameID = paramShort4;
  }
  
  public int compareTo(Object paramObject)
  {
    int i = 1;
    int j = -1;
    boolean bool = paramObject instanceof NameRecord;
    if (!bool) {}
    for (;;)
    {
      return j;
      paramObject = (NameRecord)paramObject;
      int k = this.platformID;
      int m = ((NameRecord)paramObject).platformID;
      if (k > m)
      {
        j = i;
      }
      else
      {
        k = this.platformID;
        m = ((NameRecord)paramObject).platformID;
        if (k >= m)
        {
          k = this.platformSpecificID;
          m = ((NameRecord)paramObject).platformSpecificID;
          if (k > m)
          {
            j = i;
          }
          else
          {
            k = this.platformSpecificID;
            m = ((NameRecord)paramObject).platformSpecificID;
            if (k >= m)
            {
              k = this.languageID;
              m = ((NameRecord)paramObject).languageID;
              if (k > m)
              {
                j = i;
              }
              else
              {
                k = this.languageID;
                m = ((NameRecord)paramObject).languageID;
                if (k >= m)
                {
                  k = this.nameID;
                  m = ((NameRecord)paramObject).nameID;
                  if (k > m)
                  {
                    j = i;
                  }
                  else
                  {
                    i = this.nameID;
                    k = ((NameRecord)paramObject).nameID;
                    if (i >= k) {
                      j = 0;
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
  
  public boolean equals(Object paramObject)
  {
    int i = compareTo(paramObject);
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\NameTable$NameRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */