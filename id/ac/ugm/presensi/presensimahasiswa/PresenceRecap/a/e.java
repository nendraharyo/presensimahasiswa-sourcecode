package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.content.Context;

public class e
{
  public static final i a(Context paramContext, d paramd, g paramg)
  {
    a(paramd, paramg);
    o localo = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/o;
    localo.<init>(paramd, paramg);
    i locali = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/i;
    locali.<init>(paramContext, localo);
    return locali;
  }
  
  private static void a(d paramd, g paramg)
  {
    if ((paramd != null) && (paramg != null))
    {
      int i = paramd.a();
      int j = paramg.c();
      if (i == j) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Dataset and renderer should be not null and the dataset number of items should be equal to the number of series renderers");
      throw localIllegalArgumentException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */