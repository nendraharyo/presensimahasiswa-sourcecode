package com.github.barteksc.pdfviewer;

import com.github.barteksc.pdfviewer.model.PagePart;
import java.util.Comparator;

class CacheManager$PagePartComparator
  implements Comparator
{
  CacheManager$PagePartComparator(CacheManager paramCacheManager) {}
  
  public int compare(PagePart paramPagePart1, PagePart paramPagePart2)
  {
    int i = paramPagePart1.getCacheOrder();
    int j = paramPagePart2.getCacheOrder();
    if (i == j) {
      i = 0;
    }
    for (;;)
    {
      return i;
      i = paramPagePart1.getCacheOrder();
      j = paramPagePart2.getCacheOrder();
      if (i > j) {
        i = 1;
      } else {
        i = -1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\CacheManager$PagePartComparator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */