package com.sun.pdfview.font.ttf;

class CmapTable$CmapSubtable
  implements Comparable
{
  short platformID;
  short platformSpecificID;
  
  protected CmapTable$CmapSubtable(CmapTable paramCmapTable, short paramShort1, short paramShort2)
  {
    this.platformID = paramShort1;
    this.platformSpecificID = paramShort2;
  }
  
  public int compareTo(Object paramObject)
  {
    int i = 1;
    int j = -1;
    boolean bool = paramObject instanceof CmapSubtable;
    if (!bool) {}
    for (;;)
    {
      return j;
      paramObject = (CmapSubtable)paramObject;
      int k = this.platformID;
      int m = ((CmapSubtable)paramObject).platformID;
      if (k >= m)
      {
        k = this.platformID;
        m = ((CmapSubtable)paramObject).platformID;
        if (k > m)
        {
          j = i;
        }
        else
        {
          k = this.platformSpecificID;
          m = ((CmapSubtable)paramObject).platformSpecificID;
          if (k >= m)
          {
            j = this.platformSpecificID;
            k = ((CmapSubtable)paramObject).platformSpecificID;
            if (j > k) {
              j = i;
            } else {
              j = 0;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\CmapTable$CmapSubtable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */