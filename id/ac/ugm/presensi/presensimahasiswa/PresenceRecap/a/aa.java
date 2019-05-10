package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.io.Serializable;
import java.util.List;

public class aa
  implements Serializable
{
  private List a;
  
  public int a()
  {
    try
    {
      List localList = this.a;
      int i = localList.size();
      return i;
    }
    finally {}
  }
  
  public ac a(int paramInt)
  {
    try
    {
      Object localObject1 = this.a;
      localObject1 = ((List)localObject1).get(paramInt);
      localObject1 = (ac)localObject1;
      return (ac)localObject1;
    }
    finally {}
  }
  
  public ac[] b()
  {
    try
    {
      Object localObject1 = this.a;
      ac[] arrayOfac = null;
      arrayOfac = new ac[0];
      localObject1 = ((List)localObject1).toArray(arrayOfac);
      localObject1 = (ac[])localObject1;
      return (ac[])localObject1;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */