package com.sun.pdfview;

public class NameTree
{
  private PDFObject root;
  
  public NameTree(PDFObject paramPDFObject)
  {
    this.root = paramPDFObject;
  }
  
  private PDFObject find(PDFObject paramPDFObject, String paramString)
  {
    Object localObject1 = paramPDFObject.getDictRef("Names");
    if (localObject1 != null)
    {
      localObject1 = ((PDFObject)localObject1).getArray();
      localObject1 = findInArray((PDFObject[])localObject1, paramString);
      return (PDFObject)localObject1;
    }
    localObject1 = paramPDFObject.getDictRef("Kids");
    PDFObject[] arrayOfPDFObject;
    int i;
    if (localObject1 != null)
    {
      arrayOfPDFObject = ((PDFObject)localObject1).getArray();
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      int j = arrayOfPDFObject.length;
      if (i >= j)
      {
        i = 0;
        localObject1 = null;
        break;
      }
      Object localObject2 = arrayOfPDFObject[i];
      String str = "Limits";
      localObject2 = ((PDFObject)localObject2).getDictRef(str);
      if (localObject2 != null)
      {
        str = ((PDFObject)localObject2).getAt(0).getStringValue();
        int k = 1;
        localObject2 = ((PDFObject)localObject2).getAt(k).getStringValue();
        int m = paramString.compareTo(str);
        if (m >= 0)
        {
          j = paramString.compareTo((String)localObject2);
          if (j <= 0)
          {
            localObject1 = arrayOfPDFObject[i];
            localObject1 = find((PDFObject)localObject1, paramString);
            break;
          }
        }
      }
      i += 1;
    }
  }
  
  private PDFObject findInArray(PDFObject[] paramArrayOfPDFObject, String paramString)
  {
    int i = 0;
    int j = paramArrayOfPDFObject.length / 2;
    for (;;)
    {
      int k;
      if ((j >= i) && (i >= 0))
      {
        k = paramArrayOfPDFObject.length;
        if (j < k) {}
      }
      else
      {
        j = 0;
      }
      int m;
      for (PDFObject localPDFObject = null;; localPDFObject = paramArrayOfPDFObject[j])
      {
        return localPDFObject;
        k = (j - i) / 2 + i;
        m = k * 2;
        String str = paramArrayOfPDFObject[m].getStringValue();
        m = paramString.compareTo(str);
        if (m != 0) {
          break;
        }
        j = k * 2 + 1;
      }
      if (m > 0) {
        i = k + 1;
      } else if (m < 0) {
        j = k + -1;
      }
    }
  }
  
  public PDFObject find(String paramString)
  {
    PDFObject localPDFObject = this.root;
    return find(localPDFObject, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\NameTree.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */