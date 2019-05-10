package a.a;

import java.util.ArrayList;

public class a
{
  private ArrayList children;
  private a parent = null;
  private Object userObject = null;
  
  protected a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.children = localArrayList;
  }
  
  public void add(a parama)
  {
    parama.parent = this;
    this.children.add(parama);
  }
  
  public a getParent()
  {
    return this.parent;
  }
  
  protected Object getUserObject()
  {
    return this.userObject;
  }
  
  protected void setUserObject(Object paramObject)
  {
    this.userObject = paramObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\a\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */