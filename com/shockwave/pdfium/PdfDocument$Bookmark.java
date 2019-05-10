package com.shockwave.pdfium;

import java.util.ArrayList;
import java.util.List;

public class PdfDocument$Bookmark
{
  private List children;
  long mNativePtr;
  long pageIdx;
  String title;
  
  public PdfDocument$Bookmark()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.children = localArrayList;
  }
  
  public List getChildren()
  {
    return this.children;
  }
  
  public long getPageIdx()
  {
    return this.pageIdx;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public boolean hasChildren()
  {
    List localList = this.children;
    boolean bool = localList.isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\shockwave\pdfium\PdfDocument$Bookmark.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */