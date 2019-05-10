package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class d
  implements Serializable
{
  private String a;
  private List b;
  private List c;
  
  public d(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.b = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.c = localArrayList;
    this.a = paramString;
  }
  
  public double a(int paramInt)
  {
    try
    {
      Object localObject1 = this.c;
      localObject1 = ((List)localObject1).get(paramInt);
      localObject1 = (Double)localObject1;
      double d = ((Double)localObject1).doubleValue();
      return d;
    }
    finally {}
  }
  
  public int a()
  {
    try
    {
      List localList = this.b;
      int i = localList.size();
      return i;
    }
    finally {}
  }
  
  public void a(String paramString, double paramDouble)
  {
    try
    {
      List localList = this.b;
      localList.add(paramString);
      localList = this.c;
      Double localDouble = Double.valueOf(paramDouble);
      localList.add(localDouble);
      return;
    }
    finally {}
  }
  
  public String b(int paramInt)
  {
    try
    {
      Object localObject1 = this.b;
      localObject1 = ((List)localObject1).get(paramInt);
      localObject1 = (String)localObject1;
      return (String)localObject1;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */