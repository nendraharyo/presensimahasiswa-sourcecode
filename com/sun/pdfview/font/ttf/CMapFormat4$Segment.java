package com.sun.pdfview.font.ttf;

class CMapFormat4$Segment
  implements Comparable
{
  int endCode;
  boolean hasMap;
  int startCode;
  
  public CMapFormat4$Segment(CMapFormat4 paramCMapFormat4, short paramShort1, short paramShort2, boolean paramBoolean)
  {
    int i = s & paramShort2;
    this.endCode = i;
    i = s & paramShort1;
    this.startCode = i;
    this.hasMap = paramBoolean;
  }
  
  public int compareTo(Object paramObject)
  {
    int i = -1;
    boolean bool = paramObject instanceof Segment;
    if (!bool) {}
    for (;;)
    {
      return i;
      paramObject = (Segment)paramObject;
      int j = ((Segment)paramObject).endCode;
      int k = this.startCode;
      if (j >= k)
      {
        j = ((Segment)paramObject).endCode;
        k = this.endCode;
        if (j <= k) {}
      }
      else
      {
        j = ((Segment)paramObject).startCode;
        k = this.startCode;
        if (j < k) {
          break label91;
        }
        j = ((Segment)paramObject).startCode;
        k = this.endCode;
        if (j > k) {
          break label91;
        }
      }
      i = 0;
      continue;
      label91:
      j = this.endCode;
      k = ((Segment)paramObject).endCode;
      if (j > k)
      {
        i = 1;
      }
      else
      {
        j = this.endCode;
        k = ((Segment)paramObject).endCode;
        if (j >= k) {
          i = 0;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\CMapFormat4$Segment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */